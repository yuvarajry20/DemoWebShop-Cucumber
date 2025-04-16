package com.Definitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Actions.SearchAction;
import com.Utilities.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDefinition {
	 WebDriver driver = HelperClass.getDriver();
	 SearchAction searchaction=new SearchAction();
	 
	 
	@Given("I am on the DemoWebShop HomePage with {string}")
	public void i_am_on_the_demo_web_shop_home_page_with(String url) {
	    HelperClass.openPage(url);
	    }

	    @When("I click search bar and enter {string}")
	    public void i_click_search_bar_and_enter(String string) {
	    	searchaction.enterSearchText(string);
	       
	    }

	    @When("I click the search button")
	    public void i_click_the_search_button() {
	       searchaction.clickSearchButton();
	    }

	    @Then("the {string} should be displayed in the results")
	    public void the_should_be_displayed_in_the_results(String string) {
	        searchaction.DisplayResult();
	    }
	    
	    @When("I click search bar and enter invalid {string}")
	    public void i_click_search_bar_and_enter_invalid(String string) {
	    	searchaction.enterSearchText(string);
	    }

	    @When("I enter the search")
	    public void i_enter_the_search() {
	    	searchaction.clickSearchButton();
	    }
//       
//	    @Then("a message that {string} should be displayed")
//	    public void a_message_that_should_be_displayed(String expectedMessage) {
//	        String actualMessage = searchaction.getRelevantSearchMessage(expectedMessage);
//	        Assert.assertEquals(actualMessage.trim(), expectedMessage);
//	    }
	    
	    @Then("a message that {string} should be displayed")
	    public void a_message_that_should_be_displayed(String expectedMessage) {
	        try {
	            
	            Alert alert = HelperClass.getDriver().switchTo().alert();
	            String actualMessage = alert.getText();
	            alert.accept(); 
	            Assert.assertEquals(actualMessage.trim(), expectedMessage);
	        } catch (NoAlertPresentException e) {
	            
	            String actualMessage = searchaction.getRelevantSearchMessage(expectedMessage);
	            Assert.assertEquals(actualMessage.trim(), expectedMessage);
	        }
	    }

	    @When("I enter {string} in the search box")
	    public void i_enter_in_the_search_box(String searchterm) {
	    	searchaction.enterSearchText(searchterm);
	    }

	    @When("I enable advanced search")
	    public void i_enable_advanced_search() {
	        searchaction.enableAdvanceSearch();
	    }

	    @When("I apply the following search filters {string},{string},{string}")
	    public void i_apply_the_following_search_filters(String Category, String min, String max) {
	    	searchaction.applyCategory();
	    	if(Category.equals("Electronics >> Camera, photo")) {
	    		searchaction.applycameraCategory();
	    	}else if(Category.equals("Electronics >> Cell phones")) {
	    		searchaction.applyCellCategory();
	    	}
	        searchaction.enterPriceRange(min, max);
	      
    }

	    @Then("the system should display {string} message for {string}")
	    public void the_system_should_display_message_for(String ExpectedResult, String SearchTerm) {
	    	//if(ExpectedResult.equalsIgnoreCase("1MP 60GB Hard Drive Handycam Camcorder")) {
	    		if(ExpectedResult.equalsIgnoreCase(SearchTerm)) {
	    		searchaction.AdvanceSearchResultDisplayed();
	    	}else if(ExpectedResult.equalsIgnoreCase(SearchTerm)){
	    		searchaction.NoSearchDisplayed();
	    	}
	    }

}
