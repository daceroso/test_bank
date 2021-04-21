package com.sophossolutions.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AddresUser {

    public static Target CIUDAD = Target.the("ciudad usuario").locatedBy("id:city");
    public static Target CODIO_POSTAL = Target.the("codigo postal usuario").locatedBy("id:zip");
    public static Target PAIS = Target.the("pais usuario").locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span");
    public static Target BTN_DISPOSITIVOS = Target.the("boton dispositivos").locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a");
}
