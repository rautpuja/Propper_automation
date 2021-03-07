package com.PC_Automation_testcases.tests.web.TestCases;


import com.PC_Automation_testcases.page.actions.web.LoginPage;
import com.PC_Automation_testcases.page.actions.web.MyAccountPage;
import com.PC_Automation_testcases.page.actions.web.TestCases.Category_L1_page;
import com.PC_Automation_testcases.page.validators.web.LoginValidator;
import com.PC_Automation_testcases.core.BaseConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Category_l1_test extends BaseConfiguration {
    private static final Logger LOGGER = LoggerFactory.getLogger(Category_l1_test.class);

    private LoginPage loginACtions;
    private Category_L1_page homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;


    @BeforeClass
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        loginACtions = new LoginPage(driver);
        homePageActions = new Category_L1_page(driver);
        myAccountPage = new MyAccountPage(driver);
        loginValidator = new LoginValidator();

    }

    @Test(priority = 0,testName = "", description = "Click on subscribe pop up")
    public void Validate_Subscribe() throws InterruptedException {
        homePageActions.Subscribe();

    }
    @Test(priority = 1,testName = "TC_PP_01", description = "To validate the functionality of breadcrumb of products page")
    public void Validate_Breadcrumb() throws InterruptedException {
        homePageActions.Label_wristlist();

    }
    @Test(priority = 2,testName = "TC_PP_03", description = "To verify banners button for guest user")
    public void Validate_Request_Qoute() throws InterruptedException {
        homePageActions.Request_aquote_button();

    }
    @Test(priority = 3,testName = "TC_PP_07", description = "To verify banners button for guest user")
    public void Validate_shop_now_button() throws InterruptedException {
        homePageActions.Healthcare_shop_now_button();

   }
    @Test(priority = 4,testName = "TC_PP_14", description = "To Verify 'FAQ' Section")
    public void Validate_FAQ() throws InterruptedException {
        homePageActions.Faq();

    }
    @Test(priority = 5,testName = "TC_PP_17", description = "To Validate 'Related Resources' Sections button")
    public void Validate_Related_resources_section() throws InterruptedException {
        homePageActions.Related_section();

    }
    @Test(priority = 6,testName = "TC_PP_19", description = "To Validate 'Related Resources' Sections button")
    public void Validate_Dots() throws InterruptedException {
        homePageActions.dots();

    }
    @Test(priority = 7,testName = "TC_PP_21", description = "To verify banners button for Login user")
    public void Validate_Download_catlog() throws InterruptedException {
        homePageActions.login(username,password);
        homePageActions.login_label();

    }
    @Test(priority = 8,testName = "TC_PP_22", description = "To validate banners button for Login user")
    public void Validate_Download_catlog_button() throws InterruptedException {
        homePageActions.Download_catlog();
        homePageActions.Logout();

    }

    @Test(priority = 9,testName = "TC_PP_23", description = "To validate the functionality of breadcrumb of products page")
    public void Validate_Category_2() throws InterruptedException {
        homePageActions.Category_2();

    }
    @Test(priority = 9,testName = "TC_PP_25", description = "To verify banners button")
    public void Validate_shop_now_button_1() throws InterruptedException {
        homePageActions.shop_now();

    }
    @Test(priority = 10,testName = "TC_PP_28", description = "To Verify 'Standard Tourniquets' Section")
    public void Validate_standered_turniquates() throws InterruptedException {
        homePageActions.standered_turniquates();

    }
    @Test(priority = 11,testName = "TC_PP_36", description = "To Verify 'Standard Tourniquets' Section")
    public void Validate_search_faq() throws InterruptedException {
        homePageActions.Search_FAQ();

    }
    @Test(priority = 12,testName = "TC_PP_37", description = "To Validate 'Need Help Finding a Product?' Sections button")
    public void Validate_search_faq_button() throws InterruptedException {
        homePageActions.Search_FAQ_button();

    }
    @Test(priority = 13,testName = "TC_PP_39", description = "To Validate 'Related Resources' Sections button")
    public void Validate_Related_product() throws InterruptedException {
        homePageActions.Related_section_2();

    }
    @Test(priority = 14,testName = "TC_PP_41", description = "To verify hover effect of 'What Clients Say' Section functionality")
    public void Validate_dot2() throws InterruptedException {
        homePageActions.dots_2();

    }
    @Test(priority = 15,testName = "TC_PP_42", description = "To validate the functionality of breadcrumb of products page for guest user")
    public void Validate_Category_3() throws InterruptedException {
        homePageActions.Category_3();

    }
    @Test(priority = 16,testName = "TC_PP_45", description = "\"To validate banners Healthcare Labels &\n" +
            "Patient ID Wristbands section button\"")
    public void Validate_shop_now_button_2() throws InterruptedException {
        homePageActions.shop_now_1();

    }
    @Test(priority = 17,testName = "TC_PP_49", description = "To Validate 'Non-Latex Cohesive Bandages' Section")
    public void Validate_Now_latex() throws InterruptedException {
        homePageActions.Non_latex();

    }
    @Test(priority = 18,testName = "TC_PP_52", description = "To Verify 'Need Help Finding a Product?' Section")
    public void Validate_search_faq_1() throws InterruptedException {
        homePageActions.Search_FAQ_1();

    }
    @Test(priority = 19,testName = "TC_PP_53", description = "To Validate 'Need Help Finding a Product?' Sections button")
    public void Validate_search_faq_button_1() throws InterruptedException {
        homePageActions.Search_FAQ_button1();

    }
    @Test(priority = 20,testName = "TC_PP_55", description = "To Validate 'Related Resources' Sections button")
    public void Validate_Related_product_1() throws InterruptedException {
        homePageActions.Related_section_3();

    }
    @Test(priority = 21,testName = "TC_PP_57", description = "To verify hover effect of  'What Clients Say' Section functionality")
    public void Validate_dot3() throws InterruptedException {
        homePageActions.dots_3();

    }
    @Test(priority = 22,testName = "TC_PP_58", description = "To validate the functionality of breadcrumb of products page for Login user")
    public void Validate_login_category_3() throws InterruptedException {
        homePageActions.login(username,password);
        homePageActions.Category_3();

    }
    @Test(priority = 23,testName = "TC_PP_61", description = "\"To validate banners Healthcare Labels &\n" +
            "Patient ID Wristbands section button for login user\"")
    public void Validate_Request_acatlog() throws InterruptedException {
        homePageActions.Request_acatlog();


    }

}
