package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddCart{
	
	
	public WebDriver driver;
	public AddCart(WebDriver driver3) {
		this.driver=driver3;
	PageFactory.initElements(driver3, this);			
	}
	
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement mouseHovertoWomen;
	@FindBy(xpath="(//a[@title='Evening Dresses'])[1]")
	private WebElement eveDress;
	@FindBy(xpath="//img[@alt='Printed Dress']")
	private WebElement mouseHovertoDress;
	@FindBy(xpath="//a[@class='button lnk_view btn btn-default']")
	private WebElement more;
	@FindBy(xpath="//button[@name='Submit']")
	private WebElement addCartButton;
	@FindBy(xpath="//div[@class='layer_cart_cart col-xs-12 col-md-6']")
	private WebElement frame;
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceed;
	@FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement checkout;
	@FindBy(xpath="//button[@name='processAddress']")
	private WebElement processAddress;
	@FindBy(xpath="//div[@id='uniform-cgv']")
	private WebElement checkBox;
	@FindBy(xpath="//button[@name='processCarrier']")
	private WebElement proceedPayment;
	@FindBy(xpath="//a[@class='cheque']")
	private WebElement payment;
	@FindBy(xpath="//a[@title='Log me out']")
	private WebElement logout;
	
	
	@FindBy(xpath="//span[text()='There is 1 product.']")
	private WebElement productText;
	@FindBy(xpath="//span[text()='demo_4']")
	private WebElement demoText;
	@FindBy(xpath="//span[text()='Printed Dress']")
	private WebElement printText;
	@FindBy(xpath="//span[text()='In stock']")
	private WebElement stockText;
	@FindBy(xpath="//h3[text()='Your billing address']")
	private WebElement addressText;
	@FindBy (xpath="//p[text()='Terms of service']")
	private WebElement termsText;
	@FindBy (xpath="//h1[text()='Please choose your payment method']")
	private WebElement paymentText;
	
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getMouseHovertoWomen() {
		return mouseHovertoWomen;
	}
	public WebElement getMouseHovertoDress() {
		return mouseHovertoDress;
	}
	public WebElement getMore() {
		return more;
	}
	public WebElement getAddCartButton() {
		return addCartButton;
	}
	public WebElement getFrame() {
		return frame;
	}
	public WebElement getProceed() {
		return proceed;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getProcessAddress() {
		return processAddress;
	}
	public WebElement getCheckBox() {
		return checkBox;
	}
	public WebElement getProceedPayment() {
		return proceedPayment;
	}
	public WebElement getPayment() {
		return payment;
	}
	public WebElement getLogout() {
		return logout;
	}
	public WebElement getTermsText() {
		return termsText;
	}
	public WebElement getPaymentText() {
		return paymentText;
	}
	public WebElement getProductText() {
		return productText;
	}
	public WebElement getDemoText() {
		return demoText;
	}
	public WebElement getEveDress() {
		return eveDress;
	}
	public WebElement getPrintText() {
		return printText;
	}
	public WebElement getStockText() {
		return stockText;
	}
	public WebElement getAddressText() {
		return addressText;
	}
	
	
	

}
