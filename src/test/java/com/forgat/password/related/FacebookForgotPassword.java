package com.forgat.password.related;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookForgotPassword {

	WebDriver driver;
	FacebookPOM facebookPOM;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		facebookPOM = new FacebookPOM(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void validCreadential() {
		facebookPOM.forGotPassword();
		Assert.assertEquals(driver.getTitle(), "Forgotten Password | Can't Log In | Facebook");
		facebookPOM.enterEmail("ram126@gmail.com");
		facebookPOM.clickSearch();
	}

	@AfterMethod
	public void closeBrowser() {
		// driver.quit();
	}
}
