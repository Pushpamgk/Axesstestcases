Feature: Title of your feature



@testcase1
Scenario: Register User
Given User Launch the browser
Then  Navigate to automation exercise url
And  Verify that home page is visible successfully
Then User Click on Signup or Login button
Then Verify New User Signup is visible
And User Enter name and email address
Then Click Signup button
And Verify that ENTER ACCOUNT INFORMATION is visible
Then User  Select Mr or Mrs
Then Enter the password
Then choose Date of birth
Then Select checkbox Sign up for our newsletter!
Then Select checkbox Receive special offers from our partners!
Then User Enter Firstname and lastname
Then User Enter company, address and address2
Then User Enter State,City,Zipcode and mobilenumber
Then Click Create Account button
And  Verify that ACCOUNT CREATED is visible
Then  Click Continue button
And  Verify that Logged in as username is visible
Then Click Delete Account button
And Verify ACCOUNT DELETED and click Continue button 



@testcase2
Scenario: Login User with correct email and password
Given User Launch the browser
Then  Navigate to automation exercise url
And  Verify that home page is visible successfully
Then User Click on Signup or Login button
Then Verify Login to your account is visible
Then User Enter correct email address and password
And  Click login button
Then Verify that Logged in as username is visible
#Then Click Delete Account button
#And Verify that ACCOUNT DELETED is visible

@testcase3
Scenario: Login User with incorrect email and password
Given User Launch the browser
Then  Navigate to automation exercise url
And  Verify that home page is visible successfully
Then User Click on Signup or Login button
Then Verify Login to your account is visible
Then User Enter incorrect email address and password
And  Click login button
Then Verify error Your email or password is incorrect is visible

@testcase4
Scenario: Logout User
Given User Launch the browser
Then  Navigate to automation exercise url
And  Verify that home page is visible successfully
Then User Click on Signup or Login button
Then Verify Login to your account is visible
Then User Enter correct email address and password
And  Click login button
Then Verify that Logged in as username is visible
Then User Click Logout button
And Verify that user is navigated to login page

@testcase5
Scenario: Register User with existing email
Given User Launch the browser
Then  Navigate to automation exercise url
And  Verify that home page is visible successfully
Then User Click on Signup or Login button
Then Verify New User Signup is visible
And User Enter name and already registered email address
Then Click Signup button
And Verify error Email Address already exist is visible


@testcase6
Scenario: Contact Us Form
Given User Launch the browser
Then  Navigate to automation exercise url
And  Verify that home page is visible successfully
Then User Click on Contact Us button
And Verify GET IN TOUCH is visible
Then Enter name, email, subject and message
And Upload file
Then Click Submit button
Then Click OK button
And Verify success message Success! Your details have been submitted successfully is visible
Then Click Home button 
And verify that landed to home page successfully


@testcase7
Scenario: Verify Test Cases Page
Given User Launch the browser
Then  Navigate to automation exercise url
And  Verify that home page is visible successfully
Then User Click on Test Cases button
And Verify user is navigated to test cases page successfully


@testcase8
Scenario: Verify All Products and product detail page
Given User Launch the browser
Then  Navigate to automation exercise url
And  Verify that home page is visible successfully
Then Click on Products button
And Verify user is navigated to ALL PRODUCTS page successfully
And Verify the products list is visible
Then Click on View Product of first product
Then Verify User is landed to product detail page
And Verify that productname and category is visible
Then verify that price and availability is visible
Then verify that condition and Brand is visible

@testcase9
Scenario: Search Product
Given User Launch the browser
Then  Navigate to automation exercise url
And  Verify that home page is visible successfully
Then Click on Products button
And Verify user is navigated to ALL PRODUCTS page successfully
Then Enter product name and Click search button
And Verify SEARCHED PRODUCTS is visible
Then Verify all the products related to search are visible
 
 @testcase10   
