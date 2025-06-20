package com.nttdata.testing.stepDefinition;

import com.nttdata.testing.Pages.AccountInformationPage;
import com.nttdata.testing.Pages.AccountPage;
import com.nttdata.testing.Tasks.EditUserTask;
import com.nttdata.testing.Tasks.LoginTask;
import com.nttdata.testing.Tasks.NavigateTo;
import com.nttdata.testing.questions.RegisterQuestion;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EditUserStepDefinition {

    @Given("el {actor} inicia sesion con sus credenciales email {string} y contrasenia {string}")
    public void elUsuarioIniciaSesionConSusCredencialesEmailYContrasenia(Actor actor, String email, String contrasenia) {
        actor.attemptsTo(NavigateTo.theHomePage());
        theActorInTheSpotlight().attemptsTo(LoginTask.withData(email, contrasenia));
    }

    @And("se dirige a la opcion mi cuenta")
    public void seDirigeALaOpcionMiCuenta() {
        theActorInTheSpotlight().attemptsTo(Click.on(AccountPage.BTN_MENU_CLIENTE));
        theActorInTheSpotlight().attemptsTo(Click.on(AccountPage.BTN_MY_ACCOUNT));
    }

    @And("selecciona editar cuenta")
    public void seleccionaEditarCuenta() {
        theActorInTheSpotlight().attemptsTo(Click.on(AccountPage.LBL_EDIT));
    }

    @And("ingresa su nuevo nombre {string}")
    public void ingresaSuNuevoNombre(String nombreNuevo) {
        theActorInTheSpotlight().attemptsTo(EditUserTask.withData(nombreNuevo));
    }

    @When("de clic en el boton guardar")
    public void deClicEnElBotonGuardar() {
        theActorInTheSpotlight().attemptsTo(Click.on(AccountInformationPage.BTN_SAVE));
    }

    @Then("se realiza la actualizacion de manera exitosa")
    public void seRealizaLaActualizacionDeManeraExitosa() {
        theActorInTheSpotlight().should(seeThat("Datos actualizados correctamente", RegisterQuestion.visibleEn(AccountPage.LBL_SAVED_ACCOUNT_INFORMATION)));
    }
}
