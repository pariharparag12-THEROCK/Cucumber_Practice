package stepDefinationClasses;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ResgistrationPP1 {

	@Given("User should be on Acccount page")
	public void user_should_be_on_acccount_page() {
	   System.out.println("User able to see the account page");
	}

	@When("User enters the following data")
	public void user_enters_the_following_data(DataTable dataTable) {
	    
		List<List<String>>	data	= dataTable.asLists();
		
		List<String>  firstList	=	data.get(0);
		
		String	value	=		firstList.get(1); //Smith
		
		System.out.println(value);
		
		String emailvalue =	data.get(1).get(2);
		
		System.out.println(emailvalue); // robert.jackson112@gmail.com
		
		
		
		
	}

	@When("User clicks on submit button")
	public void user_clicks_on_submit_button() {
	    System.out.println("Clicking on Submit button");
	}

	@Then("Bank Account should get opened by user")
	public void bank_account_should_get_opened_by_user() {
		 System.out.println("User should get open the bank account successfully");
	}
	
}
