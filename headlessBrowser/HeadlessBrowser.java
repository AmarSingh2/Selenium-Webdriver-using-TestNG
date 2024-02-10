package com.headlessBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {

//		WebDriver driver = new EdgeDriver();
		
		EdgeOptions edgeOption = new EdgeOptions();
//		edgeOption.setHeadless(true);
		edgeOption.addArguments("--headless");
		WebDriver driver = new EdgeDriver(edgeOption);
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		System.out.println("Before searching the keyword : " +driver.getTitle());
		
		System.out.println();
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Taj Mahal");
		element.sendKeys(Keys.ENTER);
		System.out.println("After searching the keyword : " +driver.getTitle());
		
		driver.close();
	}

}
