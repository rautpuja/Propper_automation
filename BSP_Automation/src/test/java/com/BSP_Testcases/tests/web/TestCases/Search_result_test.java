package com.BSP_Testcases.tests.web.TestCases;

import com.BSP_Testcases.core.BaseConfiguration;
import com.BSP_Testcases.page.actions.web.LoginPage;
import com.BSP_Testcases.page.actions.web.MyAccountPage;
import com.BSP_Testcases.page.actions.web.TestCases.Search_result_page;
import com.BSP_Testcases.page.validators.web.LoginValidator;
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
    @Test (priority = 0,testName = "TC_SRP_01", description = "To validate search autopop up")
    public void Validate_search_pop_up() throws InterruptedException {
        homePageActions.search_pop_up();

    }

    @Test (priority = 1,testName = "TC_SRP_02", description = "To validate sort by filter")
    public void Validate_sort_by_filter() throws InterruptedException {
        homePageActions.sort_by_filter();

    }
    @Test (priority = 2,testName = "TC_SRP_03", description = "To validate ascending and descending order arrow icon")
    public void Validate_ascending_descending_arrow() throws InterruptedException {
        homePageActions.acsending_and_descending_arrows();

    }
    @Test (priority = 3,testName = "TC_SRP_04", description = "To validate ascending and descending order arrow icon functionality")
    public void Validate_ascending_descending_arrow_functionality() throws InterruptedException {
        homePageActions.acsending_and_descending_arrows();

    }
    @Test (priority = 4,testName = "TC_SRP_05", description = "To validate product information")
    public void Validate_product_information() throws InterruptedException {
        homePageActions.product_information();

    }
    @Test (priority = 5,testName = "TC_SRP_06", description = "To validate filter option")
    public void Validate_filter_option() throws InterruptedException {
        homePageActions.filter_option();

    }
    @Test (priority = 6,testName = "TC_SRP_07", description = "To validate Filter option checkbox")
    public void Validate_filter_option_checkbox() throws InterruptedException {
        homePageActions.Checkbox_from_filter();

    }
    @Test (priority = 7,testName = "TC_SRP_08", description = "To validate Clear all selected option ")
    public void Validate_filter_option_clear_all_selected() throws InterruptedException {
        homePageActions.clear_all_searchaut_popup_login();

    }
    @Test (priority = 8,testName = "TC_SRP_09", description = "To validate Cross icon ")
    public void Validate_filter_option_cross_icon() throws InterruptedException {
        homePageActions.Cross_icon();

    }
    @Test (priority = 9,testName = "TC_SRP_10", description = "To validate Product name link redirection ")
    public void Validate_product_name_link() throws InterruptedException {
        homePageActions.Product_name_link();

    }
    @Test (priority = 10,testName = "TC_SRP_11", description = "To validate search result page.")
    public void Validate_search_result_page() throws InterruptedException {
        homePageActions.search_result_page();

    }

    @Test (priority = 11,testName = "TC_SRP_12", description = "To verify the breadcrumb of product detail page")
    public void Validate_breadcrumb() throws InterruptedException {
        homePageActions.search_result_page_breadcrumb();

    }
    @Test (priority = 12,testName = "TC_SRP_13", description = "To validate main category name.")
    public void Validate_main_category_name() throws InterruptedException {
        homePageActions.main_category_name();

    }
    @Test (priority = 13,testName = "TC_SRP_14", description = "To verify 'Read more' link on below sorter of the page")
    public void Validate_read_more_link() throws InterruptedException {
        homePageActions.Read_more_link();

    }
    @Test (priority = 14,testName = "TC_SRP_15", description = "To validate sorter of products")
    public void Validate_sorter_of_the_product() throws InterruptedException {
        homePageActions.sorter_option();

    }
    @Test (priority = 15,testName = "TC_SRP_16", description = "To validate the functionality of sorter options of products")
    public void Validate_sorter_option() throws InterruptedException {
        homePageActions.sorter_option_selection();

    }
    @Test (priority = 16,testName = "TC_SRP_17", description = "To verify product image, product name")
    public void Validate_product_image() throws InterruptedException {
        homePageActions.product_image();

    }
    @Test (priority = 17,testName = "TC_SRP_18", description = "To validate the functionality of product image, product name")
    public void Validate_product_image_link() throws InterruptedException {
        homePageActions.product_image_link();

    }
    @Test (priority = 18,testName = "TC_SRP_19", description = "To validate functionality of add to wishlist button")
    public void Validate_wishlist() throws InterruptedException {
        homePageActions.wishlist_link();

    }
    @Test (priority = 19,testName = "TC_SRP_20", description = "To validate the filters section")
    public void Validate_filter_option_srp() throws InterruptedException {
        homePageActions.filter_option_SRP();

    }

    @Test (priority = 20,testName = "TC_SRP_21", description = "To validate 'clear all selected' filter")
    public void Validate_clear_all_link() throws InterruptedException {
        homePageActions.clear_all_option();

    }
    @Test (priority = 21,testName = "TC_SRP_22", description = "To validate the filter '-' button")
    public void Validate_minimize_option() throws InterruptedException {
        homePageActions.minimize_filter();

    }
    @Test (priority = 22,testName = "TC_SRP_23", description = "To validate the filter '+' button")
    public void Validate_maximized_option() throws InterruptedException {
        homePageActions.maximize_filter();

    }

    @Test (priority = 23,testName = "TC_SRP_24", description = "To validate the filter 'Show More' button")
    public void Validate_show_more_option() throws InterruptedException {
        homePageActions.showmore_option();

    }

    @Test (priority = 24,testName = "TC_SRP_25", description = "To validate the filter 'Show Less' button")
    public void Validate_show_less_option() throws InterruptedException {
        homePageActions.showless_option();

    }
    @Test (priority = 25,testName = "TC_SRP_26", description = "To validate the functionality of 'Showing Items 1-30 of 2849 results' filter below the all product")
    public void Validate_show_filter_option() throws InterruptedException {
        homePageActions.show_filter();

    }
    @Test (priority = 26,testName = "TC_SRP_27", description = "To verify the functionality of 'Showing Items 1-30 of 2849 results' filter")
    public void Validate_show_filter_select() throws InterruptedException {
        homePageActions.show_filter_select();

    }
    @Test (priority = 27,testName = "TC_SRP_28", description = "To verify 'Pagination'for number ending")
    public void Validate_pagination_filter() throws InterruptedException {
        homePageActions.pagination();

    }
    @Test (priority = 28,testName = "TC_SRP_29", description = "To verify 'Pagination' redirection")
    public void Validate_pagination_filter_select() throws InterruptedException {
        homePageActions.pagination_button();

    }
}




