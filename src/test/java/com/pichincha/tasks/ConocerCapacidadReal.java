package com.pichincha.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.pichincha.userinterfaces.ResultadosPage.BOTON_CONOCER_CAPACIDAD_REAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConocerCapacidadReal implements Task {

    public static ConocerCapacidadReal desdeLosResultados() {
        return instrumented(ConocerCapacidadReal.class);
    }

    @Override
    @Step("{0} da clic en el botón ¿Quieres conocer tu capacidad real?")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_CONOCER_CAPACIDAD_REAL));
    }
}
