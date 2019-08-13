package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumPages.Page_GoogleHomepage;

public class StepDefs_GoogleHomepage {
	
	Page_GoogleHomepage googleHomepage = new Page_GoogleHomepage();

	@Given("^I launch Chrome browser$")
	public void i_launch_Chrome_browser() throws Exception {
		System.out.println("Launch Chrome");
		googleHomepage.launchBrowser();
	}

	@When("^I open Google Homepage$")
	public void i_open_Google_Homepage() throws Exception {
		System.out.println("Open Google");
		googleHomepage.openGoogleURL();
	}

	@Then("^I verify that the page displays search text box$")
	public void i_verify_that_the_page_displays_search_text_box() throws Exception {
		System.out.println("Check search box");
		googleHomepage.checkSearchBoxIsDisplayed();

	}

	@Then("^the page displays Google Search button$")
	public void the_page_displays_Google_Search_button() throws Exception {
		System.out.println("Check search button");
		googleHomepage.checkGoogleSearchButtonIsDisplayed();

	}

	@Then("^the page displays Im Feeling Lucky$")
	public void the_page_displays_Im_Feeling_Lucky() throws Exception {
		System.out.println("Check feeling lucky button");
		googleHomepage.checkImFeelingLuckyButtonIsDisplayed();

	}
}
