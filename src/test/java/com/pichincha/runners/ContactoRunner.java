package com.pichincha.runners;

import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

/**
 * Ejecuta solo el feature 07_contacto/contacto.feature.
 */
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features/07_contacto/contacto.feature")
public class ContactoRunner {
}
