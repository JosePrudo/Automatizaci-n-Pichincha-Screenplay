package com.pichincha.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.pichincha.userinterfaces.ProyectoViviendaPage.CIUDAD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarCiudad implements Task {

    private final String ciudad;

    public SeleccionarCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public static SeleccionarCiudad llamada(String ciudad) {
        return instrumented(SeleccionarCiudad.class, ciudad);
    }

    @Override
    @Step("{0} selecciona la ciudad #ciudad")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SelectFromOptions.byVisibleText(ciudad).from(CIUDAD));
    }
}
