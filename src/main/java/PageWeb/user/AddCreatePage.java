package PageWeb.user;

import PageWeb.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCreatePage extends BasePage {

    @FindBy(xpath = "//input[@name='name']")
    private WebElement name;

    @FindBy(xpath = "//input[@name='surname']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@name='submit_personal_details']")
    private WebElement buttonAdd;

    @FindBy(xpath = "//input[@name='login']")
    private WebElement userNmae;

    @FindBy(xpath = "(//div[@class='tl-bold-link'])[1]")
    private WebElement users;

    @FindBy(xpath = "//input[@id='tl-grid-checkbox-all']")
    private WebElement usersClick;

    @FindBy(xpath = "//input[@data-id='1']")
    private WebElement ADmin;

    @FindBy(xpath = "//a[@class='btn dropdown-toggle']")
    private WebElement more;

    @FindBy(xpath = "(//a[@class='massaction'])[3]")
    private WebElement delete;

    @FindBy(xpath = "(//a[@id='submit-mass-action'])")
    private WebElement DELETE;

    public AddCreatePage inputName(String str){
        helpers.jsSendKeys(name,str);
        return this;
    }

    public AddCreatePage inputLastname(String str){
        helpers.jsSendKeys(lastName,str);
        return this;
    }

    public AddCreatePage inputEmail(String str){
        helpers.jsSendKeys(email,str);
        return this;
    }
    public AddCreatePage inputUserName(String str){
        helpers.jsSendKeys(userNmae,str);
        return this;
    }

    public AddCreatePage inputPassword(String str){
        helpers.jsSendKeys(password,str);
        return this;
    }

    public AddCreatePage buttonAddNew(){
        helpers.jsClick(buttonAdd);
        return this;
    }

    public AddCreatePage clickUser(){
        helpers.jsClick(users)
                .jsClick(usersClick)
                .jsClick(ADmin)
                .jsClick(more)
                .jsClick(delete)
                .jsClick(DELETE);
        return this;
    }
}
