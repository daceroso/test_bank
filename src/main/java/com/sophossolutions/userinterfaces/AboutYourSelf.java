package com.sophossolutions.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AboutYourSelf {

    public static Target NOMBRE = Target.the("nombre usuario").locatedBy("id:firstName");
    public static Target APELLIDO = Target.the("apellido usuario").locatedBy("id:lastName");
    public static Target EMAIL = Target.the("email usuario").locatedBy("id:email");
    public static Target MES = Target.the("mes nacimiento usuario").locatedBy("//*[@id=\"birthMonth\"]");
    public static Target DIA = Target.the("dia nacimiento usuario").locatedBy("//*[@id=\"birthDay\"]");
    public static Target ANO = Target.the("año nacimiento usuario").locatedBy("//*[@id=\"birthYear\"]");
    public static Target IDIOMA = Target.the("idioma usuario").locatedBy("//*[@id=\"languages\"]/div[1]/input");
    public static Target BTN_UBICACION = Target.the("Boton ubicacion").locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a");


}
