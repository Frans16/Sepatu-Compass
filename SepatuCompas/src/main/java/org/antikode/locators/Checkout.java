package org.antikode.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout {
	@FindBy(xpath = "//a[@href='/shop' and @class='nav-link']")
	public WebElement a_shop;
	
	@FindBy(xpath = "//div[contains(@class,'card-body')]/h4[contains(@class,'card-title')]")
	public List<WebElement>h_allProduct;
	
	@FindBy(xpath = "//button[contains(@class,'sizes')]//span")
	public List<WebElement>span_allSize;
	
	@FindBy(xpath = "//div[contains(@class,'sizes-list')]/following-sibling::button/span[text()='Add to Bag']")
	public WebElement button_addToBag;
	
	
	@FindBy(xpath = "//button/span[text()='Proceed to Checkout']")
	public WebElement button_checkout;
	
	@FindBy(xpath = "//h5[text()='Purchase Summary']")
	public WebElement h_purchaseTitle;
	
	@FindBy(xpath = "//div[contains(@class,'summary-box')]//div[@class='content']//button")
	public WebElement button_placeOrder;
	
	@FindBy(xpath = "//h1[contains(@class,'title-payment')]")
	public WebElement h_paymentTitle;
}
