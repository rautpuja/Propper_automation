package com.U_line.tests.web.Servicer;

import com.U_line.core.BaseConfiguration;
import com.U_line.page.actions.web.LoginPage;
import com.U_line.page.actions.web.MyAccountPage;
import com.U_line.page.actions.web.Servicer.Servicer_Homepage_Page;
import com.U_line.page.actions.web.Servicer.Shipping_Page;
import com.U_line.page.validators.web.LoginValidator;
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
    @Test(priority = 0, testName = "TC_Product Search_01", description = "Provider login")
    public void Validate_providerlogin() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        homePageActions.providerlogin();
        homePageActions.setemail(username);

        homePageActions.setPassword(password);


        homePageActions.clickSubmit();
        System.out.println("Provider login successfull");}
    @Test(priority = 1, testName = "TC_SC_01", description = "To verify whether the 'Product Image' is clear and distinct cart page..")
    public void Validate_Shipping_Page() throws InterruptedException {
        homePageActions.Shipping_Page();

    }

    @Test(priority = 2, testName = "TC_SC_03", description = "To validate functionality of the 'Product Name' / 'Product image' link.")
    public void Validate_Product_image_link() throws InterruptedException {
        homePageActions.Product_image_link();

    }



    @Test(priority = 3, testName = "TC_SC_04", description = "To verify the functionality of the 'SKU'")
    public void Validate_Sku() throws InterruptedException {
        homePageActions.Sku_number();

    }

    @Test(priority = 4, testName = "TC_SC_05", description = "\"1. To verify the products 'Quantity' display.\n" +
            "2.To validate the functionality of Quantity box.and serial number box\n" +
            "3.To validate the functionality of 'Serial Number' for qty one with serial number\"")
    public void Qty_1() throws InterruptedException {
        homePageActions.Qty_box();
        homePageActions.Update_cart_link();
        homePageActions.Serial_number_1();

    }

    @Test(priority = 5, testName = "TC_SC_06", description = "To validate the functionality of 'Update cart' link below quantity box")
    public void Validate_Update_cart_link() throws InterruptedException {
        homePageActions.Update_cart_link();

    }

    @Test(priority = 6, testName = "TC_SC_08", description = "To validate the functionality of 'Serial Number' for qty three")
    public void Validate_Serial_number_for_3() throws InterruptedException {
        homePageActions.Serial_number3();

    }


    @Test(priority = 8, testName = "TC_SC_07", description = "It should be display 'product_name has been moved to your wish list.'Message")
    public void Validate_Save_for_later() throws InterruptedException {
        homePageActions.Save_for_later();

    }



    @Test(priority = 10, testName = "TC_SC_12", description = "To validate the functionality of the Upadte Cart button.")
    public void Validate_Update_cart_button() throws InterruptedException {
        homePageActions.Update_cart_button();

    }
    @Test(priority = 12, testName = "TC_SC_09", description = "To validate the functionality of 'cross' button in the serial number box")
    public void Validate_cross_button_in_serialNumber() throws InterruptedException {
        homePageActions.Cross_icon();

    }

    @Test(priority = 11, testName = "TC_SC_11", description = "To validate functionality of checkout button")
    public void Validate_Checkout_button() throws InterruptedException {
        homePageActions.Checkout_button();

    }


    }

