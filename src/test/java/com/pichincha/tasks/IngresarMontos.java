package com.pichincha.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static com.pichincha.userinterfaces.SituacionFinancieraPage.INGRESOS_NETOS;
import static com.pichincha.userinterfaces.SituacionFinancieraPage.TOTAL_AHORRADO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarMontos implements Task {

    private final String ingresosNetos;
    private final String totalAhorrado;

    public IngresarMontos(String ingresosNetos, String totalAhorrado) {
        this.ingresosNetos = ingresosNetos;
        this.totalAhorrado = totalAhorrado;
    }

    public static IngresarMontos conIngresosYAhorro(String ingresosNetos, String totalAhorrado) {
        return instrumented(IngresarMontos.class, ingresosNetos, totalAhorrado);
    }

    @Override
    @Step("{0} ingresa ingresos netos de #ingresosNetos y un ahorro de #totalAhorrado")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(ingresosNetos).into(INGRESOS_NETOS),
                Enter.theValue(totalAhorrado).into(TOTAL_AHORRADO)
        );
    }
}
