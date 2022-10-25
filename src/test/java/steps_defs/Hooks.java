package steps_defs;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import drivers.Driver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class Hooks {


    @Before
    public void setUp() {
        System.out.println("Before hook started");
    }


    @After
    public void tearDown(Scenario scenario) {

        try {
            if (scenario.isFailed()) {
                final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            }
        } catch (Exception e) {
            System.out.println("The error happened while cleaning up after the test: " +
                    e.getMessage());
        }

        Driver.closeDriver();
        System.out.println("After hook driver is closed");
    }
}