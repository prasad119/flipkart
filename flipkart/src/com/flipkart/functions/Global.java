package com.flipkart.functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Global {
	public static WebDriver driver;
	public static String url = "http://www.flipkart.com/";
	public static String browser = "firefox";
	public static String errMsg = null;
	public static WebDriverWait wait;
}
