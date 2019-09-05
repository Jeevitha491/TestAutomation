package com.cucumber.stepdefinition1;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.cucumber.runner1.TestRunner1;
import com.selenium.baseclass.BaseClass;
import com.selenium.helper.PageObjectManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.textui.TestRunner;


public class StepDefinition1 extends BaseClass {
	public static WebDriver driver= TestRunner1.driver;
	public static PageObjectManager pm = new PageObjectManager(driver);

	@Given("^User hit the Automation practice website$")
	public void user_hit_the_Automation_practice_website() throws Throwable {
		//driver = BrowserLaunch("chrome");
		getUrl("http://automationpractice.com/index.php");
	}

	@Then("^User verifies the site logo$")
	public void user_verifies_the_site_logo() throws Throwable {
		elementIsDisplayed(pm.getHp().getLogo());
		highLightWebElement(pm.getHp().getLogo());
	}

	@Then("^User verifies the page title$")
	public void user_verifies_the_page_title() throws Throwable {
		getTitle();
		String expected="My Store";
		System.out.println(getTitle());
		Assert.assertEquals(expected, getTitle());
	}

	@When("^User click on Signin Button in Header$")
	public void user_click_on_Signin_Button_in_Header() throws Throwable {
		clickOn(pm.getHp().getSignIn());
	}

	@When("^User enter the email id$")
	public void user_enter_the_email_id() throws Throwable {
		sendKeys(pm.getLP().getEmailAddress(), "jeevidinesh05@gmail.com");
	}

	@When("^User enter the password$")
	public void user_enter_the_password() throws Throwable {
		sendKeys(pm.getLP().getPassWord(), "Jeevidinesh04@123");
	}

	@When("^User click on Login Button in the Login Page$")
	public void user_click_on_Login_Button_in_the_Login_Page() throws Throwable {	
		clickOn(pm.getLP().getSubmitButton());
	}

	@Then("^User verifies the Username present in the header$")
	public void user_verifies_the_Username_present_in_the_header() throws Throwable {
		String s= "Jeevitha Dinesh";
		Assert.assertEquals(s, pm.getLP().getUserName().getText());
		highLightWebElement(pm.getLP().getUserName());
	}
		
	@When("^User moves the mouse to the women$")
	public void user_moves_the_mouse_to_the_women() throws Throwable {
	    mouseHoverToElement(pm.getAc().getMouseHovertoWomen());
	}

	@Then("^User click on evening dress$")
	public void user_click_on_evening_dress() throws Throwable {
	    clickOn(pm.getAc().getEveDress());
	}
		
	@When("^User place the mouse pointer on evening dress image$")
	public void user_place_the_mouse_pointer_on_evening_dress_image() throws Throwable {
	   mouseHoverToElement(pm.getAc().getMouseHovertoDress());
	}

	@Then("^User checks whether '(.*)' word is present at the top of the content page$")
	public void user_checks_whether_Evening_Dresses_word_is_present_at_the_top_of_the_content_page(String quantity) throws Throwable {
		String actual=pm.getAc().getProductText().getText();
	    Assert.assertEquals(quantity, actual);
	    highLightWebElement(pm.getAc().getProductText());
	}

	@Then("^User click on the more option$")
	public void user_click_on_the_more_option() throws Throwable {	
	    clickOn(pm.getAc().getMore());  
	}

	@Then("^User click on the add to cart option$")
	public void user_click_on_the_add_to_cart_option() throws Throwable {		
	    clickOn(pm.getAc().getAddCartButton());
	}

	@Then("^User check for '(.*)' word is present at the top of the content page$")
	public void user_check_for_demo_4_word_is_present_at_the_top_of_the_content_page(String text1) throws Throwable {	
		String actual=pm.getAc().getDemoText().getText();
	    Assert.assertTrue(text1.equals(actual));
	    highLightWebElement(pm.getAc().getDemoText());
	}

	@When("^User click on the frame to select the options$")
	public void user_click_on_the_frame_to_select_the_options() throws Throwable {	
	    clickOn(pm.getAc().getFrame());	    
	}
	@Then("^User verifies whether the word '(.*)' is present in the frame$")
	public void user_verifies_whether_the_word_printed_dress_is_present_in_the_frame(String text2) throws Throwable {		
		String actual=pm.getAc().getPrintText().getText();
	    Assert.assertEquals(text2, actual);
	    highLightWebElement(pm.getAc().getPrintText());
	}

	@When("^User click on the proceed to checkout$")
	public void user_click_on_the_proceed_to_checkout() throws Throwable {		
	    clickOn(pm.getAc().getProceed());    	    
	}

	@Then("^User verifies whether the word '(.*)' is present$")
	public void user_verifies_whether_the_word_SHOPPING_CART_SUMMARY_is_present(String stock) throws Throwable {		
		String actual=pm.getAc().getStockText().getText();
	    Assert.assertTrue(stock.equals(actual));
	    highLightWebElement(pm.getAc().getStockText());
	}

	@Then("^User click on the proceed to checkout in the summary page$")
	public void user_click_on_the_proceed_to_checkout_in_the_summary_page() throws Throwable {		
	    clickOn(pm.getAc().getCheckout());  	    
	}


	@When("^User click on the proceed to checkout in the address page$")
	public void user_click_on_the_proceed_to_checkout_in_the_address_page() throws Throwable {		
	    clickOn(pm.getAc().getProcessAddress());	    
	}
	

	@Then("^User verfies for the word '(.*)' is present in the content page$")
	public void user_verfies_for_the_word_Terms_of_service_is_present_in_the_content_page(String terms) throws Throwable {		
		String actual=pm.getAc().getTermsText().getText();
	    Assert.assertNotEquals(terms, actual);
	    highLightWebElement(pm.getAc().getTermsText());
	}

	@When("^User click on the checkbox$")
	public void user_click_on_the_checkbox() throws Throwable {		
	    clickOn(pm.getAc().getCheckBox());    	    
	}

	
	@Then("^User click on proceed to checkout in the shipping page$")
	public void user_click_on_proceed_to_checkout_in_the_shipping_page() throws Throwable {	
	    clickOn(pm.getAc().getProceedPayment());	    
	}

	@Then("^User verifies for the word '(.*)' is present in the content page$")
	public void user_verifies_for_the_word_PLEASE_CHOOSE_YOUR_PAYMENT_METHOD_is_present_in_the_content_page(String payment) throws Throwable {		
		String actual=pm.getAc().getPaymentText().getText();
		Assert.assertNotEquals(payment, actual);
		highLightWebElement(pm.getAc().getPaymentText());
	}

	@When("^User click on pay by check option$")
	public void user_click_on_pay_by_check_option() throws Throwable {		
	    clickOn(pm.getAc().getPayment());  	    
	}

//	@Then("^User check for the word 'Sign out' present in the header$")
//	public void user_check_for_the_word_Sign_out_present_in_the_header() throws Throwable {
//		
//		String s="Sign Ou";
//	    
//	}

	@Then("^User click on sign out button present in the header$")
	public void user_click_on_sign_out_button_present_in_the_header() throws Throwable {		
		clickOn(pm.getAc().getLogout());  	    
	}

	    
	    
	}


