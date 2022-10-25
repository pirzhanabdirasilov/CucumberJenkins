package drivers;

import org.openqa.selenium.WebDriver;

public class DriverMethods {
    private final WebDriver driver;

    public DriverMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void openToUrl(String url){
        driver.navigate().to(url);
    }
}
