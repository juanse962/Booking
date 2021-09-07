package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

import static userinterface.DiscoverManagement.*;

public class Discover implements Task {

    private final String place;


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Ensure.that(EXPLORE_COLOMBIA).isDisplayed(),
                Ensure.that(RESORTS).textValues().contains("Resorts"),
                Click.on(DISCOVER_COLOMBIA.of(place)),
                Click.on(CHANGE_CURRENCY).afterWaitingUntilEnabled(),
                Click.on(CHANGE_USD),
                Click.on(START_DATE)
        );
    }

    public Discover(String place) {
        this.place = place;
    }

    public static Discover inPage(String place) {
        return Tasks.instrumented(Discover.class, place);
    }
}