package com.PC_Automation_testcases.tests.web.TestCases;

import com.PC_Automation_testcases.core.BaseConfiguration;
import com.PC_Automation_testcases.page.actions.web.LoginPage;
import com.PC_Automation_testcases.page.actions.web.MyAccountPage;
import com.PC_Automation_testcases.page.actions.web.TestCases.Contact_us_page;
import com.PC_Automation_testcases.page.validators.web.LoginValidator;
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

    @Test(priority = 0, testName = "", description = "To validate subscribe pop up")
    public void Subscribe() throws InterruptedException {
        homePageActions.Subscribe();

    }


    @Test(priority = 1, testName = "TC_contact_01", description = "To validate the functionality of breadcrumb of contact us'")
    public void Contact_us() throws InterruptedException {
        homePageActions.Contact_us();

    }
        @Test(priority = 2, testName = "TC_Product Search_2", description = "To validate the functionality of breadcrumb of contact us'")
    public void Contact_us_blank() throws InterruptedException {
        homePageActions.Contact_us_blank();

    }



    @Test(priority = 3, testName = "TC_Product Search_2", description = "To validate the functionality of breadcrumb of contact us'")
    public void Contact_us_invalid() throws InterruptedException {
        homePageActions.Contact_us_invalid_email();

    }

    @Test(priority = 4, testName = "TC_Product Search_2", description = "To validate the functionality of breadcrumb of contact us'")
    public void Contact_us_without_captcha() throws InterruptedException {
        homePageActions.Contact_us_without_captcha();

    }

    @Test(priority = 5, testName = "TC_Product Search_2", description = "To validate the functionality of breadcrumb of contact us'")
    public void Contact_us_with_captcha() throws InterruptedException {
        homePageActions.Contact_us_with_captcha();


    }
    @Test(priority = 6, testName = "TC_Product Search_2", description = "To validate the functionality of breadcrumb of contact us'")
    public void Contact_us_with_Canada() throws InterruptedException {
        homePageActions.Canada();


    }
    @Test(priority = 7, testName = "TC_Product Search_2", description = "To validate the functionality of breadcrumb of contact us'")
    public void Contact_us_with_unitedstate() throws InterruptedException {
        homePageActions.United_state();


    }
    @Test(priority = 8, testName = "TC_Product Search_2", description = "To validate the functionality of breadcrumb of contact us'")
    public void Contact_us_with_view_privacypolicy() throws InterruptedException {
        homePageActions.View_private_policy();


    }
}


