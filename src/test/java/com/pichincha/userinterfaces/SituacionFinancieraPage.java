package com.pichincha.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SituacionFinancieraPage {

    private SituacionFinancieraPage() {
    }

    public static final Target SITUACION_LABORAL = Target.the("opción de situación laboral {0}")
            .locatedBy("css:input[name='laborSituation'][value='{0}']");

    public static final Target INGRESOS_NETOS = Target.the("campo de ingresos netos")
            .locatedBy("css:input[placeholder='Ingresos netos']");

    public static final Target TOTAL_AHORRADO = Target.the("campo de total ahorrado")
            .locatedBy("css:input[placeholder='Total ahorrado']");

    public static final Target FECHA_NACIMIENTO = Target.the("campo de fecha de nacimiento")
            .locatedBy("css:input[type='date']");

    public static final Target ESTADO_CIVIL = Target.the("lista de estado civil")
            .locatedBy("css:select");
}
