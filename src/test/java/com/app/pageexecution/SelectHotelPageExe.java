package com.app.pageexecution;

import com.app.baseclass.BaseAdac;
import com.app.locators.Selecthotelloca;

public class SelectHotelPageExe extends SearchhotelPageExe {

	public static void selecthotel() {
	
		BaseAdac.clickButton(Selecthotelloca.selecthotels());
	}
	public static void clickcontinue() {
		BaseAdac.clickButton(Selecthotelloca.clickcontinue());
	}
	
}
