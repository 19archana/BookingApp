package com.app.pageexecution;

import com.app.baseclass.BaseAdac;
import com.app.locators.LocatorsLogin;

public class AdacLoginPageExe extends LocatorsLogin {

	
	public static void username(String username) {
		BaseAdac.inputText(LocatorsLogin.getUsername(), username);
	}
	public static void password(String password) {
		BaseAdac.inputText(LocatorsLogin.getPassword(), password);
	}
	
	public static void loginbutton() {
		BaseAdac.clickButton(LocatorsLogin.getLogin());
	}
}
