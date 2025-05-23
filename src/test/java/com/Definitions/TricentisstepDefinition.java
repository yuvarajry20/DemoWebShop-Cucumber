package com.Definitions;

import com.Actions.TricentisAction;
import com.Utilities.LogManagers;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TricentisstepDefinition {
    TricentisAction objtri = new TricentisAction();

    @When("I click the Tricentis Academy image")
    public void i_click_the_tricentis_academy_image() {
        try {
            objtri.tricentisimg();
        } catch (Exception e) {
            LogManagers.logError("Failed to click the Tricentis Academy image. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("the user should redirected to the tricentis webpage")
    public void the_user_should_redirected_to_the_tricentis_webpage() {
        try {
            objtri.assertpage();
        } catch (Exception e) {
            LogManagers.logError("Failed to assert the Tricentis webpage. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("click the upcoming webinars in the footer")
    public void click_the_upcoming_webinars_in_the_footer() {
        try {
            objtri.upcomingevents();
        } catch (Exception e) {
            LogManagers.logError("Failed to click the upcoming webinars in the footer. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("the user should see the webinars details")
    public void the_user_should_see_the_webinars_details() {
        try {
            objtri.listoftitleinfilters();
        } catch (Exception e) {
            LogManagers.logError("Failed to see the webinars details. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("enter the keyword in the filter search box")
    public void enter_the_keyword_in_the_filter_search_box() {
        try {
            objtri.searchthekeyword();
        } catch (Exception e) {
            LogManagers.logError("Failed to enter the keyword in the filter search box. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("the user should see the upcoming partner event")
    public void the_user_should_see_the_upcoming_partner_event() {
        try {
        	
            objtri.unlockassert();
        } catch (Exception e) {
            LogManagers.logError("Failed to see the upcoming partner event. Error: " + e.getMessage());
            throw e;
        }
    }

@When("click the trials&Demo")
public void click_the_trials_demo() {
	objtri.trialsdemos();
    
}

@Then("the user should see the list of software test tool demo")
public void the_user_should_see_the_list_of_software_test_tool_demo() {
    objtri.enterprise();
}
}