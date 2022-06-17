package com.latihan.day21.pages;

import org.openqa.selenium.JavascriptExecutor;
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
	
	@FindBy(id = "email_create")
	private WebElement emailAddress;
	
	@FindBy(id = "SubmitCreate")
	private WebElement btnCreateAccount;
	
	@FindBy(id = "id_gender2")
	private WebElement rbTitleMrs;
	
	@FindBy(id = "customer_firstname")
	private WebElement firstName;
	
	@FindBy(id = "customer_lastname")
	private WebElement lastName;
	
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "passwd")
	private WebElement password;
	
	@FindBy(id = "days")
	private WebElement birthOfDate;
	
	@FindBy(id = "months")
	private WebElement birthOfMonth;
	
	@FindBy(id = "years")
	private WebElement birthOfYear;
	
	@FindBy(id = "uniform-newsletter")
	private WebElement cbNews;
	
	@FindBy(id = "uniform-optin")
	private WebElement cbPartner;
	
	public void createAccount(String email) {
		btnSignIn.click();
		scroll(driver);
		emailAddress.sendKeys(email);
		btnCreateAccount.click();
	}
	
	public void accountForm(String fn, String ln, String mail, String pass, String dates, String months, String years) {
		rbTitleMrs.click();
		firstName.sendKeys(fn);
		lastName.sendKeys(ln);
		email.clear();
		email.sendKeys(mail);
		password.sendKeys(pass);
		birthOfDate.sendKeys(dates);
		birthOfMonth.sendKeys(months);
		birthOfYear.sendKeys(years);
		scroll(driver);
		cbNews.click();
		cbPartner.click();
		
	}
	
	
	public static void scroll(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0, 1000)");
	}
	
	public static void tunggu() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
