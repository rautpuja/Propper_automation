package com.Marvel.tests.web.Servicer;

import com.Marvel.core.BaseConfiguration;
import com.Marvel.page.actions.web.LoginPage;
import com.Marvel.page.actions.web.MyAccountPage;
import com.Marvel.page.actions.web.Servicer.Contact_us_page;
import com.Marvel.page.validators.web.LoginValidator;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Contact_us_test extends BaseConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(Contact_us_test.class);

    private LoginPage loginACtions;
    private Contact_us_page homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;


    @BeforeClass
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        loginACtions = new LoginPage(driver);
        homePageActions = new Contact_us_page(driver);
        myAccountPage = new MyAccountPage(driver);
        loginValidator = new LoginValidator();

    }

    @Test(priority = 0, testName = "", description = "To validate the functionality of 'login' ")
    public void Validate_providerlogin() throws InterruptedException {

        homePageActions.providerlogin();
        homePageActions.setemail(username);

        homePageActions.setPassword(password);

        Thread.sleep(3000);
        homePageActions.clickSubmit();
        System.out.println("Provider login successfull");
    }

    @Test(priority = 1, testName = "TC_Contactus-01", description = "It should get redirect to the respective page.")
    public void Contact_us() throws InterruptedException {
        homePageActions.Contact_us();

    }
    @Test(priority = 2, testName = "TC_Contactus-02", description = "To validate the functionality of breadcrumb of contact us")
    public void Contact_us_breadcrumb() throws InterruptedException {
        homePageActions.Breadcrumb();

    }
    @Test(priority = 3, testName = "TC_Contactus-03", description = "To validate the Banner.")
    public void Contact_us_title() throws InterruptedException {
        homePageActions.banner();

    }
    @Test(priority = 4, testName = "TC_Contactus-04", description = "To validate the 'How may we help you?' dropdown")
    public void Contact_us_dropdown_list_of_How_may_we_help_section() throws InterruptedException {
        homePageActions.How_may_we_help_section();

    }
    @Test(priority = 5, testName = "TC_Contactus-19", description = "To validate the 'Contact US' functionality when mandatory fields are kept empty.")
    public void I_have_question_about_marvel_dropdown() throws InterruptedException {
        homePageActions.I_HAVE_QUESTION_ABOUT_MARVEL_blank();

    }
    @Test(priority = 6, testName = "TC_Contactus-20", description = "To validate the 'Contact Us' functionality for invalid data")
    public void I_have_question_about_marvel_dropdown_invalid() throws InterruptedException {
        homePageActions.I_HAVE_QUESTION_ABOUT_MARVEL_invalid();

    }
    @Test(priority = 7, testName = "TC_Contactus-16", description = "To validate the 'Contact Us' functionality with valid data.")
    public void I_have_question_about_marvel_dropdown_valid() throws InterruptedException {
        homePageActions.I_HAVE_QUESTION_ABOUT_MARVEL_valid();

    }
    @Test(priority = 8, testName = "TC_Contactus-05", description = "To validate the option 'I have a question about a Marvel product' in 'How may we help you?' dropdown")
    public void Dropdown2nd_option_() throws InterruptedException {
        homePageActions.Dropdown_2nd_option_blank();
        homePageActions.Dropdown_2nd_option_invalid();
        homePageActions.Dropdown_2nd_option_valid();

    }
    @Test(priority = 9, testName = "TC_Contactus-06", description = "To validate the option 'I am looking for a Marvel dealer' in 'How may we help you?' dropdown")
    public void Dropdown_3rd_option() throws InterruptedException {
        homePageActions.Dropdown_3rd_option_();

    }
    @Test(priority = 10, testName = "TC_Contactus-07", description = "To validate the option 'I want to register my Marvel product' in 'How may we help you?' dropdown")
    public void Dropdown_4th_option() throws InterruptedException {
        homePageActions.Dropdown_4th_option_();

    }
    @Test(priority = 11, testName = "TC_Contactus-18", description = "To validate the functionality of attachment")
    public void Dropdown_4th_option_browse() throws InterruptedException {
        homePageActions.Dropdown_4th_option_browse();

    }
    @Test(priority = 12, testName = "TC_Contactus-08", description = "To validate the option 'I need service on my Marvel product' in 'How may we help you?' dropdown")
    public void Dropdown_5th_option() throws InterruptedException {
        homePageActions.Dropdown_5th_option_();

    }
    @Test(priority = 13, testName = "TC_Contactus-11", description = "To validate the option 'I am a member of the media and I need some information' in 'How may we help you?' dropdown")
    public void Dropdown_6th_option() throws InterruptedException {
        homePageActions.Dropdown_6th_option_();

    }
    @Test(priority = 14, testName = "TC_Contactus-12", description = "To validate the option 'I would like to become a servicer for Marvel' in 'How may we help you?' dropdown")
    public void Dropdown_7th_option() throws InterruptedException {
        homePageActions.Dropdown_7th_option_();

    }
    @Test(priority = 15, testName = "TC_Contactus-13", description = "To validate the option 'I would like to become a dealer for Marvel' in 'How may we help you?' dropdown")
    public void Dropdown_8th_option() throws InterruptedException {
        homePageActions.Dropdown_7th_option_();

    }
    @Test(priority = 16, testName = "TC_Contactus-14", description = "To validate the option 'Other' in 'How may we help you?' dropdown")
    public void Dropdown_Other_option() throws InterruptedException {
        homePageActions.Dropdown_other_option_();

    }
    @Test(priority = 16, testName = "TC_Contactus-15", description = "To validate the radio button ")
    public void Dropdown_Other_option_radio_button() throws InterruptedException {
        homePageActions.Dropdown_other_option_radio_button();

    }


}
