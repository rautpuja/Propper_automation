package com.Marvel.tests.web.Retailer;

import com.Marvel.core.BaseConfiguration;
import com.Marvel.page.actions.web.LoginPage;
import com.Marvel.page.actions.web.MyAccountPage;
import com.Marvel.page.actions.web.Retailer.Registration_page;
import com.Marvel.page.validators.web.LoginValidator;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Registration_test extends BaseConfiguration {

    private static final Logger lOGGER = LoggerFactory.getLogger(Registration_test.class);

    private LoginPage loginACtions;
    private Registration_page homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;


    @BeforeClass
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        loginACtions = new LoginPage(driver);
        homePageActions = new Registration_page(driver);
        myAccountPage = new MyAccountPage(driver);
        loginValidator = new LoginValidator();

    }


    @Test(priority = 0, testName = "TC_01", description = "Provider login")
    public void Validate_providerlogin() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(3000);
        homePageActions.providerlogin();
        homePageActions.Registration_link();
    }

//    @Test(priority = 1, testName = "TC_Reg", description = "registration page")
//    public void Validate_Registartion_link() throws InterruptedException {
//        homePageActions.Registration_link();
//    }
    @Test(priority = 2, testName = "TC_Reg_02", description = "To validate the 'Request Account Setup' functionality for invalid email address.\n")
    public void Validate_Invalid_email_id() throws InterruptedException {
        homePageActions.Invalid_email_id();
    }
    @Test(priority = 2, testName = "TC_Reg_07", description = "To validate the 'Create Account' functionality when mandatory fields are kept empty.\n")
    public void Validate_Blank_data() throws InterruptedException {
        homePageActions.Blank_data();
    }
    @Test(priority = 3, testName = "TC_Reg_04", description = "To validate the 'Request Account Setup' functionality for mismatch of  'Password' and 'Confirm Password' fields.\n")
    public void Validate_different_password() throws InterruptedException {
        homePageActions.different_password();
    }
    @Test(priority = 4, testName = "TC_Reg_03", description = "To validate the 'Request Account Setup' functionality for case sensitivity of 'Password' and 'Confirm Password' fields.\n")
    public void Validate_casesensetive_password() throws InterruptedException {
        homePageActions.CaseSensetive_password();
    }
    @Test(priority = 5, testName = "TC_Reg_10", description = "To validate the functionality of Captcha with empty\n")
    public void Validate_without_captcha() throws InterruptedException {
        homePageActions.without_captcha();
    }



    @Test(priority = 6, testName = "TC_Reg_08", description = "To validate whether 'Duplicate Create Accounts' are allowed or not.\n")
    public void Validate_Already_registered_email() throws InterruptedException {
        homePageActions.AlreadyRegistered_email();
    }
    @Test(priority = 8, testName = "TC_Reg_06", description = "To validate the 'Request Account Setup' functionality  when invalid data is entered in mandatory fields.\n")
    public void Validate_Invalid_account_number() throws InterruptedException {
     //   homePageActions.Invalid_account_number();
    }
    @Test(priority = 7, testName = "TC_Reg_09", description = "To validate the functionality of Captcha\n")
    public void Validate_with_captcha() throws InterruptedException {
        homePageActions.Reload_captcha();
    }

    @Test(priority = 9, testName = "TC_Reg_01", description = "To validate the 'Request Account Setup' functionality with valid data.\n")
    public void Validate_valid_data() throws InterruptedException {
      //  homePageActions.valid_data();
    }

}
