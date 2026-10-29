package com.pichincha.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.pichincha.userinterfaces.PersonalizaCreditoPage.TIPO_CUOTA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarTipoCuota implements Task {

    private final String tipo;

    public SeleccionarTipoCuota(String tipo) {
        this.tipo = tipo;
    }

    public static SeleccionarTipoCuota conOpcion(String tipo) {
        return instrumented(SeleccionarTipoCuota.class, tipo);
    }

    @Override
    @Step("{0} selecciona el tipo de cuota #tipo")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TIPO_CUOTA.of(tipo.toLowerCase())));
    }
}
