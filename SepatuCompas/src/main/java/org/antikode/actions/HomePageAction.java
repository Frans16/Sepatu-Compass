package org.antikode.actions;

import org.antikode.locators.HomePage;
import org.antikode.util.HelperClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

public class HomePageAction {
	HomePage homepageLoc = new HomePage();
	JavascriptExecutor js = (JavascriptExecutor)HelperClass.getDriver();
	
	public HomePageAction() {
		this.homepageLoc = new HomePage();
		PageFactory.initElements(HelperClass.getDriver(), homepageLoc);
	}
	
	public void closeModal() {
		if(homepageLoc.h_modal.isDisplayed()) {
			homepageLoc.i_close.click();
		}else {
			;
		}
	}
	
	public void clickProfileButton() {
		try {
			homepageLoc.a_login.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click()", homepageLoc.a_login);
		}
	}
	
	
}
