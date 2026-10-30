package com.pichincha.stepdefinitions;

import com.pichincha.tasks.AutorizarConsultaCrediticia;
import com.pichincha.tasks.IngresarDatosPersonales;
import com.pichincha.tasks.IngresarLugarDeTrabajo;
import com.pichincha.tasks.IngresarPersonasACargo;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CapacidadRealStepDefinitions {

    @Cuando("ingresa sus datos personales")
    public void ingresaDatosPersonales(DataTable datos) {
        Map<String, String> persona = datos.asMaps().get(0);
        theActorInTheSpotlight().attemptsTo(IngresarDatosPersonales.con(
                persona.get("nombre completo"),
                persona.get("cédula"),
                persona.get("correo"),
                persona.get("teléfono celular")));
    }

    @Cuando("autoriza la consulta de su historial crediticio")
    public void autorizaConsultaHistorialCrediticio() {
        theActorInTheSpotlight().attemptsTo(AutorizarConsultaCrediticia.enCentralesDeRiesgo());
    }

    @Cuando("indica que {string} persona(s) depende(n) económicamente de él")
    public void indicaPersonasACargo(String cantidad) {
        theActorInTheSpotlight().attemptsTo(IngresarPersonasACargo.cantidad(cantidad));
    }

    @Cuando("ingresa la empresa {string} donde trabaja")
    public void ingresaEmpresa(String empresa) {
        theActorInTheSpotlight().attemptsTo(IngresarLugarDeTrabajo.enLaEmpresa(empresa));
    }
}
