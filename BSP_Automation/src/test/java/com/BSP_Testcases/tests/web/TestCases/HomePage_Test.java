package com.BSP_Testcases.tests.web.TestCases;

import com.BSP_Testcases.core.BaseConfiguration;
import com.BSP_Testcases.page.actions.web.LoginPage;
import com.BSP_Testcases.page.actions.web.MyAccountPage;
import com.BSP_Testcases.page.actions.web.TestCases.HomePage_Page;
import com.BSP_Testcases.page.validators.web.LoginValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomePage_Test extends BaseConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(HomePage_Test.class);

    private LoginPage loginACtions;
    private HomePage_Page homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;


    @BeforeClass
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        loginACtions = new LoginPage(driver);
        homePageActions = new HomePage_Page(driver);
        myAccountPage = new MyAccountPage(driver);
        loginValidator = new LoginValidator();

    }
    @Test (priority = 0,testName = "TC_Homepage_01", description = "To validate first notice text mentioned on top of header section")
    public void Validate_Notice_text_from_header() throws InterruptedException {
        homePageActions.Notice_text();

    }

    @Test (priority = 1,testName = "TC_Homepage_02", description = "To validate 'Browse PPE' button/link with notice text mentioned on top of header section")
    public void Validate_Brawse_ppe_link() throws InterruptedException {
        homePageActions.PPE_button();

    }
    @Test (priority = 2,testName = "TC_Homepage_03", description = "To validate second notice text mentioned below the first notice text")
    public void Validate_Notice_2() throws InterruptedException {
        homePageActions.Notice_text2();

    }
    @Test (priority = 3,testName = "TC_Homepage_04", description = "To validate 'Learn More' link with second notice text mentioned on top of header section")
    public void Validate_Learn_more_link() throws InterruptedException {
        homePageActions.Learn_more_link();

    }

    @Test (priority = 4,testName = "TC_Homepage_05", description = "To validate whether BSP logo is present in the header section.")
    public void Validate_Homepage_logo() throws InterruptedException {
        homePageActions.Homepage_logo();

    }
    @Test (priority = 5,testName = "TC_Homepage_06", description = "To validate the search text box in the header section.")
    public void Validate_searchTextbox() throws InterruptedException {
        homePageActions.Search_text_box();

    }
    @Test (priority = 6,testName = "TC_Homepage_07", description = "To validate the functionality of Search for empty data.")
    public void Validate_searchTextbox_blank() throws InterruptedException {
        homePageActions.Search_text_box_blank();

    }
    @Test (priority = 7,testName = "TC_Homepage_08", description = "To validate the functionality of Search for invalid data.")
    public void Validate_searchTextbox_invalid() throws InterruptedException {
        homePageActions.Search_text_box_invalid();

    }
    @Test (priority = 8,testName = "TC_Homepage_09", description = "To validate the functionality of Search for valid data.")
    public void Validate_searchTextbox_valid() throws InterruptedException {
        homePageActions.Search_text_box_valid();

    }
    @Test (priority = 9,testName = "TC_Homepage_10", description = "To validate the functionality 'Chat Now' link of 'Chat with us' right hand side of search text box ")
    public void Validate_chat_now() throws InterruptedException {
        homePageActions.Chat_now_link();

    }
    @Test (priority = 10,testName = "TC_Homepage_11", description = "To validate the functionality '888-206-3047' of 'Talk To Us' right hand side of chat with us ")
    public void Validate_Phone_number() throws InterruptedException {
        homePageActions.Phone_number();

    }
    @Test (priority = 11,testName = "TC_Homepage_12", description = "To validate the Main Menu bar in the Header section.")
    public void Validate_main_menu() throws InterruptedException {
        homePageActions.Header_mega();

    }
    @Test (priority = 12,testName = "TC_Homepage_13", description = "To validate the Main Menu Drop down in the header section.")
    public void Validate_main_menu_dropdown() throws InterruptedException {
        homePageActions.mega_menu();

    }
    @Test (priority = 13,testName = "TC_Homepage_14", description = "To validate the functionality of drop-down navigation.")
    public void Validate_main_menu_Submenu_drompdown() throws InterruptedException {
        homePageActions.mega_menu_submenu();

    }
    @Test (priority = 14,testName = "TC_Homepage_15", description = "To verify the Main Banner.")
    public void Validate_main_banner() throws InterruptedException {
        homePageActions.Verify_main_menu();

    }
    @Test (priority = 15,testName = "TC_Homepage_16", description = "To validate the Banners.")
    public void Validate_main_banner_link() throws InterruptedException {
        homePageActions.Verify_main_banner_link();

    }
    @Test (priority = 16,testName = "TC_Homepage_17", description = "To verify the 'Promo Banner' below the main banner")
    public void Validate_Promo_of_the_banner() throws InterruptedException {
        homePageActions.Verify_promo();

    }
    @Test (priority = 17,testName = "TC_Homepage_18", description = "To verify the 'Top Categories' section below the promo banner")
    public void Validate_Top_categories() throws InterruptedException {
        homePageActions.Verify_top_categories_section();

    }
    @Test (priority = 18,testName = "TC_Homepage_19", description = "To validate the functionality of 'Featured Products' section below the top categories")
    public void Validate_Feature_products() throws InterruptedException {
        homePageActions.Verify_Featured_product();

    }
    @Test (priority = 19,testName = "TC_Homepage_20", description = "To validate the functionality of 'Add to Wish List' button in 'Featured Products' section")
    public void Validate_add_to_wish_list() throws InterruptedException {
        homePageActions.Verify_add_to_wishlist();

    }
    @Test (priority = 20,testName = "TC_Homepage_21", description = "To validate the functionality of 'View the fav 50 >' link in 'Featured Products' section")
    public void Validate_view_50() throws InterruptedException {
        homePageActions.Verify_Top_50_link();

    }
    @Test (priority = 21,testName = "TC_Homepage_22", description = "To verify 'Client Logos' section below the featured product")
    public void Validate_Client_logos() throws InterruptedException {
       // homePageActions.Verify_Top_50_link();

    }
    @Test (priority = 22,testName = "TC_Homepage_23", description = "To verify 'SHOP WITH CONFIDENCE' section below the client logo")
    public void Validate_shop_with_confidence() throws InterruptedException {
        homePageActions.Verify_shop_with_confidence();

    }
    @Test (priority = 23,testName = "TC_Homepage_24", description = "To validate the functionality of 'Have questions?' & 'Meet Our Team >' of 'SHOP WITH CONFIDENCE' section below the client logo")
    public void Validate_have_question_section() throws InterruptedException {
        homePageActions.Verify_phone_number();
        homePageActions.Verify_meet_out_team();

    }
    @Test (priority = 24,testName = "TC_Homepage_25", description = "To validate the 'We’re here to help!' section from footer section.")
    public void Validate_we_are_here_to_help() throws InterruptedException {
        //homePageActions.Verify_Top_50_link();

    }
    @Test (priority = 25,testName = "TC_Homepage_26", description = "To validate the 'More' & 'Follow Us' section from footer section.")
    public void Validate_footer_section() throws InterruptedException {
        homePageActions.Verify_footer_section();

    }
    @Test (priority = 26,testName = "TC_Homepage_27", description = "To validate the 'Better Business Bureau' logo from footer section right side of copy right.")
    public void Validate_better_business_logos() throws InterruptedException {
        homePageActions.Verify_Better_business_logo();

    }
    @Test (priority = 27,testName = "TC_Homepage_28", description = "To validate the 'Norton' logo from footer section right side of copy right.")
    public void Validate_northen_logos() throws InterruptedException {
        homePageActions.Verify_Northan_logo();

    }
    @Test (priority = 28,testName = "TC_Homepage_30", description = "To validate copyright from footer")
    public void Validate_Copy_right() throws InterruptedException {
        homePageActions.Verify_Copyright();

    }
    @Test (priority = 29,testName = "TC_Homepage_31", description = "To validate privacy policy link")
    public void Validate_privacy_policy_link() throws InterruptedException {
        homePageActions.Verify_privacy_policy();

    }

}
