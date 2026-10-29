package com.pichincha.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

import static com.pichincha.userinterfaces.ProyectoViviendaPage.PRECIO_MAXIMO;
import static com.pichincha.userinterfaces.ProyectoViviendaPage.PRECIO_MINIMO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DefinirRangoDePrecio implements Task {

    // Los sliders no aceptan texto; se fija el valor y se notifica a Angular con los eventos input/change.
    private static final String FIJAR_VALOR = "arguments[0].value = arguments[1];"
            + "arguments[0].dispatchEvent(new Event('input', {bubbles: true}));"
            + "arguments[0].dispatchEvent(new Event('change', {bubbles: true}));";

    private final String minimo;
    private final String maximo;

    public DefinirRangoDePrecio(String minimo, String maximo) {
        this.minimo = minimo;
        this.maximo = maximo;
    }

    public static DefinirRangoDePrecio entre(String minimo, String maximo) {
        return instrumented(DefinirRangoDePrecio.class, minimo, maximo);
    }

    @Override
    @Step("{0} define el rango de precio entre #minimo y #maximo")
    public <T extends Actor> void performAs(T actor) {
        fijarValor(actor, PRECIO_MINIMO, minimo);
        fijarValor(actor, PRECIO_MAXIMO, maximo);
    }

    private void fijarValor(Actor actor, Target control, String valor) {
        BrowseTheWeb.as(actor).evaluateJavascript(FIJAR_VALOR, control.resolveFor(actor).getElement(), valor);
    }
}
