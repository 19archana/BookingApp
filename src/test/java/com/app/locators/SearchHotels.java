package com.app.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchHotels extends LocatorsLogin {
	
	public static WebElement getlocations() {
		return driver.findElement(By.id("location"));
	}
	public static WebElement gethotels() {
		return driver.findElement(By.id("hotels"));
	}
	public static WebElement getroomtype() {
		return driver.findElement(By.id("room_type"));
	}
	public static WebElement numberofrooms() {
		return driver.findElement(By.id("room_nos"));
	}
	public static WebElement checkindate() {
		return driver.findElement(By.id("datepick_in"));
	}
	public static WebElement getCheck_out_date() {
		return driver.findElement(By.id("datepick_out"));
	}
	public static WebElement getAdults_per_room() {
		return driver.findElement(By.id("adult_room"));
	}
	public static WebElement getChildren_per_room() {
		return driver.findElement(By.id("child_room"));
	}
	public static WebElement getsearchButton() {
		return driver.findElement(By.id("Submit"));
	}

}
