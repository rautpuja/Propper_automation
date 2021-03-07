package com.U_line.tests.web.Servicer;

import com.U_line.core.BaseConfiguration;
import com.U_line.page.actions.web.LoginPage;
import com.U_line.page.actions.web.MyAccountPage;
import com.U_line.page.actions.web.Servicer.Checkout_page;
import com.U_line.page.actions.web.Servicer.Shipping_Page;
import com.U_line.page.validators.web.LoginValidator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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
    @Test(priority = 0, testName = "TC_Product Search_01", description = "Provider login")
    public void Validate_providerlogin() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(3000);
        homePageActions.providerlogin();
        homePageActions.setemail(username);

        homePageActions.setPassword(password);

        Thread.sleep(3000);
        homePageActions.clickSubmit();
        System.out.println("Provider login successfull");}


    @Test(priority = 1, testName = "TC_CO_01", description = "To validate the functionality of \"Go To Checkout\" button")
    public void Validate_Product_image_link() throws InterruptedException {
        homePageActions.Checkout_Page();

    }

//    @Test(priority = 3, testName = "TC_CO_04", description = "To validate the functionality of 'Shipping Address' popup with blank fields")
//    public void Validate_Shiphere_button() throws InterruptedException {
//        homePageActions.Address_form_with_blank();
//
//    }
//    @Test(priority = 2, testName = "TC_CO_03", description = "To validate the functionality of \"+ New Address\" button from Shipping Address section")
//    public void Validate_Add_New_Address() throws InterruptedException {
//        homePageActions.Add_New_address();
//
//    }
//
//    @Test(priority = 6, testName = "TC_CO_05", description = "To validate the functionality of 'Shipping Address' popup with invalid data")
//    public void Validate_Add_New_Address_InValid() throws InterruptedException, AWTException {
//        homePageActions.Address_form_with_InValid();
//
//    }
//    @Test(priority = 4, testName = "TC_CO_06", description = "To validate the functionality of 'Cancel' button from Shipping Address popup")
//    public void Validate_Add_New_Address_Cancel_Button() throws InterruptedException {
//        homePageActions.Address_form_with_Cancel_Button();
//
//    }
//    @Test(priority = 5, testName = "TC_CO_07", description = "To validate the functionality of 'Cross' button right top of popup")
//    public void Validate_Add_New_Address_Cross_Icon() throws InterruptedException {
//        homePageActions.Address_form_with_Cross_icon();
//
//    }
//
//    @Test(priority = 7, testName = "TC_CO_08", description = "Information should dispaly in section in front and that section should display as a selected with 'edit' button")
//    public void Validate_Add_New_Address_Valid() throws InterruptedException {
//        homePageActions.Address_form_with_Valid();
//
//    }
//    @Test(priority = 8, testName = "TC_CO_07", description = "To validate the functionality of 'edit' button ")
//    public void Validate_Add_New_Address_Edit_button() throws InterruptedException {
////        homePageActions.Edit_Button();
//
//    }
    @Test(priority = 9, testName = "TC_CO_02", description = "To validate the functionality of \"Ship Here\" button from Shipping Address section")
    public void Validate_Add_New_Address_shiphere() throws InterruptedException {
        homePageActions.Shiphere_button();

    }

//    @Test(priority = 11, testName = "TC_CO_10", description = "\"It should redirect to Review & Payments .\n" +
//            "Provide PO Number Field should not required\"")
//    public void Validate_Po_number() throws InterruptedException {
//        homePageActions.Po_Number();
//
//
//    }
//    @Test(priority = 10, testName = "TC_CO_11", description = "To check the Order summary section for the checkout section.")
//    public void Validate_order_summary() throws InterruptedException {
//
//homePageActions.order_summery();
//    }

    @Test (priority = 12,testName = "TC_CO_12", description = "To validate the functionality of check box of 'My billing and shipping address are the same' from Payment method")
    public void Validate_PurchaseOrder_PaymentMethod() throws InterruptedException {
        homePageActions.PurchaseOrder();
    }
        @Test (priority = 13,testName = "TC_CO_13", description = "To validate the functionality of check box of 'My billing and shipping address are the same' from Payment method")
        public void Validate_PurchaseOrder_PaymentMethod_Checkbox() throws InterruptedException {
        homePageActions.purchase_order();


    }
    @Test (priority = 14,testName = "TC_CO_15", description = "To validate the functionality of check box of 'My billing and shipping address are the same' from Payment method")
    public void Validate_PurchaseOrder_PaymentMethod_Blank_data() throws InterruptedException {
        homePageActions.New_address_From_Payment_blank_data();


    }
    @Test (priority = 15,testName = "TC_CO_16", description = "To validate the functionality of check box of 'My billing and shipping address are the same' from Payment method")
    public void Validate_PurchaseOrder_Invalid_data() throws InterruptedException {
        homePageActions.Payment_New_address_invalid();


    }
    @Test (priority = 16,testName = "TC_CO_17", description = "To validate the functionality of check box of 'My billing and shipping address are the same' from Payment method")
    public void Validate_PurchaseOrder_For_valid_data() throws InterruptedException {
        homePageActions.Payment_New_address_valid();


    }

    @Test (priority = 17,testName = "TC_CO_25", description = "To validate the functionality of 'Apply Promo Code'")
    public void Validate_Apply_promo_code() throws InterruptedException {
        homePageActions.Apply_promo_code();


    }

    @Test(priority = 18, testName = "TC_CO_27", description = "To validate the functionality of 'Shipping Method' section with right hand side edit button")
    public void Validate_Ship_here() throws InterruptedException {
        homePageActions.Shiphere_icon1();

    }
    @Test(priority = 19, testName = "TC_CO_28", description = "To validate the functionality of 'Shipping Method' section with right hand side edit button")
    public void Validate_Shiphere_for_shipping_address() throws InterruptedException {
        homePageActions.Shiphere_icon2();

    }
    @Test (priority = 20,testName = "TC_CO_19", description = "To validate the functionality of order notes from Payment method")
    public void Validate_Place_Order() throws InterruptedException {
     //   homePageActions.PlaceOrder();


    }

    @Test (priority = 21,testName = "TC_CO_26", description = "It should redirect to homepage")
    public void Validate_PurchaseOrder_Continue_shipping() throws InterruptedException {
    //    homePageActions.Continue_shipping();


    }

}
