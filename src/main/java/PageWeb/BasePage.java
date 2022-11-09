package PageWeb;


import MethodFactory.ActionHelpers;
import MethodFactory.MethodsHelpers;
import drivers.Driver;

import drivers.DriverMethods;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage  {

    protected WebDriver driver = Driver.getDriver();


    protected MethodsHelpers helpers = new MethodsHelpers();
    protected ActionHelpers actionHelpers = new ActionHelpers();

    protected BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    protected SoftAssertions softAssert = new SoftAssertions();

    protected Actions actions = new Actions(Driver.getDriver());

    protected DriverMethods driverMethods = new DriverMethods(Driver.getDriver());

    public void softAssert(WebElement element,String str){
        softAssert.assertThat(str).isEqualTo(element.getText());
        softAssert.assertAll();
    }
    public void switchFrame(WebElement element){
        driverMethods.switchTo(element);
    }


}
