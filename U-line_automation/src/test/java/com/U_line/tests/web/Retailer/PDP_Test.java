package com.U_line.tests.web.Retailer;

import com.U_line.core.BaseConfiguration;
import com.U_line.page.actions.web.LoginPage;
import com.U_line.page.actions.web.MyAccountPage;
import com.U_line.page.actions.web.Retailer.PDP_Page;
import com.U_line.page.actions.web.Retailer.Product_listing_page;
import com.U_line.page.validators.web.LoginValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PDP_Test extends BaseConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(PDP_Test.class);

    private LoginPage loginACtions;
    private PDP_Page homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;


    @BeforeClass
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        loginACtions = new LoginPage(driver);
        homePageActions = new PDP_Page(driver);
        myAccountPage = new MyAccountPage(driver);
        loginValidator = new LoginValidator();

    }
    @Test(priority = 0, testName = "TC_CP_01", description = "To validate whether the 'Product name/Image' is clear and distinct.")
    public void Validate_Product_detail_Page() throws InterruptedException {
        homePageActions.PDP_page();
    }

    @Test(priority = 1, testName = "TC_CP_02", description = "To validate whether the 'Product name/Image' is clear and distinct.")
    public void Validate_finish_button() throws InterruptedException {
        homePageActions.Finish_tab();
    }

    @Test(priority = 2, testName = "TC_CP_03", description = "To validate whether the 'Product name/Image' is clear and distinct.")
    public void Validate_Door_swing_dropdown() throws InterruptedException {
        homePageActions.Door_swing_drop_down();
    }

    @Test(priority = 3, testName = "TC_CP_04", description = "To validate whether the 'Product name/Image' is clear and distinct.")
    public void Validate_Find_dealer_tab() throws InterruptedException {
        homePageActions.Find_a_dealer();
    }

    @Test(priority = 4, testName = "TC_CP_05", description = "To validate whether the 'Product name/Image' is clear and distinct.")
    public void Validate_Description() throws InterruptedException {
        homePageActions.Discription();
    }

    @Test(priority = 5, testName = "TC_CP_06", description = "To validate whether the 'Product name/Image' is clear and distinct.")
    public void Validate_Key_feature() throws InterruptedException {
        homePageActions.Key_features();
    }

    @Test(priority = 6, testName = "TC_CP_07", description = "To validate whether the 'Product name/Image' is clear and distinct.")
    public void Validate_Details() throws InterruptedException {
        homePageActions.Details();
    }
    @Test(priority = 7, testName = "TC_CP_08", description = "To validate whether the 'Product name/Image' is clear and distinct.")
    public void Validate_model_summary() throws InterruptedException {
        homePageActions.Model_summary();
    }

    @Test(priority = 8, testName = "TC_CP_09", description = "To validate whether the 'Product name/Image' is clear and distinct.")
    public void Validate_Downloads() throws InterruptedException {
        homePageActions.Downloads();
    }
    @Test(priority = 9, testName = "TC_CP_10", description = "To validate whether the 'Product name/Image' is clear and distinct.")
    public void Validate_Accessories() throws InterruptedException {
        homePageActions.Assesories();
    }
    @Test(priority = 10, testName = "TC_CP_11", description = "To validate whether the 'Product name/Image' is clear and distinct.")
    public void Validate_Add_to_cart() throws InterruptedException {
        homePageActions.Add_to_cart();
    }
}
