package com.Runner;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(plugin = {"pretty",
		"json:target/cucumber-reports/Cucumber.json",
		"html:target/cucumber-reports/Cucumber.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
features={
		"src/test/resources/Features/Login.feature",
		"src/test/resources/Features/Product.feature",
		 "src/test/resources/Features/Books.feature",
		"src/test/resources/Features/HomePage.feature",
		"src/test/resources/Features/Address.feature",
<<<<<<< HEAD
		"src/test/resources/Features/SearchFunction.feature"
=======
		"src/test/resources/Features/CheckOut.feature",
>>>>>>> branch 'master' of https://github.com/yuvarajry20/DemoWebShop-Cucumber.git
},
glue="com.Definitions")
public class runnerTestNG extends AbstractTestNGCucumberTests {
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
    	return super.scenarios();
	}
}