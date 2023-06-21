package agiltoo.runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags="@DeliverySide",
        glue = { "agiltoo.commun", "agiltoo.stepdefs","agiltoo.runner"},
        features = "src/test/java/agiltoo/cucumberfeature")
public class RunnerTests extends AbstractTestNGCucumberTests {
}