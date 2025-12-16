package com.testNG;

import org.testng.annotations.Test;

public class Priority_Class {
	
	static int a , b;
	
	@Test(priority = 1)
	private void addition() {
		a = 10;
		b = 20;
        System.out.println(a+b);
	}
	
	@Test(priority = 0)
	private void subraction() {
		a = 45;
		b = 77;
        System.out.println(a - b);
	}
	
	@Test(priority = -10)
	private void multiplcation() {
		a = 62;
		b = 30;
		System.out.println(a*b);

	}
	
	@Test(priority = 0)
	private void division() {
		a = 66;
		b = 42;
		System.out.println(a/b);

	}

}
