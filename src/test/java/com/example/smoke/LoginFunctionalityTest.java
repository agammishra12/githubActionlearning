package com.example.smoke;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.example.library.AppLibrary;
import com.example.library.TestBase;
import com.example.pageObject.HomePage;
import com.example.pageObject.LoginPage;

public class LoginFunctionalityTest extends TestBase {

	@BeforeClass
	public void setUp() throws Exception {
		appLibrary = new AppLibrary("LoginFuctionalityTest");
	}

	@Test
	public void loginFunctioalityTest() throws Exception {
		appLibrary.getDriverInstance();
		appLibrary.launchApp();
		HomePage ap = new HomePage(appLibrary);
		LoginPage lp = ap.navigateToLoginPage();
		lp.verifyLoginPageUi();
		lp.login(getUserID(), getPassword());
	}

}
