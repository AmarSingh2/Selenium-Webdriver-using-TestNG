package com.PageObjectModel.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageWIthoutPageFactoryPOM {

		WebDriver driver;
		
		 LoginPageWIthoutPageFactoryPOM(WebDriver d) {
			
			driver = d;
		}
		
		By userName	= By.id("user-name");
		By password	= By.id("password");
		By loginBtn	= By.id("login-button");
		
		public void enterUserName(String uName) {
			driver.findElement(userName).sendKeys(uName);
		}
		
		public void enterPassowrd(String pass) {
			driver.findElement(password).sendKeys(pass);
		}
		
		public void clickLoginButton() {
			driver.findElement(loginBtn).click();
		}

	}




