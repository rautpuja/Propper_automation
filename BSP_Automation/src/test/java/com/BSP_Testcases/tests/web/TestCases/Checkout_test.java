package com.BSP_Testcases.tests.web.TestCases;

import com.BSP_Testcases.core.BaseConfiguration;
import com.BSP_Testcases.page.actions.web.LoginPage;
import com.BSP_Testcases.page.actions.web.MyAccountPage;
import com.BSP_Testcases.page.actions.web.TestCases.Checkout_page;
import com.BSP_Testcases.page.validators.web.LoginValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Checkout_test extends BaseConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(Checkout_test.class);

    private LoginPage loginACtions;
    private Checkout_page homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;


    @BeforeClass
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        loginACtions = new LoginPage(driver);
        homePageActions = new Checkout_page(driver);
        myAccountPage = new MyAccountPage(driver);
        loginValidator = new LoginValidator();

    }

    @Test (priority = 0,testName = "TC_ Checkout_01", description = "To validate the functionality of 'Order Now' button")
    public void Validate_Order_now_button() throws InterruptedException {
        homePageActions.PDP_page();
        homePageActions.QTY_box();
        homePageActions.order_now_button();

    }
    @Test (priority = 1,testName = "TC_ Checkout_03", description = "To validate product information from the pop up")
    public void Validate_product_info() throws InterruptedException {
        homePageActions.Product_info();


    }
