package agiltoo.stepdefs;

import agiltoo.commun.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.time.Duration;

public class LivraisonManagement extends Common {

    @Given("I can access to the admin")
    public void iCanAccessToTheAdmin() {
        driver.get(adminUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @When("i click on Livraison on the admin menu")
    public void iClickOnLivraisonOnTheAdminMenu() {
        driver.findElement(By.id("subtab-AdminParentShipping")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("i click on Transporteurs side")
    public void iClickOnTransporteursSide() {
        driver.findElement(By.id("subtab-AdminCarriers")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("i should access to the livraisons admin page")
    public void iShouldAccessToTheLivraisonsAdminPage() {
    }
}