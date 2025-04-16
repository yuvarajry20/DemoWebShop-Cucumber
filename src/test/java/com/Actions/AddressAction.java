package com.Actions;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Pages.AddressPage;
import com.Utilities.HelperClass;
import com.Utilities.ExcelReader;
import com.Utilities.LogManagers;

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

                LogManagers.logInfo("Address form filled successfully with data: " + firstName + ", " + lastName + ", " + email);
            } else {
                LogManagers.logError("Data is null or does not contain enough rows/columns.");
            }
        } catch (IOException e) {
            LogManagers.logError("Error reading Excel data: " + e.getMessage(), e);
        }
    }

    public void clickAddNew() {
        addressPage.addNew.click();
        LogManagers.logInfo("Clicked on 'Add New' button.");
    }

    public void clickSave() {
        addressPage.save.click();
        LogManagers.logInfo("Clicked on 'Save' button.");
    }

    public void clickMyEmail() {
        addressPage.myEmail.click();
        LogManagers.logInfo("Clicked on 'My Email' link.");
    }

    public void clickAddresses() {
        addressPage.addressesLink.click();
        LogManagers.logInfo("Clicked on 'Addresses' link.");
    }

    public void clickAddressesAndAddNew() {
        addressPage.addressesLink.click();
        addressPage.addNew.click();
        LogManagers.logInfo("Clicked on 'Addresses' link and then 'Add New' button.");
    }

    public void clickDeleteAddressButton() {
        addressPage.deleteaddress.click();
        LogManagers.logInfo("Clicked on 'Delete Address' button.");
    }

    public void handleAlert() {
        try {
            Alert alert = HelperClass.getDriver().switchTo().alert();
            alert.accept();
            LogManagers.logInfo("Alert handled successfully.");
        } catch (Exception e) {
            LogManagers.logError("No alert present or error handling alert: " + e.getMessage(), e);
        }
    }
}