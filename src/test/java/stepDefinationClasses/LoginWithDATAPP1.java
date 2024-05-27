package stepDefinationClasses;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDATAPP1 {

	
	@Given("user must be on login page")
	public void user_must_be_on_login_page() {
	    System.out.println("User should be on login page");
	}

	@When("user enters a username as {string}")
	public void user_enters_a_username_as(String string) {
		System.out.println("User enters a username : " + string);
	}

	@When("user enters a password as {string}")
	public void user_enters_a_password_as(String string) {
		System.out.println("User enters a password : " + string);
	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
		System.out.println("User Cliccking on submit button");
	}
	

	@Then("user should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
		System.out.println("User navigating to homepage");
	}



}
