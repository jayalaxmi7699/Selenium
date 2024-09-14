package retryMechanism;

import org.testng.Assert;
import org.testng.annotations.Test;

import screenshot.ScreenShotsTestSetup;

public class ReTRY_Testcase extends ScreenShotsTestSetup {
	@Test
	public void ebayapp() {
		driver.get("https://www.ebay.com/");
		Assert.assertTrue(false);

	}

}
