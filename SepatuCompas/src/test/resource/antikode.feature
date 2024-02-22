Feature: The process of purchasing shoes on the Compass site

  @Register
  Scenario: Register into site
    Given User is already at the profile site
		When User clicks the register button
		And User enter a name
		And User enter a email
		And User enter a mobile number
		And User enter a date of birth
		And User enter a password
		And User click register button
		Then User has successfully registered
		
	@Login
	Scenario: Login into site
		Given User is already at the profile site
		When User enter a login email
		And User enter a login password
		And User click login button
		Then User has successfully logged in
		
	@Checkout
	Scenario: Checkout product
		Given User is already at the shop site
		When User selects the name of the shoes they want to buy
		And User chooses the shoe size
		And User presses the add to bag button
		And User click proceed to checkout button
		And User enter a adress
		And User choose delivery method
		And User choose payment method
		And User click place holder button
		Then User successfully adds the shoes to the cart
