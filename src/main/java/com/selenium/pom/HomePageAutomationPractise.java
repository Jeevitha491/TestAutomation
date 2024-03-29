package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageAutomationPractise {
	public WebDriver driver;
	
	public HomePageAutomationPractise(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="login")
	private WebElement signIn;
	
	@FindBy(xpath="//div[@id='header_logo']")
	private WebElement logo;


	public WebElement getLogo() {
		return logo;
	}

	public void setLogo(WebElement logo) {
		this.logo = logo;
	}

	public WebElement getSignIn() {
		return signIn;
	}

	public void setSignIn(WebElement signIn) {
		this.signIn = signIn;
	}
	
	
	

}
