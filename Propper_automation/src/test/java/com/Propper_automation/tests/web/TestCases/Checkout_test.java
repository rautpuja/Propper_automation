package com.Propper_automation.tests.web.TestCases;

import com.Propper_automation.core.BaseConfiguration;
import com.Propper_automation.page.actions.web.LoginPage;
import com.Propper_automation.page.actions.web.MyAccountPage;
import com.Propper_automation.page.actions.web.B2C_test_cases.Checkout_page;
import com.Propper_automation.page.validators.web.LoginValidator;
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

    @Test (priority = 0,testName = "TC_ Checkout_01", description = "To validate that user can access the Checkout Page only after adding the product to the cart.")
    public void Validate_Checkout() throws InterruptedException {
        homePageActions.B2C_login();
        homePageActions.My_account();
        homePageActions.setemail(username);
        homePageActions.setPassword(password);
        homePageActions.clickSubmit();
        homePageActions.PDP_page();
        homePageActions.dropdown();
        homePageActions.Checkout();


    }
    @Test (priority = 1,testName = "TC_ Checkout_04", description = "To validate the functionality of \"+ New Address\" button from Shipping Address section")
    public void Validate_New_address() throws InterruptedException {
        homePageActions.New_address_button();
    }
    @Test (priority = 2,testName = "TC_ Checkout_05", description = "To validate the functionality of 'Shipping Address' popup with blank fields")
    public void Validate_New_address_blank() throws InterruptedException {
        homePageActions.New_address_blank();

}
    @Test (priority = 3,testName = "TC_ Checkout_06", description = "To validate the functionality of 'Shipping Address' popup with invalid data")
    public void Validate_New_address_invalid() throws InterruptedException {
        homePageActions.New_address_invalid();

    }
    @Test (priority = 4,testName = "TC_ Checkout_07", description = "To validate the functionality of 'Cancel' button from Shipping Address popup")
    public void Validate_New_address_cancel() throws InterruptedException {
//    homePageActions.New_address_Cancel();

    }
    @Test (priority = 5,testName = "TC_ Checkout_08", description = "To validate the functionality of 'Cross' button right top of popup")
    public void Validate_New_address_close() throws InterruptedException {
       // homePageActions.New_address_button();
        homePageActions.New_address_Close();

    }
    @Test (priority = 6,testName = "TC_ Checkout_09", description = "To validate the functionality of 'Shipping Address' popup with valid data")
    public void Validate_New_address_valid() throws InterruptedException {
        homePageActions.New_address_button();
        homePageActions.New_address_valid();

    }
    @Test (priority = 7,testName = "TC_ Checkout_10", description = "To verify the functionality of 'Shipping Method' Section")
    public void Validate_shipping_method() throws InterruptedException {
        homePageActions.shipping_method();
        homePageActions.Next_button();

    }
    @Test (priority = 8,testName = "TC_ Checkout_11", description = "To check the Order summary section for the checkout section.")
    public void Validate_Order_summery() throws InterruptedException {
        homePageActions.order_summery();


    }
    @Test (priority = 9,testName = "TC_ Checkout_12", description = "To check the Order summary section for the checkout section.")
    public void Validate_Checkbox() throws InterruptedException {
        homePageActions.Checkbox();


    }
    @Test (priority = 10,testName = "TC_ Checkout_13", description = "To check the Order summary section for the checkout section.")
    public void Validate_Checkbox_dropdown() throws InterruptedException {
        homePageActions.Checkbox_dropdown();


    }
    @Test (priority = 11,testName = "TC_ Checkout_15", description = "To validate the functionality of 'New Address' form from Review & Payments with blank fields")
    public void Validate_Payment_New_address_blank() throws InterruptedException {
        homePageActions.Payment_new_address_blank();


    }
    @Test (priority = 12,testName = "TC_ Checkout_16", description = "To validate the functionality of 'New Address' form from Review & Payments  with invalid data")
    public void Validate_Payment_New_address_invalid() throws InterruptedException {
        homePageActions.Payment_new_address_invalid();


    }
    @Test (priority = 13,testName = "TC_ Checkout_17", description = "To validate the functionality of 'New Address' form from Review & Payments  with valid data")
    public void Validate_Payment_New_address_valid() throws InterruptedException {
        homePageActions.Payment_new_address_valid();


    }
    @Test (priority = 16,testName = "TC_ Checkout_17", description = "To validate the functionality of 'New Address' form from Review & Payments  with valid data")
    public void Validate_promocode_blank() throws InterruptedException {
        homePageActions.Promo_code_blank();


    }
    @Test (priority = 17,testName = "TC_ Checkout_17", description = "To validate the functionality of 'New Address' form from Review & Payments  with valid data")
    public void Validate_Promocode_invalid() throws InterruptedException {
        homePageActions.Promo_code_invalid();


    }
    @Test (priority = 18,testName = "TC_ Checkout_17", description = "To validate the functionality of 'New Address' form from Review & Payments  with valid data")
    public void Validate_Promocode_valid() throws InterruptedException {
        homePageActions.Promo_code_valid();


    }
    @Test (priority = 14,testName = "TC_ Checkout_17", description = "To validate the functionality of 'New Address' form from Review & Payments  with valid data")
    public void Validate_shipping_to() throws InterruptedException {
        homePageActions.Ship_to();


    }
    @Test (priority = 15,testName = "TC_ Checkout_17", description = "To validate the functionality of 'New Address' form from Review & Payments  with valid data")
    public void Validate_Shipping_method() throws InterruptedException {
        homePageActions.shipping_method_();


    }
}
