package com.U_line.tests.web;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import com.U_line.core.BaseConfiguration;
import com.U_line.page.actions.web.Guesthome;
import com.U_line.page.actions.web.LoginPage;
import com.U_line.page.actions.web.MyAccountPage;
import com.U_line.page.validators.web.LoginValidator;

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
			homePageActions.openpartsandaccessories();
			homePageActions.modelnumber();
			homePageActions.search();
		}
		@Test (priority = 1,testName = "TC_02", description = "add product into cart")
		public void Validate_add_product_intocart() throws InterruptedException {

			homePageActions.addtocart();
		}
		@Test (priority = 2,testName = "TC_03", description = "View Cart")
		public void Validate_view_cart() throws InterruptedException {

			homePageActions.viewcart();
		}

		@Test (priority = 3,testName = "TC_04", description = "add product into cart")
		public void Validate_go_to_checkout() throws InterruptedException {
			homePageActions.checkout();
		
		}
		@Test (priority = 3,testName = "TC_05", description = "Enter shipping address information")
		public void Validate_shipping_Info() throws InterruptedException {

			homePageActions.form();

			homePageActions.Next();
		}

		@Test (priority = 4,testName = "TC_06", description = "Validate Purchase order payment method")
		public void Validate_PurchaseOrder_PaymentMethod() throws InterruptedException {
			homePageActions.PurchaseOrder();
			homePageActions.PurchaseOrderNumber();


		}

		@Test (priority = 5,testName = "TC_07", description = "Validate whether order get successfull or not")
		public void Validate_Place_Order() throws InterruptedException {
		//	homePageActions.PlaceOrder();


		}
	}

