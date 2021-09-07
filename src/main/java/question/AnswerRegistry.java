package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterface.RegistryManagement.ARE_YOU_A_ROBOT;

public class AnswerRegistry implements Question<Boolean> {

    public static AnswerRegistry toThe() {
        return new AnswerRegistry();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return ARE_YOU_A_ROBOT.resolveFor(actor).isPresent();

    }
}