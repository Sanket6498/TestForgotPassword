package com.forgat.password.related;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPOM {

	@FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a")
	WebElement forgot;

	@FindBy(id = "identify_email")
	WebElement emailId;

	@FindBy(name = "did_submit")
	WebElement searchBtn;

	public FacebookPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void forGotPassword() {
		forgot.click();
	}

	public void enterEmail(String email) {
		emailId.sendKeys(email);
	}

	public void clickSearch() {
		searchBtn.click();
	}
}