Scenario: Verify Subscription in home page
Given User Launch the browser
Then  Navigate to automation exercise url
And  Verify that home page is visible successfully
Then Scroll down to footer
And Verify text SUBSCRIPTION
Then Enter email address in input and click arrow button
And Verify success message You have been successfully subscribed is visible


@testcase11
Scenario: Verify Subscription in Cart page
Given User Launch the browser
Then  Navigate to automation exercise url
And  Verify that home page is visible successfully
Then User Click Cart button
Then Scroll down to footer
And Verify text SUBSCRIPTION
Then Enter email address in input and click arrow button
And Verify success message You have been successfully subscribed is visible

@testcase12
Scenario: Add Products in Cart
Given User Launch the browser
Then  Navigate to automation exercise url
And  Verify that home page is visible successfully
Then Click on Products button
Then User Hover over first product and click Add to cart
And Click Continue Shopping button
Then User Hover over second product and click Add to cart
And Click View Cart button
Then Verify both products are added to Cart
And Verify their prices, quantity and total price

@testcase13
Scenario: Verify Product quantity in Cart
Given User Launch the browser
Then  Navigate to automation exercise url
And  Verify that home page is visible successfully
Then Click View Product for any product on home page
And Verify product detail is opened
Then Increase quantity to four
Then User Click Add to cart button
And Click View Cart button
Then Verify that product is displayed in cart page with exact quantity


@testcase14
Scenario: Place Order: Register while Checkout
Given User Launch the browser
Then  Navigate to automation exercise url
And  Verify that home page is visible successfully
Then User Add products to cart
And Click Cart button
Then Verify that cart page is displayed
Then Click Proceed To Checkout button
And Click Register or Login button
Then Fill all details in Signup and create account
Then Verify ACCOUNT CREATED and click Continue button
Then Verify Logged in as username at top
And Click Cart button
Then Click Proceed To Checkout button
And Verify Address Details and Review Your Order
Then Enter description in comment text area and click Place Order
Then Enter payment details: Name on Card, Card Number, CVC, Expiration date
Then Click Pay and Confirm Order button
And Verify success message Your order has been placed successfully
Then Click Delete Account button
And Verify ACCOUNT DELETED and click Continue button 

@testcase15
Scenario: Place Order: Register before Checkout
Given User Launch the browser
Then  Navigate to automation exercise url
And  Verify that home page is visible successfully
Then User Click on Signup or Login button
Then Fill all details in Signup and create account
Then Verify ACCOUNT CREATED and click Continue button
Then Verify Logged in as username at top
Then User Add products to cart
And Click Cart button
Then Verify that cart page is displayed
Then Click Proceed To Checkout button
And Verify Address Details and Review Your Order
Then Enter description in comment text area and click Place Order
Then Enter payment details: Name on Card, Card Number, CVC, Expiration date
Then Click Pay and Confirm Order button
And Verify success message Your order has been placed successfully
Then Click Delete Account button
And Verify ACCOUNT DELETED and click Continue button



@testcase16
Scenario: Place Order: Login before Checkout
Given User Launch the browser
Then  Navigate to automation exercise url
And  Verify that home page is visible successfully
Then User Click on Signup or Login button
Then User Enter correct email address and password
And  Click login button
Then Verify Logged in as username at top
Then User Add products to cart
And Click Cart button
Then Verify that cart page is displayed
Then Click Proceed To Checkout button
And Verify Address Details and Review Your Order
Then Enter description in comment text area and click Place Order
Then Enter payment details: Name on Card, Card Number, CVC, Expiration date
Then Click Pay and Confirm Order button
And Verify success message Your order has been placed successfully
#Then Click Delete Account button
#And Verify ACCOUNT DELETED and click Continue button


@testcase17
Scenario: Remove Products From Cart
Given User Launch the browser
Then  Navigate to automation exercise url
And  Verify that home page is visible successfully
Then User Add products to cart
And Click Cart button
Then Verify that cart page is displayed
Then Click X button corresponding to particular product
And Verify that product is removed from the cart



