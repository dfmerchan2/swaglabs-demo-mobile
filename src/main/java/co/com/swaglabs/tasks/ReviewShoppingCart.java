package co.com.swaglabs.tasks;

import co.com.swaglabs.interactions.mobile.ScrollToElement;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.swaglabs.userinterfaces.CartShoppingPage.*;
import static co.com.swaglabs.utilities.enums.ValueScroll.LARGE_SCROLL;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

@AllArgsConstructor
public class ReviewShoppingCart implements Task {

    private final List<String> listProducts;

    @Override
    public <T extends Actor> void performAs(T actor) {
        listProducts.forEach(
                product -> actor.attemptsTo(
                        WaitUntil.the(LBL_YOUR_CART, isEnabled()).forNoMoreThan(10).seconds(),
                        Ensure.that(LBL_NAME_PRODUCT.of(product)).isDisplayed()
                )
        );

        actor.attemptsTo(
                ScrollToElement.with(BTN_CHECKOUT, LARGE_SCROLL.getSize()),
                Click.on(BTN_CHECKOUT)
        );
    }

    public static Performable withAddedProducts(List<String> listProducts) {
        return instrumented(ReviewShoppingCart.class, listProducts);
    }
}
