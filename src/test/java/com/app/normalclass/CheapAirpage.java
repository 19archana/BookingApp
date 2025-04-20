package com.app.normalclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheapAirpage {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cheapoair.com/");
		Thread.sleep(20000);

//		WebElement popup=driver.findElement(By.id("closepopup"));
//		popup.click();
//
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		WebElement oneWay = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='oneWay']")));
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", oneWay);
//		WebElement dest=driver.findElement(By.id("to0"));
//		dest.sendKeys("Banglore");
      // WebElement search=driver.findElement(By.id("searchNow"));
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
       WebElement searchflight=wait.until(ExpectedConditions.elementToBeClickable(By.id("searchNow")));
          searchflight.click();
	}

} 

