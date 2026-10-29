package com.pichincha.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProyectoViviendaPage {

    private ProyectoViviendaPage() {
    }

    public static final Target TIPO_APLICACION = Target.the("opción de tipo de aplicación {0}")
            .locatedBy("css:input[name='applicationType'][value='{0}']");
}
