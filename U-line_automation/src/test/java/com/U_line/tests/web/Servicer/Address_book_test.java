package com.U_line.tests.web.Servicer;

import com.U_line.core.BaseConfiguration;
import com.U_line.page.actions.web.LoginPage;
import com.U_line.page.actions.web.MyAccountPage;
import com.U_line.page.actions.web.Servicer.Address_book_Page;
import com.U_line.page.actions.web.Servicer.My_saved_item_page;
import com.U_line.page.validators.web.LoginValidator;
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

    @Test(priority = 2, testName = "TC_AB_01", description = "To validate the functionality of 'My_Account'")
    public void My_Account() throws InterruptedException {
        homePageActions.Address_Book();

    }

    @Test(priority = 3, testName = "TC_AB_02", description = "\"1.To validate the Default Addresses\n" +
            "2.To validate the 'Change Billing Address' link of Default Billing Address from Default Addresses  \"")
    public void Change_billing_address() throws InterruptedException {
        homePageActions.change_billing_address();

    }

    @Test(priority = 4, testName = "TC_AB_03", description = "To check 'Save Address' button functionality of Address Book ")
    public void save_address() throws InterruptedException {
        homePageActions.Save_address();

    }

    @Test(priority = 5, testName = "TC_AB_04", description = "To validate the mandatory filed required functionality when saving the edited information of address book section")
    public void edit_address() throws InterruptedException {
        homePageActions.Edit_address();
        Thread.sleep(7000);
        homePageActions.Save_address();

    }
//
//    @Test(priority = 6, testName = "", description = "To validate the functionality of 'My_Account'")
//    public void Save_address_Button() throws InterruptedException {
//        homePageActions.Save_address_Button();
//
//
//    }
@Test(priority = 6, testName = "TC_AB_05", description = "To validate the 'Change Shipping Address' link of Default Shipping Address from Default Addresses ")
public void Change_shipping_address() throws InterruptedException {
    homePageActions.Change_Shipping_Address();


}
    @Test(priority = 7, testName = "TC_AB_06", description = "To validate save button functioanlity when information edited on  DEFAULT SHIPPING ADDRESS page")
    public void Save_shipping_address() throws InterruptedException {
        homePageActions.Save_address_Shipping();


    }

    @Test(priority = 8, testName = "TC_AB_06", description = "To validate the functionality of 'My_Account'")
    public void Edit_shipping_address() throws InterruptedException {
        homePageActions.Edit_address_Shipping();


    }

//    @Test(priority = 9, testName = "TC_Product Search_2", description = "To validate the functionality of 'My_Account'")
//    public void Save_Button_shipping_address() throws InterruptedException {
//      //  homePageActions.Save_button_address_Shipping();



  //  }

    @Test(priority = 10, testName = "TC_AB_10", description = "To validate the functionality of Add new address button")
    public void Add_new_address() throws InterruptedException {
        homePageActions.Add_new_address();


    }
    @Test(priority = 11, testName = "TC_AB_10", description = "Error message should get displayed")
    public void Form_blank_detail() throws InterruptedException {
        homePageActions.Form_blank();


    }
    @Test(priority = 15, testName = "TC_AB_07", description = "\"1.To verify the 'Additional Address Entries' below the Default Addresses\n" +
            "2.To validate the Edit and Delete link from 'Additional Address Entries' table\"")
    public void delete_button() throws InterruptedException {
        homePageActions.delete();


    }
    @Test(priority = 14, testName = "TC_AB_08", description = "It should have eight columns(First Name,Last Name,Street Address,City,Country,State,Zip/Postal Code,Phone)")
    public void Edit_button() throws InterruptedException {

        driver.navigate().to("https://u-line.upbott.com/customer/address/");
        homePageActions.Edit_button();


    }

    @Test(priority = 12, testName = "TC_AB_11", description = "Error message should get displayed")
    public void Form_Invalid_detail() throws InterruptedException {
        homePageActions.Form_invalid();
        homePageActions.Form_valid_Edit_button();


    }
    @Test(priority =13, testName = "TC_AB_09", description = "Form should get saved and entries should get displayed in additional entries")
    public void Form_valid_detail_() throws InterruptedException {
        homePageActions.Form_valid_without_checkbox();
        homePageActions.Form_valid_Edit_button();
        Thread.sleep(6000);
        homePageActions.Save_address_5();
        Thread.sleep(8000);
     WebElement ele= driver.findElement(By.xpath("//body/div[3]/aside[1]/div[2]/footer[1]/button[2]/span[1]"));
     ele.click();


    }

    @Test(priority =16, testName = "TC_AB_12", description = "It should be bottom right hand side. By deafult 10 should be selected and results should be according to the slection. It should sort the results as per 10,20,50 items selected. It should be present in the top right of my claims table section.")
    public void Show() throws InterruptedException {
        driver.navigate().to("https://u-line.upbott.com/customer/address/");
        Thread.sleep(50000);
        WebElement ele= driver.findElement(By.xpath("//select[@class='limiter-options']"));
ele.click();
        Select sel=new Select(ele);
        sel.selectByValue("20");
    }
}




