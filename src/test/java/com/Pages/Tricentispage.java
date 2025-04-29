package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tricentispage {
	@FindBy(xpath="//div[@class=\"slider-wrapper theme-default\"]//div//a[@href=\"https://www.tricentis.com/speed/\"]")
	public WebElement tricentisimg;
	
	@FindBy(xpath="//h1[@class=\"MastheadMinimal_h1__KxWFZ anim-delay-2 MastheadMinimal_anim-fade-in-up__litwY MastheadMinimal_anim-play__ULSBT\"]")
	public WebElement asserttextinpage;
	
	@FindBy(xpath="//div[@class=\"FooterMenuColumn_column__dy0pm\"]//a[contains(text(),\"Upcoming webinars\")]")
	public WebElement upcomingwebinar;
	
	@FindBy(xpath="//*[@id=\"filter-area\"]/form/div[2]/div[2]/span/img")
	public WebElement searchicon;

	
	@FindBy(xpath="//div[@class=\"FilterBar_search-bar__o66Q9\"]//input")
	public WebElement searchboxinfilter;
	
	@FindBy(xpath="//h2[@class=\"EventCard_title__qAh58\"]//a")
	public WebElement titleinkeyword;
	
	
	

}
