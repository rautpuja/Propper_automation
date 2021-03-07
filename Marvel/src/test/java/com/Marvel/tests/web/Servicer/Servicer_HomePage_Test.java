package com.Marvel.tests.web.Servicer;

import com.Marvel.core.BaseConfiguration;
import com.Marvel.page.actions.web.LoginPage;
import com.Marvel.page.actions.web.MyAccountPage;
import com.Marvel.page.actions.web.Servicer.Servicer_Homepage_Page;
import com.Marvel.page.validators.web.LoginValidator;
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


        homePageActions.providerlogin();
        homePageActions.setemail(username);

        homePageActions.setPassword(password);

        Thread.sleep(3000);
        homePageActions.clickSubmit();
     }


    @Test(priority = 1, testName = "TC_Product Search_02", description = "To validate the navigation of 'U-Line' logo.")
    public void Validate_Homepage_logo() throws InterruptedException {
        homePageActions.HomePage_Logo();

    }
    @Test(priority = 2, testName = "TC_Product Search_03", description = "To validate the functionality of mini cart")
    public void Validate_MiniCart_Popup() throws InterruptedException {
        homePageActions.MiniCart();

    }
    @Test(priority = 3, testName = "TC_Product Search_04", description = "To validate the functionality cross(X) button of mini cart")
    public void Validate_Cross_icon() throws InterruptedException {
        homePageActions.Cross_Button();

    }

    @Test(priority = 4, testName = "TC_Product Search_06", description = "To validate the QTY box in mini cart popup")
    public void Validate_Qty_box() throws InterruptedException {
        homePageActions.Qty_box();

    }
    @Test(priority = 5, testName = "TC_Product Search_05", description = "To validate the edit item button (pencil icon) in mini cart popup")
    public void Validate_edit() throws InterruptedException {
        homePageActions.edit_Button();

    }
    @Test(priority = 6, testName = "TC_Product Search_07", description = "To validate the functionality of 'Remove' product from mini cart")
    public void Validate_Remove() throws InterruptedException {
        homePageActions.Remove_Button();

    }
    @Test(priority = 7, testName = "TC_Product Search_08", description = "To validate the functionality of 'Remove' product from mini cart for 'Cancel' button")
    public void Validate_Cancel() throws InterruptedException {
        homePageActions.Remove_Button_cancel();

    }
    @Test(priority = 8, testName = "TC_Product Search_09", description = "To validate the functionality of 'Remove' product from mini cart for 'Ok' button")
    public void Validate_Remove_ok() throws InterruptedException {
        homePageActions.Remove_Button_ok();

    }
    @Test(priority = 9, testName = "TC_Product Search_10", description = "\"To validate the functionality of mini cart if product is added in cart\n" +
            "(For shopping cart page)\"")
    public void Validate_View_and_edit() throws InterruptedException {
        homePageActions.View_and_edit_();


    }
    @Test(priority = 10, testName = "TC_Product Search_11", description = "\"To validate the functionality of mini cart if product is added in cart\n" +
            "(For checkout page)\"")
    public void Validate_Checkout() throws InterruptedException {
        homePageActions.Checkout();


    }


    @Test(priority = 11, testName = "TC_Product Search_12", description = "To validate the functionality of 'Sign Out' button")
    public void Logout_Button() throws InterruptedException {
        homePageActions.SignOut();

    }

}