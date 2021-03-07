package com.PC_Automation_testcases.page.actions.web.TestCases;

import com.PC_Automation_testcases.page.actions.web.HomePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
    @FindBy(how = How.XPATH, using="//a[.='Create an Account' and not(@title)]")
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
    public void Subscribe() throws InterruptedException {
        logger.info("click on subscribe button");
        Thread.sleep(50000);
        //driver.switchTo().alert().dismiss();
        WebDriverWait wait = new WebDriverWait(driver,50);

        WebElement	ele=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='mageplaza-betterpopup-block']/div[@id='bio_ep']/div[1]/div[1]/img[1]")));
        ele.click();


        Thread.sleep(10000);
        WebElement ele4= driver.findElement(By.xpath("//button[@class='btn-cookie btn-cookie-accept']"));
        ele4.click();

    }
    public void providerlogin() {
        logger.info("provider login");
        // TODO Auto-generated method stub
        WebElement ele= driver.findElement(By.xpath("//a[@class='link login']"));
        ele.click();
    }



    public void invalid_password() throws InterruptedException {
        logger.info("Error message should be displayed\n");
        Thread.sleep(10000);

        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement txtemail= driver.findElement(By.xpath("//input[@id='email']"));
        txtemail.sendKeys(select);
        txtemail.sendKeys("puja@upbott.com");

        WebElement txtPassword= driver.findElement(By.xpath("//input[@name='login[password]']"));
        txtPassword.sendKeys(select);
        txtPassword.sendKeys("ghyh7677");
        WebElement btnLogin= driver.findElement(By.xpath("//button[@class='action login primary']"));
        btnLogin.click();
    }
    public void Invalid_email() throws InterruptedException {
        logger.info("Error message should be displayed\n");
        Thread.sleep(7000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement txtemail= driver.findElement(By.xpath("//input[@id='email']"));
        txtemail.sendKeys(select);
        txtemail.sendKeys("puja2upbott.com");

        WebElement txtPassword= driver.findElement(By.xpath("//input[@name='login[password]']"));
        txtPassword.sendKeys(select);
        txtPassword.sendKeys("sushil@8055");
        WebElement btnLogin= driver.findElement(By.xpath("//button[@class='action login primary']"));
        btnLogin.click();
    }
    public void CaseSensetive_password() throws InterruptedException {
        logger.info("Error message should be displayed\n");
        Thread.sleep(7000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement txtemail= driver.findElement(By.xpath("//input[@id='email']"));
        txtemail.sendKeys(select);
        txtemail.sendKeys("sam@upbott.com");

        WebElement txtPassword= driver.findElement(By.xpath("//input[@name='login[password]']"));
        txtPassword.sendKeys(select);
        txtPassword.sendKeys("sUSHIL@8055");
        WebElement btnLogin= driver.findElement(By.xpath("//button[@class='action login primary']"));
        btnLogin.click();
    }
    public void Old_password() throws InterruptedException {
        logger.info("Error message should be displayed\n");
        Thread.sleep(7000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement txtemail= driver.findElement(By.xpath("//input[@id='email']"));
        txtemail.sendKeys(select);
        txtemail.sendKeys("sam@upbott.com");

        WebElement txtPassword= driver.findElement(By.xpath("//input[@name='login[password]']"));
        txtPassword.sendKeys(select);
        txtPassword.sendKeys("Sushil@8055");
        WebElement btnLogin= driver.findElement(By.xpath("//button[@class='action login primary']"));
        btnLogin.click();
    }

    public void valid_data() throws InterruptedException {
        logger.info("User should get Login and redirect on My Account/Parts Search page\n");
        Thread.sleep(7000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement txtemail= driver.findElement(By.xpath("//input[@id='email']"));
        txtemail.sendKeys(select);
        txtemail.sendKeys("sam@upbott.com");

        WebElement txtPassword= driver.findElement(By.xpath("//input[@name='login[password]']"));
        txtPassword.sendKeys(select);
        txtPassword.sendKeys("sushil@8055");
        WebElement btnLogin= driver.findElement(By.xpath("//button[@class='action login primary']"));
        btnLogin.click();
    }



    public void clickSubmit()
    {
        logger.info("Error message should be display \"This is Required Field\" and should not be able to Login\n");
        btnLogin.click();
    }

    public void Forgot_password_link() throws InterruptedException {
        logger.info("It should get redirect to Forgot Your Password page\n");
        Thread.sleep(5000);
        WebElement ele= driver.findElement(By.xpath("//a[@class='link login']"));
        ele.click();
        Thread.sleep(5000);
        Forgot_password_link.click();
    }
    public void Register_account_link()
    {
        logger.info("It should get redirect to Create an Account page\n");
        Register_for_account.click();
    }
    public void Logout_button() throws InterruptedException {
        logger.info("Once user is logged in, sign out option should display in header next to cart and clicking on log out link .User should be logged out from the application with displaying message as \"You have signed out and will go to our homepage in 5 seconds.\"\n");
        //WebElement txtemail= driver.findElement(By.xpath("//a[@class='logout-link']"));
   // txtemail.click();
    Thread.sleep(5000);
        WebElement ele= driver.findElement(By.xpath("//header/div[1]/div[1]/ul[1]/li[2]/span[1]/button[1]"));
        ele.click();
        Thread.sleep(9000);
        WebElement ele3= driver.findElement(By.xpath("//header/div[1]/div[1]/ul[1]/li[2]/div[1]/ul[1]/li[4]"));
        ele3.click();
    }
}
