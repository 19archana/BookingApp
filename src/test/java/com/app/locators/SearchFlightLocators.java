package com.app.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.baseclass.CheapAirBase;

public class SearchFlightLocators extends CheapAirBase {
	
	
	public static WebElement getoneway() {
		return driver.findElement(By.id("onewayTrip"));
	}
	public static WebElement getsourceplace() {
		return driver.findElement(By.xpath("//input[@placeholder='From where?']"));
	}
	public static WebElement getdestplace() {
		return driver.findElement(By.xpath("//input[@placeholder='To where?']"));
	}
	public static WebElement getdepartdate() {
		return driver.findElement(By.xpath("//span[@aria-label='17 April 2025']"));
	}
//	public static WebElement getreturndatae() {
//		return driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
//	}
	public static WebElement gettraveller() {
		return driver.findElement(By.xpath("//button[@id='addADULTS']"));
	}
	public static WebElement clickSearch() {
		return driver.findElement(By.id("searchNow"));
	}
}
