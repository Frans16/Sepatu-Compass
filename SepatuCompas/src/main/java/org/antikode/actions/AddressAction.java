package org.antikode.actions;

import org.antikode.locators.Address;
import org.antikode.util.HelperClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class AddressAction {
	Address addressLoc = new Address();
	JavascriptExecutor js = (JavascriptExecutor)HelperClass.getDriver();
	Actions actions = new Actions(HelperClass.getDriver());
	
	public AddressAction() {
		this.addressLoc = new Address();
		PageFactory.initElements(HelperClass.getDriver(), addressLoc);
	}
	
	public boolean verifyButtonAddAddress() {
		boolean buttonAddAdressPresent = false;
		buttonAddAdressPresent = addressLoc.button_addAddress.size()>0;
		
		return buttonAddAdressPresent;
	}
	
	public void clickAddAdress() {
		try {
			addressLoc.button_addAddress.get(0).click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click()", addressLoc.button_addAddress);
		}
	}
	
	public void inputAddressLabel(String addressLabel) {
		addressLoc.input_addressLabel.sendKeys(addressLabel);
	}
	
	public void chooseCountry(String country) throws InterruptedException {
		try {
			addressLoc.div_country.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click()", addressLoc.div_country);
		}
		
		Thread.sleep(2000);
		addressLoc.input_country.sendKeys(country);
		Thread.sleep(2000);
		actions.keyDown(Keys.ENTER)
        .perform();
		Thread.sleep(2000);
	}
	
	public void inputRecipientName(String name) {
		addressLoc.input_recipient.sendKeys(name);
	}
	
	public void inputMobileNumber(String mobileNumber) {
		addressLoc.input_mobileNumber.sendKeys(mobileNumber);
	}
	
	public void inputAddress(String address) {
		addressLoc.input_addressForm.sendKeys(address);
	}
	
	public void inputCity(String address) {
		addressLoc.input_addressForm.sendKeys(address);
	}
	
	public void chooseCity(String city) throws InterruptedException {
		try {
			addressLoc.div_location.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click()", addressLoc.div_location);
		}
		
		Thread.sleep(2000);
		addressLoc.input_location.sendKeys(city);
		Thread.sleep(2000);
		actions.keyDown(Keys.ENTER)
        .perform();
		Thread.sleep(2000);
	}
	
	public void choosePostalCode(String postalCode) throws InterruptedException {
		try {
			addressLoc.div_postalCode.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click()", addressLoc.div_postalCode);
		}
		
		Thread.sleep(2000);
		addressLoc.input_postalCode.sendKeys(postalCode);
		Thread.sleep(2000);
		actions.keyDown(Keys.ENTER)
        .perform();
		Thread.sleep(2000);
	}
	
	public void clickAddAdressForm() {
		try {
			addressLoc.button_addAddressForm.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click()", addressLoc.button_addAddressForm);
		}
	}
	
	public void inputAddress(String addressLabel, String country, String recipientName, String mobileNumber, String address, String city,
			String postalCode) throws InterruptedException {
		if(verifyButtonAddAddress() == true) {
			clickAddAdress();
		    inputAddressLabel(addressLabel);
		    chooseCountry(country);
		    inputRecipientName(recipientName);
		    inputMobileNumber(mobileNumber);
		    inputAddress(address);
		    chooseCity(city);
		    choosePostalCode(postalCode);
		    clickAddAdressForm();
		    Thread.sleep(10000);
		}else {
			System.out.println("Address is present");
		}
		
	}
}
