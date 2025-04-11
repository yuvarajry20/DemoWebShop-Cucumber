package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	@FindBy(xpath="//input[@id=\"newsletter-email\"]")
	public WebElement NewsLetter_email;
	
    @FindBy(xpath="//input[@id=\"newsletter-subscribe-button\"]")
    public WebElement newsSubscribe;
    
    @FindBy(xpath="//div[@id=\"newsletter-result-block\"]")
    public WebElement SubscribedMessage;
    
    @FindBy(xpath="//div[contains(text(),\"Enter valid email\")]")
    public WebElement InvalidsubscribeMsg;
    

}
