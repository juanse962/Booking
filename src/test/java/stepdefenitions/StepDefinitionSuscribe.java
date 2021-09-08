package stepdefenitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import question.AnswerSuscribe;
import tasks.Suscribe;


public class StepDefinitionSuscribe {

    @When("the user enters the email address {string}")
    public void the_user_enters_the_email_address(String mail) {
        OnStage.theActorInTheSpotlight().attemptsTo(Suscribe.inPage(mail));

    }
    @Then("User displays text on the screen")
    public void user_displays_text_on_the_screen() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerSuscribe.toThe()));

    }


}
