package com.pichincha.tasks;

import com.pichincha.interactions.FijarValor;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static com.pichincha.userinterfaces.ProyectoViviendaPage.PRECIO_MAXIMO;
import static com.pichincha.userinterfaces.ProyectoViviendaPage.PRECIO_MINIMO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DefinirRangoDePrecio implements Task {

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
        actor.attemptsTo(
                FijarValor.en(PRECIO_MINIMO, minimo),
                FijarValor.en(PRECIO_MAXIMO, maximo)
        );
    }
}
