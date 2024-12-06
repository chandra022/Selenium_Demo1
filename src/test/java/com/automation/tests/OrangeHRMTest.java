package com.automation.tests;

import org.testng.annotations.Test;

import com.automation.pages.OrangeHRMLoginPage;

public class OrangeHRMTest {
	@Test
	public void loginTest() {
		OrangeHRMLoginPage login = new OrangeHRMLoginPage();
		login
			.enterUserName( "Admin" )
			.enterPwd( "admin123" )
			.clickLogin()
			.clickWelcome()
			.clickLogout();
	}

}
