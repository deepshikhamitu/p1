package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.browserManager;
import locators.gmailLocators;
import locators.locatorsManager;

public class checkwithinvaliddata {
	browserManager brsrmanager;
	public gmailLocators gmailLocators;
	public locatorsManager locatorManager;
	public checkwithinvaliddata(browserManager brsrmanager) {
		//this.brsrmanager=new browserManager();
		
	}
	
	@Given("Landing on Gmail login page")
	public void landing_on_gmail_login_page() {
	    
	}
	@When("^User enter (.+) and (.+)$")
	public void user_enter_deepshikha_gmail_com_and(String name, int pass) {
		System.out.print("Test");
		 this.gmailLocators =new browserManager().locatorManager.getgmailLocators(name,pass);
		 

	}
	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.print("Test");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
}
