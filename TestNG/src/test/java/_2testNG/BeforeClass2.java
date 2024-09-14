package _2testNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeClass2 {

	
	@Test
//	(priority = 1)
	public void abc() {

		System.out.println("abc...");
	}

	@BeforeTest
//	(priority = 2)
	public void xyz()  {
		System.out.println("before every test methods......");
	}
}
