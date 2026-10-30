package com.pichincha.stepdefinitions;

import com.pichincha.tasks.ConocerCapacidadReal;
import io.cucumber.java.es.Cuando;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ResultadosStepDefinitions {

    @Cuando("da clic en el botón ¿Quieres conocer tu capacidad real?")
    public void daClicEnConocerCapacidadReal() {
        theActorInTheSpotlight().attemptsTo(ConocerCapacidadReal.desdeLosResultados());
    }
}
