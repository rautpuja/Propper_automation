package com.Marvel.tests.web.Servicer;

import com.Marvel.core.BaseConfiguration;
import com.Marvel.page.actions.web.LoginPage;
import com.Marvel.page.actions.web.MyAccountPage;
import com.Marvel.page.actions.web.Servicer.Checkout_page;
import com.Marvel.page.validators.web.LoginValidator;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Checkout_Test extends BaseConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(Checkout_Test.class);

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
    @Test(priority = 0, testName = "Login", description = "To validate the functionality of 'Parts Search' ")
    public void Validate_providerlogin() throws InterruptedException {


        homePageActions.providerlogin();
        homePageActions.setemail(username);
        homePageActions.setPassword(password);
        Thread.sleep(3000);
        homePageActions.clickSubmit();

    }


    @Test(priority = 1, testName = "TC_Checkout_01", description = "To validate the functionality of \"Go To Checkout\" button")
    public void Validate_Product_image_link() throws InterruptedException {
        homePageActions.Checkout_Page();

    }
    @Test(priority = 2, testName = "TC_Checkout_02", description = "To validate the functionality of \"Ship Here\" button from Shipping Address section")
    public void Validate_Shiphere_() throws InterruptedException {
        homePageActions.Shiphere_button();

    }
    @Test(priority = 3, testName = "TC_Checkout_03", description = "To validate the functionality of \"+ New Address\" button from Shipping Address section")
    public void Validate_Add_New_Address() throws InterruptedException {
        homePageActions.Add_New_address();

    }
    @Test(priority = 4, testName = "TC_Checkout_04", description = "To validate the functionality of 'Shipping Address' popup with blank fields")
    public void Validate_address_blank() throws InterruptedException {
        homePageActions.Address_form_with_blank();

    }


    @Test(priority = 5, testName = "TC_Checkout_05", description = "To validate the functionality of 'Shipping Address' popup with invalid data")
    public void Validate_Add_New_Address_InValid() throws InterruptedException, AWTException {
        homePageActions.Address_form_with_InValid();

    }
    @Test(priority = 6, testName = "TC_Checkout_06", description = "To validate the functionality of 'Cancel' button from Shipping Address popup")
    public void Validate_Add_New_Address_Cancel_Button() throws InterruptedException {
        homePageActions.Address_form_with_Cancel_Button();

    }
    @Test(priority = 7, testName = "TC_Checkout_07", description = "To validate the functionality of 'Cross' button right top of popup")
    public void Validate_Add_New_Address_Cross_Icon() throws InterruptedException {
        homePageActions.Address_form_with_Cross_icon();

    }

    @Test(priority = 8, testName = "TC_Checkout_08", description = "To validate the functionality of 'Shipping Address' popup with valid data")
    public void Validate_Add_New_Address_Valid() throws InterruptedException {
        homePageActions.Address_form_with_Valid();

    }
    @Test(priority = 9, testName = "TC_Checkout_09", description = "To verify the functionality of 'Shipping Method' Section ")
    public void Validate_shipping_methods() throws InterruptedException {
       homePageActions.shipping_method();

    }

    @Test(priority = 11, testName = "TC_Checkout_10", description = "To verify the functionality of 'Provide PO Number' Section beloww the shiiping method")
    public void Validate_Po_number() throws InterruptedException {
        homePageActions.Po_Number();


    }

    @Test(priority = 12, testName = "TC_Checkout_11", description = "To check the Order summary section for the checkout section.")
    public void Validate_order_summary() throws InterruptedException {
        homePageActions.Order_summery();

    }

    @Test (priority = 13,testName = "TC_Checkout_12", description = "To validate the functionality of check box of 'My billing and shipping address are the same' from Payment method")
    public void Validate_PurchaseOrder_PaymentMethod_radio_button() throws InterruptedException {
        homePageActions.Payment_radio_button();
    }


        @Test (priority = 14,testName = "TC_Checkout_13", description = "To validate the functionality of check box of dropdown from Payment method")
        public void Validate_Payment_option() throws InterruptedException {
        homePageActions.Payment_method_option();


    }
    @Test (priority = 15,testName = "TC_Checkout_14", description = "To validate the functionality of dropdown option 'New Address' from Payment method")
    public void Validate_New_address() throws InterruptedException {
       homePageActions.Payment_New_address();


    }
    @Test (priority = 16,testName = "TC_Checkout_15", description = "To validate the functionality of 'New Address' form from Review & Payments with blank fields")
    public void Validate_add_new_address_blank() throws InterruptedException {
        homePageActions.Payment_New_address_blank();


    }
    @Test (priority = 16,testName = "TC_Checkout_16", description = "To validate the functionality of 'New Address' form from Review & Payments  with invalid data")
    public void Validate_add_new_address_invalid() throws InterruptedException {
        homePageActions.Payment_New_address_invalid();


    }
    @Test (priority = 17,testName = "TC_Checkout_17", description = "To validate the functionality of 'New Address' form from Review & Payments  with valid data")
    public void Validate_add_new_address_valid() throws InterruptedException {
        homePageActions.Payment_New_address_valid();


    }
    @Test (priority = 18,testName = "TC_Checkout_18", description = "To validate the functionality of 'New Address' form  chwck box (Save in address book) from Review & Payments  with valid data")
    public void Validate_add_new_address_checkbox() throws InterruptedException {
        homePageActions.Payment_Checkbox();


    }

    @Test(priority = 19, testName = "TC_Checkout_27", description = "To validate the functionality of 'Shipping Method' section with right hand side edit button")
    public void Validate_Ship_here() throws InterruptedException {
        homePageActions.Payment_shipher_icon1();
        homePageActions.Payment_shipher_icon2();

    }
    @Test(priority = 20, testName = "TC_Checkout_24", description = "\"To validate the functionality 'APPLY DISCOUNT CODE'\n" +
            "with blank field\"")
    public void Validate_apply_discount_blank() throws InterruptedException {
        homePageActions.Apply_promo_code_blank();


    }
    @Test(priority = 21, testName = "TC_Checkout_25", description = "\"To validate the functionality 'APPLY DISCOUNT CODE'\n" +
            "with invalid coupon code\"")
    public void Validate_apply_discount_invalid() throws InterruptedException {
        homePageActions.Apply_promo_code_invalid();


    }
    @Test(priority = 22, testName = "TC_Checkout_26", description = "\"To validate the functionality 'APPLY DISCOUNT CODE'\n" +
            "with valid coupon code\"")
    public void Validate_apply_discount_valid() throws InterruptedException {
        homePageActions.Apply_promo_code_valid();

    }
    @Test(priority = 23, testName = "TC_Checkout_22", description = "To validate the functionality of  Parts Payment")
    public void Validate_creaditcard() throws InterruptedException {
        homePageActions.Creadit_card_number();

    }
    @Test(priority = 24, testName = "TC_Checkout_19", description = "To validate the functionality of order notes from Payment method")
    public void Validate_placeorder() throws InterruptedException {
        homePageActions.Place_order();


    }

}
