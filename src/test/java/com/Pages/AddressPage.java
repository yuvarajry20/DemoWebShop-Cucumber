package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPage {
	@FindBy(xpath="//a[contains(text(), 'abccy@gmail.com')]")
	public WebElement myEmail;

	@FindBy(xpath="//a[contains(text(), 'Addresses')]")
	public WebElement addressesLink;

	@FindBy(xpath="//a[contains(text(), 'Addresses')]/following::input[contains(@class, 'add-address-button')]")
	public WebElement addNew;

	@FindBy(xpath="//label[contains(text(), 'First name')]/following-sibling::input")
	public WebElement firstNameField;

	@FindBy(xpath="//label[contains(text(), 'Last name')]/following-sibling::input")
	public WebElement lastNameField;

	@FindBy(xpath="//label[contains(text(), 'Email')]/following-sibling::input")
	public WebElement emailField;

	@FindBy(xpath="//label[contains(text(), 'Company')]/following-sibling::input")
	public WebElement companyField;

	@FindBy(xpath="//label[contains(text(), 'Country')]/following-sibling::select")
	public WebElement countryDropdown;

	@FindBy(xpath="//label[contains(text(), 'City')]/following-sibling::input")
	public WebElement AddressCity;

	@FindBy(xpath="//label[contains(text(), 'Address')]/following-sibling::input")
	public WebElement Address1;

	@FindBy(xpath="//label[contains(text(), 'Zip')]/following-sibling::input")
	public WebElement ZipCode;

	@FindBy(xpath="//label[contains(text(), 'Phone')]/following-sibling::input")
	public WebElement PhoneNumber;

	@FindBy(xpath="//input[contains(@class, 'save-address-button')]")
	public WebElement save;

	@FindBy(xpath="//input[contains(@class, 'delete-address-button')]")
	public WebElement deleteaddress;
}
