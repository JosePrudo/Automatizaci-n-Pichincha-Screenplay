package com.pichincha.stepdefinitions;

import com.pichincha.tasks.AceptarRespuestaDelEnvio;
import com.pichincha.tasks.AceptarYEnviar;
import com.pichincha.tasks.ConfirmarInformacion;
import io.cucumber.java.es.Cuando;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConfirmacionStepDefinitions {

    @Cuando("confirma que toda la información está correcta y completa")
    public void confirmaInformacion() {
        theActorInTheSpotlight().attemptsTo(ConfirmarInformacion.correctaYCompleta());
    }

    @Cuando("da clic en el botón Aceptar y Enviar")
    public void daClicEnAceptarYEnviar() {
        theActorInTheSpotlight().attemptsTo(AceptarYEnviar.laSimulacion());
    }

    @Cuando("da clic en el botón Aceptar")
    public void daClicEnAceptar() {
        theActorInTheSpotlight().attemptsTo(AceptarRespuestaDelEnvio.delModal());
    }
}
