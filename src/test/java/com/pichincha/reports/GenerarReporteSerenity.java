package com.pichincha.reports;

import net.thucydides.core.reports.html.HtmlAggregateStoryReporter;
import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestPlan;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Limpia los resultados anteriores al iniciar y genera el reporte HTML de Serenity al terminar.
 * En Maven la generación se desactiva porque el serenity-maven-plugin ya lo hace.
 */
public class GenerarReporteSerenity implements TestExecutionListener {

    private static final String DIRECTORIO_REPORTE = "target/site/serenity";

    @Override
    public void testPlanExecutionStarted(TestPlan testPlan) {
        Path directorio = Path.of(DIRECTORIO_REPORTE);
        if (!Files.exists(directorio)) {
            return;
        }
        try (Stream<Path> rutas = Files.walk(directorio)) {
            rutas.sorted(Comparator.reverseOrder()).forEach(ruta -> ruta.toFile().delete());
        } catch (IOException e) {
            throw new UncheckedIOException("No se pudo limpiar " + DIRECTORIO_REPORTE, e);
        }
    }

    @Override
    public void testPlanExecutionFinished(TestPlan testPlan) {
        if (!Boolean.parseBoolean(System.getProperty("reporte.serenity.automatico", "true"))) {
            return;
        }
        File directorio = new File(DIRECTORIO_REPORTE);
        if (!directorio.exists()) {
            return;
        }
        HtmlAggregateStoryReporter reporter = new HtmlAggregateStoryReporter("automatizacion-pichincha-screenplay");
        reporter.setSourceDirectory(directorio);
        reporter.setOutputDirectory(directorio);
        reporter.setProjectDirectory(System.getProperty("user.dir"));
        // Sin esto no se generan las páginas de detalle de cada prueba (pasos y capturas).
        reporter.setGenerateTestOutcomeReports();
        try {
            reporter.generateReportsForTestResultsFrom(directorio);
        } catch (IOException e) {
            throw new UncheckedIOException("No se pudo generar el reporte de Serenity", e);
        }
        System.out.println("Reporte de Serenity: " + new File(directorio, "index.html").getAbsolutePath());
    }
}
