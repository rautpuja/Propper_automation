package com.U_line.page.actions.web.Retailer;

import com.U_line.page.actions.web.HomePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Registration_page {
    private static final Logger logger= LoggerFactory.getLogger(HomePage.class);

    private WebDriver driver;

    @FindBy(how = How.XPATH, using="//a[.='Provider Login' and not(@title)]")
    @CacheLookup
    WebElement providerlogin;

    @FindBy(how = How.XPATH, using="//a[.='Register for an Account' and not(@title)]")
    @CacheLookup
    WebElement Registration_link;

    @FindBy(how = How.XPATH, using="//input[@name='firstname']")
    @CacheLookup
    WebElement First_name;
    @FindBy(how = How.XPATH, using="//input[@name='lastname']")
    @CacheLookup
    WebElement Last_name;
    @FindBy(how = How.XPATH, using="//input[@id='companyname']")
    @CacheLookup
    WebElement Company_name;
    @FindBy(how = How.XPATH, using="//input[@id='account']")
    @CacheLookup
    WebElement account;
    @FindBy(how = How.XPATH, using="//input[@id='email_address']")
    @CacheLookup
    WebElement Email_id;
    @FindBy(how = How.XPATH, using="//input[@id='password']")
    @CacheLookup
    WebElement Password;
    @FindBy(how = How.XPATH, using="//input[@id='password-confirmation']")
    @CacheLookup
    WebElement Confirm_password;
    @FindBy(how = How.XPATH, using="//input[@id='captcha_user_create']")
    @CacheLookup
    WebElement Recaptcha;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Reload captcha')]")
    @CacheLookup
    WebElement Reload_captcha;

    @FindBy(how = How.XPATH, using="//body/div[1]/main[1]/div[3]/div[1]/form[1]/div[1]/div[1]/button[1]")
    @CacheLookup
    WebElement Registered;
    public Registration_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void product() {

        logger.info("click on product");
        // TODO Auto-generated method stub
        providerlogin.click();
    }

    public void providerlogin() {
        logger.info("provider login");
        // TODO Auto-generated method stub
        providerlogin.click();
    }

    public void Registration_link() throws InterruptedException {
        logger.info("provider login");
        Thread.sleep(10000);
        // TODO Auto-generated method stub
        Registration_link.click();
    }

    public void Blank_data() throws InterruptedException {
        logger.info("provider login");
        Thread.sleep(10000);
        // TODO Auto-generated method stub
       Registered.click();
    }
    public void Invalid_email_id() throws InterruptedException {
        logger.info("provider login");
        Thread.sleep(10000);
        First_name.sendKeys("puja");
        Last_name.sendKeys("domke");
        Company_name.sendKeys("upbott");
        account.sendKeys("10081");
        Email_id.sendKeys("puja2123");
        Password.sendKeys("dev@123123");
        Confirm_password.sendKeys("dev@123123");
        Recaptcha.sendKeys("677878");
        Registered.click();
    }

    public void different_password() throws InterruptedException {

            logger.info("provider login");
        Thread.sleep(10000);

        String select = Keys.chord(Keys.CONTROL, "a");
        First_name.sendKeys(select);

            First_name.sendKeys("puja");
        Last_name.sendKeys(select);
            Last_name.sendKeys("domke");
        Company_name.sendKeys(select);
            Company_name.sendKeys("upbott");
        account.sendKeys(select);
            account.sendKeys("10081");
        Email_id.sendKeys(select);
            Email_id.sendKeys("pujadomke@upbott.com");
            Password.sendKeys(select);
            Password.sendKeys("dev@123123");
        Confirm_password.sendKeys(select);
            Confirm_password.sendKeys("v@123123");
        Recaptcha.sendKeys(select);
            Recaptcha.sendKeys("677878");
            Registered.click();
        }


    public void CaseSensetive_password() throws InterruptedException {

        logger.info("provider login");
        Thread.sleep(10000);

        String select = Keys.chord(Keys.CONTROL, "a");
        First_name.sendKeys(select);

        First_name.sendKeys("puja");
        Last_name.sendKeys(select);
        Last_name.sendKeys("domke");
        Company_name.sendKeys(select);
        Company_name.sendKeys("upbott");
        account.sendKeys(select);
        account.sendKeys("10081");
        Email_id.sendKeys(select);
        Email_id.sendKeys("pujadomke@upbott.com");
        Password.sendKeys(select);
        Password.sendKeys("dev@123123");
        Confirm_password.sendKeys(select);
        Confirm_password.sendKeys("DEV@123123");
        Recaptcha.sendKeys(select);
        Recaptcha.sendKeys("677878");
        Registered.click();
    }

    public void without_captcha() throws InterruptedException {

        logger.info("provider login");
        Thread.sleep(10000);

        String select = Keys.chord(Keys.CONTROL, "a");
        First_name.sendKeys(select);

        First_name.sendKeys("puja");
        Last_name.sendKeys(select);
        Last_name.sendKeys("domke");
        Company_name.sendKeys(select);
        Company_name.sendKeys("upbott");
        account.sendKeys(select);
        account.sendKeys("10081");
        Email_id.sendKeys(select);
        Email_id.sendKeys("pujadomke@upbott.com");
        Password.sendKeys(select);
        Password.sendKeys("dev@123123");
        Confirm_password.sendKeys(select);
        Confirm_password.sendKeys("dev@123123");

        Registered.click();
    }

    public void AlreadyRegistered_email() throws InterruptedException {

        logger.info("provider login");
        Thread.sleep(10000);

        String select = Keys.chord(Keys.CONTROL, "a");
        First_name.sendKeys(select);
        Thread.sleep(10000);
        First_name.sendKeys("puja");
        Last_name.sendKeys(select);
        Last_name.sendKeys("domke");
        Company_name.sendKeys(select);
        Company_name.sendKeys("upbott");
        account.sendKeys(select);
        account.sendKeys("10081");
        Email_id.sendKeys(select);
        Email_id.sendKeys("puja@upbott.com");
        Password.sendKeys(select);
        Password.sendKeys("Puja@123!@#");
        Confirm_password.sendKeys(select);
        Confirm_password.sendKeys("Puja@123!@#");
        Recaptcha.sendKeys(select);
        Recaptcha.sendKeys("677878");
        Registered.click();
    }

    public void Invalid_account_number() throws InterruptedException {

        logger.info("provider login");
        Thread.sleep(10000);

        String select = Keys.chord(Keys.CONTROL, "a");
        First_name.sendKeys(select);

        First_name.sendKeys("puja");
        Last_name.sendKeys(select);
        Last_name.sendKeys("domke");
        Company_name.sendKeys(select);
        Company_name.sendKeys("upbott");
        account.sendKeys(select);
        account.sendKeys("1081");
        Email_id.sendKeys(select);
        Email_id.sendKeys("puja@upbott.com");
        Password.sendKeys(select);
        Password.sendKeys("Puja@123!@#");
        Confirm_password.sendKeys(select);
        Confirm_password.sendKeys("Puja@123!@#");
        Recaptcha.sendKeys(select);
        Recaptcha.sendKeys("677878");
        Registered.click();
    }

    public void valid_data() throws InterruptedException {

        logger.info("provider login");
        Thread.sleep(10000);

        String select = Keys.chord(Keys.CONTROL, "a");
        First_name.sendKeys(select);
        Thread.sleep(10000);
        First_name.sendKeys("puja");
        Last_name.sendKeys(select);
        Last_name.sendKeys("domke");
        Company_name.sendKeys(select);
        Company_name.sendKeys("upbott");
        account.sendKeys(select);
        account.sendKeys("10081");
        Email_id.sendKeys(select);
        Email_id.sendKeys("puja@upbott.com");
        Password.sendKeys(select);
        Password.sendKeys("Puja@123!@#");
        Confirm_password.sendKeys(select);
        Confirm_password.sendKeys("Puja@123!@#");
        Recaptcha.sendKeys(select);
        Recaptcha.sendKeys("677878");
        Registered.click();
    }

    public void Reload_captcha() throws InterruptedException {

        logger.info("provider login");
        Thread.sleep(10000);

        String select = Keys.chord(Keys.CONTROL, "a");
        First_name.sendKeys(select);

        First_name.sendKeys("puja");
        Last_name.sendKeys(select);
        Last_name.sendKeys("domke");
        Company_name.sendKeys(select);
        Company_name.sendKeys("upbott");
        account.sendKeys(select);
        account.sendKeys("10081");
        Email_id.sendKeys(select);
        Email_id.sendKeys("puja@upbott.com");
        Password.sendKeys(select);
        Password.sendKeys("Puja@123!@#");
        Confirm_password.sendKeys(select);
        Confirm_password.sendKeys("Puja@123!@#");
        Reload_captcha.click();
        Recaptcha.sendKeys(select);
        Recaptcha.sendKeys("677878");


        Registered.click();
    }



}
