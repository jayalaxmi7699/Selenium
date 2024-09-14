package _3assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo2 {

	@Test
	void testTitle() {
		String expTitle="opencart";
		String actTitle="opencart";
		
		Assert.assertEquals(expTitle, actTitle);
		
	}
}
