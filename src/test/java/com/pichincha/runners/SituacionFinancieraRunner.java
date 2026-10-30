package com.pichincha.runners;

import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

/**
 * Ejecuta solo el feature 03_finanzas/situacion_financiera.feature.
 */
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features/03_finanzas/situacion_financiera.feature")
public class SituacionFinancieraRunner {
}
