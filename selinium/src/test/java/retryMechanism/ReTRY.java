package retryMechanism;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReTRY implements IRetryAnalyzer{
	
	private static int retrycount =0;
	private static final int retrymaxcount =4;

	public boolean retry(ITestResult result) {
		if(retrycount<retrymaxcount) {
			retrycount++;
			return true;
		}
		return false;
	}

}
