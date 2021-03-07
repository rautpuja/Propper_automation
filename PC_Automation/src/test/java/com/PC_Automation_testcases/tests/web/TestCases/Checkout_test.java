package com.PC_Automation_testcases.tests.web.TestCases;

import com.PC_Automation_testcases.core.BaseConfiguration;
import com.PC_Automation_testcases.page.actions.web.LoginPage;
import com.PC_Automation_testcases.page.actions.web.MyAccountPage;
import com.PC_Automation_testcases.page.actions.web.TestCases.Checkout_page;
import com.PC_Automation_testcases.page.validators.web.LoginValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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

    @Test (priority = 0,testName = "TC_01", description = "Click on subscribe pop up")
    public void Validate_Subscribe() throws InterruptedException {
        homePageActions.Subscribe();

    }
    @Test (priority = 1,testName = "", description = "add product into cart")
    public void Validate_add_product_intocart() throws InterruptedException {

        homePageActions.login();
        homePageActions.addtocart();
    }


    @Test (priority = 2,testName = "TC_CO_01", description = "To validate the functionality of \"Proceed to Checkout\" button for checkout as logged in user.")
    public void Validate_view_checkout_page() throws InterruptedException {

        homePageActions.Checkout();

    }




    @Test (priority = 3,testName = "TC_CO_02", description = "To validate '+ New Address' button")
    public void Validate_New_address() throws InterruptedException {
        homePageActions.New_address();
    }

    @Test (priority = 4,testName = "TC_CO_03", description = "To validate 'Shipping address' pop up with blank data")
    public void Validate_New_address_blank_data() throws InterruptedException {
        homePageActions.New_address_blank_data();
    }
    @Test (priority = 5,testName = "TC_CO_04", description = "To validate the functionality of checkout when invalid data is entered in mandatory fields.\n")
    public void Validate_New_address_invalid_detail() throws InterruptedException {
        homePageActions.New_address_From_Payment_Invalid_data();
    }

    @Test (priority = 6,testName = "TC_CO_05", description = "To validate the functionality of checkout form for checkout as guest.\n")
    public void Validate_shipping_Info_for_valid_address() throws InterruptedException {
        homePageActions.New_address_From_Payment_valid_data();
    }

    @Test(priority = 7, testName = "TC_CO_06", description = "To validate the functionality of checkout form for checkout")
    public void Validate_shiphere() throws InterruptedException {
      homePageActions.Ship_here();

    }
    @Test(priority = 8, testName = "TC_CO_07", description = "To check the Order summary section for the checkout section.")
    public void Validate_ordersummary() throws InterruptedException {
        homePageActions.Order_summery();


    }
    @Test(priority = 10, testName = "TC_CO_08", description = "To validate the functionality of 'Shipping Method' section with right hand side edit button")
    public void Validate_Shipping_method() throws InterruptedException {
        homePageActions.Shipping_method();

    }
//    @Test(priority = 11, testName = "TC_CO_10", description = "To validate Collect shipping methods required fields")
//    public void Validate_Shiphere_for_shipping_address() throws InterruptedException {
//        homePageActions.Next_button();
//
//    }

    @Test (priority = 9,testName = "TC_CO_11", description = "To validate Special Shipping Instructions section")
    public void Validate_Special_shipping_instruction() throws InterruptedException {
        homePageActions.Special_shipping_instruction();
    }
    @Test (priority = 12,testName = "TC_CO_12", description = "To validate functionality of  'Next' button")
    public void Validate_PurchaseOrder_Next_button() throws InterruptedException {
        homePageActions.Next_button_withshopping();


    }




    @Test (priority = 13,testName = "TC_CO_13", description = "To validate the functionality of payment method")
    public void Validate_Paymentoption() throws InterruptedException {
        homePageActions.Payment_option();



    }
    @Test (priority = 15,testName = "TC_CO_13", description = "To validate the functionality of payment method")
    public void Validate_PurchaseOrder_For_valid_data() throws InterruptedException {
        homePageActions.invoice_option();



    }
    @Test (priority = 16,testName = "TC_CO_15", description = "To validate the functionality of  Purchase Order")
    public void Validate_Place_Order() throws InterruptedException {
        homePageActions.purchase_option();




    }
    @Test (priority = 27,testName = "TC_CO_16", description = "To validate the functionality of Credit Card")
    public void Validate_CreaditCart() throws InterruptedException {
      homePageActions.Creadit_cart();
//        homePageActions.invoice_option();
//        homePageActions.place_order_();


    }

    @Test (priority = 18,testName = "TC_CO_17", description = "To validate the functionality of 'Ship To' section with right hand side edit button")
    public void Validate_ship_here() throws InterruptedException {
        homePageActions.Ship_here1();




    }
    @Test (priority = 19,testName = "TC_CO_18", description = "To validate the functionality of 'Apply Promo Code'")
    public void Validate_Promocode_blank() throws InterruptedException {
homePageActions.Apply_promo_code_blank();



    }
    @Test (priority = 20,testName = "TC_CO_19", description = "To validate the functionality of 'Apply Promo Code'")
    public void Validate_Promocode_invalid() throws InterruptedException {
        homePageActions.Apply_promo_code_invalid();



    }
    @Test (priority = 21,testName = "TC_CO_20", description = "To validate the functionality of 'Apply Promo Code'")
    public void Validate_Promocode_valid() throws InterruptedException {
        homePageActions.Apply_promo_code_valid();



    }
    @Test (priority = 22,testName = "TC_CO_21", description = "To validate the functionality of 'Shipping Method' section with right hand side edit button")
    public void Validate_shiphere2() throws InterruptedException {
        homePageActions.Ship_here2();




    }

    @Test (priority = 23,testName = "TC_CO_14", description = "To validate +new address from invoice payment method")
    public void Validate_New_address_() throws InterruptedException {
        homePageActions.New_address_();




    }
    @Test (priority = 24,testName = "TC_CO_15", description = "To validate +new address from invoice payment method with blank data")
    public void Validate_New_address_Blank() throws InterruptedException {
        homePageActions.New_address__blank_data();




    }
    @Test (priority = 25,testName = "TC_CO_16", description = "To validate +new address from invoice payment method with invalid data")
    public void Validate_New_address_invalid() throws InterruptedException {
        homePageActions.New_address_invalid_data();




    }
    @Test (priority = 26,testName = "TC_CO_17", description = "To validate +new address from invoice payment method with valid data")
    public void Validate_New_address_valid_data() throws InterruptedException {
        homePageActions.New_address__valid_data();


    }
//    @Test (priority = 27,testName = "TC_CO_22", description = "To validate the functionality of 'Continue Shopping' button after order placed")
//    public void Validate_continue_shipping() throws InterruptedException {
//        homePageActions.Continue_shipping();
//
//
//
//
//    }

}
