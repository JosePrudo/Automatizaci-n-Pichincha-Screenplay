package com.pichincha.tasks;

import com.pichincha.userinterfaces.PaginaInicioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirPaginaInicio implements Task {

    private final PaginaInicioPage paginaInicio = new PaginaInicioPage();

    public static AbrirPaginaInicio delBanco() {
        return instrumented(AbrirPaginaInicio.class);
    }

    @Override
    @Step("{0} abre la página de inicio de Banco Pichincha")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaInicio));
    }
}
