package com.regression;

import java.io.IOException;
import org.testng.annotations.Test;
import com.process.SignInProcess;

public class SignInTest extends Setup {
	//Creating the Object Reference
	SignInProcess sip2;
	
	@Test
	public void SignInToLogin() {
			sip2 = new SignInProcess(driver);
			sip2.ClickSignIn();
			sip2.UserLoginPage();
		}
	}
