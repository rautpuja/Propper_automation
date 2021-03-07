package com.PC_Automation_testcases.tests.web.TestCases;

import com.PC_Automation_testcases.core.BaseConfiguration;
import com.PC_Automation_testcases.page.actions.web.LoginPage;
import com.PC_Automation_testcases.page.actions.web.MyAccountPage;
import com.PC_Automation_testcases.page.actions.web.TestCases.Search_result_page;
import com.PC_Automation_testcases.page.validators.web.LoginValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Search_result_test extends BaseConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(Search_result_test.class);

    private LoginPage loginACtions;
    private Search_result_page homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;


    @BeforeClass
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        loginACtions = new LoginPage(driver);
        homePageActions = new Search_result_page(driver);
        myAccountPage = new MyAccountPage(driver);
        loginValidator = new LoginValidator();

    }
    @Test (priority = 0,testName = "TC_01", description = "Search part and accessories")
    public void Validate_PartandAccessories() throws InterruptedException {
        homePageActions.Subscribe();

    }

    @Test(priority = 1, testName = "TC_SearchResultPage_01", description = "To verify the search autopopulate dropdown")
    public void Validate_Searchresult() throws InterruptedException {
        homePageActions.Dropdown();


    }
    @Test(priority = 2, testName = "TC_SearchResultPage_02", description = "To validate the functionality of 'Shop By' section search autopopulate dropdow")
    public void Validate_Shopby() throws InterruptedException {
        homePageActions.shopBysection();
        homePageActions.Option();


    }


    @Test(priority = 3, testName = "TC_SearchResultPage_06", description = "To Verify  sort dropdown"
    )
    public void Validate_Clear_all_popup() throws InterruptedException {
        homePageActions.clear_all_searchaut_popup();



    }


    @Test(priority = 4, testName = "TC_SearchResultPage_06", description = "To Verify  sort dropdown"
            )
    public void Validate_sortby() throws InterruptedException {
        homePageActions.sortbydropdown();



    }

    @Test(priority = 5, testName = "TC_SearchResultPage_07", description = "To verify the functionality of sort by arrow"
    )
    public void Validate_ascending_descending_arrow() throws InterruptedException {
        homePageActions.ascending_arrow();



    }
@Test(priority = 6, testName = "TC_SearchResultPage_05", description = "To validate the functionality of 'product' section search autopopulate dropdown"
)
public void Validate_ProductName() throws InterruptedException {
    homePageActions.Product_name();



}
    @Test(priority = 7, testName = "TC_SearchResultPage_08", description = "To validate funtionality of product listing page according to search result"
    )
    public void Validate_SearchResultPage() throws InterruptedException {
        homePageActions.Search_result_page();



    }

    @Test(priority = 8, testName = "TC_SearchResultPage_06", description = "To Verify  sort dropdown"
    )
    public void Validate_sortby_search_resultpage() throws InterruptedException {
        homePageActions.sort_result_page();



    }

    @Test(priority = 9, testName = "TC_SearchResultPage_09", description = "To verify clear all selected link"
    )
    public void Validate_ClearAll() throws InterruptedException {
        homePageActions.Clear_all_rearchresult_page();



    }

    @Test(priority = 10, testName = "TC_SearchResultPage_10", description = "To validate 'Go' button with hover effect\n"
    )
    public void Validate_Cross() throws InterruptedException {
      //  homePageActions.Cross_button();



    }

    @Test(priority = 11, testName = "TC_SearchResultPage_12", description = "To Verify  sort dropdown"
            )
    public void Validate_Sortby_dropdown() throws InterruptedException {
        homePageActions.SortBydropdown_page();
    }
        @Test(priority = 12, testName = "TC_SearchResultPage_13", description = "To verify the functionality of sort by arrow ")
        public void Validate_Assending() throws InterruptedException {
            homePageActions.Assending_order();
        }




        @Test(priority = 13, testName = "TC_SearchResultPage_15", description = "To validate the functionality of 'product' section search autopopulate dropdown")
        public void Validate_ProductName_page() throws InterruptedException {
            homePageActions.Product_name_searchresultpage();
        }

    @Test(priority = 14, testName = "TC_SearchResultPage_15", description = "Login as a customer")
    public void Validate_login() throws InterruptedException {
        homePageActions.login(username,password);
    }
    @Test(priority = 15, testName = "TC_SearchResultPage_01", description = "To verify the search autopopulate dropdown after login")
    public void Validate_Searchresultpage_login() throws InterruptedException {
        homePageActions.Dropdown_login();


    }
    @Test(priority = 16, testName = "TC_SearchResultPage_02", description = "To validate the functionality of 'Shop By' section search autopopulate dropdown after login")
    public void Validate_Shopby_login() throws InterruptedException {
        homePageActions.shopBysection_login();
        homePageActions.Option();


    }


    @Test(priority = 17, testName = "TC_SearchResultPage_06", description = "To Verify  sort dropdown after login"
    )
    public void Validate_Clear_all_popup_login() throws InterruptedException {
        homePageActions.clear_all_searchaut_popup_login();



    }


    @Test(priority = 18, testName = "TC_SearchResultPage_06", description = "To Verify  sort dropdown after login"
    )
    public void Validate_sortby_login() throws InterruptedException {
        homePageActions.sortbydropdown_login();



    }

    @Test(priority = 19, testName = "TC_SearchResultPage_07", description = "To verify the functionality of sort by arrow after login"
    )
    public void Validate_ascending_descending_arrow_login() throws InterruptedException {
        homePageActions.ascending_arrow_login();



    }
    @Test(priority = 20, testName = "TC_SearchResultPage_05", description = "To validate the functionality of 'product' section search autopopulate dropdown after login"
    )
    public void Validate_ProductName_login() throws InterruptedException {
        homePageActions.Product_name_login();



    }
    @Test(priority = 21, testName = "TC_SearchResultPage_08", description = "To validate funtionality of product listing page according to search result after login"
    )
    public void Validate_SearchResultPage_login() throws InterruptedException {
        homePageActions.Search_result_page_login();



    }

    @Test(priority = 22, testName = "TC_SearchResultPage_06", description = "To Verify  sort dropdown after login"
    )
    public void Validate_sortby_search_resultpage_login() throws InterruptedException {
        homePageActions.sort_result_page_login();



    }

    @Test(priority = 23, testName = "TC_SearchResultPage_09", description = "To verify clear all selected link after login"
    )
    public void Validate_ClearAll_login() throws InterruptedException {
        homePageActions.Clear_all_rearchresult_page_login();



    }

    @Test(priority = 24, testName = "TC_SearchResultPage_10", description = "To validate 'Cross button' button \n"
    )
    public void Validate_Cross_login() throws InterruptedException {
        //  homePageActions.Cross_button();



    }

    @Test(priority = 25, testName = "TC_SearchResultPage_12", description = "To Verify  sort dropdown after login"
    )
    public void Validate_Sortby_dropdown_login() throws InterruptedException {
        homePageActions.SortBydropdown_page_login();
    }
    @Test(priority = 26, testName = "TC_SearchResultPage_13", description = "To verify the functionality of sort by arrow after login")
    public void Validate_Assending_login() throws InterruptedException {
        homePageActions.Assending_order_login();
    }




    @Test(priority = 27, testName = "TC_SearchResultPage_15", description = "To validate the functionality of 'product' section search autopopulate dropdown after login")
    public void Validate_ProductName_page_login() throws InterruptedException {
        homePageActions.Product_name_searchresultpage_login();
    }

}




