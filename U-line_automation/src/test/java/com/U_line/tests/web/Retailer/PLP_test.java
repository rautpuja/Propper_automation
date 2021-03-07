package com.U_line.tests.web.Retailer;

import com.U_line.core.BaseConfiguration;
import com.U_line.page.actions.web.LoginPage;
import com.U_line.page.actions.web.MyAccountPage;
import com.U_line.page.actions.web.Retailer.Product_listing_page;
import com.U_line.page.validators.web.LoginValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PLP_test extends BaseConfiguration {
    private static final Logger LOGGER = LoggerFactory.getLogger(PLP_test.class);

    private LoginPage loginACtions;
    private Product_listing_page homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;


    @BeforeClass
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        loginACtions = new LoginPage(driver);
        homePageActions = new Product_listing_page(driver);
        myAccountPage = new MyAccountPage(driver);
        loginValidator = new LoginValidator();

    }
    @Test(priority = 0, testName = "TC_CP_01", description = "To validate product listing page. ")
    public void Validate_Product_Listing_Page() throws InterruptedException {
        homePageActions.Category_page();
    }

    @Test(priority = 1, testName = "TC_CP_02", description = "To verify the breadcrumb of product detail page ")
    public void Validate_Breadcrump() throws InterruptedException {
        homePageActions.Breadcrumb();
    }

    @Test(priority = 2, testName = "TC_CP_03", description = "To verify the breadcrumb of product detail page ")
    public void Validate_Assending() throws InterruptedException {
        homePageActions.Assending_order();
    }

    @Test(priority = 3, testName = "TC_CP_04", description = "To verify the breadcrumb of product detail page ")
    public void Validate_Show() throws InterruptedException {
        homePageActions.Show();
    }

    @Test(priority = 4, testName = "TC_CP_05", description = "To verify the breadcrumb of product detail page ")
    public void Validate_ProductName() throws InterruptedException {
        homePageActions.Product_name();
    }


}
