package com.pichincha.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static com.pichincha.userinterfaces.CapacidadRealPage.LUGAR_DE_TRABAJO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarLugarDeTrabajo implements Task {

    private final String empresa;

    public IngresarLugarDeTrabajo(String empresa) {
        this.empresa = empresa;
    }

    public static IngresarLugarDeTrabajo enLaEmpresa(String empresa) {
        return instrumented(IngresarLugarDeTrabajo.class, empresa);
    }

    @Override
    @Step("{0} ingresa la empresa donde trabaja #empresa")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(empresa).into(LUGAR_DE_TRABAJO));
    }
}
