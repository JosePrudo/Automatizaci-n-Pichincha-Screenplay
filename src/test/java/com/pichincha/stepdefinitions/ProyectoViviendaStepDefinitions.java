package com.pichincha.stepdefinitions;

import com.pichincha.questions.OpcionTipoAplicacion;
import com.pichincha.questions.SeccionDelFormulario;
import com.pichincha.tasks.ContinuarAlSiguientePaso;
import com.pichincha.tasks.DefinirRangoDePrecio;
import com.pichincha.tasks.SeleccionarCiudad;
import com.pichincha.tasks.SeleccionarTipoAplicacion;
import com.pichincha.tasks.SeleccionarTipoVivienda;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.pichincha.userinterfaces.ProyectoViviendaPage.SECCION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
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

    @Cuando("selecciona el tipo de vivienda {string}")
    public void seleccionaTipoVivienda(String tipo) {
        theActorInTheSpotlight().attemptsTo(SeleccionarTipoVivienda.conOpcion(tipo));
    }

    @Cuando("selecciona la ciudad {string}")
    public void seleccionaCiudad(String ciudad) {
        theActorInTheSpotlight().attemptsTo(SeleccionarCiudad.llamada(ciudad));
    }

    @Cuando("define el rango de precio entre {string} y {string}")
    public void defineRangoDePrecio(String minimo, String maximo) {
        theActorInTheSpotlight().attemptsTo(DefinirRangoDePrecio.entre(minimo, maximo));
    }

    @Cuando("da clic en el botón Siguiente")
    public void daClicEnSiguiente() {
        theActorInTheSpotlight().attemptsTo(ContinuarAlSiguientePaso.delFormulario());
    }

    @Entonces("debería ver la sección {string}")
    public void validaSeccion(String nombre) {
        theActorInTheSpotlight().attemptsTo(WaitUntil.the(SECCION.of(nombre), isVisible()).forNoMoreThan(10).seconds());
        theActorInTheSpotlight().should(seeThat(SeccionDelFormulario.estaVisible(nombre), is(true)));
    }
}
