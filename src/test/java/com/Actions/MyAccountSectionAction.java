package com.Actions;

import com.Pages.MyAccountSectionPage;
import com.Utilities.HelperClass;
import org.openqa.selenium.support.PageFactory;

public class MyAccountSectionAction {
    MyAccountSectionPage accountPage;

    public MyAccountSectionAction() {
        this.accountPage=new MyAccountSectionPage();
        PageFactory.initElements(HelperClass.getDriver(), accountPage);
    }

    public void clickCustomerInfo() {
        accountPage.clickCustomerInfo.click();
    }

    public String getFirstName() {
        return accountPage.Firstnametext.getText();
    }

    public String getLastName() {
        return accountPage.Lastnametext.getText();
    }

    public String getEmail() {
        return accountPage.Emailtext.getText();
    }

    public void clickOrders() {
        accountPage.clickorders.click();
    }
    
    public String getorder() {
    	return accountPage.orderno.getText();
    }
    
    public String getorderdate() {
    	return accountPage.orderdate.getText();
    }
    
    public void clickorderdetails() {
    	accountPage.clickorderDetails.click();
    }
    
    public String productname() {
    	return accountPage.productname.getText();
    }
    
    public void clickBackInStock() {
        accountPage.clickbackInStock.click();
    }

    public String backinstock() {
    	return accountPage.BackInStocktext.getText();
    }
    public void clickRewardPoints() {
        accountPage.clickRewardpoints.click();
    }
    
    public String currentreward() {
    	return accountPage.rewardpointstext.getText();
    }
    
    public String historyreward() {
    	return accountPage.historyreward.getText();
    }
    
    public void clickChangePassword() {
        accountPage.clickChangePassword.click();
    }

    public void changePassword() {
        accountPage.clickchangepasswordbutton.click();
    }
    
    public void oldpassword(String oldPassword) {
    	accountPage.oldpassword.sendKeys(oldPassword);
    }
    
    public void newconfirmPassword(String newPassword, String confirmPassword) {
    	accountPage.newpassword.sendKeys(newPassword);
    	accountPage.confirmnewpassword.sendKeys(confirmPassword);
    }
}