package com.Actions;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Pages.HomePageLocators;
import com.Utilities.HelperClass;
public class HomePageAction {
   
	HomePageLocators homePage;
	
    public HomePageAction() 
    {
	        this.homePage = new HomePageLocators();
	        PageFactory.initElements(HelperClass.getDriver(), homePage);
	    
    }
    	    public void enterNewsLetterEmail(String email) {
    		    new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10))
    		        .until(ExpectedConditions.visibilityOf(homePage.NewsLetter_email));
    		    homePage.NewsLetter_email.sendKeys(email);
    		}

    	 public void SubscribeNewsLetter() {
    		 homePage.newsSubscribe.click();
    	 }
    	 public void SuccessfulSubscription() {
    		 homePage.SubscribedMessage.getText();
    		 System.out.println( homePage.SubscribedMessage.getText());
    	 }
    	 public void invalidSubscription() {
    		 System.out.println(homePage.InvalidsubscribeMsg.getText());
    		 
    	 }
    	 
    	 public void VerifyFeaturedProducts() {
    		 System.out.println( homePage.FeatureProductsSec.getText());
    	 }
    	 public void GetFeaturedProducts() {
    		    System.out.println("Featured Products:");

    		    for (WebElement product : homePage.featuredProductList) {
    		        String productName = product.getText().trim();
    		        System.out.println("- " + productName);
    		    }
    		}
    	 public void VerifyRecentProducts() {
    		 System.out.println( homePage.RecentProductsSec.getText());
    	 }
    	 public void GetRecentlyViewedProducts() {
    		    System.out.println("Recently Viewed Products:");

    		    for (WebElement product : homePage.recentProductList) {
    		        String productName = product.getText().trim();
    		        System.out.println("- " + productName);
    		    }
           }
    	public void SelectVotingOption() {
    		 homePage.VoteExcellentbtn.click();
    	 }
    	 public void voting() {
    		 homePage.Votebtn.click();
    	 }
    	 public void ViewPollresult() {
    		 System.out.println( homePage.votepollResults.getText());
    	 }
    	 public void ViewPollInvalidresult() {
    		 System.out.println( homePage.pollErrorMsg.getText());
    	 }
    	 

}
     