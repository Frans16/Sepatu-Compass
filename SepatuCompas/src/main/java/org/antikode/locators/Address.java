package org.antikode.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Address {
	
	@FindBy(xpath = "//div[@class='delivery-address']/button")
	public List<WebElement> button_addAddress;
	
	@FindBy(xpath = "//input[@id='addressLabel']")
	public WebElement input_addressLabel;
	
	@FindBy(xpath = "//div[@id='country']")
	public WebElement div_country;
	
	@FindBy(xpath = "//*[@id='react-select-2-input']")
	public WebElement input_country;
	
	@FindBy(xpath = "//input[@id='recipient']")
	public WebElement input_recipient;
	
	@FindBy(xpath = "//input[@id='mobileNumber']")
	public WebElement input_mobileNumber;
	
	@FindBy(xpath = "//input[@id='address']")
	public WebElement input_addressForm;
	
	@FindBy(xpath = "//div[@id='location']")
	public WebElement div_location;
	
	@FindBy(xpath = "//*[@id='react-select-3-input']")
	public WebElement input_location;
	
	@FindBy(xpath = "//div[@id='postcode']")
	public WebElement div_postalCode;
	
	@FindBy(xpath = "//*[@id='react-select-4-input']")
	public WebElement input_postalCode;
	
	@FindBy(xpath = "//div[contains(@class,'form-group')]/button")
	public WebElement button_addAddressForm;
}
