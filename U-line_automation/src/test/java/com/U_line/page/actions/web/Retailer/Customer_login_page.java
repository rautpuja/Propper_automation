package com.U_line.page.actions.web.Retailer;

import com.U_line.page.actions.web.HomePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class Customer_login_page {
    private static final Logger logger= LoggerFactory.getLogger(HomePage.class);

    private WebDriver driver;

    @FindBy(how = How.XPATH, using="//a[.='Provider Login' and not(@title)]")
    @CacheLookup
    WebElement providerlogin;

    @FindBy(how = How.XPATH, using="//a[contains(text(),'Log Out')]")
    @CacheLookup
    WebElement Logout;

    @FindBy(how = How.XPATH, using="//input[@id='email']")
    @CacheLookup
    WebElement txtemail;

    @FindBy(how = How.XPATH, using="//a[.='Forgot Your Password?' and not(@title)]")
    @CacheLookup
    WebElement Forgot_password_link;
    @FindBy(how = How.XPATH, using="//a[.='Register for an Account' and not(@title)]")
    @CacheLookup
    WebElement Register_for_account;
    @FindBy(xpath="//input[@id='pass']")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(name="send")
    @CacheLookup
    WebElement btnLogin;


    public Customer_login_page(WebDriver driver) {
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

    public void invalid_password() throws InterruptedException {
        Thread.sleep(10000);

        String select = Keys.chord(Keys.CONTROL, "a");
        txtemail.sendKeys(select);
        txtemail.sendKeys("puja@upbott.com");


        txtPassword.sendKeys(select);
        txtPassword.sendKeys("ghyh7677");
        btnLogin.click();
    }
    public void Invalid_email() throws InterruptedException {
        Thread.sleep(7000);
        txtemail.sendKeys("puja2upbott.com");
        txtPassword.sendKeys("Puja@123!@#");
        btnLogin.click();
    }
    public void CaseSensetive_password() throws InterruptedException {
        Thread.sleep(7000);

        String select = Keys.chord(Keys.CONTROL, "a");
        txtemail.sendKeys(select);
        txtemail.sendKeys("puja@upbott.com");


        txtPassword.sendKeys(select);
        txtPassword.sendKeys("pUJA@123!@#");
        btnLogin.click();
    }
    public void Old_password() throws InterruptedException {
        Thread.sleep(7000);

        String select = Keys.chord(Keys.CONTROL, "a");
        txtemail.sendKeys(select);
        txtemail.sendKeys("puja2upbott.com");
        txtPassword.sendKeys(select);
        txtPassword.sendKeys("Dev@123!@#");
        btnLogin.click();
    }

    public void valid_data() throws InterruptedException {
        Thread.sleep(7000);

        String select = Keys.chord(Keys.CONTROL, "a");
        txtemail.sendKeys(select);
        txtemail.sendKeys("puja@upbott.com");

       // String select = Keys.chord(Keys.CONTROL, "a");
        txtPassword.sendKeys(select);
        txtPassword.sendKeys("Puja@123!@#");
        btnLogin.click();
    }



    public void clickSubmit()
    {
        btnLogin.click();
    }

    public void Forgot_password_link()
    {
        Forgot_password_link.click();
    }
    public void Register_account_link()
    {
        Register_for_account.click();
    }
    public void Logout_button()
    {
        Logout.click();
    }
}
