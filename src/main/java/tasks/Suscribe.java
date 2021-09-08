package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static userinterface.MailManagement.BUTTON_MAIL;
import static userinterface.MailManagement.INPUT_MAIL;

public class Suscribe implements Task {

    private final String mail;


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(mail).into(INPUT_MAIL),
                WaitUntil.the(BUTTON_MAIL, isClickable()).forNoMoreThan(3).seconds(),
                Click.on(BUTTON_MAIL).afterWaitingUntilEnabled()
        );
    }

    public Suscribe(String mail) {
        this.mail = mail;
    }

    public static Suscribe inPage(String mail) {
        return Tasks.instrumented(Suscribe.class, mail);
    }
}