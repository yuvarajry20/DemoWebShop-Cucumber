package com.Definitions;

import java.util.List;
import java.util.Map;

import com.Actions.LoginAction;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyAccountStepDefinition {
	LoginAction loginAction=new LoginAction();
	
	@When("I provide email and password")
	public void i_provide_email_and_password(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<Map<String, String>> rows = dataTable.asMaps();
        String email = rows.get(0).get("email");
        String password = rows.get(0).get("password");
        loginAction.enterEmail(email);
        loginAction.enterPassword(password);
	}

	@When("click log in")
	public void click_log_in() {
	    // Write code here that turns the phrase above into concrete actions
	    loginAction.clickLoginLink();
	}

	@When("I click my email")
	public void i_click_my_email() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("I want to click change Password")
	public void i_want_to_click_change_password() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("i provide oldPassword as {string}")
	public void i_provide_old_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("i provide newPassword as {string} and confirmPassword as {string}")
	public void i_provide_new_password_as_and_confirm_password_as(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("i click change Password")
	public void i_click_change_password() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("i provide invalid oldPassword as {string}")
	public void i_provide_invalid_old_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("i click orders")
	public void i_click_orders() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("i want to see Order number")
	public void i_want_to_see_order_number() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("i want to see Order Date")
	public void i_want_to_see_order_date() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("i click Details")
	public void i_click_details() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("i want to see Products name")
	public void i_want_to_see_products_name() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("i click Back in stock subscriptions")
	public void i_click_back_in_stock_subscriptions() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("i should see the currently subscribed lists")
	public void i_should_see_the_currently_subscribed_lists() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("i click Reward points")
	public void i_click_reward_points() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("i should see the current balance of Reward points")
	public void i_should_see_the_current_balance_of_reward_points() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("i should see the History")
	public void i_should_see_the_history() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("i click the Customer Info")
	public void i_click_the_customer_info() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("i should see the FirstName, LastName and Email")
	public void i_should_see_the_first_name_last_name_and_email() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
