package com.Definitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Actions.SearchAction;
import com.Utilities.HelperClass;
import com.Utilities.LogManagers;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDefinition {
    WebDriver driver = HelperClass.getDriver();
    SearchAction searchaction = new SearchAction();

    @Given("I am on the DemoWebShop HomePage with {string}")
    public void i_am_on_the_demo_web_shop_home_page_with(String url) {
        try {
            HelperClass.openPage(url);
        } catch (Exception e) {
            LogManagers.logError("Failed to open the DemoWebShop HomePage. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("I click search bar and enter {string}")
    public void i_click_search_bar_and_enter(String string) {
        try {
            searchaction.enterSearchText(string);
        } catch (Exception e) {
            LogManagers.logError("Failed to click search bar and enter text. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("I click the search button")
    public void i_click_the_search_button() {
        try {
            searchaction.clickSearchButton();
        } catch (Exception e) {
            LogManagers.logError("Failed to click the search button. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("the {string} should be displayed in the results")
    public void the_should_be_displayed_in_the_results(String string) {
        try {
            searchaction.displayResult();
        } catch (Exception e) {
            LogManagers.logError("Failed to display the result. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("I click search bar and enter invalid {string}")
    public void i_click_search_bar_and_enter_invalid(String string) {
        try {
            searchaction.enterSearchText(string);
        } catch (Exception e) {
            LogManagers.logError("Failed to click search bar and enter invalid text. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("I enter the search")
    public void i_enter_the_search() {
        try {
            searchaction.clickSearchButton();
        } catch (Exception e) {
            LogManagers.logError("Failed to enter the search. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("a message that {string} should be displayed")
    public void a_message_that_should_be_displayed(String expectedMessage) {
        try {
            Alert alert = HelperClass.getDriver().switchTo().alert();
            String actualMessage = alert.getText();
            alert.accept();
            Assert.assertEquals(actualMessage.trim(), expectedMessage);
        } catch (NoAlertPresentException e) {
            try {
                String actualMessage = searchaction.getRelevantSearchMessage(expectedMessage);
                Assert.assertEquals(actualMessage.trim(), expectedMessage);
            } catch (Exception ex) {
                LogManagers.logError("Failed to display the expected message. Error: " + ex.getMessage());
                throw e;
            }
        } catch (Exception e) {
            LogManagers.logError("Failed to handle alert or display message. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("I enter {string} in the search box")
    public void i_enter_in_the_search_box(String searchterm) {
        try {
            searchaction.enterSearchText(searchterm);
        } catch (Exception e) {
            LogManagers.logError("Failed to enter text in the search box. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("I enable advanced search")
    public void i_enable_advanced_search() {
        try {
            searchaction.enableAdvanceSearch();
        } catch (Exception e) {
            LogManagers.logError("Failed to enable advanced search. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("I apply the following search filters {string},{string},{string}")
    public void i_apply_the_following_search_filters(String Category, String min, String max) {
        try {
            searchaction.applyCategory();
            if (Category.equals("Electronics >> Camera, photo")) {
                searchaction.applyCameraCategory();
            } else if (Category.equals("Electronics >> Cell phones")) {
                searchaction.applyCellCategory();
            }
            searchaction.enterPriceRange(min, max);
        } catch (Exception e) {
            LogManagers.logError("Failed to apply search filters. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("the system should display {string} message for {string}")
    public void the_system_should_display_message_for(String ExpectedResult, String SearchTerm) {
        try {
            if (ExpectedResult.equalsIgnoreCase(SearchTerm)) {
                searchaction.advanceSearchResultDisplayed();
            } else if (ExpectedResult.equalsIgnoreCase(SearchTerm)) {
                searchaction.noSearchDisplayed();
            }
        } catch (Exception e) {
            LogManagers.logError("Failed to display the expected message. Error: " + e.getMessage());
            throw e;
        }
    }
}