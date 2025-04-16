package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage {
	@FindBy(xpath="//a[text()=\"Register\"]")
	public WebElement registerLink;
	
	@FindBy(id="gender-male")
	public WebElement clickMale;
	
	@FindBy(id="FirstName")
	public WebElement FirstName;
	
	@FindBy(id="LastName")
	public WebElement LastName;
	
	@FindBy(id="Email")
	public WebElement Email;
	
	@FindBy(id="Password")
	public WebElement password;
	
	@FindBy(id="ConfirmPassword")
	public WebElement confirmPassword;
	
	@FindBy(id="register-button")
	public WebElement registerButton;
	
	
}
