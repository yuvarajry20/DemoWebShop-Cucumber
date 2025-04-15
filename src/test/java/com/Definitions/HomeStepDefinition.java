package com.Definitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Actions.HomePageAction;
import com.Actions.LoginAction;
import com.Utilities.HelperClass;

import io.cucumber.java.en.*;

public class HomeStepDefinition {

    HomePageAction homePage = new HomePageAction();
    LoginAction loginAction = new LoginAction();
    WebDriver driver = HelperClass.getDriver();
    
    @Given("I am on Demowebshop Homepage {string}")
    public void i_want_to_be_in_the_demowebshop(String url) {
     HelperClass.openPage(url);
    	//HelperClass.openPage("https://demowebshop.tricentis.com/");
    }

//    @Given("I login using the following credentials")
//    public void i_login_using_the_following_credentials(io.cucumber.datatable.DataTable dataTable) {
//    	HelperClass.openPage("https://demowebshop.tricentis.com/");
//    	List<Map<String, String>> loginData = dataTable.asMaps(String.class, String.class);
//        String email = loginData.get(0).get("email");
//        String password = loginData.get(0).get("password");
//
//        loginAction.clickLoginLink();
//        loginAction.enterEmail(email);
//        loginAction.enterPassword(password);
//        loginAction.clickLoginButton();
//    }

    @When("I enter the following email in the newsletter field")
    public void i_enter_the_following_email_in_the_newsletter_field(io.cucumber.datatable.DataTable dataTable) {
        
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        String email = data.get(0).get("email");
        homePage.enterNewsLetterEmail(email);
    }
    @When("I click the Subscribe button")
    public void i_click_the_subscribe_button() {
       homePage.SubscribeNewsLetter();
    }


    @Then("I should see the subscription confirmation message")
    public void i_should_see_the_subscription_confirmation_message() {
       homePage.SuccessfulSubscription();
    }

    @Then("I should see the subscription error message")
    public void i_should_see_the_subscription_error_message() {
       homePage.invalidSubscription();
    }
    @When("I see the featured products section")
    public void i_see_the_featured_products_section() {
        homePage.VerifyFeaturedProducts();
    }

    @Then("I should see list of featured products displayed")
    public void i_should_see_list_of_featured_products_displayed() {
        homePage.GetFeaturedProducts();
    }

    @When("I see the recently viewed products section")
    public void i_see_the_recently_viewed_products_section() {
        homePage.GetRecentlyViewedProducts();
    }

    @Then("I should see the list of recently viewed products")
    public void i_should_see_the_list_of_recently_viewed_products() {
        homePage.GetRecentlyViewedProducts();
    }
  
    @When("I click the option in poll")
    public void i_click_the_option_in_poll() {
    	homePage.SelectVotingOption();
   }

    @When("click the vote button")
    public void click_the_vote_button() {
    	homePage.voting();
    }

    @Then("I should see an error message")
    public void i_should_see_an_error_message() {
        homePage.ViewPollInvalidresult();
    }



    
}