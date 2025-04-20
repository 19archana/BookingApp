package com.app.stepdefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import com.app.baseclass.CheapAirBase;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookCheapAir extends CheapAirBase {
	
	@Before
	public void browserLaunch() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cheapair.com/");
	}
	@After
	public void navigatenextpage() {
		
	}

}
