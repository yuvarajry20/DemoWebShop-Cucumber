package com.Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.Pages.ProductPage;
import com.Utilities.HelperClass;

public class ProductAction {
	ProductPage ProductPageLocator=null;
	String strusername,strpassword,urlexp;
	
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
		WebElement el = HelperClass.getDriver().findElement( By.cssSelector("#topcartlink > a") );
	     Actions builder = new Actions(HelperClass.getDriver());
	     builder.moveToElement( el ).click( el );
	     builder.perform();
		//ProductPageLocator.shoppingcart.click();
		System.out.println("The product is available in the cart is :"+ProductPageLocator.cartproductavailable.getText());
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
	public void addtowishlist()
	{
		ProductPageLocator.imgalbum3.click();
		ProductPageLocator.addtowishlist.click();
		ProductPageLocator.clickwishlist.click();
	}
	
	public void urlwishlist()
	{
		System.out.println("Your wishlist URL for sharing:"+ProductPageLocator.urlforwishlist.getText());
		this.urlexp=ProductPageLocator.urlforwishlist.getText();
		ProductPageLocator.urlforwishlist.click();
	}
	public void urlautolist()
	{
		String exp=HelperClass.getDriver().getCurrentUrl();
		urlexp.contains(exp);
	}
	
	public void increaseqty()
	{
		ProductPageLocator.imgalbum3.click();
		ProductPageLocator.increaseqty.clear();
		ProductPageLocator.increaseqty.sendKeys("10");
		ProductPageLocator.addtocartinqty.click();
		WebElement el = HelperClass.getDriver().findElement( By.cssSelector("#topcartlink > a") );
	     Actions builder = new Actions(HelperClass.getDriver());
	     builder.moveToElement( el ).click( el );
	     builder.perform();
		//ProductPageLocator.shoppingcart.click();
		
	}
	public void updatedqtyinwishlist()  
	{
		List<WebElement> obj=HelperClass.getDriver().findElements(By.xpath("//table[@class=\"cart-total\"]//tr//td//span"));
		for(WebElement a:obj)
		{
			System.out.println(a.getText());
			
		}
	}
	public void emailafriend()
	{
		ProductPageLocator.giftcardpage.click();
	}
	public void emailfriendbutton()
	{
		ProductPageLocator.emailfriendbtn.click();
	}
	
	public void emailfriendsend(String frdemail,String myemail)
	{
		ProductPageLocator.friendemail.sendKeys(frdemail);
		ProductPageLocator.myemail.clear();
		ProductPageLocator.myemail.sendKeys(myemail);
	}
	public void sendmailfriend()
	{
		ProductPageLocator.sendmail.click();
	}
	public void successfulmailsend()
	{
		String act="Your message has been sent.";
		System.out.println(ProductPageLocator.successfulsentmail.getText());
		String exp=ProductPageLocator.successfulsentmail.getText();
		Assert.assertEquals(act, exp);
	}
	public void unsuccessfulmailsend()
	{
		String act="Wrong email";
		System.out.println(ProductPageLocator.invalidemailmsg.getText());
		String exp=ProductPageLocator.invalidemailmsg.getText();
		Assert.assertEquals(act, exp);
	}
	public void addtocartcheckboxs()
	{
		ProductPageLocator.addtocartcheckbox.click();
		ProductPageLocator.addtocartbtnbelowchkbox.click();
	}
	
	public void verifytextincart()
	{
		String textincart="3rd Album";
		String exp=ProductPageLocator.assertcartwishlist.getText();
		Assert.assertEquals(textincart, exp);
	}
	
	public void addlaptopcart()
	{
		ProductPageLocator.SearchStoreField.sendKeys("laptop"+Keys.ENTER);
		ProductPageLocator.AddToCart.click();
		WebElement el = HelperClass.getDriver().findElement( By.cssSelector("#topcartlink > a") );
	     Actions builder = new Actions(HelperClass.getDriver());
	     builder.moveToElement( el ).click( el );
	     builder.perform();
		//ProductPageLocator.shoppingcart.click();
	}
	
	public void countrypin(String country,String pincode)
	{
		Select dropdown = new Select(HelperClass.getDriver().findElement(By.xpath("//*[@id=\"CountryId\"]")));
		dropdown.selectByVisibleText(country);
		ProductPageLocator.zipcode.sendKeys(pincode);
		ProductPageLocator.shippingestimate.click();
	}
	
	public void estimateshippingdetails()
	{
		List<WebElement> obj=HelperClass.getDriver().findElements(By.xpath("//ul[@class=\"shipping-results\"]//li//strong"));
		System.out.println("Shipping Estimate ways :");
		for(WebElement a:obj)
		{
			System.out.println(a.getText());
			
		}
		
		
	}

	

}