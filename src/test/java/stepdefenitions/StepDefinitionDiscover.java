package stepdefenitions;


import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.Discover;


public class StepDefinitionDiscover {

    @When("the users are searching for places in Colombia {string}")
    public void the_users_are_searching_for_places_in_colombia(String place) {
        OnStage.theActorInTheSpotlight().attemptsTo(Discover.inPage(place));
    }

}
