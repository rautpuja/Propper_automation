package com.U_line.tests.web.Retailer;

import com.U_line.core.BaseConfiguration;
import com.U_line.page.actions.web.LoginPage;
import com.U_line.page.actions.web.MyAccountPage;

import com.U_line.page.actions.web.Retailer.Parts_and_accessories_page;
import com.U_line.page.validators.web.LoginValidator;
import com.U_line.utils.common.Config;
import com.U_line.utils.selenium.WebUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Parts_and_accessories_test extends BaseConfiguration {
    private static final Logger LOGGER = LoggerFactory.getLogger(Parts_and_accessories_page.class);
    private static final String APPLICATION_URL = Config.getProperty("appURL");

    private LoginPage loginACtions;
    private Parts_and_accessories_page homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;


    @BeforeClass
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        loginACtions = new LoginPage(driver);
        homePageActions = new Parts_and_accessories_page(driver);
        myAccountPage = new MyAccountPage(driver);
        loginValidator = new LoginValidator();

    }
    @Test(priority = 0, testName = "TC_Part&Accessories_01", description = "To validate the part & accessories page")
    public void Validate_Parts_and_accessories_page() throws InterruptedException {
        homePageActions.Parts_and_accessories();
    }
    @Test(priority = 1, testName = "TC_Part&Accessories_09", description = "To validate 'Click here' in the Shipping Details section below the part & accessories banner")
    public void Validate_Click_link1() throws InterruptedException {
        homePageActions.Part_search_click_link1();

    }


    @Test(priority = 3, testName = "TC_Part&Accessories_05", description = "To validate the 'search by' invalid Model Number/Serial Number/Part Number from the parts Search  banner")
    public void Wrong_serialNumber() throws InterruptedException {
        Thread.sleep(70000);

        homePageActions.Wrong_SerialNumber();
        homePageActions.Search();
    }

    @Test(priority = 4, testName = "TC_Part&Accessories_03", description = "To validate the 'search by' from the 'Parts Search' banner")
    public void Validate_Searial_Number() throws InterruptedException {
        homePageActions.Part_search_SerialNumber();
    }

    @Test(priority = 5, testName = "TC_Part&Accessories_01", description = "To validate the 'search by' result from the 'Parts Search' banner")
    public void Validate_Searial_Number_For_Autoresult() throws InterruptedException {
        homePageActions.SerialNumber();
    }

    @Test(priority = 6, testName = "TC_Part&Accessories_01", description = "To validate the 'search by' Model Number/Serial Number/Part Number from the parts Search  banner")
    public void Validate_SearchResult() throws InterruptedException {
        homePageActions.Search();

    }

    @Test(priority = 7, testName = "TC_Part&Accessories_13", description = "To validate 'Add to cart' button below the part & accessories banner")
    public void Validate_add_to_cart() throws InterruptedException {
        homePageActions.addtocart();

    }

    @Test(priority = 8, testName = "TC_Part&Accessories_15", description = "To validate  the functionality 'Continue Shopping' button")
    public void Validate_Continue_shopping() throws InterruptedException {
        homePageActions.ContinueShopping();
    }

    @Test(priority = 9, testName = "TC_Part&Accessories_14", description = "To validate the functionality 'View Cart' button  ")
    public void Validate_view_Cart() throws InterruptedException {
Thread.sleep(50000);
         homePageActions.addtocart();
         homePageActions.viewcart();
        Thread.sleep(10000);
        WebUtils.navigateToURL(APPLICATION_URL+"/parts-accessories");
        Thread.sleep(50000);


    }


    @Test(priority = 10, testName = "TC_Part&Accessories_16", description = "To validate search text box ")
    public void Validate_SearchResultBox () throws InterruptedException {
        Thread.sleep(10000);
        WebElement ele= driver.findElement(By.xpath("//input[@id='serial']"));
        ele.sendKeys("U-1215BEVINT-00A");
        ele.sendKeys(Keys.ENTER);

        homePageActions.SearchBox();

    }

}
