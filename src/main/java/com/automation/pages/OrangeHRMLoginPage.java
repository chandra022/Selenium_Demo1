package com.automation.pages;

import org.openqa.selenium.By;

import com.automation.driver.DriverManagerClass;

public class OrangeHRMLoginPage {

	private final By userName_edit = By.xpath( "//input[@name='username']" );
	private final By pwd_edit = By.xpath( "//input[@name='password']" );
	private final By login_btn = By.xpath( "//button[@type='submit']" );
	
	public OrangeHRMLoginPage enterUserName( String user ) {
		DriverManagerClass.getDriver().findElement( userName_edit ).sendKeys( user );
		return this;
	}
	public OrangeHRMLoginPage enterPwd( String pwd ) {
		DriverManagerClass.getDriver().findElement( pwd_edit ).sendKeys( pwd );	
		return this;
	}
	public OrangeHRMHomePage clickLogin() {
		DriverManagerClass.getDriver().findElement( login_btn ).click();
		return new OrangeHRMHomePage();
	}
	
}
