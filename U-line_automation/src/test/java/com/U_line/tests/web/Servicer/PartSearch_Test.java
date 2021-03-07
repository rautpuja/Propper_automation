package com.U_line.tests.web.Servicer;

import com.U_line.core.BaseConfiguration;
import com.U_line.page.actions.web.LoginPage;
import com.U_line.page.actions.web.MyAccountPage;
import com.U_line.page.actions.web.Servicer.PartSearch_Page;
import com.U_line.page.actions.web.Servicer.Servicer_Homepage_Page;
import com.U_line.page.validators.web.LoginValidator;
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

    @Test(priority = 0, testName = "TC_partsearch_09", description = "To validate the functionality of 'Parts Search' ")
    public void Validate_providerlogin() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(3000);
        homePageActions.providerlogin();
        homePageActions.setemail(username);

        homePageActions.setPassword(password);

        Thread.sleep(3000);
        homePageActions.clickSubmit();
        System.out.println("Provider login successfull");
    }

    @Test(priority = 1, testName = "TC_partsearch_11", description = "To validate the 'search by' blank Model Number/Serial Number/Part Number from the parts Search  banner with empty field")
    public void Blank_Search() throws InterruptedException {
        homePageActions.Search();
    }


    @Test(priority = 2, testName = "TC_partsearch_14", description = "To validate the 'search by' invalid Model Number/Serial Number/Part Number from the parts Search  banner")
    public void Wrong_ModelNumber() throws InterruptedException {
        Thread.sleep(3000);
        homePageActions.Part_search_SerialNumber();
        homePageActions.Wrong_SerialNumber();
        homePageActions.Search();
    }

    @Test(priority = 3, testName = "TC_partsearch_10", description = "To validate the 'search by' from the 'Parts Search' banner")
    public void Validate_Searial_Number() throws InterruptedException {
        homePageActions.Part_search_SerialNumber();
    }

    @Test(priority = 4, testName = "TC_partsearch_12", description = "To validate the 'search by' result from the 'Parts Search' banner")
    public void Validate_Searial_Number_For_Autoresult() throws InterruptedException {
        homePageActions.SerialNumber();
    }

    @Test(priority = 5, testName = "TC_partsearch_13", description = "To validate the 'search by' Model Number/Serial Number/Part Number from the parts Search  banner")
    public void Validate_SearchResult() throws InterruptedException {
        homePageActions.Search();

   }

    @Test(priority = 6, testName = "TC_Product Search_18", description = "To validate 'Add to cart' button below the parts Search  banner")
    public void Validate_add_to_cart() throws InterruptedException {
        homePageActions.addtocart();

    }

    @Test(priority = 7, testName = "TC_partsearch_20", description = "To validate  the functionality 'Continue Shopping' button")
    public void Validate_Continue_shopping() throws InterruptedException {
        homePageActions.ContinueShopping();
    }

    @Test(priority = 9, testName = "TC_Product Search_19", description = "To validate the functionality 'View Cart' button ")
    public void Validate_view_Cart() throws InterruptedException {

        homePageActions.addtocart();
        homePageActions.viewcart();
        Thread.sleep(9000);
        driver.navigate().back();
        Thread.sleep(50000);
        homePageActions.SerialNumber();

    }

    @Test(priority = 4, testName = "TC_Product Search_21", description = "To validate  the functionality 'Cross' (remove) button on the popup")
    public void Validate_Cross_icon() throws InterruptedException {
       // homePageActions.Crossicon();

    }
    @Test(priority = 11, testName = "TC_Product Search_22", description = "To validate download section ")
    public void Validate_Download () throws InterruptedException {
        Thread.sleep(30000);
        homePageActions.Download();

    }
//
    @Test(priority = 10, testName = "TC_Product Search_23", description = "To validate search text box ")
    public void Validate_SearchResultBox () throws InterruptedException {
        Thread.sleep(50000);
        homePageActions.SearchBox();

    }

}


