package steps_defs;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import data.MockGeneratorFaker;
import drivers.Driver;

import java.util.List;

public class DataCreate extends BaseTest{
    @Given("^verify following fields names$")
    public void verify_following_fields_names(DataTable dataTable)  {
        List<List<String>> data = dataTable.raw();
        dataPage.textFirst(data.get(0).get(0))
                .textLast(data.get(0).get(1))
                .textEmail(data.get(0).get(2))
                .textUser(data.get(0).get(3))
                .textPassword(data.get(0).get(4))
                .textBio(data.get(0).get(5))
                .textUserType(data.get(0).get(6))
                .textTime(data.get(0).get(7))
                .textLanguage(data.get(0).get(8));
        helpers.pause(5);
    }

    @Given("^enter following data to create new user$")
    public void enter_following_data_to_create_new_user(DataTable dataTable)  {
        List<List<String>> data = dataTable.raw();
        dataPage.nameInput(data.get(1).get(0))
                .lastInput(data.get(1).get(1))
                .emailInput(MockGeneratorFaker.generatorMockEmail())
                .userInput(MockGeneratorFaker.generatorMockUserName())
                .passwordInput(data.get(1).get(4));
        dataPage.buttonAdd();
        helpers.pause(5);


        Driver.getDriver().navigate().back();
        dataPage.nameInput(data.get(2).get(0))
                .lastInput(data.get(2).get(1))
                .emailInput(MockGeneratorFaker.generatorMockEmail())
                .userInput(MockGeneratorFaker.generatorMockUserName())
                .passwordInput(data.get(2).get(4));
        dataPage.buttonAdd();
        helpers.pause(5);
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
        addCreatePage.clickUser();
        helpers.pause(3);



    }
}
