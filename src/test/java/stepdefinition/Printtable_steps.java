package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Printtable;

public class Printtable_steps 
{	
	Printtable t=new Printtable();
	@Given("^the details of an animal in the homepage$")
	public void the_details_of_an_animal_in_the_homepage() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		t.url();
	}

	@When("^the details are matched$")
	public void the_details_are_matched() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		t.verify();
	}

	@Then("^the selected animals details are printed$")
	public void the_selected_animals_details_are_printed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		t.jpet_print();
	}

	@Then("^details are printed in a table$")
	public void details_are_printed_in_a_table() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		t.submit();
	}
}
