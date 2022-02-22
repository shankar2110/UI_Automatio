package steps;

import static org.junit.Assert.fail;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import actions.CommonActions;
import actions.BBCHomePageActions;
import actions.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BBCHomeSteps {

	CommonActions commonActions;
	BBCHomePageActions bbcHomePageActions;

	public BBCHomeSteps(CommonActions commonActions, BBCHomePageActions bbcHomePageActions) {
		this.commonActions = commonActions;
		this.bbcHomePageActions = bbcHomePageActions;
	}

	@Given("I am on BCC Home Page")
	public void i_am_on_bcc_home_page() throws InterruptedException {
		commonActions.launchUrl();
		bbcHomePageActions.acceptConsent();

	}

	@Then("Verify Top Links in Home Page are not broken")
	public void verify_top_links_are_not_broken() {
		bbcHomePageActions.verifyToplinksUsingHTTPClient();
	}

	@Then("Verify the day and date")
	public void Verify_the_day_and_date() {
		bbcHomePageActions.verifyDayDate();
	}
	
	@When("Search for {string}")
	public void search_for(String string) {
		bbcHomePageActions.searchKeyword(string);
	}

	@Then("Verify the Search Results")
	public void verify_the_search_results() {
		bbcHomePageActions.verifySearchResults();
	}
}
