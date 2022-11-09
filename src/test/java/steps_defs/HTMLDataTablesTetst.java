package steps_defs;

import POJO.HTMLTablesPojo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import drivers.Driver;

import java.util.List;

public class HTMLDataTablesTetst extends BaseTest {

    @Given("^open the web \"([^\"]*)\"$")
    public void open_the_web(String url) throws Throwable {
        goToWebSite(url);
        helpers.arrowDown(6);

    }
    @Then("^load to DataTable$")
    public void load_to_DataTable(List<HTMLTablesPojo> tables) throws Throwable {
        tablesPage.tableMethods("Company","Francisco Chang");
    }


}
