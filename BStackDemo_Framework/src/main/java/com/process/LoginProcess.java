package com.process;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.pageobject.LoginPage;
import com.pageobject.SignInPage;
import com.utility.Helper;

public class LoginProcess extends Helper {
	
	//Object Reference
	LoginPage lp1 = new LoginPage(driver);

	public LoginProcess(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void UserNameVisible() {
		if (lp1.UserName().isDisplayed()) {
			System.out.println("Enter The Username");
		} else {
			System.out.println("Username Fails");
		}
	}
	
	public void LoginWithValidCredential() throws InterruptedException {
		
		//lp1.UserName().isDisplayed();
		lp1.UserName().click();
		//lp1.UserName().sendKeys("demouser");
		//Select sel = new Select(lp1.UserName());
		//sel.selectByIndex(1);
		Thread.sleep(2000);

		lp1.UserNameInput().sendKeys("demouser");
		//lp1.UserName().sendKeys(Keys.ARROW_DOWN);
	//	lp1.UserName().sendKeys(Keys.ENTER);
		
		
		lp1.Password().sendKeys("testingisfun99");
		lp1.LogInButton().click();
}
	public void UserLogOutPage() {
		//boolean torf = sip1.PageToLoad().isDisplayed();
		if(lp1.LogOutButton().isDisplayed())
		{
			System.out.println(" User Logged-In Successfully. Success: " + lp1.LogOutButton().isDisplayed());
		}
		else {
			System.out.println(" User Failed to Login. Failed: " + lp1.LogOutButton().isDisplayed());
		}
	
	}
}
