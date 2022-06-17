package com.latihan.day21.pages;

import org.openqa.selenium.Keys;
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
	
	
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]")
	private WebElement btnSignIn;
	
	
	public void signIn() {
		btnSignIn.click();
	}

}
