package runnerTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FeatureWithTags/Tags.feature", 
glue = { "stepDefinitions" },
tags= "@regression or @smoke",
plugin = {"pretty"}

)

public class TestRunner_RunWithTag {

}
