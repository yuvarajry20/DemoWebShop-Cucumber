package com.Actions;

import org.openqa.selenium.support.PageFactory;

import com.Pages.AddressPage;
import com.Pages.TagsPageLocators;
import com.Utilities.HelperClass;

public class TagAction {
	
	 private TagsPageLocators tagsPage;

	    public TagAction() {
	        this.tagsPage = new TagsPageLocators();
	        PageFactory.initElements(HelperClass.getDriver(), tagsPage);
	    }
	    
	    public void clickViewAll() {
	    	tagsPage.ViewAll.click();
	    }
	    
	    public void getTaggedProducts() {
	    	System.out.println(tagsPage.getTags.getText());
	    }
        
	    public void clickDigitalLinks() {
	    	tagsPage.digitalTagLink.click();
	    }
	    
	    public void clickCellLinks() {
	    	tagsPage.cellTagLink.click();
	    }
	    public void getProductsTaggedDigital() {
	    	System.out.println(tagsPage.DigitalTagged.getText());
	    }
	    
	    public void getProductsTaggedCell() {
	    	System.out.println(tagsPage.cellTagged.getText());
	    }

}
