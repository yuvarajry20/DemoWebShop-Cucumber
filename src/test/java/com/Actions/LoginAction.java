package com.Actions;

import com.Pages.LoginPage;
import com.Utilities.HelperClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginAction {
    LoginPage loginPage;

    public LoginAction() {
        this.loginPage = new LoginPage();
        PageFactory.initElements(HelperClass.getDriver(), loginPage);
    }

    public void clickLoginLink() {
        loginPage.clickLoginLink();
    }

    public void enterEmail(String email) {
        loginPage.enterEmail(email);
    }

    public void enterPassword(String password) {
        loginPage.enterPassword(password);
    }

    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    public void clickForgotPasswordLink() {
        loginPage.clickForgotPasswordLink();
    }

    public void clickRecoverButton() {
        loginPage.clickRecoverButton();
    }
}
