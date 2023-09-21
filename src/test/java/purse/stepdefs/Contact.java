package purse.stepdefs;

import purse.commun.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.time.Duration;

public class Contact extends Common {

    @Given("I can access to the admin")
    public void iCanAccessToTheAdmin() {
        driver.get(clientURL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("I enter {string} and {string} and {string} and {string} and {string} and {string} and {string}")
    public void iEnterAndAndAndAndAndAnd(String gender, String firstname, String lastname, String socity, String phone, String title, String message) {
        driver.findElement(By.id("gender")).sendKeys(gender);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("first-name")).sendKeys(firstname);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("last-name")).sendKeys(lastname);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("company")).sendKeys(socity);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("phone")).sendKeys(phone);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("message-title")).sendKeys(title);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("message")).sendKeys(message);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("I click on send button")
    public void iClickOnSendButton() {
        driver.findElement(By.id("submit-button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("I see the message")
    public void iSeeTheMessage() {
        driver.findElement(By.id("popin-message"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
}