package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import actions.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

	TestBase testBase = new TestBase();
	
	@Before()
	public void initializeTest() {
		testBase.setUp();
	}
	
	@After()
	public void closeDriver() {
		testBase.tearDown();
	}
	
	
}
