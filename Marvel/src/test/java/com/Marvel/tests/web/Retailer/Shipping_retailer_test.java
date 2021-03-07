package com.Marvel.tests.web.Retailer;

import com.Marvel.core.BaseConfiguration;
import com.Marvel.page.actions.web.LoginPage;
import com.Marvel.page.actions.web.MyAccountPage;
import com.Marvel.page.actions.web.Retailer.Shipping_retailer_page;
import com.Marvel.page.validators.web.LoginValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Shipping_retailer_test extends BaseConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(Shipping_retailer_page.class);

    private LoginPage loginACtions;
    private Shipping_retailer_page homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;

    @BeforeMethod
    @BeforeClass
    public void setUp() {
        loginACtions = new LoginPage(driver);
        homePageActions = new Shipping_retailer_page(driver);
        myAccountPage = new MyAccountPage(driver);
        loginValidator = new LoginValidator();

    }

    @Test(priority = 0,testName = "TC_SC_01\n", description = "Application should display Product image clear & distinct.\n")
    public void Validate_PartandAccessories() throws InterruptedException {
        homePageActions.Parts_and_accessories();
        homePageActions.viewcart();
    }





    @Test(priority = 1, testName = "TC_SC_04", description = "To validate functionality of the 'Product Name' / 'Product image' link.")
    public void Validate_Product_image_link() throws InterruptedException {
        homePageActions.Product_image_link();

    }

    @Test(priority = 2, testName = "TC_SC_07", description = "To verify whether the 'Product Image' is clear and distinct cart page..")
    public void Validate_Shipping_Page() throws InterruptedException {
        homePageActions.Qty_box();

    }

    @Test(priority = 4, testName = "TC_SC_05", description = "To verify the functionality of the 'SKU'")
    public void Validate_Sku() throws InterruptedException {
        homePageActions.Sku_number();

    }



    @Test(priority = 3, testName = "TC_SC_08", description = "To validate the functionality of 'Update cart' link below quantity box")
    public void Validate_Update_cart_link() throws InterruptedException {
        homePageActions.Update_cart_link();

    }




    @Test(priority = 12, testName = "TC_SC_02", description = "Application should remove specific product from cart.")
    public void Validate_Remove_icon() throws InterruptedException {
//        homePageActions.Cross_button();

    }

    @Test(priority = 5, testName = "TC_SC_18", description = "To validate the functionality of the Upadte Cart button.")
    public void Validate_Update_cart_button() throws InterruptedException {
        homePageActions.Update_cart_button();

    }
    @Test(priority = 9, testName = "TC_SC_13", description = "To verify the 'Estimate Shipping and Tax' dropdown.")
    public void Validate_Checkout_summary() throws InterruptedException {
        homePageActions.Summary();

    }

    @Test(priority = 11, testName = "TC_SC_17", description = "To validate functionality of checkout button")
    public void Validate_Checkout_button() throws InterruptedException {
        homePageActions.Checkout_button();

    }
    @Test (priority = 6,testName = "TC_SC_10", description = "\"To validate the functionality 'APPLY DISCOUNT CODE'\n" +
            "with blank field\"\n")
    public void Validate_ApplyDiscountblank() throws InterruptedException {

        homePageActions.Apply_discount();

    }
    @Test (priority = 7,testName = "TC_SC_11", description = "\"To validate the functionality 'APPLY DISCOUNT CODE'\n" +
            "with invalid coupon code\"\n")
    public void Validate_ApplyDiscount_invalid() throws InterruptedException {

        homePageActions.Apply_discount_invalid();

    }
    @Test (priority = 8,testName = "TC_SC_12", description = "\"To validate the functionality 'APPLY DISCOUNT CODE'\n" +
            "with valid coupon code\"\n")
    public void Validate_ApplyDiscount_valid() throws InterruptedException {

        homePageActions.Apply_discount_valid();

    }
    @Test (priority = 10,testName = "TC_SC_03", description = "STo validate the functionality of edit (pencil icon) \n")
    public void Validate_Edit_button() throws InterruptedException {

        homePageActions.Edit_button();

    }


}
