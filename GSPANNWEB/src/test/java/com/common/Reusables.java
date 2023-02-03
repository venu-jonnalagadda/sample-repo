package com.common;

import org.openqa.selenium.WebElement;


public class Reusables {
	
	public static Reusables reusev = new Reusables();
	
	/**
	 * @author subbarao.patti
	 * @param ele
	 * @param value
	 * @param fieldName
	 */
	public void enterValue(WebElement ele, String value, String fieldName) 
	{
		if(ele.isDisplayed())
		{
			if(ele.isEnabled())
			{
				ele.clear();
				ele.sendKeys(value);
			}else {System.out.println("Element"+fieldName+"is not Enabled");}
		}else 
		{System.out.println("Element"+fieldName+"is not Displayed");}
	}
	
	/**
	 * @author subbarao.patti
	 * @param ele
	 * @param fieldName
	 */
	public void clickElement(WebElement ele, String fieldName) 
	{
		if(ele.isDisplayed())
		{
			if(ele.isEnabled())
			{
				ele.click();
			}else {System.out.println("Element"+fieldName+"is not Enabled");}
		}else 
		{System.out.println("Element"+fieldName+"is not Displayed");}
	}

}
