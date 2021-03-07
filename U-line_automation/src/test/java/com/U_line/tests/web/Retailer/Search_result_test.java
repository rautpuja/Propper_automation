package com.U_line.tests.web.Retailer;

import com.U_line.core.BaseConfiguration;
import com.U_line.page.actions.web.LoginPage;
import com.U_line.page.actions.web.MyAccountPage;
import com.U_line.page.actions.web.Retailer.Search_result_page;
import com.U_line.page.actions.web.Servicer.Contact_us_page;
import com.U_line.page.validators.web.LoginValidator;
import com.U_line.tests.web.Servicer.Contact_us_test;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Search_result_test extends BaseConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(Search_result_test.class);

    private LoginPage loginACtions;
    private Search_result_page homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;


    @BeforeClass
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        loginACtions = new LoginPage(driver);
        homePageActions = new Search_result_page(driver);
        myAccountPage = new MyAccountPage(driver);
        loginValidator = new LoginValidator();

    }

    @Test(priority = 0, testName = "search", description = "\"It should get redirect to category (L1) page\n" +
            "\" ")
    public void Validate_Searchresult() throws InterruptedException {
        homePageActions.BrowseAllCategory();


    }
    @Test(priority = 1, testName = "TC_SearchResultPage_04", description = "\"It should get redirect to category (L1) page\n" +
            "\" ")
    public void Validate_Resource_link() throws InterruptedException {

        homePageActions.Resource_link();


    }
    @Test(priority = 2, testName = "TC_SearchResultPage_01", description = "\"It should get redirect to category (L1) page\n" +
            "\" ")
    public void Validate_Quicklink1() throws InterruptedException {

        homePageActions.Quick_link1();


    }
    @Test(priority = 3, testName = "TC_SearchResultPage_02", description = "\"It should get redirect to category (L1) page\n" +
            "\" ")
    public void Validate_Quicklink2() throws InterruptedException {
        Thread.sleep(8000);
        driver.navigate().back();
        homePageActions.Quick_link2();


    }
    @Test(priority = 4, testName = "TC_SearchResultPage_03", description = "\"It should get redirect to category (L1) page\n" +
            "\" ")
    public void Validate_Quicklink3() throws InterruptedException {
        Thread.sleep(9000);
        driver.navigate().back();
        homePageActions.Quick_link3();


    }
    @Test(priority = 5, testName = "TC_SearchResultPage_05", description = "To verify product image, product name"
            )
    public void Validate_product_link() throws InterruptedException {
        Thread.sleep(8000);
        driver.navigate().back();
        homePageActions.Product_name();



    }
    @Test(priority = 6, testName = "TC_SearchResultPage_08", description = "To validate funtionality of product listing page according to search result"
            )
    public void Validate_search_plp_page() throws InterruptedException {
        homePageActions.Search_PLP_page();
    }
        @Test(priority = 7, testName = "TC_SearchResultPage_09", description = "To verify the breadcrumb of product detail page ")
        public void Validate_Assending() throws InterruptedException {
            homePageActions.Assending_order();
        }

        @Test(priority = 8, testName = "TC_SearchResultPage_06", description = "To verify the functionality of show filter")
        public void Validate_Show() throws InterruptedException {
            homePageActions.Show();
        }

        @Test(priority = 9, testName = "TC_SearchResultPage_07", description = "It should get redirect to the product detail page ")
        public void Validate_ProductName() throws InterruptedException {
            homePageActions.Product_nametest();
        }

    }




