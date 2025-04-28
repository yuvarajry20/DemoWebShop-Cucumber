package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tricentispage {
	@FindBy(xpath="//div[@class=\"slider-wrapper theme-default\"]//div//a[@href=\"https://www.tricentis.com/speed/\"]")
	public WebElement tricentisimg;
	
	@FindBy(xpath="//h1[@class=\"MastheadMinimal_h1__KxWFZ anim-delay-2 MastheadMinimal_anim-fade-in-up__litwY MastheadMinimal_anim-play__ULSBT\"]")
	public WebElement asserttextinpage;
	

}
