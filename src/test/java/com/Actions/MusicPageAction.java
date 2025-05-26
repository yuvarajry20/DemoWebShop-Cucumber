package com.Actions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Pages.MusicPage;
import com.Utilities.HelperClass;

public class MusicPageAction {
	  MusicPage musicPage;
	 
	    public MusicPageAction() {
	        this.musicPage = new MusicPage();
	      
	        PageFactory.initElements(HelperClass.getDriver(), musicPage);
	    }
	    public void clickDigitalDwnld() {
	    	musicPage.DigiDownloads.click();
	    }
	    public void clickMusicPage() {
	    	musicPage.MusicPage.click();
	    }
	    public void checkDownloadbtn() {
	    	 Assert.assertTrue(musicPage.downloadButton.isEnabled(), "Download Sample button is not enabled");
	    }
	    public void checkEmailbtn() {
	    	 Assert.assertTrue(musicPage.EmailFriendbtn.isEnabled(), "Email a Friend button is not enabled");
	    }
	    public void checkWishListbtn() {
	         Assert.assertTrue(musicPage.WishListbtn.isEnabled(), "Add to Wishlist button is not enabled");
	    }
	    public void checkAddtoCart() {
	    Assert.assertTrue(musicPage.AddtoCartbtn.isEnabled(), "Add to Cart button is not enabled");
	    }
	    public void checkComparebtn() {
		    Assert.assertTrue(musicPage.CompareListBtn.isEnabled(), "Compare Products button is not enabled");
		}

}
