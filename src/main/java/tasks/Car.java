package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnBy;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.ClickAndHoldAction;

import static userinterface.CarManagement.*;
import static userinterface.StaysManagement.BUTTON_SEARCH;

public class Car implements Task {


    private final String location;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(CAR_RENTALS),
                Enter.theValue(location).into(INPUT_LOCATION).thenHit(Keys.ENTER),
                Click.on(LIST_LOCATION),
                Click.on(CALENDAR),
                Click.on(START_DAY),
                Click.on(BUTTON_SEARCH)
        );
    }


    public Car(String location) {
        this.location = location;
    }

    public static Car inPage(String location) {
        return Tasks.instrumented(Car.class, location);
    }
}