package org.antikode.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Payment {
	@FindBy(xpath = "//h5[text()='Payment']")
	public WebElement h_payment;
	
	@FindBy(xpath = "//div[contains(@class,'payment-method')]//input[@class='form-check-input ' and @id='0']")
	public WebElement input_paymentMethod;
}
