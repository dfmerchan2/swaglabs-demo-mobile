package co.com.swaglabs.tasks;

import co.com.swaglabs.model.User;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.swaglabs.userinterfaces.CheckoutStepOnePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class CheckoutStepOne implements Task {

    private final User user;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user.getFirstName()).into(TXT_FIRST_NAME),
                Enter.theValue(user.getLastName()).into(TXT_LAST_NAME),
                Enter.theValue(user.getCodePostal()).into(TXT_POSTAL_CODE),
                Click.on(BTN_CONTINUE)
        );
    }

    public static Performable ofTheProducts(User user) {
        return instrumented(CheckoutStepOne.class, user);
    }
}
