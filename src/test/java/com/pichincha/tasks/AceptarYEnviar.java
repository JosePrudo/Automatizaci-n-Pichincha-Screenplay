package com.pichincha.tasks;

import com.pichincha.interactions.DesplazarHasta;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.pichincha.userinterfaces.ConfirmacionPage.BOTON_ACEPTAR_Y_ENVIAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class AceptarYEnviar implements Task {

    public static AceptarYEnviar laSimulacion() {
        return instrumented(AceptarYEnviar.class);
    }

    @Override
    @Step("{0} da clic en el botón Aceptar y Enviar")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_ACEPTAR_Y_ENVIAR, isEnabled()).forNoMoreThan(10).seconds(),
                DesplazarHasta.el(BOTON_ACEPTAR_Y_ENVIAR),
                Click.on(BOTON_ACEPTAR_Y_ENVIAR)
        );
    }
}
