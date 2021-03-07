package com.Marvel.tests.web.Retailer;

import com.Marvel.core.BaseConfiguration;
import com.Marvel.page.actions.web.LoginPage;
import com.Marvel.page.actions.web.MyAccountPage;
import com.Marvel.page.actions.web.Retailer.PDP_Page;
import com.Marvel.page.validators.web.LoginValidator;
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
    @Test(priority = 0, testName = "TC_PD_01", description = "To verify the Product image is dispalying clear and distinct\n")
    public void Validate_Product_detail_Page() throws InterruptedException {
        homePageActions.PDP_page();
    }



    @Test(priority = 2, testName = "TC_PD_03", description = "To validate the functionality of 'DOOR SWING' and 'DOOR STYLE' dropdown")
    public void Validate_Door_swing_dropdown() throws InterruptedException {
        homePageActions.Door_swing_drop_down();
    }

    @Test(priority = 3, testName = "TC_PD_03", description = "To validate the functionality of 'DOOR SWING' and 'DOOR STYLE' dropdown")
    public void Validate_Find_dealer_tab() throws InterruptedException {
        homePageActions.Door_style();
    }
    @Test(priority = 1, testName = "TC_PD_02\n", description = "To validate the product image slider functionality")
    public void Validate_slider() throws InterruptedException {
        homePageActions.slider();
    }

    @Test(priority = 5, testName = "TC_PD_11\n", description = "To validate the functionality of Specifications tab product")
    public void Validate_Description() throws InterruptedException {
        homePageActions.Specifications();
    }

    @Test(priority = 4, testName = "TC_PD_10\n", description = "To validate the functionality of 'Features'tab product")
    public void Validate_Key_feature() throws InterruptedException {
        homePageActions.Key_features();
    }

    @Test(priority = 6, testName = "TC_PD_12\n", description = "To validate the functionality of 'Downloads' tab product")
    public void Validate_Downloads() throws InterruptedException {
        homePageActions.Downloads();
    }
    @Test(priority = 7, testName = "TC_PD_04", description = "To validate the functionality of 'Request a Quote' button")
    public void Validate_RAQ() throws InterruptedException {
        homePageActions.RAQ();
    }

    @Test(priority = 8, testName = "TC_PD_05\n", description = "To validate the functionality of 'Request a Quote' button for blank data")
    public void Validate_raqblank() throws InterruptedException {
        homePageActions.RAQ_blank();
    }
    @Test(priority = 9, testName = "TC_PD_06\n", description = "To validate the functionality of 'Request a Quote' button for invalid data")
    public void Validate_RAQ_invalid() throws InterruptedException {
        homePageActions.RAQ_invalid();
    }
    @Test(priority = 10, testName = "TC_PD_07\n", description = "To validate the functionality of 'Request a Quote' button for valid data")
    public void Validate_RAQ_valid() throws InterruptedException {
        homePageActions.RAQ_valid();
    }
    @Test(priority = 11, testName = "TC_PD_08\n", description = "To validate the functionality of 'Email' button\n")
    public void Validate_Email() throws InterruptedException {
        homePageActions.Email();
    }
    @Test(priority = 12, testName = "TC_PD_09\n", description = "To validate the functionality of 'Email' button for valid data\n")
    public void Validate_Email_valid() throws InterruptedException {
        homePageActions.Email_valid();
        homePageActions.PDP_page();
    }
    @Test(priority = 13, testName = "TC_PD_15", description = "To validate 'Related product' section \n")
    public void Validate_relatedproducts() throws InterruptedException {
        homePageActions.Related_product();
    }
}
