package com.pichincha.stepdefinitions;

import com.pichincha.tasks.IngresarFechaNacimiento;
import com.pichincha.tasks.IngresarMontos;
import com.pichincha.tasks.SeleccionarEstadoCivil;
import com.pichincha.tasks.SeleccionarSituacionLaboral;
import io.cucumber.java.es.Cuando;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SituacionFinancieraStepDefinitions {

    @Cuando("selecciona la situación laboral {string}")
    public void seleccionaSituacionLaboral(String situacion) {
        theActorInTheSpotlight().attemptsTo(SeleccionarSituacionLaboral.conOpcion(situacion));
    }

    @Cuando("ingresa ingresos netos mensuales de {string} y un ahorro de {string}")
    public void ingresaMontos(String ingresosNetos, String totalAhorrado) {
        theActorInTheSpotlight().attemptsTo(IngresarMontos.conIngresosYAhorro(ingresosNetos, totalAhorrado));
    }

    @Cuando("ingresa la fecha de nacimiento {string}")
    public void ingresaFechaNacimiento(String fecha) {
        theActorInTheSpotlight().attemptsTo(IngresarFechaNacimiento.el(fecha));
    }

    @Cuando("selecciona el estado civil {string}")
    public void seleccionaEstadoCivil(String estadoCivil) {
        theActorInTheSpotlight().attemptsTo(SeleccionarEstadoCivil.llamado(estadoCivil));
    }
}
