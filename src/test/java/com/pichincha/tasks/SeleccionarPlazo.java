package com.pichincha.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.pichincha.userinterfaces.PersonalizaCreditoPage.PLAZO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarPlazo implements Task {

    private final String plazo;

    public SeleccionarPlazo(String plazo) {
        this.plazo = plazo;
    }

    public static SeleccionarPlazo de(String plazo) {
        return instrumented(SeleccionarPlazo.class, plazo);
    }

    @Override
    @Step("{0} selecciona un plazo de #plazo")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SelectFromOptions.byVisibleText(plazo).from(PLAZO));
    }
}
