package com.U_line.page.actions.web.Retailer;

import com.U_line.page.actions.web.Servicer.Servicer_Homepage_Page;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Contact_us_retailer_page {

    private static final Logger logger = LoggerFactory.getLogger(Contact_us_retailer_page.class);

    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//body/div[1]/footer[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/ul[1]/li[11]/a[1]")
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

    @FindBy(how = How.XPATH, using = "//div[@class='recaptcha-checkbox-border']")
    @CacheLookup
    WebElement Recaptcha;


    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Submit')]")
    @CacheLookup
    WebElement Submit;

    public Contact_us_retailer_page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }




    public void Contact_us() throws InterruptedException {
        Thread.sleep(4000);
        logger.info("It should get redirected to the respective page and display the breadcrumb properly with Home > Contact Us ");
        Thread.sleep(4000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");

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
