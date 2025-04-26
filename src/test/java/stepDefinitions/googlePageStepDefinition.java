package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.browserManager;
import locators.locatorsManager;
import locators.googleSearch;
import locators.gmailLocators;
public class googlePageStepDefinition {
	public browserManager browserManager;
	public locatorsManager locatorsManager;
	public googleSearch googleSearch;
	public gmailLocators gmailLocators;
	public googlePageStepDefinition(browserManager browserManager) {
		this.browserManager=browserManager;
		//this.googleSearch=browserManager.locatorManager.getgoogleSearch();
		
		
	}
	@Given("user is on google search Page")
	public void user_is_on_google_search_page() {
	    System.out.print("Test");
	    
	}
	@When("^user entered (.+)$")
	public void user_entered_selenium(String name ) {
		
		
		System.out.print(name);
		System.out.print("This method used to enter search item");
		browserManager.locatorManager.googleSearch.clickonSearchbtn(name);
	}
	@When("click on serachButton")
	public void click_on_serach_button() {
		System.out.print("Test");
	}
	@Then("verify output result")
	public void verify_output_result() {
		System.out.print("Test");
	}
}
