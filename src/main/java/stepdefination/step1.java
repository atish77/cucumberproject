package stepdefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class step1 {
	
	//@Given("^user already at the facebook login page$")
	//public void useralreadyatthefacebookloginpage() {
	//	System.out.println("user already at the facebook login page");
	//}
	
	@Given("^user already at the facebook login page$")
	public void user_already_at_the_facebook_login_page()  {
	    // Write code here that turns the phrase above into concrete actions
	    
		System.out.println("user already at the facebook login page");
		
	}

	@When("^user entered username$")
	public void user_entered_username()  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user entered username");
		
	}

	@When("^user entered password$")
	public void user_entered_password()  {
		System.out.println("user_entered_password");
		// Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user should be logged in facebook$")
	public void user_should_be_logged_in_facebook() {
	    
		System.out.println("user_should_be_logged_in_facebook");
		// Write code here that turns the phrase above into concrete actions
	    
	}
}
