package com.U_line.tests.web.Servicer;

import com.U_line.core.BaseConfiguration;
import com.U_line.page.actions.web.LoginPage;
import com.U_line.page.actions.web.MyAccountPage;
import com.U_line.page.actions.web.Servicer.PartSearch_Page;
import com.U_line.page.actions.web.Servicer.Submit_Labor_Claim_Page;
import com.U_line.page.validators.web.LoginValidator;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Submit_Labor_Claim_Test extends BaseConfiguration {


    private static final Logger LOGGER = LoggerFactory.getLogger(Servicer_HomePage_Test.class);

    private LoginPage loginACtions;
    private Submit_Labor_Claim_Page homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;


    @BeforeClass
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        loginACtions = new LoginPage(driver);
        homePageActions = new Submit_Labor_Claim_Page(driver);
        myAccountPage = new MyAccountPage(driver);
        loginValidator = new LoginValidator();

    }

    @Test(priority = 0, testName = "Login", description = "Customer login ")
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

    @Test(priority = 1, testName = "TC_SLC_24", description = "To validate the functionality of 'Submit Labor Claim'")
    public void Validate_SubmitLaborClaim() throws InterruptedException {
        homePageActions.SubmitLaborClaim();

    }

    @Test(priority = 2, testName = "TC_SLC_25", description = "To validate the functionality of 'Submit Labor Claim'")
    public void Validate_SubmitLaborClaim_BlankData() throws InterruptedException {

        homePageActions.Next_Button();

    }

    @Test(priority = 3, testName = "TC_SLC_26", description = "To validate the functionality of 'Submit Labor Claim'")
    public void Validate_SubmitLaborClaim_Invalid() throws InterruptedException {


        homePageActions.Next_Button_Invalid();

    }

    @Test(priority = 4, testName = "TC_SLC_27", description = "To validate the functionality of 'Submit Labor Claim'")
    public void Validate_SubmitLaborClaim_valid() throws InterruptedException, AWTException {



        homePageActions.Next_Button_valid();

    }


    @Test(priority = 5, testName = "TC_SLC_28", description = "To validate the functionality of 'Submit Labor Claim'")
    public void Validate_SubmitLaborClaim_Step2_Invalid() throws InterruptedException {


        homePageActions.Customer_Info_Blank();

    }

    @Test(priority = 6, testName = "TC_SLC_29", description = "To validate the functionality of 'Submit Labor Claim'")
    public void Validate_SubmitLaborClaim_Step2_valid() throws InterruptedException {


        homePageActions.Customer_Info_Valid();

    }

    @Test(priority = 7, testName = "TC_SLC_30", description = "To validate the functionality of 'Submit Labor Claim'")
    public void Validate_SubmitLaborClaim_Step3_Blank() throws InterruptedException {


        homePageActions.Repaire_details_blank();

    }

    @Test(priority = 8, testName = "TC_SLC_31", description = "To validate the functionality of 'Submit Labor Claim'")
    public void Validate_SubmitLaborClaim_Step3_Valid() throws InterruptedException {


        homePageActions.Repaire_details_valid();

    }
    @Test(priority = 9, testName = "TC_SLC_32", description = "To validate the functionality of 'Submit Labor Claim'")
    public void Validate_SubmitLaborClaim_Step4_Blank() throws InterruptedException {


       // homePageActions.Parts_used_Blank();

    }
    @Test(priority = 10, testName = "TC_SLC_33", description = "To validate the functionality of 'Submit Labor Claim'")
    public void Validate_SubmitLaborClaim_Step4_addanother() throws InterruptedException {


        homePageActions.Parts_used_AddAnother();

    }
    @Test(priority = 11, testName = "TC_SLC_34", description = "To validate the functionality of 'Submit Labor Claim'")
    public void Validate_SubmitLaborClaim_Step4_Remove() throws InterruptedException {


        homePageActions.Parts_used_remove();

    }
    @Test(priority = 12, testName = "TC_SLC_35", description = "To validate the functionality of 'Submit Labor Claim'")
    public void Validate_SubmitLaborClaim_Step4_valid() throws InterruptedException {


        homePageActions.Parts_used_valid();

    }

    @Test(priority = 13, testName = "TC_SLC_36", description = "To validate the functionality of 'Submit Labor Claim'")
    public void Validate_SubmitLaborClaim_Step5_Blank() throws InterruptedException {


        homePageActions.Step5_Blank();

    }
    @Test(priority = 14, testName = "TC_SLC_36", description = "To validate the functionality of 'Submit Labor Claim'")
    public void Validate_SubmitLaborClaim_Step5_withoutcheckbox() throws InterruptedException {


        homePageActions.Step5_Without_checkbox();

    }
    @Test(priority = 15, testName = "TC_SLC_37", description = "To validate the functionality of 'Submit Labor Claim'")
    public void Validate_SubmitLaborClaim_Step4_withcheckbox() throws InterruptedException {


       // homePageActions.Step5_Valid();

    }



}
