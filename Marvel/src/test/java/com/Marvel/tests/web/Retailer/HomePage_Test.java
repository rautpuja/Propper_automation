package com.Marvel.tests.web.Retailer;

import com.Marvel.core.BaseConfiguration;
import com.Marvel.page.actions.web.LoginPage;
import com.Marvel.page.actions.web.MyAccountPage;
import com.Marvel.page.actions.web.Retailer.HomePage_Page;
import com.Marvel.page.validators.web.LoginValidator;
import com.Marvel.utils.common.Config;
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
    @Test(priority = 0, testName = "TC_Homepage_11", description = "To validate the functionality of product 'Remove' from mini cart\n")
    public void Validate_Remove_minicart() throws InterruptedException {
        homePageActions.Parts_and_accessories1();
        homePageActions.Cross_button();



    }
    @Test(priority = 1, testName = "TC_Homepage_14", description = "To validate the functionality of mini cart if product is added in cart\n")
    public void Validate_View_and_edit_cart() throws InterruptedException {
        homePageActions.view_and_edit_cart();

    }
    @Test(priority = 2, testName = "TC_Homepage_12", description = "To validate the functionality of mini cart popup for cancel button")
    public void Validate_minicart_for_remove_button() throws InterruptedException {
        homePageActions.Cancel_button();


    }

    @Test(priority = 3, testName = "TC_Homepage_15", description = "To validate the functionality of mini cart if product is added in cart for edit button\n")
    public void Validate_edit_button() throws InterruptedException {
        homePageActions.Edit_button();


    }
    @Test(priority = 4, testName = "TC_Homepage_16", description = "To validate Go to checkout button from mini cart\n")
    public void Validate_Checkout_button() throws InterruptedException {
        homePageActions.Go_to_checkout();


    }
    @Test(priority = 5, testName = "TC_Homepage_13", description = "To validate the functionality of mini cart popup for 'Ok' buttons")
    public void Validate_minicart_ok_button() throws InterruptedException {
        homePageActions.Ok_tab();


    }
    @Test(priority = 6, testName = "TC_Homepage_01", description = "To validate whether Marvel logo and banner image is present in the header section.\n")
    public void Validate_Homepage_logo() throws InterruptedException {
        homePageActions.Home_page_logo();


    }

    @Test(priority = 7, testName = "TC_Homepage_02", description = "To validate functionality of registered product\n")
    public void Validate_Registered_product() throws InterruptedException {

        homePageActions.Register_product();


    }
    @Test(priority = 8, testName = "TC_Homepage_03", description = "To validate functionality of blog")
    public void Validate_functionality_blog() throws InterruptedException {
        homePageActions.Blog();


    }
    @Test(priority = 9, testName = "TC_Homepage_04", description = "To validate functionality of login button\n")
    public void Validate_Login() throws InterruptedException {
        homePageActions.Login();


    }

    @Test(priority = 10, testName = "TC_Homepage_05", description = "To validate the functionality of Search when do not enter data in search text box.\n")
    public void Validate_Search_icon() throws InterruptedException {

        homePageActions.Search_icon();


    }
    @Test(priority = 11, testName = "TC_Homepage_06", description = "To validate the functionality of Search when do not enter data in search text box.\n")
    public void Validate_Search_icon_for_blank() throws InterruptedException {
        homePageActions.Search_icon_blank();


    }
    @Test(priority = 12, testName = "TC_Homepage_07", description = "To validate the functionality of Search for valid data.")
    public void Validate_Search_for_Invaliddata() throws InterruptedException {
        homePageActions.Search_icon_invalid();


    }
    @Test(priority = 13, testName = "TC_Homepage_08", description = "To validate the functionality of Search when valid data entered in Search text box.\n")
    public void Validate_Search_for_validdata() throws InterruptedException {
        homePageActions.Search_box_valid_data();


    }
    @Test(priority = 14, testName = "TC_Homepage_09", description = "To validate the functionality of mini cart with empty cart\n")
    public void Validate_Mini_cart() throws InterruptedException {

        homePageActions.Mini_cart();


    }
    @Test(priority = 15, testName = "TC_Homepage_17", description = "To validate the Header Menu bar in the Header section.\n")
    public void Validate_Header_bar_menu() throws InterruptedException {

        homePageActions.Header_menu_bar();


    }


    @Test(priority = 16, testName = "TC_Homepage_18", description = "\"To validate the 'DESIGNED & BUILT IN AMERICA'\n" +
            "section\"\n")
    public void Validate_Build_in_america() throws InterruptedException {
       homePageActions.Build_in_america();


    }
    @Test(priority = 17, testName = "TC_Homepage_19", description = "\"To validate the Categories in the 'DESIGNED & BUILT IN AMERICA' \n" +
            "section\"\n")
    public void Validate_View_button() throws InterruptedException {
        homePageActions.Build_in_america_view();


    }
    @Test(priority = 18, testName = "TC_Homepage_20", description = "To validate the 'TIMELESS EXCELLENCE' section below the 'DESIGNED & BUILT IN AMERICA'  section\n")
    public void Validate_Timelesseccelensse() throws InterruptedException {
      homePageActions.Timeless_excellence();

      }
    @Test(priority = 19, testName = "TC_Homepage_21", description = "To validate the 'TIMELESS EXCELLENCE' section 'Browse' button below the 'DESIGNED & BUILT IN AMERICA'  section\n")
    public void Validate_the_marveldifference() throws InterruptedException {
        homePageActions.Brawse_button();


    }
    @Test(priority = 20, testName = "TC_Homepage_22", description = "To validate the 'LONG LASTING FRESHNESS' section below the 'TIMELESS EXCELLENCE' section\n")
    public void Validate_long_lasting_freshness_section() throws InterruptedException {
        homePageActions.The_marvel_difference_button();


    }
    @Test(priority = 21, testName = "TC_Homepage_23", description = "To validate the 'FROM THE BLOG' section below the 'Timeless Excellence' section \n")
    public void Validate_From_the_blog_section() throws InterruptedException {
        homePageActions.fromtheblog_section();


    }

    @Test(priority = 22, testName = "TC_Homepage_24", description = "To validate the 'FROM THE BLOG' section below the 'Timeless Excellence' section \n")
    public void Validate_Read_More_button_from_the_blog() throws InterruptedException {
        homePageActions.Read_our_story();


    }
    @Test(priority = 23, testName = "TC_Homepage_25", description = "To validate the 'Read More' button in 'From the Blog' section \n")
    public void Validate_Read_more_button_2_from_the_blog() throws InterruptedException {
        homePageActions.Read_our_story2();


    }

    @Test(priority = 24, testName = "TC_Homepage_33", description = "To validate the 'social media' icons from footer section.")
    public void Validate_Social_media_icon() throws InterruptedException {
        homePageActions.Social_media_icon_FB();
        homePageActions.Social_media_icon_Twitter();
        homePageActions.Social_media_icon_You_tube();
        homePageActions.Social_media_icon_Linkedin();
        homePageActions.Social_media_icon_Pinrest();
        homePageActions.Social_media_icon_Houzz();
        homePageActions.Social_media_icon_Insta();




    }



    @Test(priority = 25, testName = "TC_Homepage_30", description = "To validate the suscribe button from section for Invalid data")
    public void Validate_subscribe_button_blank() throws InterruptedException {
        homePageActions.Email_subsribe_blank();


    }
    @Test(priority = 26, testName = "TC_Homepage_31", description = "To validate the suscribe button from section for Invalid data")
    public void Validate_subscribe_button_invalid() throws InterruptedException {
        homePageActions.Email_subsribe_invalid();


    }
    @Test(priority = 27, testName = "TC_Homepage_32", description = "To validate the suscribe button from section for valid data")
    public void Validate_subscribe_button_valid() throws InterruptedException {
        homePageActions.Email_subsribe_valid();


    }


    @Test(priority = 28, testName = "TC_Homepage_26", description = "To validate the 'PRODUCTS' links from footer section.\n")
    public void Validate_Buy_now() throws InterruptedException {
        homePageActions.Footer_product();


    }

    @Test(priority = 29, testName = "TC_Homepage_27", description = "To validate the 'CONSUMERS' links from footer section.\n")
    public void Validate_Footer_consumer_Trade_About() throws InterruptedException {
        homePageActions.Consumer_footer();


    }

    @Test(priority = 30, testName = "TC_Homepage_28", description = "To validate the 'TRADE' links from footer section.\n")
    public void Validate_Trade_footer() throws InterruptedException {
        homePageActions.Trade_footer();


    }
    @Test(priority = 31, testName = "TC_Homepage_29", description = "To validate the 'ABOUT' section links from footer section.\n")
    public void Validate_Aboutus_footer() throws InterruptedException {
        homePageActions.About_footer();


    }

    @Test(priority = 32, testName = "TC_Homepage_34", description = "To validate 'Top' button")
    public void Validate_Top_arrow_button() throws InterruptedException {
        homePageActions.Top_button();


    }

}
