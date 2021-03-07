package com.Marvel.page.actions.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.Marvel.utils.common.Config;

//import static com.propper.reporter.ExtentReporter.info;
import static com.Marvel.utils.selenium.WebUtils.*;


/** This class contains all actions/operations that will be performed on Login page in Desktop web view.
 * 
 * @author Jaikant.lnu
 *
 */
public class LoginPage {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoginPage.class);

	private WebDriver driver;

	@FindBy(how = How.XPATH, using = "//input[@id='email' and @type='email']")
	WebElement emailField;

	@FindBy(how = How.XPATH, using = "//input[@id='pass' and @type='password']")
	WebElement passwordField;

	@FindBy(how = How.NAME, using = "send")
	WebElement signInButton;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	/**
	 * It will perform login operation with default credentials present in
	 * config.properties file.
	 */
	public void loginWithDefaultCreds() {
//		info("Logging in with default credentials..........");
//
		waitForElementPresence("//input[@id='email' and @type='email']_xpath", 10);
		enterTxt(emailField, Config.getProperty("username"));
		
		waitForElementPresence("//input[@id='pass' and @type='password']_xpath", 10);
		enterTxt(passwordField, Config.getProperty("password"));
		
		waitForElementPresence("send2_id", 10);
		click(signInButton);
	}
	
	/**
	 * It will perform login operation with given credentials.
	 */
	public void login(String username, String password) {
//		info("Logging in with provided credentials (other than default)..........");
//
		waitForElementPresence("//input[@id='email' and @type='email']_xpath", 10);
		enterTxt(emailField, Config.getProperty("username"));
		
		waitForElementPresence("//input[@id='pass' and @type='password']_xpath", 10);
		enterTxt(passwordField, Config.getProperty("password"));
		
		waitForElementPresence("send2_id", 10);
		click(signInButton);
	}

	/**
	 * It will perform logout from application
	 */
	public void logOut() {

		LOGGER.info("Logging out..");
	}

}
