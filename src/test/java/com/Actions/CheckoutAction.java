package com.Actions;

import org.openqa.selenium.support.PageFactory;

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
		
	}

}
