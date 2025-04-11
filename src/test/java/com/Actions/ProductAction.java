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
		String numberofproduct=ProductPageLocator.AddTocartnumber.getText();
		System.out.println("the number of product :"+numberofproduct);
		
	}

}
