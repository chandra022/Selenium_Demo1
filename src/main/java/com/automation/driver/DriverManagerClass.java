package com.automation.driver;

import org.openqa.selenium.WebDriver;

public final class DriverManagerClass {

	private static ThreadLocal<WebDriver> dr = new ThreadLocal();
	private DriverManagerClass() {}
	
	public static WebDriver getDriver() {
		return dr.get();
	}
	public static void setDriver( WebDriver driverRef ) {
		dr.set( driverRef );
	}
	public static void unload() {
		dr.remove();
	}
}
