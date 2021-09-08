package runnertest;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = {"stepdefenitions"},
        features = {"src/test/resources/features/suscribe.feature"},
        plugin = {"pretty", "html:target/cucumber", "json:target/RunerTestSuscribe.json"},
        tags = "@smoke",
        snippets = SnippetType.UNDERSCORE
)
public class RunerTestSuscribe {
}

