package com.pichincha.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirUrl implements Task {

    private final String url;

    public AbrirUrl(String url) {
        this.url = url;
    }

    public static AbrirUrl especifica(String url) {
        return instrumented(AbrirUrl.class, url);
    }

    @Override
    @Step("{0} abre la URL indicada")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }
}
