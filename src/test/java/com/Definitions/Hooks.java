package com.Definitions;

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
	public static void teardown(Scenario scenario) {
		HelperClass.teardown();
	}
}

