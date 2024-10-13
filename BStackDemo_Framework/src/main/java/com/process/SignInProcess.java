package com.process;

import org.openqa.selenium.WebDriver;

import com.pageobject.SignInPage;
import com.utility.Helper;

public class SignInProcess extends Helper {
	//Object Reference
	SignInPage sip1 = new SignInPage(driver);
	
	public SignInProcess(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void ClickSignIn() {
		sip1.SignInButton().click();
	}
	
	public void UserLoginPage() {
		//boolean torf = sip1.PageToLoad().isDisplayed();
		if(sip1.SignedInPageButton().isDisplayed())
		{
			System.out.println("Navigation Page is Loaded to Sign-In Page. Success: " + sip1.SignedInPageButton().isDisplayed());
		}
		else {
			System.out.println("Navigation Page is NOT Loaded to Sign-In Page. Failed: " + sip1.SignedInPageButton().isDisplayed());
		}
	}
}

