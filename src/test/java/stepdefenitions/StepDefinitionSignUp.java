package stepdefenitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import question.AnswerAreYouArobot;
import question.AnswerTravel;
import tasks.SignIn;


public class StepDefinitionSignUp {

    @When("The user enters his credentials")
    public void the_user_enters_his_credentials(io.cucumber.datatable.DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(SignIn.inPage(dataTable.asList()));

    }
    @Then("The user is successfully registered")
    public void the_user_is_successfully_registered() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerAreYouArobot.toThe()));

    }




}
