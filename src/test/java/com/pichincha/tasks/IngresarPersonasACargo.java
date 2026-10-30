package com.pichincha.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static com.pichincha.userinterfaces.CapacidadRealPage.PERSONAS_A_CARGO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarPersonasACargo implements Task {

    private final String cantidad;

    public IngresarPersonasACargo(String cantidad) {
        this.cantidad = cantidad;
    }

    public static IngresarPersonasACargo cantidad(String cantidad) {
        return instrumented(IngresarPersonasACargo.class, cantidad);
    }

    @Override
    @Step("{0} indica que #cantidad persona(s) dependen económicamente de él")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(cantidad).into(PERSONAS_A_CARGO));
    }
}
