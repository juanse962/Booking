package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterface.StaysManagement.*;

public class Stays implements Task {

    private final String travel;


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(travel).into(TRAVEL_INPUT),
                Click.on(CALENDAR),
                Click.on(START_CALENDAR),
                Click.on(FINISH_CALENDAR),
                Click.on(BUTTON_SEARCH)
        );
    }

    public Stays(String travel) {
        this.travel = travel;
    }

    public static Stays inPage(String travel) {
        return Tasks.instrumented(Stays.class, travel);
    }
}