package stepdefenitions;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import question.AnswerTravel;
import tasks.OpenTask;
import tasks.Stays;


public class StepDefinitionStays {

    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("the user wishes to create an account on the website")
    public void the_user_wishes_to_create_an_account_on_the_website() {
        OnStage.theActor("User").wasAbleTo(OpenTask.theHomePage());
    }

    @When("the users are searching for places in {string}")
    public void thu_users_are_searching_for_places_in(String travel) {
        OnStage.theActorInTheSpotlight().attemptsTo(Stays.inPage(travel));
    }
    @Then("The user visualizes {string} in search")
    public void the_user_visualizes_in_search(String question) {
       OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerTravel.toThe(question)));

    }

}
