package com.Actions;

import org.openqa.selenium.support.PageFactory;

import com.Pages.TagsPageLocators;
import com.Utilities.HelperClass;
import com.Utilities.LogManagers;

public class TagAction {
    private TagsPageLocators tagsPage;

    public TagAction() {
        this.tagsPage = new TagsPageLocators();
        PageFactory.initElements(HelperClass.getDriver(), tagsPage);
    }

    public void clickViewAll() {
        tagsPage.ViewAll.click();
        LogManagers.logInfo("Clicked on 'View All' link.");
    }

    public void getTaggedProducts() {
        String taggedProductsText = tagsPage.getTags.getText();
        LogManagers.logInfo("Tagged products text: " + taggedProductsText);
    }

    public void clickDigitalLinks() {
        tagsPage.digitalTagLink.click();
        LogManagers.logInfo("Clicked on 'Digital' tag link.");
    }

    public void clickCellLinks() {
        tagsPage.cellTagLink.click();
        LogManagers.logInfo("Clicked on 'Cell' tag link.");
    }

    public void getProductsTaggedDigital() {
        String digitalTaggedText = tagsPage.DigitalTagged.getText();
        LogManagers.logInfo("Products tagged with 'Digital': " + digitalTaggedText);
    }

    public void getProductsTaggedCell() {
        String cellTaggedText = tagsPage.cellTagged.getText();
        LogManagers.logInfo("Products tagged with 'Cell': " + cellTaggedText);
    }
}