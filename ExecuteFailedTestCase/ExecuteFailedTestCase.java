package ExecuteFailedTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExecuteFailedTestCase {

	@Test(retryAnalyzer = RetryAnalyzerclass.class)
	public void TestCase01() {
		Assert.assertTrue(false);
		System.out.println("Failed Case 01");
	}
	
	@Test(retryAnalyzer = RetryAnalyzerclass.class)
	public void TestCase02() {
		Assert.assertTrue(false);
		System.out.println("Failed Case 02");
	}
	
	@Test(retryAnalyzer = RetryAnalyzerclass.class)
	public void TestCase03() {
		Assert.assertTrue(true);
		System.out.println("Pass Case 03");
	}
}
