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

import lombok.experimental.Helper;

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
		WebElement el = HelperClass.getDriver().findElement( By.xpath("//div[@class=\"terms-of-service\"]//input") );
	     Actions builder = new Actions(HelperClass.getDriver());
	     builder.moveToElement( el ).click( el );
	     builder.perform();
		
		
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
		WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(20));
		WebElement elements = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='section order-completed']//div[@class='title']//strong")));
		System.out.println(elements.getText());
		String act="Your order has been successfully processed!";
		String exp=elements.getText();
		Assert.assertEquals(act, exp);
		System.out.println(elements.getText());
		
	}
	public void invoicepdfdownload()
	{
		CheckoutLocator.invoiceclickhere.click();
	}
	public void pdfinvoiceclik()
	{
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
	public void detailsinvoice()
	{
		List<WebElement> obj=HelperClass.getDriver().findElements(By.xpath("//table[@class=\"cart-total\"]//tbody//tr//td//span"));
		for(WebElement a:obj)
		{
			System.out.println(a.getText());
			
		}
	}
	public void creditcardcheckbox()
	{
		CheckoutLocator.creditcheckbox.click();
	}
	public void creditvisacard(String name,String number,String expdate,String year,String code)
	{
		CheckoutLocator.cardholdername.sendKeys(name);
		CheckoutLocator.cardnumber.sendKeys(number);
		CheckoutLocator.expirymonth.sendKeys(expdate);
		CheckoutLocator.year.sendKeys(year);
		CheckoutLocator.cardcode.sendKeys(code);
		
	}
	
	
	

}
