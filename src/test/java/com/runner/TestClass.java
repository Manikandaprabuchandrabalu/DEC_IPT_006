package com.runner;

import java.io.IOException;

import com.base.Base_Class;
import com.pageobjectmanager.PageObjectManager;

public class TestClass extends Base_Class {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		launchBrowser(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("browser"));
		launchUrl(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("url"));
		PageObjectManager.getPageObjectManager().getLoginPage().validLogin();
		PageObjectManager.getPageObjectManager().getSearchProduct().searchProduct();
        PageObjectManager.getPageObjectManager().getCheckoutpage().Checkoutpage();
        PageObjectManager.getPageObjectManager().getLogOutPage().logOutPage();
	}

}
