package com.pichincha.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProyectoViviendaPage {

    private ProyectoViviendaPage() {
    }

    public static final Target TIPO_APLICACION = Target.the("opción de tipo de aplicación {0}")
            .locatedBy("css:input[name='applicationType'][value='{0}']");

    public static final Target TIPO_VIVIENDA = Target.the("opción de tipo de vivienda {0}")
            .locatedBy("css:input[name='housingType'][value='{0}']");

    public static final Target CIUDAD = Target.the("lista de ciudades")
            .locatedBy("css:select");

    public static final Target PRECIO_MINIMO = Target.the("control de precio mínimo")
            .locatedBy("(//input[@type='range'])[1]");

    public static final Target PRECIO_MAXIMO = Target.the("control de precio máximo")
            .locatedBy("(//input[@type='range'])[2]");

    public static final Target BOTON_SIGUIENTE = Target.the("botón Siguiente")
            .locatedBy("//button[normalize-space()='Siguiente']");

    public static final Target SECCION = Target.the("sección {0}")
            .locatedBy("//h2[normalize-space()='{0}']");
}
