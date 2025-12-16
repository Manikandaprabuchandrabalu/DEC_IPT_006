package com.testNG;

import org.testng.annotations.Test;

public class Depends_On_Method {

	static int a , b;
	
	@Test(priority = 100)
	private void addition() {
		a = 10;
		b = 20;
        System.out.println("the addition value is: "+ (a+b));
	}
	
	@Test(dependsOnMethods = {"multiplication","division"})
	private void subraction() {
		a = 45;
		b = 77;
        System.out.println("the subracted value is: "+(a - b));
	}
	
	@Test(dependsOnMethods = "addition")
	private void multiplication() {
		a = 62;
		b = 30;
		System.out.println("the multipled value is; "+(a*b));

	}
	
	@Test(priority = 101)
	private void division() {
		a = 66;
		b = 42;
		System.out.println("the divided value is " + (a/b));

	}


}
