package com.app.pageexecution;

import com.app.baseclass.BaseAdac;
import com.app.locators.SearchHotels;
import com.app.locators.Selecthotelloca;

public class SearchhotelPageExe extends AdacLoginPageExe{

	public static void get_locations(String locations) {
		BaseAdac.inputText(SearchHotels.getlocations(), locations);
	}
	public static void gethotels(String hotels) {
		BaseAdac.inputText(SearchHotels.gethotels(), hotels);
	}
	public static void getroomtype(String roomtype) {
		BaseAdac.inputText(SearchHotels.getroomtype(), roomtype);
	}
	public static void noofrooms(String numrooms) {
		BaseAdac.inputText(SearchHotels.numberofrooms(), numrooms);
	}
	public static void checkindate(String indate) throws InterruptedException {
		BaseAdac.clear(SearchHotels.checkindate());

		BaseAdac.inputText(SearchHotels.checkindate(), indate);
	}
	public static void checkoutdate(String outdate) {
		BaseAdac.clear(SearchHotels.getCheck_out_date());
		BaseAdac.inputText(SearchHotels.getCheck_out_date(), outdate);
	}
	public static void adultsperroom(String adultrooms) {
		BaseAdac.inputText(SearchHotels.getAdults_per_room(), adultrooms);
	}
	public static void childperroom(String childroom) {
		BaseAdac.inputText(SearchHotels.getChildren_per_room(), childroom);
	}
	public static void clicksearch() {
		BaseAdac.clickButton(SearchHotels.getsearchButton());
	}
	public static void selecthotel() {
		BaseAdac.clickButton(Selecthotelloca.selecthotels());
	}
	public static void clickcontinue() {
		BaseAdac.clickButton(Selecthotelloca.clickcontinue());
	}
}
