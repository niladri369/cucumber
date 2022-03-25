package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

	@Given("User is on application landing page.")
	public void user_is_on_application_landing_page() {
	 ;
	}

	@When("User clicked on sign in button")
	public void user_clicked_on_sign_in_button() {
	    
	}

	@Then("User lands on login page")
	public void user_lands_on_login_page() {
	  
	}

	@When("User enters {string} in Username field")
	public void user_enters_in_username_field(String string) {

	}

	@When("User enters {string} in password field")
	public void user_enters_in_password_field(String string) {
	  
	}

	@When("User clicks on Sign in button")
	public void user_clicks_on_sign_in_button() {
	   
	}

	@Then("User gets login failed error message.")
	public void user_gets_login_failed_error_message() {
	  
	}
}
