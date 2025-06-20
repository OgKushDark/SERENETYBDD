package com.nttdata.testing.Pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AccountInformationPage extends PageObject {

    public static final Target TXT_FIRST_NAME = Target.the("Campo de texto primer nombre")
            .located(By.xpath("//input[@id='firstname']"));

    public static final Target BTN_SAVE = Target.the("Guardar cambios")
            .located(By.xpath("//button[normalize-space(.)='Save']"));
}
