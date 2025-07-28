package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tricentispage {
	@FindBy(xpath="//div[@class=\"slider-wrapper theme-default\"]//div[@id=\"nivo-slider\"]//a[@href=\"https://www.tricentis.com/speed/\"]")
	public WebElement tricentisimg;
	
	@FindBy(xpath="//div[contains(@class, \"MastheadMinimal_description\")]//preceding-sibling::h1")
	public WebElement asserttextinpage;
	
	@FindBy(xpath="//a[@class=\"TextLink_text-link__0yJX0 TextLink_hover-animation-basic__kBq59 \" and @href=\"/events\"]")
	public WebElement upcomingwebinar;
	
	@FindBy(xpath="//input[@id=\"search-field\"]")
	public WebElement searchicon;
	
	@FindBy(xpath="//div[@class=\"FilterBar_component-filter__ABjzv\"]//div[@class=\"FilterBar_search-bar__o66Q9\"]//input")
	public WebElement searchboxinfilter;
	
	@FindBy(xpath="//div[@class=\"EventCard_img-container__cEzL7\"]//following-sibling::div//a")
	public WebElement titleinkeyword;
	
	@FindBy(xpath="//a[@class=\"TextLink_text-link__0yJX0 TextLink_hover-animation-basic__kBq59 \" and @href=\"/software-testing-tool-trial-demo\"]")
	public WebElement demotrial;

	
	

}
