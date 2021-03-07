package com.Marvel.tests.web;

import org.testng.annotations.*;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.Marvel.core.BaseConfiguration;
import com.Marvel.page.actions.web.HomePage;
import com.Marvel.page.actions.web.LoginPage;
import com.Marvel.page.actions.web.MyAccountPage;
import com.Marvel.page.validators.web.LoginValidator;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

//import static com.propper.page.actions.web.HomePage.logger;

public class LoginTest extends BaseConfiguration{

private static final Logger LOGGER = LoggerFactory.getLogger(LoginTest.class);
	
	private LoginPage loginACtions;
	private HomePage homePageActions;
	private MyAccountPage myAccountPage;
	private LoginValidator loginValidator;


	@BeforeClass
	public void setUp() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		loginACtions = new LoginPage(driver);
		homePageActions = new HomePage(driver);
		myAccountPage = new MyAccountPage(driver);
		loginValidator = new LoginValidator();
		
	}

	@Test (priority = 0, testName = "TC_01", description = "Provider login")
	public void Validate_providerlogin() throws InterruptedException {

		Thread.sleep(3000);
		homePageActions.providerlogin();
		homePageActions.setemail(username);
		
	    homePageActions.setPassword(password);
		
		Thread.sleep(3000);
		homePageActions.clickSubmit();
		System.out.println("Provider login successfull");}


	@Test (priority = 1,testName = "TC_02", description = "partsearch")
		public void Validate_partsearch() throws InterruptedException {
homePageActions.partnumber();
	}
	@Test (priority = 2,testName = "TC_03", description = "add to cart button")
	public void Validate_addtocart() throws InterruptedException {
homePageActions.addtocart();
	}


		@Test (priority = 4, testName = "TC_05", description = "checkout button  ")
			public void Validate_CheckoutButton() throws InterruptedException, IOException {
		homePageActions.checkout();
	}


	@Test (priority = 6,testName = "TC_07", description = "shipping payment page  ")
			public void Validate_shippingpaymentpage() throws InterruptedException, IOException {


				homePageActions.Shipping_method();
	}
	@Test (priority = 7,testName = "TC_08", description = "Click on next button")
	public void Validate_Next_button() throws InterruptedException {
		homePageActions.Next_button();


	}

	@Test (priority = 8,testName = "TC_09", description = "Validate Purchase order payment method")
	public void Validate_Creditcard() throws InterruptedException {
		homePageActions.radio_button();


	}


//	@Test (priority = 9,testName = "TC_10", description = "Validate whether order get successfull or not")
//	public void Validate_Place_Order() throws InterruptedException {
//		homePageActions.Place_order();
//
//
//	}



}




