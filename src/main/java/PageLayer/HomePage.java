package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.ElementHelper;
import UtilityLayer.Utility;

public class HomePage extends BaseClass {

	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement sort;
	
	@FindBys(@FindBy(xpath="//div[@class='inventory_list']/child::div/descendant::button"))
	private List<WebElement> pList;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement shoppingContainer;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sortFunctionality()
	{
		ElementHelper.click(sort);
	}
	
	public void selectProduct(int product)
	{
		Utility.getProduct(pList, product);
	}
	
	public void shoppingContainerFunctionality()
	{
		ElementHelper.click(shoppingContainer);	
	}
}
