package org.antikode.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	@FindBy(xpath = "//div[@id='login']//form//div//div//div/input[@id='email']")
	public List<WebElement> input_email;
	
	@FindBy(xpath = "//div[@id='login']//form//div//div//div/input[@id='password']")
	public List<WebElement> input_password;
	
	@FindBy(xpath = "//button[@type='submit']/span[text()='Login']")
	public List<WebElement> button_login;
}
