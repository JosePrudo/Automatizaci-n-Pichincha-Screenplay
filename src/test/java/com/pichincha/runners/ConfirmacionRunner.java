package com.pichincha.runners;

import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

/**
 * Ejecuta solo el feature 08_confirmacion/confirmacion.feature.
 */
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features/08_confirmacion/confirmacion.feature")
public class ConfirmacionRunner {
}
