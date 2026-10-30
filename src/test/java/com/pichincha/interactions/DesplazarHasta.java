package com.pichincha.interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Desplaza el control al centro de la pantalla y espera a que quede estable y sin elementos encima.
 * La página usa scroll-behavior: smooth y desplaza la vista al cambiar de paso, por lo que un clic
 * durante la animación es interceptado por otro elemento.
 */
public class DesplazarHasta implements Interaction {

    private static final String SCRIPT = "var e = arguments[0];"
            + "document.documentElement.style.scrollBehavior = 'auto';"
            + "var r = e.getBoundingClientRect();"
            + "var visible = r.top >= 0 && r.bottom <= window.innerHeight;"
            + "var encima = document.elementFromPoint(r.left + r.width / 2, r.top + r.height / 2);"
            + "if (visible && encima && (encima === e || e.contains(encima) || (e.labels && Array.from(e.labels).indexOf(encima) >= 0))) {"
            + "  return true;"
            + "}"
            + "e.scrollIntoView({block: 'center', behavior: 'instant'});"
            + "return false;";

    private static final int INTENTOS_MAXIMOS = 40;
    private static final int LECTURAS_ESTABLES = 2;
    private static final long PAUSA_MS = 150;

    private final Target control;

    public DesplazarHasta(Target control) {
        this.control = control;
    }

    public static DesplazarHasta el(Target control) {
        return instrumented(DesplazarHasta.class, control);
    }

    @Override
    @Step("{0} se desplaza hasta #control")
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb navegador = BrowseTheWeb.as(actor);
        WebElement elemento = control.resolveFor(actor).getElement();
        int estables = 0;
        for (int intento = 0; intento < INTENTOS_MAXIMOS && estables < LECTURAS_ESTABLES; intento++) {
            estables = Boolean.TRUE.equals(navegador.evaluateJavascript(SCRIPT, elemento)) ? estables + 1 : 0;
            esperar();
        }
    }

    private static void esperar() {
        try {
            Thread.sleep(PAUSA_MS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
