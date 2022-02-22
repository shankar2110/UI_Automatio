package actions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import elements.BBCHomePageElements;
import junit.framework.Assert;

public class BBCHomePageActions {

	BBCHomePageElements bbcHomePageElements;
	CommonActions commonActions;

	public BBCHomePageActions(BBCHomePageElements bbcHomePageElements, CommonActions commonActions) {
		this.bbcHomePageElements = bbcHomePageElements;
		this.commonActions = commonActions;
	}

	// Accept 'Consent' Pop-up
	public void acceptConsent() throws InterruptedException {
		try {
			commonActions.click(bbcHomePageElements.consentBtn);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	// Verify Top Links using HTTP Client
	public void verifyToplinksUsingHTTPClient() {
		try {
			commonActions.verifyLinksUsingHTTPConnection(bbcHomePageElements.topNavigationLinks);
		} catch (IOException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	// Verify the Day and Date displaying in the Home screen
	public void verifyDayDate() {
		try {
			String dateText = commonActions.getText(bbcHomePageElements.todaysDate);
			String todaysDateText = commonActions.getDayDate();
			Assert.assertTrue("Date is not matching", dateText.contains(todaysDateText));
			//Assert.assertEquals(dateText.contains(todaysDateText), "Date is not matching");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	// Search for the Keyword
	public void searchKeyword(String string) {
		commonActions.sendKeys(bbcHomePageElements.topSearchInputBox, string);
		commonActions.keyboardPress(bbcHomePageElements.topSearchInputBox, Keys.ENTER);
	}
	
	// Verify Search Results
	public void verifySearchResults() {
		commonActions.waitTillVisible(bbcHomePageElements.searchResults);
		Assert.assertTrue("No Results displayed", bbcHomePageElements.searchResults.isDisplayed());
		
	}
	
	// Single Method to Click any of the Top Links
	public void clickOnTopMenuLink(String string) {
		try {
			if (string.equalsIgnoreCase("home"))
				commonActions.click(bbcHomePageElements.homeLink);
			else if (string.equalsIgnoreCase("news"))
				commonActions.click(bbcHomePageElements.newsLink);
			else if (string.equalsIgnoreCase("sport"))
				commonActions.click(bbcHomePageElements.sportLink);
			else if (string.equalsIgnoreCase("reel"))
				commonActions.click(bbcHomePageElements.reelLink);
			else if (string.equalsIgnoreCase("worklife"))
				commonActions.click(bbcHomePageElements.workLifeLink);
			else if (string.equalsIgnoreCase("travel"))
				commonActions.click(bbcHomePageElements.travelLink);
			else if (string.equalsIgnoreCase("future"))
				commonActions.click(bbcHomePageElements.futureLink);
			else if (string.equalsIgnoreCase("culture"))
				commonActions.click(bbcHomePageElements.cultureLink);
			else if (string.equalsIgnoreCase("music")) {
				commonActions.click(bbcHomePageElements.musicLink);
			} else if (string.equalsIgnoreCase("tv")) {
				commonActions.click(bbcHomePageElements.moreLink);
				commonActions.click(bbcHomePageElements.tvLink);
			} else if (string.equalsIgnoreCase("weather")) {
				commonActions.click(bbcHomePageElements.moreLink);
				commonActions.click(bbcHomePageElements.weatherLink);
			} else if (string.equalsIgnoreCase("sounds")) {
				commonActions.click(bbcHomePageElements.moreLink);
				commonActions.click(bbcHomePageElements.soundsLink);
			}
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
}
