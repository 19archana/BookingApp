package com.app.stepdefinition;

import com.app.pageexecution.SearchhotelPageExe;
import com.app.pageexecution.SelectHotelPageExe;

import io.cucumber.java.en.When;

public class SearchhotelStepdefinition {

	@When("Enter locations {string}")
	public void enter_locations(String locations) {
		SearchhotelPageExe.get_locations(locations);
	}
	@When("Enter searchhotels {string}")
	public void enter_searchhotels(String hotels) {
		SearchhotelPageExe.gethotels(hotels);
	}
	@When("Enter roomtype {string}")
	public void enter_roomtype(String roomtype) {
		SearchhotelPageExe.getroomtype(roomtype);
	}
	@When("Enter Number of rooms {string}")
	public void enter_number_of_rooms(String numrooms) {
		SearchhotelPageExe.noofrooms(numrooms);
	}
	@When("Enter Check in date {string}")
	public void enter_check_in_date(String indate) throws InterruptedException {
		
		SearchhotelPageExe.checkindate(indate);
	}
	@When("Enter Check out date {string}")
	public void enter_check_out_date(String outdate) {
		SearchhotelPageExe.checkoutdate(outdate);
	}
	@When("Enter Adults per room {string}")
	public void enter_adults_per_room(String adultrooms) {
		SearchhotelPageExe.adultsperroom(adultrooms);
	}
	@When("Enter Children per room {string}")
	public void enter_children_per_room(String childroom) {
		SearchhotelPageExe.childperroom(childroom);
	}
	@When("Click Search")
	public void click_search() {
		SearchhotelPageExe.clicksearch();
	}
	
	@When("Click Hotel")
	public void click_hotel() throws InterruptedException {
		Thread.sleep(2000);
		SelectHotelPageExe.selecthotel();
	    
	}
	@When("Click Continue")
	public void click_continue() {
	    SelectHotelPageExe.clickcontinue();
	}
	
}
