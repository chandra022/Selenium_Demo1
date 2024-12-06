package com.automation.pages;

import org.openqa.selenium.By;

import com.automation.driver.DriverManagerClass;

public class OrangeHRMHomePage {
	
	private final By welcome_elm = By.xpath( "//span[@class='oxd-userdropdown-tab']//i" );
	private final By logout_btn = By.xpath( "//ul[@role='menu']//a[text()='Logout']" );
	
	public OrangeHRMHomePage clickWelcome() {
		DriverManagerClass.getDriver().findElement( welcome_elm ).click();
		return this;
	}
	public OrangeHRMLoginPage clickLogout() {
		DriverManagerClass.getDriver().findElement( logout_btn ).click();
		return new vOrangeHRMLoginPage();
	}

}
