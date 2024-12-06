package com.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.automation.driver.DriverManagerClass;

public final class LoginPageTests extends BaseTestClass {
	
	private LoginPageTests() {	}
	@Test
	public void test1() {
		DriverManagerClass.getDriver().findElement(By.name("q")).sendKeys("Automation", Keys.RETURN);
	}

	@Test
	public void test2() {
		DriverManagerClass.getDriver().findElement(By.name("q")).sendKeys("Selenium", Keys.RETURN);
	}
}
