package MethodFactory;


import drivers.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AllertHelper {
    private WebDriver driver;

    public AllertHelper(WebDriver driver) {
        this.driver = driver;
    }

    public Alert getAlert(){
        return driver.switchTo().alert();
    }
    public void acceptAlert(){
        getAlert().accept();
    }

    public void dismissAlert(){
        getAlert().dismiss();
    }

    public void sendKEysAllert(String str){
        getAlert().sendKeys(str);
    }

    public boolean isAlertPresent(){
        try {
            driver.switchTo().alert().accept();
            return true;
        }catch (NoAlertPresentException e){
            return false;
        }
    }

    public void acceptPrompt(String txt){
        Alert alert = getAlert();
        alert.sendKeys(txt);
        alert.accept();
    }

    public boolean isAlertPresent1(){

        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver()
                    ,Duration.ofSeconds(6));
            wait.until(ExpectedConditions.alertIsPresent());
            return true;
        }catch (NoAlertPresentException e){
            return false;
        }
    }
}
