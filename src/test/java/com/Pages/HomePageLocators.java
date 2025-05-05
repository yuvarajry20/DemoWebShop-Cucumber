package com.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	@FindBy(xpath = "//form[@id='newsletter-subscribe-form']/child::input[@id='newsletter-email']")
	public WebElement NewsLetter_email;

	@FindBy(xpath = "//input[@id='newsletter-email']/following-sibling::input[@id='newsletter-subscribe-button']")
	public WebElement newsSubscribe;

	@FindBy(xpath = "//div[@id='newsletter-subscribe-block']/child::div[@id='newsletter-result-block']")
	public WebElement SubscribedMessage;

	@FindBy(xpath = "//div[contains(text(),'Enter valid email')]/parent::div")
	public WebElement InvalidsubscribeMsg;

	@FindBy(xpath="//input[@id=\"pollanswers-1\"]")
    public WebElement VoteExcellentbtn;

	@FindBy(xpath = "//input[@id='pollanswers-1']/following::input[@id='vote-poll-1']")
	public WebElement Votebtn;

	@FindBy(xpath = "//div[@class='poll-results-container']//child::ul[@class='poll-results']")
	public WebElement votepollResults;

	@FindBy(xpath = "//input[@id='vote-poll-1']/following-sibling::div[@id='block-poll-vote-error-1']")
	public WebElement pollErrorMsg;

	@FindBy(xpath = "//strong[contains(text(),'Recently viewed products')]")
	public WebElement RecentProductsSec;

	@FindBy(xpath = "//strong[contains(text(),'Recently viewed products')]/following::ul[1]/child::li")
	public List<WebElement> recentProductList;

	@FindBy(xpath = "//strong[contains(text(),'Featured products')]")
	public WebElement FeatureProductsSec;

	 @FindBy(xpath = "//div[@class=\"item-box\"]")
     public List<WebElement> featuredProductList;

	@FindBy(xpath = "//div[@class='header-logo']/child::a")
	public WebElement ToHomePage;

//	@FindBy(xpath="//input[@id=\"newsletter-email\"]")
//	public WebElement NewsLetter_email;
//	
//    @FindBy(xpath="//input[@id=\"newsletter-subscribe-button\"]")
//    public WebElement newsSubscribe;
//    
//    @FindBy(xpath="//div[@id=\"newsletter-result-block\"]")
//    public WebElement SubscribedMessage;
//    
//    @FindBy(xpath="//div[contains(text(),\"Enter valid email\")]")
//    public WebElement InvalidsubscribeMsg;
//    
//    @FindBy(xpath="//input[@id=\"pollanswers-1\"]")
//    public WebElement VoteExcellentbtn;
//    
//    @FindBy(xpath="//input[@id=\"vote-poll-1\"]")
//    public WebElement Votebtn;
//    
//    @FindBy(xpath="//ul[@class=\"poll-results\"]")
//    public WebElement votepollResults;
//    
//    @FindBy(xpath="//div[@id=\"block-poll-vote-error-1\"]")
//    public WebElement pollErrorMsg;
//    
//    @FindBy(xpath="//Strong[contains(text(),\"Recently viewed products\")]")
//    public WebElement RecentProductsSec;
//    
//    @FindBy(xpath = "//div[@class='block block-recently-viewed-products']//li")
//    public List<WebElement> recentProductList;
//    
//    @FindBy(xpath="//Strong[contains(text(),\"Featured products\")]")
//    public WebElement FeatureProductsSec;
//    
//    @FindBy(xpath = "//div[@class=\"item-box\"]")
//    public List<WebElement> featuredProductList;
//    
//    @FindBy(xpath="//div[@class=\"header-logo\"]//a")
//    public WebElement ToHomePage;

}
