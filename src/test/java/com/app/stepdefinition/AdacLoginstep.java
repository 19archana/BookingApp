package com.app.stepdefinition;

import com.app.pageexecution.AdacLoginPageExe;

import io.cucumber.java.en.*;

public class AdacLoginstep extends AdacLoginPageExe{
	
//	@Given("launch url")
//	public void launch_url() {
//	
//	}
	@When("Enter username {string}")
	public void enter_username(String username) {
	   AdacLoginPageExe.username(username);
	}
	@When("Enter password {string}")
	public void enter_password(String password) {
AdacLoginPageExe.password(password);
	}
	@When("click LoginButton")
	public void click_login_button() {
	  AdacLoginPageExe.loginbutton();
	}
//	@Then("Navvigate to Nextpage")
//	public void navvigate_to_nextpage() {
//	 
//	}


}
