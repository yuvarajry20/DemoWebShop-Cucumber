package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NextandPreviousPage {
	@FindBy(xpath = "(//a[@href='/apparel-shoes'])[1]")
	public WebElement clickapparelShoes;
	
	@FindBy(xpath="//a[text()='Next']")
	public WebElement clickNext;
	
	@FindBy(xpath="//a[text()='Previous']")
	public WebElement clickPrevious;
	
}
