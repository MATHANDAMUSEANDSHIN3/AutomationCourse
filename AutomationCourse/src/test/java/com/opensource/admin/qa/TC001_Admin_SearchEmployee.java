package com.opensource.admin.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.*;

public class TC001_Admin_SearchEmployee {
	@Test
	public void TC001_Admin_SearchEmployee_TC() {
		Reporter.log("Open Browser \"OrangeHRM\" web page");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

}
