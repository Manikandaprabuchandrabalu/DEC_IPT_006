package com.pageobjectmanager;

import com.pageobjectmodel.CheckoutPage;
import com.pageobjectmodel.LogOutPage;
import com.pageobjectmodel.LoginPage;
import com.pageobjectmodel.SearchProductPage;
import com.utlity.FileReaderManager;

public class PageObjectManager {
	private FileReaderManager fileReader;
	private LoginPage loginPage;
	private static  PageObjectManager pageObjectManager;
	private SearchProductPage searchProduct;
	private CheckoutPage Checkoutpage;
	private LogOutPage logOutPage ;

	public LogOutPage getLogOutPage() {
		if(logOutPage == null) {
			logOutPage= new LogOutPage();
		}
		return logOutPage;
	}
	
	public SearchProductPage getSearchProduct() {
		if (searchProduct == null) {
			searchProduct = new SearchProductPage();
		}
		return searchProduct;
	}

	

	public CheckoutPage getCheckoutpage() {
		if (Checkoutpage == null) {
			Checkoutpage = new CheckoutPage();
		}
		return Checkoutpage;
	}

	public FileReaderManager getFileReader() {
		if (fileReader == null) {
			fileReader = new FileReaderManager();
		}
		return fileReader;
	}

	public LoginPage getLoginPage() {
		if (loginPage == null) {
			loginPage = new LoginPage();
		}
		return loginPage;

	}

	public static  PageObjectManager getPageObjectManager() {
		if (pageObjectManager == null) {
			pageObjectManager = new PageObjectManager();
		}
		return pageObjectManager;
	}

	

}