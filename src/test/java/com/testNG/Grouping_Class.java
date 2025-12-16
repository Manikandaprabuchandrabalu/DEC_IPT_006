package com.testNG;

import org.testng.annotations.Test;

public class Grouping_Class {

	@Test(groups = "final")
	private void Chennai_Super_Kings() {
		System.out.println("csk");

	}

	@Test(groups = "rejected")
	private void Punjab_kings() {
		System.out.println("pbk");

	}

	@Test(groups = "rejected")
	private void Delhi_Capitals() {
		System.out.println("dc");

	}

	@Test(groups = "rejected")
	private void Kolkata_Kinght_Riders() {
		System.out.println("kkr");

	}

	@Test(groups = "semi")
	private void Mumbai_Indians() {
		System.out.println("mi");

	}

	@Test(groups = "rejected")
	private void Rajestan_Royals() {
		System.out.println("rr");

	}

	@Test(groups = "final")
	private void Royal_Challenger_bangalore() {
		System.out.println("rcb");

	}

	@Test(groups = "semi")
	private void Gujurat_Titans() {
		System.out.println("gt");

	}

	@Test(groups = "rejected")
	private void Sunrisers_Hydrabad() {
		System.out.println("Srh");

	}

}
