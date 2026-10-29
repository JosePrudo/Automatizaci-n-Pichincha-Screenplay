package com.pichincha.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.pichincha.userinterfaces.SituacionFinancieraPage.ESTADO_CIVIL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarEstadoCivil implements Task {

    private final String estadoCivil;

    public SeleccionarEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public static SeleccionarEstadoCivil llamado(String estadoCivil) {
        return instrumented(SeleccionarEstadoCivil.class, estadoCivil);
    }

    @Override
    @Step("{0} selecciona el estado civil #estadoCivil")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SelectFromOptions.byVisibleText(estadoCivil).from(ESTADO_CIVIL));
    }
}
