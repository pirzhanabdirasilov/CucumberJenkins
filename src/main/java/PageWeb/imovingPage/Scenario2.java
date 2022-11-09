package PageWeb.imovingPage;

import MethodFactory.AssetHelper;
import PageWeb.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Scenario2 extends BasePage {

    @FindBy(xpath = "(//span[@class='detail-name'])[2]")
    private WebElement textAddressRestrictions;

    @FindBy(xpath = "(//a[@class='btn tab-header collapsed'])[2]")
    private WebElement addressRestrictionsButton;

    @FindBy(xpath = "(//table[@class='table confirm-table']//thead//th)[1]")
    private WebElement xpath;

    @FindBy(xpath = "//*[@id='tab2']/div/div/div/table/thead/tr/th[1]")
    private WebElement textList;
    @FindBy(xpath = "//a[@class='btn tab-header']")
    private WebElement backClickAddress;
    public Scenario2 navigateToRestrictions(){
        AssetHelper.assertText("Addresses Restrictions",textAddressRestrictions);
        actions.moveToElement(addressRestrictionsButton);
        helpers.jsClick(addressRestrictionsButton);
        return this;
    }

    public Scenario2 clickAddressRestrictionsButton() throws Exception {
        helpers.jsClick(addressRestrictionsButton).pause(1).arrowDown(5);
        AssetHelper.assertText("Destination",textList);
        helpers.jsClick(backClickAddress);
        return this;
    }
}
