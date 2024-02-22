package org.antikode.definitions;

import org.antikode.actions.AddressAction;
import org.antikode.actions.CheckoutAction;
import org.antikode.actions.DeliveryAction;
import org.antikode.actions.HomePageAction;
import org.antikode.actions.LoginAction;
import org.antikode.actions.PaymentAction;
import org.antikode.actions.RegisterAction;
import org.antikode.fileReader.FileReader;
import org.antikode.util.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AntikodeDefinitions {
	HomePageAction homepageAct = new HomePageAction();
	RegisterAction regAct = new RegisterAction();
	LoginAction logAct = new LoginAction();
	CheckoutAction checkoutAct = new CheckoutAction();
	AddressAction addressAct = new AddressAction();
	DeliveryAction deliveryAct = new DeliveryAction();
	PaymentAction paymentAct = new PaymentAction();
	
	//REGISTER
	@Given("User is already at the profile site")
	public void user_is_already_at_the_profile_site() {
	    HelperClass.openPage(FileReader.getUrl());
	    homepageAct.closeModal();
	    homepageAct.clickProfileButton();
	}
	@When("User clicks the register button")
	public void user_clicks_the_register_button() {
	    regAct.clickRegisterButton();
	}
	@When("User enter a name")
	public void user_enter_a_name() {
	    regAct.inputName(FileReader.getName());
	}
	@When("User enter a email")
	public void user_enter_a_email() {
	    regAct.inputEmail(FileReader.getEmail());
	}
	@When("User enter a mobile number")
	public void user_enter_a_mobile_number() {
	    regAct.inputMobileNumber(FileReader.getMobileNumber());
	}
	@When("User enter a date of birth")
	public void user_enter_a_date_of_birth() {
	    regAct.inputDateOfBirth(FileReader.getDateOfBirth());
	}
	@When("User enter a password")
	public void user_enter_a_password() {
	    regAct.inputPassword(FileReader.getPassword());
	}
	@When("User click register button")
	public void user_click_register_button() throws InterruptedException {
		//regAct.clickRegisterForm();
		Thread.sleep(3000);
	}
	@Then("User has successfully registered")
	public void user_has_successfully_registered() {
	    System.out.println("REGISTER DONE");
	}
	
	//LOGIN
	@When("User enter a login email")
	public void user_enter_a_login_email() {
	    logAct.inputEmail(FileReader.getEmail());
	}
	@When("User enter a login password")
	public void user_enter_a_login_password() {
	    logAct.inputPassword(FileReader.getPassword());
	}
	@When("User click login button")
	public void user_click_login_button() throws InterruptedException {
	    logAct.clickLogin();
	    Thread.sleep(10000);
	}
	@Then("User has successfully logged in")
	public void user_has_successfully_logged_in() {
		System.out.println("LOGIN DONE");
	}
	
	//CHECKOUT
	@Given("User is already at the shop site")
	public void user_is_already_at_the_shop_site() {
		homepageAct.closeModal();
		checkoutAct.clickShop();
	}
	@When("User selects the name of the shoes they want to buy")
	public void user_selects_the_name_of_the_shoes_they_want_to_buy() throws InterruptedException {
	    checkoutAct.chooseProduct(FileReader.getProductName());
	}
	@When("User chooses the shoe size")
	public void user_chooses_the_shoe_size() throws InterruptedException {
	    checkoutAct.chooseSize(FileReader.getSize());
	}
	@When("User presses the add to bag button")
	public void user_presses_the_add_to_bag_button() {
	    checkoutAct.clickAddToBag();
	}
	
	@When("User click proceed to checkout button")
	public void user_click_proceed_to_checkout_button() {
	   checkoutAct.clickCheckout();
	}
	@When("User enter a adress")
	public void user_enter_a_adress() throws InterruptedException {
		addressAct.inputAddress(FileReader.getAddressLabel(), FileReader.getCountry(), 
				FileReader.getRecipientName(), FileReader.getRecipientNumber(), FileReader.getAddress(), 
				FileReader.getCity(), FileReader.getPostalCode());
	    Thread.sleep(2000);
	}
	
	@When("User choose delivery method")
	public void user_choose_delivery_method() throws InterruptedException {
	    deliveryAct.clickDeliveryMethodSpan();
	    deliveryAct.chooseDeliveryMethod();
	    Thread.sleep(5000);
	}
	@When("User choose payment method")
	public void user_choose_payment_method() {
	    paymentAct.clickPaymentSpan();
	    paymentAct.choosePaymentMethod();
	}
	@When("User click place holder button")
	public void user_click_place_holder_button() throws InterruptedException {
	    checkoutAct.clickPlaceOrder();
	    Thread.sleep(5000);
	}
	@Then("User successfully adds the shoes to the cart")
	public void user_successfully_adds_the_shoes_to_the_cart() {
		System.out.println("CHECKOUT DONE");
	}
}
