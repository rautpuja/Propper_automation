package com.Marvel.tests.web.Retailer;

import com.Marvel.core.BaseConfiguration;
import com.Marvel.page.actions.web.LoginPage;
import com.Marvel.page.actions.web.MyAccountPage;
import com.Marvel.page.actions.web.Retailer.Checkout_retailer_page;
import com.Marvel.page.validators.web.LoginValidator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
    @Test (priority = 0,testName = "", description = "Search part and accessories")
    public void Validate_PartandAccessories() throws InterruptedException {

        homePageActions.Parts_and_accessories();
        homePageActions.viewcart();
    }



    @Test (priority = 1,testName = "TC_CO_01", description = "To validate the functionality of \"Go To Checkout\" button for checkout as guest.\n")
    public void Validate_go_to_checkout() throws InterruptedException {
        homePageActions.checkout();

    }
    @Test (priority = 2,testName = "TC_CO_05", description = "To validate the functionality of checkout form with blank field\n")
    public void Validate_shipping_Info_for_blank_address() throws InterruptedException {
homePageActions.Signin_info_for_blank_address();
    }


    @Test (priority = 5,testName = "TC_CO_04", description = "To validate the functionality of checkout when invalid data is entered in mandatory fields.\n")
    public void Validate_shipping_Info_for_invalid_detail() throws InterruptedException {
        homePageActions.Signin_info_for_Invalid_email_address();
    }

    @Test (priority = 6,testName = "TC_CO_03", description = "To validate the functionality of checkout form for checkout as guest.\n")
    public void Validate_shipping_Info_for_valid_address() throws InterruptedException {
        homePageActions.valid_address();
    }

    @Test(priority = 16, testName = "TC_CO_06", description = "To validate the functionality of 'Login' link \n")
    public void Validate_login() throws InterruptedException {
        Thread.sleep(10000);
        WebElement ele= driver.findElement(By.xpath("//button[@class='action action-auth-toggle']"));
        Actions actions = new Actions(driver);

        actions.doubleClick(ele).perform();
        Thread.sleep(10000);

    }
    @Test(priority = 9, testName = "TC_CO_07", description = "To check the Order summary section for the checkout section.\n")
    public void Validate_ordersummary() throws InterruptedException {
      homePageActions.Order_summery();

    }
    @Test(priority = 7, testName = "TC_CO_10\n", description = "To validate the functionality of 'Shipping Method' section with right hand side edit button")
    public void Validate_Ship_here() throws InterruptedException {
        homePageActions.Shiphere_icon1();

    }
    @Test(priority = 8, testName = "TC_CO_11", description = "To validate the functionality of 'Shipping Method' section with right hand side edit button")
    public void Validate_Shiphere_for_shipping_address() throws InterruptedException {
        homePageActions.Shiphere_icon2();

    }

    @Test (priority = 11,testName = "TC_CO_08", description = "To validate the functionality of payment method\n")
    public void Validate_PurchaseOrder_PaymentMethod() throws InterruptedException {
        homePageActions.PurchaseOrder1();
    }

    @Test (priority = 13,testName = "TC_CO_14", description = "To validate the functionality of edit address form from Review & Payments with blank fields\n")
    public void Validate_PurchaseOrder_PaymentMethod_Blank_data() throws InterruptedException {
        homePageActions.New_address_From_Payment();
        homePageActions.New_address_From_Payment_blank_data();


    }
    @Test (priority = 14,testName = "TC_CO_15", description = "To validate the functionality of edit address form from Review & Payments with invalid data\n")
    public void Validate_PurchaseOrder_Invalid_data() throws InterruptedException {
        homePageActions.New_address_From_Payment_Invalid_data();


    }
    @Test (priority = 15,testName = "TC_CO_16", description = "To validate the functionality of edit address form from Review & Payments with valid data\n")
    public void Validate_PurchaseOrder_For_valid_data() throws InterruptedException {
        homePageActions.New_address_From_Payment_valid_data();


    }
    @Test (priority = 18,testName = "TC_CO_17", description = "To validate the functionality of 'Do you have any comments regarding the order?' from Payment method\n")
    public void Validate_Place_Order() throws InterruptedException {
        homePageActions.Creadit_card_number();
          homePageActions.Place_order();


    }
    @Test (priority = 12,testName = "TC_CO_13", description = "To validate the functionality of 'Apply Promo Code'")
    public void Validate_Apply_promo_code() throws InterruptedException {
        homePageActions.Apply_promo_code();


    }

    @Test (priority = 19,testName = "TC_CO_18", description = "It should redirect to homepage")
    public void Validate_PurchaseOrder_Continue_shipping() throws InterruptedException {
        homePageActions.Continue_shipping();


    }




}
