package co.com.swaglabs.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.swaglabs.userinterfaces.LoginPage.MESSAGE_ERROR;

public class TheErrorMessage implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return MESSAGE_ERROR.resolveFor(actor).isVisible();
    }

    public static TheErrorMessage isVisible(){
        return new TheErrorMessage();
    }
}
