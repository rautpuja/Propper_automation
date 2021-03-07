package com.U_line.tests.web.Retailer;

import com.U_line.core.BaseConfiguration;
import com.U_line.page.actions.web.Guesthome;
import com.U_line.page.actions.web.LoginPage;
import com.U_line.page.actions.web.MyAccountPage;
import com.U_line.page.actions.web.Retailer.Shipping_retailer_page;
import com.U_line.page.validators.web.LoginValidator;
import com.U_line.tests.web.Guestuser;
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

    @Test(priority = 0,testName = "TC_01", description = "Search part and accessories")
    public void Validate_PartandAccessories() throws InterruptedException {
        homePageActions.openpartsandaccessories();
        homePageActions.modelnumber();
        homePageActions.search();
    }
    @Test (priority = 1,testName = "TC_02", description = "add product into cart")
    public void Validate_add_product_intocart() throws InterruptedException {

        homePageActions.addtocart();
    }
    @Test (priority = 2,testName = "TC_03", description = "View Cart")
    public void Validate_view_cart() throws InterruptedException {

        homePageActions.viewcart();
    }



    @Test(priority = 3, testName = "TC_SC_03", description = "To validate functionality of the 'Product Name' / 'Product image' link.")
    public void Validate_Product_image_link() throws InterruptedException {
        homePageActions.Product_image_link();

    }

    @Test(priority = 5, testName = "TC_SC_01", description = "To verify whether the 'Product Image' is clear and distinct cart page..")
    public void Validate_Shipping_Page() throws InterruptedException {
        homePageActions.Qty_box();

    }

    @Test(priority = 4, testName = "TC_SC_04", description = "To verify the functionality of the 'SKU'")
    public void Validate_Sku() throws InterruptedException {
        homePageActions.Sku_number();

    }



    @Test(priority = 6, testName = "TC_SC_06", description = "To validate the functionality of 'Update cart' link below quantity box")
    public void Validate_Update_cart_link() throws InterruptedException {
        homePageActions.Update_cart_link();

    }




    @Test(priority = 8, testName = "TC_SC_02", description = "Application should remove specific product from cart.")
    public void Validate_Remove_icon() throws InterruptedException {
        homePageActions.Cross_button();

    }

    @Test(priority = 7, testName = "TC_SC_12", description = "To validate the functionality of the Upadte Cart button.")
    public void Validate_Update_cart_button() throws InterruptedException {
        homePageActions.Update_cart_button();

    }

    @Test(priority = 9, testName = "TC_SC_11", description = "To validate functionality of checkout button")
    public void Validate_Checkout_button() throws InterruptedException {
        homePageActions.Checkout_button();

    }


}
