package com.PC_Automation_testcases.tests.web.TestCases;

import com.PC_Automation_testcases.core.BaseConfiguration;
import com.PC_Automation_testcases.page.actions.web.LoginPage;
import com.PC_Automation_testcases.page.actions.web.MyAccountPage;
import com.PC_Automation_testcases.page.actions.web.TestCases.Customer_login_page;
import com.PC_Automation_testcases.page.validators.web.LoginValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Customer_login_test extends BaseConfiguration {


    private static final Logger lOGGER = LoggerFactory.getLogger(Customer_login_test.class);

    private LoginPage loginACtions;
    private Customer_login_page homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;


    @BeforeClass
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        loginACtions = new LoginPage(driver);
        homePageActions = new Customer_login_page(driver);
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

    }

        @Test(priority = 2, testName = "TC_Login_05\n", description = "To validate the 'Login' functionality when E- mail and password fields are kept empty.\n")
        public void Validate_providerlogin_blank_data() throws InterruptedException {

            Thread.sleep(3000);
            homePageActions.clickSubmit();
        }
    @Test(priority = 3, testName = "TC_Login_04\n", description = "To validate the 'Login' functionality with invalid E- mail/password\n")
    public void Validate_providerlogin_invalid_password() throws InterruptedException {
   homePageActions.invalid_password();
    }
    @Test(priority = 4, testName = "TC_Login_05\n", description = "Provider login")
    public void Validate_providerlogin_Invalid_email() throws InterruptedException {
homePageActions.Invalid_email();

    }
    @Test(priority = 5, testName = "TC_Login_02", description = "To validate  the 'Login' functionality for case sensitivity of 'Password' field\n")
    public void Validate_providerlogin_CaseSensetive_password() throws InterruptedException {

       homePageActions.CaseSensetive_password();

    }

    @Test(priority = 6, testName = "TC_Login_06", description = "To validate the  'Login' functionality when user Login with the old password after password has been changed\n")
    public void Validate_providerlogin_OldPassword() throws InterruptedException {
        homePageActions.Old_password();
    }

    @Test(priority = 7, testName = "TC_Login_01", description = "To validate the 'Login' functionality with valid E- mail and password\n")
    public void Validate_providerlogin_Valid_detail() throws InterruptedException {
homePageActions.valid_data();

    }
    @Test(priority = 8, testName = "TC_Login_9", description = "To validate sign out link functioanlity\n")
    public void Validate_Logout_button() throws InterruptedException {

        Thread.sleep(10000);
      homePageActions.Logout_button();
    }

    @Test(priority = 9, testName = "TC_Login_10\n", description = "To validate the functionality of Forgot Your Password? link\n")
    public void Validate_providerlogin_Forgot_password_link() throws InterruptedException {
        Thread.sleep(10000);
         homePageActions.Forgot_password_link();
        Thread.sleep(3000);
        driver.navigate().back();
    }

    @Test(priority = 10, testName = "TC_Login_11\n", description = "TTo validate the functionality of Create for an Account button\n")
    public void Validate_providerlogin_Register_for_account_link() throws InterruptedException {
        Thread.sleep(10000);
        homePageActions.Register_account_link();
        Thread.sleep(3000);
    }

}
