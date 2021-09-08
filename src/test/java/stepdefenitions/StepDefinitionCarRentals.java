package stepdefenitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import question.AnswerLocation;
import tasks.Car;


public class StepDefinitionCarRentals {

    @When("The user is looking for car rental {string}")
    public void the_user_is_looking_for_car_rental(String location) {
        OnStage.theActorInTheSpotlight().attemptsTo(Car.inPage(location));
    }

    @Then("The user visualizes the search")
    public void the_user_visualizes_the_search() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerLocation.toThe()));
    }
}
