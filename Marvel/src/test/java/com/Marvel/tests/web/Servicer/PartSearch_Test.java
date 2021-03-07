package com.Marvel.tests.web.Servicer;

import com.Marvel.core.BaseConfiguration;
import com.Marvel.page.actions.web.LoginPage;
import com.Marvel.page.actions.web.MyAccountPage;
import com.Marvel.page.actions.web.Servicer.PartSearch_Page;
import com.Marvel.page.validators.web.LoginValidator;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PartSearch_Test extends BaseConfiguration {


    private static final Logger LOGGER = LoggerFactory.getLogger(Servicer_HomePage_Test.class);

    private LoginPage loginACtions;
    private PartSearch_Page homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;


    @BeforeClass
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        loginACtions = new LoginPage(driver);
        homePageActions = new PartSearch_Page(driver);
        myAccountPage = new MyAccountPage(driver);
        loginValidator = new LoginValidator();

    }

    @Test(priority = 0, testName = "Login", description = "Provider login ")
    public void Validate_providerlogin() throws InterruptedException {

        Thread.sleep(3000);
        homePageActions.providerlogin();
        homePageActions.setemail(username);

        homePageActions.setPassword(password);

        Thread.sleep(3000);
        homePageActions.clickSubmit();
        System.out.println("Provider login successfull");
    }

    @Test(priority = 1, testName = "Tc_partSearch-01", description = "To verify the 'parts search' tab")
    public void Validate_partsearchtab() throws InterruptedException {
        homePageActions.PartSearchtab();
    }


    @Test(priority = 2, testName = "Tc_partSearch-02", description = "To validate the 'click here' link below the header")
    public void Validate_Click_link_of_partsearch() throws InterruptedException {
homePageActions.Click_link();
    }

    @Test(priority = 3, testName = "Tc_partSearch-03", description = "To validate the 'click here' link below the header")
    public void Validate_ClickEffect_of_part_search() throws InterruptedException {
        homePageActions.Partsearch_models();
    }


    @Test(priority = 4, testName = "Tc_partSearch-04", description = "To validate the 'click here' link below the header")
    public void Validate_help() throws InterruptedException {
        homePageActions.Help();
    }


    @Test(priority = 5, testName = "TC_partsearch_10", description = "To validate the 'search by' from the 'Parts Search' banner")
    public void Validate_Service_model_Number_blank() throws InterruptedException {
        homePageActions.Service_model_number_blank();

    }

    @Test(priority = 6, testName = "TC_partsearch_12", description = "To validate the 'search by' result from the 'Parts Search' banner")
    public void Validate_Service_model_Number_Invalid() throws InterruptedException {
        homePageActions.Service_model_number_invalid();
    }

    @Test(priority = 7, testName = "TC_partsearch_13", description = "To validate the 'search by' Model Number/Serial Number/Part Number from the parts Search  banner")
    public void Validate_Service_model_number_valid() throws InterruptedException {
        homePageActions.Service_model_number_valid();

   }
    @Test(priority = 8, testName = "TC_partsearch_16", description = "To validate search text box")
    public void Validate_SearchTextbox() throws InterruptedException {
        homePageActions.Search_textbox();

    }

    @Test(priority = 9, testName = "TC_partsearch_18", description = "To validate 'Add to cart' button below the parts Search  banner")
    public void Validate_download_tab_for_service_model_number() throws InterruptedException {
        homePageActions.Download_tab();

    }

    @Test(priority = 10, testName = "TC_partsearch_20", description = "To validate  the functionality 'Continue Shopping' button")
    public void Validate_Download_link_for_service_model_number() throws InterruptedException {
        homePageActions.Download_link();
    }
    @Test(priority = 11, testName = "TC_partsearch_10", description = "To validate the 'search by' from the 'Parts Search' banner")
    public void Validate_serial_Number_blank() throws InterruptedException {
        homePageActions.serial_number_blank();

    }

    @Test(priority = 12, testName = "TC_partsearch_12", description = "To validate the 'search by' result from the 'Parts Search' banner")
    public void Validate_serial_Number_Invalid() throws InterruptedException {
        homePageActions.serial_number_invalid();
    }

    @Test(priority = 13, testName = "TC_partsearch_13", description = "To validate the 'search by' Model Number/Serial Number/Part Number from the parts Search  banner")
    public void Validate_serial_number_valid() throws InterruptedException {
        homePageActions.serial_number_valid();

    }

    @Test(priority = 14, testName = "TC_partsearch_18", description = "To validate 'Add to cart' button below the parts Search  banner")
    public void Validate_download_tab_for_serial_number() throws InterruptedException {
       homePageActions.Download_tab_serial_number();

   }

    @Test(priority = 15, testName = "TC_partsearch_20", description = "To validate  the functionality 'Continue Shopping' button")
    public void Validate_Download_link_for_serial_number() throws InterruptedException {
        homePageActions.Download_link_serial_number();
    }
    @Test(priority = 16, testName = "TC_partsearch_10", description = "To validate the 'search by' from the 'Parts Search' banner")
    public void Validate_PartNumber_blank() throws InterruptedException {
        homePageActions.Part_number_blank();

    }

    @Test(priority = 17, testName = "TC_partsearch_12", description = "To validate the 'search by' result from the 'Parts Search' banner")
    public void Validate_Part_Number_Invalid() throws InterruptedException {
        homePageActions.Part_number_invalid();
    }

    @Test(priority = 18, testName = "TC_partsearch_13", description = "To validate the 'search by' Model Number/Serial Number/Part Number from the parts Search  banner")
    public void Validate_Part_number_valid() throws InterruptedException {
        homePageActions.Part_number_valid();

    }

    @Test(priority = 19, testName = "TC_partsearch_18", description = "To validate 'Add to cart' button below the parts Search  banner")
    public void Validate_download_tab_for_Part_number() throws InterruptedException {
        homePageActions.Download_tab_for_part_number();

    }

    @Test(priority = 20, testName = "TC_partsearch_07", description = "To validate functionality of download link after searching product")
    public void Validate_Download_link_for_part_number() throws InterruptedException {
        homePageActions.Download_link_For_part_number();
    }
    @Test(priority = 21, testName = "TC_partsearch_13", description = "To validate 'Add to cart' button below the parts search banner")
    public void Validate_add_to_cart_button_() throws InterruptedException {
        homePageActions.add_to_cart_button();
    }
    @Test(priority = 22, testName = "TC_partsearch_15", description = "To validate  the functionality 'Continue Shopping' button")
    public void Validate_add_to_cart_button_for_continueshopping() throws InterruptedException {
        homePageActions.add_to_cart_continueshopping();
    }
    @Test(priority = 23, testName = "TC_partsearch_14", description = "To validate the functionality 'View Cart' button ")
    public void Validate_addTo_cart_button_for_view_cart() throws InterruptedException {
        homePageActions.add_to_cart_view_cart();
    }

}


