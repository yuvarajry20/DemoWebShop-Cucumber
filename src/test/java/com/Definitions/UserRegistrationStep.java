package com.Definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Actions.UserRegistrationAction;
import com.Actions.UserRegistrationException;
import com.Utilities.HelperClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistrationStep {
	WebDriver driver = HelperClass.getDriver();
	UserRegistrationAction userRegistrationAction=new UserRegistrationAction();
	@When("I click on register")
	public void i_click_on_register() throws UserRegistrationException {
	    // Write code here that turns the phrase above into concrete actions
	    userRegistrationAction.clickOnRegisterLink();
	}

	@When("I choose gender")
	public void i_choose_gender() throws UserRegistrationException {
	    // Write code here that turns the phrase above into concrete actions
	    userRegistrationAction.selectGender();
	}

	@When("I enter {string},{string},{string},{string},{string} in the corresponding field")
	public void i_enter_in_the_corresponding_field(String string, String string2, String string3, String string4, String string5) throws UserRegistrationException {
	    // Write code here that turns the phrase above into concrete actions
		if(string3.contains("yuvabbb@gmail.com")) {
			String uniqueEmail = "test" + System.currentTimeMillis() + "@example.com";
		    userRegistrationAction.enterRegistrationDetails(string, string2, uniqueEmail, string4, string5);
		}else {
			userRegistrationAction.enterRegistrationDetails(string, string2, string3, string4, string5);
		}
		
	}

	@When("I click on the register button")
	public void i_click_on_the_register_button() throws UserRegistrationException {
	    // Write code here that turns the phrase above into concrete actions
	    userRegistrationAction.clickOnRegisterButton();
	}

	@Then("the registration result should be {string}")
	public void the_registration_result_should_be(String expectedResult) {
	    // Write code here that turns the phrase above into concrete actions
		String actualResult = getActualResult(expectedResult);
        if (!actualResult.equals(expectedResult)) {
            throw new AssertionError("Expected result: " + expectedResult + ", but got: " + actualResult);
        }
    }

    private String getActualResult(String expectedResult) {
        String actualResult = "";
        switch (expectedResult) {
            case "Your registration completed":
                actualResult = driver.findElement(By.cssSelector("div.result")).getText();
                break;
            case "Wrong email":
                actualResult = driver.findElement(By.cssSelector("span[data-valmsg-for='Email']")).getText();
                break;
            case "First name is required.":
                actualResult = driver.findElement(By.cssSelector("span[data-valmsg-for='FirstName']")).getText();
                break;
            case "Last name is required.":
                actualResult = driver.findElement(By.cssSelector("span[data-valmsg-for='LastName']")).getText();
                break;
            case "Email is required.":
                actualResult = driver.findElement(By.cssSelector("span[data-valmsg-for='Email']")).getText();
                break;
            case "Password is required.":
                actualResult = driver.findElement(By.xpath("//span[text()=\"Password is required.\"]")).getText();
                break;
            case "The password and confirmation password do not match.":
                actualResult = driver.findElement(By.cssSelector("span[data-valmsg-for='ConfirmPassword']")).getText();
                break;
            default:
                throw new IllegalArgumentException("Unexpected result: " + expectedResult);
        }
        return actualResult;
	}
}
