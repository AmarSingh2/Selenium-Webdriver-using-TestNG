package com.PageObjectModel.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginSauceDemoWithoutPOM {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		driver.quit();
	}

}
