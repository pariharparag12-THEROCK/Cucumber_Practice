package stepDefinationClasses;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlinePP1 {


@Given("user should be on login page")
public void user_should_be_on_login_page() {
    System.out.println("User successfully logged In");
}

@When("user enters the {string} in the form")
public void user_enters_the_in_the_form(String string) {
   System.out.println("Entered Name is: "+string);
}

@When("user enters age as {int}")
public void user_enters_age_as(Integer int1) {
	System.out.println("Entered age is: "+int1);
}

@When("user confirms the {string} button")
public void user_confirms_the_button(String string) {
	System.out.println("Selecting gendor is: "+string);
}

@Then("user accounts should get created")
public void user_accounts_should_get_created() {
    System.out.println("Accounts should be created successfully");
}
	
	
}
