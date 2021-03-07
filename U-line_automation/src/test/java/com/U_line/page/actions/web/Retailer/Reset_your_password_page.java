package com.U_line.page.actions.web.Retailer;

import com.U_line.page.actions.web.Servicer.Product_Registration_page;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Reset_your_password_page {
    private static final Logger logger = LoggerFactory.getLogger(Reset_your_password_page.class);

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

    public Reset_your_password_page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    public void providerlogin() throws InterruptedException {
        logger.info("It should be redirect to 'Forgot Your  Password' page");
        // TODO Auto-generated method stub
        providerlogin.click();
        Thread.sleep(3000);
        Forgot_password_link.click();
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
Thread.sleep(8000);
WebElement ele3=driver.findElement(By.xpath("//body/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]"));
System.out.println(ele3.getText());
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

