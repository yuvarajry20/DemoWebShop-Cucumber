package com.Actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
        Actions builder = new Actions(HelperClass.getDriver());
        builder.moveToElement(trilocate.tricentisimg).click().perform();
        LogManagers.logInfo("Successfully clicked the Tricentis image.");
    }

    public void assertpage() {
        String act = "Drive innovation at DevOps speed.";
        String exp = trilocate.asserttextinpage.getText();
        Assert.assertEquals(act, exp, "The expected text does not match the actual text.");
        LogManagers.logInfo("Successfully asserted the page text.");
    }
    
    public void upcomingevents() {
        try {
            WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(20));
            WebElement upcomingWebinarLink = wait.until(ExpectedConditions.visibilityOf(trilocate.upcomingwebinar));

            JavascriptExecutor js = (JavascriptExecutor) HelperClass.getDriver();
            js.executeScript("arguments[0].click();", upcomingWebinarLink);

            LogManagers.logInfo("Successfully clicked the 'Upcoming Webinars' link using JavaScript.");
        } catch (Exception e) {
            LogManagers.logError("Failed to click the 'Upcoming Webinars' link. Error: " + e.getMessage());
            throw e;
        }
    }

    public void listoftitleinfilters() {
        List<WebElement> obj = HelperClass.getDriver().findElements(By.xpath("//h2[@class=\"EventCard_title__qAh58\"]//a"));
        System.out.println("Upcoming webinars:");
        for (WebElement a : obj) {
            System.out.println(a.getText());
            LogManagers.logInfo("Listed upcoming webinar: " + a.getText());
        }
        String act="https://www.tricentis.com/events";
        String exp=HelperClass.getDriver().getCurrentUrl();
        Assert.assertEquals(act, exp);
        LogManagers.logInfo("Successfully listed all upcoming webinars.");
    }

    public void searchthekeyword() {
        trilocate.searchboxinfilter.sendKeys("Unlock"+Keys.ENTER);
        LogManagers.logInfo("Successfully entered the keyword 'Unlock' in the search box.");
    }

    public void unlockassert() {
        String act="https://www.tricentis.com/events";
        String exp=HelperClass.getDriver().getCurrentUrl();
        Assert.assertEquals(act, exp);
        LogManagers.logInfo("Successfully asserted the text for the upcoming partner event.");
    }
    public void trialsdemos() {
        WebElement demoTrialElement = trilocate.demotrial;
        ((JavascriptExecutor) HelperClass.getDriver()).executeScript("arguments[0].scrollIntoView(true);", demoTrialElement);

        Actions actions = new Actions(HelperClass.getDriver());
        actions.moveToElement(demoTrialElement).click().perform();
    }
    public void enterprise()
    {
    	String act="https://www.tricentis.com/solutions/speed";
    	String exp=HelperClass.getDriver().getCurrentUrl();
    	Assert.assertEquals(act, exp);
    	
    }
}