package TestNGAnnotationParameter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGAnnotationParameter {

	@Parameters({"title"})
	@Test
	public void GooglePageTitle(String title) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		String webPageTitle = driver.getTitle();
		
		Assert.assertEquals(title, webPageTitle);
		
//		driver.close();
		driver.quit();
		
	}
}
