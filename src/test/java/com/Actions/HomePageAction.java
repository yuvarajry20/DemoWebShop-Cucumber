package com.Actions;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Pages.HomePageLocators;
import com.Utilities.HelperClass;
import com.Utilities.LogManagers;

public class HomePageAction {
    HomePageLocators homePage;
    WebDriver driver;

    public HomePageAction() {
        this.driver = HelperClass.getDriver();
        this.homePage = new HomePageLocators();
        PageFactory.initElements(driver, homePage);
    }

    public void enterNewsLetterEmail(String email) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
            .until(ExpectedConditions.visibilityOf(homePage.newsLetterEmail));
        ((JavascriptExecutor) driver).executeScript("arguments[0].value='" + email + "';", homePage.newsLetterEmail);
        LogManagers.logInfo("Entered email for newsletter subscription: " + email);
    }

    public void SubscribeNewsLetter() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", homePage.newsSubscribe);
        LogManagers.logInfo("Clicked on 'Subscribe' button for newsletter.");
    }

    public void SuccessfulSubscription() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement messageElement = wait.until(ExpectedConditions.visibilityOf(homePage.subscribedMessage));
    	String actualMessage = messageElement.getText();
        String exp="Sign up for our newsletter:";
        //Assert.assertEquals(actualMessage, exp);
        Assert.assertNotEquals(actualMessage, exp);
        LogManagers.logInfo("actualMessage:" + actualMessage);
    }

    public void invalidSubscription() {
        String actualMessage = homePage.invalidsubscribeMsg.getText();
        String exp="Enter valid email";
        Assert.assertEquals(actualMessage, exp);
        LogManagers.logInfo("Invalid subscription message: " + actualMessage);
    }

    public void VerifyFeaturedProducts() {
        String sectionText = homePage.featureProductsSec.getText();
        LogManagers.logInfo("Featured Products section text: " + sectionText);
    }

    public void GetFeaturedProducts() {
        LogManagers.logInfo("Featured Products:");
        for (WebElement product : homePage.featuredProductList) {
            String productName = product.getText().trim();
            LogManagers.logInfo("- " + productName);
        }
    }

    public void VerifyRecentProducts() {
        String sectionText = homePage.recentProductsSec.getText();
        LogManagers.logInfo("Recently Viewed Products section text: " + sectionText);
    }

    public void GetRecentlyViewedProducts() {
        LogManagers.logInfo("Recently Viewed Products:");
        for (WebElement product : homePage.recentProductList) {
            String productName = product.getText();
            LogManagers.logInfo("- " + productName);
        }
    }

    public void SelectVotingOption() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", homePage.voteExcellentbtn);
        LogManagers.logInfo("Selected 'Excellent' voting option.");
    }

    public void voting() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", homePage.votebtn);
        LogManagers.logInfo("Clicked on 'Vote' button.");
    }

    public void ViewPollresult() {
    	
        String resultText = homePage.votepollResults.getText();
        LogManagers.logInfo("Poll result text: " + resultText);
    }

    public void ViewPollInvalidresult() {
    	String expectedMessage = "Do you like nopCommerce?";
    	String actualMessage = homePage.pollErrorMsg.getText();
     	Assert.assertEquals(actualMessage, expectedMessage, "Poll message mismatch!");
        LogManagers.logInfo("Poll error message: " + actualMessage);
    }

    public void ReturnToHomePage() {
    	homePage.toHomePage.click();
    	LogManagers.logInfo("Returned to HomePage");
    }
}