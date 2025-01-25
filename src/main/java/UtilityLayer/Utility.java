package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class Utility extends BaseClass{

	public static void genderChoose(List<WebElement> list, String expvalue)
	{
		for(WebElement wb: list)
		{
			String actvalue=wb.getText();
			
			if(actvalue.equalsIgnoreCase(expvalue))
			{
				WaitHelper.ElementToBeClickable(wb).click();
				break;
			}
		}
	}
}
