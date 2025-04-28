package com.Actions;

import com.Pages.CustomerServicePage;
import com.Utilities.HelperClass;
import org.openqa.selenium.support.PageFactory;

public class CustomerServiceAction {
    private CustomerServicePage customerServicePage;

    public CustomerServiceAction() {
        this.customerServicePage = new CustomerServicePage();
        PageFactory.initElements(HelperClass.getDriver(), customerServicePage);
    }

    public void clickNewsLink() {
        customerServicePage.clickNewslink.click();
    }

    public String getLatestNewsText() {
        return customerServicePage.getnewsText.getText();
    }
}
