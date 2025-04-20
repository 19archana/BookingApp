package com.app.stepdefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import com.app.baseclass.BaseAdac;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BaseAdac{
		
	@Before
	public void browserLaunch() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
	}
	@After
	public void navigatenextpage() {
		
	}
}
