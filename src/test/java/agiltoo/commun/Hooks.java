package agiltoo.commun;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends Common {

    @Before
    public static  void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\monsh\\IdeaProjects\\TestAgiltoo\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterAll
    public static void quits() throws Exception {
        driver.quit();
    }
}