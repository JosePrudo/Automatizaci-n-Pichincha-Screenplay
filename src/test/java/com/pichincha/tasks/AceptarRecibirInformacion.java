package com.pichincha.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.pichincha.userinterfaces.ContactoPage.RECIBIR_INFORMACION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AceptarRecibirInformacion implements Task {

    public static AceptarRecibirInformacion deOtrosProductos() {
        return instrumented(AceptarRecibirInformacion.class);
    }

    @Override
    @Step("{0} acepta recibir información de otros productos del banco")
    public <T extends Actor> void performAs(T actor) {
        if (!RECIBIR_INFORMACION.resolveFor(actor).isSelected()) {
            actor.attemptsTo(Click.on(RECIBIR_INFORMACION));
        }
    }
}
