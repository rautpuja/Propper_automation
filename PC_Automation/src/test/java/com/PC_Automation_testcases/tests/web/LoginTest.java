package com.PC_Automation_testcases.tests.web;

import org.testng.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.PC_Automation_testcases.core.BaseConfiguration;
import com.PC_Automation_testcases.page.actions.web.HomePage;
import com.PC_Automation_testcases.page.actions.web.LoginPage;
import com.PC_Automation_testcases.page.actions.web.MyAccountPage;
import com.PC_Automation_testcases.page.validators.web.LoginValidator;

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

	@Test (priority = 0,testName = "TC_01", description = "click on subscribe")
	public void Validate_subscribe() throws InterruptedException {
		homePageActions.Subscribe();
		homePageActions.Login_button();
		homePageActions.username_password(username,password);

	}
	@Test (priority = 1,testName = "TC_02", description = "add product into cart")
	public void Validate_add_product_intocart() throws InterruptedException {

		homePageActions.Addtocart();
	}
	@Test (priority = 2,testName = "TC_03", description = "View Cart")
	public void Validate_view_cart() throws InterruptedException {

		homePageActions.view_cart();
	}

	@Test (priority = 3,testName = "TC_04", description = "Go to checkout")
	public void Validate_go_to_checkout() throws InterruptedException {
		homePageActions.Checkout();

	}

	@Test (priority = 7,testName = "TC_05", description = "Validate Purchase order payment method")
	public void Validate_PurchaseOrder_PaymentMethod() throws InterruptedException {
		homePageActions.radio_button();

	}
	@Test (priority = 8,testName = "TC_06", description = "Validate Purchase order payment method")
	public void Validate_placeOrder() throws InterruptedException {
		homePageActions.Place_order();

	}
}
	

