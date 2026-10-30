package com.pichincha.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CapacidadRealPage {

    private CapacidadRealPage() {
    }

    public static final Target NOMBRE_COMPLETO = Target.the("campo de nombre completo")
            .locatedBy("css:input[placeholder='Nombre completo']");

    public static final Target CEDULA = Target.the("campo de cédula")
            .locatedBy("css:input[placeholder='Documento de identidad']");

    public static final Target CORREO = Target.the("campo de correo electrónico")
            .locatedBy("css:input[type='email']");

    public static final Target TELEFONO_CELULAR = Target.the("campo de teléfono celular")
            .locatedBy("css:input[type='tel']");

    public static final Target AUTORIZAR_CONSULTA_CREDITICIA = Target.the("check de autorización para consultar el historial crediticio")
            .locatedBy("css:#authorizeCreditCheck");

    public static final Target PERSONAS_A_CARGO = Target.the("campo de personas que dependen económicamente")
            .locatedBy("css:input[placeholder='Cargas familiares']");

    public static final Target LUGAR_DE_TRABAJO = Target.the("campo de lugar de trabajo")
            .locatedBy("css:input[placeholder='Compañía de tecnología S.A.S']");
}
