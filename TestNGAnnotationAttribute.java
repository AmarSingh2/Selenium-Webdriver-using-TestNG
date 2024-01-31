package TestNGAnnotationAttribute;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class TestNGAnnotationAttribute {

	@Test(dependsOnMethods = {"Accenture"})
	public void Infosys() {
		System.out.println("Infosys");
	}
	
	@Test(timeOut = 2000)
	public void Accenture() throws InterruptedException {
//		Thread.sleep(5000);
		System.out.println("Accenture");
	}
	
	@Test(enabled = false)
	public void TataSteel() {
		System.out.println("TataSteel");
	}
	
	@Test(priority = -1)
	public void Maruti() {
		System.out.println("Maruti");
	}
}
