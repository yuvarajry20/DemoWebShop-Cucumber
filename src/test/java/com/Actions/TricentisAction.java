package com.Actions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Pages.Tricentispage;
import com.Utilities.HelperClass;
import com.Utilities.LogManagers;

public class TricentisAction {
    Tricentispage trilocate = null;

    public TricentisAction() {
        this.trilocate = new Tricentispage();
        PageFactory.initElements(HelperClass.getDriver(), trilocate);
    }
    
    public void tricentisimg() {
        trilocate.tricentisimg.click();
        LogManagers.logInfo("Successfully clicked the Tricentis image.");
    }

    public void assertpage() {
        String act = "Drive innovation at DevOps speed.";
        String exp = trilocate.asserttextinpage.getText();
        Assert.assertEquals(act, exp, "The expected text does not match the actual text.");
        LogManagers.logInfo("Successfully asserted the page text.");
    }
}