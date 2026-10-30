package com.pichincha.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.pichincha.userinterfaces.ContactoPage.MEDIO_CONTACTO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarMedioContacto implements Task {

    private final String medio;

    public SeleccionarMedioContacto(String medio) {
        this.medio = medio;
    }

    public static SeleccionarMedioContacto porMedioDe(String medio) {
        return instrumented(SeleccionarMedioContacto.class, medio);
    }

    @Override
    @Step("{0} selecciona el medio de contacto #medio")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MEDIO_CONTACTO.of(medio.toLowerCase())));
    }
}
