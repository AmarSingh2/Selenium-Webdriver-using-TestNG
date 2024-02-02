package TestListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListenerClassForImplementation implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("On starting of the Listener test " +result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("The test case method which is successfully executed " +result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("The test case method which is failed " +result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("The test case method which is Skipped " +result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("The test case method which is on the starting phase " +context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("The test case method which is on the finishing phase " +context.getName());
	}

	
}
