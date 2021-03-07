package com.U_line.tests.web.Retailer;

import com.U_line.core.BaseConfiguration;
import com.U_line.page.actions.web.LoginPage;
import com.U_line.page.actions.web.MyAccountPage;
import com.U_line.page.actions.web.Retailer.Category_L1_Page;

import com.U_line.page.validators.web.LoginValidator;
import org.jsoup.Connection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Category_L1_page_Test extends BaseConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(Category_L1_page_Test.class);

    private LoginPage loginACtions;
    private Category_L1_Page homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;


    @BeforeClass
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        loginACtions = new LoginPage(driver);
        homePageActions = new Category_L1_Page(driver);
        myAccountPage = new MyAccountPage(driver);
        loginValidator = new LoginValidator();

    }
    @Test(priority = 0, testName = "TC_PP_01", description = "It should get redirected to the respective page.\n" +
            "It should display the breadcrumb properly with Home > Products ")
    public void Validate_Product_L1() throws InterruptedException {
        homePageActions.product();
}
    @Test(priority = 1, testName = "TC_PP_02", description = "To verify Category image, Category name ")
    public void Validate_verify_Image() throws InterruptedException {
        homePageActions.product_category_image();
    }

    @Test(priority = 2, testName = "TC_PP_03", description = "To validate the category image or category name navigation from products page.")
    public void Validate_category_Navigation() throws InterruptedException {
        homePageActions.product_category_image_redirect();
    }

    @Test(priority = 3, testName = "TC_PP_04", description = "To verify header and banner images")
    public void Validate_bannerimage() throws InterruptedException {
        homePageActions.Header_image();
    }

}
