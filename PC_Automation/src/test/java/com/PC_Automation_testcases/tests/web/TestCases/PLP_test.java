package com.PC_Automation_testcases.tests.web.TestCases;

import com.PC_Automation_testcases.core.BaseConfiguration;
import com.PC_Automation_testcases.page.actions.web.LoginPage;
import com.PC_Automation_testcases.page.actions.web.MyAccountPage;
import com.PC_Automation_testcases.page.actions.web.TestCases.Product_listing_page;
import com.PC_Automation_testcases.page.validators.web.LoginValidator;
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
    @Test (priority = 0,testName = "TC_01", description = "Click on subscribe pop up")
    public void Validate_Subscribe() throws InterruptedException {
        homePageActions.Subscribe();

    }

    @Test(priority = 1, testName = "TC_PLP_01", description = "To validate product listing page. ")
    public void Validate_Product_Listing_Page() throws InterruptedException {
        homePageActions.product();
    }

    @Test(priority = 2, testName = "TC_PLP_02", description = "To verify the breadcrumb of product detail page\n ")
    public void Validate_Breadcrumb() throws InterruptedException {
        homePageActions.Breadcrumb();
    }

    @Test(priority = 3, testName = "TC_PLP_03", description = "To validate main category name.")
    public void Validate_Category_name() throws InterruptedException {
        homePageActions.Category_name();
    }

    @Test(priority = 4, testName = "TC_PLP_07", description = "To verify the functionality of show filter")
    public void Validate_show() throws InterruptedException {
        homePageActions.Show();
    }

    @Test(priority = 5, testName = "TC_PLP_05", description = "To verify the functionality of sort by arrow ")
    public void Validate_Assending() throws InterruptedException {
        homePageActions.Assending_order();
    }

    @Test(priority = 6, testName = "TC_PLP_04", description = "To validate sorter of products")
    public void Validate_Sort_By() throws InterruptedException {


        homePageActions.Sort();


    }


    @Test(priority = 7, testName = "TC_PLP_08", description = "To verify product image, product name ")
    public void Validate_Productnameimage() throws InterruptedException {
        homePageActions.Product_name();


    }


    @Test(priority = 9, testName = "TC_PLP_09", description = "To validate functionality of Products tile for guest users ")
    public void Validate_producttile() throws InterruptedException {
        homePageActions.Product_tile();
    }


    @Test(priority = 10, testName = "TC_PLP_10", description = "To verify the categories section ")
    public void Validate_categoriessection() throws InterruptedException {
        homePageActions.CategoriesSection();
    }


    @Test(priority = 11, testName = "TC_PLP_11", description = "To validate functionality of Add to compare icon\n ")
    public void Validate_shopby() throws InterruptedException {
        homePageActions.shopbysection();
    }


    @Test(priority = 12, testName = "TC_PLP_12", description = "To verify clear all filter ")
    public void Validate_clearall() throws InterruptedException {
        homePageActions.Clear_all();
    }


    @Test(priority = 14, testName = "TC_PLP_14", description = "To verify 'Need Help Finding a Product' section ")
    public void Validate_Needyourhelp() throws InterruptedException {
        homePageActions.Needhelp_section();
    }


    @Test(priority = 15, testName = "TC_PLP_13", description = "To verify 'Need Help Finding a Product' sections 'Search FAQs' button ")
    public void Validate_needhelp() throws InterruptedException {
        homePageActions.Needhelp_section_button();
    }

    @Test(priority = 16, testName = "TC_PLP_18", description = "To validate functionality of Products tile for logged in users")
    public void Validate_login_Product_tile() throws InterruptedException {
        homePageActions.Login();
        homePageActions.Product_tile();
    }
    @Test(priority = 17, testName = "TC_PLP_19", description = "To validate functionality of add to wishlist section for login users")
    public void Validate_login_addtowishlist() throws InterruptedException {
        homePageActions.Addtowishlist();
    }

    @Test(priority = 18, testName = "TC_PLP_20", description = "To validate functionality of add to cart section for login users")
    public void Validate_login_addtocart() throws InterruptedException {
        homePageActions.addtocart();
    }

    @Test(priority = 13, testName = "TC_PLP_15", description = "To verify 'Read more' link on below sorter of the page")
    public void Validate_readmore() throws InterruptedException {
        homePageActions.read_more();
    }
}
