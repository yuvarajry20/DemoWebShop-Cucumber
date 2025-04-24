package com.Definitions;

import org.openqa.selenium.WebDriver;

import com.Actions.TagAction;
import com.Utilities.HelperClass;
import com.Utilities.LogManagers;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagStepDefinitions {
    WebDriver driver = HelperClass.getDriver();
    TagAction tagaction = new TagAction();

    @Given("I am on the DemoWebShop HomePage")
    public void i_am_on_the_demo_web_shop_home_page(String url) {
        try {
            HelperClass.openPage(url);
        } catch (Exception e) {
            LogManagers.logError("Failed to open the DemoWebShop HomePage. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("I see the list of popular tags")
    public void i_see_the_list_of_popular_tags() {
        try {
            tagaction.getTaggedProducts();
        } catch (Exception e) {
            LogManagers.logError("Failed to see the list of popular tags. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("I click the View All button")
    public void i_click_the_view_all_button() {
        try {
            tagaction.clickViewAll();
        } catch (Exception e) {
            LogManagers.logError("Failed to click the View All button. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("I click on {string} tag link")
    public void i_click_on_tag_link(String TagName) {
        try {
            if (TagName.equalsIgnoreCase("Digital")) {
                tagaction.clickDigitalLinks();
            } else if (TagName.equalsIgnoreCase("cell")) {
                tagaction.clickCellLinks();
            }
        } catch (Exception e) {
            LogManagers.logError("Failed to click on tag link. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("I should be redirected to {string} tagged product page")
    public void i_should_be_redirected_to_tagged_product_page(String TagName) {
        try {
            if (TagName.equalsIgnoreCase("Digital")) {
                tagaction.getProductsTaggedDigital();
            } else if (TagName.equalsIgnoreCase("cell")) {
                tagaction.getProductsTaggedCell();
            }
        } catch (Exception e) {
            LogManagers.logError("Failed to be redirected to tagged product page. Error: " + e.getMessage());
            throw e;
        }
    }
}