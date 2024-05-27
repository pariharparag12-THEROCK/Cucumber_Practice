package stepDefinationClasses;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPP1Steps {

	
	@Given("User at login page")
	public void user_at_login_page() {
	    System.out.println("User should be at login page");
	}

	@When("User enters username")
	public void user_enters_username() {
		System.out.println("Entering username");
	}

	@When("User enters password")
	public void user_enters_password() {
		System.out.println("Entering password");
	}

	@When("User clicked on login button")
	public void user_clicked_on_login_button() {
		System.out.println("clicking on login button");
	}

	@Then("User should be logged into the application")
	public void user_should_be_successfully_logged_into_the_application() {
		System.out.println("User successfully logged into the application");
	}

	@Given("User at homepage")
	public void user_at_homepage() {
		System.out.println("User on the Homepage");
	}

	@Then("User should see the title")
	public void user_should_see_the_title() {
		System.out.println("User successfully matched the title");
	}


	
	
		
	
}
