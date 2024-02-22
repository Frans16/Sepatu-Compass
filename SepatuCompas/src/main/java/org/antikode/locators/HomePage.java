package org.antikode.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(xpath = "//div[@class='modal-content ']//div/h4")
	public WebElement h_modal;
	
	@FindBy(xpath = "//div[@class='close']/i")
	public WebElement i_close;
	
	@FindBy(xpath = "//a[@href='/login' and contains(@class,'account-button')]")
	public WebElement a_login;
}
