package com.Actions;

import org.openqa.selenium.support.PageFactory;

import com.Pages.LoginPage;
import com.Utilities.HelperClass;
import com.Utilities.LogManagers;

public class LoginAction {
    LoginPage loginPage;

    public LoginAction() {
        this.loginPage = new LoginPage();
        PageFactory.initElements(HelperClass.getDriver(), loginPage);
    }

    public void clickLoginLink() {
        loginPage.clickLoginLink();
        LogManagers.logInfo("Clicked on 'Login' link.");
    }

    public void enterEmail(String email) {
        loginPage.enterEmail(email);
        LogManagers.logInfo("Entered email: " + email);
    }

    public void enterPassword(String password) {
        loginPage.enterPassword(password);
        LogManagers.logInfo("Entered password: " + password);
    }

    public void clickLoginButton() {
        loginPage.clickLoginButton();
        LogManagers.logInfo("Clicked on 'Login' button.");
    }

    public void clickForgotPasswordLink() {
        loginPage.clickForgotPasswordLink();
        LogManagers.logInfo("Clicked on 'Forgot password?' link.");
    }

    public void clickRecoverButton() {
        loginPage.clickRecoverButton();
        LogManagers.logInfo("Clicked on 'Recover' button.");
    }
}