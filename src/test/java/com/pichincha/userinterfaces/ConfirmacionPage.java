package com.pichincha.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ConfirmacionPage {

    private ConfirmacionPage() {
    }

    public static final Target CONFIRMAR_INFORMACION = Target.the("check de información correcta y completa")
            .locatedBy("css:#confirmInformation");

    public static final Target BOTON_ACEPTAR_Y_ENVIAR = Target.the("botón Aceptar y Enviar")
            .locatedBy("//button[normalize-space()='Aceptar y Enviar']");

    public static final Target BOTON_ACEPTAR = Target.the("botón Aceptar")
            .locatedBy("//button[normalize-space()='Aceptar']");
}
