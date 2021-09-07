package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterface.StaysManagement.TEXT_SEARCH;

public class AnswerTravel implements Question<Boolean> {
    private final String question;

    public AnswerTravel(String question) {
        this.question = question;
    }

    public static AnswerTravel toThe(String question) {
        return new AnswerTravel(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return TEXT_SEARCH.of(question).resolveFor(actor).isPresent();

    }
}