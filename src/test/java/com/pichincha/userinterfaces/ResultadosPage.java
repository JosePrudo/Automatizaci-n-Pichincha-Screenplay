package com.pichincha.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ResultadosPage {

    private ResultadosPage() {
    }

    public static final Target BOTON_CONOCER_CAPACIDAD_REAL = Target.the("botón ¿Quieres conocer tu capacidad real?")
            .locatedBy("//button[normalize-space()='¿Quieres conocer tu capacidad real?']");
}
