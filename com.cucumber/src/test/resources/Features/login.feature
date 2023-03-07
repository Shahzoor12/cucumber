Feature: Login with correct email and password.
 
 @TC001
  Scenario: Verify Logged in
  Given Browser is open
  And Navigate to url 
  And verify home page is visible
  And Click on Login button 
  And Verify Login to your account is visible
  When Correct email and password is eneterd
  And Login button is clicked
  And verify Loggedin as username is visible
  Then Click delete account button
  And Verify account deleted
  
@TC002
  Scenario: Register user with existing mails
  Given Browser is open
  And Navigate to url
  And verify home page is visible
  When Singup button is clicked
  And Verify New User Signup is visible
  And Enter name and already registered email
  Then Click Signup button
  And Verify error message is visible
  
  @TC003
  Scenario: Verify all products and product deatil page
  Given Browser is open
  And Navigate to url
  And verify home page is visible 
  When Products button is clicked
  And Verify user is navigated to All Products page successfully
  And The products list is visible
  Then Click on View Product of first product
  And User landed to product detail page
  And Verify the detail is visible
  
  @TC004
  Scenario: Verify Subscription in home page
  Given Browser is open
  And Navigate to url
  And verify home page is visible
  When Cart button is clicked
  And Scroll down to footer
  And Verify text SUBSCRIPTION
  Then Email is entered and arrow button is clicked
  And Verify the message
   
  @TC005
  Scenario: Place order
  Given Browser is open
  And Navigate to url
  And verify home page is visible
  And Add product to cart
  And Click cart button
  And Verify that cart page is visible
  And Click on checkout
  And Click on register button
  And Fill all details
  And Verify account created
  And Verify Logged in as username at top
  When Cart button is clicked
  And Click Proceed to checkout button
  And Review your order
  And Enter description in comment area and click place order
  Then Enter payment details
  And click pay and confirm order
  And Verify success message
  And Click Delete Account btn
  And Verify Account is deleted
  
   @TC006
  Scenario: Remove products from cart
  Given Browser is open
  And Navigate to url
  And verify home page is visible
  When Product is added to cart
  And Cart button is clicked
  And Cart page is verified
  Then Click the X button 
  And Verify the product has been removed
  
  @TC007
  Scenario: Search product and verify cart after login
  Given Browser is open
  And Navigate to url
  When Products button is clicked
  And Verify user is navigated to All Products page successfully
  And Enter product name in search input and click search button
  And Verify searched product is visible
  And Verify all the products related to search are visible
  And Add those products to cart
  Then Click cart button and verify that products are visible in cart
  And Click Login button and submit login details
  And Again go to Cart page
  And  Verify that those products are visible in cart after login as well
  
  @TC008
  Scenario: Add to cart from recommended items
  Given Browser is open
  And Navigate to url
  And Scroll to bottom of page
  And Verify Recommended items are visible
  Then CLick on Add to cart on Recommended products 
  And CLick on view cart
  And Verify product is visible in cart
  
  @TC009
  Scenario: Add to cart from recommended items
  Given Browser is open
  And Navigate to url
  And verify home page is visible
  And Scroll to bottom of page
  And Verify text SUBSCRIPTION
  Then Click on arrow to move upwards
  And Verify that page is scrolled up
  
  


  


  
  