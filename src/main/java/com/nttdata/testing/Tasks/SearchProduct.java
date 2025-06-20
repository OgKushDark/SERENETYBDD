package com.nttdata.testing.Tasks;

import com.nttdata.testing.Pages.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

public class SearchProduct implements Task {

    private final String nombreProducto;

    public SearchProduct(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombreProducto).into(HomePage.TXT_BUSCAR)
        );

    }

    public static Performable withData(String nombreProducto){return new SearchProduct(nombreProducto);}
}
