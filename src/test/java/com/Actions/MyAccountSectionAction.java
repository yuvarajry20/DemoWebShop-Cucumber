package com.Actions;

import com.Pages.MyAccountSectionPage;
import com.Utilities.HelperClass;
import com.Utilities.LogManagers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MyAccountSectionAction {
    MyAccountSectionPage accountPage;

    public MyAccountSectionAction() {
        this.accountPage = new MyAccountSectionPage();
        PageFactory.initElements(HelperClass.getDriver(), accountPage);
    }

    public void clickCustomerInfo() {
        accountPage.clickCustomerInfo.click();
        LogManagers.logInfo("Clicked on 'Customer Info' link.");
    }

    public String getFirstName() {
        String firstName = accountPage.Firstnametext.getText();
        LogManagers.logInfo("Retrieved first name: " + firstName);
        return firstName;
    }

    public String getLastName() {
        String lastName = accountPage.Lastnametext.getText();
        LogManagers.logInfo("Retrieved last name: " + lastName);
        return lastName;
    }

    public String getEmail() {
        String email = accountPage.Emailtext.getText();
        LogManagers.logInfo("Retrieved email: " + email);
        return email;
    }

    public void clickOrders() {
        WebElement element = accountPage.clickorders;
        JavascriptExecutor executor = (JavascriptExecutor) HelperClass.getDriver();
        executor.executeScript("arguments[0].click();", element);
        LogManagers.logInfo("Clicked on 'Orders' link.");
    }

    public String getOrder() {
        String order = accountPage.orderno.getText();
        LogManagers.logInfo("Retrieved order number: " + order);
        return order;
    }

    public String getOrderDate() {
        String orderDate = accountPage.orderdate.getText();
        LogManagers.logInfo("Retrieved order date: " + orderDate);
        return orderDate;
    }

    public void clickOrderDetails() {
        accountPage.clickorderDetails.click();
        LogManagers.logInfo("Clicked on 'Order Details' link.");
    }

    public String getProductName() {
        String productName = accountPage.productname.getText();
        LogManagers.logInfo("Retrieved product name: " + productName);
        return productName;
    }

    public void clickBackInStock() {
        accountPage.clickbackInStock.click();
        LogManagers.logInfo("Clicked on 'Back In Stock' link.");
    }

    public String getBackInStockText() {
        String backInStockText = accountPage.BackInStocktext.getText();
        LogManagers.logInfo("Retrieved 'Back In Stock' text: " + backInStockText);
        return backInStockText;
    }

    public void clickRewardPoints() {
        accountPage.clickRewardpoints.click();
        LogManagers.logInfo("Clicked on 'Reward Points' link.");
    }

    public String getCurrentRewardPoints() {
        String currentRewardPoints = accountPage.rewardpointstext.getText();
        LogManagers.logInfo("Retrieved current reward points: " + currentRewardPoints);
        return currentRewardPoints;
    }

    public String getHistoryRewardPoints() {
        String historyRewardPoints = accountPage.historyreward.getText();
        LogManagers.logInfo("Retrieved history reward points: " + historyRewardPoints);
        return historyRewardPoints;
    }

    public void clickChangePassword() {
        WebElement element = accountPage.clickChangePassword;
        JavascriptExecutor executor = (JavascriptExecutor) HelperClass.getDriver();
        executor.executeScript("arguments[0].click();", element);
        LogManagers.logInfo("Clicked on 'Change Password' link.");
    }

    public void changePassword() {
        accountPage.clickchangepasswordbutton.click();
        LogManagers.logInfo("Clicked on 'Change Password' button.");
    }

    public void enterOldPassword(String oldPassword) {
        accountPage.oldpassword.sendKeys(oldPassword);
        LogManagers.logInfo("Entered old password.");
    }

    public void enterNewConfirmPassword(String newPassword, String confirmPassword) {
        accountPage.newpassword.sendKeys(newPassword);
        accountPage.confirmnewpassword.sendKeys(confirmPassword);
        LogManagers.logInfo("Entered new password and confirmation.");
    }
}