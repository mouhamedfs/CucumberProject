package agiltoo.stepdefs;

import agiltoo.commun.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static agiltoo.commun.Hooks.setup;

public class LoginPage extends Common {
    @Given("I can access to the login page")
    public static  void iCanAccessToTheHomePage() throws InterruptedException {
        driver.get(clientURL);
    }

    @And("I click on Connexion")
    public void iClickOnConnexion()  {
        driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a/span")).click();
    }
    @When("I enter a login as {string} and password as {string}")
    public void iEnterALoginAsAndPasswordAs(String username, String password) {
        driver.findElement(By.id("field-email")).sendKeys(username);
        driver.findElement(By.id("field-password")).sendKeys(password);
        System.out.println(password);
        driver.findElement(By.id("submit-login")).click();
    }
    @Then("I can be successfully logged in with the name of the user")
    public void iCanBeSuccessfullyLoggedInWithTheNameOfTheUser() {
        String title = driver.getTitle();
        System.out.println(title);
    }
}
