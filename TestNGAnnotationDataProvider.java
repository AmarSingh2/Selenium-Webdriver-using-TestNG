package TestNGAnnotationDataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGAnnotationDataProvider {
	
	@DataProvider(name="SearchData")
	public Object [][]  searchDataMethod(){
		
		Object[][] searchDataInstance = new Object[3][2];
		
		searchDataInstance[0][0]="Hyderabad";
		searchDataInstance[0][1]="Qutab Minar";
		
		searchDataInstance[1][0]="Maharashtra";
		searchDataInstance[1][1]="India Gate";
		
		searchDataInstance[2][0]="Uttar Pradesh";
		searchDataInstance[2][1]="Taj Mahal";
		
		return searchDataInstance;
		
	}
	
	
	

	@Test(dataProvider = "SearchData")
	public void SearchData(String state , String place ) {
		 WebDriver driver = new EdgeDriver();
		 driver.get("https://www.google.co.in/");
		 driver.manage().window().maximize();
		 
		 WebElement element =driver.findElement(By.name("q"));
		 element.sendKeys(state + " " + place);
		 
		 driver.findElement(By.name("btnK")).submit();
		 
//		 driver.close();
		 driver.quit();
		
	}
}
