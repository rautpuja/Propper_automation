package com.U_line.tests.web.Retailer;

import com.U_line.core.BaseConfiguration;
import com.U_line.page.actions.web.LoginPage;
import com.U_line.page.actions.web.MyAccountPage;
import com.U_line.page.actions.web.Retailer.Checkout_retailer_page;
import com.U_line.page.actions.web.Servicer.Checkout_page;
import com.U_line.page.validators.web.LoginValidator;
import com.U_line.tests.web.Servicer.Checkout_Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Checkout_retailer_test extends BaseConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(Checkout_retailer_test.class);

    private LoginPage loginACtions;
    private Checkout_retailer_page homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;


    @BeforeClass
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        loginACtions = new LoginPage(driver);
        homePageActions = new Checkout_retailer_page(driver);
        myAccountPage = new MyAccountPage(driver);
        loginValidator = new LoginValidator();

    }
    @Test (priority = 0,testName = "TC_01", description = "Search part and accessories")
    public void Validate_PartandAccessories() throws InterruptedException {
        homePageActions.openpartsandaccessories();
        homePageActions.modelnumber();
        homePageActions.search();
        homePageActions.addtocart();
        homePageActions.viewcart();
    }



    @Test (priority = 1,testName = "TC_CO_01", description = "To validate the functionality of \"Go To Checkout\" button for checkout as guest.")
    public void Validate_go_to_checkout() throws InterruptedException {
        homePageActions.checkout();

    }
    @Test (priority = 2,testName = "TC_CO_05", description = "To validate the functionality of checkout form with blank field")
    public void Validate_shipping_Info_for_blank_address() throws InterruptedException {
homePageActions.Signin_info_for_blank_address();
    }

    @Test (priority = 5,testName = "TC_CO_04", description = "To validate the functionality of checkout when invalid data is entered in mandatory fields.")
    public void Validate_shipping_Info_for_invalid_address() throws InterruptedException {
        homePageActions.Signin_info_for_Invalid_email_address();
    }

    @Test (priority = 6,testName = "TC_CO_02", description = "Enter shipping address information")
    public void Validate_shipping_Info_for_valid_address() throws InterruptedException {
        homePageActions.Signin_info_for_valid_email_address();
    }

    @Test(priority = 7, testName = "TC_CO_06", description = "To check the Order summary section for the checkout section.")
    public void Validate_ordersummary() throws InterruptedException {
        WebElement ele= driver.findElement(By.xpath("//div[@class='cart-summary']"));
       System.out.println("Order summary result:"+ele.getText());

    }
    @Test(priority = 8, testName = "TC_CO_12", description = "To validate the functionality of 'Shipping Method' section with right hand side edit button")
    public void Validate_Ship_here() throws InterruptedException {
        homePageActions.Shiphere_icon1();

    }
    @Test(priority = 9, testName = "TC_CO_14", description = "To validate the functionality of 'Shipping Method' section with right hand side edit button")
    public void Validate_Shiphere_for_shipping_address() throws InterruptedException {
        homePageActions.Shiphere_icon2();

    }

    @Test (priority = 10,testName = "TC_CO_07", description = "To validate the functionality of payment method")
    public void Validate_PurchaseOrder_PaymentMethod() throws InterruptedException {
        homePageActions.PurchaseOrder1();
    }
    @Test (priority = 11,testName = "TC_CO_09", description = "TTo validate the functionality of  Purchase Order")
    public void Validate_PurchaseOrder_PaymentMethod_Checkbox() throws InterruptedException {
        homePageActions.PurchaseOrderNumber1();


    }
//    @Test (priority = 12,testName = "TC_CO_13", description = "To validate the functionality of check box of 'My billing and shipping address are the same' from Payment method")
//    public void Validate_PurchaseOrder_PaymentMethod_Blank_data() throws InterruptedException {
//        homePageActions.New_address_From_Payment_blank_data();
//
//
//    }
//    @Test (priority = 13,testName = "TC_CO_13", description = "To validate the functionality of check box of 'My billing and shipping address are the same' from Payment method")
//    public void Validate_PurchaseOrder_Invalid_data() throws InterruptedException {
//        homePageActions.New_address_From_Payment_Invalid_data();
//
//
//    }
//    @Test (priority = 14,testName = "TC_CO_13", description = "To validate the functionality of check box of 'My billing and shipping address are the same' from Payment method")
//    public void Validate_PurchaseOrder_For_valid_data() throws InterruptedException {
//        homePageActions.New_address_From_Payment_valid_data();
//
//
//    }
    @Test (priority = 16,testName = "TC_CO_09", description = "To validate the functionality of  Purchase Order")
    public void Validate_Place_Order() throws InterruptedException {
          homePageActions.PlaceOrder();


    }
    @Test (priority = 15,testName = "TC_CO_13", description = "To validate the functionality of 'Apply Promo Code'")
    public void Validate_Apply_promo_code() throws InterruptedException {
        homePageActions.Apply_promo_code();


    }

    @Test (priority = 18,testName = "TC_CO_15", description = "It should redirect to homepage")
    public void Validate_PurchaseOrder_Continue_shipping() throws InterruptedException {
        homePageActions.Continue_shipping();


    }




}
