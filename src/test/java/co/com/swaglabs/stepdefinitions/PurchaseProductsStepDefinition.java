package co.com.swaglabs.stepdefinitions;

import co.com.swaglabs.tasks.CheckoutStepOne;
import co.com.swaglabs.tasks.AddProduct;
import co.com.swaglabs.tasks.CheckoutStepTwo;
import co.com.swaglabs.tasks.ReviewShoppingCart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.List;

import static co.com.swaglabs.model.builder.UserBuilder.getDataUser;
import static co.com.swaglabs.userinterfaces.CheckoutCompletePage.LBL_CHECKOUT_COMPLETE;
import static co.com.swaglabs.utilities.enums.ActorNotepad.LIST_PRODUCTS;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PurchaseProductsStepDefinition {
    @Given("add the following products to the cart")
    public void addTheFollowingProductsToTheCart(List<String> products) {
        theActorInTheSpotlight().remember(LIST_PRODUCTS.getKey(), products);
        theActorInTheSpotlight().attemptsTo(
                AddProduct.toTheCart(products)
        );
    }

    @When("see the products added to the shopping cart")
    public void seeTheProductsAddedToTheShoppingCart() {
        List<String> listProducts = theActorInTheSpotlight().recall(LIST_PRODUCTS.getKey());

        theActorInTheSpotlight().attemptsTo(
                ReviewShoppingCart.withAddedProducts(listProducts)
        );
    }

    @And("you enter personal information")
    public void youEnterPersonalInformation() {
        List<String> listProducts = theActorInTheSpotlight().recall(LIST_PRODUCTS.getKey());

        theActorInTheSpotlight().attemptsTo(
                CheckoutStepOne.ofTheProducts(getDataUser()),
                CheckoutStepTwo.ofTheProducts(listProducts)
        );
    }

    @Then("look at the invoice to finalize the order")
    public void lookAtTheInvoiceToFinalizeTheOrder() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(LBL_CHECKOUT_COMPLETE).isDisplayed()
        );
    }
}
