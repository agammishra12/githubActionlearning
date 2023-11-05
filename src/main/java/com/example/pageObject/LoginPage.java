package com.example.pageObject;

import org.openqa.selenium.WebDriver;

import com.example.library.AppLibrary;

public class LoginPage {

	AppLibrary appLibrary;
	private WebDriver driver;
	public String login = "xpath:-://a[text()='Login ']";
	public String loginUsername = "xpath:-://input[@id='txtLoginEmail']";
	public String loginPassword = "xpath:-://input[@id='txtLoginPassword']";
	public String loginButton = "id:-:btnLogin";

	public LoginPage(AppLibrary appLibrary) {
		super();
		this.appLibrary = appLibrary;
		this.driver = appLibrary.getCurrentDriverInstance();
	}

	public void verifyLoginPageUi() throws Exception {
		AppLibrary.verifyElement(driver, loginUsername, true);
		AppLibrary.verifyElement(driver, loginPassword, true);

	}

//	public SelectPlans loginAndSelectPlan(String username, String password) throws Exception {
//		AppLibrary.enterText(driver, loginUsername, username);
//		AppLibrary.enterText(driver, loginPassword, password);
//		AppLibrary.clickElement(driver, loginButton);
//		return new SelectPlans(appLibrary);
//	}

	public void login(String username, String password) throws Exception {
//		AppLibrary.syncProgress(driver);
//		AppLibrary.waitTillElementLoaded(driver, loginUsername);
		AppLibrary.enterText(driver, loginUsername, username);
		AppLibrary.enterText(driver, loginPassword, password);
		AppLibrary.clickElement(driver, loginButton);

	}

}
