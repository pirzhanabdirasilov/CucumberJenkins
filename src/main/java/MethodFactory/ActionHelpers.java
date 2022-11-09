package MethodFactory;



import drivers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActionHelpers {

    private final Actions action = new Actions(Driver.getDriver());

    public ActionHelpers waitElementToBeClickable(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }
    public ActionHelpers waitElementToBeDisplayed(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }
    public ActionHelpers contextClick(WebElement element){
        waitElementToBeDisplayed(element);
        waitElementToBeClickable(element);
        action.contextClick(element);
        return this;
    }

    public ActionHelpers moveToElement(WebElement element){
        action.moveToElement(element);
        return this;
    }
}
