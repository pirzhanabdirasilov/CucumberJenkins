package PageWeb;

import MethodFactory.DropDownHelper;
import MethodFactory.MethodsHelpers;
import drivers.Driver;
import drivers.DriverInterface;
import drivers.DriverMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage  {

    protected WebDriver driver = Driver.getDriver();


    protected MethodsHelpers helpers = new MethodsHelpers();

    protected BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
