package com.BSP_Testcases.tests.web.TestCases;

import com.BSP_Testcases.core.BaseConfiguration;
import com.BSP_Testcases.page.actions.web.LoginPage;
import com.BSP_Testcases.page.actions.web.MyAccountPage;
import com.BSP_Testcases.page.actions.web.TestCases.Product_listing_page;
import com.BSP_Testcases.page.validators.web.LoginValidator;
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
    @Test (priority = 0,testName = "TC_PLP_01", description = "Click on subscribe pop up")
    public void Validate_PLP_page() throws InterruptedException {
        homePageActions.PLP_page();

    }
    @Test (priority = 1,testName = "TC_PLP_02", description = "Click on subscribe pop up")
    public void Validate_breadcrumb() throws InterruptedException {
        homePageActions.breadcrumb();

    }
    @Test (priority = 2,testName = "TC_PLP_03", description = "Click on subscribe pop up")
    public void Validate_breadcrumb_category_name() throws InterruptedException {
        homePageActions.breadcrumb_category_name();

    }
    @Test (priority = 3,testName = "TC_PLP_04", description = "Click on subscribe pop up")
    public void Validate_read_more_link() throws InterruptedException {
        homePageActions.Read_more_link();

    }
    @Test (priority = 4,testName = "TC_PLP_05", description = "Click on subscribe pop up")
    public void Validate_product_sorting() throws InterruptedException {
        homePageActions.Product_sorting();

    }
    @Test (priority = 5,testName = "TC_PLP_06", description = "Click on subscribe pop up")
    public void Validate_sorting_arrow() throws InterruptedException {
        homePageActions.sorting_arrow();

    }
    @Test (priority = 6,testName = "TC_PLP_07", description = "Click on subscribe pop up")
    public void Validate_sorter_option() throws InterruptedException {
        homePageActions.sorter_option();

    }
    @Test (priority = 7,testName = "TC_PLP_08", description = "Click on subscribe pop up")
    public void Validate_product_image() throws InterruptedException {
        homePageActions.product_image();

    }
    @Test (priority = 8,testName = "TC_PLP_09", description = "Click on subscribe pop up")
    public void Validate_product_image_link() throws InterruptedException {
        homePageActions.product_image_link();

    }
    @Test (priority = 9,testName = "TC_PLP_10", description = "Click on subscribe pop up")
    public void Validate_wishlist_link() throws InterruptedException {
        homePageActions.wishlist_link();

    }
    @Test (priority = 10,testName = "TC_PLP_11", description = "Click on subscribe pop up")
    public void Validate_filter_option() throws InterruptedException {
        homePageActions.filter_option();

    }
    @Test (priority = 11,testName = "TC_PLP_12", description = "Click on subscribe pop up")
    public void Validate_clear_all() throws InterruptedException {
        homePageActions.clear_all_option();

    }
    @Test (priority = 12,testName = "TC_PLP_13", description = "Click on subscribe pop up")
    public void Validate_minimizefilter_option() throws InterruptedException {
        homePageActions.minimize_filter();

    }
    @Test (priority = 13,testName = "TC_PLP_14", description = "Click on subscribe pop up")
    public void Validate_maximize_filter_option() throws InterruptedException {
        homePageActions.maximize_filter();

    }
    @Test (priority = 14,testName = "TC_PLP_15", description = "Click on subscribe pop up")
    public void Validate_showmore_option() throws InterruptedException {
        homePageActions.showmore_option();

    }
    @Test (priority = 15,testName = "TC_PLP_16", description = "Click on subscribe pop up")
    public void Validate_showless_option() throws InterruptedException {
        homePageActions.showless_option();

    }
    @Test (priority = 16,testName = "TC_PLP_17", description = "Click on subscribe pop up")
    public void Validate_show_filter() throws InterruptedException {
        homePageActions.show_filter();

    }
    @Test (priority = 17,testName = "TC_PLP_18", description = "Click on subscribe pop up")
    public void Validate_show_filter_select() throws InterruptedException {
        homePageActions.show_filter_select();

    }
    @Test (priority = 18,testName = "TC_PLP_19", description = "Click on subscribe pop up")
    public void Validate_pagination() throws InterruptedException {
        homePageActions.pagination();

    }
    @Test (priority = 19,testName = "TC_PLP_20", description = "Click on subscribe pop up")
    public void Validate_pagination_button() throws InterruptedException {
        homePageActions.pagination_button();

    }
}
