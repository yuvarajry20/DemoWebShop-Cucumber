package com.Actions;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Pages.HomePageLocators;
import com.Utilities.HelperClass;
import com.Utilities.LogManagers;

public class HomePageAction {
    HomePageLocators homePage;

    public HomePageAction() {
        this.homePage = new HomePageLocators();
        PageFactory.initElements(HelperClass.getDriver(), homePage);
    }

    public void enterNewsLetterEmail(String email) {
        new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10))
            .until(ExpectedConditions.visibilityOf(homePage.NewsLetter_email));
        homePage.NewsLetter_email.sendKeys(email);
        LogManagers.logInfo("Entered email for newsletter subscription: " + email);
    }

    public void SubscribeNewsLetter() {
        homePage.newsSubscribe.click();
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
            String productName = product.getText().trim();
            LogManagers.logInfo("- " + productName);
        }
    }

    public void SelectVotingOption() {
        homePage.VoteExcellentbtn.click();
        LogManagers.logInfo("Selected 'Excellent' voting option.");
    }

    public void voting() {
        homePage.Votebtn.click();
        LogManagers.logInfo("Clicked on 'Vote' button.");
    }

    public void ViewPollresult() {
        String resultText = homePage.votepollResults.getText();
        LogManagers.logInfo("Poll result text: " + resultText);
    }

    public void ViewPollInvalidresult() {
        String errorText = homePage.pollErrorMsg.getText();
        LogManagers.logInfo("Poll error message: " + errorText);
    }
}