package com.pichincha.questions;

import net.serenitybdd.screenplay.Question;

import static com.pichincha.userinterfaces.ProyectoViviendaPage.TIPO_APLICACION;

public class OpcionTipoAplicacion {

    private OpcionTipoAplicacion() {
    }

    public static Question<Boolean> estaSeleccionada(String opcion) {
        return Question.about("la opción " + opcion + " está seleccionada")
                .answeredBy(actor -> TIPO_APLICACION.of(opcion.toLowerCase()).resolveFor(actor).isSelected());
    }
}
