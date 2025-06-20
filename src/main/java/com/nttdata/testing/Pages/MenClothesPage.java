package com.nttdata.testing.Pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MenClothesPage extends PageObject {

    public static final Target TXT_BUSCAR = Target.the("Barra de busqueda")
            .located(By.id("search"));

    public static final Target ICN_BUSCAR = Target.the("Icono para buscar")
            .located(By.xpath("//button[contains(@class, 'search') and span[text()='Search']]"));

    public static final Target ITM_SHIRT = Target.the("Item Shirt")
            .located(By.xpath("//li[contains(@class, 'product-item') and .//a[contains(text(), 'Proteus Fitness Jackshirt')]]"));

    public static final Target ITM_TALLA = Target.the("Item Talla de ropa")
            .located(By.xpath("//div[@option-label='L']"));

    public static final Target ITM_COLOR_PRENDA = Target.the("Color de la prenda")
            .located(By.xpath("//div[@option-label='Blue']"));

    public static final Target BTN_AGREGAR_CARRITO = Target.the("Boton Agregar producto al carrito")
            .located(By.xpath("//button[span[text()='Add to Cart']]"));

    public static final Target ITM_CARRITO = Target.the("Items agregados al carrito")
            .located(By.xpath("//div[@data-block='minicart']//span[@class='counter qty']//span[@class='counter-number']"));

    public static final Target ITM_JACKET = Target.the("Item Jacket")
            .located(By.xpath("//li[contains(@class, 'product-item') and .//a[contains(text(), 'Montana Wind Jacket')]]"));

    public static final Target ITM_COLOR_PRENDA_BLACK = Target.the("Color de la prenda")
            .located(By.xpath("//div[@option-label='Black']"));

    // //button[normalize-space(text())='Proceed to Checkout']
    public static final Target BTN_PROCEDER_COMPRA = Target.the("Boton proceder con la compra")
            .located(By.xpath("//button[normalize-space(text())='Proceed to Checkout']"));

    public static final Target LBL_NEXT = Target.the("boton next para proceder con la compra")
            .located(By.xpath("//span[normalize-space(text())='Next']"));

    // Place Order
    public static final Target LBL_PLACE_ORDER = Target.the("boton place order para realizar pedido")
            .located(By.xpath("//span[normalize-space(text())='Place Order']"));

    // Thank you for your purchase! // //span[normalize-space(text())='Thank you for your purchase!']
    public static final Target LBL_THANK_YOUR_PURCHASE = Target.the("gracias por su compra")
            .located(By.xpath("//span[@class='base' and @data-ui-id='page-title-wrapper' and normalize-space(.)='Thank you for your purchase!']"));
    // //span[@class='base' and @data-ui-id='page-title-wrapper' and normalize-space(.)='Thank you for your purchase!']




}
