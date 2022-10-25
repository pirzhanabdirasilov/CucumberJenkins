package MethodFactory;




import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class AssetHelper {

    static MethodsHelpers helpers = new MethodsHelpers();

    public static void assertText(String expected, WebElement element){
        helpers.waitElementToBeDisplayed(element);
        Assert.assertEquals(expected,helpers.getText(element));
    }



}
