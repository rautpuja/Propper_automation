package com.Marvel.tests.web.Retailer;

import com.Marvel.core.BaseConfiguration;
import com.Marvel.page.actions.web.LoginPage;
import com.Marvel.page.actions.web.MyAccountPage;
import com.Marvel.page.actions.web.Retailer.Product_listing_page;
import com.Marvel.page.validators.web.LoginValidator;
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
    @Test(priority = 0, testName = "TC_PLP_01", description = "To validate product listing page.\n ")
    public void Validate_Product_Listing_Page() throws InterruptedException {
        homePageActions.product();
    }
    @Test(priority = 1, testName = "TC_PLP_03", description = "To verify the breadcrumb of product detail page\n ")
    public void Validate_Breadcrumb() throws InterruptedException {
        homePageActions.Breadcrumb();
    }

    @Test(priority = 2, testName = "TC_PLP_04", description = "To validate main category name.\n ")
    public void Validate_Category_name() throws InterruptedException {
        homePageActions.Category();
    }

    @Test(priority = 3, testName = "TC_PLP_09", description = "To verify product image, product name\n")
    public void Validate_Productname() throws InterruptedException {
        homePageActions.Product_name_();
    }
    @Test(priority = 4, testName = "TC_PLP_10", description = "To validate the functionality of product name and image\n")
    public void Validate_Productname_link() throws InterruptedException {
        homePageActions.Product_name_Link();
    }


    @Test(priority = 5, testName = "TC_PLP_06", description = "To validate the functionality of 'sort by' dropdown\n ")
    public void Validate_Sort_by_filter() throws InterruptedException {


        homePageActions.Show();


    }
    @Test(priority = 6, testName = "TC_PLP_05", description = "To validate the functionality of sort by arrow\n ")
    public void Validate_Assending() throws InterruptedException {
        homePageActions.Assending_order();
    }


    @Test(priority = 7, testName = "TC_PLP_07", description = "To verify the filter product options on left hand side\n ")
    public void Validate_Filter() throws InterruptedException {
        homePageActions.Filter();
    }


    @Test(priority = 8, testName = "TC_PLP_08", description = "To validate clear all filter option\n ")
    public void Validate_ClearAll() throws InterruptedException {
        homePageActions.Clear_all();
    }


    @Test(priority = 9, testName = "TC_PLP_11", description = "To verify the 'Learn More' button ")
    public void Validate_LearnMore() throws InterruptedException {
        homePageActions.Learn_more_hover();


    }
    @Test(priority = 10, testName = "TC_PLP_12", description = "To validate functionality of Request a quote icon\n ")
    public void Validate_RAQ_form() throws InterruptedException {
        homePageActions.RAQ_form();
    }


    @Test(priority = 11, testName = "TC_PLP_13", description = "To validate request a quote form for empty data\n ")
    public void Validate_RAQ_blank() throws InterruptedException {
        homePageActions.RAQ_blank();
    }


    @Test(priority = 12, testName = "TC_PLP_14", description = "To validate request a quote form for valid data\n ")
    public void Validate_RAQ_valid() throws InterruptedException {
        homePageActions.RAQ_valid();
    }


    @Test(priority = 13, testName = "TC_PLP_15", description = "To validate functionality of Add to compare icon\n ")
    public void Validate_Addtocompare() throws InterruptedException {
        homePageActions.Add_to_compare();
    }


    @Test(priority = 14, testName = "TC_PLP_16", description = "To validate the functionality of  'Learn More' button\n ")
    public void Validate_LearnMore_button() throws InterruptedException {
        homePageActions.Learn_more();
    }




}
