package com.sophossolutions.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.sophossolutions.steps",
        features = "src/test/com/sophossolutions/resources/features/registrar_nuevo_usuario.feature",
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false
)


public class RegistrarNuevoUsuario {
}
