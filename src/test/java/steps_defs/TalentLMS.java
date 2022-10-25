package steps_defs;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import data.MockGeneratorFaker;
import drivers.Driver;

public class TalentLMS extends BaseTest {
    @Given("^go to login page$")
    public void go_to_login_page() throws Throwable {
       goToWebSite("https://abdirasilov3422.talentlms.com/index");
        
    }

    @Given("^Enter \"([^\"]*)\" in userName or Email input field$")
    public void enter_in_userName_or_Email_input_field(String name) throws Throwable {
        login.inputLogin(name);

    }

    @Given("^Enter \"([^\"]*)\" in password input field$")
    public void enter_in_password_input_field(String userName) throws Throwable {

        login.inputPassword(userName);
    }

    @When("^user click on login button$")
    public void user_click_on_login_button() throws Throwable {
       login.buttonLogin();
        
    }

    @Then("^user should successfully logged in$")
    public void user_should_successfully_logged_in() throws Throwable {

        
    }

    @When("^Click \"add user button$")
    public void click_add_user_button() throws Throwable {
        login.buttonAddNew();
        
    }

    @Then("^user should see \"([^\"]*)\" title$")
    public void user_should_see_title(String addUserText) throws Throwable {
       login.tittleAdd(addUserText);
        System.out.println(addUserText + "---------------------------------------------------");
        
    }

    @Then("^in field First name white first name$")
    public void in_field_First_name_white_first_name() throws Throwable {
       addCreatePage.inputName(MockGeneratorFaker.generatorMockFirstName());
        
    }

    @Then("^in field Last name write last name$")
    public void in_field_Last_name_write_last_name() throws Throwable {
       addCreatePage.inputLastname(MockGeneratorFaker.generatorMockLastName());
        
    }

    @Then("^in field Email address write$")
    public void in_field_Email_address_write() throws Throwable {
       addCreatePage.inputEmail(MockGeneratorFaker.generatorMockEmail())
               .inputPassword(MockGeneratorFaker.generatorMockPassword())
               .inputUserName(MockGeneratorFaker.generatorMockUserName());
       helper.pause(3);
               addCreatePage.buttonAddNew();
               Driver.getDriver().navigate().back();
               Driver.getDriver().navigate().back();


    }
//    @Then("^verify following fields names$")
//    public void verify_following_fields_names(DataTable arg1) throws Throwable {
//
//    }
//
//    @Then("^enter following data to create new user$")
//    public void enter_following_data_to_create_new_user(DataTable arg1) throws Throwable {
//
//    }
}
