package com.Definitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.Utilities.HelperClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	@Before
	public static void setUp() {
		HelperClass.setupDriver();;
	}
	@After
	public static void teardown(Scenario scenario) throws IOException {
		  if (scenario.isFailed()) {
	            // Take screenshot if scenario fails
	        	File srcFile = ((TakesScreenshot) HelperClass.getDriver()).getScreenshotAs(OutputType.FILE);
	        	File destFile = new File("screenshots/" + scenario.getName() + ".png");
	        	FileUtils.copyFile(srcFile, destFile);
	        }

		HelperClass.teardown();
	}
}

