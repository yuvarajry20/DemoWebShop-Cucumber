package com.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	
	@FindBy(xpath="//div[@class=\"footer\"]//descendant::a")
	public WebElement getlinkfooter;

	@FindBy(xpath="//input[@id=\"newsletter-email\"]")
	public WebElement newsLetterEmail;
	
    @FindBy(xpath="//input[@id=\"newsletter-subscribe-button\"]")
    public WebElement newsSubscribe;
    
    @FindBy(xpath="//div[@id=\"newsletter-result-block\"]")
    public WebElement subscribedMessage;
    
    @FindBy(xpath="//div[contains(text(),\"Enter valid email\")]")
    public WebElement invalidsubscribeMsg;
    
    @FindBy(xpath="//input[@id=\"pollanswers-1\"]")
    public WebElement voteExcellentbtn;
    
    @FindBy(xpath="//input[@id=\"vote-poll-1\"]")
    public WebElement votebtn;
    
    @FindBy(xpath="//ul[@class=\"poll-results\"]")
    public WebElement votepollResults;
    
    //@FindBy(xpath="//div[@id=\"block-poll-vote-error-1\"]")
    @FindBy(xpath="//div[@class=\"poll\"]//child::strong")
    public WebElement pollErrorMsg;
    
    @FindBy(xpath="//Strong[contains(text(),\"Recently viewed products\")]")
    public WebElement recentProductsSec;
    
    @FindBy(xpath = "//div[@class='block block-recently-viewed-products']//li")
    public List<WebElement> recentProductList;
    
    @FindBy(xpath="//Strong[contains(text(),\"Featured products\")]")
    public WebElement featureProductsSec;
    
    @FindBy(xpath = "//div[@class=\"item-box\"]")
    public List<WebElement> featuredProductList;
    
    @FindBy(xpath="//div[@class=\"header-logo\"]//a")
    public WebElement toHomePage;

}
