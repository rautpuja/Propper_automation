package com.PC_Automation_testcases.tests.web.TestCases;

import com.PC_Automation_testcases.core.BaseConfiguration;
import com.PC_Automation_testcases.page.actions.web.LoginPage;
import com.PC_Automation_testcases.page.actions.web.MyAccountPage;
import com.PC_Automation_testcases.page.actions.web.TestCases.My_account_Page;
import com.PC_Automation_testcases.page.validators.web.LoginValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class My_account_Test extends BaseConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(My_account_Test.class);

    private LoginPage loginACtions;
    private My_account_Page homePageActions;
    private MyAccountPage myAccountPage;
    private LoginValidator loginValidator;


    @BeforeClass
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        loginACtions = new LoginPage(driver);
        homePageActions = new My_account_Page(driver);
        myAccountPage = new MyAccountPage(driver);
        loginValidator = new LoginValidator();

    }

    @Test(priority = 0, testName = "TC_MyAcc_01", description = "To verify My Account section ")
    public void Validate_Login() throws InterruptedException {
        homePageActions.Subscribe();
        homePageActions.Customerlogin(username,password);
    }




    @Test(priority = 1, testName = "TC_MyAcc_03", description = "It should display name,email id,account number with edit and change password links")
    public void Edit() throws InterruptedException {
        homePageActions.Edit();

    }
    @Test(priority = 2, testName = "TC_MyAcc_01", description = "To validate the functionality of 'My_Account'")
    public void Mandatory_fields_blank() throws InterruptedException {
        homePageActions.Mandatory_fields_blank();

    }

    @Test(priority = 3, testName = "TC_MyAcc_06", description = "To validate change email checkbox for invalid email")
    public void Change_email_id() throws InterruptedException {
        homePageActions.Change_email_id_invalid();

    }
    @Test(priority = 4, testName = "TC_MyAcc_07", description = "To validate change email checkbox for valid email")
    public void Change_email_id_valid() throws InterruptedException {
        homePageActions.Change_email_id_valid();

    }

    @Test(priority = 5, testName = "TC_MyAcc_05", description = "To validate edit links form to change first name")
    public void Change_First_Name() throws InterruptedException {
        homePageActions.Change_First_name();

    }



    @Test(priority = 6, testName = "TC_MyAcc_08", description = "To validate Contact Information sections link from My Account")
    public void Change_Password() throws InterruptedException {
        homePageActions.Change_password_Link(username, password);

    }

    @Test(priority = 7, testName = "TC_MyAcc_09", description = "To validate change email checkbox for invalid password")
    public void Change_Password_invalid() throws InterruptedException {
        homePageActions.Change_password_Link_invalid();

    }

    @Test(priority = 8, testName = "TC_MyAcc_10", description = "To validate change email checkbox for valid email")
    public void Change_Password_valid() throws InterruptedException {
        homePageActions.Change_password_Link_valid(username,password);

    }
    @Test(priority = 9, testName = "TC_MyAcc_11", description = "To validate sales person information setion")
    public void sales_information() throws InterruptedException {
        homePageActions.sales_information_section();

    }
