package com.sophossolutions.tasks;

import com.sophossolutions.userinterfaces.AboutYourSelf;
import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import java.util.Map;

public class LlenarDatosUsuario implements Task {

    private Map<String, String> condiciones;

    public LlenarDatosUsuario(DataTable condiciones) {
        this.condiciones = condiciones.asMap(String.class, String.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SendKeys.of(condiciones.get("nombre")).into(AboutYourSelf.NOMBRE), SendKeys.of(condiciones.get("apellido")).into(AboutYourSelf.APELLIDO), SendKeys.of(condiciones.get("email")).into(AboutYourSelf.EMAIL), SelectFromOptions.byVisibleText(condiciones.get("mes")).from(AboutYourSelf.MES), SelectFromOptions.byVisibleText(condiciones.get("dia")).from(AboutYourSelf.DIA), SelectFromOptions.byVisibleText(condiciones.get("ano")).from(AboutYourSelf.ANO), SendKeys.of(condiciones.get("idioma")).into(AboutYourSelf.IDIOMA).thenHit(Keys.ENTER), Click.on(AboutYourSelf.BTN_UBICACION));
    }
}
