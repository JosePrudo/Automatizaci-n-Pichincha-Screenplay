package com.pichincha.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hooks {

    private static final long ESPERA_ENTRE_PRUEBAS_MS = 1500;

    @Before
    public void prepararEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @After
    public void esperarAntesDeLaSiguientePrueba() throws InterruptedException {
        Thread.sleep(ESPERA_ENTRE_PRUEBAS_MS);
    }
}
