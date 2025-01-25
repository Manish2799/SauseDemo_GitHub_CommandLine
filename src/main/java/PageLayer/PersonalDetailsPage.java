package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.ElementHelper;

public class PersonalDetailsPage extends BaseClass{
	
	@FindBy(name="checkout")
	private WebElement checkoutbtn;

	
	@FindBy(name="firstName")
	private WebElement fname;
	
	@FindBy(name="lastName")
	private WebElement lname;
	
	@FindBy(name="postalCode")
	private WebElement pcode;
	
	@FindBy(name="continue")
	private WebElement contiBtn;
	
	
	public PersonalDetailsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void checkOutFunctionality()
	{
		ElementHelper.click(checkoutbtn);
		
	}
	
	public void personalDetailsFunctioanlity(String Fname,String Lname,String ZipCode)
	{
		ElementHelper.sendKeys(fname, Fname);
		ElementHelper.sendKeys(lname, Lname);
		ElementHelper.sendKeys(pcode, ZipCode);
	}
	
	public void continueButtonFunctionality()
	{
		ElementHelper.click(contiBtn);
	}
			
	
	
}
