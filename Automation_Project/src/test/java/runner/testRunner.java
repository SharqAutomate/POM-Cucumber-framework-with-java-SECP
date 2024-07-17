package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue={"stepDefinitions"},
        monochrome = true,
        plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json"}
)

public class testRunner {

}
