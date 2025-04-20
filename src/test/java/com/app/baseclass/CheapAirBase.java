package com.app.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CheapAirBase {

	public static WebDriver driver;
	public static Actions ac;
	
	public static void sendKeys(WebElement element, String data) {
		element.sendKeys(data);
	}
	
	public static void clickButton(WebElement element) {
		element.click();
	}
	public static void clear(WebElement element) {
	       element.clear();
	}
	
	public static void acClick(WebElement element) {
		ac=new Actions(driver);
		ac.click(element).perform();
	}
	
	public static void select(WebElement dropdown, String data) {
		Select sc = new Select(dropdown);
		sc.selectByValue(data);
	}
	
}
