package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	@Given("User navigates to Login Page")
	public void user_navigates_to_login_page() {
		System.out.println("User navigates to Login Page");
	    
	}

	@When("^Enter Valid Username (.+)$")
	public void enter_valid_username_sainaidukanakala_gmail_com(String user) {
		System.out.println("Enter Valid Username is:"+user);
	   
	}

	@When("^Enter Valid Password (.+)$")
	public void enter_valid_password_sainaidu(String pass) {
		System.out.println("Enter Valid Password is:"+pass);
	    
	}

	@When("clcik on Login button")
	public void clcik_on_login_button() {
		System.out.println("clcik on Login button");

	}

	@Then("User should login Scuccessfully")
	public void user_should_login_scuccessfully() {
		System.out.println("User should login Scuccessfully");
	   
	}

	
}
