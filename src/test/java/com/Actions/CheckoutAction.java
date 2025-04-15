package com.Actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		
		WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(20));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='terms-of-service']//input")));
		element.click();
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
		CheckoutLocator.option1.click();
		
	}
	public void billcontinuebtn()
	{
		CheckoutLocator.billcontinuebtn.click();
	}
	public void storepickupbox()
	{
		CheckoutLocator.storepick.click();
	}
	public void shippingcontinue()
	{
		CheckoutLocator.shipcontinuebtn.click();
	}
	public void paymentcontinuestep()
	{
		CheckoutLocator.paymentcontinue.click();
	}
	public void paymentinfocontinue()
	{
		CheckoutLocator.paymentinfobtncontinue.click();
	}
	public void confirmcheckout()
	{
		CheckoutLocator.confirmbtnincheckout.click();
	}
	public void getplacedorder()
	{
		System.out.println(CheckoutLocator.confirmplacedoreder.getText());
		String act="Your order has been successfully processed!";
		String exp=CheckoutLocator.confirmplacedoreder.getText();
		Assert.assertEquals(act, exp);
		System.out.println(CheckoutLocator.ordernumber.getText());
		
	}
	public void invoicepdfdownload()
	{
		CheckoutLocator.invoiceclickhere.click();
		CheckoutLocator.pdfinvoice.click();
	}
	public void checkoutsteps()
	{
		List<WebElement> obj=HelperClass.getDriver().findElements(By.xpath("//div[@class=\"page-body checkout-data\"]//ol//li//div//h2"));
		System.out.println("Follow this steps to checkout");
		for(WebElement a:obj)
		{
			System.out.println(a.getText());
			
		}
	}
	
	
	
	

}
