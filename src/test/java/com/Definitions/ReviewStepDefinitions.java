package com.Definitions;

import org.openqa.selenium.WebDriver;

import com.Utilities.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.experimental.Helper;

public class ReviewStepDefinitions {
	
	WebDriver driver=HelperClass.getDriver();
	
	@Given("I am on the DemoWebShop Homepage {string}")
	public void i_am_on_the_demo_web_shop_homepage(String url) {
	    HelperClass.openPage(url);
	}

	@Given("I navigate to the {string} category")
	public void i_navigate_to_the_category(String string) {
	    
	}

	@When("I select the product {string}")
	public void i_select_the_product(String string) {
	    
	}

	@When("I click on the {string} link")
	public void i_click_on_the_link(String string) {
	   
	}

	@Then("I should see the reviews that have been submitted previously")
	public void i_should_see_the_reviews_that_have_been_submitted_previously() {
	  
	}

	@Given("I am logged in to Demowebshop application")
	public void i_am_logged_in_to_demowebshop_application() {
	    
	}

	@Given("I navigate to the gift cards page and click the product")
	public void i_navigate_to_the_gift_cards_page_and_click_the_product() {
	    
	}

	@When("I click on the {string} button")
	public void i_click_on_the_button(String string) {
	   
	}

	@When("I enter review {string}, {string} and click the rating value")
	public void i_enter_review_and_click_the_rating_value(String string, String string2) {
	    
	}

	@When("I click the {string} button")
	public void i_click_the_button(String string) {
	    
	}

	@Then("I should see the error message {string}")
	public void i_should_see_the_error_message(String string) {
	    
	}

}
