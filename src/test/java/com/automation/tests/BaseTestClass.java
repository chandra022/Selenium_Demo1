package com.automation.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.automation.driver.DriverClass;

public class BaseTestClass {
	
	protected BaseTestClass() {}
	

	@BeforeMethod
	protected void driverSetUp() throws Exception {
//		System.setProperty( "webdriver.chrome.driver" , 
//		System.getProperty("user.dir") + "/src/test/resources/executables/chromedriver.exe");

//---- Alternatively we can use one class for all constant values
//		System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriver());
//		driver = new ChromeDriver();
//		driver.get("https://google.com");
		DriverClass.initiateDriver();
	}

	@AfterMethod
	protected void driverCleanUp() {
		DriverClass.quitDriver();
	}

}
