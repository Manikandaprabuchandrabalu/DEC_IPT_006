package com.testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Class {
	@Test
	private void checking_SoftAssert() {
		String actual_a = "1234567";
		int expected_b = 1234567;
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actual_a,expected_b);
		System.out.println("End of the Method");

	}

}
