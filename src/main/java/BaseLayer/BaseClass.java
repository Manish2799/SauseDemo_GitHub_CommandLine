package BaseLayer;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import UtilityLayer.PropertyReader;

public class BaseClass {

	protected static WebDriver driver;

	public static void initialization() throws IOException {
		String browser = PropertyReader.getProperty("BROWSER");

		if (browser.equalsIgnoreCase("chrome")) 
		{
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().deleteAllCookies();

		String url = PropertyReader.getProperty("SIT_URL");
		driver.get(url);
	}

	public static void initialization(String browser) throws IOException {

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriver driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriver driver = new EdgeDriver();
		}
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().deleteAllCookies();

		String url = PropertyReader.getProperty("SIT_URL");
		driver.get(url);
	}
}
