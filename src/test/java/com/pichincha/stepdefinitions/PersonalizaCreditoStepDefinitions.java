package com.pichincha.stepdefinitions;

import com.pichincha.tasks.IngresarMontoPrestamo;
import com.pichincha.tasks.SeleccionarPlazo;
import com.pichincha.tasks.SeleccionarTipoCuota;
import io.cucumber.java.es.Cuando;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PersonalizaCreditoStepDefinitions {

    @Cuando("ingresa un monto de préstamo de {string}")
    public void ingresaMontoPrestamo(String monto) {
        theActorInTheSpotlight().attemptsTo(IngresarMontoPrestamo.de(monto));
    }

    @Cuando("selecciona un plazo de {string}")
    public void seleccionaPlazo(String plazo) {
        theActorInTheSpotlight().attemptsTo(SeleccionarPlazo.de(plazo));
    }

    @Cuando("selecciona el tipo de cuota {string}")
    public void seleccionaTipoCuota(String tipo) {
        theActorInTheSpotlight().attemptsTo(SeleccionarTipoCuota.conOpcion(tipo));
    }
}
