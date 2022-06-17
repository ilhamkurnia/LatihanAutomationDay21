package com.latihan.day21.main;

import org.openqa.selenium.WebDriver;

import com.latihan.day21.driver.DriverSingleton;
import com.latihan.day21.pages.LoginPages;
import com.latihan.day21.pages.RegistrasiPages;

public class MainApp {
	
	public static void main(String[] args ) {
		WebDriver driver = DriverSingleton.getInstance().getDriver();
		driver.get("http://automationpractice.com");
		
		RegistrasiPages rg = new RegistrasiPages();
		
		rg.createAccount("cobacoba3@gmail.com");
		rg.personalForm("ilham", "kurnia", "cobacoba3@gmail.com", "test1", "15", "March", "1997");
		rg.addressForm("Juara", "Coding", "Pt. Juara Coding", "Jl. Tebet Timur Dalem Raya", "Juara Bootcamp", "Jakarta", "Texas", "12233", "pokoknya di indonesia", "0211231231", "08123123", "Bootcamp");
		rg.logout();
		
		LoginPages lg = new LoginPages();
		lg.Login("cobacoba3@gmail.com", "test1");
	}

}