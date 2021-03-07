package com.BSP_Testcases.tests.web;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import com.BSP_Testcases.core.BaseConfiguration;
import com.BSP_Testcases.page.actions.web.Guesthome;
import com.BSP_Testcases.page.actions.web.LoginPage;
import com.BSP_Testcases.page.actions.web.MyAccountPage;
import com.BSP_Testcases.page.validators.web.LoginValidator;

public class Guestuser extends BaseConfiguration{

	private static final Logger LOGGER = LoggerFactory.getLogger(Guestuser.class);
		

		private Guesthome homePageActions;

		

		@BeforeClass
		public void setUp() {

			homePageActions = new Guesthome(driver);

			
		}
		
		@Test (priority = 0,testName = "TC_01", description = "click on bags")

		public void Validate_PLP_page() throws InterruptedException {
			homePageActions.PLP_page();

		}
	@Test (priority = 1,testName = "TC_02", description = "click on product")
	public void Validate_Click_on_product() throws InterruptedException {
		homePageActions.Click_on_product();

	}
	@Test (priority = 2,testName = "TC_03", description = "click on qty")
	public void Validate_select_qty_and_colour() throws InterruptedException {
		homePageActions.Select_qty_and_colour();

	}

	}

