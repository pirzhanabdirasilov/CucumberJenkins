package PageWeb.imovingPage;

import MethodFactory.AssetHelper;
import MethodFactory.DropDownHelper;
import PageWeb.BasePage;
import drivers.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.LinkedList;
import java.util.List;

public class Test1IMoving extends BasePage {

    //--------------------------------------ParentPage----------------------------------------------//
    @FindBy(xpath = "//h1[@class='main-title hp-title']")
    private WebElement findMoversText;

    @FindBy(xpath = "//select[@id='houseTypeSelectList']")
    private WebElement selectMoving;

    @FindBy(xpath = "//select[@id='hp-nav-select-house']")
    private WebElement selectMove;

    @FindBy(xpath = "//*[@id='roomsForm']/div[3]/button")
    private WebElement compareButton;


    //---------------------------------------InventoryPage-------------------------------------------//
    @FindBy(xpath = "//span[@class='arrow arrow-next']")
    private WebElement continueButton;

    @FindBy(xpath = "//*[@id='closeTutorial']")
    private WebElement okButton;

    @FindBy(xpath = "//a[@class='btn btn-blue']")
    private WebElement gotItButton;

    @FindBy(xpath = "(.//a[@class='btn btn-blue'])[1]")
    private WebElement sofaButton;

    @FindBy(xpath = "//div[@class='col-sm-3 nextGlaphicon rightArrowNavi']")
    private WebElement nextButton;

    @FindBy(xpath = "(//a[@class='btn btn-blue'])[1]")
    private WebElement chairButton;

    @FindBy(xpath = "(//a[@class='btn btn-blue'])[17]")
    private WebElement washerButton;

    @FindBy(xpath = "(//a[@class='btn btn-blue'])[19]")
    private WebElement bookcaseButton;

    @FindBy(xpath = "(//a[@class='btn btn-blue'])[3]")
    private WebElement AddAndContinue;

    //----------------------------==Team==--------------------------//
    @FindBy(xpath = "(//span[@class='room-counter'])[1]")
    private WebElement livingRoomTeam1;

    @FindBy(xpath = "(//span[@class='room-counter'])[2]")
    private WebElement diningRoomTeam;

    @FindBy(xpath = "(//span[@class='room-counter'])[3]")
    private WebElement kitchenTeam;

    @FindBy(xpath = "(//span[@class='room-counter'])[4]")
    private WebElement bedroomTeam;

    //----------------------------CongratsPage-----------------------------------//

    @FindBy(xpath = "(//input[@name='addressInput'])[1]")
    private WebElement pickUpElement;

    @FindBy(xpath = "(//button[@class='btn btn-green save-instructions'])[1]")
    private WebElement approveButton1;

    @FindBy(xpath = "(//input[@type='text'])[13]")
    private WebElement dropOffInput;

    @FindBy(xpath = "(//button[@class='btn btn-green save-instructions'])[3]")
    private WebElement approveButton2;

    @FindBy(xpath = "(//button[@class='btn btn-blue confirm'])")
    private WebElement confirmButton;

    @FindBy(xpath = "(//button[@type='submit'])[7]")
    private WebElement chooseMoversButton;

    @FindBy(xpath = "(//button[@class='btn btn-blue'])[41]")
    private WebElement bookNowButton;


    //-------------------------------ConfirmPage-----------------------//
    @FindBy(xpath = "(//p[@class='drop-text'])[2]")
    private WebElement textPickUp;

    @FindBy(xpath = "//button[@id='2259BC77-3A9E-4014-BE3B-C4333894094D']")
    private WebElement mapText;

    @FindBy(xpath = "//iframe[@tabindex='-1']")
    private WebElement frameMap;

    public Test1IMoving assertFindMovers(String str) {
        AssetHelper.assertText(str, findMoversText);
        return this;
    }

    public Test1IMoving selectChoose(int movingChoose, int moveSize) {
        DropDownHelper.selectUsingIndex(selectMoving, movingChoose);
        DropDownHelper.selectUsingIndex(selectMove, moveSize);
        helpers.jsClick(compareButton);
        return this;
    }

    public Test1IMoving pathContinue() {
        helpers.click(continueButton)
                .click(gotItButton).click(okButton).pause(2).jsClick(sofaButton)
                .pause(2).jsClick(nextButton).pause(2).jsClick(chairButton)
                .pause(2).jsClick(nextButton).pause(2).jsClick(washerButton)
                .pause(2).jsClick(nextButton).pause(2).jsClick(bookcaseButton)
                .pause(2).pause(2).jsClick(nextButton).pause(4);
        softAssert.assertThat("1 items").isEqualTo(livingRoomTeam1.getText());
        softAssert.assertThat("1 items").isEqualTo(diningRoomTeam.getText());
        softAssert.assertThat("1 items").isEqualTo(kitchenTeam.getText());
        softAssert.assertThat("1 items").isEqualTo(bedroomTeam.getText());
        softAssert.assertAll();

        helpers.jsClick(AddAndContinue);
        return this;
    }

    private final String TEXT_ADDRESS = "Trump Tower, North Wabash Avenue, Chicago, IL 60611";

    public Test1IMoving inputPickUpAddress() {
        helpers.pause(2).sendKeys(pickUpElement, TEXT_ADDRESS);
                helpers.multipleClick(2, pickUpElement);
        pickUpElement.sendKeys(Keys.ARROW_DOWN);
        pickUpElement.sendKeys(Keys.ENTER);
        helpers.jsClick(approveButton1).pause(2);
        return this;
    }


    public Test1IMoving inputDropOffAddress(){
        helpers.pause(2).sendKeys(dropOffInput, TEXT_ADDRESS);
               helpers.multipleClick(1,dropOffInput);
        dropOffInput.sendKeys(Keys.ARROW_DOWN);
        dropOffInput.sendKeys(Keys.ENTER);
        helpers.jsClick(approveButton2).pause(2)
                .jsClick(chooseMoversButton);
        return this;
    }

    public Test1IMoving buttonChooseMovers() {
        helpers.jsClick(approveButton1).jsClick(approveButton2);
        helpers.jsClick(chooseMoversButton);
        return this;
    }
    public Test1IMoving bookNowClick(){
        try {
            helpers.arrowDown(50);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        helpers.pause(2).jsClick(bookNowButton).pause(2);
        return this;
    }


//-------------------------------------Scenario1--------------------------------------//


//----------------------------------------Scenario2---------------------------------------//



    //----------------------------------Scenario3-------------------------------//

































}
