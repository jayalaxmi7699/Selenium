package _2testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class BeforeClass {

	@Test
//	(priority = 1)
	public void search() {

		System.out.println("search...");
	}

	@AfterTest
//	(priority = 2)
	public void advSearch()  {
		System.out.println("after test......");
	}
}
