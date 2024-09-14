package _3assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {

	@Test
	void testMethod() {
		Assert.assertEquals("abc", "abc"); //t
		Assert.assertNotEquals(123, 124); //f
		
		Assert.assertTrue(true); //t
		Assert.assertFalse(false); //f
		
		Assert.assertTrue(1==2); // f
		Assert.assertTrue(1==1); //t
			
		Assert.assertFalse(1==2); // f
		
		Assert.fail();
	}
}
