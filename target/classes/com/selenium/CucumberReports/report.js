$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Automationfile.feature");
formatter.feature({
  "line": 2,
  "name": "Automation Practice End to End Test automation scenario",
  "description": "This feature includes includes login, serach for the product, adding to cart, proceed to checkout,\r\ncheck for address, proceed to payment, and logout",
  "id": "automation-practice-end-to-end-test-automation-scenario",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@APEndtoEnd"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "User opens the automation practise home page",
  "description": "",
  "id": "automation-practice-end-to-end-test-automation-scenario;user-opens-the-automation-practise-home-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User hit the Automation practice website",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User verifies the site logo",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User verifies the page title",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition1.user_hit_the_Automation_practice_website()"
});
formatter.result({
  "duration": 25005781014,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.user_verifies_the_site_logo()"
});
formatter.result({
  "duration": 620140643,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.user_verifies_the_page_title()"
});
formatter.result({
  "duration": 37568524,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Verify user login the application with valid credentials",
  "description": "",
  "id": "automation-practice-end-to-end-test-automation-scenario;verify-user-login-the-application-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@Endtoendlogin"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User click on Signin Button in Header",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User enter the email id",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User enter the password",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User click on Login Button in the Login Page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User verifies the Username present in the header",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.user_click_on_Signin_Button_in_Header()"
});
formatter.result({
  "duration": 3466873654,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.user_enter_the_email_id()"
});
formatter.result({
  "duration": 697626945,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.user_enter_the_password()"
});
formatter.result({
  "duration": 530249767,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.user_click_on_Login_Button_in_the_Login_Page()"
});
formatter.result({
  "duration": 2846366475,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.user_verifies_the_Username_present_in_the_header()"
});
formatter.result({
  "duration": 187742922,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "User selects the dress to add to cart",
  "description": "",
  "id": "automation-practice-end-to-end-test-automation-scenario;user-selects-the-dress-to-add-to-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@Addtocart"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "User moves the mouse to the women",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User click on evening dress",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User place the mouse pointer on evening dress image",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User checks whether \u0027There is 1 product.\u0027 word is present at the top of the content page",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User click on the more option",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User click on the add to cart option",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User check for \u0027demo_4\u0027 word is present at the top of the content page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.user_moves_the_mouse_to_the_women()"
});
formatter.result({
  "duration": 278435779,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.user_click_on_evening_dress()"
});
formatter.result({
  "duration": 5099298645,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.user_place_the_mouse_pointer_on_evening_dress_image()"
});
formatter.result({
  "duration": 243742856,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "There is 1 product.",
      "offset": 21
    }
  ],
  "location": "StepDefinition1.user_checks_whether_Evening_Dresses_word_is_present_at_the_top_of_the_content_page(String)"
});
formatter.result({
  "duration": 82419395,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.user_click_on_the_more_option()"
});
formatter.result({
  "duration": 4383133262,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.user_click_on_the_add_to_cart_option()"
});
formatter.result({
  "duration": 269786984,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demo_4",
      "offset": 16
    }
  ],
  "location": "StepDefinition1.user_check_for_demo_4_word_is_present_at_the_top_of_the_content_page(String)"
});
formatter.result({
  "duration": 79651311,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "User proceeds further to checkout",
  "description": "",
  "id": "automation-practice-end-to-end-test-automation-scenario;user-proceeds-further-to-checkout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 31,
  "name": "User click on the frame to select the options",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "User verifies whether the word \u0027Printed Dress\u0027 is present in the frame",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "User click on the proceed to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User verifies whether the word \u0027In stock\u0027 is present",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "User click on the proceed to checkout in the summary page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition1.user_click_on_the_frame_to_select_the_options()"
});
formatter.result({
  "duration": 1401808051,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Printed Dress",
      "offset": 32
    }
  ],
  "location": "StepDefinition1.user_verifies_whether_the_word_printed_dress_is_present_in_the_frame(String)"
});
formatter.result({
  "duration": 85361461,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.user_click_on_the_proceed_to_checkout()"
});
formatter.result({
  "duration": 2710759214,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "In stock",
      "offset": 32
    }
  ],
  "location": "StepDefinition1.user_verifies_whether_the_word_SHOPPING_CART_SUMMARY_is_present(String)"
});
formatter.result({
  "duration": 66388555,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.user_click_on_the_proceed_to_checkout_in_the_summary_page()"
});
formatter.result({
  "duration": 1922825987,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "User checks for the delivery address",
  "description": "",
  "id": "automation-practice-end-to-end-test-automation-scenario;user-checks-for-the-delivery-address",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 39,
  "name": "User click on the proceed to checkout in the address page",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "User verfies for the word \u0027Terms of ser\u0027 is present in the content page",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "User click on the checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "User click on proceed to checkout in the shipping page",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "User verifies for the word \u0027Please choose your payment method\u0027 is present in the content page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.user_click_on_the_proceed_to_checkout_in_the_address_page()"
});
formatter.result({
  "duration": 1921061724,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Terms of ser",
      "offset": 27
    }
  ],
  "location": "StepDefinition1.user_verfies_for_the_word_Terms_of_service_is_present_in_the_content_page(String)"
});
formatter.result({
  "duration": 66984299,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.user_click_on_the_checkbox()"
});
formatter.result({
  "duration": 247296793,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.user_click_on_proceed_to_checkout_in_the_shipping_page()"
});
formatter.result({
  "duration": 2415099153,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Please choose your payment method",
      "offset": 28
    }
  ],
  "location": "StepDefinition1.user_verifies_for_the_word_PLEASE_CHOOSE_YOUR_PAYMENT_METHOD_is_present_in_the_content_page(String)"
});
formatter.result({
  "duration": 70045611,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "User proceeds to payment",
  "description": "",
  "id": "automation-practice-end-to-end-test-automation-scenario;user-proceeds-to-payment",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 46,
  "name": "User click on pay by check option",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "User click on sign out button present in the header",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition1.user_click_on_pay_by_check_option()"
});
formatter.result({
  "duration": 1876954190,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.user_click_on_sign_out_button_present_in_the_header()"
});
formatter.result({
  "duration": 2287001492,
  "status": "passed"
});
});