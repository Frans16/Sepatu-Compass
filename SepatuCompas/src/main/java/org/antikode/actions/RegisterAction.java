package org.antikode.actions;

import org.antikode.locators.Register;
import org.antikode.util.HelperClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

public class RegisterAction {
	Register regLoct = new Register();
	JavascriptExecutor js = (JavascriptExecutor)HelperClass.getDriver();
	
	public RegisterAction() {
		this.regLoct  = new Register();
		PageFactory.initElements(HelperClass.getDriver(), regLoct);
	}
	
	public void clickRegisterButton() {
		try {
			regLoct.button_register.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click()", regLoct.button_register);
		}
	}
	
	public void inputName(String name) {
		regLoct.input_name.sendKeys(name);
	}
	
	public void inputEmail(String email) {
		regLoct.input_email.get(0).sendKeys(email);
	}
	
	public void inputMobileNumber(String mobileNumber) {
		regLoct.input_mobileNumber.sendKeys(mobileNumber);
	}
	
	public void inputDateOfBirth(String dob) {
		regLoct.input_dob.sendKeys(dob);
	}
	
	public void inputPassword(String password) {
		regLoct.input_password.get(0).sendKeys(password);
	}
	
	public void clickRegisterForm() {
		try {
			regLoct.button_registerForm.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click()", regLoct.button_registerForm);
		}
	}
	
}
