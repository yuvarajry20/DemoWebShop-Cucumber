package com.Definitions;

import com.Actions.AddressAction;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddressStepDefinition {
	AddressAction addressAction=new AddressAction();
	
	@When("click Addressess and add new")
	public void click_addressess_and_add_new() {
	    // Write code here that turns the phrase above into concrete actions
	    addressAction.clickMyEmail();
	    addressAction.clickAddressesAndAddNew();
	}

	@Then("I want to add new address")
	public void i_want_to_add_new_address() {
	    // Write code here that turns the phrase above into concrete actions
	    addressAction.fillAddressForm();
	}

	@Then("select country and state")
	public void select_country_and_state() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("i click save")
	public void i_click_save() {
	    // Write code here that turns the phrase above into concrete actions
	    addressAction.clickSave();
	}

	@When("i click Addresses")
	public void i_click_addresses() {
	    // Write code here that turns the phrase above into concrete actions
	    addressAction.clickAddresses();
	}

	@When("i click the Delete button")
	public void i_click_the_delete_button() {
	    // Write code here that turns the phrase above into concrete actions
	    addressAction.clickDeleteAddressButton();
	}

	@Then("i should click the yes button in the alert")
	public void i_should_click_the_yes_button_in_the_alert() {
	    // Write code here that turns the phrase above into concrete actions
	    addressAction.handleAlert();
	}
}
