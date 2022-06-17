package com.latihan.day21.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.latihan.day21.driver.DriverSingleton;

public class RegistrasiPages {
	
private WebDriver driver;
	
	public RegistrasiPages() {
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
	private WebElement firstNamePersonal;
	
	@FindBy(id = "customer_lastname")
	private WebElement lastNamePersonal;
	
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
	
	@FindBy(id = "firstname")
	private WebElement firstNameAddress;
	
	@FindBy(id = "lastname")
	private WebElement lastNameAddress;
	
	@FindBy(id = "company")
	private WebElement company;
	
	@FindBy(id = "address1")
	private WebElement address1;
	
	@FindBy(id = "address2")
	private WebElement address2;
	
	@FindBy(id = "city")
	private WebElement city;
	
	@FindBy(id = "id_state")
	private WebElement state;
	
	@FindBy(id = "postcode")
	private WebElement postal;
	
	@FindBy(id = "id_country")
	private WebElement country;
	
	@FindBy(id = "other")
	private WebElement additional;
	
	@FindBy(id = "phone")
	private WebElement homePhone;
	
	@FindBy(id = "phone_mobile")
	private WebElement mobilePhone;
	
	@FindBy(id = "alias")
	private WebElement alias;
	
	@FindBy(id = "submitAccount")
	private WebElement submit;
	
	
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
	private WebElement btnLogout;
	
	
	
	public void createAccount(String email) {
		btnSignIn.click();
		scroll(driver);
		emailAddress.sendKeys(email);
		btnCreateAccount.click();
	}
	
	public void personalForm(String fn, String ln, String mail, String pass, String dates, String months, String years) {
		rbTitleMrs.click();
		firstNamePersonal.sendKeys(fn);
		lastNamePersonal.sendKeys(ln);
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
	
	public void addressForm(String fnAdd, String lnAdd, String companies, String add1, String add2, String cities, String states, String postCode, String other, String homePhones, String mobilePhones, String reference) {
		firstNameAddress.sendKeys(fnAdd);
		lastNameAddress.sendKeys(lnAdd);
		company.sendKeys(companies);
		address1.sendKeys(add1);
		address2.sendKeys(add2);
		city.sendKeys(cities);
		state.sendKeys(states);
		postal.sendKeys(postCode);
		scroll(driver);
//		country.click();
//		country.sendKeys(Keys.ARROW_DOWN);
//		country.sendKeys(Keys.ENTER);
		additional.sendKeys(other);
		homePhone.sendKeys(homePhones);
		mobilePhone.sendKeys(mobilePhones);
		alias.clear();
		alias.sendKeys(reference);
		submit.click();
		tunggu();
	}
	
	public void logout () {
		btnLogout.click();
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
