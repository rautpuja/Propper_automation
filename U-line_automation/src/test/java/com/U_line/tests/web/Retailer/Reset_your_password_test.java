package com.U_line.tests.web.Retailer;

import com.U_line.core.BaseConfiguration;
import com.U_line.page.actions.web.LoginPage;
import com.U_line.page.actions.web.MyAccountPage;
import com.U_line.page.actions.web.Retailer.Reset_your_password_page;
import com.U_line.page.actions.web.Servicer.Address_book_Page;
import com.U_line.page.validators.web.LoginValidator;
import com.U_line.tests.web.Servicer.Address_book_test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Reset_your_password_test extends BaseConfiguration {
    private static final Logger LOGGER = LoggerFactory.getLogger(Reset_your_password_test.class);

    private LoginPage loginACtions;
    private Reset_your_password_page homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;


    @BeforeClass
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        loginACtions = new LoginPage(driver);
        homePageActions = new Reset_your_password_page(driver);
        myAccountPage = new MyAccountPage(driver);
        loginValidator = new LoginValidator();

    }

    @Test(priority = 0, testName = "TC_Rpw_01", description = "To validate the 'Forgot Your Password' functionality with valid Email. ")
    public void Validate_providerlogin() throws InterruptedException {
        homePageActions.providerlogin();

    }
    @Test(priority = 4, testName = "TC_Rpw_02", description = "To validate the 'Reset My - Password' functionality with valid Email. ")
    public void Validate_with_valid_email() throws InterruptedException {
        homePageActions.Valid_email();

    }
    @Test(priority = 3, testName = "TC_Rpw_04", description = "To validate the 'Reset My  Password' functionality with invalid email ID  ")
    public void Validate_invalid_email_id() throws InterruptedException {
        homePageActions.invalid_email();

    }
    @Test(priority = 2, testName = "TC_Rpw_05", description = "To validate the error message when mandatory fields are kept empty.")
    public void Validate() throws InterruptedException {
        homePageActions.blank_email();

    }

}
