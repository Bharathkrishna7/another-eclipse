package runnerTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/MxPlayer.feature", glue = { "com.PomStepDefinitions" },

		monochrome = true, plugin = { "pretty", "html:target/HtmlReports/Mxplayer.html" }

)

public class TestRunner {


}