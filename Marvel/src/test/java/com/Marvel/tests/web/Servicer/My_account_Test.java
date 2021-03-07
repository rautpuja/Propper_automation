package com.Marvel.tests.web.Servicer;

import com.Marvel.core.BaseConfiguration;
import com.Marvel.page.actions.web.LoginPage;
import com.Marvel.page.actions.web.MyAccountPage;
import com.Marvel.page.actions.web.Servicer.My_account_Page;
import com.Marvel.page.validators.web.LoginValidator;
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

    @Test(priority = 0, testName = "", description = "provider login ")
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

    @Test(priority = 1, testName = "TC_MyAcc_01", description = "To validate the functionality of 'My_Account'")
    public void My_Account() throws InterruptedException {
        homePageActions.My_Account();

    }


    @Test(priority = 2, testName = "TC_MyAcc_02", description = "To validate the password change functionality for ACCOUNT INFORMATION section")
    public void Edit() throws InterruptedException {
        homePageActions.Edit();

    }

    @Test(priority = 3, testName = "TC_MyAcc_03", description = "To validate the change Email functionality for ACCOUNT INFORMATION section")
    public void Change_email_id() throws InterruptedException {
        homePageActions.Change_email_id();

    }

    @Test(priority = 4, testName = "TC_MyAcc_04", description = "To validate the Edit link functionality for ACCOUNT INFORMATION section")
    public void Change_First_Name() throws InterruptedException {
        homePageActions.Change_First_name();

    }



    @Test(priority = 5, testName = "TC_MyAcc_10", description = "To validate the change password link functionality of account information section")
    public void Change_Password_link() throws InterruptedException {
        homePageActions.Change_password_Link();

    }
    @Test(priority = 6, testName = "TC_MyAcc_05", description = "To validate the mandatory filed required functionality when saving the edited information")
    public void Change_Password_link_Blank() throws InterruptedException {
        homePageActions.Mandatory_fields_blank();

    }
    @Test(priority = 7, testName = "TC_MyAcc_08", description = "To validate the 'Save' button functionality for mismatch of 'Password' and 'Confirm Password' fields.")
    public void Change_Password_link_mismatch() throws InterruptedException {
        homePageActions.Change_password_mismatch();

    }
    @Test(priority = 8, testName = "TC_MyAcc_09", description = "To validate the 'Save' button functionality for case sensitivity of 'Password' and 'Confirm Password' fields.")
    public void Change_Password_link_casesensetive() throws InterruptedException {
        homePageActions.Change_password_Casesensetive();

    }

    @Test(priority = 9, testName = "TC_MyAcc_10", description = "To validate the change password link functionality of account information section")
    public void Change_Password_link_valid() throws InterruptedException {
        homePageActions.Change_password_valid();

    }
}
