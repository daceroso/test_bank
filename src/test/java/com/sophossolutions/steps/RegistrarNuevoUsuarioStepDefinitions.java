package com.sophossolutions.steps;

import com.sophossolutions.tasks.IrSitioWeb;
import com.sophossolutions.userinterfaces.HomePageWeb;
import com.sophossolutions.utilities.Constanst;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistrarNuevoUsuarioStepDefinitions {


    @Given("^\"([^\"]*)\" navega a la pagina de la comunidad$")
    public void navegaALaPaginaDeLaComunidad(String arg1) {
        theActorCalled(Constanst.ACTOR_NAME).wasAbleTo(Open.url(Constanst.URL_SITE));
        theActorInTheSpotlight().attemptsTo(IrSitioWeb.deComunidadTester());

    }


    @When("^Agrega informacion personal para el registro$")
    public void agregaInformacionPersonalParaElRegistro(DataTable arg1) {

    }

    @When("^completa informacion de sus dipositivos$")
    public void completaInformacionDeSusDipositivos(DataTable arg1) {

    }

    @Then("^valida que el usuario es registrado$")
    public void validaQueElUsuarioEsRegistrado() {

    }

}
