package com.orangehrmlive.opensourcedemo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "com.orangehrmlive.opensourcedemo.stepDefinitions",
        tags = "@CrearUsuario",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class CurrentTestRunner {
}