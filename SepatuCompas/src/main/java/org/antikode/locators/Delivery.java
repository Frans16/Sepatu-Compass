package org.antikode.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Delivery {
	@FindBy(xpath = "//h5[contains(@class,'checkout-item') and text()='Delivery Method']")
	public WebElement h_deliveryMethod;
	
	@FindBy(xpath = "//div[contains(@class,'delivery-method')]//input[@class='form-check-input ' and @id='4']")
	public WebElement input_deliveryMethod;
}
