package com.pichincha.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.pichincha.userinterfaces.CapacidadRealPage.AUTORIZAR_CONSULTA_CREDITICIA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AutorizarConsultaCrediticia implements Task {

    public static AutorizarConsultaCrediticia enCentralesDeRiesgo() {
        return instrumented(AutorizarConsultaCrediticia.class);
    }

    @Override
    @Step("{0} autoriza la consulta de su historial crediticio")
    public <T extends Actor> void performAs(T actor) {
        if (!AUTORIZAR_CONSULTA_CREDITICIA.resolveFor(actor).isSelected()) {
            actor.attemptsTo(Click.on(AUTORIZAR_CONSULTA_CREDITICIA));
        }
    }
}
