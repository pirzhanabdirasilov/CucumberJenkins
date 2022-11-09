package PageWeb.imovingPage;

import PageWeb.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Scenario4 extends BasePage {

    @FindBy(xpath = "(//a[@class='btn tab-header collapsed'])[4]")
    private WebElement inventoryBoxes;

    @FindBy(xpath = "(//span[@class='detail-name'])[4]")
    private WebElement inventoryBoxesText;


}
