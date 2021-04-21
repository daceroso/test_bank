package com.sophossolutions.tasks;

import com.sophossolutions.userinterfaces.HomePageWeb;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class IrSitioWeb implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePageWeb.BTN_UNIRSE));
    }

    public static IrSitioWeb deComunidadTester() {
        return Tasks.instrumented(IrSitioWeb.class);
    }
}
