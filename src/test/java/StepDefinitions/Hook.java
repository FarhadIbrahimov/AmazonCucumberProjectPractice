package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utils.Driver;

import java.util.concurrent.TimeUnit;
// hook have to be side step definition
public class Hook {

    WebDriver driver;

    @Before
    public void setUpDriver(){
        driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @After
    public void tearDown(Scenario scenario) throws InterruptedException {
        Thread.sleep(3000);
        Driver.closeDriver();
        if(scenario.isFailed()){
            System.out.println("Test Failed");
        }
    }
}