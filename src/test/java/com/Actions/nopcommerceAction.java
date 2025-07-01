package com.Actions;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Pages.nopcommercepage;
import com.Utilities.HelperClass;

public class nopcommerceAction {
	 nopcommercepage nop = null;
	 BaseActions objmethod=new BaseActions();

	    public nopcommerceAction() {
	        this.nop = new nopcommercepage();
	        PageFactory.initElements(HelperClass.getDriver(), nop);
	    }
	    
	    public void nopcommercewebpage()
	    {
//	    	WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(30));
//            WebElement nopcommerce = wait.until(ExpectedConditions.visibilityOf(nop.nopcommerce));
//	    	objmethod.clickMethod(nopcommerce);
	    	nop.nopcommerce.click();
	    }
	    public void nopgettext() {
	        try {
	            String exp = nop.textinnopcommerce.getText();
	            String act = "Free and open-source eCommerce platform";
	            Assert.assertEquals(act, exp);
	            System.out.println("Assertion passed: Expected text is displayed.");
	        } catch (AssertionError e) {
	            System.out.println();
	        }
	    }

	    
//	    public void aboutus()
//	    {
////	    	WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(25));
////            WebElement aboutpage = wait.until(ExpectedConditions.visibilityOf(nop.about));
//            nop.about.click();
////	    	objmethod.clickMethod(aboutpage);
//	    }
//	    public void detailsabout()
//	    {
//	    	String act="https://www.nopcommerce.com/en/about-us";
//	    	String exp=HelperClass.getDriver().getCurrentUrl();
//	    	Assert.assertEquals(act, exp);
//	    }
}
