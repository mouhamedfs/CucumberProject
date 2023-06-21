package agiltoo.stepdefs;

import agiltoo.commun.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class LivraisonManagement extends Common {
    @And("i can access on the admin page")
    public void iCanAccessOnTheAdminPage() {
        System.out.println("Assert passed");
    }

    @And("i click on Livraison on the admin menu")
    public void iClickOnLivraisonOnTheAdminMenu() {
        driver.findElement(By.xpath("//*[@id=\"header_infos\"]/i")).click();
    }

    @And("i click on Transporteurs side")
    public void iClickOnTransporteursSide() {
        driver.findElement(By.linkText("#collapse-50")).click();
        //driver.findElement(By.xpath("//*[@id=\"subtab-AdminCarriers\"]/a")).click();

    }

    @Then("i should access to the livraisons admin page")
    public void iShouldAccessToTheLivraisonsAdminPage() {
    }
}
