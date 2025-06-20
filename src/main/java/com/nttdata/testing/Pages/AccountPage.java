package com.nttdata.testing.Pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AccountPage extends PageObject {

    public static final Target LBL_MY_ACCOUNT = Target.the("Boton crear usuario")
            .located(By.xpath("//span[text()='My Account']"));

    public static final Target BTN_MENU_CLIENTE = Target.the("boton de menu cliente")
            .located(By.xpath("//button[@data-action='customer-menu-toggle']"));

    public static final Target BTN_MY_ACCOUNT = Target.the("boton mi cuenta")
            .located(By.xpath("//a[text()='My Account']")); /*opción2://a[normalize-space(text())='My Account']*/

    public static final Target LBL_EDIT = Target.the("editar cuenta")
            .located(By.xpath("//a[normalize-space(.)='Edit']"));

    public static final Target LBL_SAVED_ACCOUNT_INFORMATION = Target.the("Mensaje datos actualizados correctamente")
            .locatedBy("//div[normalize-space(text())='You saved the account information.']");



}
