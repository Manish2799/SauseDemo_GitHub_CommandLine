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
	
	
	public static void getProduct(List<WebElement> pList, int product)
	{
       for(int i=0; i<=product; i++)
       {
    	   pList.get(i).click();
       }
	}
}
