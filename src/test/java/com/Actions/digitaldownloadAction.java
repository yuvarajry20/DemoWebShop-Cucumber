package com.Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Pages.Digitaldownloadpage;
import com.Utilities.HelperClass;

public class digitaldownloadAction {
	
	Digitaldownloadpage objdigital=null;
	public digitaldownloadAction()
	{
		this.objdigital=new Digitaldownloadpage();
		PageFactory.initElements(HelperClass.getDriver(), objdigital);
	}
	

	public void Digitaldownload()
	{
		objdigital.digitaldown.click();
	}
	
	public void Assertheading()
	{
		String act="Digital downloads";
		String exp=objdigital.headingofdigital.getText();
		Assert.assertEquals(act, exp);
		
	}
	public void addtocartmusic()
	{
		objdigital.music2.click();
	}
	public void qtyproduct()
	{
		String text=objdigital.qtyproductcount.getText();
		System.out.println("the number of product in cart :"+text);
	}
	public void addfilter()
	{
		objdigital.grid.click();
		objdigital.gridopt.click();
	}
	public void listallproducts()
	{
		List<WebElement> product=HelperClass.getDriver().findElements(By.xpath("//h2[@class=\"product-title\"]//a"));
		System.out.println("the products in the digital download");
		for(WebElement a:product)
		{
			System.out.println(a.getText());
		}
	}
	

}
