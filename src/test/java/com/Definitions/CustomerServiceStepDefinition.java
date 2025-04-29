package com.Definitions;

import com.Actions.CustomerServiceAction;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerServiceStepDefinition {
	CustomerServiceAction customerServiceAction=new CustomerServiceAction();
	
	@When("I click the news link in customer service")
	public void i_click_the_news_link_in_customer_service() {
	    // Write code here that turns the phrase above into concrete actions
		customerServiceAction.clickNewsLink();
	}

	@Then("I can see the latest news for the website")
	public void i_can_see_the_latest_news_for_the_website() {
	    // Write code here that turns the phrase above into concrete actions
	    String text=customerServiceAction.getLatestNewsText();
	    System.out.print(text);
	}
}
