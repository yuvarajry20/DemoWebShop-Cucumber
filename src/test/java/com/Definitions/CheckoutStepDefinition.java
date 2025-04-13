package com.Definitions;

import com.Utilities.HelperClass;

import io.cucumber.java.en.*;

public class CheckoutStepDefinition {

@Given("the user is on the Web application")
public void the_user_is_on_the_web_application() {
	HelperClass.openPage("https://demowebshop.tricentis.com/");
}

@When("I log in  and search an item and add to cart")
public void i_log_in_and_search_an_item_and_add_to_cart() {
	
    
}

@When("click checkout the product")
public void click_checkout_the_product() {
    
}

@When("forgot to click the term & condition button")
public void forgot_to_click_the_term_condition_button() {
    
}

@Then("the user should see the pop up windows as to click the terms&condition")
public void the_user_should_see_the_pop_up_windows_as_to_click_the_terms_condition() {
    
}

}
