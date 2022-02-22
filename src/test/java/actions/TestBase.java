package actions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import Utils.LoadProperty;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public String browser;
	
	static LoadProperty loadProperty = new LoadProperty();

	public WebDriver setUp() {
		System.out.println("Inside Setup Method");
//		browser = loadProperty.properties.getProperty("browser");
		System.getProperty("browser");
		System.out.println("Browser " + browser);
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			throw new RuntimeException("Browser inovke not implemented for this " + browser + " browser");
		}
		return driver;
	}

	public void tearDown() {
		driver.quit();
	}

	public WebDriver getDriver() {
		return driver;
	}

}
