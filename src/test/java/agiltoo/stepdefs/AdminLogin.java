package agiltoo.stepdefs;

import agiltoo.commun.Common;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class AdminLogin extends Common {
    @Given("I can access to the admin page connexion")
    public void iCanAccessToTheAdminPageConnexion() {
        driver.get(adminUrl);
    }

    @When("I enter login as {string} and password as {string}")
    public void iEnterLoginAsAndPasswordAs(String username, String password) {
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("passwd")).sendKeys(password);
        System.out.println(password);
        driver.findElement(By.id("submit_login")).click();
    }

    @Then("I can be successfully to the admin page dashboard")
    public void iCanBeSuccessfullyToTheAdminPageDashboard() {
        String title = driver.getTitle();
        System.out.println(title);
    }
}
