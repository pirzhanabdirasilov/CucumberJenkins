package PageWeb;

import MethodFactory.AssetHelper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DataPage extends BasePage{

    @FindBy(xpath = "(//label[@class='control-label tl-mandatory-label'])[1]")
    private WebElement firstTxt;

    @FindBy(xpath = "(//label[@class='control-label tl-mandatory-label'])[2]")
    private WebElement lastTxt;

    @FindBy(xpath = "(//label[@class='control-label tl-mandatory-label'])[3]")
    private WebElement emailTxt;

    @FindBy(xpath = "(//label[@class='control-label tl-mandatory-label'])[4]")
    private WebElement userTxt;

    @FindBy(xpath = "(//label[@class='control-label'])[1]")
    private WebElement passwordTxt;

    @FindBy(xpath = "(//label[@class='control-label'])[2]")
    private WebElement bioTxt;

    @FindBy(xpath = "(//label[@class='control-label'])[3]")
    private WebElement userTypeTxt;

    @FindBy(xpath = "(//label[@class='control-label'])[4]")
    private WebElement timeTxt;

    @FindBy(xpath = "(//label[@class='control-label'])[5]")
    private WebElement languageTxt;

    public DataPage textFirst(String str){
        AssetHelper.assertText(str,firstTxt);
        return this;
    }

    public DataPage textLast(String str){
        AssetHelper.assertText(str,lastTxt);
        return this;
    }

    public DataPage textEmail(String str){
        AssetHelper.assertText(str,emailTxt);
        return this;
    }

    public DataPage textUser(String str){
        AssetHelper.assertText(str,userTxt);
        return this;
    }

    public DataPage textPassword(String str){
        AssetHelper.assertText(str,passwordTxt);
        return this;
    }

    public DataPage textBio(String str){
        AssetHelper.assertText(str,bioTxt);
        return this;
    }

    public DataPage textUserType(String str){
        AssetHelper.assertText(str,userTypeTxt);
        return this;
    }

    public DataPage textTime(String str){
        AssetHelper.assertText(str,timeTxt);
        return this;
    }

    public DataPage textLanguage(String str){
        AssetHelper.assertText(str,languageTxt);
        return this;
    }

    @FindBy(xpath = "//input[@name='name']")
    private WebElement name;

    @FindBy(xpath = "//input[@name='surname']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement email;

    @FindBy(xpath = "(//input[@name='login'])")
    private WebElement user;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@name='submit_personal_details']")
    private WebElement buttonAdd;
   public DataPage nameInput(String str){
       helpers.jsSendKeys(name,str);
       return this;
   }

    public DataPage lastInput(String str){
        helpers.jsSendKeys(lastName,str);
        return this;
    }

    public DataPage emailInput(String str){
        helpers.jsSendKeys(email,str);
        return this;
    }

    public DataPage userInput(String str){
        helpers.sendKeys(user,str);
        return this;
    }

    public DataPage passwordInput(String str){
        helpers.sendKeys(password,str);
        return this;
    }

    public DataPage buttonAdd(){
       helpers.jsClick(buttonAdd);
       return this;
    }






}
