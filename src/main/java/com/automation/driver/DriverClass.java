package com.automation.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.constants.FrameworkConstants;
import com.automation.utils.ReadProperties;

public final class DriverClass {

	private DriverClass() {}
	
	public static void initiateDriver() throws Exception {
		if( Objects.isNull( DriverManagerClass.getDriver() ) ){
			System.setProperty( "webdriver.chrome.driver", FrameworkConstants.getChromeDriver() );
			DriverManagerClass.setDriver( new ChromeDriver() );
			DriverManagerClass.getDriver().get( ReadProperties.getValue("url"));
		}
	}
	public static void quitDriver() {
		if( Objects.nonNull( DriverManagerClass.getDriver()) ) {
			DriverManagerClass.getDriver().quit();
			DriverManagerClass.unload();
		}
	}

//	public static void initiateDriver() {
//		// with this if condition, even if you use initiateDriver method other than BeforeMethod annotation it would not create another browser instance		
////		if (driver == null) {
//		if ( Objects.isNull(driver) ) {
//			System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriver());
//			driver = new ChromeDriver();
//			driver.get("https://google.com");
//		}
//	}
//
//	public static void quitDriver() {
//		if( driver != null ) {
//			driver.quit();
//			driver = null;
//		}
//		
//	}

}
