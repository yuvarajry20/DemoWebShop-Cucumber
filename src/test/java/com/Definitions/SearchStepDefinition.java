package com.Definitions;

import org.openqa.selenium.WebDriver;

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
	        //searchaction.
	    }
}
