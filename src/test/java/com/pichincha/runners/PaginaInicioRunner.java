package com.pichincha.runners;

import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

/**
 * Ejecuta solo el feature 01_inicio/pagina_inicio.feature.
 */
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features/01_inicio/pagina_inicio.feature")
public class PaginaInicioRunner {
}
