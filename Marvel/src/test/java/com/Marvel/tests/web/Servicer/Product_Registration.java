package com.Marvel.tests.web.Servicer;

import com.Marvel.core.BaseConfiguration;
import com.Marvel.page.actions.web.LoginPage;
import com.Marvel.page.actions.web.MyAccountPage;
import com.Marvel.page.actions.web.Servicer.Product_Registration_page;
import com.Marvel.page.validators.web.LoginValidator;
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

    @Test(priority = 2, testName = "TC_PR_03", description = "To validate the functionality of serial number from serial# with blank field ")
    public void serial_number_blank() throws InterruptedException {
        homePageActions.Serial_number_blank();
    }

    @Test(priority = 3, testName = "TC_PR_04", description = "To validate the functionality of serial number from product info with invalid serial number ")
    public void serial_number_invalid() throws InterruptedException {
        homePageActions.Serial_number_Invalid();
    }

    @Test(priority = 4, testName = "TC_PR_05", description = "To validate the functionality of serial number from product info with valid serial number ")
    public void Serial_number_valid() throws InterruptedException {
        homePageActions.Serial_number_valid();
    }


    @Test(priority = 5, testName = "TC_PR_07", description = "To validate the functionality of Your Information with blank field ")
    public void Your_information_blank() throws InterruptedException {
        homePageActions.Your_information_blank();
    }

    @Test(priority = 6, testName = "TC_PR_08", description = "To validate the functionality of Your Information with Invalid data")
    public void Your_information_invalid() throws InterruptedException {
        homePageActions.Your_information_Invalid();



}
    @Test(priority = 8, testName = "TC_PR_09", description = "To validate the functionality of Your Information with valid data")
    public void Your_information_valid() throws InterruptedException {
        homePageActions.Your_information_valid();

    }

    @Test(priority = 10, testName = "TC_PR_10", description = "To validate the functionality of check box from Proof of Purchase")
    public void Proof_of_purchase() throws InterruptedException {
        homePageActions.Proof_of_purchase_with_checkbox();

    }

    @Test(priority = 11, testName = "TC_PR_11", description = "To validate the functionality of attachment")
    public void Proof_of_purchase_with_upload() throws InterruptedException {
        homePageActions.Proof_of_purchase_with_upload();

    }

    @Test(priority = 9, testName = "TC_PR_12", description = "To validate the functionality of Proof of Purchase with blank field")
    public void Proof_of_purchase_blank() throws InterruptedException {
        homePageActions.Proof_of_purchase_with_blank_data();

    }
    @Test(priority = 13, testName = "TC_PR_13", description = "To validate the functionality of Proof of Purchase with invalid data")
    public void Proof_of_purchase_Invalid() throws InterruptedException {
        homePageActions.Proof_of_purchase_with_invalid_data();

    }
    @Test(priority = 14, testName = "TC_PR_14", description = "To validate the functionality of Proof of Purchase with valid data")
    public void Proof_of_purchase_valid() throws InterruptedException {
     //   homePageActions.Proof_of_purchase_with_valid_data();

    }

    @Test(priority = 15, testName = "TC_PR_16", description = "To validate the navigation of 'Marvel' logo.")
    public void U_line_logo() throws InterruptedException {
        homePageActions.Marvel_logo();

    }
}
