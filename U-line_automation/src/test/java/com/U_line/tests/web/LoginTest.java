package com.U_line.tests.web;

import org.testng.annotations.*;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.U_line.core.BaseConfiguration;
import com.U_line.page.actions.web.HomePage;
import com.U_line.page.actions.web.LoginPage;
import com.U_line.page.actions.web.MyAccountPage;
import com.U_line.page.validators.web.LoginValidator;

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


	//@Test (testName = "TC_01", description = "Search part and accessories")
//	public void Validate_PartandAccessories() {
//		homePageActions.openpartsandaccessories();
//		
//	
//		loginACtions.loginWithDefaultCreds();
//		String contactInfoOnPage = myAccountPage.getContactInfo();
//		loginValidator.validateSuccessLogin(contactInfoOnPage, Config.getProperty("username"));
//	}
	@Test (priority = 0, testName = "TC_01", description = "Provider login")
	public void Validate_providerlogin() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		homePageActions.providerlogin();
		homePageActions.setemail(username);
		
	    homePageActions.setPassword(password);
		
		Thread.sleep(3000);
		homePageActions.clickSubmit();
		System.out.println("Provider login successfull");}


	@Test (priority = 1,testName = "TC_02", description = "partsearch")
		public void Validate_partsearch() throws InterruptedException {
		
		Thread.sleep(3000);
		homePageActions.modelnumber();
		homePageActions.search();
		Thread.sleep(3000);}
	@Test (priority = 2,testName = "TC_03", description = "add to cart button")
	public void Validate_addtocart() throws InterruptedException {

	JavascriptExecutor js1 = (JavascriptExecutor) driver;
		 js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		homePageActions.addtocart();
	}
		@Test (priority = 3,testName = "TC_04", description = "view cart button ")
		public void Validate_view_cart_button() throws InterruptedException {
		homePageActions.viewcart();
	}

		@Test (priority = 4, testName = "TC_05", description = "checkout button  ")
			public void Validate_CheckoutButton() throws InterruptedException, IOException {
		homePageActions.checkout();
	}
			@Test (priority = 5,testName = "TC_06", description = "shipping payment page  ")
			public void Validate_shippingpaymentpage() throws InterruptedException, IOException {
		        Thread.sleep(5000);

				homePageActions.Shipping();
	}
	@Test (priority = 6,testName = "TC_07", description = "Validate Purchase order payment method")
	public void Validate_PurchaseOrder_PaymentMethod() throws InterruptedException {
		homePageActions.PurchaseOrder();
		homePageActions.PurchaseOrderNumber();


	}

	@Test (priority = 7,testName = "TC_08", description = "Validate whether order get successfull or not")
	public void Validate_Place_Order() throws InterruptedException {
	//	homePageActions.PlaceOrder();


	}



}




//	@Test (testName = "TC_02", description = "To validate successfull dealer login.")
//	public void validate_dealer_login() {
//		
//		String dealerUserName = Config.getProperty("dealerUsername");
//		// act
//		homePageActions.openDealerLoginPage();
//		loginACtions.login(dealerUserName, Config.getProperty("dealerPassword"));
//		String contactInfoOnPage = myAccountPage.getContactInfo();
//		loginValidator.validateSuccessLogin(contactInfoOnPage, dealerUserName);
	//}
	

