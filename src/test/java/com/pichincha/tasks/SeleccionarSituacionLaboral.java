package com.pichincha.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.pichincha.userinterfaces.SituacionFinancieraPage.SITUACION_LABORAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarSituacionLaboral implements Task {

    private final String situacion;

    public SeleccionarSituacionLaboral(String situacion) {
        this.situacion = situacion;
    }

    public static SeleccionarSituacionLaboral conOpcion(String situacion) {
        return instrumented(SeleccionarSituacionLaboral.class, situacion);
    }

    @Override
    @Step("{0} selecciona la situación laboral #situacion")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SITUACION_LABORAL.of(situacion.toLowerCase())));
    }
}
