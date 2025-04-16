package com.Actions;

import org.openqa.selenium.support.PageFactory;

import com.Pages.UserRegistrationPage;
import com.Utilities.HelperClass;

public class UserRegistrationAction {
	UserRegistrationPage userRegistrationPage=new UserRegistrationPage();

	    public UserRegistrationAction() {
	        this.userRegistrationPage = new UserRegistrationPage();
	        PageFactory.initElements(HelperClass.getDriver(), userRegistrationPage);
	    }

	    public void clickOnRegisterLink() {
	        userRegistrationPage.registerLink.click();
	    }

	    public void selectGender() {
	        userRegistrationPage.clickMale.click();
	    }

	    public void enterRegistrationDetails(String firstName, String lastName, String email, String password, String confirmPassword) {
	        userRegistrationPage.FirstName.sendKeys(firstName);
	        userRegistrationPage.LastName.sendKeys(lastName);
	        userRegistrationPage.Email.sendKeys(email);
	        userRegistrationPage.password.sendKeys(password);
	        userRegistrationPage.confirmPassword.sendKeys(confirmPassword);
	    }

	    public void clickOnRegisterButton() {
	        userRegistrationPage.registerButton.click();
	    }
	}
