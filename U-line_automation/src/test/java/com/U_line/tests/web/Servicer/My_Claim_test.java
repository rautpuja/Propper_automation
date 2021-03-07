package com.U_line.tests.web.Servicer;

import com.U_line.core.BaseConfiguration;
import com.U_line.page.actions.web.LoginPage;
import com.U_line.page.actions.web.MyAccountPage;
import com.U_line.page.actions.web.Servicer.My_Claim_Page;
import com.U_line.page.actions.web.Servicer.My_saved_item_page;
import com.U_line.page.validators.web.LoginValidator;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class My_Claim_test extends BaseConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(My_Claim_test.class);

    private LoginPage loginACtions;
    private My_Claim_Page homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;


    @BeforeClass
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        loginACtions = new LoginPage(driver);
        homePageActions = new My_Claim_Page(driver);
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
    @Test(priority = 1, testName = "TC_Myclaims_01", description = "To validate the functionality of 'My Orders'")
    public void My_Claims() throws InterruptedException {
        homePageActions.My_Claims();

    }

    @Test(priority = 2, testName = "TC_Myclaims_08", description = "To validate the functionality of 'My Orders'")
    public void Invoice() throws InterruptedException {
//        homePageActions.My_Claims();


        homePageActions.Invoice();
          homePageActions.Invoice_pop_up();
    }
    @Test(priority = 5, testName = "TC_Myclaims_04", description = "To validate the functionality of 'My Orders'")
    public void Search() throws InterruptedException {
        homePageActions.Search();

    }
    @Test(priority = 3, testName = "TC_Myclaims_02", description = "To validate the functionality of 'My Orders'")
    public void Search_blank() throws InterruptedException {
        homePageActions.Search_blank();

    }
    @Test(priority = 4, testName = "TC_Myclaims_03", description = "To validate the functionality of 'My Orders'")
    public void Search_invalid() throws InterruptedException {
        homePageActions.Search_invalid();

    }

    @Test(priority = 6, testName = "TC_Myclaims_09", description = "To validate the the functionality of 'Ascending and Descending'")
    public void assending_descendint() throws InterruptedException {
        homePageActions.Ascending();

    }
    @Test(priority = 8, testName = "TC_Myclaims_10", description = "To validate the functionality of 'Previous' button If there is more than 1 page")
    public void Previous_button() throws InterruptedException {
        homePageActions.Previous_button();

    }
    @Test(priority = 7, testName = "TC_Myclaims_11", description = "To validate the functionality of 'Next' button If there is more than 1 page")
    public void Next_button() throws InterruptedException {
        homePageActions.Next_button();

    }
    @Test(priority = 9, testName = "TC_Myclaims_12", description = "To validate the functionality of Filter")
    public void Filter() throws InterruptedException {
        homePageActions.Filter();

    }


}

