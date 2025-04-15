package com.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Pages.Checkoutpage;
import com.Utilities.HelperClass;

public class CheckoutAction {
	Checkoutpage CheckoutLocator=null;
	
	public CheckoutAction()
	{
		this.CheckoutLocator=new Checkoutpage();
		PageFactory.initElements(HelperClass.getDriver(), CheckoutLocator);
	}
	
	public void login()
	{
		CheckoutLocator.LoginButtonHomePages.click();
		CheckoutLocator.Emaillogin.sendKeys("abcggggg123@Gmail.com");
		CheckoutLocator.Passwordlogin.sendKeys("Divraj@1234");
		CheckoutLocator.LoginButtonclick.click();
		
	}public void serachanitem(String product)
	{
		CheckoutLocator.serachfields.sendKeys(product+Keys.ENTER);
	}
	public void addtocartanitem()
	{
		CheckoutLocator.addtocartlap.click();
		WebElement el = HelperClass.getDriver().findElement( By.cssSelector("#topcartlink > a") );
	     Actions builder = new Actions(HelperClass.getDriver());
	     builder.moveToElement( el ).click( el );
	     builder.perform();
	     
		
	}
	public void clickcheckbox()
	{
		CheckoutLocator.checkboxbtn.click();
	}
	public void isselectedcheckbox()
	{
		
		System.out.println("The checkbox is selected :"+CheckoutLocator.checkboxbtn.isSelected());
	}
	public void selectcheckout()
	{
		
		CheckoutLocator.checkoutbtn.click();
		
	}
	public void assertmsgalert()
	{
		String act="Please accept the terms of service before the next step.";
		String exp=CheckoutLocator.popupcheckboxmsg.getText();
		Assert.assertEquals(act, exp);
		System.out.println(CheckoutLocator.popupcheckboxmsg.getText());
	}
	
	public void selectaddresss()
	{
		CheckoutLocator.addressfield.click();
	}
	
	
	
	

}
