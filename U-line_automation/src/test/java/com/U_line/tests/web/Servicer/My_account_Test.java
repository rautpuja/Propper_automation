package com.U_line.tests.web.Servicer;

import com.U_line.core.BaseConfiguration;
import com.U_line.page.actions.web.LoginPage;
import com.U_line.page.actions.web.MyAccountPage;
import com.U_line.page.actions.web.Servicer.My_account_Page;
import com.U_line.page.actions.web.Servicer.Product_Registration_page;
import com.U_line.page.validators.web.LoginValidator;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class My_account_Test extends BaseConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(My_account_Test.class);

    private LoginPage loginACtions;
    private My_account_Page homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;


    @BeforeClass
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        loginACtions = new LoginPage(driver);
        homePageActions = new My_account_Page(driver);
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

    @Test(priority = 2, testName = "TC_Product Search_2", description = "To validate the functionality of 'My_Account'")
    public void My_Account() throws InterruptedException {
        homePageActions.My_Account();

    }


    @Test(priority = 3, testName = "TC_Product Search_3", description = "To validate the functionality of 'My_Account'")
    public void Edit() throws InterruptedException {
        homePageActions.Edit();

    }

    @Test(priority = 4, testName = "TC_Product Search_4", description = "To validate the functionality of 'My_Account'")
    public void Change_email_id() throws InterruptedException {
        homePageActions.Change_email_id();

    }

    @Test(priority = 5, testName = "TC_Product Search_5", description = "To validate the functionality of 'My_Account'")
    public void Change_First_Name() throws InterruptedException {
        homePageActions.Change_First_name();

    }

    @Test(priority = 7, testName = "TC_Product Search_6", description = "To validate the functionality of 'My_Account'")
    public void Mandatory_fields_blank() throws InterruptedException {
        homePageActions.Mandatory_fields_blank();

    }

    @Test(priority = 6, testName = "TC_Product Search_7", description = "To validate the functionality of 'My_Account'")
    public void Change_Password() throws InterruptedException {
        homePageActions.Change_password();

    }
}
