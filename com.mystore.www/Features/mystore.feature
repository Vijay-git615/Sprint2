Feature: Login functionality

@End_To_End 
Scenario: Verify Login with valid details 
    Given User launch the chrome browser
    When User navigates to the URL "http://automationpractice.com/index.php?controller=authentication&back=my-account"
    And User Enters EmailAddress as "vijaykulkarni@yopmail.com" and Password as "vijaykulkarni@yopmail.com"
    And Click on Signin button
    Then Page title should be "My account - My Store"
 
    And Click on Tshirts Category
    And Click on Add to Cart button
    And Click on Proceed to Checkout button
    
    Given Navigate to HomePage
    And Click on User_Account 
    And Click on Order History and Details
    
    Given Navigate to HomePage
    And Click on any Product 
    And Click on Add to wishlist button
    