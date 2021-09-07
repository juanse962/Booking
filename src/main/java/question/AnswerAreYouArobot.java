package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterface.SignInManagement.ARE_YOU_A_ROBOT;
import static userinterface.StaysManagement.TEXT_SEARCH;

public class AnswerAreYouArobot implements Question<Boolean> {

    public static AnswerAreYouArobot toThe() {
        return new AnswerAreYouArobot();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return ARE_YOU_A_ROBOT.resolveFor(actor).isPresent();

    }
}