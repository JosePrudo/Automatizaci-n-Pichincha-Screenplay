package com.pichincha.runners;

import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

/**
 * Ejecuta solo el feature 04_personaliza/personaliza_credito.feature.
 */
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features/04_personaliza/personaliza_credito.feature")
public class PersonalizaCreditoRunner {
}
