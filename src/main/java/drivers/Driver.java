package drivers;

import data.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.time.Duration;

public class Driver {

    // Singleton pattern
    private Driver() {
    }

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getProperty("browser").toLowerCase()) {
                default:
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "firefox":
                    driver = FirefoxWebDriver.loadFirefoxDriver();
                    break;
                case "safari":
                        driver = MacOs.runMacOs();
                        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
                    break;
                case "edge":
                    driver = EdgeWebDriver.loadEdgeDriver();
                    break;
            }
        }
        return driver;
    }

    public static void closeDriver() {
        try {
            if (driver != null) {
                driver.close();
                driver.quit();
                driver = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Closing Driver");
    }
}