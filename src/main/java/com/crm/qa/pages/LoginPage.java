package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	// We need to define page factory - OR(Object Repository)
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="pass")
	WebElement pass;
	
	@FindBy(xpath="//button[@name='login']")
	WebElement lgnbtn;
	
	@FindBy(xpath="//a[contains(@id,'u_0_0')]")
	WebElement singupbtn;
	
	//initialize the OR Webelements
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String un, String pwd) {
		email.sendKeys(un);
		pass.sendKeys(pwd);
		lgnbtn.click();
		return new HomePage();
	}
}
