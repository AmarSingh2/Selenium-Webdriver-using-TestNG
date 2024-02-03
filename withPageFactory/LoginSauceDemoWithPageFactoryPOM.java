package com.PageObjectModel.withPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSauceDemoWithPageFactoryPOM {

	WebDriver driver;
	
	LoginSauceDemoWithPageFactoryPOM(WebDriver d){
		// it will help for creating he webelement
//		PageFactory.initElements(driver, this);
		driver=d;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "user-name")
	WebElement UserName;
	
	@FindBy(id = "password")
	WebElement Password;
	
	@FindBy(id = "login-button")
	WebElement loginBtn;
	
	
	
	public void enterUserName(String uname) {
		UserName.sendKeys(uname);
	}
	
	public void enterPassword(String password) {
		Password.sendKeys(password);
	}
	
	public void LoginButton() {
		UserName.click();
	}
}
