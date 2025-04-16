package com.Definitions;

import org.openqa.selenium.WebDriver;

import com.Actions.TagAction;
import com.Utilities.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagStepDefinitions {
	
	WebDriver driver = HelperClass.getDriver();
	TagAction tagaction=new TagAction();

	@Given("I am on the DemoWebShop HomePage")
	public void i_am_on_the_demo_web_shop_home_page(String url) {
	     HelperClass.openPage(url);  
	}
	@When("I see the list of popular tags")
	public void i_see_the_list_of_popular_tags() {
	    tagaction.getTaggedProducts();
	}

	@When("I click the View All button")
	public void i_click_the_view_all_button() {
	    tagaction.clickViewAll();
	}

	@When("I click on {string} tag link")
	public void i_click_on_tag_link(String TagName) {
	  if(TagName.equalsIgnoreCase("Digital")) {
		  tagaction.clickDigitalLinks();
	  }
	  else if(TagName.equalsIgnoreCase("cell")) {
		  tagaction.clickCellLinks();
	}
}

	@Then("I should be redirected to {string} tagged product page")
	public void i_should_be_redirected_to_tagged_product_page(String TagName) {
		if(TagName.equalsIgnoreCase("Digital")) {
			  tagaction.getProductsTaggedDigital();
		  }
		  else if(TagName.equalsIgnoreCase("cell")) {
			  tagaction.getProductsTaggedCell();
		}
	}




}
