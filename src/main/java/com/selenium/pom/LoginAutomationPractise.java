package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAutomationPractise {

	public WebDriver driver;
	public LoginAutomationPractise(WebDriver driver2) {
		this.driver=driver2;
	PageFactory.initElements(driver2, this);			
	}
	
	
	@FindBy(id="email")
	private WebElement emailAddress;
	
	public WebElement getEmailAddress() {
		return emailAddress;
	}

	
	public WebElement getPassWord() {
		return passWord;
	}


	public WebElement getSubmitButton() {
		return submitButton;
	}

	
	@FindBy(id="passwd")
	private WebElement passWord;
	
	@FindBy(name="SubmitLogin")
	private WebElement submitButton;
	
	@FindBy(xpath="//a[@class='account']//span")
	private WebElement userName;
	
	
	
	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getUserName() {
		return userName;
	}

	
	
}
