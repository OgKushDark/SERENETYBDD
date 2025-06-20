package com.nttdata.testing.stepDefinition;

import com.nttdata.testing.Pages.HomePage;
import com.nttdata.testing.Pages.MenClothesPage;
import com.nttdata.testing.Tasks.LoginTask;
import com.nttdata.testing.Tasks.NavigateTo;
import com.nttdata.testing.questions.RegisterQuestion;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class OrderPurchaseStepDefinition {
    @Given("El {actor} inicia sesion con sus credenciales de email {string} y contrasenia {string}")
    public void elUsuarioIniciaSesionConSusCredencialesDeEmailYContrasenia(Actor actor, String email, String contrasenia) {
        actor.attemptsTo(NavigateTo.theHomePage());
        theActorInTheSpotlight().attemptsTo(LoginTask.withData(email, contrasenia));
    }

    @And("se dirige a la opcion Men del menu horizontal para dirigirse a la opcion Tops del sub menu")
    public void seDirigeALaOpcionMenDelMenuHorizontalParaDirigirseALaOpcionTopsDelSubMenu() throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(
                MoveMouse.to(HomePage.LBL_MEN)
                //MoveMouse.to(HomePage.LBL_TOPS),
                //MoveMouse.to(HomePage.LBL_JACKETS)
        );
        Thread.sleep(1000);
        theActorInTheSpotlight().attemptsTo(
                MoveMouse.to(HomePage.LBL_TOPS)
        );
        Thread.sleep(1000);
        theActorInTheSpotlight().attemptsTo(
                MoveMouse.to(HomePage.LBL_JACKETS)
        );
    }

    @And("hace clic en la opcion Jackets")
    public void haceClicEnLaOpcionJackets() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(HomePage.LBL_JACKETS)
        );
    }

    @And("se dirige a un producto para seleccionar la talla {string} y color {string}")
    public void seDirigeAUnProductoParaSeleccionarLaTallaYColor(String talla, String color) {
        theActorInTheSpotlight().attemptsTo(
                MoveMouse.to(MenClothesPage.ITM_JACKET),
                Click.on(MenClothesPage.ITM_JACKET),
                Click.on(MenClothesPage.ITM_TALLA),
                Click.on(MenClothesPage.ITM_COLOR_PRENDA_BLACK)
        );
    }

    @And("agrega al carrito de compras")
    public void agregaAlCarritoDeCompras() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(MenClothesPage.BTN_AGREGAR_CARRITO)
        );
    }

    @And("da clic en el carrito de compras, para proceder con la compra")
    public void daClicEnElCarritoDeComprasParaProcederConLaCompra() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(MenClothesPage.ITM_CARRITO),
                Click.on(MenClothesPage.BTN_PROCEDER_COMPRA)
        );
    }

    @And("completa el formulario de compra con la compania {string} direccion {string} ciudad {string} codigo postal {string} selecciona el pais para indicar la provincia {string} y ecribe su numero telefono {string}")
    public void completaElFormularioDeCompraConLaCompaniaDireccionCiudadCodigoPostalSeleccionaElPaisParaIndicarLaProvinciaYEcribeSuNumeroTelefono(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) {

    }

    @And("da clic en el boton siguiente")
    public void daClicEnElBotonSiguiente() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(MenClothesPage.LBL_NEXT)
        );
    }

    @When("da clic en el boton realizar pedido")
    public void daClicEnElBotonRealizarPedido() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(MenClothesPage.LBL_PLACE_ORDER)
        );
    }

    @Then("validamos la compra que sea exitosa")
    public void validamosLaCompraQueSeaExitosa() {
        System.out.println("Compra existosa");
        try{
            theActorInTheSpotlight().should(seeThat("El mensaje de compra exitosa", RegisterQuestion.visibleEn(MenClothesPage.LBL_THANK_YOUR_PURCHASE), equalTo("Thank you for your purchase!")));
            Thread.sleep(5000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
