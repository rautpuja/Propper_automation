package com.U_line.page.actions.web.Servicer;

import com.U_line.utils.common.Config;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Contact_us_page {

    private static final Logger logger = LoggerFactory.getLogger(Servicer_Homepage_Page.class);
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

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Contact Us')]")
    @CacheLookup
    WebElement Contact_us;

    @FindBy(how = How.XPATH, using = "//input[@id='name']")
    @CacheLookup
    WebElement Name;

    @FindBy(how = How.XPATH, using = "//input[@id='email']")
    @CacheLookup
    WebElement Email_address;

    @FindBy(how = How.XPATH, using = "//input[@id='telephone']")
    @CacheLookup
    WebElement Telephone;

    @FindBy(how = How.XPATH, using = "//textarea[@id='comment']")
    @CacheLookup
    WebElement Message;


    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Submit')]")
    @CacheLookup
    WebElement Submit;
    @FindBy(how = How.XPATH, using = "//div[@class='recaptcha-checkbox-border']")
    @CacheLookup
    WebElement Recaptcha;
    public Contact_us_page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    public void providerlogin() {
        logger.info("provider login");
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


    public void Contact_us() throws InterruptedException {
        Thread.sleep(4000);
        logger.info("It should get redirected to the respective page and display the breadcrumb properly with Home > Contact Us ");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\UPBOTT\\propper-automation\\U-Line\\src\\test\\resources\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-infobars");
        options.addArguments("--disable-extensions");
        WebDriver driver = new ChromeDriver(options);
        Contact_us.click();
    }

    public void Contact_us_blank() throws InterruptedException {
        Thread.sleep(4000);
        logger.info("It should get redirected to the respective page and display the breadcrumb properly with Home > Contact Us ");
        Thread.sleep(4000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Submit.click();
    }

    public void Contact_us_invalid_email() throws InterruptedException {
        Thread.sleep(4000);
        logger.info("It should get redirected to the respective page and display the breadcrumb properly with Home > Contact Us ");
        Thread.sleep(4000);
        Name.sendKeys("puja");
        Email_address.sendKeys("puja2upbott.com");
        Telephone.sendKeys("9878987678");
        Message.sendKeys("Testing form from upbott testing team");

        Submit.click();
    }
    public void Contact_us_without_captcha() throws InterruptedException {
        Thread.sleep(4000);
        logger.info("It should get redirected to the respective page and display the breadcrumb properly with Home > Contact Us ");
        Thread.sleep(4000);
        String select = Keys.chord(Keys.CONTROL, "a");

        Name.sendKeys(select);
        Name.sendKeys("puja");
        Email_address.sendKeys(select);
        Email_address.sendKeys("puja@upbott.com");
        Telephone.sendKeys(select);
        Telephone.sendKeys("9878987678");
        Message.sendKeys(select);
        Message.sendKeys("Testing form from upbott testing team");

        Submit.click();
    }
    public void Contact_us_with_captcha() throws InterruptedException {
        Thread.sleep(4000);
        logger.info("It should get redirected to the respective page and display the breadcrumb properly with Home > Contact Us ");
        Thread.sleep(4000);
        String select = Keys.chord(Keys.CONTROL, "a");

        Name.sendKeys(select);

        Name.sendKeys("puja");
        Email_address.sendKeys(select);
        Email_address.sendKeys("puja@upbott.com");
        Telephone.sendKeys(select);
        Telephone.sendKeys("9878987678");
        Message.sendKeys(select);
        Message.sendKeys("Testing form from upbott testing team");


    }

    public void Recaptcha() throws InterruptedException {

     //   driver.get("https://u-line.upbott.com/contactus?invisible=false");
        new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.recaptcha-checkbox-checkmark"))).click();

        Submit.click();
    }

}
