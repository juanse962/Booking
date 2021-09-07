package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterface.CarManagement.LOCATION;

public class AnswerLocation implements Question<Boolean> {


    public static AnswerLocation toThe() {
        return new AnswerLocation();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return LOCATION.resolveFor(actor).isPresent();

    }
}