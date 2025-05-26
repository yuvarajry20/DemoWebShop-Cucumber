package com.Definitions;

import com.Actions.MusicPageAction;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MusicStepDefinitions {
	
	 MusicPageAction musicPage = new MusicPageAction();
	 
	@When("I click the DigitalDownloads")
	public void i_click_the_digital_downloads() {
		musicPage.clickDigitalDwnld();
	   }

	@When("I click the Music2 product page")
	public void i_click_the_music2_product_page() {
		musicPage.clickMusicPage();
	  	}

	@Then("I should verify whether the Buttons are enabled or not")
	public void i_should_verify_whether_the_buttons_are_enabled_or_not() {
		musicPage.checkAddtoCart();
		musicPage.checkComparebtn();
		musicPage.checkDownloadbtn();
		musicPage.checkEmailbtn();
		musicPage.checkWishListbtn();
		
	   }




}
