package CrossBrowserTesting.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTestNG {

	WebDriver driver ;
	
	// Launch Browser
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browser) {
		switch(browser.toLowerCase()) {
		
		case "chrome" :
			driver= new ChromeDriver();
			break;
			
		case "edge" :	
			driver= new EdgeDriver();
			break;
		}
	}
	
	// Verify google web page title
	@Test
	public void verifyTitle() {
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	// Close the browser
	@AfterTest
	public void quit() {
		driver.close();
	}
}
