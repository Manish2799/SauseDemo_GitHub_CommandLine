package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.ElementHelper;

public class FinishPage extends BaseClass {

	@FindBy(id = "finish")
	private WebElement finishBtn;

	public FinishPage() {
		PageFactory.initElements(driver, this);
	}

	public void finishFunctionality() {
		ElementHelper.click(finishBtn);
	}
}
