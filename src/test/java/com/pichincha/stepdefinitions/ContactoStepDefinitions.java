package com.pichincha.stepdefinitions;

import com.pichincha.tasks.AceptarRecibirInformacion;
import com.pichincha.tasks.SeleccionarHorarioContacto;
import com.pichincha.tasks.SeleccionarMedioContacto;
import io.cucumber.java.es.Cuando;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ContactoStepDefinitions {

    @Cuando("selecciona el horario de contacto {string}")
    public void seleccionaHorarioContacto(String horario) {
        theActorInTheSpotlight().attemptsTo(SeleccionarHorarioContacto.enLa(horario));
    }

    @Cuando("selecciona el medio de contacto {string}")
    public void seleccionaMedioContacto(String medio) {
        theActorInTheSpotlight().attemptsTo(SeleccionarMedioContacto.porMedioDe(medio));
    }

    @Cuando("acepta recibir información de otros productos del banco")
    public void aceptaRecibirInformacion() {
        theActorInTheSpotlight().attemptsTo(AceptarRecibirInformacion.deOtrosProductos());
    }
}
