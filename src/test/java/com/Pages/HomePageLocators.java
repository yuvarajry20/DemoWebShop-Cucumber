package com.Pages;

import java.util.List;

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
    
    @FindBy(xpath="//input[@id=\"pollanswers-1\"]")
    public WebElement VoteExcellentbtn;
    
    @FindBy(xpath="//input[@id=\"vote-poll-1\"]")
    public WebElement Votebtn;
    
    @FindBy(xpath="//ul[@class=\"poll-results\"]")
    public WebElement votepollResults;
    
    @FindBy(xpath="//Strong[contains(text(),\"Recently viewed products\")]")
    public WebElement RecentProductsSec;
    
    @FindBy(xpath = "//div[@class='block block-recently-viewed-products']//li")
    public List<WebElement> recentProductList;
    
    @FindBy(xpath="//Strong[contains(text(),\"Featured products\")]")
    public WebElement FeatureProductsSec;
    
    @FindBy(xpath = "//div[@class=\"item-box\"]")
    public List<WebElement> featuredProductList;

}
