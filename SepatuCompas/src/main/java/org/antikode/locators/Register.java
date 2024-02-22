package org.antikode.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register {
	@FindBy(xpath = "//div[@class='form-wrapper']//div//div//button[not(contains(@class,'false'))]/span[text()='Register']")
	public WebElement button_register;
	
	@FindBy(xpath = "//input[@id='name']")
	public WebElement input_name;
	
	@FindBy(xpath = "//div[@id='register']//form//div//div//div/input[@id='email']")
	public List<WebElement> input_email;
	
	@FindBy(xpath = "//input[@id='mobileNumber']")
	public WebElement input_mobileNumber;
	
	@FindBy(xpath = "//input[@id='dob']")
	public WebElement input_dob;
	
	@FindBy(xpath = "//div[@id='register']//form//div//div//div/input[@id='password']")
	public List<WebElement> input_password;
	
	@FindBy(xpath = "//div[@class='form-wrapper']//div//div//button[contains(@class,'false')]/span[text()='Register']")
	public WebElement button_registerForm;
}
