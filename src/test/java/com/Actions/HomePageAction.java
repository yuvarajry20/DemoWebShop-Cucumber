package com.Actions;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Pages.HomePageLocators;
import com.Utilities.HelperClass;
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
    	
    }
     