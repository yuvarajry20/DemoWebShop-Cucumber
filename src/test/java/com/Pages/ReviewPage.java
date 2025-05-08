package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewPage {
	
	@FindBy(xpath="(//a[contains(text(),\"Gift Cards\")])[3]")
	public WebElement giftCategory;
	
	@FindBy(xpath="//a[contains(text(),\"$50 Physical Gift Card\")]")
	public WebElement giftCard;
	
	@FindBy(xpath="//div[@class=\"product-review-links\"]//a[1]")
	public WebElement reviews;
	
	@FindBy(xpath="//div[@class=\"product-review-item\"][1]")
	public WebElement comment_box;
	
	@FindBy(xpath="//div[@class=\"product-review-links\"]//a[2]")
	public WebElement addReview;
	
	@FindBy(xpath="//div[@class=\"validation-summary-errors\"]")
	public WebElement registerError;
	
	@FindBy(xpath="//input[@name=\"add-review\"]")
	public WebElement submitReview;
	
	@FindBy(xpath="//input[@name=\"AddProductReview.Title\"]")
	public WebElement reviewTitle;
	
	@FindBy(xpath="//textarea[@class=\"review-text\"]")
	public WebElement reviewText;
	
	@FindBy(xpath="//span[@data-valmsg-for=\"AddProductReview.Title\"]")
	public WebElement blanktitle;
	
	@FindBy(xpath="//span[@data-valmsg-for=\"AddProductReview.ReviewText\"]")
	public WebElement blanktext;
	
	@FindBy(xpath="//div[@class=\"result\"]")
	public WebElement reviewSuccess;
	
	@FindBy(xpath="//input[@id=\"addproductrating_3\"]")
	public WebElement ratingButton;
	
	

}
