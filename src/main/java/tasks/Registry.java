package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import utils.Random;

import java.util.List;

import static userinterface.RegistryManagement.*;

public class Registry implements Task {

    private final List<String> list;
    private final String DOMAIN = "@gmail.com";


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(REGISTER),
                Enter.theValue(list.get(2) + Random.generate() + DOMAIN).into(USERNAME_INPUT),
                Click.on(BUTTON_CONTINUE),
                Enter.theValue(list.get(3)).into(PASSWORD_INPUT),
                Enter.theValue(list.get(3)).into(CONFIRMED_INPUT),
                Click.on(CREATE_ACCOUNT)
        );
    }

    public Registry(List list) {
        this.list = list;
    }

    public static Registry inPage(List list) {
        return Tasks.instrumented(Registry.class, list);
    }
}