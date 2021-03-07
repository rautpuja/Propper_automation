package com.PC_Automation_testcases.tests.web;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import com.PC_Automation_testcases.core.BaseConfiguration;
import com.PC_Automation_testcases.page.actions.web.Guesthome;
import com.PC_Automation_testcases.page.actions.web.LoginPage;
import com.PC_Automation_testcases.page.actions.web.MyAccountPage;
import com.PC_Automation_testcases.page.validators.web.LoginValidator;

public class Guestuser extends BaseConfiguration{

	private static final Logger LOGGER = LoggerFactory.getLogger(Guestuser.class);
		
		private LoginPage loginACtions;
		private Guesthome homePageActions;
		private MyAccountPage myAccountPage;
		private LoginValidator loginValidator;
		
		@BeforeMethod
		@BeforeClass
		public void setUp() {
			loginACtions = new LoginPage(driver);
			homePageActions = new Guesthome(driver);
			myAccountPage = new MyAccountPage(driver);
			loginValidator = new LoginValidator();
			
		}
		
		@Test (priority = 0,testName = "TC_01", description = "Search part and accessories")
		public void Validate_PartandAccessories() throws InterruptedException {
			homePageActions.Subscribe();

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
			homePageActions.viewcart_and_edit();

		}
		@Test (priority = 4,testName = "TC_05", description = "Enter shipping address information")
		public void Validate_shipping_Info() throws InterruptedException {

			homePageActions.emailbox();

		}
	@Test (priority = 5,testName = "TC_06", description = "Validate Purchase order payment method")
	public void Validate_login() throws InterruptedException {
		    homePageActions.Form();



	}

//
//	@Test (priority = 6,testName = "TC_07", description = "Click on next button")
//	public void Validate_Next_button() throws InterruptedException {
//		homePageActions.Next_button();
//
//
//	}
//
//	@Test (priority = 7,testName = "TC_08", description = "Validate Purchase order payment method")
//	public void Validate_Creditcard() throws InterruptedException {
//		homePageActions.radio_button();
//
//
//	}


//		@Test (priority = 8,testName = "TC_09", description = "Validate whether order get successfull or not")
//		public void Validate_Place_Order() throws InterruptedException {
//			homePageActions.PlaceOrder();
//
//
//		}
	}

