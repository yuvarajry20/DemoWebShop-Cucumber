package com.Actions;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Pages.AddressPage;
import com.Utilities.HelperClass;
import com.Utilities.ExcelReader;

public class AddressAction {
    AddressPage addressPage;

    public AddressAction() {
        this.addressPage = new AddressPage();
        PageFactory.initElements(HelperClass.getDriver(), addressPage);
    }

    public void fillAddressForm() {
        String filePath = "src/test/resources/testdataExcel.xlsx";
        String sheetName = "AddressData";

        ExcelReader excelReader = new ExcelReader();
        try {
            String[][] data = excelReader.getExcelData(filePath, sheetName);

            if (data.length > 1) {
                String firstName = data[1][0];
                String lastName = data[1][1];
                String email = data[1][2];
                String company = data[1][3];
                String country = data[1][4];
                String city = data[1][5];
                String address1 = data[1][6];
                String zipCode = data[1][7];
                String phoneNumber = data[1][8];

                addressPage.firstNameField.sendKeys(firstName);
                addressPage.lastNameField.sendKeys(lastName);
                addressPage.emailField.sendKeys(email);
                addressPage.companyField.sendKeys(company);
                new Select(addressPage.countryDropdown).selectByVisibleText(country);
                addressPage.AddressCity.sendKeys(city);
                addressPage.Address1.sendKeys(address1);
                addressPage.ZipCode.sendKeys(zipCode);
                addressPage.PhoneNumber.sendKeys(phoneNumber);
            } else {
                System.out.println("Data is null or does not contain enough rows/columns.");
            }
        } catch (IOException e) {
            System.out.println("Error reading Excel data: " + e.getMessage());
        }
    }

    public void clickAddNew() {
        addressPage.addNew.click();
    }

    public void clickSave() {
        addressPage.save.click();
    }

    public void clickMyEmail() {
        addressPage.myEmail.click();
    }
    
    public void clickAddresses() {
    	addressPage.addressesLink.click();
    }
    public void clickAddressesAndAddNew() {
        addressPage.addressesLink.click();
        addressPage.addNew.click();
    }
    
    public void clickDeleteAddressButton() {
    	addressPage.deleteaddress.click();
   
    }
    
    public void handleAlert() {
        try {
            Alert alert = HelperClass.getDriver().switchTo().alert();
            alert.accept();
        } catch (Exception e) {
            System.out.println("No alert present or error handling alert: " + e.getMessage());
        }
    }
}