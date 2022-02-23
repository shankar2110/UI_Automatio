package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import actions.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	TestBase testBase = new TestBase();
	
	private WebDriver driver;
	
	@Before()
	public void initializeTest() {
		testBase.setUp();
		driver = testBase.getDriver();
	}
	
	@After()
	public void tearDown(Scenario scenario) throws InterruptedException {
		if(scenario.isFailed()) {
			final byte[] scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(scr, "image/png", scenario.getName());
		}
		driver.quit();
	}
	
	
}
