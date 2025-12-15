package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.CheckOutProductInterfaceElement;
import com.pageobjectmanager.PageObjectManager;

public class CheckoutPage extends Base_Class implements CheckOutProductInterfaceElement {
	
	@FindBy(xpath = cartbtn_xpath)
	private WebElement cart;
	
	@FindBy(xpath = place_btn)
	private WebElement placeOrder;
	
	@FindBy(id = userName_id)
	private WebElement nameDetails;
	
	@FindBy(id = country_id )
	private WebElement country;
	
	@FindBy(id =  city_id)
	private WebElement city;
	
	@FindBy(id = credit_id)
	private WebElement card;
	
	@FindBy(id = month_id)
	private WebElement month;
	
	@FindBy(id = year_id)
	private WebElement year;
	
	@FindBy(xpath = purchasebtn_xpath)
	private WebElement purchase;
	
	@FindBy(xpath = ok_btn)
	private WebElement ok;
	
	@FindBy(xpath = close_btn)
	private WebElement close;
	

	public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}

	public void Checkoutpage() throws InterruptedException, IOException {
		Thread.sleep(3000);
        handeling_Alert("simple");
		elementClick( cart);
		takeScreenshot(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("takeScreenshot3"));
		elementClick( placeOrder);
		Explicit_Wait(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("Explicit_Wait_duration"),nameDetails);
        passInput(nameDetails,PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("nameDetail"));
        Explicit_Wait(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("Explicit_Wait_duration"),country);
        passInput(country,PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("country"));
		passInput(city,PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("city"));
		passInput(card,PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("card"));
		passInput(month,PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("month"));
		passInput(year,PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("year"));
		elementClick( purchase);
		takeScreenshot(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("takeScreenshot4"));
		Explicit_Wait(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("Explicit_Wait_duration"),ok);
	    elementClick(ok);
	 
	    
	}

}
