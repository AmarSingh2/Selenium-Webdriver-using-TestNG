package com.selenium.Selenium_Webdriver_project_Restart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_OpenAWebpage {

	

		@Test
		public void TestMethod_01() {
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.google.co.in/");
			
			String ResultedTitle = driver.getTitle();
			String ExpectedTitle = "Google";
			
			Assert.assertEquals(ResultedTitle, ExpectedTitle);
		}
	}


