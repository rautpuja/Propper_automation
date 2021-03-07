package com.U_line.tests.web.Servicer;

import com.U_line.core.BaseConfiguration;
import com.U_line.page.actions.web.LoginPage;
import com.U_line.page.actions.web.MyAccountPage;
import com.U_line.page.actions.web.Servicer.My_saved_item_page;
import com.U_line.page.actions.web.Servicer.Product_Registration_page;
import com.U_line.page.validators.web.LoginValidator;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Product_Registration extends BaseConfiguration {


    private static final Logger LOGGER = LoggerFactory.getLogger(Servicer_HomePage_Test.class);

    private LoginPage loginACtions;
    private Product_Registration_page homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;


    @BeforeClass
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        loginACtions = new LoginPage(driver);
        homePageActions = new Product_Registration_page(driver);
        myAccountPage = new MyAccountPage(driver);
        loginValidator = new LoginValidator();

    }

    @Test(priority = 0, testName = "Login", description = "To validate the functionality of 'Parts Search' ")
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

    @Test(priority = 1, testName = "TC_PR_01", description = "To validate the functionality of 'Product Registration' ")
    public void Validate_redirect_to_product_registraion() throws InterruptedException {
        homePageActions.Product_Registration();
    }

    @Test(priority = 2, testName = "TC_PR_02", description = "To validate the functionality of serial number from product info with blank field ")
    public void serial_number_blank() throws InterruptedException {
        homePageActions.Serial_number_blank();
    }

    @Test(priority = 3, testName = "TC_PR_03", description = "To validate the functionality of serial number from product info with invalid serial number ")
    public void serial_number_invalid() throws InterruptedException {
        homePageActions.Serial_number_Invalid();
    }

    @Test(priority = 4, testName = "TC_PR_04", description = "To validate the functionality of serial number from product info with valid serial number ")
    public void Serial_number_valid() throws InterruptedException {
        homePageActions.Serial_number_valid();
    }


    @Test(priority = 5, testName = "TC_PR_06", description = "To validate the functionality of Purchase Info with blank field ")
    public void Purchase_info_blank() throws InterruptedException {
        homePageActions.Purchase_info_blank();
    }

    @Test(priority = 6, testName = "TC_PR_07", description = "To validate the functionality of Purchase Info with valid data ")
    public void Purchase_info_with_without_checkbox() throws InterruptedException {
        homePageActions.Purchase_info_valid();



}
    @Test(priority = 8, testName = "TC_PR_09", description = "To validate the functionality of attachment")
    public void Purchase_info_with_upload() throws InterruptedException {
        homePageActions.Purchase_info_valid_with_upload();

    }

    @Test(priority = 9, testName = "TC_PR_10", description = "To validate the functionality of Owner Contact Info with blank field ")
    public void Customer_info_blank() throws InterruptedException {
        homePageActions.Owner_contact_Info_Blank();

    }

    @Test(priority = 11, testName = "TC_PR_11", description = "To validate the functionality of Owner Contact Info with invalid data ")
    public void Customer_info_invalid() throws InterruptedException {
        homePageActions.Owner_contact_Info_Invalid();

    }

    @Test(priority = 12, testName = "TC_PR_06", description = "To validate the functionality of Owner Contact Info with valid data ")
    public void Customer_info_valid() throws InterruptedException {
        homePageActions.Owner_contact_Info_valid();

    }
    @Test(priority = 12, testName = "TC_PR_12", description = "To validate the navigation of 'U-line' logo.")
    public void U_line_logo() throws InterruptedException {
//        homePageActions.u_linelogo();

    }
}
