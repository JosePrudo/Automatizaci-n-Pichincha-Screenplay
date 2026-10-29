package com.pichincha.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static com.pichincha.userinterfaces.PersonalizaCreditoPage.MONTO_PRESTAMO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarMontoPrestamo implements Task {

    private final String monto;

    public IngresarMontoPrestamo(String monto) {
        this.monto = monto;
    }

    public static IngresarMontoPrestamo de(String monto) {
        return instrumented(IngresarMontoPrestamo.class, monto);
    }

    @Override
    @Step("{0} ingresa un monto de préstamo de #monto")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(monto).into(MONTO_PRESTAMO));
    }
}
