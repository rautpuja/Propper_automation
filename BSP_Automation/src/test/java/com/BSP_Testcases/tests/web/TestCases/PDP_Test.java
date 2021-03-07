package com.BSP_Testcases.tests.web.TestCases;

import com.BSP_Testcases.core.BaseConfiguration;
import com.BSP_Testcases.page.actions.web.LoginPage;
import com.BSP_Testcases.page.actions.web.MyAccountPage;
import com.BSP_Testcases.page.actions.web.TestCases.PDP_Page;
import com.BSP_Testcases.page.validators.web.LoginValidator;
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

    @Test(priority = 0, testName = "TC_PD_01", description = "To verify the Product image is dispalying clear and distinct\n")
    public void Validate_Product_detail_Page() throws InterruptedException {
        homePageActions.PDP_page();
    }
    @Test(priority = 1, testName = "TC_PD_02", description = "To verify the breadcrumb of category page")
    public void Validate_breadcrumb() throws InterruptedException {
        homePageActions.Breadcrumb();
    }
    @Test(priority = 2, testName = "TC_PD_03", description = "To validate the functionality of breadcrumb of product detail page")
    public void Validate_breadcrumb_link() throws InterruptedException {
        homePageActions.breadcrumb_link();
    }
    @Test(priority = 3, testName = "TC_PD_04", description = "To validate the title of the product")
    public void Validate_Product_title() throws InterruptedException {
        homePageActions.product_title();
    }
    @Test(priority = 4, testName = "TC_PD_05", description = "To validate the sku of the product")
    public void Validate_Product_specification() throws InterruptedException {
        homePageActions.Product_specification();
    }
    @Test(priority = 5, testName = "TC_PD_06", description = "To validate the product image slider functionality")
    public void Validate_Product_sku() throws InterruptedException {
        homePageActions.Product_sku();
    }

    @Test(priority = 6, testName = "TC_PD_07", description = "To validate the product thumbnail image below the slider")
    public void Validate_Product_slider() throws InterruptedException {
        homePageActions.slider_image();
    }
    @Test(priority = 7, testName = "TC_PD_08", description = "To validate the quantity of product")
    public void Validate_QTY_box() throws InterruptedException {
        homePageActions.QTY_box();
    }
    @Test(priority = 8, testName = "TC_PD_09", description = "To validate the functionality of 'ORDER NOW' button")
    public void Validate_order_now_button() throws InterruptedException {
        homePageActions.order_now_button();
    }
    @Test(priority = 9, testName = "TC_PD_10", description = "To validate the functionality of 'Create virtual preview' button")
    public void Validate_virtual_preview_button() throws InterruptedException {
       homePageActions.QTY_box();
        homePageActions.order_now_virtual_preview_button();
    }
    @Test(priority = 10, testName = "TC_PD_11", description = "To validate the functionality of 'Order Product Sample' button")
    public void Validate_product_sample_button() throws InterruptedException {
        homePageActions.QTY_box();
        homePageActions.order_product_sample_button();
    }
    @Test(priority = 11, testName = "TC_PD_12", description = "To validate the functionality of 'Add to Wish List' button")
    public void Validate_add_to_wishlist_button() throws InterruptedException {
        homePageActions.Add_to_wishlist_button();
    }
    @Test(priority = 12, testName = "TC_PD_13", description = "To validate the functionality of 'Email' button")
    public void Validate_Email_button() throws InterruptedException {
        homePageActions.Email_button();
    }
    @Test(priority = 13, testName = "TC_PD_14", description = "To validate the functionality of \"Product Description\" tab link")
    public void Validate_product_discription_button() throws InterruptedException {
        homePageActions.Product_discription_button();
    }

    @Test(priority = 14, testName = "TC_PD_15", description = "To validate the functionality of \"Additional Information\" tab link")
    public void Validate_addition_information_section() throws InterruptedException {
        homePageActions.additional_information_tab();
    }
    @Test(priority = 15, testName = "TC_PD_16", description = "To validate the functionality of \"Frequently Asked Questions\" tab link")
    public void Validate_frequesntly_ask_button() throws InterruptedException {
        homePageActions.frequntly_ask_question_button();
    }
    @Test(priority = 16, testName = "TC_PD_17", description = "To validate the functionality of \"Our Guarantee\" tab link")
    public void Validate_our_garenty_button() throws InterruptedException {
        homePageActions.our_garenty_button();
    }
    @Test(priority = 17, testName = "TC_PD_18", description = "To validate the functionality of \"California Proposition 65\" tab link")
    public void Validate_california_button() throws InterruptedException {
        homePageActions.california_button();
    }
    @Test(priority = 18, testName = "TC_PD_19", description = "To validate the functionality of \"Reviews\" tab link")
    public void Validate_reviews_button() throws InterruptedException {
        homePageActions.reviews_button();
    }
    @Test(priority = 19, testName = "TC_PD_20", description = "To verify \"RELATED PRODUCTS\" section")
    public void Validate_related_product_button() throws InterruptedException {
        homePageActions.related_product_button();
    }
    @Test(priority = 20, testName = "TC_PD_21", description = "To validate the functionality of products in related products section")
    public void Validate_related_product_button_add_to_wishlist() throws InterruptedException {
        homePageActions.add_to_wishlist_from_related_product_button();
    }
    @Test(priority = 21, testName = "TC_PD_22", description = "To verify \"Top Sellers\" section")
    public void Validate_top_sell_product_button() throws InterruptedException {
        homePageActions.Top_seller();
    }
    @Test(priority = 22, testName = "TC_PD_23", description = "To validate the functionality of products in top sellers  section")
    public void Validate_Top_seller_add_to_wishlist_button() throws InterruptedException {
        homePageActions.add_to_wishlist_from_top_seller_button();
    }
}
