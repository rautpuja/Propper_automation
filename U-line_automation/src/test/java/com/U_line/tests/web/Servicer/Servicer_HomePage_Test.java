package com.U_line.tests.web.Servicer;

import com.U_line.core.BaseConfiguration;
import com.U_line.page.actions.web.LoginPage;
import com.U_line.page.actions.web.MyAccountPage;
import com.U_line.page.actions.web.Servicer.Servicer_Homepage_Page;
import com.U_line.page.validators.web.LoginValidator;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Servicer_HomePage_Test extends BaseConfiguration {


    private static final Logger LOGGER = LoggerFactory.getLogger(Servicer_HomePage_Test.class);

    private LoginPage loginACtions;
    private Servicer_Homepage_Page homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;


    @BeforeClass
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        loginACtions = new LoginPage(driver);
        homePageActions = new Servicer_Homepage_Page(driver);
        myAccountPage = new MyAccountPage(driver);
        loginValidator = new LoginValidator();

    }
    @Test (priority = 0, testName = "TC_Product Search_01", description = "Provider login")
    public void Validate_providerlogin() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(3000);
        homePageActions.providerlogin();
        homePageActions.setemail(username);

        homePageActions.setPassword(password);

        Thread.sleep(3000);
        homePageActions.clickSubmit();
        System.out.println("Provider login successfull");}


    @Test(priority = 1, testName = "TC_Product Search_02", description = "To validate the navigation of 'U-Line' logo.")
    public void Validate_Homepage_logo() throws InterruptedException {
        homePageActions.HomePage_Logo();

    }
    @Test(priority = 2, testName = "TC_Product Search_03", description = "To validate the functionality of mini cart")
    public void Validate_MiniCart_Popup() throws InterruptedException {
        homePageActions.MiniCart();

    }
    @Test(priority = 3, testName = "TC_Product Search_04", description = "To validate the functionality of 'Remove' from mini cart")
    public void Validate_Remove_icon() throws InterruptedException {
        homePageActions.Remove_Button();

    }

    @Test(priority = 4, testName = "TC_Product Search_05", description = "To validate the functionality of mini cart popup for 'Cancel' button")
    public void Validate_Cancel_button() throws InterruptedException {
        homePageActions.Cancel_Button();

    }
    @Test(priority = 5, testName = "TC_Product Search_06", description = "To validate the functionality of mini cart popup for 'ok' button")
    public void Validate_ok_button() throws InterruptedException {
        homePageActions.Remove_Button();
        homePageActions.Ok_Button();
    }
    @Test(priority = 6, testName = "TC_Product Search_07", description = "To validate the functionality of serial number")
    public void Validate_Searial_Number() throws InterruptedException {
        homePageActions.Part_search_SerialNumber();
        homePageActions.SerialNumber();
        homePageActions.Search();

    }

    @Test(priority = 7, testName = "TC_Product Search_08", description = "To validate the functionality of add to cart")
    public void Validate_add_to_cart() throws InterruptedException {
        homePageActions.addtocart();

    }
    @Test(priority = 8, testName = "TC_Product Search_09", description = "To validate the functionality of serial number")
    public void Validate_Continue_shopping() throws InterruptedException {
        homePageActions.ContinueShopping();

    }
    @Test(priority = 9, testName = "TC_Product Search_10", description = "To validate the functionality of 'Submit Labor Claim'")
    public void Validate_SubmitLaborClaim() throws InterruptedException {
        homePageActions.SubmitLaborClaim();

}
    @Test(priority = 10, testName = "TC_Product Search_11", description = "To validate the functionality of 'My Orders'")
    public void My_Orders() throws InterruptedException {
        homePageActions.My_Orders();

    }

    @Test(priority = 11, testName = "TC_Product Search_12", description = "To validate the functionality of 'My Orders'")
    public void My_Claims() throws InterruptedException {
        homePageActions.My_Claims();

    }

    @Test(priority = 12, testName = "TC_Product Search_13", description = "To validate the functionality of 'My Saved Item'")
    public void My_Saved_Item() throws InterruptedException {
        homePageActions.My_Saved_Item();

    }

    @Test(priority = 13, testName = "TC_Product Search_14", description = "To validate the functionality of 'Training Vedios'")
    public void My_Training_Videos() throws InterruptedException {
        homePageActions.Training_Videos();

    }

    @Test(priority = 14, testName = "TC_Product Search_15", description = "To validate the functionality of 'Product Registration'")
    public void Product_Registration() throws InterruptedException {
        homePageActions.Product_Registration();

    }

    @Test(priority = 15, testName = "TC_Product Search_16", description = "To validate the functionality of 'My_Account'")
    public void My_Account() throws InterruptedException {
        homePageActions.My_Account();

    }
    @Test(priority = 16, testName = "TC_Product Search_17", description = "To validate the functionality of 'My_Address_Book'")
    public void My_Address_Book() throws InterruptedException {
        homePageActions.My_Address_Book();

    }


    @Test(priority = 17, testName = "TC_Product Search_18", description = "To validate the functionality of 'Contact Us'")
    public void Contact_Us() throws InterruptedException {
        homePageActions.Contact_Us();

    }
    @Test(priority = 18, testName = "TC_Product Search_19", description = "To validate the functionality of Download Button")
    public void Download_Button() throws InterruptedException {
       // homePageActions.Download_Button();

    }

    @Test(priority = 19, testName = "TC_Product Search_20", description = "To validate the functionality of Logout Button")
    public void Logout_Button() throws InterruptedException {
        homePageActions.Logout_Button();

    }

}