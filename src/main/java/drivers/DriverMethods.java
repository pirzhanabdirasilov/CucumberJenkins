package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriverMethods {
    private final WebDriver driver;

    public DriverMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void openToUrl(String url){
        driver.navigate().to(url);
    }

    public void switchTo(WebElement element){
        driver.switchTo().frame(element);
    }
}
