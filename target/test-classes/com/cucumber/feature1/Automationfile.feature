@APEndtoEnd
Feature: Automation Practice End to End Test automation scenario
This feature includes includes login, serach for the product, adding to cart, proceed to checkout,
check for address, proceed to payment, and logout

@Scenario1
Scenario: User opens the automation practise home page
Given User hit the Automation practice website
Then User verifies the site logo
And User verifies the page title

@Endtoendlogin
Scenario: Verify user login the application with valid credentials
When User click on Signin Button in Header
And User enter the email id 
And User enter the password
And User click on Login Button in the Login Page
Then User verifies the Username present in the header

@Addtocart
Scenario: User selects the dress to add to cart 
When User moves the mouse to the women
And User click on evening dress
And User place the mouse pointer on evening dress image
Then User checks whether 'There is 1 product.' word is present at the top of the content page
And User click on the more option
And User click on the add to cart option
Then User check for 'demo_4' word is present at the top of the content page

Scenario: User proceeds further to checkout
When User click on the frame to select the options
Then User verifies whether the word 'Printed Dress' is present in the frame
And User click on the proceed to checkout
Then User verifies whether the word 'In stock' is present
And User click on the proceed to checkout in the summary page


Scenario: User checks for the delivery address
When User click on the proceed to checkout in the address page
Then User verfies for the word 'Terms of ser' is present in the content page
And User click on the checkbox
And User click on proceed to checkout in the shipping page
Then User verifies for the word 'Please choose your payment method' is present in the content page

Scenario: User proceeds to payment
When User click on pay by check option
And User click on sign out button present in the header

 