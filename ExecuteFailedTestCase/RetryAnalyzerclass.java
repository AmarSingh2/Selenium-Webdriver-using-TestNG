package ExecuteFailedTestCase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerclass implements IRetryAnalyzer {

	int retryCounter=0;
	
	int maximumRetry=3;
	
	@Override
	public boolean retry(ITestResult result) {
		if(!result.isSuccess()) {
			if(retryCounter < maximumRetry) {
				retryCounter++;
				return true;
			}
		}
		return false;
	}

	
}
