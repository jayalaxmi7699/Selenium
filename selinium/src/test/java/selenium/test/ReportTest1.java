package selenium.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportTest1 {

	@Test
	public void reportOne() {
		System.out.println("first report");
	}

	@Test
	public void reportTwo() {
		Reporter.log("Second");
		System.out.println("Second report");
	}

	@Test
	public void reportThree() {
		System.out.println("Third report");
	}

	@Test
	public void reportFour() {
		System.out.println("four report");
	}

	@Test
	public void reportFive() {
		System.out.println("five report");
	}

}
