package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Addtocart;

public class Addtocart_steps 
{	
	Addtocart list=new Addtocart();
	@Given("^the details of the required animal or bird$")
	public void the_details_of_the_required_animal_or_bird() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		list.url();
	}

	@When("^the product id and name of the animal is added to the cart$")
	public void the_product_id_and_name_of_the_animal_is_added_to_the_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		list.jpet_cart();
	}

	@Then("^check the shopping cart$")
	public void check_the_shopping_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		list.add();
	}

	@Then("^contains the wish list$")
	public void contains_the_wish_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		list.update();
	}
}
