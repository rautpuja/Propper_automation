package com.U_line.tests.web.Servicer;

import com.U_line.core.BaseConfiguration;
import com.U_line.page.actions.web.HomePage;
import com.U_line.page.actions.web.LoginPage;
import com.U_line.page.actions.web.MyAccountPage;
import com.U_line.page.actions.web.Servicer.My_saved_item_page;
import com.U_line.page.actions.web.Servicer.PartSearch_Page;
import com.U_line.page.validators.web.LoginValidator;
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
    @Test(priority = 1, testName = "TC_wishlist_66", description = "To validate the functionality of 'My Saved Item'")
    public void My_Saved_Item() throws InterruptedException {
        homePageActions.My_Saved_Item();

    }

    @Test(priority = 2, testName = "TC_wishlist_67", description = "To validate the functionality of 'My Saved Item'")
    public void Edit_button() throws InterruptedException {
        homePageActions.Edit_button();
        homePageActions.Home_page();

    }

    @Test(priority = 3, testName = "TC_wishlist_68", description = "To validate the functionality of 'My Saved Item'")
    public void Remove() throws InterruptedException {
        homePageActions.Remove();

    }

    @Test(priority = 4, testName = "TC_wishlist_69", description = "To validate the functionality of 'My Saved Item'")
    public void Add_to_cart() throws InterruptedException {
        homePageActions.AddTocart();
        homePageActions.Home_page();


    }

    @Test(priority = 5, testName = "TC_wishlist_70", description = "To validate the functionality of 'My Saved Item'")
    public void Add_to_alltocart() throws InterruptedException {
        homePageActions.Add_all_Tocart();


    }

}
