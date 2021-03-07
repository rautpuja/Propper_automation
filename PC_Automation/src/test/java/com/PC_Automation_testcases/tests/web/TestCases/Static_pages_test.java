package com.PC_Automation_testcases.tests.web.TestCases;

import com.PC_Automation_testcases.core.BaseConfiguration;
import com.PC_Automation_testcases.page.actions.web.LoginPage;
import com.PC_Automation_testcases.page.actions.web.MyAccountPage;
import com.PC_Automation_testcases.page.actions.web.TestCases.Static_pages;
import com.PC_Automation_testcases.page.validators.web.LoginValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Static_pages_test extends BaseConfiguration {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomePage_Test.class);

    private LoginPage loginACtions;
    private Static_pages homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;


    @BeforeClass
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        loginACtions = new LoginPage(driver);
        homePageActions = new Static_pages(driver);
        myAccountPage = new MyAccountPage(driver);
        loginValidator = new LoginValidator();

    }
    @Test(priority = 0,testName = "TC_01", description = "Search part and accessories")
    public void Validate_PartandAccessories() throws InterruptedException {
        homePageActions.Subscribe();

    }
    @Test(priority = 1,testName = "TC_01", description = "Search part and accessories")
    public void Validate_Quate_request() throws InterruptedException {
        homePageActions.RAQ();

    }

}
