package com.pichincha.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.pichincha.userinterfaces.ProyectoViviendaPage.TIPO_VIVIENDA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarTipoVivienda implements Task {

    private final String tipo;

    public SeleccionarTipoVivienda(String tipo) {
        this.tipo = tipo;
    }

    public static SeleccionarTipoVivienda conOpcion(String tipo) {
        return instrumented(SeleccionarTipoVivienda.class, tipo);
    }

    @Override
    @Step("{0} selecciona el tipo de vivienda #tipo")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TIPO_VIVIENDA.of(tipo.toLowerCase())));
    }
}
