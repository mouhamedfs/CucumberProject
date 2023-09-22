package purse.commun;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks extends Common {

    @Before
    public static  void setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @After
    public static void quits() throws Exception {
        driver.quit();
    }
}
