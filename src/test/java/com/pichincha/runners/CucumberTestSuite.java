package com.pichincha.runners;

import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

/**
 * Ejecuta el flujo completo del simulador en orden (feature 01 al 08) sobre el mismo navegador:
 * cada feature continúa en la sección donde terminó el anterior.
 */
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features/01_inicio/pagina_inicio.feature")
@SelectClasspathResource("features/02_proyecto/proyecto_vivienda.feature")
@SelectClasspathResource("features/03_finanzas/situacion_financiera.feature")
@SelectClasspathResource("features/04_personaliza/personaliza_credito.feature")
@SelectClasspathResource("features/05_resultados/tus_resultados.feature")
@SelectClasspathResource("features/06_capacidad/capacidad_real.feature")
@SelectClasspathResource("features/07_contacto/contacto.feature")
@SelectClasspathResource("features/08_confirmacion/confirmacion.feature")
public class CucumberTestSuite {
}
