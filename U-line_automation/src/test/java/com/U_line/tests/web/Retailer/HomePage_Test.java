package com.U_line.tests.web.Retailer;

import com.U_line.core.BaseConfiguration;
import com.U_line.page.actions.web.LoginPage;
import com.U_line.page.actions.web.MyAccountPage;
import com.U_line.page.actions.web.Retailer.HomePage_Page;
//import com.U_line.page.actions.web.Servicer.Checkout_page;
import com.U_line.page.validators.web.LoginValidator;
//import com.U_line.tests.web.Servicer.Checkout_Test;
//import jdk.javadoc.internal.doclets.formats.html.markup.Links;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//import java.awt.*;
//import java.util.ArrayList;
import java.util.List;
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

        @Test(priority = 0, testName = "TC_Homepage_01", description = "\"1. To validate whether U-Line logo is present in the header section.\n" +
            "2.To validate whether after click on U-Line logo it redirect to home page.\"")
    public void Validate_Homepage_logo() throws InterruptedException {
       homePageActions.Home_page_logo();


    }

    @Test(priority = 1, testName = "TC_Homepage_02", description = "To validate the sticky header")
    public void Validate_Sticky_header() throws InterruptedException {
        homePageActions.product();
        homePageActions.parts_and_accessories();
        homePageActions.Support();
        homePageActions.Find_Locally();
        homePageActions.Uline_lifestyle();

    }
    @Test(priority = 2, testName = "TC_Homepage_03", description = "To validate the search icon in the header section.")
    public void Validate_Search_icon() throws InterruptedException {
        homePageActions.Search_icon();


    }
    @Test(priority = 3, testName = "TC_Homepage_04", description = "To validate the functionality of Search when do not enter data in search text box.")
    public void Validate_Search_icon_with_blankdata() throws InterruptedException {

        homePageActions.Search_box();


    }
    @Test(priority = 4, testName = "TC_Homepage_05", description = "To validate the functionality of Search for invalid data.")
    public void Validate_Search_icon_for_invaliddata() throws InterruptedException {
        homePageActions.Search_box_invalid_data();


    }
    @Test(priority = 5, testName = "TC_Homepage_06", description = "To validate the functionality of Search for valid data.")
    public void Validate_Search_for_validdata() throws InterruptedException {
        homePageActions.Search_box_valid_data();


    }
    @Test(priority = 6, testName = "TC_Homepage_07", description = "To validate the functionality of mini cart icon")
    public void Validate_Mini_cart() throws InterruptedException {

        homePageActions.Mini_cart();


    }
    @Test(priority = 7, testName = "TC_Homepage_08", description = "To validate the functionality of 'Remove' from mini cart")
    public void Validate_Remove_minicart() throws InterruptedException {
        homePageActions.Parts_and_accessories();
        homePageActions.SerialNumber();

        homePageActions.addtocart();
        homePageActions.viewcart();
        Thread.sleep(10000);
        homePageActions.Cross_button();



    }
    @Test(priority = 8, testName = "TC_Homepage_09", description = "To validate the functionality of mini cart popup for cancel button")
    public void Validate_minicart_for_cancel_button() throws InterruptedException {
//        homePageActions.Cancel_button();


    }
    @Test(priority = 9, testName = "TC_Homepage_10", description = "To validate the functionality of mini cart popup for 'Ok' buttons")
    public void Validate_minicart_ok_button() throws InterruptedException {
        homePageActions.Ok_tab();


    }
    @Test(priority = 10, testName = "TC_Homepage_11", description = "To validate the functionality of mini cart for view and edit cart")
    public void Validate_View_and_edit_cart() throws InterruptedException {
        homePageActions.view_and_edit_cart();
        Thread.sleep(10000);



    }
    @Test(priority = 11, testName = "TC_Homepage_12", description = "To validate the functionality of bullets of banners ")
    public void Validate_Bullet_banner() throws InterruptedException {
        System.out.println("To validate the functionality of bullets of banners ");


    }
    @Test(priority = 12, testName = "TC_Homepage_13", description = "\"To validate the Main Banner.\n" +
            "To validate the functionality of bullets of banners \"")
    public void Validate_Learn_more() throws InterruptedException {
        homePageActions.Bullet_tab_1();


    }
    @Test(priority = 13, testName = "TC_Homepage_14", description = "To validate the functionality of 'Explore' button of secondbanner")
    public void Validate_explopre_more() throws InterruptedException {
homePageActions.Bullet_tab_2();

    }
    @Test(priority = 14, testName = "TC_Homepage_15", description = "To validate the functionality of 'Shop Now' button of third banner")
    public void Validate_Shopnow() throws InterruptedException {
        homePageActions.Bullet_tab_3();


    }
    @Test(priority = 15, testName = "TC_Homepage_16", description = "To validate the functionality of 'View The Collection' button of fourth banner")
    public void Validate_view_the_collection() throws InterruptedException {
        homePageActions.bullet_tab_4();


    }
        @Test(priority = 16, testName = "TC_Homepage_17", description = "To verify 'Browse Products' tiles of body below main banner")
    public void Validate_Find_the_perfect_fit() throws InterruptedException {
        homePageActions.Find_perfect_fit();


    }
    @Test(priority = 17, testName = "TC_Homepage_18", description = "To verify 'Find Locally ' tiles of body below main banner")
    public void Validate_Find_locally() throws InterruptedException {
        homePageActions.Zip_code();


    }
    @Test(priority = 18, testName = "TC_Homepage_19", description = "To verify 'Register Your Product' tiles of body below main banner")
    public void Validate_Register_our_product_tile() throws InterruptedException {
        homePageActions.Registration_page();


    }
    @Test(priority = 19, testName = "TC_Homepage_20", description = "To verify 'Parts & Accessories' tiles of body below main banner")
    public void Validate_Order_now() throws InterruptedException {
        homePageActions.Order_now();


    }
    @Test(priority = 20, testName = "TC_Homepage_21", description = "To verify 'We Are U-Line' section of body below title")
    public void Validate_We_are_u_line_section() throws InterruptedException {
        homePageActions.Read_our_story();


    }


    @Test(priority = 29, testName = "TC_Homepage_35", description = "To validate the 'social media' icons from footer section.")
    public void Validate_Social_media_icon() throws InterruptedException {

        homePageActions.Social_media_icon_FB();
        homePageActions.Social_media_icon_Twitter();
        homePageActions.Social_media_icon_You_tube();
        homePageActions.Social_media_icon_Linkedin();
        homePageActions.Social_media_icon_Pinrest();
        homePageActions.Social_media_icon_Insta();
        // homePageActions.Social_media_icon_Houzz();


    }
