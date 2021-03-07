package com.PC_Automation_testcases.tests.web.TestCases;

import com.PC_Automation_testcases.core.BaseConfiguration;
import com.PC_Automation_testcases.page.actions.web.LoginPage;
import com.PC_Automation_testcases.page.actions.web.MyAccountPage;
import com.PC_Automation_testcases.page.actions.web.TestCases.Category_L2_page;
import com.PC_Automation_testcases.page.validators.web.LoginValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Category_L2_test extends BaseConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(Category_L2_test.class);

    private LoginPage loginACtions;
    private Category_L2_page homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;


    @BeforeClass
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        loginACtions = new LoginPage(driver);
        homePageActions = new Category_L2_page(driver);
        myAccountPage = new MyAccountPage(driver);
        loginValidator = new LoginValidator();

    }

    @Test(priority = 0,testName = "TC_01", description = "Click on subscribe pop up")
    public void Validate_Subscribe() throws InterruptedException {
        homePageActions.Subscribe();

    }

    @Test(priority = 1,testName = "TC_PP_01", description = "To validate the functionality of breadcrumb of products page")
    public void Validate_printers() throws InterruptedException {
        homePageActions.Printer();

    }
    @Test(priority = 2,testName = "TC_PP_05", description = "To Verify 'Healthcare Printers' Sections buttons")
    public void Validate_shop_now_learn_more() throws InterruptedException {
        homePageActions.Shop_now();

    }
    @Test(priority = 3,testName = "TC_PP_10", description = "To Verify 'Healthcare Printers' Sections buttons")
    public void Validate_Ribbon_shop_now() throws InterruptedException {
        homePageActions.Ribbons_Shop_now();

    }
    @Test(priority = 4,testName = "TC_PP_13", description = "To Verify 'Thermal Paper' Sections button")
    public void Validate_Thermal_shop_now() throws InterruptedException {
        homePageActions.Thermal_Shop_now();

    }
    @Test(priority = 5,testName = "TC_PP_17", description = "To Validate 'Need Help Finding a Product?' Sections button")
    public void Validate_Need_help() throws InterruptedException {
        homePageActions.Need_help();

    }
    @Test(priority = 6,testName = "TC_PP_18", description = "TTo Validate 'Related Resources' Sections button")
    public void Validate_learn_more() throws InterruptedException {
        homePageActions.Learn_more();

    }
    @Test(priority = 7,testName = "TC_PP_20", description = "To verify 'What Clients Say' Section functionality")
    public void Validate_dot() throws InterruptedException {
        homePageActions.dot();

    }
    @Test(priority = 8,testName = "TC_PP_21", description = "To validate the functionality of breadcrumb of products page")
    public void Validate_Specimen_transport() throws InterruptedException {
        homePageActions.Specimen_transport();

    }
    @Test(priority = 9,testName = "TC_PP_26", description = "To Validate 'Stocked Specimen Transport Bags' Sections button functinality")
    public void Validate_shop_now_() throws InterruptedException {
        homePageActions.Shop_now_1();

    }
    @Test(priority = 10,testName = "TC_PP_30", description = "To Validate 'Custom Specimen Transport Bags' Sections button functinality")
    public void Validate_Custom_specimen() throws InterruptedException {
        homePageActions.Custom_specimen();

    }
    @Test(priority = 11,testName = "TC_PP_33", description = "To Validate 'Need Help Finding a Product?' Sections button")
    public void Validate_need_help() throws InterruptedException {
        homePageActions.Need_help_1();

    }
    @Test(priority = 12,testName = "TC_PP_35", description = "To verify Hover effect on 'Related Resources' Section functionality")
    public void Validate_doteffect() throws InterruptedException {
        homePageActions.doteffect();

    }
    @Test(priority = 13,testName = "TC_PP_34", description = "To Validate 'Related Resources' Sections button")
    public void Validate_related_resource() throws InterruptedException {
        homePageActions.RelatedSection();

    }
    @Test(priority = 14,testName = "TC_PP_53", description = "To validate the functionality of breadcrumb of products page")
    public void Validate_LabCoates() throws InterruptedException {
        homePageActions.disposable_lable_coat();

    }
    @Test(priority = 15,testName = "TC_PP_57", description = "To Verify 'Disposable Lab Coats' Sections buttons")
    public void Validate_shop_now_2() throws InterruptedException {
        homePageActions.Shop_now_2();

    }
    @Test(priority = 16,testName = "TC_PP_58", description = "To Validate 'Disposable Lab Coats' Sections button functinality")
    public void Validate_LabJacket_shopnow() throws InterruptedException {
        homePageActions.Labjacket_shopNow();

    }
    @Test(priority = 17,testName = "TC_PP_64", description = "To Verify 'Need Help Finding a Product?' Section")
    public void Validate_need_help_3() throws InterruptedException {
        homePageActions.Need_help_3();

    }
    @Test(priority = 18,testName = "TC_PP_66", description = "To Validate 'Related Resources' Sections button")
    public void Validate_learn_more_3() throws InterruptedException {
        homePageActions.Learn_more_3();

    }
    @Test(priority = 19,testName = "TC_PP_67", description = "To verify 'Related Resources' Section functionality")
    public void Validate_dot_3() throws InterruptedException {
        homePageActions.dot_2();

    }
    @Test(priority = 20,testName = "TC_PP_69", description = "To validate the functionality of breadcrumb of products page")
    public void Validate_exam_glove() throws InterruptedException {
        homePageActions.exam_glove();

    }
    @Test(priority = 21,testName = "TC_PP_74", description = "To Validate 'Nitrile Exam Gloves' Sections button functinality")
    public void Validate_shop_now_3() throws InterruptedException {
        homePageActions.Shop_now_3();

    }
    @Test(priority = 22,testName = "TC_PP_78", description = "To Validate 'Latex Exam Gloves' Sections button functinality")
    public void Validate_latest_exam_glove() throws InterruptedException {
        homePageActions.Letest_exam_glove_shopNow_1();

    }
    @Test(priority = 23,testName = "TC_PP_81", description = "To Validate 'Need Help Finding a Product?' Sections button")
    public void Validate_Need_help_FAQ() throws InterruptedException {
        homePageActions.Need_help_3();

    }

    @Test(priority = 24,testName = "TC_PP_82", description = "To Validate 'Related Resources' Sections button")
    public void Validate_Learn_more() throws InterruptedException {
        homePageActions.Learn_more_4();

    }
    @Test(priority = 25,testName = "TC_PP_83", description = "To verify 'Related Resources' Section functionality")
    public void Validate_Dot() throws InterruptedException {
        homePageActions.dot_3();

    }
    @Test(priority = 26,testName = "TC_PP_85", description = "To validate the functionality of breadcrumb of products page")
    public void Validate_Automation_lable() throws InterruptedException {
        homePageActions.karoise();

    }
    @Test(priority = 27,testName = "TC_PP_88", description = "To validate Banner (Category) button")
    public void Validate_Automated_team_labling_system() throws InterruptedException {
        homePageActions.learn_more_button();

    }
    @Test(priority = 28,testName = "TC_PP_92", description = "To Validate 'Kairos ID M Series' Sections button functinality")
    public void Validate_Kairos_id_m_series() throws InterruptedException {
        homePageActions.Kairos_Id_learn_more_button();

    }
    @Test(priority = 29,testName = "TC_PP_96", description = "To Validate 'Kairos ID GNT9 Series' Sections button functinality")
    public void Validate_Kairos_id_GNT9_series() throws InterruptedException {
        homePageActions.Kairos_gnt9_learn_more_button();

    }
    @Test(priority = 30,testName = "TC_PP_99", description = "To Validate 'Contact us' Sections button")
    public void Validate_contact_us() throws InterruptedException {
        homePageActions.Kairos_contact_us_button();

    }
}