@Test(priority = 10, testName = "TC_MyAcc_16", description = "To verify 'Manage Address' link from My Account")
public void Manage_address() throws InterruptedException {
    homePageActions.Manage_address();

}
    @Test(priority = 11, testName = "TC_MyAcc_12", description = "To verify address book Section from My Account_default billing address edit link invalid data")
    public void default_billing_address_invalid() throws InterruptedException {
        homePageActions.Default_billing_address_invalid();

    }
    @Test(priority = 12, testName = "TC_MyAcc_13", description = "To verify address book Section from My Account_default billing address edit link invalid data")
    public void default_billing_address_valid() throws InterruptedException {
        homePageActions.Default_billing_address_valid();

    }
    @Test(priority = 13, testName = "TC_MyAcc_14", description = "To verify address book Section from My Account_default shipping  address edit link for invalid data")
    public void default_shipping_address_invalid() throws InterruptedException {
        homePageActions.Default_shipping_address_invalid();

    }
    @Test(priority = 14, testName = "TC_MyAcc_15", description = "To verify address book Section from My Account_default shipping  address edit link for valid data")
    public void default_shipping_address_valid() throws InterruptedException {
        homePageActions.Default_shipping_address_valid();

    }
    @Test(priority = 15, testName = "TC_MyAcc_22", description = "To validate 'View All' link from My Account")
    public void view_all() throws InterruptedException {
        homePageActions.view_all();

    }
    @Test(priority = 16, testName = "TC_MyAcc_19", description = "To validate 'Action' column from My Account")
    public void view_order() throws InterruptedException {
        homePageActions.view_order();

    }
    @Test(priority = 17, testName = "TC_MyAcc_21", description = "To validate 'Reorder' link from My Account")
    public void view_recorder() throws InterruptedException {
        homePageActions.Recorder();

    }

    @Test(priority = 18, testName = "TC_MyAcc_24", description = "To validate Item of My Products")
    public void My_product() throws InterruptedException {
        homePageActions.My_product();

    }

    @Test(priority = 19, testName = "TC_MyAcc_25", description = "To validate 'Add to  cart' of My Products")
    public void Add_to_cart() throws InterruptedException {
        homePageActions.Add_to_cart();

    }

    @Test(priority = 20, testName = "TC_MyAcc_26", description = "To verify 'My Orders' tab ")
    public void My_orders() throws InterruptedException {
        homePageActions.My_orders();

    }

    @Test(priority = 21, testName = "TC_MyAcc_28", description = "To validate 'Action' column of My Orders")
    public void view_orders() throws InterruptedException {
        homePageActions.view_orders();

    }

    @Test(priority = 22, testName = "TC_MyAcc_29", description = "To validate 'Reorder' link of My Orders")
    public void Recorders() throws InterruptedException {
        homePageActions.Recorders();

    }

    @Test(priority = 23, testName = "TC_MyAcc_30", description = "To validate Show functionality  of My Orders")
    public void Show() throws InterruptedException {
        homePageActions.Show();

    }
//    @Test(priority = 22, testName = "TC_MyAcc_01", description = "To validate the functionality of 'My_Account'")
//    public void Pagination() throws InterruptedException {
//           homePageActions.pagination();
//
//    }
    @Test(priority = 24, testName = "TC_MyAcc_31", description = "To verify 'My Wish list' tab  and redirection of product name link ")
    public void My_wishlist() throws InterruptedException {
        homePageActions.My_wishlist();

    }
    @Test(priority = 25, testName = "TC_MyAcc_32", description = "To validate Show functionality from My Wish list")
    public void Show_wishlist() throws InterruptedException {
        homePageActions.Show_wishlist();

    }
    //    @Test(priority = 25, testName = "TC_MyAcc_27", description = "To validate Pagination from My Wish list")
