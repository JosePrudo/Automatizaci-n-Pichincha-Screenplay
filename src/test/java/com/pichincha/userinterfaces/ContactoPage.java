package com.pichincha.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ContactoPage {

    private ContactoPage() {
    }

    public static final Target HORARIO_CONTACTO = Target.the("opción de horario de contacto {0}")
            .locatedBy("css:input[name='preferredTime'][value='{0}']");

    public static final Target MEDIO_CONTACTO = Target.the("opción de medio de contacto {0}")
            .locatedBy("css:input[name='contactMethod'][value='{0}']");

    public static final Target RECIBIR_INFORMACION = Target.the("check de recibir información de otros productos")
            .locatedBy("css:#wantsProductInfo");
}