@testcase18
Scenario: View Category Products
Given User Launch the browser
Then  Navigate to automation exercise url
Then Verify that categories are visible on left side bar
And Click on Women category
Then Click on any category link under Women category
Then Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS
And click on any category link of Men category
Then Verify that user is navigated to MenJeans category page


@testcase19
Scenario: View & Cart Brand Products
Given User Launch the browser
Then  Navigate to automation exercise url
Then Click on Products button
And Verify that Brands are visible
Then Click on any brand name
Then Verify that user is navigated to brand page and brand products are displayed
And On left side bar click on any other brand link
Then Verify that user is navigated to that brand page and can see products


@testcase20
Scenario: Search Products and Verify Cart After Login
Given User Launch the browser
Then  Navigate to automation exercise url
Then Click on Products button
And Verify user is navigated to ALL PRODUCTS page successfully
Then Enter product name and Click search button
And Verify SEARCHED PRODUCTS is visible
Then Verify all the products related to search are visible
And Add those products to cart
Then Click Cart button and verify that products are visible in cart
Then Click Signup or Login button and submit login details
And Again go to Cart page
Then Verify that those products are visible in cart after login as well


@testcase21
Scenario: Add review on product
Given User Launch the browser
Then  Navigate to automation exercise url
Then Click on Products button
And Verify user is navigated to ALL PRODUCTS page successfully
Then Click on View Product button
And Verify Write Your Review is visible
Then Enter name email and review
And Click Submit for review button
Then Verify success message Thank you for your review


@testcase22
Scenario: Add to cart from Recommended items
Given User Launch the browser
Then  Navigate to automation exercise url
Then Scroll to bottom of page
And Verify RECOMMENDED ITEMS are visible
Then Click on Add To Cart on Recommended product
And Click on View Cart button
Then Verify that recommendedproduct is displayed in cart page


@testcase23
Scenario: Verify address details in checkout page
Given User Launch the browser
Then  Navigate to automation exercise url
And  Verify that home page is visible successfully
Then User Click on Signup or Login button
Then Fill all details in Signup and create account
Then Verify ACCOUNT CREATED and click Continue button
Then Verify Logged in as username at top
Then User Add products to cart
And Click Cart button
Then Verify that cart page is displayed
Then Click Proceed To Checkout button
And Verify that the delivery address is same
And Verify that the billing address is same
Then Click Delete Account button
And Verify ACCOUNT DELETED and click Continue button


@testcase24
Scenario: Download Invoice after purchase order
Given User Launch the browser
Then  Navigate to automation exercise url
And  Verify that home page is visible successfully
Then User Add products to cart
And Click Cart button
Then Verify that cart page is displayed
Then Click Proceed To Checkout button
And Click Register or Login button
Then Fill all details in Signup and create account
Then Verify ACCOUNT CREATED and click Continue button
Then Verify Logged in as username at top
And Click Cart button
Then Click Proceed To Checkout button
And Verify Address Details and Review Your Order
Then Enter description in comment text area and click Place Order
Then Enter payment details: Name on Card, Card Number, CVC, Expiration date
Then Click Pay and Confirm Order button
And Verify success message Your order has been placed successfully
Then Click Download Invoice button and verify invoice is downloaded successfully
Then  Click Continue button
Then Click Delete Account button
And Verify ACCOUNT DELETED and click Continue button


@testcase25
Scenario: Verify Scroll Up using Arrow button and Scroll Down functionality
Given User Launch the browser
Then  Navigate to automation exercise url
And  Verify that home page is visible successfully
Then Scroll down to footer
And Verify text SUBSCRIPTION
Then Click on arrow at bottom right side to scrollup
And Verify text Full-Fledged practice website for Automation Engineers


@testcase26
Scenario: Verify Scroll Up without Arrow button and Scroll Down functionality
Given User Launch the browser
Then  Navigate to automation exercise url
And  Verify that home page is visible successfully
Then Scroll down to footer
And Verify text SUBSCRIPTION
Then Scroll up page to top
And Verify text Full-Fledged practice website for Automation Engineers