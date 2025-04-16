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

    public void clickOnRegisterLink() {
        userRegistrationPage.registerLink.click();
        LogManagers.logInfo("Clicked on 'Register' link.");
    }

    public void selectGender() {
        userRegistrationPage.clickMale.click();
        LogManagers.logInfo("Selected 'Male' gender.");
    }

    public void enterRegistrationDetails(String firstName, String lastName, String email, String password, String confirmPassword) {
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
    }

    public void clickOnRegisterButton() {
        userRegistrationPage.registerButton.click();
        LogManagers.logInfo("Clicked on 'Register' button.");
    }
}