package com.app.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.baseclass.BaseAdac;

public class LocatorsLogin extends BaseAdac {
	
	public static  WebElement getUsername() {
		return driver.findElement(By.id("username"));
	}
	public static  WebElement getPassword() {
		return driver.findElement(By.id("password"));
	}
	public static WebElement getLogin() {
		return driver.findElement(By.id("login"));
	}
	
}
//public LocatorsLogin() {
//	PageFactory.initElements(driver	, this);
//}

//@FindBy(id="username")
//public WebElement username;
//@FindBy(id="password")
//public WebElement password;
//@FindBy(id="login")
//public WebElement login;