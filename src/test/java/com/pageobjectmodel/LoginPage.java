package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.LoginPageInterfaceElements;
import com.pageobjectmanager.PageObjectManager;
import com.utlity.FileReaderManager;

public class LoginPage extends Base_Class implements LoginPageInterfaceElements {
	@FindBy(id = Login_id)
	private WebElement login;

	@FindBy(id = username_id)
	private WebElement username;

	@FindBy(id = password_id)
	private WebElement password;

	@FindBy(xpath = signin_xpath)
	private WebElement signin;
	
	@FindBy(id = title_id )
	private WebElement title;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	
	public void validLogin() throws IOException, InterruptedException {
//		Implicit_Wait(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("Implicit_Wait_duration"));
		Explicit_Wait(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("Explicit_Wait_duration"),login);
		elementClick(login);
		Explicit_Wait(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("Explicit_Wait_duration"),username);
		passInput(username,PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("username"));
		Explicit_Wait(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("Explicit_Wait_duration"),password);
		passInput(password, PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("password"));
		elementClick(signin);
//		Thread.sleep(3000);
		Explicit_Wait(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("Explicit_Wait_duration"),title);
        getText(title);
		takeScreenshot(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("takeScreenshot1"));
		

	}

}
