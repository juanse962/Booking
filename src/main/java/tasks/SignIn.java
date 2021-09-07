package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterface.SignInManagement.*;

public class SignIn implements Task {

    private final String user;
    private final String password;


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(SIGN_IN),
                Enter.theValue(user).into(INPUT_USERNAME),
                Click.on(CONTINUE_BUTTON),
                Enter.theValue(password).into(INPUT_PASSWORD),
                Click.on(SIGN_IN_BUTTON)
        );
    }

    public SignIn(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public static SignIn inPage(String user, String password) {
        return Tasks.instrumented(SignIn.class, user, password);
    }
}