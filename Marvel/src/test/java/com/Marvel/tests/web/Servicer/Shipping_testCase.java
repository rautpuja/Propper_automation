package com.Marvel.tests.web.Servicer;

import com.Marvel.core.BaseConfiguration;
import com.Marvel.page.actions.web.LoginPage;
import com.Marvel.page.actions.web.MyAccountPage;
import com.Marvel.page.actions.web.Servicer.Shipping_Page;
import com.Marvel.page.validators.web.LoginValidator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Shipping_testCase extends BaseConfiguration {


    private static final Logger LOGGER = LoggerFactory.getLogger(Shipping_testCase.class);

    private LoginPage loginACtions;
    private Shipping_Page homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;


    @BeforeClass
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        loginACtions = new LoginPage(driver);
        homePageActions = new Shipping_Page(driver);
        myAccountPage = new MyAccountPage(driver);
        loginValidator = new LoginValidator();

    }
    @Test(priority = 0, testName = "Login", description = "To validate the functionality of 'Parts Search' ")
    public void Validate_providerlogin() throws InterruptedException {


        homePageActions.providerlogin();
        homePageActions.setemail(username);
        homePageActions.setPassword(password);
        Thread.sleep(3000);
        homePageActions.clickSubmit();

    }
    @Test(priority = 1, testName = "TC_ShoppingCart_01", description = "To validate the link of 'Shipping & Returns' section below the header section")
    public void Validate_Shopping_Page() throws InterruptedException {
        homePageActions.Shipping_Page();

    }
    @Test(priority = 2, testName = "TC_ShoppingCart_02", description = "To validate the link of 'California Residents' section below the header section 'Shipping & Returns' section")
    public void Validate_Click_link() throws InterruptedException {
        homePageActions.Click_links();

    }

    @Test(priority = 3, testName = "TC_ShoppingCart_06", description = "To validate functionality of the 'Product Name' / 'Product image' link.")
    public void Validate_Product_image_link() throws InterruptedException {
        homePageActions.Product_image_link();

    }



    @Test(priority = 4, testName = "TC_ShoppingCart_07", description = "To verify the functionality of the 'SKU'")
    public void Validate_Sku() throws InterruptedException {
        homePageActions.Sku_number();

    }

    @Test(priority = 5, testName = "TC_ShoppingCart_10", description = "To validate the functionality of Quantity box.")
    public void Qty_1() throws InterruptedException {
        homePageActions.Qty_box();


    }

    @Test(priority = 6, testName = "TC_ShoppingCart_11", description = "To validate the functionality of 'Update cart' link below quantity box")
    public void Validate_Update_cart_link() throws InterruptedException {
        homePageActions.Update_cart_link();

    }
    @Test(priority = 7, testName = "TC_ShoppingCart_24", description = "To verify the 'Summary' section.")
    public void Validate_order_summery() throws InterruptedException {
        homePageActions.Order_summer_section();

    }
    @Test(priority = 8, testName = "TC_ShoppingCart_14", description = "To verify the 'Estimate Shipping and Tax' dropdown.")
    public void Validate_Estimated_tax() throws InterruptedException {
        homePageActions.Estimate_total_section();

    }
    @Test(priority = 9, testName = "TC_ShoppingCart_15", description = "To verify the 'Country' & 'State' dropdown.")
    public void Validate_Estimated_tax_dropdown() throws InterruptedException {
        homePageActions.Estimate_total_section_dropdown();

    }
    @Test(priority = 10, testName = "TC_ShoppingCart_25", description = "To verify the  'Order Total' price.")
    public void Validate_Total_price() throws InterruptedException {
        homePageActions.Order_Total();

    }
    @Test(priority = 11, testName = "TC_ShoppingCart_05", description = "To validate the functionality of edit (pencil icon) ")
    public void Validate_Edit_icon() throws InterruptedException {
        homePageActions.edit_button();

    }


    @Test(priority = 12, testName = "TC_ShoppingCart_27", description = "To validate the functionality of the Upadte Cart button.")
    public void Validate_Update_cart_button() throws InterruptedException {
        homePageActions.Update_cart_button_();

    }

    @Test(priority = 13, testName = "TC_ShoppingCart_17", description = "To validate the functionality of 'Serial Number' for qty one without serial number")
    public void Validate_Serial_number_blank() throws InterruptedException {
        homePageActions.Serial_number_blank();
    }

    @Test(priority = 14, testName = "TC_ShoppingCart_01", description = "To validate the functionality of the Upadte Cart button.")
    public void Validate_Serial_number_invalid() throws InterruptedException {
        homePageActions.Serial_number_invalid();

    }

    @Test(priority = 15, testName = "TC_ShoppingCart_16", description = "To validate the functionality of 'Serial Number' for qty one with serial number")
    public void Validate_Serial_number_valid() throws InterruptedException {
        homePageActions.Serial_number_valid();

    }
    @Test(priority = 16, testName = "TC_ShoppingCart_18", description = "To validate the functionality of 'Serial Number' for qty two")
    public void Validate_Serial_number_Two() throws InterruptedException {
        homePageActions.Two_serial_number();

    }
    @Test(priority = 17, testName = "TC_ShoppingCart_19", description = "To validate the functionality of 'Serial Number' for qty three")
    public void Validate_Serial_number_Three() throws InterruptedException {
        homePageActions.Three_serial_number();

    }
    @Test(priority = 18, testName = "TC_ShoppingCart_20", description = "To validate the functionality of 'cross' button in the serial number box")
    public void Validate_Serial_number_cross() throws InterruptedException {
        homePageActions.Serial_number_cross();

    }
    @Test(priority = 19, testName = "TC_ShoppingCart_04", description = "To validate 'Remove' functionality in shopping cart page.")
    public void Validate_Remove() throws InterruptedException {
        homePageActions.Cross_icon();

    }
    @Test(priority = 20, testName = "TC_ShoppingCart_12", description = "To validate the functionality 'Move To Saved Items' link ")
    public void Validate_Save_for_later_link() throws InterruptedException {
        homePageActions.Save_for_later();

    }

    @Test(priority = 21, testName = "TC_ShoppingCart_21", description = "\"To validate the functionality 'APPLY DISCOUNT CODE'\n" +
            "with blank field\"")
    public void Validate_Apply_councode_blank() throws InterruptedException {
        homePageActions.Apply_coupn_code_blank();

    }
    @Test(priority = 22, testName = "TC_ShoppingCart_22", description = "\"To validate the functionality 'APPLY DISCOUNT CODE'\n" +
            "with invalid coupon code\"")
    public void Validate_Apply_coupn_code_invalid() throws InterruptedException {
        homePageActions.Apply_coupn_code_invalid();

    }
    @Test(priority = 23, testName = "TC_ShoppingCart_23", description = "\"To validate the functionality 'APPLY DISCOUNT CODE'\n" +
            "with valid coupon code\"")
    public void Validate_apply_coupn_code_valid() throws InterruptedException {
        homePageActions.Apply_coupn_code_valid();

    }
    @Test(priority = 24, testName = "TC_ShoppingCart_26", description = "To validate the functionality of checkout button")
    public void Validate_Checkout() throws InterruptedException {
        homePageActions.Checkout_button();

    }

    }

