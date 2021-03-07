package com.Marvel.tests.web.Servicer;

import com.Marvel.core.BaseConfiguration;
import com.Marvel.page.actions.web.LoginPage;
import com.Marvel.page.actions.web.MyAccountPage;
import com.Marvel.page.actions.web.Servicer.My_saved_item_page;
import com.Marvel.page.validators.web.LoginValidator;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class My_saved_item_test extends BaseConfiguration {


    private static final Logger LOGGER = LoggerFactory.getLogger(My_saved_item_page.class);

    private LoginPage loginACtions;
    private My_saved_item_page homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;


    @BeforeClass
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        loginACtions = new LoginPage(driver);
        homePageActions = new My_saved_item_page(driver);
        myAccountPage = new MyAccountPage(driver);
        loginValidator = new LoginValidator();

    }

    @Test(priority = 0, testName = "", description = "To validate the functionality of 'login' ")
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
    @Test(priority = 1, testName = "TC_Mysaveditem-01", description = "To validate the functionality of 'My Saved Item'")
    public void My_Saved_Item() throws InterruptedException {
        homePageActions.My_Saved_Item();

    }


    @Test(priority = 2, testName = "TC_Mysaveditem-02", description = "To validate the functionality of 'Show' on my wish list page")
    public void show_button() throws InterruptedException {
        homePageActions.show();

    }
    @Test(priority = 3, testName = "TC_Mysaveditem-03", description = "To verify whether the Product Image/Name/Price is clear and distinct")
    public void product_detail() throws InterruptedException {
        homePageActions.Product_detail();

    }
    @Test(priority = 4, testName = "TC_Mysaveditem-06", description = "To validate whether the 'qty and add to cart' button below the price")
    public void Qty_detail() throws InterruptedException {
        homePageActions.Qty_addto_cart();

    }
    @Test(priority = 5, testName = "TC_Mysaveditem-07", description = "To validate the functionality of Quantity box on the left side")
    public void validate_qty_by_manually_adding() throws InterruptedException {
        homePageActions.Qty_input_manually();

    }
    @Test(priority = 6, testName = "TC_Mysaveditem-04", description = "To validate whether the Product Image & Name")
    public void Product_link() throws InterruptedException {
        homePageActions.Product_image_link();

    }
    @Test(priority = 7, testName = "TC_Mysaveditem-08", description = "To validate the functionality of Add to Cart on the right side")
    public void Add_to_cart() throws InterruptedException {
        homePageActions.add_to_cart();

    }
    @Test(priority = 8, testName = "TC_Mysaveditem-09", description = "To validate the 'Remove' button below the add to cart & qty")
    public void Remove() throws InterruptedException {
        homePageActions.remove();

    }
}
