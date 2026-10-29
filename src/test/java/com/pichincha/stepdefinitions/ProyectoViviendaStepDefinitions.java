package com.pichincha.stepdefinitions;

import com.pichincha.questions.OpcionTipoAplicacion;
import com.pichincha.tasks.SeleccionarTipoAplicacion;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

public class ProyectoViviendaStepDefinitions {

    @Cuando("selecciona la opción {string} en tipo de aplicación")
    public void seleccionaTipoAplicacion(String opcion) {
        theActorInTheSpotlight().attemptsTo(SeleccionarTipoAplicacion.conOpcion(opcion));
    }

    @Entonces("debería ver la opción {string} seleccionada")
    public void validaOpcionSeleccionada(String opcion) {
        theActorInTheSpotlight().should(seeThat(OpcionTipoAplicacion.estaSeleccionada(opcion), is(true)));
    }
}
