package com.Marvel.tests.web.Servicer;

import com.Marvel.core.BaseConfiguration;
import com.Marvel.page.actions.web.LoginPage;
import com.Marvel.page.actions.web.MyAccountPage;
import com.Marvel.page.actions.web.Servicer.Address_book_Page;
import com.Marvel.page.validators.web.LoginValidator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Address_book_test extends BaseConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(Address_book_test.class);

    private LoginPage loginACtions;
    private Address_book_Page homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;


    @BeforeClass
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        loginACtions = new LoginPage(driver);
        homePageActions = new Address_book_Page(driver);
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

    @Test(priority = 2, testName = "TC_Addressbook-01", description = "To validate the functionality of 'Address Book'")
    public void My_Account() throws InterruptedException {
        homePageActions.Address_Book();

    }

    @Test(priority = 3, testName = "TC_Addressbook-03", description = "To validate the 'Change Billing Address' link of Default Billing Address from Default Addresses ")
    public void Change_billing_address() throws InterruptedException {
        homePageActions.Change_billing_address();

    }

    @Test(priority = 4, testName = "TC_Addressbook-05", description = "To validate the mandatory filed required functionality when saving the edited information of address book section")
    public void Edit_address_empty() throws InterruptedException {
        homePageActions.Edit_empty();

    }

    @Test(priority = 5, testName = "TC_Addressbook-05", description = "To validate the mandatory filed required functionality when saving the edited information of address book section")
    public void Edit_address_invalid() throws InterruptedException {
        homePageActions.Edit_invalid();


    }

    @Test(priority = 6, testName = "TC_Addressbook-04", description = "To check 'Save Address' button functionality of Address Book ")
    public void Edit_address_valid() throws InterruptedException {
        homePageActions.edit_valid();


    }
@Test(priority = 7, testName = "TC_Addressbook-06", description = "To validate the 'Change Shipping Address' link of Default Shipping Address from Default Addresses  ")
public void Change_shipping_address() throws InterruptedException {
    homePageActions.default_shipping_address();


}
    @Test(priority = 8, testName = "TC_Addressbook-07", description = "To validate save button functioanlity when information edited on  DEFAULT SHIPPING ADDRESS page")
    public void Save_shipping_address() throws InterruptedException {
        homePageActions.default_shipping_address_Edit();


    }

    @Test(priority = 9, testName = "TC_Addressbook-10", description = "To verify the 'Additional Address Entries' table below the Default Addresses")
    public void Additional_entries_block() throws InterruptedException {
        homePageActions.Additional_entries_block();


    }

    @Test(priority = 10, testName = "TC_Addressbook-09", description = "To validate the Edit and Delete link from 'Additional Address Entries' table")
    public void Save_Button_shipping_address() throws InterruptedException {
        homePageActions.Additional_entries_Edit();



    }

    @Test(priority = 11, testName = "TC_Addressbook-09", description = "To validate the Edit and Delete link from 'Additional Address Entries' table")
    public void Additional_entries_delete() throws InterruptedException {
        homePageActions.Additional_entries_delete();


    }
    @Test(priority = 12, testName = "TC_Addressbook-11", description = "To validate the functionality of 'Show'")
    public void show_button() throws InterruptedException {
        homePageActions.show_button();


    }
    @Test(priority = 13, testName = "TC_Addressbook-12", description = "To validate the functionality of Add new address button")
    public void Add_new_address() throws InterruptedException {
        homePageActions.Add_new_address();
        homePageActions.Additional_entries_block();


    }

}




