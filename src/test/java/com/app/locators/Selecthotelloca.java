package com.app.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Selecthotelloca extends SearchHotels{

	public static WebElement selecthotels() {
		return driver.findElement(By.id("radiobutton_0"));
	}
	public static WebElement clickcontinue() {
		return driver.findElement(By.id("continue"));
	}
}
