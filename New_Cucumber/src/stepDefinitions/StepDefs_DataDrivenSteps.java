package stepDefinitions;

import cucumber.api.java.en.Then;
import seleniumPages.Page_GoogleHomepage;

public class StepDefs_DataDrivenSteps {
	
	Page_GoogleHomepage googleHomepage = new Page_GoogleHomepage();
	
	@Then("I search for {string} on Google")
	public void i_search_for_on_Google(String searchKeyword) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new cucumber.api.PendingException();
		googleHomepage.searchOnGoogleHomepage(searchKeyword);
	}

}
