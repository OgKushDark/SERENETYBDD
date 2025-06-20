package com.nttdata.testing.Pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://magento.softwaretestingboard.com/")
public class HomePage extends PageObject {

    //  SIGN UP

    public static final Target BTN_SIGN_UP = Target.the("Boton para hacer el registro")
            .located(By.xpath("//a[text()='Create an Account']"));

    public static final Target BTN_SIGN_IN = Target.the("Boton para hacer el inicio se sesion")
            .located(By.xpath("//a[normalize-space(text())='Sign In']"));

    public static final Target TXT_BUSCAR = Target.the("Barra de busqueda")
            .located(By.id("search"));

    public static final Target ICN_BUSCAR = Target.the("Icono para buscar")
            .located(By.xpath("//button[contains(@class, 'search') and span[text()='Search']]"));

    public static final Target LBL_ERROR_MESSAGE_SEARCH_PRODUCT = Target.the("Mensaje de error al buscar producto no existente")
            .locatedBy("//div[@class='message notice']/div[normalize-space(text())='Your search returned no results.']");


    // //span[normalize-space(text())='Men']
    public static final Target LBL_MEN = Target.the("opcion men del menu horizontal")
            .located(By.xpath("//span[normalize-space(text())='Men']"));

    // //span[normalize-space(text())='Tops']
    public static final Target LBL_TOPS = Target.the("opcion Tops del sub menu de men del menu horizontal")
            .located(By.xpath("//a[@id='ui-id-17']"));
    // //span[normalize-space(text())='Jackets']
    public static final Target LBL_JACKETS = Target.the("opcion Jackets del sub menu de Tops")
            .located(By.xpath("//a[@id='ui-id-19']"));
//    public static final Target REGISTER_MODAL = Target.the("Modal de registro")
//            .located(By.id("signInModalLabel"));
//
//    public static final Target INP_USERNAME = Target.the("Nombre de usuario")
//            .located(By.id("sign-username"));
//
//    public static final Target INP_PASSWORD = Target.the("Contraseña")
//            .located(By.id("sign-password"));
//
//    public static final Target BTN_REGISTRAR = Target.the("Boton Registrar")
//            .located(By.xpath("//button[text()='Sign up']"));
//
//    //  LOG IN
//
//    public static final Target BTN_LOGIN = Target.the("Boton para iniciar sesion")
//            .located(By.id("login2"));
}
