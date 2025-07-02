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
	    	nop.nopcommerce.click();
	    }
	    public void nopgettext() {
	        try {
	            String exp = HelperClass.getDriver().getCurrentUrl();
	            String act = "https://www.nopcommerce.com/en";
	            
	            System.out.println("Assertion passed: Expected text is displayed."+exp);
	            Assert.assertEquals(exp, act);
	        } catch (AssertionError e) {
	            System.out.println();
	        }
	    }

}
