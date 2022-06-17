package com.latihan.day21.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.latihan.day21.driver.DriverSingleton;

public class LoginPages {
	private WebDriver driver;
	
	public LoginPages() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "passwd")
	private WebElement password;
	
	@FindBy(id = "SubmitLogin")
	private WebElement submit;
	
	public void Login(String emails, String pass) {
		email.sendKeys(emails);
		password.sendKeys(pass);
		submit.click();
	}
	
	

}
