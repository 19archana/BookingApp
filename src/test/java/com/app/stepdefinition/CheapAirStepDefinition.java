package com.app.stepdefinition;

import com.app.pageexecution.SelectFlightPageExe;

import io.cucumber.java.en.When;

public class CheapAirStepDefinition extends SelectFlightPageExe{
	
//	@Given("Launch url")
//	public void launch_url() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
	@When("click oneway")
	public void click_oneway() {
	SelectFlightPageExe.oneway();
	}
	@When("Enter Source place {string}")
	public void enter_source_place(String src) {
	   SelectFlightPageExe.source(src);
	}
	@When("Enter Dest place {string}")
	public void enter_dest_place(String dest) {
	    SelectFlightPageExe.desti(dest);
	}
	@When("select dept date")
	public void select_dept_date(String ddate ) {
		SelectFlightPageExe.departdate(ddate);
	   
	}
	@When("Select Traveller")
	public void select_traveller() {
		SelectFlightPageExe.traveler();
	  
	}

}
