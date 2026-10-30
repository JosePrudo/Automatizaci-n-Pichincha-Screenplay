package com.pichincha.tasks;

import com.pichincha.models.DatosSimulacion;
import com.pichincha.models.SeccionSimulador;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.pichincha.userinterfaces.ProyectoViviendaPage.SECCION;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

/**
 * Deja al actor en la sección indicada. En el flujo completo la sección ya está visible
 * (la dejó el feature anterior) y no hace nada; al ejecutar una sección por separado
 * abre el simulador y recorre las secciones previas.
 */
public class UbicarseEnLaSeccion implements Task {

    private final String seccion;

    public UbicarseEnLaSeccion(String seccion) {
        this.seccion = seccion;
    }

    public static UbicarseEnLaSeccion llamada(String seccion) {
        return instrumented(UbicarseEnLaSeccion.class, seccion);
    }

    @Override
    @Step("{0} se ubica en la sección #seccion")
    public <T extends Actor> void performAs(T actor) {
        SeccionSimulador destino = SeccionSimulador.conTitulo(seccion);
        if (SECCION.of(destino.titulo()).resolveFor(actor).isCurrentlyVisible()) {
            return;
        }
        actor.attemptsTo(AbrirUrl.especifica(DatosSimulacion.URL));
        for (SeccionSimulador previa : SeccionSimulador.values()) {
            if (previa == destino) {
                break;
            }
            actor.attemptsTo(WaitUntil.the(SECCION.of(previa.titulo()), isVisible()).forNoMoreThan(10).seconds());
            actor.attemptsTo(previa.pasosParaCompletar());
        }
        actor.attemptsTo(WaitUntil.the(SECCION.of(destino.titulo()), isVisible()).forNoMoreThan(10).seconds());
    }
}
