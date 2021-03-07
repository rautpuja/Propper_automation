package com.Marvel.tests.web.Retailer;

import com.Marvel.core.BaseConfiguration;
import com.Marvel.page.actions.web.LoginPage;
import com.Marvel.page.actions.web.MyAccountPage;
import com.Marvel.page.actions.web.Retailer.Search_result_page;
import com.Marvel.page.validators.web.LoginValidator;
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

    @Test(priority = 0, testName = "TC_SearchResultPage_01", description = "To validate the dropdown from search autopopulate dropdown\n")
    public void Validate_Searchresult() throws InterruptedException {
        homePageActions.Dropdown();


    }
    @Test(priority = 1, testName = "TC_SearchResultPage_04", description = "To verify product image, product name"
    )
    public void Validate_product_link() throws InterruptedException {
        homePageActions.Product_name();



    }

    @Test(priority = 2, testName = "TC_SearchResultPage_05", description = "To validate 'Go' button with hover effect\n"
    )
    public void Validate_Go_button() throws InterruptedException {
        homePageActions.Go_button();



    }
    @Test(priority = 3, testName = "TC_SearchResultPage_03", description = "\"It should get redirect to category (L1) page\n" +
            "\" ")
    public void Validate_Resource_link() throws InterruptedException {
        homePageActions.Resource_link();


    }





    @Test(priority = 4, testName = "TC_SearchResultPage_06", description = "It should open a 'Request a Quote' popup with captcha\n"
    )
    public void Validate_RAQ() throws InterruptedException {
        homePageActions.RAQ_form_Auto();
        homePageActions.RAQ_valid();



    }
    @Test(priority = 5, testName = "TC_SearchResultPage_07", description = "To validate the functionality of 'Add to Compare'\n"
    )
    public void Validate_add_to_compare() throws InterruptedException {
        homePageActions.Add_to_compare();



    }
    @Test(priority = 6, testName = "TC_SearchResultPage_08", description = "To validate 'Go' button with hover effect\n"
    )
    public void Validate_Go() throws InterruptedException {
        homePageActions.Click_go();



    }
    @Test(priority = 7, testName = "TC_SearchResultPage_09", description = "To validate  ascending and descending arrow button from search auto popup\n"
    )
    public void Validate_Acsending() throws InterruptedException {
        homePageActions.Assending_order_search();



    }


    @Test(priority = 8, testName = "TC_SearchResultPage_10", description = "To validate search result page\n"
            )
    public void Validate_search_plp_page() throws InterruptedException {
        homePageActions.Search_PLP_page();
    }
        @Test(priority = 9, testName = "TC_SearchResultPage_11", description = "To validate search result page for arrow button\n")
        public void Validate_Assending() throws InterruptedException {
            homePageActions.Assending_order();
        }
    @Test(priority = 10, testName = "TC_SearchResultPage_12", description = "To validate search result page for sort by filter\n")
    public void Validate_Sort_by_filter() throws InterruptedException {
        homePageActions.Show();
    }
    @Test(priority = 11, testName = "TC_SearchResultPage_13", description = "To verify the 'Learn More' button\n")
    public void Validate_Learn_more_hover() throws InterruptedException {
        homePageActions.Learn_more_hover();
    }
    @Test(priority = 12, testName = "TC_SearchResultPage_14", description = "To validate functionality of Request a quote icon\n")
    public void Validate_RAQ_form() throws InterruptedException {
        homePageActions.RAQ_form();
    }
    @Test(priority = 13, testName = "TC_SearchResultPage_15", description = "To validate request a quote form for empty data\n")
    public void Validate_RAQ_form_empty() throws InterruptedException {
        homePageActions.RAQ_blank();
    }
    @Test(priority = 14, testName = "TC_SearchResultPage_16", description = "To validate request a quote form for valid data\n")
    public void Validate_RAQ_form_valid() throws InterruptedException {
        homePageActions.RAQ_valid();
    }
    @Test(priority = 15, testName = "TC_SearchResultPage_17", description = "To validate functionality of Add to compare icon\n")
    public void Validate_ADD_to_compare() throws InterruptedException {
        homePageActions.Add_to_compare1();
    }


    @Test(priority = 16, testName = "TTC_SearchResultPage_19\n", description = "To verify the 'Learn More' button\n ")
    public void Validate_clearall() throws InterruptedException {
        homePageActions.Filter();
        homePageActions.Product_clearall();
    }

        @Test(priority = 17, testName = "TC_SearchResultPage_18\n", description = "To verify the 'Learn More' button\n ")
        public void Validate_ProductName() throws InterruptedException {
            homePageActions.Product_nametest();
        }

    }




