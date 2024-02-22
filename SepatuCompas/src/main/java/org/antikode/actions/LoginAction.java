package org.antikode.actions;

import org.antikode.locators.Login;
import org.antikode.util.HelperClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

public class LoginAction {
	Login logLoc = new Login();
	JavascriptExecutor js = (JavascriptExecutor)HelperClass.getDriver();
	
	public LoginAction() {
		this.logLoc = new Login();
		PageFactory.initElements(HelperClass.getDriver(), logLoc);
	}
	
	
	public void inputEmail(String email) {
		logLoc.input_email.get(0).sendKeys(email);
	}
	
	public void inputPassword(String password) {
		logLoc.input_password.get(0).sendKeys(password);
	}
	
	public void clickLogin() {
		try {
			logLoc.button_login.get(0).click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click()", logLoc.button_login);
		}
	}
	
}
