package com.U_line.page.actions.web.Servicer;

import com.U_line.utils.common.Config;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class My_account_Page {

    private static final Logger logger = LoggerFactory.getLogger(Product_Registration_page.class);
    private static final String APPLICATION_URL = Config.getProperty("appURL");
    private WebDriver driver;
    @FindBy(how = How.XPATH, using="//a[.='Provider Login' and not(@title)]")
    @CacheLookup
    WebElement providerlogin;

    @FindBy(how = How.XPATH, using="//input[@id='email']")
    @CacheLookup
    WebElement txtemail;



    @FindBy(xpath="//input[@id='pass']")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(name="send")
    @CacheLookup
    WebElement btnLogin;

    @FindBy(how = How.XPATH, using="//a[contains(text(),'My Account')]")
    @CacheLookup
    WebElement My_Account;

    @FindBy(how = How.XPATH, using="//body/div[1]/main[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/a[1]")
    @CacheLookup
    WebElement Edit;


    @FindBy(how = How.XPATH, using="//input[@id='change-email']")
    @CacheLookup
    WebElement Email_Id_checkbox;


    @FindBy(how = How.XPATH, using="//input[@id='current-password']")
    @CacheLookup
    WebElement Current_password;


    @FindBy(how = How.XPATH, using="//input[@id='firstname']")
    @CacheLookup
    WebElement First_Name;


    @FindBy(how = How.XPATH, using="//input[@id='lastname']")
    @CacheLookup
    WebElement Last_Name;

    @FindBy(how = How.XPATH, using="//input[@id='firstname']")
    @CacheLookup
    WebElement First_Name2;


    @FindBy(how = How.XPATH, using="//input[@id='lastname']")
    @CacheLookup
    WebElement Last_Name2;

    @FindBy(how = How.XPATH, using="//input[@id='change-password']")
    @CacheLookup
    WebElement Change_Password;

    @FindBy(how = How.XPATH, using="//input[@id='password']")
    @CacheLookup
    WebElement New_password;

    @FindBy(how = How.XPATH, using="//input[@id='password-confirmation']")
    @CacheLookup
    WebElement Confirm_New_password;

    @FindBy(how = How.XPATH, using="//input[@id='change-password']")
    @CacheLookup
    WebElement Change_password2;
    @FindBy(how = How.XPATH, using="//input[@id='email']")
    @CacheLookup
    WebElement Email;
    @FindBy(how = How.XPATH, using="//a[contains(text(),'Change Password')]")
    @CacheLookup
    WebElement Change_Password_link;
    @FindBy(how = How.XPATH, using="//body/div[1]/main[1]/div[2]/div[1]/form[1]/div[1]/div[1]/button[1]/span[1]")
    @CacheLookup
    WebElement Save_button;
    @FindBy(how = How.XPATH, using="//body/div[1]/main[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/a[1]/span[1]")
    @CacheLookup
    WebElement edit2;

    @FindBy(how = How.XPATH, using="//body/div[1]/main[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/a[1]/span[1]")
    @CacheLookup
    WebElement edit4;

    @FindBy(how = How.XPATH, using="//body/div[1]/main[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/a[1]/span[1]")
    @CacheLookup
    WebElement edit3;
    public My_account_Page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    public void providerlogin() {
        logger.info("After login After login By default parts search should open");
        // TODO Auto-generated method stub
        providerlogin.click();
    }

    public void setemail(String email)
    {
        txtemail.sendKeys(email);
    }

    public void setPassword(String pwd)
    {
        txtPassword.sendKeys(pwd);
    }


    public void clickSubmit()
    {
        btnLogin.click();
    }

    public void My_Account() throws InterruptedException {
        logger.info("Page should redirect to My Account Page");
        Thread.sleep(4000);
        My_Account.click();
    }

    public void Edit() throws InterruptedException {
        logger.info("Page should redirect to My Account Page");
        Thread.sleep(4000);
        Edit.click();
    }

    public void Email_id_checkbox() throws InterruptedException {
        logger.info("Page should redirect to My Account Page");
        Thread.sleep(4000);
        Email_Id_checkbox.click();
    }
    public void Change_email_id() throws InterruptedException {
        logger.info("\"If user enters new email and click on save button it should display \"\"You saved the account information\"\".\n" +
                "If already existing email address entered and click on save button \"\"Error message should disaply\"\"\"");
        Thread.sleep(4000);
        Email_Id_checkbox.click();
        String select = Keys.chord(Keys.CONTROL, "a");

        Email.sendKeys(select);
        Email.sendKeys("puja@upbott.com");
        Current_password.sendKeys("Dev@123!@#");

    }

    public void Change_First_name() throws InterruptedException {
        logger.info("You saved the account information.' message should display and redirect to the Account information also edited information should dispaly");

        Thread.sleep(9000);
        String select = Keys.chord(Keys.CONTROL, "a");

        First_Name2.sendKeys(select);
        First_Name2.sendKeys("P00ja");
        Last_Name2.sendKeys(select);
        Last_Name2.sendKeys("Raut");
        Save_button.click();

    }

    public void Mandatory_fields_blank() throws InterruptedException {
        logger.info("Error mesage should display");
        Thread.sleep(10000);
        edit4.click();
        Thread.sleep(9000);
        String select = Keys.chord(Keys.CONTROL, "a");

        First_Name.sendKeys(select);
        First_Name.sendKeys("");
        Last_Name.sendKeys(select);
        Last_Name.sendKeys("");
        Save_button.click();

    }

    public void Change_password() throws InterruptedException {
        logger.info("Application should reset the password and successful message should get display \"Your saved the account information\" message should display");
        Thread.sleep(10000);
        edit3.click();
        Thread.sleep(10000);
       driver.switchTo().activeElement();
       Change_password2.click();

       New_password.sendKeys("Dev@123!@#");
       Confirm_New_password.sendKeys("Dev@123!@#");
       Save_button.click();

    }

    public void Change_password_Link() throws InterruptedException {
        logger.info("1. On edit my account page, the change password checkbox  should checked by default, Error message should be displayed(\"Please enter the same value again.\")");
        Thread.sleep(90000);
        Change_Password_link.click();
        Thread.sleep(90000);
        Current_password.sendKeys("Dev@123!@#");
        New_password.sendKeys("Dev@123!@#");
        Confirm_New_password.sendKeys("dev@123!@#");
        Save_button.click();

    }
}
