package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement loginLink;

	@FindBy(xpath="//a[text()='Log in']/ancestor::div/descendant::input[@id='Email']")
	private WebElement emailField;

	@FindBy(xpath="//a[text()='Log in']/ancestor::div/descendant::input[@id='Password']")
	private WebElement passwordField;

	@FindBy(xpath="//a[text()='Log in']/ancestor::div/descendant::input[@class='button-1 login-button']")
	private WebElement loginButton;

	@FindBy(linkText = "Forgot password?")
	private WebElement forgotPasswordLink;

	@FindBy(xpath="//input[@name='send-email']")
	private WebElement recoverButton;
	
	

    public void clickLoginLink() {
        loginLink.click();
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickForgotPasswordLink() {
        forgotPasswordLink.click();
    }

    public void clickRecoverButton() {
        recoverButton.click();
    }
}
