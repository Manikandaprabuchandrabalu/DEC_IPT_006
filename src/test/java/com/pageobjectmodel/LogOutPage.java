package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.LogOutInterFaceElement;
import com.pageobjectmanager.PageObjectManager;

public class LogOutPage extends Base_Class implements LogOutInterFaceElement {

	@FindBy(id = logOut_id)
	private WebElement logOut;

	public LogOutPage() {
		PageFactory.initElements(driver, this);
	}

	public void logOutPage() throws IOException {
//		Implicit_Wait(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("Implicit_Wait_duration"));
		Explicit_Wait(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("Explicit_Wait_duration"), logOut);
		elementClick(logOut);

	}

}
