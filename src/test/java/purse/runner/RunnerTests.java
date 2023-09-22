package purse.runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags="",
        glue = {"purse.api","purse.common","purse.stepdefs","purse.runner"},
        features = "src/test/java/purse/cucumberfeature")
public class RunnerTests extends AbstractTestNGCucumberTests {
}