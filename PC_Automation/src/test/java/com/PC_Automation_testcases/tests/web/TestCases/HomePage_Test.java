package com.PC_Automation_testcases.tests.web.TestCases;

import com.PC_Automation_testcases.core.BaseConfiguration;
import com.PC_Automation_testcases.page.actions.web.LoginPage;
import com.PC_Automation_testcases.page.actions.web.MyAccountPage;
import com.PC_Automation_testcases.page.actions.web.TestCases.HomePage_Page;
import com.PC_Automation_testcases.page.validators.web.LoginValidator;
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
    @Test (priority = 0,testName = "TC_01", description = "Click on subscribe pop up")
    public void Validate_Subscribe() throws InterruptedException {
        homePageActions.Subscribe();

    }
//
//    @Test(priority = 1, testName = "TC_Homepage_01", description = "To validate notice text mentioned on top of header section")
//    public void Validate_Notice() throws InterruptedException {
//        homePageActions.Home_page_logo();
//
//
//    }

    @Test(priority = 2, testName = "TC_Homepage_02", description = "To validate whether Platinumcode logo is present in the header section.")
    public void Validate_logo() throws InterruptedException {

        homePageActions.logo();


    }
//        @Test(priority = 3, testName = "TC_Homepage_05", description = "To validate the search text box in the header section.")
//    public void Validate_Search_icon() throws InterruptedException {
//
//        homePageActions.Search_icon();
//
//
//    }
//       @Test(priority = 4, testName = "TC_Homepage_07", description = "To validate the functionality of Search for valid data.")
//    public void Validate_Search_for_Invaliddata() throws InterruptedException {
//        homePageActions.Search_icon_invalid();
//
//
//    }
//    @Test(priority = 5, testName = "TC_Homepage_06", description = "To validate the functionality of Search when do not enter data in search text box.\n")
//    public void Validate_Search_icon_for_blank() throws InterruptedException {
//        homePageActions.Search_icon();
//
//
//    }
//
//    @Test(priority = 6, testName = "TC_Homepage_08", description = "To validate the functionality of Search when valid data entered in Search text box.\n")
//    public void Validate_Search_for_validdata() throws InterruptedException {
//        homePageActions.Search_box_valid_data();
//
//
//    }
    @Test(priority = 7, testName = "TC_Homepage_09", description = "To validate the functionality of mini cart icon with products")
    public void Validate_Mini_cart() throws InterruptedException {
        homePageActions.Addtocart();
        homePageActions.view_cart();


    }


    @Test(priority = 8, testName = "TC_Homepage_14", description = "To validate the functionality of mini cart if product is added in cart\n")
    public void Validate_View_and_edit_cart() throws InterruptedException {
        homePageActions.view_and_edit_cart();

    }
    @Test(priority = 9, testName = "TC_Homepage_16", description = "To validate the Main Menu bar in the Header section.")
    public void Validate_dropdown() throws InterruptedException {
        homePageActions.dropdown();


    }
    @Test(priority = 10, testName = "TC_Homepage_17", description = "To validate the Main Menu Drop down in the header section.")
    public void Validate_dropdown_redirection() throws InterruptedException {
        homePageActions.dropdown_redirection();


    }
    @Test(priority = 11, testName = "TC_Homepage_18", description = "To validate the functionality of drop-down navigation.")
    public void Validate_dropdown_Subcategory_redirection() throws InterruptedException {
        homePageActions.dropdown_Submenu_redirection();


    }

    @Test(priority = 12, testName = "TC_Homepage_22", description = "To validate the functionality of 'PPE PRODUCTS NOW AVAILABLE!' banner ")
    public void Validate_Bullet_banner() throws InterruptedException {
        homePageActions.psp_page();


    }
    @Test(priority = 13, testName = "TC_Homepage_23", description = "To validate the functionality of 'Learn More' button of main banner")
    public void Validate_BrawseProduct() throws InterruptedException {
        homePageActions.BrawseProduct();


    }
    @Test(priority = 14, testName = "TC_Homepage_24", description = "To verify 'Resource center' tiles of body below main banner")
    public void Validate_resources() throws InterruptedException {
        homePageActions.resources();

    }
    @Test(priority = 15, testName = "TC_Homepage_25", description = "To verify 'FAQs' tiles of body below main banner")
    public void Validate_FAQ() throws InterruptedException {
        homePageActions.FAQ();


    }
    @Test(priority = 16, testName = "TC_Homepage_26", description = "To verify 'GPO Contracts' tiles of body below main banner")
    public void Validate_GPQ() throws InterruptedException {
        homePageActions.GPQ();


    }
    @Test(priority = 17, testName = "TC_Homepage_27", description = "To verify 'Healthcare Labels & Patient ID Wristbands' section of body below tiles section")
    public void Validate_healthcare() throws InterruptedException {
        homePageActions.Healthcare();


    }
    @Test(priority = 18, testName = "TC_Homepage_28", description = "To verify 'Healthcare Labels & Patient ID Wristbands' section of body below tiles section")
    public void Validate_healthcarelink() throws InterruptedException {
        homePageActions.healthcare_link();
        homePageActions.petiont_id_wristlist();


    }
    @Test(priority = 19, testName = "TC_Homepage_30", description = "To verify 'Disposable tourniquet' section of body below tiles section"
    )
    public void Validate_disposabel_lable_link() throws InterruptedException {
        homePageActions.disposable_turnicates_link();
        homePageActions.Special_disposable_turnicates_link();


    }
    @Test(priority = 20, testName = "TC_Homepage_31", description = "To verify 'Solutions for Your Application' section")
    public void Validate_SolutionFor_yourapplicationsection_link() throws InterruptedException {
        homePageActions.solution_for_your_application_link_pediatrics();
        homePageActions.solution_for_your_application_link_specimencollection();
        homePageActions.solution_for_your_application_link_Laboratory();


    }
    @Test(priority = 21, testName = "TC_Homepage_32", description = "First box should display label 'Solutions for Your Application Featuring Our Latest Collections'")
    public void Validate_solutionFor_yourapplicationsection() throws InterruptedException {
        homePageActions.Solution_for_your_application();


    }


    @Test(priority = 22, testName = "TC_Homepage_33", description = "To verify 'Access Your Saving' section")
    public void Validate_solutionFor_Accessyour_saving() throws InterruptedException {
        homePageActions.solution_for_your_Accessyoursaving();


    }
    @Test(priority = 23, testName = "TC_Homepage_34", description = "To verify the testimonial")
    public void Validate_testmonial_section() throws InterruptedException {
        homePageActions.Testmonial();


    }
    @Test(priority = 24, testName = "TC_Homepage_35", description = "To validate the functionality of testimonial section slide arrow")
    public void Validate_testmonial_section_arrow() throws InterruptedException {
        homePageActions.Testmonial_link();


    }
    @Test(priority = 25, testName = "TC_Homepage_36", description = "To verify  'Our Latest Resources' section below Testimonial section' section")
    public void Validate_our_latest_resource_section() throws InterruptedException {
        // homePageActions.;


    }
    @Test(priority = 26, testName = "TC_Homepage_37", description = "To verify hover effect on 'Our Latest Resources' section below 'Testimonial' section")
    public void Validate_our_latest_resource_section_hover() throws InterruptedException {
             homePageActions.Testmonial_link();


    }
    @Test(priority = 27, testName = "TC_Homepage_38", description = "To verify Turniquates for every pationt section")
    public void Validate_turniquates_setion() throws InterruptedException {
        homePageActions.turnicates_link();


    }
    @Test(priority = 28, testName = "TC_Homepage_39", description = "To verify Alcohol resistent pharmacy label section")
    public void Validate_AlcoholResistencepharmacy() throws InterruptedException {
        homePageActions.AlcoholResistence();


    }
    @Test(priority = 29, testName = "TC_Homepage_40", description = "To verify Covid 19 pandemic responce section")
    public void Validate_covid19() throws InterruptedException {
        homePageActions.covid19();


    }

    @Test(priority = 30, testName = "TC_Homepage_41", description = "To verify 'What’s New at Platinum code' section")
    public void Validate_pandemic() throws InterruptedException {
        homePageActions.platinumCode();


    }
    @Test(priority = 31, testName = "TC_Homepage_42", description = "To verify 'Our Blog' button")
    public void Validate_ourblog() throws InterruptedException {
        homePageActions.our_blog();


    }

    @Test(priority = 32, testName = "TC_Homepage_20", description = "To validate the functionality of left/rigth arrow of banners ")
    public void Validate_Left_right_arrow() throws InterruptedException {
        homePageActions.Left_right_arrow();


    }
    @Test(priority = 33, testName = "TC_Homepage_29", description = "To verify 'Disposable tourniquet' section ")
    public void Validate_disposabel() throws InterruptedException {
        homePageActions.Blog();


    }
    @Test(priority = 34, testName = "TC_Homepage_30", description = "To verify 'Disposable tourniquet' section of body below tiles section")
    public void Validate_disposable_link() throws InterruptedException {
        homePageActions.disposable_turnicates_link();
        homePageActions.Special_disposable_turnicates_link();


    }


    @Test(priority = 35, testName = "TC_Homepage_43", description = "To validate the 'social media' icons from footer section.")
    public void Validate_Social_media_icon() throws InterruptedException {
        homePageActions.Social_media_icon_FB();
        homePageActions.Social_media_icon_Twitter();
        homePageActions.Social_media_icon_You_tube();
        homePageActions.Social_media_icon_Linkedin();






    }

    @Test(priority = 37, testName = "TC_Homepage_44", description = "To validate the Email Icon (suscribe button) from section")
    public void Validate_subscribe_button_blank() throws InterruptedException {
        homePageActions.Email_subsrcibe_blank();


    }
    @Test(priority = 38, testName = "TC_Homepage_45", description = "To validate the suscribe button from section for Invalid data")
    public void Validate_subscribe_button_invalid() throws InterruptedException {
        homePageActions.Email_subsribe_invalid();


    }
    @Test(priority = 39, testName = "TC_Homepage_46", description = "To validate the suscribe button from section for valid data")
    public void Validate_subscribe_button_valid() throws InterruptedException {
        homePageActions.Email_subsribe_valid();


    }


    @Test(priority = 40, testName = "TC_Homepage_47", description = "To validate address section")
    public void Validate_support_footer() throws InterruptedException {
        homePageActions.Address_footer();


    }
    @Test(priority = 41, testName = "TC_Homepage_48", description = "To validate the 'PRODUCTS' links from footer section.\n")
    public void Validate_Buy_now() throws InterruptedException {
        homePageActions.Footer_product();


    }

    @Test(priority = 42, testName = "TC_Homepage_10", description = "To validate the functionality of mini cart icon with products for login user")
    public void Validate_Login() throws InterruptedException {
        homePageActions.login_minicart(username,password);


    }
    @Test(priority = 43, testName = "TC_Homepage_11", description = "To validate the functionality of 'Remove' from mini cart")
    public void Validate_Login_remove() throws InterruptedException {
     //   homePageActions.;


    }
//    @Test(priority = 44, testName = "TC_Homepage_14", description = "To validate the functionality of mini cart popup for 'Edit item icon")
//    public void Validate_Login_edit() throws InterruptedException {
//        homePageActions.edit_tab();
//
//
//    }
    @Test(priority = 45, testName = "TC_Homepage_16", description = "To validate the functionality of mini cart if product is added in cart")
    public void Validate_Login_VIEWandedit() throws InterruptedException {
        homePageActions.viewandedit_tab();


    }

    @Test(priority = 46, testName = "TC_Homepage_15", description = "To validate checkout button from mini cart")
    public void Validate_Login_Checkout() throws InterruptedException {
        homePageActions.checkout_tab();


    }

    @Test(priority = 47, testName = "TC_Homepage_12", description = "To validate the functionality of mini cart popup for 'Delete' icon")
    public void Validate_Login_Delete() throws InterruptedException {
        homePageActions.delete_tab();


    }

    @Test(priority = 48, testName = "TC_Homepage_13", description = "To validate the functionality of mini cart popup for 'Ok' buttons")
    public void Validate_Login_ok() throws InterruptedException {
        homePageActions.Ok_tab();


    }











}
