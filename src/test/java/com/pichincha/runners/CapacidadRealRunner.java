package com.pichincha.runners;

import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

/**
 * Ejecuta solo el feature 06_capacidad/capacidad_real.feature.
 */
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features/06_capacidad/capacidad_real.feature")
public class CapacidadRealRunner {
}
