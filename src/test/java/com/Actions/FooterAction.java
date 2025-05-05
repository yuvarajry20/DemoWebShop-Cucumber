package com.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Pages.FooterPage;
import com.Utilities.HelperClass;

public class FooterAction {
	  FooterPage footerpage;

	    public FooterAction() {
	        this.footerpage = new  FooterPage();
	        PageFactory.initElements(HelperClass.getDriver(),footerpage);
	    }

	    public void clickNopLink() {
	        footerpage.nopFooterlink.click();
	    }

	    public String getNOPText() {
	        WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10));
	        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Free and open-source eCommerce platform')]")));
	        return element.getText();
	    }

	    public String getCurrentUrl() {
	        return HelperClass.getDriver().getCurrentUrl();
	    }
	    public void clickSiteMapLink() {
	    	footerpage.siteMaplink.click();
	    }
//	    public void clickAccesoriesLink() {
//	    	footerpage.AccessoriesLink.click();
//	    }
	    public void clickContactUsLink() {
	    	footerpage.ContactUsLink.click();
	    }
	    public void enterDetails(String name,String email,String enquiry ) {
	    	footerpage.ContactName.sendKeys(name);
	    	footerpage.ContactEmail.sendKeys(email);
	    	footerpage.ContactEnquiry.sendKeys(enquiry);
	    }
	    public void clickSubmit() {
	    	footerpage.ContactSubmit.click();
	    }
	    public String getConfirmation() throws InterruptedException{
	    	 WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(30));
		     WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"result\"]")));
//		    Thread.sleep(3000); 
	    	return footerpage.ConfirmText.getText();
	    }
}
