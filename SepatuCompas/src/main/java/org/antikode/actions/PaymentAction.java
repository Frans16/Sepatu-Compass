package org.antikode.actions;

import org.antikode.locators.Payment;
import org.antikode.util.HelperClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

public class PaymentAction {
	Payment paymentLoc = new Payment();
	JavascriptExecutor js = (JavascriptExecutor)HelperClass.getDriver();
	
	public PaymentAction() {
		this.paymentLoc = new Payment();
		PageFactory.initElements(HelperClass.getDriver(), paymentLoc);
	}
	
	public void clickPaymentSpan() {
		try {
			paymentLoc.h_payment.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click()", paymentLoc.h_payment);
		}
	}
	
	public void choosePaymentMethod() {
		try {
			paymentLoc.input_paymentMethod.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click()", paymentLoc.input_paymentMethod);
		}
	}
}
