package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerServicePage {
	@FindBy(xpath="//a[text()='News']")
	public WebElement clickNewslink;

	@FindBy(xpath="//a[text()='News']/ancestor::div/descendant::a[@class='news-title']")
	public WebElement getnewsText;

	@FindBy(xpath="//a[text()='Blog']")
	public WebElement clickBloglink;

	@FindBy(xpath="//a[text()='Blog']/ancestor::div/descendant::a[@class='post-title']")
	public WebElement clickBlogTitle;

	@FindBy(id="AddNewComment_CommentText")
	public WebElement AddNewComment;

	@FindBy(xpath="//input[@class='button-1 blog-post-add-comment-button']")
	public WebElement clickNewcomment;

	@FindBy(xpath="//div[text()='Blog comment is successfully added.']")
	public WebElement ResultText;
}
