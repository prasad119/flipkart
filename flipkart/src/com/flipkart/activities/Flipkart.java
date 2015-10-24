package com.flipkart.activities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flipkart {
	public static WebDriver driver;
	@BeforeTest
	public void seTTings(){
	 driver = new FirefoxDriver();
	}
	@Test
	public void flipkart() {
		String expectedTitle = "Online Shopping India Mobile, Cameras, Lifestyle & more Online @ Flipkart.com";
		driver.get("http://www.flipkart.com/");
		String actualtitle = driver.getTitle();
		if(expectedTitle.equals(actualtitle)){
			System.out.println("Hi This is prasad & durga");
			
		}
	}
	@AfterTest
	public void quIt(){
		driver.close();
	}

}
