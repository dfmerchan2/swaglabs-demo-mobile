package co.com.swaglabs.stepdefinitions;

import co.com.swaglabs.questions.TheErrorMessage;
import co.com.swaglabs.questions.ThePageTitle;
import co.com.swaglabs.tasks.Login;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class loginStepDefinition {

    @When("{string} enter the username {string} and password {string}")
    public void enterUsernameAndPassword(String actor, String user, String password) {
        theActorCalled(actor).attemptsTo(
                Login.inSwagLabs(user, password)
        );
    }

    @Then("should see the title of {string}")
    public void shouldSeeTheTitleOf(String title) {
        theActorInTheSpotlight()
                .should(
                        seeThat(
                                ThePageTitle.is(), equalToIgnoringCase(title))
                );
    }

    @Then("should see the error message")
    public void shouldSeeTheErrorMessage() {
        theActorInTheSpotlight()
                .should(
                        seeThat(
                                TheErrorMessage.isVisible())
                );
    }
}
