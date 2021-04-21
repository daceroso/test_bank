package com.sophossolutions.userinterfaces;

import com.sophossolutions.utilities.Constanst;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;



public class HomePageWeb {

    public static Target BTN_UNIRSE = Target.the("Boton unirse").locatedBy("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a");
}
