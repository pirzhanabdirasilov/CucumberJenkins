package PageWeb.imovingPage;

import MethodFactory.AssetHelper;
import PageWeb.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Scenario1 extends BasePage {

    @FindBy(xpath = "(//span[@class='detail-name'])[1]")
    private WebElement textJourney;

    @FindBy(xpath = "//*[@id='tab1']/div/div[2]/button/text[1]")
    private WebElement showMapText;

    @FindBy(xpath = "//button[@class='btn mapBtn']")
    private WebElement clickShowButton;

    @FindBy(xpath = "(//a[@class='btn tab-header collapsed'])[1]")
    private WebElement clickJourneyButton;

    @FindBy(xpath = "(//a[@class='btn tab-header'])[1]")
    private WebElement backClickJourneyButton;

    public Scenario1 clickJourney(){
        AssetHelper.assertText("Moving Journey - 0 Miles",textJourney);
        helpers.jsClick(clickJourneyButton)
                .pause(2);
        return this;
    }


    public Scenario1 clickShow(){
        try {
            helpers.pause(2).arrowDown(5);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals("Show on map", showMapText.getText());
        helpers.click(clickShowButton);
        return this;
    }

    public Scenario1 mapShow(){
        helpers.pause(2).jsClick(backClickJourneyButton);
        return this;
    }
}
