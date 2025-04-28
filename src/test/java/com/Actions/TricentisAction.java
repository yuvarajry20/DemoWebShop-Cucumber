package com.Actions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Pages.Tricentispage;
import com.Utilities.HelperClass;

public class TricentisAction {
	Tricentispage trilocate = null;

    public TricentisAction() {
        this.trilocate = new Tricentispage();
        PageFactory.initElements(HelperClass.getDriver(), trilocate);
    }
    
    public void tricentisimg()
    {
    	trilocate.tricentisimg.click();
    }
    public void assertpage()
    {
    	String act="Drive innovation at DevOps speed.";
    	String exp=trilocate.asserttextinpage.getText();
    	Assert.assertEquals(act, exp);
    }

}
