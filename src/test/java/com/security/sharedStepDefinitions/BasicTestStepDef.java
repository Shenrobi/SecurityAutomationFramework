package com.security.sharedStepDefinitions;

import com.security.utils.Navigation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class BasicTestStepDef {

    private final Navigation navigation = new Navigation();

    @Given("I open the browser")
    public void i_open_the_browser() {
        navigation.openBrowser();
    }

    @When("I navigate to the {string}")
    public void i_navigate_to_the_url(String url) {
        navigation.navigateTo(url);
    }

    @Then("I close the browser")
    public void i_close_the_browser() {
        navigation.closeBrowser();
    }
}
