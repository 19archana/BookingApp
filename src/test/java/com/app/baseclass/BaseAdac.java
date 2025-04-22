package com.app.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseAdac {
	
	//sample check
	public static WebDriver driver;

	public static void inputText(WebElement element, String data) {
		element.sendKeys(data);
	}
	
	public static void clickButton(WebElement element) {
		element.click();
	}
	public static void clear(WebElement element) {
	       element.clear();
	}
	
	
}
