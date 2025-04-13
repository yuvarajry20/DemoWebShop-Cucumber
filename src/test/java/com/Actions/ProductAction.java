package com.Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
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
		ProductPageLocator.AddToCart.click();
		ProductPageLocator.shoppingcart.click();
<<<<<<< HEAD
		System.out.println("The product is available in the cart is :"+ProductPageLocator.cartproductavailable.getText());
=======
		System.out.println("The product is available in the cart :"+ProductPageLocator.cartproductavailable.getText());
>>>>>>> f7a2d3001ebb8092bb3a31b11be4ef7f18a67df0
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
		ProductPageLocator.shoppingcart.click();
		
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
	

}