package PageWeb;

import MethodFactory.AssetHelper;
import com.sun.org.apache.bcel.internal.generic.LOOKUPSWITCH;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@name='login']")
    private WebElement loginInput;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement loginUserName;

    @FindBy(xpath = "//input[@name='submit']")
    private WebElement buttonLogin;

    @FindBy(xpath = "(//div[@class='tl-onboarding-end-item tl-onboarding-end-item--hoverable'])[3]")
    private WebElement buttonAdmin;

    @FindBy(xpath = "(//a[@href='https://abdirasilov3422.talentlms.com/user/create'])[2]")
    private WebElement clickAdd;

    @FindBy(xpath = "//div[@class='tl-title tl-ellipsis']")
    private WebElement addUserTExt;


    public LoginPage inputLogin(String str){
        helpers.jsSendKeys(loginInput,str);
        return this;
    }

    public LoginPage inputPassword(String str){
        helpers.jsSendKeys(loginUserName,str);
        return this;
    } public LoginPage buttonLogin(){
        helpers.jsClick(buttonLogin)
                .jsClick(buttonAdmin);
        return this;
    }

    public LoginPage buttonAddNew(){
        helpers.jsClick(clickAdd);
        return this;
    }

    public LoginPage tittleAdd(String str){
        Assert.assertEquals(str,addUserTExt.getText().substring(15));
        return this;
    }


}