//
//
//
    @Test(priority = 21, testName = "TC_Homepage_26", description = "To verify 'Enjoy Like Never Before' section below 'Our Product Categories' section")
    public void Validate_Buy_now() throws InterruptedException {
        homePageActions.Buy_now();
//        String oldTab = driver.getWindowHandle();
//        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
//        newTab.remove(oldTab);
//        driver.switchTo().window(oldTab);

    }
//
    @Test(priority = 22, testName = "TC_Homepage_27", description = "To verify  'All New Ice' section below 'Our Product Categories' section")
    public void Validate_Explore() throws InterruptedException {
        homePageActions.Explore_thumbnail();


    }

    @Test(priority = 23, testName = "TC_Homepage_29", description = "\"1. To verify 'The Latest' section\n" +
            "2.To verify hover effect on 'The Latest' section\"")
    public void Validate_View_the_collection() throws InterruptedException {
        homePageActions.View_the_collection_thumbnail();


    }

    @Test(priority = 24, testName = "TC_Homepage_30", description = "To verify 'U-Line Lifestyle' section")
    public void Validate_Follow() throws InterruptedException {
        homePageActions.Follow_thumbnail();


    }

    @Test(priority = 25, testName = "TC_Homepage_31", description = "To verify 'Continuing Education' section")
    public void Validate_Learn_more_thumbnail() throws InterruptedException {
        homePageActions.Learn_more_thumbnail();


    }
    @Test(priority = 26, testName = "TC_Homepage_36", description = "To validate the suscribe button from section for blank data")
    public void Validate_subscribe_button_blank() throws InterruptedException {
        homePageActions.Email_subsrcibe_blank();}
    @Test(priority = 27, testName = "TC_Homepage_37", description = "To validate the suscribe button from section for Invalid data")
    public void Validate_subscribe_button_invalid() throws InterruptedException {
        homePageActions.Email_subsribe_invalid();


    }
    @Test(priority = 28, testName = "TC_Homepage_38", description = "To validate the suscribe button from section for valid data")
    public void Validate_subscribe_button_valid() throws InterruptedException {
        homePageActions.Email_subsribe_valid();


   }
    @Test(priority = 30, testName = "TC_Homepage_39", description = "To validate the 'Products' links from footer section.")
    public void Validate_Product_links_from_footer_section() throws InterruptedException {
homePageActions.Product_registration_footer();
    }

    @Test(priority = 31, testName = "TC_Homepage_40", description = "To validate the 'Resources' links from footer section.")
    public void Validate_Resourses_link() throws InterruptedException {

     homePageActions.resources_link_footer();
    }


    @Test(priority = 32, testName = "TC_Homepage_41", description = "To validate the 'Support' links from footer section.")
    public void Validate_Supports_link_from_footer() throws InterruptedException {
        homePageActions.Support_link_footer();

    }

    @Test(priority = 33, testName = "TC_Homepage_42", description = "To validate 'Top' button")
    public void Validate_Top_arrow_button() throws InterruptedException {
     Thread.sleep(10000);


      homePageActions.Top_button();

    }

}
