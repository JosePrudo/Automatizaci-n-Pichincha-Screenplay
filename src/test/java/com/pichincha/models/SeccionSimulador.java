package com.pichincha.models;

import com.pichincha.tasks.AceptarRecibirInformacion;
import com.pichincha.tasks.AutorizarConsultaCrediticia;
import com.pichincha.tasks.ConocerCapacidadReal;
import com.pichincha.tasks.ContinuarAlSiguientePaso;
import com.pichincha.tasks.DefinirRangoDePrecio;
import com.pichincha.tasks.IngresarDatosPersonales;
import com.pichincha.tasks.IngresarFechaNacimiento;
import com.pichincha.tasks.IngresarLugarDeTrabajo;
import com.pichincha.tasks.IngresarMontoPrestamo;
import com.pichincha.tasks.IngresarMontos;
import com.pichincha.tasks.IngresarPersonasACargo;
import com.pichincha.tasks.SeleccionarCiudad;
import com.pichincha.tasks.SeleccionarEstadoCivil;
import com.pichincha.tasks.SeleccionarHorarioContacto;
import com.pichincha.tasks.SeleccionarMedioContacto;
import com.pichincha.tasks.SeleccionarPlazo;
import com.pichincha.tasks.SeleccionarSituacionLaboral;
import com.pichincha.tasks.SeleccionarTipoAplicacion;
import com.pichincha.tasks.SeleccionarTipoCuota;
import com.pichincha.tasks.SeleccionarTipoVivienda;
import net.serenitybdd.screenplay.Performable;

import java.util.Arrays;

import static com.pichincha.models.DatosSimulacion.*;

/**
 * Secciones del simulador en el orden del flujo y los pasos necesarios para completar cada una
 * y avanzar a la siguiente.
 */
public enum SeccionSimulador {

    PROYECTO_VIVIENDA("Tu proyecto de vivienda") {
        @Override
        public Performable[] pasosParaCompletar() {
            return new Performable[]{
                    SeleccionarTipoAplicacion.conOpcion(TIPO_APLICACION),
                    SeleccionarTipoVivienda.conOpcion(TIPO_VIVIENDA),
                    SeleccionarCiudad.llamada(CIUDAD),
                    DefinirRangoDePrecio.entre(PRECIO_MINIMO, PRECIO_MAXIMO),
                    ContinuarAlSiguientePaso.delFormulario()
            };
        }
    },
    SITUACION_FINANCIERA("Tu situación financiera") {
        @Override
        public Performable[] pasosParaCompletar() {
            return new Performable[]{
                    SeleccionarSituacionLaboral.conOpcion(SITUACION_LABORAL),
                    IngresarMontos.conIngresosYAhorro(INGRESOS_NETOS, TOTAL_AHORRADO),
                    IngresarFechaNacimiento.el(FECHA_NACIMIENTO),
                    SeleccionarEstadoCivil.llamado(ESTADO_CIVIL),
                    ContinuarAlSiguientePaso.delFormulario()
            };
        }
    },
    PERSONALIZA_CREDITO("Personaliza tu crédito de vivienda") {
        @Override
        public Performable[] pasosParaCompletar() {
            return new Performable[]{
                    IngresarMontoPrestamo.de(MONTO_PRESTAMO),
                    SeleccionarPlazo.de(PLAZO),
                    SeleccionarTipoCuota.conOpcion(TIPO_CUOTA),
                    ContinuarAlSiguientePaso.delFormulario()
            };
        }
    },
    TUS_RESULTADOS("Tus resultados") {
        @Override
        public Performable[] pasosParaCompletar() {
            return new Performable[]{
                    ConocerCapacidadReal.desdeLosResultados()
            };
        }
    },
    CAPACIDAD_REAL("Tu capacidad real") {
        @Override
        public Performable[] pasosParaCompletar() {
            return new Performable[]{
                    IngresarDatosPersonales.con(NOMBRE_COMPLETO, CEDULA, CORREO, TELEFONO_CELULAR),
                    AutorizarConsultaCrediticia.enCentralesDeRiesgo(),
                    IngresarPersonasACargo.cantidad(PERSONAS_A_CARGO),
                    IngresarLugarDeTrabajo.enLaEmpresa(EMPRESA),
                    ContinuarAlSiguientePaso.delFormulario()
            };
        }
    },
    CONTACTO("Quiero que me Contacten") {
        @Override
        public Performable[] pasosParaCompletar() {
            return new Performable[]{
                    SeleccionarHorarioContacto.enLa(HORARIO_CONTACTO),
                    SeleccionarMedioContacto.porMedioDe(MEDIO_CONTACTO),
                    AceptarRecibirInformacion.deOtrosProductos(),
                    ContinuarAlSiguientePaso.delFormulario()
            };
        }
    },
    CONFIRMACION("Confirmación") {
        @Override
        public Performable[] pasosParaCompletar() {
            return new Performable[0];
        }
    };

    private final String titulo;

    SeccionSimulador(String titulo) {
        this.titulo = titulo;
    }

    public String titulo() {
        return titulo;
    }

    public abstract Performable[] pasosParaCompletar();

    public static SeccionSimulador conTitulo(String titulo) {
        return Arrays.stream(values())
                .filter(seccion -> seccion.titulo.equals(titulo))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Sección desconocida: " + titulo));
    }
}
