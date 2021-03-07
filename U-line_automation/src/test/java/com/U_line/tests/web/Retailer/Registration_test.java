package com.U_line.tests.web.Retailer;

import com.U_line.core.BaseConfiguration;
import com.U_line.page.actions.web.LoginPage;
import com.U_line.page.actions.web.MyAccountPage;
import com.U_line.page.actions.web.Retailer.Customer_login_page;
import com.U_line.page.actions.web.Retailer.Registration_page;
import com.U_line.page.validators.web.LoginValidator;
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
    }

    @Test(priority = 1, testName = "TC_01", description = "Provider login")
    public void Validate_Registartion_link() throws InterruptedException {
        homePageActions.Registration_link();
    }
    @Test(priority = 2, testName = "TC_01", description = "Provider login")
    public void Validate_Invalid_email_id() throws InterruptedException {
        homePageActions.Invalid_email_id();
    }
    @Test(priority = 2, testName = "TC_01", description = "Provider login")
    public void Validate_Blank_data() throws InterruptedException {
        homePageActions.Blank_data();
    }
    @Test(priority = 3, testName = "TC_01", description = "Provider login")
    public void Validate_different_password() throws InterruptedException {
        homePageActions.different_password();
    }
    @Test(priority = 4, testName = "TC_01", description = "Provider login")
    public void Validate_casesensetive_password() throws InterruptedException {
        homePageActions.CaseSensetive_password();
    }
    @Test(priority = 5, testName = "TC_01", description = "Provider login")
    public void Validate_without_captcha() throws InterruptedException {
        homePageActions.without_captcha();
    }



    @Test(priority = 6, testName = "TC_01", description = "Provider login")
    public void Validate_Already_registered_email() throws InterruptedException {
        homePageActions.AlreadyRegistered_email();
    }
    @Test(priority = 8, testName = "TC_01", description = "Provider login")
    public void Validate_Invalid_account_number() throws InterruptedException {
        homePageActions.Invalid_account_number();
    }
    @Test(priority = 7, testName = "TC_01", description = "Provider login")
    public void Validate_Reload_captcha() throws InterruptedException {
        homePageActions.Reload_captcha();
    }

    @Test(priority = 9, testName = "TC_01", description = "Provider login")
    public void Validate_valid_data() throws InterruptedException {
        homePageActions.valid_data();
    }

}
