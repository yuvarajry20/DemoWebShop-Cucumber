package com.Actions;

import org.openqa.selenium.support.PageFactory;

import com.Pages.UserRegistrationPage;
import com.Utilities.HelperClass;
import com.Utilities.LogManagers;

public class UserRegistrationAction {
    UserRegistrationPage userRegistrationPage;

    public UserRegistrationAction() {
        this.userRegistrationPage = new UserRegistrationPage();
        PageFactory.initElements(HelperClass.getDriver(), userRegistrationPage);
    }

    public void clickOnRegisterLink() throws UserRegistrationException {
        try {
            userRegistrationPage.registerLink.click();
            LogManagers.logInfo("Clicked on 'Register' link.");
        } catch (Exception e) {
            throw new UserRegistrationException("Failed to click on 'Register' link.");
        }
    }

    public void selectGender() throws UserRegistrationException {
        try {
            userRegistrationPage.clickMale.click();
            LogManagers.logInfo("Selected 'Male' gender.");
        } catch (Exception e) {
            throw new UserRegistrationException("Failed to select 'Male' gender.");
        }
    }

    public void enterRegistrationDetails(String firstName, String lastName, String email, String password, String confirmPassword) throws UserRegistrationException {
        try {
            userRegistrationPage.FirstName.sendKeys(firstName);
            userRegistrationPage.LastName.sendKeys(lastName);
            userRegistrationPage.Email.sendKeys(email);
            userRegistrationPage.password.sendKeys(password);
            userRegistrationPage.confirmPassword.sendKeys(confirmPassword);
            LogManagers.logInfo("Entered registration details: " + 
                                "First Name: " + firstName + 
                                ", Last Name: " + lastName + 
                                ", Email: " + email + 
                                ", Password: " + password + 
                                ", Confirm Password: " + confirmPassword);
        } catch (Exception e) {
            throw new UserRegistrationException("Failed to enter registration details.");
        }
    }

    public void clickOnRegisterButton() throws UserRegistrationException {
        try {
            userRegistrationPage.registerButton.click();
            LogManagers.logInfo("Clicked on 'Register' button.");
        } catch (Exception e) {
            throw new UserRegistrationException("Failed to click on 'Register' button.");
        }
    }
}