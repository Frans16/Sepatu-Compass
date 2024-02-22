package org.antikode.actions;

import org.antikode.locators.Delivery;
import org.antikode.util.HelperClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class DeliveryAction {
	Delivery deliveryLoc = new Delivery();
	JavascriptExecutor js = (JavascriptExecutor)HelperClass.getDriver();
	Actions actions = new Actions(HelperClass.getDriver());
	
	public DeliveryAction() {
		this.deliveryLoc = new Delivery();
		PageFactory.initElements(HelperClass.getDriver(), deliveryLoc);
	}
	
	public void clickDeliveryMethodSpan() {
		actions.moveToElement(deliveryLoc.h_deliveryMethod);
		try {
			deliveryLoc.h_deliveryMethod.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click()", deliveryLoc.h_deliveryMethod);
		}
	}
	
	public void chooseDeliveryMethod() {
		try {
			deliveryLoc.input_deliveryMethod.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click()", deliveryLoc.input_deliveryMethod);
		}
	}
}
