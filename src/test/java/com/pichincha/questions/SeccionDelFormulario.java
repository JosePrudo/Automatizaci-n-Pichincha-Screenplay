package com.pichincha.questions;

import net.serenitybdd.screenplay.Question;

import static com.pichincha.userinterfaces.ProyectoViviendaPage.SECCION;

public class SeccionDelFormulario {

    private SeccionDelFormulario() {
    }

    public static Question<Boolean> estaVisible(String nombre) {
        return Question.about("la sección " + nombre + " está visible")
                .answeredBy(actor -> SECCION.of(nombre).resolveFor(actor).isCurrentlyVisible());
    }
}
