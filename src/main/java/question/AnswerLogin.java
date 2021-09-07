package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterface.SignInManagement.WELCOME;
import static userinterface.StaysManagement.TEXT_SEARCH;

public class AnswerLogin implements Question<Boolean> {


    public static AnswerLogin toThe() {
        return new AnswerLogin();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return WELCOME.resolveFor(actor).isPresent();

    }
}