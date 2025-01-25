package UtilityLayer;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class WaitHelper extends BaseClass {

	public static WebElement fluentwait(WebElement wb) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(10)).ignoring(Exception.class);

		return wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return wb;
			}
		});

	}

	public static WebElement visibilityofWebElement(WebElement wb)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		return wait.until(ExpectedConditions.visibilityOf(fluentwait(wb)));
	}
	public static WebElement ElementToBeClickable(WebElement wb)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		return wait.until(ExpectedConditions.elementToBeClickable(fluentwait(wb)));
	}
	
	public static List<WebElement> ElementToBeClickable(List<WebElement> list)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		return wait.until(ExpectedConditions.visibilityOfAllElements(list));
	}
	
}
