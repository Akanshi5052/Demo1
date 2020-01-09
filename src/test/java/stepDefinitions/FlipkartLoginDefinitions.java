package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FlipkartLoginDefinitions {
	@Given("Flipcart is up and running and is launched")
	public void flipcart_is_up_and_running_and_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for launch");
	}

	@Then("user clicks on login linkzzz")
	public void user_clicks_on_login_linkzzz() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();.
		System.out.println("code for lging");
	}

	@Then("User provides valid credentials to get the login")
	public void user_provides_valid_credentials_to_get_the_login() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for cred entry");
	}

	@Then("user clicks on Submit button")
	public void user_clicks_on_Submit_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for ok button");
	}
}
