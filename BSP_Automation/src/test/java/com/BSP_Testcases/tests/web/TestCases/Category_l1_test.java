package com.BSP_Testcases.tests.web.TestCases;

import com.BSP_Testcases.core.BaseConfiguration;
import com.BSP_Testcases.page.actions.web.LoginPage;
import com.BSP_Testcases.page.actions.web.MyAccountPage;
import com.BSP_Testcases.page.actions.web.TestCases.Category_L1_page;
import com.BSP_Testcases.page.validators.web.LoginValidator;
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

    @Test(priority = 0,testName = "TC_PP_01", description = "To verify the 'TOP CATEGORIES'")
    public void Validate_category_l1_page_apparel() throws InterruptedException {
        homePageActions.Category_li_page_apparel();

    }
    @Test(priority = 1,testName = "TC_PP_02", description = "To validate the functionality of 'TOP CATEGORIES'")
    public void Validate_Top_categories_link_apparel() throws InterruptedException {
        homePageActions.Top_categories_link();

    }
    @Test(priority = 2,testName = "TC_PP_03", description = "To verify the 'AllCATEGORIES'")
    public void Validate_All_categories_apparel() throws InterruptedException {
        homePageActions.All_categories_apperal();

    }
    @Test(priority = 3,testName = "TC_PP_04", description = "To validate the functionality of 'All CATEGORIES'")
    public void Validate_all_categories_link_apparel() throws InterruptedException {
        homePageActions.All_categories_link_apperal();

    }
    @Test(priority = 4,testName = "TC_bags_01", description = "To verify the 'TOP CATEGORIES'")
    public void Validate_category_l1_page_bags() throws InterruptedException {
        homePageActions.Category_li_page_Bags();

    }
    @Test(priority = 5,testName = "TC_bags_02", description = "To validate the functionality of 'TOP CATEGORIES'")
    public void Validate_Top_categories_link_bags() throws InterruptedException {
        homePageActions.Top_categories_link_bags();

    }
    @Test(priority = 6,testName = "TC_bags_03", description = "To verify the 'AllCATEGORIES'")
    public void Validate_All_categories_bags() throws InterruptedException {
        homePageActions.All_categories_bags();

    }
    @Test(priority = 7,testName = "TC_bags_04", description = "To validate the functionality of 'All CATEGORIES'")
    public void Validate_all_categories_link_bags() throws InterruptedException {
        homePageActions.All_categories_link_bags();

    }
    @Test(priority = 8,testName = "TC_homeandauto_01", description = "To verify the 'TOP CATEGORIES'")
    public void Validate_category_l1_page_Home_auto() throws InterruptedException {
        homePageActions.Category_li_page_home_auto();

    }
    @Test(priority = 9,testName = "TC_homeandauto_02", description = "To validate the functionality of 'TOP CATEGORIES'")
    public void Validate_Top_categories_link_home_auto() throws InterruptedException {
        homePageActions.Top_categories_link_home_auto();

    }
    @Test(priority = 10,testName = "TC_homeandauto_03", description = "To verify the 'AllCATEGORIES'")
    public void Validate_All_categories_home_auto() throws InterruptedException {
        homePageActions.All_categories_home_auto();

    }
    @Test(priority = 11,testName = "TC_homeandauto_04", description = "To validate the functionality of 'All CATEGORIES'")
    public void Validate_all_categories_link_home_auto() throws InterruptedException {
        homePageActions.All_categories_link_home_auto();

    }
    @Test(priority = 12,testName = "TC_drinks_01", description = "To verify the 'TOP CATEGORIES'")
    public void Validate_category_l1_page_drinkware() throws InterruptedException {
        homePageActions.Category_li_page_drinkware();

    }
    @Test(priority = 13,testName = "TC_drinks_02", description = "To validate the functionality of 'TOP CATEGORIES'")
    public void Validate_Top_categories_link_drinkware() throws InterruptedException {
        homePageActions.Top_categories_link_drinkware();

    }
    @Test(priority = 14,testName = "TC_drinks_03", description = "To verify the 'AllCATEGORIES'")
    public void Validate_All_categories_drinkware() throws InterruptedException {
        homePageActions.All_categories_drinkware();

    }
    @Test(priority = 15,testName = "TC_drinks_04", description = "To validate the functionality of 'All CATEGORIES'")
    public void Validate_all_categories_link_drinkware() throws InterruptedException {
        homePageActions.All_categories_link_drinkware();

    }
    @Test(priority = 16,testName = "TC_office_01", description = "To verify the 'TOP CATEGORIES'")
    public void Validate_category_l1_page_office() throws InterruptedException {
        homePageActions.Category_li_page_office();

    }
    @Test(priority = 17,testName = "TC_office_02", description = "To validate the functionality of 'TOP CATEGORIES'")
    public void Validate_Top_categories_link_Office() throws InterruptedException {
        homePageActions.Top_categories_link_office();

    }
    @Test(priority = 18,testName = "TC_office_03", description = "To verify the 'AllCATEGORIES'")
    public void Validate_All_categories_office() throws InterruptedException {
        homePageActions.All_categories_office();

    }
    @Test(priority = 19,testName = "TC_office_04", description = "To validate the functionality of 'All CATEGORIES'")
    public void Validate_all_categories_link_office() throws InterruptedException {
        homePageActions.All_categories_link_office();

    }

}
