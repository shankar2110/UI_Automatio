package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actions.TestBase;

public class BBCNewsPageElements {

	WebDriver driver;

	public BBCNewsPageElements(TestBase base) {
		this.driver = base.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(@class,'PromoLink')]")
	public WebElement SearchResultLinks;

}
