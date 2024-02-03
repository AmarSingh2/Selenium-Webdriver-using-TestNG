package com.PageObjectModel.withPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MainLoginSauceDemoWithPageFactoryPOM {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		LoginSauceDemoWithPageFactoryPOM e1 = new LoginSauceDemoWithPageFactoryPOM(driver);
		e1.enterUserName("standard_user");
		e1.enterPassword("secret_sauce");
		e1.LoginButton();
		
		driver.close();
	}
}
