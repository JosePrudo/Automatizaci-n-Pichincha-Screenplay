package com.pichincha.runners;

import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

/**
 * Ejecuta solo el feature 05_resultados/tus_resultados.feature.
 */
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features/05_resultados/tus_resultados.feature")
public class TusResultadosRunner {
}
