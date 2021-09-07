package runnertest;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = {"stepdefenitions"},
        features = {"src/test/resources/features/stays.feature"},
        plugin = {"pretty", "html:target/cucumber", "json:target/RunerTestStays.json"},
        tags = "@smoke",
        snippets = SnippetType.UNDERSCORE
)
public class RunerTestStays {
}

