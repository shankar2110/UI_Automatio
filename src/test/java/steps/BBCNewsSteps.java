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

public class BBCNewsSteps {

	CommonActions commonActions;
	BBCHomePageActions bbcHomePageActions;

	public BBCNewsSteps(CommonActions commonActions, BBCHomePageActions bbcHomePageActions) {
		this.commonActions = commonActions;
		this.bbcHomePageActions = bbcHomePageActions;
	}

	@When("^Click on \"([^\"]*)\" link$")
	public void click_on_link(String string) {
		bbcHomePageActions.clickOnTopMenuLink(string);
	}

	@Then("^Verify the URl contains \"([^\"]*)\"$")
	public void verify_the_u_rl(String string) {
		commonActions.verifyCurrentUrl(string);
	}

}
