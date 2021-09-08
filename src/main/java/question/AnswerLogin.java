package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterface.RegistryManagement.ARE_YOU_A_ROBOT;
import static userinterface.SignInManagement.WELCOME;

public class AnswerLogin implements Question<Boolean> {


    public static AnswerLogin toThe() {
        return new AnswerLogin();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return WELCOME.resolveFor(actor).isPresent() || ARE_YOU_A_ROBOT.resolveFor(actor).isPresent();

    }
}