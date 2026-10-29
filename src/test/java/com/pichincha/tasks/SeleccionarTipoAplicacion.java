package com.pichincha.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.pichincha.userinterfaces.ProyectoViviendaPage.TIPO_APLICACION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarTipoAplicacion implements Task {

    private final String opcion;

    public SeleccionarTipoAplicacion(String opcion) {
        this.opcion = opcion;
    }

    public static SeleccionarTipoAplicacion conOpcion(String opcion) {
        return instrumented(SeleccionarTipoAplicacion.class, opcion);
    }

    @Override
    @Step("{0} selecciona la opción #opcion en tipo de aplicación")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TIPO_APLICACION.of(opcion.toLowerCase())));
    }
}
