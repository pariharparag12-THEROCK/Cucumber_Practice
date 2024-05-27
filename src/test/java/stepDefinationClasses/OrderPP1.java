package stepDefinationClasses;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderPP1 {

	
	
	@Given("User should be logged into application")
	public void user_should_be_logged_into_application() {
	    System.out.println("User Successfully looged into the application");
	}

	@When("User Clicked on Order button")
	public void user_clicked_on_order_button() {
	   
		System.out.println("clicking on order button");
	}

	@Then("User should be redirected to order page")
	public void user_should_be_redirected_to_order_page() {
		System.out.println("navigating to order page");
	}

	@When("User clicks on currentOrder button")
	public void user_clicks_on_current_order_button() {
		System.out.println("clicking on currentOrder button");
	}

	@Then("User should fetch current order information")
	public void user_should_fetch_current_order_information() {
		System.out.println("Fetching currentOrder Information");
	}

	@When("User clicks on PastOrder button")
	public void user_clicks_on_past_order_button() {
		System.out.println("clicking on PastOrder button");
	}

	@Then("User should fetch Past order information")
	public void user_should_fetch_past_order_information() {
		System.out.println("Fetching Past order Information");
	}

	@When("User clicks on CancelledOrder button")
	public void user_clicks_on_cancelled_order_button() {
		System.out.println("clicking on CancelledOrder button");
	}

	@Then("User should fetch Cancelled order information")
	public void user_should_fetch_cancelled_order_information() {
		System.out.println("Fetching Cancelled order Information");
	}



	
	
}
