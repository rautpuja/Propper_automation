package com.PC_Automation_testcases.tests.web.TestCases;

import com.PC_Automation_testcases.core.BaseConfiguration;
import com.PC_Automation_testcases.page.actions.web.LoginPage;
import com.PC_Automation_testcases.page.actions.web.MyAccountPage;
import com.PC_Automation_testcases.page.actions.web.TestCases.PDP_Page;
import com.PC_Automation_testcases.page.validators.web.LoginValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PDP_Test extends BaseConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(PDP_Test.class);

    private LoginPage loginACtions;
    private PDP_Page homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;


    @BeforeClass
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        loginACtions = new LoginPage(driver);
        homePageActions = new PDP_Page(driver);
        myAccountPage = new MyAccountPage(driver);
        loginValidator = new LoginValidator();

    }
    @Test (priority = 0,testName = "TC_01", description = "Search part and accessories")
    public void Validate_PartandAccessories() throws InterruptedException {
        homePageActions.Subscribe();

    }
    @Test(priority = 1, testName = "TC_PD_01", description = "To verify the Product image is dispalying clear and distinct\n")
    public void Validate_Product_detail_Page() throws InterruptedException {
        homePageActions.PDP_page();
    }



    @Test(priority = 2, testName = "TC_PD_02", description = "To verify the breadcrumb of category page")
    public void Validate_Breadcrumb() throws InterruptedException {
        homePageActions.Breadcrumb();
    }

    @Test(priority = 3, testName = "TC_PD_03", description = "To validate the functionality of breadcrumb of product detail page")
    public void Validate_breadcrumb_link() throws InterruptedException {
        homePageActions.Breadcrumb_link();
    }
    @Test(priority = 4, testName = "TC_PD_04", description = "To validate the product image")
    public void Validate_product_image() throws InterruptedException {
        homePageActions.Product_image();
    }

    @Test(priority = 5, testName = "TC_PD_05", description = "To validate the title of the product")
    public void Validate_Product_name() throws InterruptedException {
        homePageActions.Product_image_title();
    }
    @Test(priority = 6, testName = "TC_PD_08", description = "To verify product detail page for guest users")
    public void Validate_Product_detail_for_guest_user() throws InterruptedException {
        homePageActions.detail_guest();
    }
    @Test(priority = 7, testName = "TC_PD_07", description = "To validate the functionality of 'Quantity bar' on product detail page below the sku")
    public void Validate_Qty() throws InterruptedException {
        homePageActions.QTY_();
    }

    @Test(priority = 8, testName = "TC_PD_12\n", description = "To validate the functionality of 'Add to Quote' on product detail page below the 'Quantity Bar'")
    public void Validate_Addtoqoute() throws InterruptedException {
        homePageActions.addtoqoute();
    }
    @Test(priority = 9, testName = "TC_PD_13", description = "To validate the functionality of 'Request a Sample' on product detail page below the 'Quantity Bar'")
    public void Validate_Request_sample() throws InterruptedException {
        homePageActions.request_sample();
    }

    @Test(priority = 10, testName = "TC_PD_15", description = "To validate the functionality of Request more information link")
    public void Validate_request_more_information() throws InterruptedException {
        homePageActions.request_more_information();
    }
    @Test(priority = 11, testName = "TC_PD_17", description = "To validate the functionality of \"More Information\" tab link")
    public void Validate_request_more_information_guest() throws InterruptedException {
        homePageActions.moreinformation();
    }
    @Test(priority = 14, testName = "TC_PD_10", description = "To validate functionality of Add to cart for logged in users")
    public void Validate_addtocart() throws InterruptedException {
        homePageActions.Addtocart_link();
    }
    @Test(priority = 13, testName = "TC_PD_11", description = "To validate functionality of Add to wishlist for logged in users")
    public void Validate_addtowishlist() throws InterruptedException {
        homePageActions.Addtowishlist_link();
    }
    @Test(priority = 12, testName = "TC_PD_14", description = "To validate the functionality of \"Log In\" link")
    public void Validate_login() throws InterruptedException {
        homePageActions.login_link();
    }
    @Test(priority = 15, testName = "TC_PD_09\n", description = "To verify product detail page for logged in users")
    public void Validate_Product_detail_after_login() throws InterruptedException {
        homePageActions.detail_login();
    }
    @Test(priority = 16, testName = "TC_PD_16\n", description = "To validate the functionality of \"Product Specifications\" tab link")
    public void Validate_Product_Specification() throws InterruptedException {
        homePageActions.Product_specification();
    }
    @Test(priority = 17, testName = "TC_PD_17", description = "To validate the functionality of \"More Information\" tab link")
    public void Validate_moreinformation() throws InterruptedException {
        homePageActions.moreinformation();
    }
}
