package co.com.swaglabs.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.swaglabs.userinterfaces.ProductsPage.LBL_PRODUCTS;

public class ThePageTitle implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return LBL_PRODUCTS.resolveFor(actor).getText();
    }

    public static ThePageTitle is(){
        return new ThePageTitle();
    }
}
