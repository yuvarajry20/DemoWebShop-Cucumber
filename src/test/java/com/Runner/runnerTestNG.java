package com.Runner;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(plugin = {"pretty",
		"json:target/cucumber-reports/Cucumber.json",
		"html:target/cucumber-reports/Cucumber.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
features={
		// "src/test/resources/Features/Login.feature",
		// "src/test/resources/Features/Product.feature",
		"src/test/resources/Features/Books.feature",
		"src/test/resources/Features/HomePage.feature",
		// "src/test/resources/Features/Address.feature",
		//  "src/test/resources/Features/CheckOut.feature",
		// "src/test/resources/Features/MyAccountSection.feature",
        "src/test/resources/Features/SearchFunction.feature",
		//"src/test/resources/Features/UserRegistration.feature",
		 "src/test/resources/Features/Review.feature",
		 "src/test/resources/Features/Tags.feature",
		//  "src/test/resources/Features/DigitalDownload.feature",
		//  "src/test/resources/Features/Tricentis.feature",
		// "src/test/resources/Features/CustomerService.feature",
		"src/test/resources/Features/Footer.feature",
},
glue="com.Definitions")
public class runnerTestNG extends AbstractTestNGCucumberTests {
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
    	return super.scenarios();
	}
}
