package com.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Pages.FooterPage;
import com.Utilities.HelperClass;

public class FooterAction {
    FooterPage footerpage;

    public FooterAction() {
        this.footerpage = new FooterPage();
        PageFactory.initElements(HelperClass.getDriver(), footerpage);
    }

    public void clickNopLink() {
        footerpage.nopFooterlink.click();
    }

//    public String getNOPText() {
//        WebDriver driver = HelperClass.getDriver();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
//            By.xpath("//h1[contains(text(),'Free and open-source eCommerce platform')]")
//        ));
//        return element.getText();
//    }
    public void assertNopCommerceUrl() {
        WebDriver driver = HelperClass.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.urlContains("nopcommerce.com"));
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.equals("https://www.nopcommerce.com/") ||
            currentUrl.equals("https://www.nopcommerce.com/en"));
    }

    public String getCurrentUrl() {
        return HelperClass.getDriver().getCurrentUrl();
    }

    public void clickSiteMapLink() {
        footerpage.siteMaplink.click();
    }

    public void clickContactUsLink() {
        footerpage.ContactUsLink.click();
    }

    public void enterDetails(String name, String email, String enquiry) {
        footerpage.ContactName.sendKeys(name);
        footerpage.ContactEmail.sendKeys(email);
        footerpage.ContactEnquiry.sendKeys(enquiry);
    }

    public void clickSubmit() {
        footerpage.ContactSubmit.click();
    }

    public String getConfirmation() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//div[@class=\"page-body\"]//child::div[@class=\"result\"]")
        ));
        return element.getText();
    }
}
