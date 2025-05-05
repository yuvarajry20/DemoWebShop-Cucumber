package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tricentispage {
	@FindBy(xpath="//div[@class=\"nivoSlider\"]//child::a[@class=\"nivo-imageLink\"][1]")
	public WebElement tricentisimg;
	
	@FindBy(xpath="//div[@class=\"MastheadMinimal_body-p__qrVJl MastheadMinimal_description__zc_Sl anim-delay-3 MastheadMinimal_anim-fade-in-up__litwY MastheadMinimal_anim-play__ULSBT\"]//preceding-sibling::h1")
	public WebElement asserttextinpage;
	
	@FindBy(xpath="//div[@class=\"FooterMenuColumn_column__dy0pm\"]//a[contains(text(),\"Upcoming webinars\")]")
	public WebElement upcomingwebinar;
	
//	@FindBy(xpath="//input[@id=\"search-field\"]//following-sibling::span//span//child::img")
	@FindBy(xpath="//span[@style=\"box-sizing:border-box;display:block;width:initial;height:initial;background:none;opacity:1;border:0;margin:0;padding:0;max-width:100%\"]//img")
	public WebElement searchicon;
	
	@FindBy(xpath="//div[@class=\"FilterBar_component-filter__ABjzv\"]//div[@class=\"FilterBar_search-bar__o66Q9\"]//child::input")
	public WebElement searchboxinfilter;
	
	@FindBy(xpath="//div[@class=\"EventCard_img-container__cEzL7\"]//following-sibling::div//descendant::a")
	public WebElement titleinkeyword;
	
	@FindBy(xpath="//div[@class=\"FooterMenuColumn_column__dy0pm\"]//a[contains(text(),\"Demos & Trials\")]")
	public WebElement demotrial;
//	
//	@FindBy(xpath="//div[@class=\"Heading_content-copy__ZKgho  Heading_anim-play___4J_5 Heading_anim-fade-in-up__Takxt \"]//h3")
//	public WebElement testtoolslist;
	
	
	

}
