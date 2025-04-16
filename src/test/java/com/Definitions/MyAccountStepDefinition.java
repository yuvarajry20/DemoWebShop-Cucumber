package com.Definitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Actions.AddressAction;
import com.Actions.LoginAction;
import com.Actions.MyAccountSectionAction;
import com.Utilities.HelperClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyAccountStepDefinition {
	LoginAction loginAction=new LoginAction();
	AddressAction addressAction=new AddressAction();
	MyAccountSectionAction accountSectionAction=new MyAccountSectionAction();
	WebDriver driver = HelperClass.getDriver();
	
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
		addressAction.clickMyEmail();
	}

	@Then("I want to click change Password")
	public void i_want_to_click_change_password() {
	    // Write code here that turns the phrase above into concrete actions
	    accountSectionAction.clickChangePassword();
	}

	@When("i provide oldPassword as {string}")
	public void i_provide_old_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    accountSectionAction.oldpassword(string);
	}

	@When("i provide newPassword as {string} and confirmPassword as {string}")
	public void i_provide_new_password_as_and_confirm_password_as(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    accountSectionAction.newconfirmPassword(string, string2);
	}
	
	@Then("i click change Password {string}")
	public void i_click_change_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
		accountSectionAction.changePassword();  
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    
	    if(string.contains("Password was changed")) {
	    	By passlocator=By.xpath("//div[@class=\"result\"]");
		    WebElement result=wait.until(ExpectedConditions.visibilityOfElementLocated(passlocator));
		    String text=result.getText();
	    	String actual="Password was changed";
	    	Assert.assertEquals(actual, text);
	    }else {
	    	By passloca1=By.xpath("//li[text()=\"Old password doesn't match\"]");
	    	WebElement result1=wait.until(ExpectedConditions.visibilityOfElementLocated(passloca1));
	    	String actual=result1.getText();
	    	Assert.assertEquals(actual, string);
	    }
	}

	@When("i provide invalid oldPassword as {string}")
	public void i_provide_invalid_old_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    accountSectionAction.oldpassword(string);
	}

	@When("i click orders")
	public void i_click_orders() {
	    // Write code here that turns the phrase above into concrete actions
	    accountSectionAction.clickOrders();
	}

	@Then("i want to see Order number")
	public void i_want_to_see_order_number() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(accountSectionAction.getorder());
	}

	@Then("i want to see Order Date")
	public void i_want_to_see_order_date() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(accountSectionAction.getorderdate());
	}

	@When("i click Details")
	public void i_click_details() {
	    // Write code here that turns the phrase above into concrete actions
	    accountSectionAction.clickorderdetails();
	}

	@Then("i want to see Products name")
	public void i_want_to_see_products_name() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(accountSectionAction.productname());
	}

	@When("i click Back in stock subscriptions")
	public void i_click_back_in_stock_subscriptions() {
	    // Write code here that turns the phrase above into concrete actions
	    accountSectionAction.clickBackInStock();
	}

	@Then("i should see the currently subscribed lists")
	public void i_should_see_the_currently_subscribed_lists() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(accountSectionAction.backinstock());
	}

	@When("i click Reward points")
	public void i_click_reward_points() {
	    // Write code here that turns the phrase above into concrete actions
	    accountSectionAction.clickRewardPoints();
	}

	@Then("i should see the current balance of Reward points")
	public void i_should_see_the_current_balance_of_reward_points() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(accountSectionAction.currentreward());
	}

	@Then("i should see the History")
	public void i_should_see_the_history() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(accountSectionAction.historyreward());
	}

	@When("i click the Customer Info")
	public void i_click_the_customer_info() {
	    // Write code here that turns the phrase above into concrete actions
	   accountSectionAction.clickCustomerInfo();
	}

	@Then("i should see the FirstName, LastName and Email")
	public void i_should_see_the_first_name_last_name_and_email() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(accountSectionAction.getFirstName());
	    System.out.println(accountSectionAction.getLastName());
	    System.out.println(accountSectionAction.getEmail());
	}
}
