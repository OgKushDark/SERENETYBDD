package com.nttdata.testing.Tasks;

import com.nttdata.testing.Pages.AccountInformationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

public class EditUserTask implements Task {
    private final String firstName;

    public EditUserTask(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Enter.theValue(firstName).into(AccountInformationPage.TXT_FIRST_NAME);
    }

    public static Performable withData(String firstName){
        return new EditUserTask(firstName);
    }
}
