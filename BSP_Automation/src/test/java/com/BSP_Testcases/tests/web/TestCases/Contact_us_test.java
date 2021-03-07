package com.BSP_Testcases.tests.web.TestCases;

import com.BSP_Testcases.core.BaseConfiguration;
import com.BSP_Testcases.page.actions.web.LoginPage;
import com.BSP_Testcases.page.actions.web.MyAccountPage;
import com.BSP_Testcases.page.actions.web.TestCases.Contact_us_page;
import com.BSP_Testcases.page.validators.web.LoginValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Contact_us_test extends BaseConfiguration {
    private static final Logger LOGGER = LoggerFactory.getLogger(Contact_us_test.class);

    private LoginPage loginACtions;
    private Contact_us_page homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;


    @BeforeClass
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        loginACtions = new LoginPage(driver);
        homePageActions = new Contact_us_page(driver);
        myAccountPage = new MyAccountPage(driver);
        loginValidator = new LoginValidator();

    }



    @Test(priority = 1, testName = "TC_ContactUs_01", description = "To validate Title of the page")
    public void Contact_us() throws InterruptedException {
        homePageActions.Contact_us();

    }
        @Test(priority = 2, testName = "TC_ContactUs_02", description = "To validate contact us form for blank data")
    public void Contact_us_blank() throws InterruptedException {
        homePageActions.Contact_us_blank();

    }



    @Test(priority = 3, testName = "TC_ContactUs_04", description = "To validate the 'Contact Us' form functionality with invalid data.")
    public void Contact_us_invalid() throws InterruptedException {
        homePageActions.Contact_us_invalid_data();

    }

    @Test(priority = 4, testName = "TC_ContactUs_05", description = "To validate the invalid 'email' field")
    public void Contact_us_with_invalid_email() throws InterruptedException {
        homePageActions.Contact_us_with_invalid_email();

    }
//
//    @Test(priority = 5, testName = "TC_ContactUs_03", description = "To validate the 'Contact Us' form functionality with valid data.")
//    public void Contact_us_with_valid() throws InterruptedException {
//        homePageActions.Contact_us_with_valid();
//
//
//    }

}


