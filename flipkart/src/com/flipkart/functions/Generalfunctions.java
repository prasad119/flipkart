package com.flipkart.functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Generalfunctions {
	/*******************************************************************************
	Function Name 					: openBrowser
	Description						: Opens browser with the given browsername and URL 
	Parameters						: browserName,url
	Usage							: bStatus = openBrowser(browserName,url);
	Created By						: TenXLabs,Prasad
	Created On						: 10/22/2015,23:42
	 ******************************************************************************
	Revision History				:
	Modified By						:
	Modified On						:
	Remarks                         :
	******************************************************************************/

	public static boolean openBrowser(String browserName,String url){
		try{
			if(Global.driver==null){
				if(Global.browser.equalsIgnoreCase("ff")||Global.browser.equalsIgnoreCase("firefox")){
					Global.driver = new FirefoxDriver();
				}
				else if(Global.browser.equalsIgnoreCase("gc")||Global.browser.equalsIgnoreCase("chrome")||Global.browser.equalsIgnoreCase("google chrome")){
					System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
					Global.driver = new ChromeDriver();
				}
			}
			return true;
		}
		catch(Exception e){
			Global.errMsg = e.getMessage();
		}
		return false;
	}

	/*******************************************************************************
	Function Name 					: inputText
	Description						: enters text into an Input(textbox) 
	Parameters						: objLocator,value
	Usage							: bStatus = inputText(objLocator,value);
	Created By						: TenXLabs,Prasad
	Created On						: 10/22/2015,23:43
	 ******************************************************************************
	Revision History				:
	Modified By						:
	Modified On						:
	Remarks                         :
	******************************************************************************/
	public static boolean inputText(By objLocator,String value){
		try{
			Global.wait.until(ExpectedConditions.visibilityOfElementLocated(objLocator));
			Global.driver.findElement(objLocator).clear();
			Global.driver.findElement(objLocator).sendKeys(value);
			return true;
		}
		catch(Exception e){
			Global.errMsg = e.getMessage();
			return false;
		}
	}
	/*******************************************************************************
	Function Name 					: clickBu
	Description						: enters text into an Input(textbox) 
	Parameters						: objLocator,value
	Usage							: bStatus = inputText(objLocator,value);
	Created By						: TenXLabs,Prasad
	Created On						: 10/22/2015,23:43
	 ******************************************************************************
	Revision History				:
	Modified By						:
	Modified On						:
	Remarks                         :
	******************************************************************************/
	public static boolean clickButton(By objLocator,String locator){
		try{
			Global.driver.findElement(objLocator).click();
			return true;
		}
		catch(Exception e){
			Global.errMsg = e.getMessage();
			return false;
		}
	}
	public static boolean mouseOver(WebElement objLocator){
		try{
			Actions act = new Actions(Global.driver);
			act.moveToElement(objLocator).build().perform();
			return true;
		}
		catch(Exception e){
			Global.errMsg = e.getMessage();
			return false;
		}
		
	}


}
