package stepdefenitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import question.AnswerLogin;
import question.AnswerRegistry;
import tasks.Registry;
import tasks.SignIn;


public class StepDefinitionLogin {

    @When("The user logs in with a {string} and {string}.")
    public void the_user_logs_in_with_a_and(String user, String pass) {
        OnStage.theActorInTheSpotlight().attemptsTo(SignIn.inPage(user, pass));
    }
    @Then("User visualizes successful login")
    public void user_visualizes_successful_login() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerLogin.toThe()));

    }
}
