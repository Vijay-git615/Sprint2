Feature: Login functionality

@End_To_End 
Scenario: Verify Login with valid details 
    Given User launch the chrome browser
    When User navigates to the URL "http://automationpractice.com/index.php?controller=authentication&back=my-account"
    And User Enters EmailAddress as "vijaykulkarni@yopmail.com" and Password as "vijaykulkarni@yopmail.com"
    And Click on Signin button
    Then Page title should be "My account - My Store"
 
@Product_Checkout   
Scenario: Verify Product Checkout functionality 
		Given User launch the chrome browser
    When User navigates to the URL "http://automationpractice.com/index.php?controller=authentication&back=my-account"
#   And User Enters EmailAddress as "saisrinivas123@gmail.com" and Password as "Srinu123"
    And User Enters EmailAddress as "vijaykulkarni@yopmail.com" and Password as "vijaykulkarni@yopmail.com"
	  And Click on Signin button
    And Click on Tshirts Category
    And Click on Add to Cart button
    And Click on Proceed to Checkout button
    
@Order_History
Scenario: Check order history 
		Given User launch the chrome browser
    When User navigates to the URL "http://automationpractice.com/index.php?controller=authentication&back=my-account"
    And User Enters EmailAddress as "vijaykulkarni@yopmail.com" and Password as "vijaykulkarni@yopmail.com"
    And Click on Signin button
    Given Navigate to HomePage
    And Click on User_Account 
    And Click on Order History and Details
    
@Wishlist
Scenario: Add product to wishlist
		Given User launch the chrome browser
    When User navigates to the URL "http://automationpractice.com/index.php?controller=authentication&back=my-account"
    And User Enters EmailAddress as "vijaykulkarni@yopmail.com" and Password as "vijaykulkarni@yopmail.com"
    And Click on Signin button
		Given Navigate to HomePage
    And Click on any Product 
    And Click on Add to wishlist button
    Then Success message will display as "Added to your wishlist."
    