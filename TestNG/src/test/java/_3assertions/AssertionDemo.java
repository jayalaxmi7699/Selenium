package _3assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {

	@Test
	void testTitle() {
		String expTitle="opencart";
		String actTitle="opencart";
		// using if else
		if(expTitle.equals(actTitle)) {
			System.out.println("test Passed");
		}else {
			System.out.println("test failed");
		}	
		
		
	}
}
