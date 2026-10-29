package com.pichincha.stepdefinitions;

import com.pichincha.questions.TituloDeLaPagina;
import com.pichincha.tasks.AbrirPaginaInicio;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

public class PaginaInicioStepDefinitions {

    @Dado("que {string} abre la página de inicio de Banco Pichincha")
    public void abrePaginaInicio(String actor) {
        theActorCalled(actor).attemptsTo(AbrirPaginaInicio.delBanco());
    }

    @Entonces("debería ver que el título de la página contiene {string}")
    public void validaTitulo(String textoEsperado) {
        theActorInTheSpotlight().should(seeThat(TituloDeLaPagina.actual(), containsString(textoEsperado)));
    }
}
