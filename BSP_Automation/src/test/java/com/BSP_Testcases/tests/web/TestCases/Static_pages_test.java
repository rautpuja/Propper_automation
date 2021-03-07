package com.BSP_Testcases.tests.web.TestCases;

import com.BSP_Testcases.core.BaseConfiguration;
import com.BSP_Testcases.page.actions.web.LoginPage;
import com.BSP_Testcases.page.actions.web.MyAccountPage;
import com.BSP_Testcases.page.actions.web.TestCases.Static_pages;
import com.BSP_Testcases.page.validators.web.LoginValidator;
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
    @Test(priority = 0,testName = "Tc_CVR_01", description = "To validate the functionality of 'Create virtual preview' button")
    public void Validate_virtual_preview() throws InterruptedException {
        homePageActions.PDP_page();
        homePageActions.QTY_box();
        homePageActions.order_now_virtual_preview_button();

    }

    @Test(priority = 1,testName = "Tc_CVR_03", description = "To validate the functionality of 'Create virtual preview' popup with invalid data")
    public void Validate_virtual_preview_Invalid() throws InterruptedException {
        homePageActions.virtual_preview_Invalid();

    }
    @Test(priority = 2,testName = "Tc_CVR_02", description = "To validate the functionality of 'Create virtual preview' popup with valid data")
    public void Validate_virtual_preview_valid() throws InterruptedException {
        homePageActions.virtual_preview_valid();

    }
    @Test(priority = 3,testName = "Tc_CVR_04", description = "To validate the functionality checkbox of 'Create virtual preview' popup")
    public void Validate_virtual_preview_checkbox() throws InterruptedException {
        homePageActions.Checkbox();
        homePageActions.close();

    }
    @Test(priority = 4,testName = "Tc_OPS_01", description = "To validate the functionality of 'Order Product Sample' button")
    public void Validate_order_product_sample() throws InterruptedException {
//
        homePageActions.PDP_page();
        homePageActions.QTY_box();
        homePageActions.order_product_sample_button();

    }
    @Test(priority = 6,testName = "Tc_OPS_02", description = "To validate the functionality of 'Order Product Sample' popup with valid data")
    public void Validate_order_product_sample_valid_data() throws InterruptedException {
        homePageActions.order_product_sample_valid();

    }
    @Test(priority = 5,testName = "Tc_OPS_03", description = "To validate the functionality of 'Order Product Sample' popup with invalid data")
    public void Validate_order_product_sample_Invalid_data() throws InterruptedException {
        homePageActions.order_product_sample_Invalid();

    }
    @Test(priority = 7,testName = "Tc_OPS_04", description = "To validate the functionality checkbox of 'Order Product Sample' popup")
    public void Validate_order_product_sample_checkbox() throws InterruptedException {
        homePageActions.Checkbox_2();
        homePageActions.close_2();

    }
    @Test(priority = 8,testName = "TC_AboutUS_01", description = "To validate about us page.")
    public void Validate_About_us() throws InterruptedException {
        homePageActions.About_us();

    }
    @Test(priority = 9,testName = "TC_AboutUS_02", description = "To validate 'Meet the Team' link")
    public void Validate_About_us_Meetlink() throws InterruptedException {
        homePageActions.About_us_Meet_link();

    }
    @Test(priority = 10,testName = "TC_AboutUS_03", description = "To validate 'Services' link")
    public void Validate_About_us_services_link() throws InterruptedException {
        homePageActions.About_us_services_link();

    }
    @Test(priority = 11,testName = "TC_AboutUS_04", description = "To validate 'Careers' link")
    public void Validate_About_us_Careers_link() throws InterruptedException {
        homePageActions.About_us_carrers_link();

    }
}
