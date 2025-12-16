package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;




public class Hard_Assert_Class {
	
	@Test
	private void checking_HardAssert() {
		String actual_a = "1234567";
		int expected_b = 1234567;
		Assert.assertEquals(actual_a, expected_b);
		System.out.println("End of the hard_assert");

	}

}
