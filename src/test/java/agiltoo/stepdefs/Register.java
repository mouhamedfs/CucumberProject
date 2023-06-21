package agiltoo.stepdefs;

import agiltoo.commun.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class Register extends Common {
    @Given("I can access to the login page on Connexion")
    public void iCanAccessToTheLoginPageOnConnexion() {
        driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a/span")).click();
    }
    @And("i click on link to register")
    public void iClickOnLinkToRegister() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
        driver.findElement(By.name("id_gender")).click();
        try {
            Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @When("Fill in the fields of the form")
    public void fill_in_the_fields_of_the_form() throws InterruptedException {
        System.out.println("fill the form");
        driver.findElement(By.xpath("//*[@id=\"field-id_gender-2\"]")).click();
        driver.findElement(By.id("field-firstname")).sendKeys("Demba");
        driver.findElement(By.id("field-lastname")).sendKeys("DIALLO");
        driver.findElement(By.id("field-email")).sendKeys("demba@agiltoo.fr");
        driver.findElement(By.id("field-password")).sendKeys("@Agiltoo@2023");
        driver.findElement(By.name("psgdpr")).click();
        driver.findElement(By.name("customer_privacy")).click();
    }

    @And("Click on register button")
    public void click_on_register_button() {
        System.out.println("click on register button");
        driver.findElement(By.xpath("//*[@id=\"customer-form\"]/footer/button")).click();
    }

    @Then("Redirect  to the home page")
    public void redirect_to_the_home_page() throws InterruptedException {
        System.out.println("navigate to the home page");
        driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a[2]/span")).isDisplayed();
    }
}