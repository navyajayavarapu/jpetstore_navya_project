package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Registration;

public class Registration_steps {
	Registration data=new Registration();
	@Given("^Enter user ID and password$")
	public void enter_user_ID_and_password() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		data.url();
	}

	@When("^Add the account information$")
	public void add_the_account_information() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		data.register();
	}

	@Then("^Save the account inforamtion$")
	public void save_the_account_inforamtion() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		data.enter_details();
	}

	@Then("^Complete the registration$")
	public void complete_the_registration() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		data.close_registration();
	}

}
