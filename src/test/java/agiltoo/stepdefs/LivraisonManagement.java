package agiltoo.stepdefs;

import agiltoo.commun.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LivraisonManagement extends Common {
    @And("i can access on the admin page")
    public void iCanAccessOnTheAdminPage() {
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Tableau de bord";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        System.out.println("Assert passed");
    }

    @When("i click on Livraison on the admin menu")
    public void iClickOnLivraisonOnTheAdminMenu() {
        driver.findElement(By.xpath("//*[@id=\"header_infos\"]/i")).click();
    }

    @And("i click on Transporteurs side")
    public void iClickOnTransporteursSide() {
        driver.findElement(By.xpath("//*[@id=\"subtab-AdminParentShipping\\\"]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"subtab-AdminCarriers\"]/a")).click();

    }

    @Then("i should access to the livraisons admin page")
    public void iShouldAccessToTheLivraisonsAdminPage() {
        try {
            Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
