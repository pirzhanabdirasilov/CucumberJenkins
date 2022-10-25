package PageWeb;

import MethodFactory.AssetHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Test1IMoving extends BasePage{

    @FindBy(xpath = "//h1[@class='main-title hp-title']")
    private WebElement findMoversText;

    public Test1IMoving assertFindMovers(String str){
        AssetHelper.assertText(str,findMoversText);
        return this;
    }
}
