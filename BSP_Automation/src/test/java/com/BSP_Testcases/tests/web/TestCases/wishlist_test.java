package com.BSP_Testcases.tests.web.TestCases;

import com.BSP_Testcases.core.BaseConfiguration;
import com.BSP_Testcases.page.actions.web.LoginPage;
import com.BSP_Testcases.page.actions.web.MyAccountPage;
import com.BSP_Testcases.page.actions.web.TestCases.wishlist_page;
import com.BSP_Testcases.page.validators.web.LoginValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class wishlist_test extends BaseConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(wishlist_page.class);

    private LoginPage loginACtions;
    private wishlist_page homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;

    @BeforeMethod
    @BeforeClass
    public void setUp() {
        loginACtions = new LoginPage(driver);
        homePageActions = new wishlist_page(driver);
        myAccountPage = new MyAccountPage(driver);
        loginValidator = new LoginValidator();

    }

    @Test (priority = 0,testName = "TC_WishList_01", description = "Click on subscribe pop -up")
    public void Validate_Wishlist() throws InterruptedException {
       homePageActions.PDP_page();
       homePageActions.Add_to_wishlist_button();

        homePageActions.Wishlist();

    }
    @Test (priority = 1,testName = "TC_WishList_02", description = "To verify product image navigation")
    public void Validate_product_image_navigation() throws InterruptedException {
        homePageActions.product_name();

    }
    @Test (priority = 2,testName = "TC_WishList_03", description = "To verify select item checkbox")
    public void Validate_checkbox() throws InterruptedException {
        homePageActions.Checkbox();


    }
    @Test (priority = 3,testName = "TC_WishList_04", description = "To validate the functionality of 'Share Wishlist' button")
    public void Validate_share_wishlist_section() throws InterruptedException {
        homePageActions.share_wishlist_button();


    }
    @Test (priority = 4,testName = "TC_WishList_05", description = "To validate the functionality of 'Share Wishlist' popup for empty data")
    public void Validate_share_wishlist_section_for_empty_data() throws InterruptedException {
        homePageActions.share_wishlist_popup_for_empty_data();


    }
    @Test (priority = 5,testName = "TC_WishList_06", description = "To validate the functionality of 'Share Wishlist' popup for invalid data")
    public void Validate_Wishlist_section_for_invalid_data() throws InterruptedException {
//            homePageActions.Checkbox();
          homePageActions.share_wishlist_popup_for_invalid_data();


    }
    @Test (priority = 6,testName = "TC_WishList_07", description = "To validate the functionality of 'Share Wishlist' popup for valid data")
    public void Validate_Wishlist_section_for_valid_data() throws InterruptedException {
        homePageActions.share_wishlist_popup_for_valid_data();


    }
    @Test (priority = 7,testName = "TC_WishList_09", description = "To validate the functionality of 'Order Selected Item' button")
    public void Validate_order_selected_section() throws InterruptedException {
        homePageActions.Checkbox();
        homePageActions.order_selected_item();


    }
    @Test (priority = 8,testName = "TC_WishList_08", description = "To validate the functionality of 'Remove Selected Items' button")
    public void Validate_remove_section() throws InterruptedException {
        homePageActions.Remove_selected_item();


    }

    @Test (priority = 9,testName = "TC_WishList_10", description = "To verify wishlist section if no products present")
    public void Validate_wishlist_section_if_no_product_present() throws InterruptedException {
        homePageActions.No_item_present();


    }
}
