package cucumberOptions;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="/Users/sinanyavas/Documents/Cucumber/src/test/java/features",
        glue = "StepDefinations"
)

public class TestRunner {



}
