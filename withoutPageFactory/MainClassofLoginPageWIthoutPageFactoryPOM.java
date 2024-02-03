package com.PageObjectModel.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MainClassofLoginPageWIthoutPageFactoryPOM {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		LoginPageWIthoutPageFactoryPOM withoutPageFactory = new LoginPageWIthoutPageFactoryPOM(driver);
		withoutPageFactory.enterUserName("user-name");
		withoutPageFactory.enterPassowrd("password");
		withoutPageFactory.clickLoginButton();
		
		driver.close();
	}

}
