package com.regression;

import org.testng.annotations.Test;

import com.process.LoginProcess;
import com.process.SignInProcess;

public class LoginTest extends Setup {
	
	LoginProcess lp2;
	
	@Test
	public void ValidCredentials() throws InterruptedException {
		lp2 = new LoginProcess(driver);
		lp2.UserNameVisible();
		lp2.LoginWithValidCredential();
		lp2.UserLogOutPage();
		}
	}
