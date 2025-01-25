package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.ElementHelper;

public class LoginPage extends BaseClass{

	@FindBy(name="user-name")
	private WebElement uname;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(name="login-button")
	private WebElement loginButtton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void loginUser(String username, String password)
	{
		ElementHelper.sendKeys(uname,username );
		ElementHelper.sendKeys(pass, password);
	}
	public void clickOnLoginButton()
	{
		ElementHelper.click(loginButtton);
	}
	
	
	
	
}
