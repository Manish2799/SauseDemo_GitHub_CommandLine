package UtilityLayer;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class ElementHelper extends BaseClass {

	public static void click(WebElement wb)
	{
		WaitHelper.ElementToBeClickable(wb).click();
	}
	
	public static void sendKeys(WebElement wb, String value)
	{
		WaitHelper.visibilityofWebElement(wb).sendKeys(value);
	}
	
}
