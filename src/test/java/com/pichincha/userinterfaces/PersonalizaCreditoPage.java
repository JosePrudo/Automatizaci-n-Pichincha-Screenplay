package com.pichincha.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PersonalizaCreditoPage {

    private PersonalizaCreditoPage() {
    }

    public static final Target MONTO_PRESTAMO = Target.the("campo de monto del préstamo")
            .locatedBy("css:input[placeholder='Monto total del préstamo']");

    public static final Target PLAZO = Target.the("lista de plazo en años")
            .locatedBy("css:select");

    public static final Target TIPO_CUOTA = Target.the("opción de tipo de cuota {0}")
            .locatedBy("css:input[name='paymentType'][value='{0}']");
}
