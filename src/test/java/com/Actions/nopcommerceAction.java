package com.Actions;

import org.openqa.selenium.support.PageFactory;
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
	    	objmethod.clickMethod(nop.nopcommerce);
	    }
	    public void nopgettext()
	    {
	    	String exp=nop.textinnopcommerce.getText();
	    	String act="Free and open-source eCommerce platform";
	    	Assert.assertEquals(act, exp);
	    	
	    }
	    
	    public void aboutus()
	    {
	    	objmethod.clickMethod(nop.about);
	    }
	    public void detailsabout()
	    {
	    	String act="https://www.nopcommerce.com/en/about-us";
	    	String exp=HelperClass.getDriver().getCurrentUrl();
	    	Assert.assertEquals(act, exp);
	    }
}
