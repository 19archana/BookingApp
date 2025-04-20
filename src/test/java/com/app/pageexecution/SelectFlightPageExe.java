package com.app.pageexecution;

import com.app.baseclass.CheapAirBase;
import com.app.locators.SearchFlightLocators;

public class SelectFlightPageExe extends SearchFlightLocators {
	public static void oneway() {
		CheapAirBase.clickButton(SearchFlightLocators.getoneway());
	}
	public static void source(String src) {
		CheapAirBase.sendKeys(SearchFlightLocators.getsourceplace(), src);
		
	}
	public static void desti(String dest) {
		CheapAirBase.sendKeys(SearchFlightLocators.getdestplace(), dest);
	}
	public static void departdate(String ddate) {
		CheapAirBase.acClick(SearchFlightLocators.getdepartdate());
	}
	
	public static void traveler() {
		CheapAirBase.acClick(gettraveller());
	}
	public static void searchbutton() {
		CheapAirBase.clickButton(SearchFlightLocators.clickSearch());
	}
}
