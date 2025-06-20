package com.nttdata.testing.stepDefinition;

import com.nttdata.testing.Pages.HomePage;
import com.nttdata.testing.Tasks.SearchProduct;
import com.nttdata.testing.questions.RegisterQuestion;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class ClothesFinderStepDefinition {
    @And("ingresa un producto {string} a buscar")
    public void ingresaUnProductoABuscar(String nombreProducto) {
        theActorInTheSpotlight().attemptsTo(SearchProduct.withData(nombreProducto));
    }

    @When("hace click en el boton search")
    public void haceClickEnElBotonSearch() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(HomePage.ICN_BUSCAR)
        );
    }

    @Then("no se encuentran resultados para el producto buscado")
    public void noSeEncuentranResultadosParaElProductoBuscado() {
        theActorInTheSpotlight().should(seeThat("Error al buscar producto", RegisterQuestion.visibleEn(HomePage.LBL_ERROR_MESSAGE_SEARCH_PRODUCT)));
    }
}
