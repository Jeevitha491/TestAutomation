package com.selenium.helper;

import org.openqa.selenium.WebDriver;

import com.selenium.pom.AddCart;
import com.selenium.pom.HomePageAutomationPractise;
import com.selenium.pom.LoginAutomationPractise;

public class PageObjectManager {
	public WebDriver driver;
	public PageObjectManager(WebDriver ldriver) {
		this.driver=ldriver;
	}
	private HomePageAutomationPractise hp;
	private LoginAutomationPractise lp;
	private AddCart ac;
	
	public HomePageAutomationPractise getHp(){
		if (hp==null) {
			hp=new HomePageAutomationPractise (driver);
		}
		return hp;
	}
	public LoginAutomationPractise getLP() {
		if (lp==null) {
			lp=new LoginAutomationPractise(driver);
		}
		return lp;
	}
	public AddCart getAc() {
		if(ac==null) {
			ac=new AddCart(driver);
		}
		return ac;
	}
	
}
