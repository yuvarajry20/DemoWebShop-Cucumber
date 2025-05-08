package com.Definitions;

import com.Actions.AddressAction;
import com.Utilities.LogManagers;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddressStepDefinition {
    AddressAction addressAction = new AddressAction();

    @When("click Addressess and add new")
    public void click_addressess_and_add_new() {
        try {
            addressAction.clickMyEmail();
            addressAction.clickAddressesAndAddNew();
        } catch (Exception e) {
            LogManagers.logError("Failed to click Addresses and add new. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("I want to add new address")
    public void i_want_to_add_new_address() {
        try {
            addressAction.fillAddressForm();
        } catch (Exception e) {
            LogManagers.logError("Failed to add new address. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("select country and state")
    public void select_country_and_state() {
       //it is an empty method
    }

    @Then("i click save")
    public void i_click_save() {
        try {
            addressAction.clickSave();
        } catch (Exception e) {
            LogManagers.logError("Failed to click save. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("i click Addresses")
    public void i_click_addresses() {
        try {
            addressAction.clickAddresses();
        } catch (Exception e) {
            LogManagers.logError("Failed to click Addresses. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("i click the Delete button")
    public void i_click_the_delete_button() {
        try {
            addressAction.clickDeleteAddressButton();
        } catch (Exception e) {
            LogManagers.logError("Failed to click the Delete button. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("i should click the yes button in the alert")
    public void i_should_click_the_yes_button_in_the_alert() {
        try {
            addressAction.handleAlert();
        } catch (Exception e) {
            LogManagers.logError("Failed to click the yes button in the alert. Error: " + e.getMessage());
            throw e;
        }
    }
}