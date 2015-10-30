package com.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Gridpracties {
	WebDriver driver;
  @Test
  public void f() throws MalformedURLException {
	  DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	  capabilities.setBrowserName("firefox");
	  capabilities.setPlatform(Platform.WINDOWS);
	  driver = new RemoteWebDriver(new URL("http://localhost:5566/wd/hub"),capabilities);
	  driver.get("http://www.fb.com/");
  }
}
