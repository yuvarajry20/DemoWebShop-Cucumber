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

    public void clickBlogLink() {
        customerServicePage.clickBloglink.click();
    }

    public String getBlogTitleText() {
        return customerServicePage.clickBlogTitle.getText();
    }

    public void clickFirstBlog() {
        customerServicePage.clickBlogTitle.click();
    }

    public void addComment(String comment) {
        customerServicePage.AddNewCommewnt.sendKeys(comment);
    }

    public void clickNewComment() {
        customerServicePage.clickNewcomment.click();
    }

    public String getResultText() {
        return customerServicePage.ResultText.getText();
    }
}