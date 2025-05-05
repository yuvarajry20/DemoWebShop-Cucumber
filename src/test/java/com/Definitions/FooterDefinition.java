package com.Definitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import com.Actions.FooterAction;
import com.Actions.LoginAction;
import com.Utilities.HelperClass;
import com.Utilities.LogManagers;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FooterDefinition {
    LoginAction loginAction = new LoginAction();
    FooterAction footerAction = new FooterAction();
     
    @When("User scrolls to the footer section")
    public void user_scrolls_to_the_footer_section() {
        ((JavascriptExecutor) HelperClass.getDriver()).executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }
    
    @When("User clicks on the {string} link")
    public void user_clicks_on_the_link(String string) {
        footerAction.clickNopLink();
    }

    @Then("User should be navigated to the nopCommerce official website")
    public void user_should_be_navigated_to_the_nop_commerce_official_website() {
        String actualText = footerAction.getNOPText();
        Assert.assertTrue(actualText.contains("Free and open-source eCommerce platform"), "Navigation failed");
//            String actualUrl = footerAction.getCurrentUrl();
//            if (!actualUrl.contains("nopcommerce.com")) {
//                throw new AssertionError("Navigation failed. Current URL: " + actualUrl);
//            }
        }
    @When("User clicks on the {string} link page")
    public void user_clicks_on_the_link_page(String string) {
       	 footerAction.clickSiteMapLink();
    }

    @Then("User should be navigated to the Sitemap page")
    public void user_should_be_navigated_to_the_sitemap_page() {
    	String actualUrl = footerAction.getCurrentUrl();
      if (!actualUrl.contains("https://demowebshop.tricentis.com/sitemap")) {
          throw new AssertionError("Navigation failed. Current URL: " + actualUrl);
      }
    }

//    @Then("User should be redirected to the Accessories page")
//    public void user_should_be_redirected_to_the_accessories_page() {
//    	footerAction.clickAccesoriesLink();
//    	String actualUrl = footerAction.getCurrentUrl();
//      if (!actualUrl.contains("https://demowebshop.tricentis.com/accessories")) {
//          throw new AssertionError("Navigation failed. Current URL: " + actualUrl);
//      }
        
    @When("clicks on the Contact us link")
    public void clicks_on_the_contact_us_link() {
       footerAction.clickContactUsLink();
    }

    @When("enters the contact details")
    public void enters_the_contact_details(io.cucumber.datatable.DataTable dataTable) {
    	 List<Map<String, String>> contactDetails = dataTable.asMaps(String.class, String.class);
    	    Map<String, String> data = contactDetails.get(0); 

    	    String name = data.get("name");
    	    String email = data.get("email");
    	    String enquiry = data.get("enquiry");

    	    footerAction.enterDetails(name, email, enquiry);
    }

    @When("clicks on the submit button")
    public void clicks_on_the_submit_button() {
    	footerAction.clickSubmit();
    }

    @Then("the confirmation should be displayed")
    public void the_confirmation_should_be_displayed() throws InterruptedException {
    	 String actualMessage = footerAction.getConfirmation();
    	 String expectedMessage = "Your enquiry has been successfully sent to the store owner.";
    	 Assert.assertEquals("Confirmation message mismatch!", expectedMessage, actualMessage);
   // 	footerAction.getConfirmation();
    	}
    	   
}




    

