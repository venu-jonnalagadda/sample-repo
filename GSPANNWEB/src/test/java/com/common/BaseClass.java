package com.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import util.Utilities;


public class BaseClass {
	
	
	public static WebDriver driver;
	
	public static void luanchBrowser()  {
		switch(Utilities.util.file("browser")) 
		{
		case("chrome"):
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(Utilities.util.file("url"));
			break;
		case("firefox"):
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(Utilities.util.file("url"));
			break;
		}
		driver.manage().window().maximize();
	}

	public static boolean closeBrowser(boolean close) {
		if(close==true) {driver.close();}
		return false;
	}
	
	public WebElement getDynamicLocator(String element,String text)
	{
	  WebElement locator = null;
	  String element1 = null;
	  if(element.contains("$Dynamic"))
	  {
	    element1 = element.replace("$Dynamic", text);
		System.out.println(element1);
		locator = driver.findElement(By.xpath(element1));
	  }
	   return locator;
	}
	
	
	

}
