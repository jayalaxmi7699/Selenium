package _2testNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeClass3 {

	
	@Test
//	(priority = 1)
	public void lmn() {

		System.out.println("lmn...");
	}

	@AfterSuite
//	(priority = 2)
	public void suite1()  {
		System.out.println("after suite......");
	}
	
	@BeforeSuite
//	(priority = 2)
	public void suit2()  {
		System.out.println("before suite......");
	}
}
