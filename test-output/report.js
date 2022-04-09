$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/mystore.feature");
formatter.feature({
  "name": "Login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Login with valid details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@End_To_End"
    }
  ]
});
formatter.step({
  "name": "User launch the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepsDefn.launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to the URL \"http://automationpractice.com/index.php?controller\u003dauthentication\u0026back\u003dmy-account\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepsDefn.Navigate_To_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enters EmailAddress as \"vijaykulkarni@yopmail.com\" and Password as \"vijaykulkarni@yopmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefn.Enter_Credentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Signin button",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefn.click_on_Signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page title should be \"My account - My Store\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsDefn.Verify_Title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Tshirts Category",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefn.click_on_Tshirts_Category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add to Cart button",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefn.click_on_Add_to_Cart_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Proceed to Checkout button",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefn.click_on_Proceed_to_Checkout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepsDefn.navigate_to_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on User_Account",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefn.click_on_User_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Order History and Details",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefn.click_on_Order_History_and_Details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepsDefn.navigate_to_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on any Product",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefn.click_on_any_Product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add to wishlist button",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefn.click_on_Add_to_wishlist_button()"
});
formatter.result({
  "status": "passed"
});
});