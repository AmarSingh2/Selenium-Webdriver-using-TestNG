package ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTestNG {

	WebDriver driver;
	
	@Test
	public void VerifyTitle() throws InterruptedException {
		driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		String title  = driver.getTitle();
		
		Assert.assertEquals(title,"Swag Labs");
		
		driver.quit();
		
		Thread.sleep(2000);
	}
	
	@Test
	public void VerifyLogo() {
		driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//div[@class='login_logo']"));
		Assert.assertTrue(element.isDisplayed());
		
		driver.quit();
	}
}
