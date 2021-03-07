package com.PC_Automation_testcases.page.actions.web.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Forgot_password {
    private static final Logger logger = LoggerFactory.getLogger(Forgot_password.class);

    private WebDriver driver;
    @FindBy(how = How.XPATH, using="//a[.='Provider Login' and not(@title)]")
    @CacheLookup
    WebElement providerlogin;

    @FindBy(how = How.XPATH, using="//a[.='Forgot Your Password?' and not(@title)]")
    @CacheLookup
    WebElement Forgot_password_link;

    @FindBy(how = How.XPATH, using="//button[@class='action submit primary']")
    @CacheLookup
    WebElement Submit_button;

    @FindBy(how = How.XPATH, using="////input[@id='email_address']")
    @CacheLookup
    WebElement Email_field;

    public Forgot_password(WebDriver driver){
        this.driver=driver;
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
    public void Forgot_password() throws InterruptedException {
        logger.info("It should be redirect to 'Forgot Your  Password' page");
        Thread.sleep(20000);
        //driver.switchTo().alert().dismiss();
        WebElement ele= driver.findElement(By.xpath("//a[.='Forgot Your Password?' and not(@title)]"));
        ele.click();


    }


    public void providerlogin() {
        logger.info("provider login");
        // TODO Auto-generated method stub
        WebElement ele= driver.findElement(By.xpath("//a[@class='link login']"));
        ele.click();
    }
    public void Valid_email() throws InterruptedException {
        logger.info("It should display the message as \"If there is an account associated with abc@upbott.com you will receive an email with a link to reset your  Password.\" and the Email should be send to the respective entered email-id with the new link of the recover  Password");
        // TODO Auto-generated method stub
        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");


        WebElement ele=driver.findElement(By.xpath("//input[@id='email_address']"));
        ele.sendKeys(select);
        ele.sendKeys("puja@upbott.com");
       // Email_field.sendKeys("puja@upbott.com");

        WebElement ele1=driver.findElement(By.xpath("//span[contains(text(),'Reset My Password')]"));
        ele1.click();

    }

    public void Set_your_passwordpage() {
        logger.info("It should open the Set your  Password page");
        // TODO Auto-generated method stub

    }

    public void invalid_email() throws InterruptedException {
        logger.info("Error message should be displayed");
        // TODO Auto-generated method stub
        Thread.sleep(10000);
        WebElement ele=driver.findElement(By.xpath("//input[@id='email_address']"));
        ele.sendKeys("puja2upbott.com");
        // Email_field.sendKeys("puja@upbott.com");

        WebElement ele1=driver.findElement(By.xpath("//span[contains(text(),'Reset My Password')]"));
        ele1.click();

    }



    public void blank_email() throws InterruptedException {
        logger.info("After login After login By default parts search should open");
        // TODO Auto-generated method stub
        Thread.sleep(7000);
        Submit_button.click();
    }


}

