package com.Marvel.tests.web.Retailer;

import com.Marvel.core.BaseConfiguration;
import com.Marvel.page.actions.web.LoginPage;
import com.Marvel.page.actions.web.MyAccountPage;

import com.Marvel.page.actions.web.Retailer.Parts_and_accessories_page;
import com.Marvel.page.validators.web.LoginValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Parts_and_accessories_test extends BaseConfiguration {
    private static final Logger LOGGER = LoggerFactory.getLogger(Parts_and_accessories_page.class);

    private LoginPage loginACtions;
    private Parts_and_accessories_page homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;


    @BeforeClass
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        loginACtions = new LoginPage(driver);
        homePageActions = new Parts_and_accessories_page(driver);
        myAccountPage = new MyAccountPage(driver);
        loginValidator = new LoginValidator();

    }
    @Test(priority = 0, testName = "TC_Part&Accessories_01\n", description = "To validate the part & accessories page\n")
    public void Validate_Parts_and_accessories_page() throws InterruptedException {
        homePageActions.Parts_and_accessories();
    }

    @Test(priority = 1, testName = "TC_Part&Accessories_02", description = "To verify the breadcrumb of part & accessories page\n")
    public void Breadcrumb() throws InterruptedException {
        homePageActions.Breadcrumb();
    }
    @Test(priority = 2, testName = "TC_Part&Accessories_03", description = "To validate the 'search by' from the part & accessories banner")
    public void Search_By() throws InterruptedException {
        homePageActions.Part_search_by();
    }

    @Test(priority = 5, testName = "TC_Part&Accessories_05", description = "TTo validate the 'search by' blank Service Model Number/Serial Number/Part Number from the part & accessories banner\n")
    public void Blank_Search() throws InterruptedException {
        homePageActions.Part_search_partNumber();
    }


    @Test(priority = 6, testName = "TC_Part&Accessories_06", description = "To validate the 'search by' invalid Model Number/Serial Number/Part Number from the parts Search  banner")
    public void Wrong_serialNumber() throws InterruptedException {


        homePageActions.Wrong_SerialNumber();

    }

    @Test(priority = 7, testName = "TC_Part&Accessories_04", description = "To validate the 'search by' Service Model Number/Serial Number/Part Number from the part & accessories banner\n")
    public void Validate_Searial_Number() throws InterruptedException {
        homePageActions.partNumber();
    }
    @Test(priority = 8, testName = "TC_Part&Accessories_19", description = "To validate image popup \n")
    public void Validate_imagepopup() throws InterruptedException {
        homePageActions.Image();

    }
    @Test(priority = 9, testName = "TC_Part&Accessories_20", description = "To validate image popup cross(X) & close button\n ")
    public void Validate_Close () throws InterruptedException {
        homePageActions.Close();

    }
    @Test(priority = 4, testName = "TC_Part&Accessories_07", description = "To validate the functionality of 'Need Help?' below the search box\n")
    public void Validate_Help() throws InterruptedException {
        homePageActions.Help();
    }

    @Test(priority = 3, testName = "TC_Part&Accessories_11", description = "\"1. To verify the Shipping Details below the part & accessories banner\n" +
            "2.To validate ' Click here to download our return policy.' in the Return Policy section below the part & accessories banner\n" +
            "3.To validate ' please search our Servicer page.' in the Service Information section below the part & accessories banner\n" +
            "4.To validate 'Prop 65 information' in the California Residents section below the part & accessories banner\"\n")
    public void Validate_SearchResult() throws InterruptedException {
        homePageActions.Shipping_detail();

    }

    @Test(priority = 14, testName = "TC_Part&Accessories_15", description = "To validate 'Add to cart' button below the parts Search  banner")
    public void Validate_add_to_cart() throws InterruptedException {
        homePageActions.add_to_cart_button();

    }

    @Test(priority = 15, testName = "TC_Part&Accessories_17", description = "To validate  the functionality 'Continue Shopping' button")
    public void Validate_Continue_shopping() throws InterruptedException {
        homePageActions.add_to_cart_continueshopping();
    }

    @Test(priority = 16, testName = "TC_Part&Accessories_16", description = "To validate the functionality 'View Cart' button ")
    public void Validate_view_Cart() throws InterruptedException {

        homePageActions.add_to_cart_view_cart();




    }



        @Test(priority = 12, testName = "TC_Part&Accessories_18", description = "To validate search text box ")
        public void Validate_SearchResultBox () throws InterruptedException {
          homePageActions.SearchBox();

        }

//    }

    }
