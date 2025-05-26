package com.Actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.Utilities.HelperClass;

public class BaseActions {
	public void clickMethod(WebElement element)
	{
		((JavascriptExecutor) HelperClass.getDriver()).executeScript("arguments[0].click();",element);
	}
	
	public String gettexts(WebElement text) {
	    return (String) ((JavascriptExecutor) HelperClass.getDriver())
	        .executeScript("return arguments[0].innerText;", text);
	}


	
	
	

}
