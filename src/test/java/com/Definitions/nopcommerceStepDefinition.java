package com.Definitions;

import com.Actions.nopcommerceAction;
import com.Utilities.LogManagers;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class nopcommerceStepDefinition {
	nopcommerceAction objnop=new nopcommerceAction();
	

@When("I click the nopcommerce text in the footer of the tricentis")
public void i_click_the_nopcommerce_text_in_the_footer_of_the_tricentis() {
	  try {
		  objnop.nopcommercewebpage();
      } catch (Exception e) {
          LogManagers.logError("Failed to click the nopcommerce webpage Error: " + e.getMessage());
          throw e;
      }
  }

	

@Then("the user should see the nopcommerce website successfully")
public void the_user_should_see_the_nopcommerce_website_successfully() {
	  try {
          objnop.nopgettext(); 
      } catch (Exception e) {
          LogManagers.logError("Failed to assert the nopcommerce webpage. Error: " + e.getMessage());
          throw e;
      }

}
@When("click the about us in the footer")
public void click_the_about_us_in_the_footer() {
    try
    {
    	objnop.aboutus();
    }
    catch(Exception e)
    {
    	LogManagers.logError("Failed to click the nopcommerce about page. Error: " + e.getMessage());
        throw e;
    }
}

@Then("the user should see the complete details about the nopcommerce page successfully")
public void the_user_should_see_the_complete_details_about_the_nopcommerce_page_successfully() {
    try
    {
    	objnop.detailsabout();
    }
    catch(Exception e)
    {
    	LogManagers.logError("Failed to assert the nopcommerce about page. Error: " + e.getMessage());
        throw e;
    }
}


}
