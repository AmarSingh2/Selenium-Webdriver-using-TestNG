package TestListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.TestNGListenerClassForImplementation.class)
public class TestListenerTestNG {

	@Test
	public void SauceDemologin() throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//input[@id='login-button']")).submit();
		
		driver.quit();
		
		Thread.sleep(2000);
	}
	
	@Test
	public void SauceDemoFailedCase() {
		Assert.assertTrue(false);
	}
	
	@Test
	public void SauceDemoSkipTest() {
		throw new SkipException("This test case is skipped");
	}
	
}