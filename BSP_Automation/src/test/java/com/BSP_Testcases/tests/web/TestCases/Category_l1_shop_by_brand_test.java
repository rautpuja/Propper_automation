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

public class Category_l1_shop_by_brand_test extends BaseConfiguration {
    private static final Logger LOGGER = LoggerFactory.getLogger(Category_l1_shop_by_brand_test.class);

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


    @Test(priority = 20,testName = "TC_Technology_01", description = "To verify the 'TOP CATEGORIES'")
    public void Validate_category_l1_page_technology() throws InterruptedException {
        homePageActions.Category_li_page_technology();

    }
    @Test(priority = 21,testName = "TC_Technology_02", description = "To validate the functionality of 'TOP CATEGORIES'")
    public void Validate_Top_categories_link_technology() throws InterruptedException {
        homePageActions.Top_categories_link_technology();

    }
    @Test(priority = 22,testName = "TC_Technology_03", description = "To verify the 'AllCATEGORIES'")
    public void Validate_All_categories_technology() throws InterruptedException {
        homePageActions.All_categories_technology();

    }
    @Test(priority = 23,testName = "TC_Technology_04", description = "To validate the functionality of 'All CATEGORIES'")
    public void Validate_all_categories_link_technology() throws InterruptedException {
        homePageActions.All_categories_link_technology();

    }
    @Test(priority = 24,testName = "TC_SBB_01", description = "To verify the 'TOP CATEGORIES'")
    public void Validate_category_l1_page_shop_by_brand() throws InterruptedException {
        homePageActions.Category_li_page_shop_by_brand();

    }
    @Test(priority = 25,testName = "TC_SBB_02", description = "To validate the functionality of 'TOP CATEGORIES'")
    public void Validate_Top_categories_link_shop_by_brand() throws InterruptedException {
        homePageActions.Top_categories_link_shop_by_brand();

    }
    @Test(priority = 26,testName = "TC_SBB_03", description = "To verify the 'AllCATEGORIES'")
    public void Validate_All_categories_shop_by_brand() throws InterruptedException {
        homePageActions.All_categories_shop_by_brand();

    }
    @Test(priority = 27,testName = "TC_SBB_04", description = "To validate the functionality of 'All CATEGORIES'")
    public void Validate_all_categories_link_shop_by_brand() throws InterruptedException {
        homePageActions.All_categories_link_shop_by_brand();

    }
}
