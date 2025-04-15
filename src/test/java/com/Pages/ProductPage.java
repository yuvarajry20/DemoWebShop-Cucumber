package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage 
{
	@FindBy(xpath="//li//a[@class=\"ico-login\"]")
	public WebElement LoginButtonHomePage;
	
	@FindBy(id = "Email")
	public WebElement EmailField;
	
	@FindBy(id = "Password")
	public WebElement PasswordField;
	
	@FindBy(xpath="//input[@class=\"button-1 login-button\"]")
	public WebElement LoginButtonSubmit;
	
	@FindBy(xpath="//input[@id=\"small-searchterms\"]")
	public WebElement SearchStoreField;
	
	@FindBy(xpath="//h2[@class=\"product-title\"]")
	public WebElement ProductTitle;
	
	@FindBy(xpath="//input[@class=\"button-2 product-box-add-to-cart-button\"]")
	public WebElement AddToCart;
	
	@FindBy(xpath="//span[@class=\"cart-qty\"]")
	public WebElement AddTocartnumber;
	
	@FindBy(xpath="//*[@id=\"topcartlink\"]/a")
	public WebElement shoppingcart;
	
	@FindBy(xpath="//input[@name=\"removefromcart\"]")
	public WebElement removefromcart;
	
	@FindBy(xpath="//input[@class=\"button-2 update-cart-button\"]")
	public WebElement updatecart;
	
	@FindBy(xpath="//div[@class=\"order-summary-content\"]")
	public WebElement emptycart;
	
	@FindBy(xpath="//a[@class=\"product-name\"]")
	public WebElement cartproductavailable;
	
	@FindBy(id="add-to-wishlist-button-53")
	public WebElement addtowishlist;
	
	@FindBy(xpath="//ul/li[4]/a[@class=\"ico-wishlist\"]")
	public WebElement clickwishlist;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/div/div[1]/a")
	public WebElement imgalbum3;
	
	@FindBy(xpath="//tbody/tr/td[4]/a")
	public WebElement productnameinwishlist;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[2]/p[2]/a")
	public WebElement urlforwishlist;
	
	@FindBy(xpath="//input[@class=\"qty-input\"]")
	public WebElement increaseqty;
	
	@FindBy(xpath = "//input[@class=\"button-1 add-to-cart-button\"]")
	public WebElement addtocartinqty;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[2]/div/div[2]/h2/a")
	public WebElement giftcardpage;
	
	@FindBy(xpath="//input[@class=\"button-2 email-a-friend-button\"]")
	public WebElement emailfriendbtn;
	
	@FindBy(xpath="//input[@class=\"friend-email\"]")
	public WebElement friendemail;
	
	@FindBy(xpath="//input[@class=\"your-email\"]")
	public WebElement myemail;
	
	@FindBy(xpath="//input[@class=\"button-1 send-email-a-friend-button\"]")
	public WebElement sendmail;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]")
	public WebElement successfulsentmail;
	
	@FindBy(xpath="//span[@class=\"field-validation-error\"]//span")
	public WebElement invalidemailmsg;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[1]/form/table/tbody/tr/td[2]/input")
	public WebElement addtocartcheckbox;
	
	@FindBy(xpath="//input[@class=\"button-2 wishlist-add-to-cart-button\"]")
	public WebElement addtocartbtnbelowchkbox;
	
	@FindBy(xpath="//a[@class=\"product-name\"]")
	public WebElement assertcartwishlist;	
	
}