package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utility.Helper;

public class SignInPage extends Helper{
	
	public SignInPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static final String SignInBox = "signin";
	public static final String LoginBox = "login-btn";

	
	//Declaring Webelements
	WebElement elements;
	
	public WebElement SignInButton() {
		elements = getElementId(SignInBox);
		return elements;
	}
	
	public WebElement SignedInPageButton() {
		elements = getElementId(LoginBox);
		return elements;
	}	

}
