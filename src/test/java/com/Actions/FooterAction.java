package com.Actions;

import org.openqa.selenium.support.PageFactory;

import com.Pages.FooterPage;
import com.Utilities.HelperClass;

public class FooterAction {
	  FooterPage footerpage;

	    public FooterAction() {
	        this.footerpage = new  FooterPage();
	        PageFactory.initElements(HelperClass.getDriver(),footerpage);
	    }

	    public void clickNopLink() {
	        footerpage.Footerlink.click();
	    }

	    public String getNOPText() {
	        return footerpage.nopCommerceText.getText();
	    }
	    public String getCurrentUrl() {
	        return HelperClass.getDriver().getCurrentUrl();
	    }


}
