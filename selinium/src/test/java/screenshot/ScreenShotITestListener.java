package screenshot;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenShotITestListener extends  ScreenShotsTestSetup implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getTestContext().getName()+"-"+ result.getMethod().getMethodName());
		captureScreenshot(result.getTestContext().getName()+"-"+result.getMethod().getMethodName()+".png");
	}

	
}
