package com.pichincha.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static com.pichincha.userinterfaces.CapacidadRealPage.CEDULA;
import static com.pichincha.userinterfaces.CapacidadRealPage.CORREO;
import static com.pichincha.userinterfaces.CapacidadRealPage.NOMBRE_COMPLETO;
import static com.pichincha.userinterfaces.CapacidadRealPage.TELEFONO_CELULAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarDatosPersonales implements Task {

    private final String nombreCompleto;
    private final String cedula;
    private final String correo;
    private final String telefono;

    public IngresarDatosPersonales(String nombreCompleto, String cedula, String correo, String telefono) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
    }

    public static IngresarDatosPersonales con(String nombreCompleto, String cedula, String correo, String telefono) {
        return instrumented(IngresarDatosPersonales.class, nombreCompleto, cedula, correo, telefono);
    }

    @Override
    @Step("{0} ingresa sus datos personales: #nombreCompleto, #cedula, #correo, #telefono")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombreCompleto).into(NOMBRE_COMPLETO),
                Enter.theValue(cedula).into(CEDULA),
                Enter.theValue(correo).into(CORREO),
                Enter.theValue(telefono).into(TELEFONO_CELULAR)
        );
    }
}
