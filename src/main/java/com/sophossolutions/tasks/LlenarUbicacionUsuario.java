package com.sophossolutions.tasks;

import com.sophossolutions.userinterfaces.AddresUser;
import cucumber.api.DataTable;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import java.util.Map;

public class LlenarUbicacionUsuario implements Task {
    private Map<String, String> condiciones;

    public LlenarUbicacionUsuario(DataTable condiciones) {
        this.condiciones = condiciones.asMap(String.class, String.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.keyValues(condiciones.get("ciudad")).into(AddresUser.CIUDAD), Enter.keyValues(condiciones.get("codigo")).into(AddresUser.CODIO_POSTAL), SendKeys.of(condiciones.get("pais")).into(AddresUser.PAIS).thenHit(Keys.ENTER), Click.on(AddresUser.BTN_DISPOSITIVOS));
    }


    public static LlenarUbicacionUsuario enFormulario(DataTable condiciones) {
        return Tasks.instrumented(LlenarUbicacionUsuario.class, condiciones);
    }
}
