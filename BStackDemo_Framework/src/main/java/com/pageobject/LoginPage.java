package com.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utility.Helper;

public class LoginPage extends Helper{
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static final String UsernameBox = "//div[contains(text(),'Select Username')]";
	public static final String PasswordBox = "password";
	public static final String LoginBox = "login-btn";
	public static final String LogoutBox = "//a[@id='logout']n";
	
	
	//Declaring Webelements
	WebElement elements;
	
	
	public WebElement UserName() {
		elements = getElementXPath(UsernameBox);
		return elements;
	}
	
	public WebElement Password() {
		elements = getElementId(PasswordBox);
		return elements;
	}
	
	public WebElement LogInButton() {
		elements = getElementId(LoginBox);
		return elements;
	}
	
	public WebElement LogOutButton() {
		elements = getElementXPath(LogoutBox);
		return elements;
	}	


}