//    @Test (priority = 2,testName = "TC_ Checkout_04", description = "To validate qty box from the pop up")
//    public void Validate_Qty_box() throws InterruptedException {
//        homePageActions.QTY();
//
//
//    }

    @Test (priority = 4,testName = "TC_ Checkout_06", description = "To validate contact info section for blank data")
    public void Validate_blank_info() throws InterruptedException {
        homePageActions.contact_info_blank();


    }
    @Test (priority = 5,testName = "TC_ Checkout_07", description = "To validate the functionality of first navigation form ''contact info\" with invalid data")
    public void Validate_Contact_info_invalid() throws InterruptedException {
        homePageActions.contact_info_invalid();


    }
    @Test (priority = 6,testName = "TC_ Checkout_02", description = "To validate the functionality of first navigation form ''contact info\" with valid data")
    public void Validate_contact_info_valid() throws InterruptedException {
        homePageActions.contact_info_valid();


    }
    @Test (priority = 7,testName = "TC_ Checkout_09", description = "To verify the second navigation form ''upload artwork\"")
    public void Validate_Upload() throws InterruptedException, AWTException {
        homePageActions.Upload();


    }
    @Test (priority = 8,testName = "TC_ Checkout_10", description = "To valiadate the functionality of 'Add text' from second navigation form ''upload artwork\"")
    public void Validate_add_text() throws InterruptedException, AWTException {
        homePageActions.Add_text();


    }
    @Test (priority = 9,testName = "TC_ Checkout_11", description = "To valiadate the functionality of 'Contact me' from second navigation form ''upload artwork\"")
    public void Validate_contact_me() throws InterruptedException, AWTException {
        homePageActions.Contact_me();


    }
    @Test (priority = 10,testName = "TC_ Checkout_12", description = "To valiadate the functionality of 'Next Step' from second navigation form ''upload artwork\"")
    public void Validate_Next_step() throws InterruptedException, AWTException {
        homePageActions.Next_step();


    }
    @Test (priority = 11,testName = "TC_ Checkout_13", description = "To verify of  'Payment Info (Optional)'")
    public void Validate_payment_info() throws InterruptedException, AWTException {
        homePageActions.payment_method();

    }
    @Test (priority = 13,testName = "TC_ Checkout_14", description = "To validate the functionality of  'Payment Info (Optional)' with valid data")
    public void Validate_payment_info_valid() throws InterruptedException, AWTException {
        homePageActions.payment_method_valid();

    }
    @Test (priority = 12,testName = "TC_ Checkout_15", description = "To  validate the functionality of  'Payment Info (Optional)' with invalid data")
    public void Validate_payment_info_Invalid() throws InterruptedException, AWTException {
        homePageActions.payment_method_invalid();

    }
    @Test (priority = 14,testName = "TC_ Checkout_16", description = "To  validate the functionality of 'I’d prefer to see my proof first' checkbox from 'Payment Info (Optional)'")
    public void Validate_payment_info_checkbox() throws InterruptedException, AWTException {
        homePageActions.payment_method_checkbox();

    }
    @Test (priority = 15,testName = "TC_ Checkout_17", description = "To  validate the functionality of 'Yup! I'd like to receive discounts and cool product ideas.' checkbox from 'Payment Info (Optional)' ")
    public void Validate_payment_info_checkbox2() throws InterruptedException, AWTException {
        homePageActions.payment_method_checkbox2();
 }
    @Test (priority = 16,testName = "TC_ Checkout_20", description = "To validate order selected item pop up ")
    public void Validate_wishlist() throws InterruptedException, AWTException {
        homePageActions.PDP_page();
        homePageActions.Add_to_wishlist_button();
        homePageActions.Wishlist();

    }
    @Test (priority = 17,testName = "TC_ Checkout_21", description = "To validate product information from the pop up")
    public void Validate_product_information() throws InterruptedException, AWTException {
        homePageActions.Product_info2();

    }
    @Test (priority = 18,testName = "TC_ Checkout_22", description = "To validate qty box from the pop up ")
    public void Validate_qty() throws InterruptedException, AWTException {
        homePageActions.QTY2();

    }
    @Test (priority = 19,testName = "TC_ Checkout_23", description = "To validate colour dropdown ")
    public void Validate_colour_dropdown() throws InterruptedException, AWTException {
        homePageActions.next2();

    }
    @Test (priority = 20,testName = "TC_ Checkout_24", description = "To validate contact info section for blank data")
    public void Validate_wishlist_contact_info_blank() throws InterruptedException, AWTException {
        homePageActions.contact_info_blank();

    }
    @Test (priority = 21,testName = "TC_ Checkout_26", description = "To validate the functionality of first navigation form ''contact info\" with invalid data")
    public void Validate_wishlist_contact_info_invalid() throws InterruptedException, AWTException {
        homePageActions.contact_info_invalid_wishlist();

    }
    @Test (priority = 22,testName = "TC_ Checkout_25", description = "To validate the functionality of first navigation form ''contact info\" with valid data")
    public void Validate_wishlist_contact_info_valid() throws InterruptedException, AWTException {
        homePageActions.contact_info_valid_wishlist();

    }
    @Test (priority = 23,testName = "TC_ Checkout_28", description = "To verify the 3rd navigation form ''upload artwork\"")
    public void Validate_wishlist_upload() throws InterruptedException, AWTException {
        homePageActions.Upload2();

    }
    @Test (priority = 24,testName = "TC_ Checkout_29", description = "To validate the functionality of 'Add text' from 3rd navigation form ''upload artwork\"")
    public void Validate_wishlist_Add_text() throws InterruptedException, AWTException {
        homePageActions.Add_text();

    }
    @Test (priority = 25,testName = "TC_ Checkout_30", description = "To validate the functionality of 'Contact me' from second navigation form ''upload artwork\"")
    public void Validate_wishlist_contact_me() throws InterruptedException, AWTException {
        homePageActions.Contact_me();

    }
    @Test (priority = 26,testName = "TC_ Checkout_31", description = "To valiadate the functionality of 'Next Step' from 4th navigation form ''upload artwork\"")
    public void Validate_Next_step_2() throws InterruptedException, AWTException {
        homePageActions.Next_step2();


    }
    @Test (priority = 27,testName = "TC_ Checkout_32", description = "To verify of  'Payment Info (Optional)'")
    public void Validate_payment_info2() throws InterruptedException, AWTException {
        homePageActions.payment_method_2();

    }
    @Test (priority = 29,testName = "TC_ Checkout_33", description = "To validate the functionality of  'Payment Info (Optional)' with valid data")
    public void Validate_payment_info_valid2() throws InterruptedException, AWTException {
        homePageActions.payment_method_valid();

    }
    @Test (priority = 28,testName = "TC_ Checkout_34", description = "To  validate the functionality of  'Payment Info (Optional)' with invalid data")
    public void Validate_payment_info_Invalid2() throws InterruptedException, AWTException {
        homePageActions.payment_method_invalid();

    }
    @Test (priority = 30,testName = "TC_ Checkout_35", description = "To  validate the functionality of 'I’d prefer to see my proof first' checkbox from 'Payment Info (Optional)'")
    public void Validate_payment_info_checkbox_wishlist() throws InterruptedException, AWTException {
        homePageActions.payment_method_checkbox();

    }
    @Test (priority = 31,testName = "TC_ Checkout_36", description = "To  validate the functionality of 'Yup! I'd like to receive discounts and cool product ideas.' checkbox from 'Payment Info (Optional)' ")
    public void Validate_payment_info_checkbox2_wishlist() throws InterruptedException, AWTException {
        homePageActions.payment_method_checkbox2_2();
    }
}
