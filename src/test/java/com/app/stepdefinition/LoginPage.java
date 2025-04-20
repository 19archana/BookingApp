package com.app.stepdefinition;

import io.cucumber.java.en.*;


public class LoginPage {

	
	@Given("Launch the url")
	public void launch_the_url() {
	   System.out.println("Login Page");
	}
	@When("Enter the username {string}")
	public void enter_the_username(String user) {
	    System.out.println(user);
	}
	@When("enter the password {string}")
	public void enter_the_password(String pass) {
	    System.out.println(pass);
	}
	@When("Click login button")
	public void click_login_button() {
	    System.out.println("Login button");
	}
	@Then("Validate the home page")
	public void validate_the_home_page() {
	   System.out.println("validation");
	}

}
