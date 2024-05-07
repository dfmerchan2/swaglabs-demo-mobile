package co.com.swaglabs.tasks;

import co.com.swaglabs.interactions.mobile.ScrollToElement;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.swaglabs.userinterfaces.ProductsPage.*;
import static co.com.swaglabs.utilities.enums.ValueScroll.LARGE_SCROLL;
import static co.com.swaglabs.utilities.enums.ValueScroll.MEDIUM_SCROLL;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

@AllArgsConstructor
public class AddProduct implements Task {

    private final List<String> listProducts;

    @Override
    public <T extends Actor> void performAs(T actor) {
        listProducts.forEach(
                product ->
                        actor.attemptsTo(
                        ScrollToElement.with(LBL_PRODUCT.of(product), MEDIUM_SCROLL.getSize()),
                        Click.on(LBL_PRODUCT.of(product)),
                        ScrollToElement.with(BTN_ADD_TO_CART, LARGE_SCROLL.getSize()),
                        Click.on(BTN_ADD_TO_CART),
                        Click.on(BTN_BACK_PRODUCTS)
                )
        );
        actor.attemptsTo(
                WaitUntil.the(BTN_CART, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(BTN_CART));
    }

    public static Performable toTheCart(List<String> listProducts) {
        return instrumented(AddProduct.class, listProducts);
    }
}
