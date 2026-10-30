package com.pichincha.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.pichincha.userinterfaces.ContactoPage.HORARIO_CONTACTO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarHorarioContacto implements Task {

    private final String horario;

    public SeleccionarHorarioContacto(String horario) {
        this.horario = horario;
    }

    public static SeleccionarHorarioContacto enLa(String horario) {
        return instrumented(SeleccionarHorarioContacto.class, horario);
    }

    @Override
    @Step("{0} selecciona el horario de contacto #horario")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HORARIO_CONTACTO.of(horario.toLowerCase())));
    }
}
