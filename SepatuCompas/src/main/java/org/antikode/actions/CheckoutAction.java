package org.antikode.actions;

import java.time.Duration;

import org.antikode.locators.Checkout;
import org.antikode.util.HelperClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutAction {
	Checkout checkoutLoc = new Checkout();
	JavascriptExecutor js = (JavascriptExecutor)HelperClass.getDriver();
	Actions actions = new Actions(HelperClass.getDriver());
	Duration duration = Duration.ofSeconds(30);
	WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), duration);
	
	public CheckoutAction() {
		this.checkoutLoc = new Checkout();
		PageFactory.initElements(HelperClass.getDriver(), checkoutLoc);
	}
	
	public void clickShop() {
		try {
			checkoutLoc.a_shop.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click()", checkoutLoc.a_shop);
		}
	}
	
	public void chooseProduct(String productName) throws InterruptedException {
		Thread.sleep(3000);
		for(int i=0;i<checkoutLoc.h_allProduct.size();i++) {
			if(checkoutLoc.h_allProduct.get(i).getText().equalsIgnoreCase(productName)) {
				try {
					actions.moveToElement(checkoutLoc.h_allProduct.get(5)).perform();
					checkoutLoc.h_allProduct.get(i).click();
				} catch (Exception e) {
					actions.moveToElement(checkoutLoc.h_allProduct.get(5)).perform();
					js.executeScript("arguments[0].click()", checkoutLoc.h_allProduct.get(i));
				}
				break;
			}else {
				System.out.println("No Product");
			}
		}
	}
	
	public void chooseSize(String size) throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Choose Size");
		for(int i=0;i<checkoutLoc.span_allSize.size();i++) {
			if(checkoutLoc.span_allSize.get(i).getText().equalsIgnoreCase(size)) {
				try {
					checkoutLoc.span_allSize.get(i).click();
				} catch (Exception e) {
					js.executeScript("arguments[0].click()", checkoutLoc.span_allSize.get(i));
				}
			}
		}
	}
	
	public void clickAddToBag() {
		try {
			checkoutLoc.button_addToBag.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click()", checkoutLoc.button_addToBag);
		}
	}
	
	
	public void clickCheckout() {
		try {
			checkoutLoc.button_checkout.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click()", checkoutLoc.button_checkout);
		}
	}
	
	public void clickPlaceOrder() {
		try {
			checkoutLoc.button_placeOrder.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click()", checkoutLoc.button_placeOrder);
		}
		
		wait.until(ExpectedConditions.visibilityOf(checkoutLoc.h_paymentTitle));
	}
}
