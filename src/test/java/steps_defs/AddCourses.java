package steps_defs;

import cucumber.api.java.en.Then;
import data.MockGeneratorFaker;
import drivers.Driver;

public class AddCourses extends  BaseTest{
    @Then("^user add courses$")
    public void user_add_courses() throws Throwable {
        courses.clickCourses()
                .coursesName(MockGeneratorFaker.generatorMockFirstName(),"Hello World");
    }

    @Then("^user add User$")
    public void user_add_User() throws Throwable {
        courses.clickSavaButton()
                .clickUser1();
        addCreatePage.clickUser();
        helpers.pause(3);
        Driver.getDriver().navigate().back();
        courses.deleteCourses();

    }

}
