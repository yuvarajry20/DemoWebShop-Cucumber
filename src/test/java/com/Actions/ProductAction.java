package com.Actions;

import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import com.Pages.ProductPage;
import com.Utilities.HelperClass;import com.mongodb.management.NullMBeanServer;

public class ProductAction {
	ProductPage ProductPageLocator=null;
	String strusername,strpassword;
	
	public ProductAction()
	{
		this.ProductPageLocator=new ProductPage();
		PageFactory.initElements(HelperClass.getDriver(), ProductPageLocator);
	}
	
	public void login()
	{
		ProductPageLocator.LoginButtonHomePage.click();
		ProductPageLocator.EmailField.sendKeys("abcggggg123@Gmail.com");
		ProductPageLocator.PasswordField.sendKeys("Divraj@1234");
		ProductPageLocator.LoginButtonSubmit.click();
		
	}
	public void SearchFeildStore(String product)
	{
		ProductPageLocator.SearchStoreField.sendKeys(product+Keys.ENTER);
	}
	public String GetTitleOfProduct()
	{
		String title=ProductPageLocator.ProductTitle.getText();
		return title;	
	}
	public void clickAddTocart()
	{
		ProductPageLocator.AddToCart.click();
	}
	public void AddTocartMessage()
	{
		try 
		{
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String numberofproduct=ProductPageLocator.AddTocartnumber.getText();
		System.out.println("the Number of product :"+numberofproduct);
		
	}
	public void Shopping_cart()
	{
		ProductPageLocator.AddToCart.click();
		ProductPageLocator.shoppingcart.click();
		System.out.println("The product is available in the cart :"+ProductPageLocator.cartproductavailable.getText());
	}
	public void updatecartbyremove()
	{
		ProductPageLocator.removefromcart.click();
		ProductPageLocator.updatecart.click();
	}
	
	public void emptycarts()
	{
		String act="\r\n"
				+ "    \r\n"
				+ "    \r\n"
				+ "Your Shopping Cart is empty!    ";
		String exp=ProductPageLocator.emptycart.getText();
		System.out.println(exp);
	}
	

}
