package com.latihan.day21.main;

import org.openqa.selenium.WebDriver;

import com.latihan.day21.driver.DriverSingleton;
import com.latihan.day21.pages.LoginPages;

public class MainApp {
	
	public static void main(String[] args ) {
		WebDriver driver = DriverSingleton.getInstance().getDriver();
		driver.get("http://automationpractice.com/index.php");
		
		LoginPages lg = new LoginPages();
		
		lg.signIn();
	}

}