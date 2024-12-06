package com.automation.tests;

import java.util.List;
import java.util.Objects;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.driver.DriverManagerClass;

public final class HomePageTests extends BaseTestClass{

	private HomePageTests() {}
	
	@Test
	public void test3() {
		DriverManagerClass.getDriver().findElement(By.name("q")).sendKeys("Selenium", Keys.RETURN);
	}
	
//	>>>	Validate below
//		title of the page should contain Google Search / google search
//		title is not null and its length is greater than 15 and less than 100
//		check of links in the results page  --> Testing mini bites - youtube
//		number of links displayed is exactly equal to 10 or 15
	
	@Test
	public void googlePageTest() {
		DriverManagerClass.getDriver().findElement( By.name("q" ) )
					.sendKeys( "Testing mini bites - youtube" , Keys.ENTER);
		String title = DriverManagerClass.getDriver().getTitle();
//		Assert.assertTrue( Objects.nonNull(title) );
//		Assert.assertTrue( title.toLowerCase().contains( "google search") );
//		Assert.assertTrue( title.toLowerCase().matches("\\w.*" + "google search") );
//		Assert.assertTrue( (title.length() > 15) && ( title.length() <100) );
		
		Assertions.assertThat(title)
				.isNotNull()
				.containsIgnoringCase( "google search" )
				.matches( "\\w.*" + "google search" )
				.hasSizeBetween(15, 100);
		
		List<WebElement> linksList = DriverManagerClass.getDriver()
				.findElements( By.xpath ("//h3/span") );
//		Assert.assertEquals( linksList.size(), 10 );
		
		Assertions.assertThat( linksList )
				.hasSize( 10 )
				.extracting( e -> e.getText() )
				.contains( "Testing Mini Bits - youtube");
		
		boolean isElmPresent = false;
		for( WebElement elm : linksList ) {
			if( elm.getText().equalsIgnoreCase( "Testing mini bites - youtube" ) ) {
				isElmPresent = true;
				break;
			}
		}
		Assert.assertTrue( isElmPresent , "'Testing mini bites - youtube' link not present.");
		
		
		
	}
}




