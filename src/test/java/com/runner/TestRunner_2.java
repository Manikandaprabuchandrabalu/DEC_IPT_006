package com.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utlity.ReadExcelData;

public class TestRunner_2 {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.youtube.com/");
		String userinput = ReadExcelData.readParticularData(0, 0, "stars");
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys(userinput);
		driver.findElement(By.xpath("//button[@title='Search']")).click();

	}
}
