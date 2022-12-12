package com.utilita.step_definitions;

import com.utilita.pages.HelpPage;
import com.utilita.utilities.ConfigurationReader;
import com.utilita.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HelpFunction {

    HelpPage helpPage = new HelpPage();

    @Given("the utilita website has loaded")
    public void the_utilita_website_has_loaded() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user clicks on Help")
    public void user_clicks_on_help() {

        helpPage.helpButton.click();

    }

    @Then("Help screen will load")
    public void help_screen_will_load() {

       Assert.assertTrue(helpPage.custRefNum.isDisplayed());
    }

    @When("user clicks Your Customer Reference Number")
    public void user_clicks_your_customer_reference_number() {

        helpPage.custRefNum.click();
    }

    @Given("no details are filled out")
    public void no_details_are_filled_out() {

        Assert.assertTrue(helpPage.emailBox.getText().isBlank());

        Assert.assertTrue(helpPage.postcodeBox.getText().isBlank());

    }

    @When("user clicks on Find button")
    public void user_clicks_on_find_button() {

        helpPage.findButton.click();

    }

    @Then("error message -Please provide your email-phone number and postcode- will show")
    public void error_message_please_provide_your_email_phone_number_and_postcode_will_show() {

        Assert.assertTrue(helpPage.errorMessage.isDisplayed());
    }


}
