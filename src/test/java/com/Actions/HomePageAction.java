package com.Actions;

import java.time.Duration;
import java.util.List;

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
            .until(ExpectedConditions.visibilityOf(homePage.NewsLetter_email));
        ((JavascriptExecutor) driver).executeScript("arguments[0].value='" + email + "';", homePage.NewsLetter_email);
        LogManagers.logInfo("Entered email for newsletter subscription: " + email);
    }

    public void SubscribeNewsLetter() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", homePage.newsSubscribe);
        LogManagers.logInfo("Clicked on 'Subscribe' button for newsletter.");
    }

    public void SuccessfulSubscription() {
        String message = homePage.SubscribedMessage.getText();
        LogManagers.logInfo("Subscription message: " + message);
    }

    public void invalidSubscription() {
        String message = homePage.InvalidsubscribeMsg.getText();
        LogManagers.logInfo("Invalid subscription message: " + message);
    }

    public void VerifyFeaturedProducts() {
        String sectionText = homePage.FeatureProductsSec.getText();
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
        String sectionText = homePage.RecentProductsSec.getText();
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
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", homePage.VoteExcellentbtn);
        LogManagers.logInfo("Selected 'Excellent' voting option.");
    }

    public void voting() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", homePage.Votebtn);
        LogManagers.logInfo("Clicked on 'Vote' button.");
    }

    public void ViewPollresult() {
    	
        String resultText = homePage.votepollResults.getText();
        LogManagers.logInfo("Poll result text: " + resultText);
    }

    public void ViewPollInvalidresult() {
    	//String actualText="Only registered users can vote.";
    	String actualText="";
        String errorText = homePage.pollErrorMsg.getText();
        Assert.assertEquals(actualText, errorText);
        LogManagers.logInfo("Poll error message: " + errorText);
    }
    public void ReturnToHomePage() {
    	homePage.ToHomePage.click();
    	LogManagers.logInfo("Returned to HomePage");
    }
}