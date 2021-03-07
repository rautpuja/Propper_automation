package com.PC_Automation_testcases.tests.web.TestCases;

import com.PC_Automation_testcases.core.BaseConfiguration;
import com.PC_Automation_testcases.page.actions.web.LoginPage;
import com.PC_Automation_testcases.page.actions.web.MyAccountPage;
import com.PC_Automation_testcases.page.actions.web.TestCases.Forgot_password;
import com.PC_Automation_testcases.page.validators.web.LoginValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Forgot_password_test extends BaseConfiguration {
    private static final Logger LOGGER = LoggerFactory.getLogger(Forgot_password_test.class);

    private LoginPage loginACtions;
    private Forgot_password homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;


    @BeforeClass
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        loginACtions = new LoginPage(driver);
        homePageActions = new Forgot_password(driver);
        myAccountPage = new MyAccountPage(driver);
        loginValidator = new LoginValidator();

    }
    @Test (priority = 0,testName = "TC_01", description = "Click on subscribe pop up")
    public void Validate_Subscribe() throws InterruptedException {
        homePageActions.Subscribe();

    }

    @Test(priority = 1, testName = "TC_01", description = "Provider login")
    public void Validate_providerlogin() throws InterruptedException {

        homePageActions.providerlogin();
        homePageActions.Forgot_password();

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
