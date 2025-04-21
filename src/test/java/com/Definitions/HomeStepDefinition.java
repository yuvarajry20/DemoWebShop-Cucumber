package com.Definitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Actions.HomePageAction;
import com.Actions.LoginAction;
import com.Utilities.HelperClass;
import com.Utilities.LogManagers;

import io.cucumber.java.en.*;

public class HomeStepDefinition {

    HomePageAction homePage = new HomePageAction();
    LoginAction loginAction = new LoginAction();
    WebDriver driver = HelperClass.getDriver();

    @Given("I am on Demowebshop Homepage {string}")
    public void i_want_to_be_in_the_demowebshop(String url) {
        try {
            HelperClass.openPage(url);
        } catch (Exception e) {
            LogManagers.logError("Failed to open Demowebshop Homepage. Error: " + e.getMessage());
        }
    }

    @When("I enter the following email in the newsletter field")
    public void i_enter_the_following_email_in_the_newsletter_field(io.cucumber.datatable.DataTable dataTable) {
        try {
            List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
            String email = data.get(0).get("email");
            homePage.enterNewsLetterEmail(email);
        } catch (Exception e) {
            LogManagers.logError("Failed to enter the email in the newsletter field. Error: " + e.getMessage());
        }
    }

    @When("I click the Subscribe button")
    public void i_click_the_subscribe_button() {
        try {
            homePage.SubscribeNewsLetter();
        } catch (Exception e) {
            LogManagers.logError("Failed to click the Subscribe button. Error: " + e.getMessage());
        }
    }

    @Then("I should see the subscription confirmation message")
    public void i_should_see_the_subscription_confirmation_message() {
        try {
            homePage.SuccessfulSubscription();
        } catch (Exception e) {
            LogManagers.logError("Failed to see the subscription confirmation message. Error: " + e.getMessage());
        }
    }

    @Then("I should see the subscription error message")
    public void i_should_see_the_subscription_error_message() {
        try {
            homePage.invalidSubscription();
        } catch (Exception e) {
            LogManagers.logError("Failed to see the subscription error message. Error: " + e.getMessage());
        }
    }

    @When("I see the featured products section")
    public void i_see_the_featured_products_section() {
        try {
            homePage.VerifyFeaturedProducts();
        } catch (Exception e) {
            LogManagers.logError("Failed to see the featured products section. Error: " + e.getMessage());
        }
    }

    @Then("I should see list of featured products displayed")
    public void i_should_see_list_of_featured_products_displayed() {
        try {
            homePage.GetFeaturedProducts();
        } catch (Exception e) {
            LogManagers.logError("Failed to see the list of featured products displayed. Error: " + e.getMessage());
        }
    }

    @When("I click the option in poll")
    public void i_click_the_option_in_poll() {
        try {
            homePage.SelectVotingOption();
        } catch (Exception e) {
            LogManagers.logError("Failed to click the option in poll. Error: " + e.getMessage());
        }
    }

    @When("click the vote button")
    public void click_the_vote_button() {
        try {
            homePage.voting();
        } catch (Exception e) {
            LogManagers.logError("Failed to click the vote button. Error: " + e.getMessage());
        }
    }

    @Then("I should see an error message")
    public void i_should_see_an_error_message() {
        try {
            homePage.ViewPollInvalidresult();
        } catch (Exception e) {
            LogManagers.logError("Failed to see an error message. Error: " + e.getMessage());
        }
    }
}