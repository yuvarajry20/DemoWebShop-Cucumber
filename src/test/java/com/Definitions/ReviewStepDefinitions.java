package com.Definitions;

import org.openqa.selenium.WebDriver;

import com.Actions.ElementNotFoundException;
import com.Actions.LoginAction;
import com.Actions.ReviewAction;
import com.Utilities.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.experimental.Helper;

public class ReviewStepDefinitions {
	
	LoginAction loginAction = new LoginAction();
	ReviewAction reviewAction=new ReviewAction();
	WebDriver driver=HelperClass.getDriver();
	
	@Given("I am on the DemoWebShop Homepage {string}")
	public void i_am_on_the_demo_web_shop_homepage(String url) {
	   HelperClass.openPage(url);
	}

	@Given("I navigate to the {string} category")
	public void i_navigate_to_the_category(String string) {
	    reviewAction.ClickGiftCategory();
	}

	@When("I select the product {string}")
	public void i_select_the_product(String string) {
		reviewAction.clickGiftCard();
	}

	@When("I click on the {string} link")
	public void i_click_on_the_link(String string) {
		reviewAction.clickReviews();
	}

	@Then("I should see the reviews that have been submitted previously")
	public void i_should_see_the_reviews_that_have_been_submitted_previously() {
		reviewAction.ReadReviews();
	}
	
	@When("click on {string} link")
	public void click_on_link(String string) {
	   reviewAction.clickAddReview();
	}

	@When("click on submit review")
	public void click_on_submit_review() {
	   reviewAction.ClickSubmitReview();
	}

	@Then("I should see {string}")
	public void i_should_see(String string) {
		reviewAction.notLoggedErrorReview();
	}
	
	@Given("I am logged in to Demowebshop application with {string}")
	public void i_am_logged_in_to_demowebshop_application_with(String url) {
		HelperClass.openPage(url);
		loginAction.clickLoginLink();
	    loginAction.enterEmail("abccy@gmail.com");
	    loginAction.enterPassword("789456");
	    loginAction.clickLoginButton();

	}
    
	@Given("I navigate to the gift cards page and click the product")
	public void i_navigate_to_the_gift_cards_page_and_click_the_product() {
	    reviewAction.ClickGiftCategory();
	}

	@When("I click on the {string} button")
	public void i_click_on_the_button(String string) {
	   reviewAction.clickGiftCard();
	}

	@When("I enter review {string}, {string} and click the rating value")
	public void i_enter_review_and_click_the_rating_value(String title, String text) {
		reviewAction.clickAddReview();
		reviewAction.enterReviewTitle(title);
	    reviewAction.enterReviewText(text);
	    reviewAction.giveRating();
	}

	@When("I click the {string} button")
	public void i_click_the_button(String string) {
	    reviewAction.ClickSubmitReview();
	}

	@Then("I should see the error message {string}")
	public void i_should_see_the_error_message(String expected) throws ElementNotFoundException {
		if(expected.equals("Product review is successfully added.")) {
			reviewAction.verifyReviewSubmitted();
		}else if(expected.equals("Review title is required.")) {
			reviewAction.blankTextError();
		}else if(expected.equals("Review text is required.")) {
			reviewAction.blankTextError();
		}
		
	}

}
