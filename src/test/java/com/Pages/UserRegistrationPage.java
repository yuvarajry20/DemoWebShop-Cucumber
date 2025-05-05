package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage {
//	@FindBy(xpath="//a[text()=\"Register\"]")
	@FindBy(xpath="//a[@class=\"ico-login\"]/parent::li/preceding-sibling::li/a")
	public WebElement registerLink;
	
//	@FindBy(id="gender-male")
	@FindBy(xpath="//label[@class=\"forcheckbox\"]/preceding-sibling::input[@id=\"gender-male\"]")
	public WebElement clickMale;
	
//	@FindBy(id="FirstName")
	@FindBy(xpath="//label[@for=\"FirstName\"]/following-sibling::input")
	public WebElement FirstName;
	
//	@FindBy(id="LastName")
	@FindBy(xpath="//label[@for=\"LastName\"]/following-sibling::input")
	public WebElement LastName;
	
//	@FindBy(id="Email")
	@FindBy(xpath="//label[@for=\"Email\"]/following-sibling::input")
	public WebElement Email;
	
//	@FindBy(id="Password")
	@FindBy(xpath="//label[@for=\"Password\"]/following-sibling::input")
	public WebElement password;
	
//	@FindBy(id="ConfirmPassword")
	@FindBy(xpath="//label[@for=\"ConfirmPassword\"]/following-sibling::input")
	public WebElement confirmPassword;
	
	@FindBy(id="register-button")
	public WebElement registerButton;
	
	
}
