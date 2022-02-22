package actions;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Element;

import Utils.LoadProperty;

public class CommonActions extends TestBase {
	
	LoadProperty loadProperty = new LoadProperty();

	
	// WebDriver Wait
	WebDriverWait wait = new WebDriverWait(driver, 10);

	public void launchUrl() {
		String url = loadProperty.properties.getProperty("url");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public void verifyCurrentUrl(String string) {
		String url = getCurrentUrl();
		Assert.assertTrue("URL does not match", url.contains(string));
	}
	
	public String getCurrentTitle() {
		return driver.getTitle();
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public String getText(WebElement element) {
		return element.getText();
	}
	
	public void sendKeys(WebElement element, String string) {
		element.sendKeys(string);
	}
	
	public void keyboardPress(WebElement element, Keys keys) {
		element.sendKeys(keys);
	}
	
	public void waitTillVisible(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void verifyLinksUsingHTTPConnection(List<WebElement> elementList) throws IOException {
		HttpURLConnection con = null;
		for (WebElement element: elementList) {
			String url = element.getAttribute("href");
			if(url!=null && !url.contains("javascript")){
				con= (HttpURLConnection)(new URL(url)).openConnection();
				con.connect();
				con.setConnectTimeout(3000);
				int respCode = con.getResponseCode();
				System.out.println("URL is: " + url + " , StatusCode is: " + respCode);
				Assert.assertEquals(200, respCode);
				}
		}
		con.disconnect();
	}
	
	public String getDayDate() {
		Date date = new Date();
		String pattern = "EEEE, dd MMMM";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String formattedDate = sdf.format(date);
		return formattedDate;
	}

}
