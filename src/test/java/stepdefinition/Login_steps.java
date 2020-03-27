package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excelutility.ReadExcelsheet;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Login;


public class Login_steps 
{
	Login obj=new Login();
	ReadExcelsheet read=new ReadExcelsheet();
	@Given("^the user launches the website in chrome browser$")
	public void the_user_launches_the_website_in_chrome_browser() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		obj.url();
	}

	@When("^opens the login page$")
	public void opens_the_login_page() throws Throwable
	{
	   obj.homepage();
	}

	@Then("^enter username and password$")
	public void enter_username_and_password() throws Throwable
	{
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		 for(int i=1;i<=2;i++)
		    {
			obj.Jpet_username(i);
			obj.Jpet_password(i);
			obj.Login_click();
			Thread.sleep(6000);
		    }
		 //read.screenshot();
		//obj.Jpet_username();
		//obj.Jpet_password();
		//obj.Login_click();
	}

	@Then("^click on login button$")
	public void click_on_login_button() throws Throwable
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		obj.close();
	}
}
