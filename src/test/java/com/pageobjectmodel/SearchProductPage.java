package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.SearchProductInterFaceElements;
import com.pageobjectmanager.PageObjectManager;
import com.utlity.FileReaderManager;

public class SearchProductPage extends Base_Class implements SearchProductInterFaceElements {
	
	@FindBy(xpath =   Laptop_xpath)
	private WebElement laptop;
	
	@FindBy(xpath =   viao_xpath )
	private WebElement sonyvio;
	
	@FindBy(xpath= addcart_xpath)
	private WebElement addtocart;
	
	public SearchProductPage() {
		PageFactory.initElements(driver, this);
	}
	public void searchProduct() throws InterruptedException, IOException {
        Explicit_Wait(FileReaderManager.getDataProperty("Explicit_Wait_duration"),laptop);
		elementClick(laptop);
        elementClick(sonyvio);
        Explicit_Wait(FileReaderManager.getDataProperty("Explicit_Wait_duration"),addtocart);
		elementClick(addtocart);
		takeScreenshot(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("takeScreenshot2"));
	}

}
