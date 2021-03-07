package com.Marvel.tests.web.Servicer;

import com.Marvel.core.BaseConfiguration;
import com.Marvel.page.actions.web.LoginPage;
import com.Marvel.page.actions.web.MyAccountPage;
import com.Marvel.page.actions.web.Servicer.My_order_page;
import com.Marvel.page.validators.web.LoginValidator;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class My_Order_Test extends BaseConfiguration {


    private static final Logger LOGGER = LoggerFactory.getLogger(My_Order_Test.class);

    private LoginPage loginACtions;
    private My_order_page homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;


    @BeforeClass
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        loginACtions = new LoginPage(driver);
        homePageActions = new My_order_page(driver);
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
    @Test(priority = 1, testName = "TC_Myorders-01", description = "To validate the functionality of 'My Orders'")
    public void My_Orders() throws InterruptedException {
        homePageActions.My_Orders();


    }
    @Test(priority = 2, testName = "TC_Myorders-02", description = "To validate the functionality 'show' dropdown of my orders table length")
    public void Show_dropdown() throws InterruptedException {
        homePageActions.show();


    }
    @Test(priority = 3, testName = "TC_Myorders-03", description = "To validate the search text box below the header section")
    public void Search_text_box() throws InterruptedException {
        homePageActions.Search_text_box();


    }
    @Test(priority = 4, testName = "TC_Myorders-04", description = "To validate the functionality of 'Search by Keyword' box is kept empty.")
    public void Search_text_box_blank() throws InterruptedException {
        homePageActions.Search_text_box_blank_data();


    }
    @Test(priority = 5, testName = "TC_Myorders-05", description = "To validate the functionality of 'Search by Keyword' when enter data in search texts are invalid.")
    public void Search_text_box_invalid() throws InterruptedException {
        homePageActions.Search_text_box_invalid_data();


    }
    @Test(priority = 6, testName = "TC_Myorders-06", description = "To validate the functionality of 'Search by Keyword' when valid data entered in Search field.")
    public void Search_text_box_valid() throws InterruptedException {
        homePageActions.Search_text_box_valid_data();


    }
    @Test(priority = 7, testName = "TC_Myorders-07", description = "To validate the functionality of my orders table")
    public void My_Orders_table() throws InterruptedException {
        homePageActions.Myorder_table();


    }
    @Test(priority = 8, testName = "TC_Myorders-08", description = "To validate the the functionality of 'Ascending and Descending'")
    public void Ascending_descending_order() throws InterruptedException {
        homePageActions.Ascending_descending_order();


    }
    @Test(priority = 9, testName = "TC_Myorders-09", description = "To validate the functionality of 'Previous' button If there is more than 1 page")
    public void Pagination_previous() throws InterruptedException {
        homePageActions.Pagination_order_previos();


    }
    @Test(priority = 10, testName = "TC_Myorders-10", description = "To validate the functionality of 'Next' button If there is more than 1 page")
    public void Pagination_next() throws InterruptedException {
        homePageActions.Pagination_order_next();


    }


}