//    public void Pagination_wishlist() throws InterruptedException {
//        homePageActions.pagination_1();
//
//    }
    @Test(priority = 26, testName = "TC_MyAcc_33", description = "To verify 'My Wish list' tab  and redirection of product name link")
    public void Product_name_link() throws InterruptedException {
        homePageActions.product_name_link();

    }
    @Test(priority = 27, testName = "TC_MyAcc_34", description = "To validate Add to cart link from My Wish list")
    public void Add_to_cart_wishlist() throws InterruptedException {
        homePageActions.Add_to_cart_1();

    }
    @Test(priority = 28, testName = "TC_MyAcc_35", description = "To validate Remove link from My Wish list")
    public void Remove_wishlist() throws InterruptedException {
        homePageActions.Remove_wishlist();

    }
    @Test(priority = 29, testName = "TC_MyAcc_37", description = "To verify Address Book section")
    public void Address_book() throws InterruptedException {
        homePageActions.Address_book();

    }

    @Test(priority = 30, testName = "TC_MyAcc_38", description = "To verify Default addresses from Address Book section")
    public void Change_billing_address() throws InterruptedException {
        homePageActions.Change_billing_address();

    }
    @Test(priority = 31, testName = "TC_MyAcc_38", description = "To validate links from Address Book section")
    public void Save_billing_address() throws InterruptedException {
        homePageActions.Save_billing_address();

    }
    @Test(priority = 32, testName = "TC_MyAcc_38", description = "To verify Default addresses from Address Book section")
    public void Shipping_address() throws InterruptedException {
        homePageActions.shipping_address();

    }
    @Test(priority = 33, testName = "TC_MyAcc_39", description = "To validate links from Address Book section")
    public void Save_shipping_address() throws InterruptedException {
        homePageActions.Save_shipping_address();

    }
    @Test(priority = 34, testName = "TC_MyAcc_40", description = "To verify Additional Address Entries section from Address book section")
    public void Edit_address() throws InterruptedException {
        homePageActions.Edit_address();

    }
    @Test(priority = 35, testName = "TC_MyAcc_41", description = "To validate Edit links from Additional address entries section from Address book section")
    public void Edit_address_checkbox() throws InterruptedException {
        homePageActions.Edit_address_checkbox();

    }
    @Test(priority = 36, testName = "TC_MyAcc_42", description = "To validate Delete links from Additional address entries section from Address book section")
    public void delete_address() throws InterruptedException {
        homePageActions.Delete_address();

    }
    @Test(priority = 37, testName = "TC_MyAcc_47", description = "To validate the functionality of 'show'")
    public void show_address() throws InterruptedException {
        homePageActions.show_address_book();

    }
    @Test(priority = 38, testName = "TC_MyAcc_43", description = "To verify 'Add New Address' button  from Address book section")
    public void add_new_address() throws InterruptedException {
        homePageActions.add_new_address();

    }
    @Test(priority = 39, testName = "TC_MyAcc_44", description = "To verify 'Add New Address' button  from Address book section for blank data")
    public void add_address_blank() throws InterruptedException {
        homePageActions.add_new_address_blank();

    }
    @Test(priority = 40, testName = "TC_MyAcc_45", description = "To verify 'Add New Address' button  from Address book section for invalid data")
    public void add_address_invalid() throws InterruptedException {
        homePageActions.add_new_address_invalid();

    }
    @Test(priority = 41, testName = "TC_MyAcc_46", description = "To verify 'Add New Address' button  from Address book section for valid data")
    public void add_address_valid() throws InterruptedException {
        homePageActions.add_new_address_valid();

    }
    @Test(priority = 42, testName = "TC_MyAcc_48", description = "To verify Email Subscriptions tab")
    public void add_address_Email_subscription() throws InterruptedException {
        homePageActions.Email_subscribe();

    }
    @Test(priority = 43, testName = "TC_MyAcc_49", description = "To valiadte functonality of Email Subscriptions ")
    public void add_address_Email_subscription_uncheck() throws InterruptedException {
        homePageActions.Email_subscribe_Uncheckbox();

    }
    @Test(priority = 44, testName = "TC_MyAcc_50", description = "To valiadte functonality of Email Subscriptions for uncheked checkbox")
    public void add_address_Email_subscription_check() throws InterruptedException {
        homePageActions.Email_subscribe_checkbox();

    }
    @Test(priority = 45, testName = "TC_MyAcc_51", description = "To verify 'My Saved Cards' tab")
    public void My_saved_cart() throws InterruptedException {
        homePageActions.My_saved_cart();

    }
    @Test(priority = 46, testName = "TC_MyAcc_52", description = "To verify Customer Saved Cards section table")
    public void My_saved_cart_section() throws InterruptedException {
        homePageActions.My_saved_cart_section();

    }
    @Test(priority = 47, testName = "TC_MyAcc_53", description = "To verify 'Add New card' section for go button")
    public void New_cart_Go_button() throws InterruptedException {
        homePageActions.Go_back();

    }
    @Test(priority = 48, testName = "TC_MyAcc_54", description = "To validate Edit button from Customer saved cards section")
    public void My_saved_cart_edit() throws InterruptedException {
        homePageActions.Edit_cart();

    }
    @Test(priority = 49, testName = "TC_MyAcc_55", description = "To validate Delete button from Customer saved cards section")
    public void My_saved_cart_delete() throws InterruptedException {
        homePageActions.Delete_cart();

    }
    @Test(priority = 50, testName = "TC_MyAcc_57", description = "To verify Add New Card Section  from My saved cards section")
    public void New_cart() throws InterruptedException {
        homePageActions.My_saved_cart_new();

    }
    @Test(priority = 51, testName = "TC_MyAcc_58", description = "To validate Add New Card  with empty field")
    public void New_cart_blank() throws InterruptedException {
        homePageActions.Save_card_blank();

    }
    @Test(priority = 52, testName = "TC_MyAcc_59", description = "To validate Add New Card  with invalid field")
    public void New_cart_invalid() throws InterruptedException {
        homePageActions.Save_card_invalid();

    }
    @Test(priority = 53, testName = "TC_MyAcc_60", description = "To validate Add New Card  with valid field")
    public void New_cart_valid() throws InterruptedException {
        homePageActions.Save_card_valid();

    }
}
