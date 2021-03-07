package com.PC_Automation_testcases.tests.web.TestCases;

import com.PC_Automation_testcases.core.BaseConfiguration;
import com.PC_Automation_testcases.page.actions.web.LoginPage;
import com.PC_Automation_testcases.page.actions.web.MyAccountPage;
import com.PC_Automation_testcases.page.actions.web.TestCases.Shopping_cart_page;
import com.PC_Automation_testcases.page.validators.web.LoginValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Shopping_cart_test extends BaseConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(Shopping_cart_page.class);

    private LoginPage loginACtions;
    private Shopping_cart_page homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;

    @BeforeMethod
    @BeforeClass
    public void setUp() {
        loginACtions = new LoginPage(driver);
        homePageActions = new Shopping_cart_page(driver);
        myAccountPage = new MyAccountPage(driver);
        loginValidator = new LoginValidator();

    }

    @Test (priority = 0,testName = "", description = "Click on subscribe pop -up")
    public void Validate_Subscribe() throws InterruptedException {
        homePageActions.Subscribe();

    }
    @Test (priority = 1,testName = "", description = "add product into cart")
    public void Validate_add_product_intocart() throws InterruptedException {

        homePageActions.Addtocart();

    }

    @Test (priority = 3,testName = "TC_SC_01", description = "To verify whether the 'Product Image' is clear and distinct on shopping cart page..")
    public void Validate_view_checkout_page() throws InterruptedException {
    homePageActions.view_cart();
        homePageActions.viewcart_and_edit();

    }





    @Test(priority = 4, testName = "TC_SC_05", description = "To validate functionality of the 'Product Name' / 'Product image' link.")
    public void Validate_Product_image_link() throws InterruptedException {
        homePageActions.Product_image_link();

    }

    @Test(priority = 5, testName = "TC_SC_10", description = "To validate the functionality of Quantity box.")
    public void Validate_Qty_box() throws InterruptedException {
        homePageActions.Qty_box();

    }
        @Test(priority = 6, testName = "TC_SC_20", description = "To validate functionality of 'Email Address' of 'Enter your details' section when no data is entered as a guest")
    public void Validate_Email_blank() throws InterruptedException {
        homePageActions.Email_blank();

    }
        @Test(priority = 7, testName = "TC_SC_19", description = "To validate functionality of 'Email Address' of 'Enter your details' section when invalid Email address is entered as a guest")
    public void Validate_Email_Invalid() throws InterruptedException {
        homePageActions.Email_invalid();

    }


    @Test(priority = 8, testName = "TC_SC_18", description = "To validate functionality of 'Email Address' of 'Enter your details' section when valid Email address is entered as a guest")
    public void Validate_Email_box() throws InterruptedException {
        homePageActions.Email_valid();
    }
        @Test(priority = 9, testName = "TC_SC_24", description = "To validate Shipping Address section when data is empty")
    public void Validate_Shipping_address_form_for_blank_data() throws InterruptedException {
        homePageActions.Form_blank();

    }
    @Test(priority = 10, testName = "TC_SC_23", description = "To validate Shipping Address section when data is invalid")
    public void Validate_Shipping_address_form_for_invalid_data() throws InterruptedException {
        homePageActions.Form_invalid();

    }

    @Test(priority = 11, testName = "TC_SC_22", description = "To validate Shipping Address section when data is entered")
    public void Validate_Shipping_address_form_for_valid_data() throws InterruptedException {
        homePageActions.Form_valid();

    }

    @Test(priority = 12, testName = "TC_SC_26", description = "To validate Billing Address section when data is entered")
    public void Validate_billing_address() throws InterruptedException {
        homePageActions.billing_address();

    }
    @Test(priority = 13, testName = "TC_SC_30", description = "To validate billing Address section when data is empty")
    public void Validate_billing_address_blank() throws InterruptedException {
        homePageActions.Form_blank_billing();

    }
    @Test(priority = 14, testName = "TC_SC_29", description = "To validate billing Address section when data is invalid")
    public void Validate_billing_address_invalid() throws InterruptedException {
        homePageActions.Form_invalid_billing();

    }
    @Test(priority = 15, testName = "TC_SC_28", description = "To verify Billing Address section when data is entered")
    public void Validate_billing_address_valid() throws InterruptedException {
        homePageActions.Form_valid_billing();

    }

    @Test (priority = 13,testName = "TC_SC_04", description = "To validate 'Remove' functionality in shopping cart page.")
    public void Validate_remove_link() throws InterruptedException {

//        homePageActions.remove();

    }
    @Test (priority = 16,testName = "TC_SC_03", description = "To verify section for logged in users")
    public void Validate_login() throws InterruptedException {

        homePageActions.login(username,password);
        homePageActions.Product();

    }
    @Test (priority = 17,testName = "TC_SC_09", description = "To verify the products 'Quantity' display.")
    public void Validate_Qty() throws InterruptedException {

        homePageActions.Qty_product();

    }
    @Test (priority = 18,testName = "TC_SC_11", description = "To verify the 'Sub Total' section for logged in users")
    public void Validate_Subtotal() throws InterruptedException {

        homePageActions.Subtotal();

    }
    @Test (priority = 19,testName = "TC_SC_15", description = "To validate the functionality of the 'Update Shopping Cart' button for logged in users.")
    public void Validate_updateCart() throws InterruptedException {

        homePageActions.update_cart();

    }
    @Test (priority = 20,testName = "TC_SC_08", description = "To validate 'Move to Wishlist' below Item of product for logged in users")
    public void Validate_movetowishlist() throws InterruptedException {

        homePageActions.Movetowishlist();

    }
    @Test (priority = 21,testName = "TC_SC_25", description = "To validate remove link after login")
    public void Validate_remove_product() throws InterruptedException {

        homePageActions.Remove_product();

    }
    @Test (priority = 22,testName = "TC_SC_13", description = "To validate the functionality of 'Proceed to Checkout' button when user is logged in to the application.")
    public void Validate_checkout_button() throws InterruptedException {
      homePageActions.Product();





    }
}
