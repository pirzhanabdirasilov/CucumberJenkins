package PageWeb;

import MethodFactory.DropDownHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IMovingPage extends BasePage{

    @FindBy(xpath = "//select[@id='houseTypeSelectList']")
    private WebElement selectHouse;

    @FindBy(xpath = "//select[@id='hp-nav-select-house']")
    private WebElement selectBedroom;

    @FindBy(xpath = "(//button[@class='btn btn-white quickQuoteLink'])[1]")
    private WebElement compare;

    @FindBy(xpath = "(//span[@class='quantity-plus'])[1]")
    private WebElement use5;

    public IMovingPage house(int selectImoving,int selectMOveSiz){
        DropDownHelper.selectUsingIndex(selectHouse,selectImoving);
        DropDownHelper.selectUsingIndex(selectBedroom,selectMOveSiz);
        helpers.click(compare);
        return this;
    }

    public IMovingPage click5(int in){
        helpers.multipleClick(in,use5);
        return this;
    }


}
