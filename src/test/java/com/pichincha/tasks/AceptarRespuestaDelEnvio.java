package com.pichincha.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.pichincha.userinterfaces.ConfirmacionPage.BOTON_ACEPTAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AceptarRespuestaDelEnvio implements Task {

    public static AceptarRespuestaDelEnvio delModal() {
        return instrumented(AceptarRespuestaDelEnvio.class);
    }

    @Override
    @Step("{0} da clic en el botón Aceptar")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_ACEPTAR, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BOTON_ACEPTAR)
        );
    }
}
