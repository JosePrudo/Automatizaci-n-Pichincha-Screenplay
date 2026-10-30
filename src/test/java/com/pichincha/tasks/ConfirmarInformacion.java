package com.pichincha.tasks;

import com.pichincha.interactions.DesplazarHasta;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.pichincha.userinterfaces.ConfirmacionPage.CONFIRMAR_INFORMACION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConfirmarInformacion implements Task {

    public static ConfirmarInformacion correctaYCompleta() {
        return instrumented(ConfirmarInformacion.class);
    }

    @Override
    @Step("{0} confirma que toda la información está correcta y completa")
    public <T extends Actor> void performAs(T actor) {
        if (!CONFIRMAR_INFORMACION.resolveFor(actor).isSelected()) {
            actor.attemptsTo(
                    DesplazarHasta.el(CONFIRMAR_INFORMACION),
                    Click.on(CONFIRMAR_INFORMACION)
            );
        }
    }
}
