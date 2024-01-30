package TestNGAnnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {

	@Test
	public void Test1() {
		System.out.println("Test 1 method executed");
	}
	
	@Test
	public void Test2() {
		System.out.println("Test 2 method executed");
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Before method executed");
	}
	
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("After method  executed");
	}
	
	@BeforeTest
	public void Beforetest() {
		System.out.println("Before Test method executed");
	}
	
	@AfterTest
	public void Aftertest() {
		System.out.println("After Test method executed");
	}
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Before class method executed");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("After class method executed");
	}
	
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("Before Suite method executed");
	}
	
	@AfterSuite
	public void Aftersuite() {
		System.out.println("After suite method executed");
	}
	
	
}
