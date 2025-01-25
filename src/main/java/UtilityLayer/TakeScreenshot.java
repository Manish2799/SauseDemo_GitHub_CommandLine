package UtilityLayer;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;

public class TakeScreenshot extends BaseClass {

	public static byte[] captureScrrenshot()
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		byte[] src=ts.getScreenshotAs(OutputType.BYTES);
		
		return src;
	
	}
}
