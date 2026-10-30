package com.pichincha.tasks;

import com.pichincha.interactions.DesplazarHasta;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.pichincha.userinterfaces.ProyectoViviendaPage.BOTON_SIGUIENTE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ContinuarAlSiguientePaso implements Task {

    public static ContinuarAlSiguientePaso delFormulario() {
        return instrumented(ContinuarAlSiguientePaso.class);
    }

    @Override
    @Step("{0} da clic en el botón Siguiente")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                DesplazarHasta.el(BOTON_SIGUIENTE),
                Click.on(BOTON_SIGUIENTE)
        );
    }
}
