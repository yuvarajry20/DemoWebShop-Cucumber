package com.Definitions;

import java.util.List;

import org.openqa.selenium.Keys;

import com.Actions.CheckoutAction;
import com.Utilities.HelperClass;

import io.cucumber.java.en.*;

public class CheckoutStepDefinition {
	CheckoutAction objcheckout=new CheckoutAction();

@Given("the user is on the Web application")
public void the_user_is_on_the_web_application() {
	HelperClass.openPage("https://demowebshop.tricentis.com/");
    
}

@When("I log in and add an item and add to cart")
public void i_log_in_and_add_an_item_and_add_to_cart(io.cucumber.datatable.DataTable dataTable) {
	objcheckout.login();
	List<String> objList=dataTable.asList(String.class);
	String productName=objList.get(0);
	objcheckout.serachanitem(productName);
	objcheckout.addtocartanitem();
	
}

@When("click checkout the product")
public void click_checkout_the_product() {
	objcheckout.isselectedcheckbox();
    
}

@When("forgot to click the term & condition button")
public void forgot_to_click_the_term_condition_button() {
	
    objcheckout.selectcheckout();
}

@Then("the user should see the pop up windows as to click the terms&condition")
public void the_user_should_see_the_pop_up_windows_as_to_click_the_terms_condition() {
   objcheckout.assertmsgalert();
}




}
