package MethodFactory;


import drivers.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MethodsHelpers {


    public MethodsHelpers waitElementToBeClickable(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public MethodsHelpers waitElementToBeDisplayed(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }

    public MethodsHelpers click(WebElement element){
        waitElementToBeDisplayed(element);
        waitElementToBeClickable(element);
        element.click();
        return this;
    }

    public MethodsHelpers sendKeys(WebElement element, String str){
        waitElementToBeDisplayed(element);
        element.sendKeys(str);
        return this;
    }
    public MethodsHelpers sendKeys(WebElement element, String str, Keys keys){
        waitElementToBeDisplayed(element);
        element.sendKeys(str,keys);
        return this;
    }

    public MethodsHelpers clear(WebElement element){
        waitElementToBeDisplayed(element);
        element.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        element.sendKeys(Keys.BACK_SPACE);
        return this;
    }

    public String getText(WebElement element){
        return element.getText();
    }

    public MethodsHelpers sleep(long num) {
        try {
            Thread.sleep(num);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    public MethodsHelpers pause(int sewconds){
        try {
            TimeUnit.SECONDS.sleep(sewconds);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return this;
    }

    public MethodsHelpers javascriptScrollDownThePage(){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,800");
        return this;
    }

    public MethodsHelpers javascriptScrollUpThePage(int in){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy("+in + ",0");
        return this;
    }
//    public MethodsHelpers pageDown(int num)throws  Exception {
//        Robot robot = new Robot();
//        for (int i = 0; i < num; i++) {
//            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
//        }
//        return this;
//    }

    public void arrowDown(int num)throws  Exception {
        Robot robot = new Robot();
        for (int i = 0; i < num; i++) {
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
        }
    }
    public MethodsHelpers jsClick(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();",element);
        return this;
    }

    public MethodsHelpers jsSendKeys(WebElement element,String value){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].value='" + value + "';",element);
        return this;
    }

    public MethodsHelpers loops(int num) throws Exception {
        Robot robot = new Robot();
        for (int i = 0; i < num; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        }
        return this;
    }

    public MethodsHelpers multipleClick(int howMAny,WebElement element){
        waitElementToBeDisplayed(element).waitElementToBeClickable(element);
        for (int i = 0; i < howMAny; i++) {
            waitElementToBeDisplayed(element);
            waitElementToBeClickable(element);
            pause(1);
            click(element);
        }
        return this;
    }


    public MethodsHelpers keysButton(WebElement element,Keys keys,int in){
        for (int i = 0; i < in; i++) {
            element.click();
        }
        element.sendKeys(keys);
        return this;
    }


//    public Helper downButton() throws AWTException {
//        Robot robot = new Robot();
//
//        for (int i = 0; i < randomNumber(); i++) {
//            int down;
//            down = Keys.DOWN;
//        }
//        Keys enter = Keys.ENTER;
//        return this;
//    }



}
