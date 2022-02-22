package elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actions.TestBase;

public class BBCHomePageElements {

	WebDriver driver;
	
	public BBCHomePageElements(TestBase base) {
		this.driver = base.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@id='orb-nav-links']//li[contains(@class,'orb-nav')]/a")
	public List<WebElement> topNavigationLinks;
	
	@FindBy(xpath = "//div[@id='orb-nav-links']//li[@class='orb-nav-homedotcom']/a")
	public WebElement homeLink;
	
	@FindBy(xpath = "//div[@id='orb-nav-links']//li[@class='orb-nav-newsdotcom']/a")
	public WebElement newsLink;
	
	@FindBy(xpath = "//div[@id='orb-nav-links']//li[@class='orb-nav-sport']/a")
	public WebElement sportLink;
	
	@FindBy(xpath = "//div[@id='orb-nav-links']//li[@class='orb-nav-reeldotcom']/a")
	public WebElement reelLink;
	
	@FindBy(xpath = "//div[@id='orb-nav-links']//li[@class='orb-nav-worklife']/a")
	public WebElement workLifeLink;
	
	@FindBy(xpath = "//div[@id='orb-nav-links']//li[@class='orb-nav-traveldotcom']/a")
	public WebElement travelLink;
	
	@FindBy(xpath = "//div[@id='orb-nav-links']//li[@class='orb-nav-future']/a")
	public WebElement futureLink;
	
	@FindBy(xpath = "//div[@id='orb-nav-links']//li[@class='orb-nav-culture']/a")
	public WebElement cultureLink;
	
	@FindBy(xpath = "//div[@id='orb-panel-more']//li[contains(@class,'orb-nav-music')]/a")
	public WebElement musicLink;
	
	@FindBy(xpath = "//div[@id='orb-panel-more']//li[@class='orb-nav-tv']/a")
	public WebElement tvLink;
	
	@FindBy(xpath = "//div[@id='orb-panel-more']//li[@class='orb-nav-weather']/a")
	public WebElement weatherLink;
	
	@FindBy(xpath = "//div[@id='orb-panel-more']//li[@class='orb-nav-sounds']/a")
	public WebElement soundsLink;
	
	@FindBy(id = "orb-nav-more")
	public WebElement moreLink;
	
	@FindBy(id = "orb-search-q")
	public WebElement topSearchInputBox;
	
	@FindBy(xpath = "//button[@aria-label='Consent']")
	public WebElement consentBtn;
	
	@FindBy(xpath = "//section[@class='module module--header']/h2[@class='module__title']")
	public WebElement todaysDate;
	
	@FindBy(xpath = "//a[contains(@class,'PromoLink')]")
	public WebElement searchResults;
	
}
