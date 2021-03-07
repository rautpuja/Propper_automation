package com.BSP_Testcases.page.actions.web.TestCases;

import org.openqa.selenium.*;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Contact_us_page {

    private static final Logger logger = LoggerFactory.getLogger(Contact_us_page.class);

    private WebDriver driver;



    public Contact_us_page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }



    public void Contact_us() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("\"Title should be Contact Us\n" +
                "\n" +
                "Fill out the form below and we'll get back to you right away. No worries, we don't spam.\n" +
                "\n" +
                "\"");
        //Thread.sleep(4000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(8000);
      WebElement contact= driver.findElement(By.xpath("//a[@title='Contact '][contains(.,'Contact')]"));
      contact.click();
        WebElement title= driver.findElement(By.xpath("//span[@class='base'][contains(.,'Contact Us')]"));
       System.out.println("Title of the page is : "+title.getText());
        WebElement title2= driver.findElement(By.xpath("//div[contains(@class,'field note no-label')]"));
        System.out.println("Title of the page is : "+title2.getText());

    }



    public void Contact_us_blank() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Error message should get dispalyed");
        Thread.sleep(4000);

        WebElement submit=driver.findElement(By.xpath("//span[contains(.,'Submit')]"));

        submit.click();
    }

    public void Contact_us_invalid_data() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should display a error message");
        Thread.sleep(4000);
        WebElement Name=driver.findElement(By.xpath("//input[@name='name']"));
        Name.sendKeys("65787");
        WebElement Telephone=driver.findElement(By.xpath("//input[contains(@name,'telephone')]"));
        Telephone.sendKeys("9878987678");
        WebElement Email_address=driver.findElement(By.xpath("//input[contains(@name,'email')]"));
        Email_address.sendKeys("puja2upbott.com");


        WebElement add=driver.findElement(By.xpath("//textarea[contains(@name,'comment')]"));
        add.sendKeys("testing request");
        WebElement submit=driver.findElement(By.xpath("//span[contains(.,'Submit')]"));

        submit.click();

    }

    public void Contact_us_with_valid() throws InterruptedException {
        Thread.sleep(4000);
        logger.info("\"It should display a success message 'Thanks for contacting us with your comments and questions. We'll respond to you very soon.'\n" +
                "\" ");
        Thread.sleep(4000);
        String select = Keys.chord(Keys.CONTROL, "a");
        Thread.sleep(4000);
        WebElement Name=driver.findElement(By.xpath("//input[@name='name']"));
        Name.sendKeys(select);
        Name.sendKeys("puja");
        WebElement Telephone=driver.findElement(By.xpath("//input[contains(@name,'telephone')]"));
        Telephone.sendKeys(select);
        Telephone.sendKeys("9878987678");
        WebElement Email_address=driver.findElement(By.xpath("//input[contains(@name,'email')]"));
        Email_address.sendKeys(select);
        Email_address.sendKeys("puja@upbott.com");


        WebElement add=driver.findElement(By.xpath("//textarea[contains(@name,'comment')]"));
        add.sendKeys("from upbott team");
        WebElement submit=driver.findElement(By.xpath("//span[contains(.,'Submit')]"));

        submit.click();
    }

    public void Contact_us_with_invalid_email() throws InterruptedException {
        Thread.sleep(4000);
        logger.info("It should display a popup for mail ");
        Thread.sleep(4000);
        String select = Keys.chord(Keys.CONTROL, "a");
        Thread.sleep(4000);
        WebElement Name=driver.findElement(By.xpath("//input[@name='name']"));
        Name.sendKeys(select);
        Name.sendKeys("puja");
        WebElement Telephone=driver.findElement(By.xpath("//input[contains(@name,'telephone')]"));
        Telephone.sendKeys(select);
        Telephone.sendKeys("9878987678");
        WebElement Email_address=driver.findElement(By.xpath("//input[contains(@name,'email')]"));
        Email_address.sendKeys(select);
        Email_address.sendKeys("puja2upbott.com");


        WebElement add=driver.findElement(By.xpath("//textarea[contains(@name,'comment')]"));
        add.sendKeys("from upbott team");
        WebElement submit=driver.findElement(By.xpath("//span[contains(.,'Submit')]"));

        submit.click();
    }

}
