package steps_defs.IMovingTest1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import steps_defs.BaseTest;

public class Test1Imoving extends BaseTest {

    @Given("^User is on the \"([^\"]*)\"$")
    public void user_is_on_the(String arg1) throws Throwable {
       goToWebSite(arg1);
       
    }

    @Given("^user is on confirmation page$")
    public void user_is_on_confirmation_page() throws Throwable {
       iMoving.assertFindMovers("Find Movers");
       
    }

    @Given("^User should navigate to moving journey button$")
    public void user_should_navigate_to_moving_journey_button() throws Throwable {
       
       
    }

    @Given("^User clicks on moving journey button$")
    public void user_clicks_on_moving_journey_button() throws Throwable {
       
       
    }

    @Then("^pick up address should appear underneath$")
    public void pick_up_address_should_appear_underneath() throws Throwable {
       
       
    }

    @Then("^User clicks show on map button$")
    public void user_clicks_show_on_map_button() throws Throwable {
       
       
    }

    @Then("^Map should appear underneath$")
    public void map_should_appear_underneath() throws Throwable {
       
       
    }

    @Given("^User should navigate to addresses restrictions button$")
    public void user_should_navigate_to_addresses_restrictions_button() throws Throwable {
       
       
    }

    @Given("^User clicks on addresses restrictions button$")
    public void user_clicks_on_addresses_restrictions_button() throws Throwable {
       
       
    }

    @Then("^Information chart should appear underneath$")
    public void information_chart_should_appear_underneath() throws Throwable {
       
       
    }

    @Given("^User should navigate to inventory items button$")
    public void user_should_navigate_to_inventory_items_button() throws Throwable {
       
       
    }

    @Given("^User clicks on inventory items button$")
    public void user_clicks_on_inventory_items_button() throws Throwable {
       
       
    }

    @Then("^User should see (\\d+) items or Less text in chart underneath$")
    public void user_should_see_items_or_Less_text_in_chart_underneath(int arg1) throws Throwable {
       
       
    }

    @Given("^User should navigate to inventory-boxes button$")
    public void user_should_navigate_to_inventory_boxes_button() throws Throwable {
       
       
    }

    @Given("^User  clicks on inventory-boxes button$")
    public void user_clicks_on_inventory_boxes_button() throws Throwable {
       
       
    }

    @Then("^Box type chart should appear underneath$")
    public void box_type_chart_should_appear_underneath() throws Throwable {
       
       
    }

    @Given("^User should navigate to Fees button$")
    public void user_should_navigate_to_Fees_button() throws Throwable {
       
       
    }

    @Given("^User clicks Fees button$")
    public void user_clicks_Fees_button() throws Throwable {
       
       
    }

    @Then("^Fee Name chart should appear$")
    public void fee_Name_chart_should_appear() throws Throwable {
       
       
    }

    @Given("^User should navigate to I have read checkbox$")
    public void user_should_navigate_to_I_have_read_checkbox() throws Throwable {
       
       
    }

    @Given("^User clicks I have read checkbox$")
    public void user_clicks_I_have_read_checkbox() throws Throwable {
       
       
    }

    @Given("^User should navigate to Continue to payment button$")
    public void user_should_navigate_to_Continue_to_payment_button() throws Throwable {
       
       
    }

    @Given("^User clicks on Continue to payment button$")
    public void user_clicks_on_Continue_to_payment_button() throws Throwable {
       
       
    }

    @Then("^Browser should redirect to up sale page$")
    public void browser_should_redirect_to_up_sale_page() throws Throwable {
       
       
    }

    @Given("^user should navigate to terms and conditions link$")
    public void user_should_navigate_to_terms_and_conditions_link() throws Throwable {
       
       
    }

    @Given("^user should click this link$")
    public void user_should_click_this_link() throws Throwable {
       
       
    }

    @Then("^terms and conditions window should appear$")
    public void terms_and_conditions_window_should_appear() throws Throwable {
       
       
    }

}
