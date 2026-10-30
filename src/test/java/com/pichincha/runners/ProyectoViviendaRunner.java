package com.pichincha.runners;

import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

/**
 * Ejecuta solo el feature 02_proyecto/proyecto_vivienda.feature.
 */
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features/02_proyecto/proyecto_vivienda.feature")
public class ProyectoViviendaRunner {
}
