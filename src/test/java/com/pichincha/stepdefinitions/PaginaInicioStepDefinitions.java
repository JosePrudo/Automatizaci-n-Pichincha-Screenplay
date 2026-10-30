package com.pichincha.stepdefinitions;

import com.pichincha.questions.TituloDeLaPagina;
import com.pichincha.tasks.AbrirUrl;
import com.pichincha.tasks.UbicarseEnLaSeccion;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

public class PaginaInicioStepDefinitions {

    @Dado("que {string} abre la URL {string}")
    public void abreUrl(String actor, String url) {
        theActorCalled(actor).attemptsTo(AbrirUrl.especifica(url));
    }

    @Dado("que {string} se encuentra en la sección {string}")
    public void seEncuentraEnLaSeccion(String actor, String seccion) {
        theActorCalled(actor).attemptsTo(UbicarseEnLaSeccion.llamada(seccion));
    }

    @Entonces("debería ver que el título de la página contiene {string}")
    public void validaTitulo(String textoEsperado) {
        theActorInTheSpotlight().should(seeThat(TituloDeLaPagina.actual(), containsString(textoEsperado)));
    }
}
