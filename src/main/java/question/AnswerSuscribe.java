package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterface.MailManagement.VERIFICATION_TEXT;

public class AnswerSuscribe implements Question<Boolean> {


    public static AnswerSuscribe toThe() {
        return new AnswerSuscribe();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return VERIFICATION_TEXT.resolveFor(actor).isPresent();
    }
}