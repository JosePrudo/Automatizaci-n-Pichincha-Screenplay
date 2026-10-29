package com.pichincha.interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Fija el valor de controles que no aceptan escritura (sliders, fechas) y notifica a Angular.
 */
public class FijarValor implements Interaction {

    private static final String SCRIPT = "arguments[0].value = arguments[1];"
            + "arguments[0].dispatchEvent(new Event('input', {bubbles: true}));"
            + "arguments[0].dispatchEvent(new Event('change', {bubbles: true}));";

    private final Target control;
    private final String valor;

    public FijarValor(Target control, String valor) {
        this.control = control;
        this.valor = valor;
    }

    public static FijarValor en(Target control, String valor) {
        return instrumented(FijarValor.class, control, valor);
    }

    @Override
    @Step("{0} fija el valor #valor en #control")
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).evaluateJavascript(SCRIPT, control.resolveFor(actor).getElement(), valor);
    }
}
