package com.pichincha.tasks;

import com.pichincha.interactions.FijarValor;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.pichincha.userinterfaces.SituacionFinancieraPage.FECHA_NACIMIENTO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarFechaNacimiento implements Task {

    private static final DateTimeFormatter FORMATO_FEATURE = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private final String fecha;

    public IngresarFechaNacimiento(String fecha) {
        this.fecha = fecha;
    }

    public static IngresarFechaNacimiento el(String fecha) {
        return instrumented(IngresarFechaNacimiento.class, fecha);
    }

    @Override
    @Step("{0} ingresa la fecha de nacimiento #fecha")
    public <T extends Actor> void performAs(T actor) {
        // El input type=date solo acepta el valor en formato ISO (yyyy-MM-dd).
        String fechaIso = LocalDate.parse(fecha, FORMATO_FEATURE).toString();
        actor.attemptsTo(FijarValor.en(FECHA_NACIMIENTO, fechaIso));
    }
}
