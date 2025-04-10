package com.Definitions;

import com.Actions.LoginAction;
import com.Utilities.HelperClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class StepDefinition {
    LoginAction loginAction = new LoginAction();
    WebDriver driver = HelperClass.getDriver();

    @Given("I want to be in the demowebshop {string}")
    public void i_want_to_be_in_the_demowebshop(String url) {
        HelperClass.openPage(url);
    }

    @When("I click on login")
    public void i_click_on_login() {
        loginAction.clickLoginLink();
    }

    @When("I enter {string},{string} in the appropriate field")
    public void i_enter_in_the_appropriate_field(String email, String password) {
        loginAction.enterEmail(email);
        loginAction.enterPassword(password);
    }

    @When("I click on the login button")
    public void i_click_on_the_login_button() {
        loginAction.clickLoginButton();
    }

    @Then("the login result should be {string}")
    public void the_login_result_should_be(String expectedResult) {
    	
        By resultMessageLocator ;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        if (expectedResult.contains("abccy@gmail.com")) {
            resultMessageLocator = By.xpath("//a[text()='abccy@gmail.com']");
        } else if (expectedResult.contains("The credentials provided are incorrect")) {
            resultMessageLocator = By.xpath("//li[text()='The credentials provided are incorrect']");
        } else if (expectedResult.contains("No customer account found")) {
            resultMessageLocator = By.xpath("//li[text()='No customer account found']");
        } else {
            throw new IllegalArgumentException("Unexpected result message: " + expectedResult);
        }

        WebElement resultMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(resultMessageLocator));
        assertEquals(expectedResult, resultMessage.getText());
       
    }

    @When("I click on Forgot password")
    public void i_click_on_forgot_password() {
        loginAction.clickForgotPasswordLink();
    }

    @When("I enter {string} in the email field")
    public void i_enter_in_the_email_field(String email) {
        loginAction.enterEmail(email);
    }

    @When("I click on the recover button")
    public void i_click_on_the_recover_button() {
        loginAction.clickRecoverButton();
    }

    @Then("the result message should be {string}")
    public void the_result_message_should_be(String expectedResult) {
    	 By resultMessageLocator;
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

         if (expectedResult.contains("Email with instructions has been sent to you.")) {
             resultMessageLocator = By.className("result");
         } else if (expectedResult.contains("Email not found.")) {
             resultMessageLocator = By.className("result");
         } else if (expectedResult.contains("Wrong email")) {
             resultMessageLocator = By.xpath("//span[text()='Wrong email']");
         } else {
             throw new IllegalArgumentException("Unexpected result message: " + expectedResult);
         }

         WebElement resultMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(resultMessageLocator));
         assertEquals(expectedResult, resultMessage.getText());
    }
}