package stepDefinationClasses;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfilePP1 {

	
	@Given("User should be on home page")
	public void user_should_be_on_home_page() {
	    System.out.println("User navigate to home page");
	}

	@When("User clicks on Add button")
	public void user_clicks_on_add_button() {
		System.out.println("User clicking on Add Button");
	}

	@When("User enters the profile details")
	public void user_enters_the_profile_details() {
		System.out.println("User entering the profile details");
	}

	@Then("Profile should get Added")
	public void profile_should_get_added() {
		System.out.println("User should get added the profile");
	}

	@When("User clicks on Edit button")
	public void user_clicks_on_edit_button() {
		System.out.println("User clicking on Edit Button");
	}

	@When("User update the profile details")
	public void user_update_the_profile_details() {
		System.out.println("User updating the profile details");
	}

	@Then("Profile should get Updated")
	public void profile_should_get_updated() {
		System.out.println("User should get updated the profile");
	}

	@When("User clicks on Delete button")
	public void user_clicks_on_delete_button() {
		System.out.println("User clicking on Delete Button");
	}

	@When("User delete the profile details")
	public void user_delete_the_profile_details() {
		System.out.println("User deleting the profile details");
	}

	
	  @Then("Profile should get Deleted") public void profile_should_get_deleted()
	  { System.out.println("User should get deleted the profile"); 
	  }
	 
	 



}
