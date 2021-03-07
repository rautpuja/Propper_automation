package com.U_line.page.actions.web.Retailer;

import org.openqa.selenium.*;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Product_Registration_page {
    private static final Logger logger = LoggerFactory.getLogger(Product_Registration_page.class);

    private WebDriver driver;


    @FindBy(how = How.XPATH, using="//a[.='Product Registration' and not(@title)]")
    @CacheLookup
    WebElement Product_Registration;

    @FindBy(how = How.XPATH, using="//input[@id='serial']")
    @CacheLookup
    WebElement Serial_number;

    @FindBy(how = How.XPATH, using="//button[@id='step1']")
    @CacheLookup
    WebElement Next_button;

    @FindBy(how = How.XPATH, using="//input[@id='date-purchased']")
    @CacheLookup
    WebElement Calender;
    @FindBy(how = How.XPATH, using="//div[@id='ui-datepicker-div']")
    @CacheLookup
    WebElement datepicker;

    @FindBy(how = How.XPATH, using="//input[@id='upload']")
    @CacheLookup
    WebElement Upload_file;

    @FindBy(how = How.XPATH, using="//input[@id='plusone']")
    @CacheLookup
    WebElement Checkbox;

    @FindBy(how = How.XPATH, using="//button[@id='step2']")
    @CacheLookup
    WebElement Next_button2;

    @FindBy(how = How.XPATH, using="//input[@id='firstname']")
    @CacheLookup
    WebElement FirstName;
    @FindBy(how = How.XPATH, using="//input[@id='lastname']")
    @CacheLookup
    WebElement LastName;

    @FindBy(how = How.XPATH, using="//input[@id='email']")
    @CacheLookup
    WebElement Email;

    @FindBy(how = How.XPATH, using="//input[@id='email-confirmation']")
    @CacheLookup
    WebElement VerifyEmail;

    @FindBy(how = How.XPATH, using="//input[@id='phone']")
    @CacheLookup
    WebElement Phone_number;

    @FindBy(how = How.XPATH, using="//input[@id='address']")
    @CacheLookup
    WebElement Street_address;

    @FindBy(how = How.XPATH, using="//input[@id='city']")
    @CacheLookup
    WebElement City;

    @FindBy(how = How.XPATH, using="//select[@id='region_id']")
    @CacheLookup
    WebElement State;

    @FindBy(how = How.XPATH, using="//input[@id='zip']")
    @CacheLookup
    WebElement Zip;

    @FindBy(how = How.XPATH, using="//select[@id='country_new']")
    @CacheLookup
    WebElement Country;

    @FindBy(how = How.XPATH, using="//button[@id='step3']")
    @CacheLookup
    WebElement Register_button;

    @FindBy(how = How.XPATH, using="//input[@id='upload']")
    @CacheLookup
    WebElement File_upload;

    public Product_Registration_page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }


    public void Product_Registration() throws InterruptedException {
        logger.info("\"It should get redirected to the respective page and display the breadcrumb properly with \n" +
                "Home > Product Registration\"");
        Thread.sleep(4000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Product_Registration.click();
        WebElement ele= driver.findElement(By.xpath("//body/div[1]/div[1]/ul[1]"));
       System.out.println(ele.getText());
    }
    public void Serial_number_blank() throws InterruptedException {
        logger.info("Error message should be displayed .It should not be able to go in Purchase Info");
        Thread.sleep(4000);
        Next_button.click();
    }
    public void Serial_number_Invalid() throws InterruptedException {
        logger.info("Error message should be displayed 'Not A Valid Serial Number'");
        Thread.sleep(4000);
        Serial_number.sendKeys("897778");
        Next_button.click();
    }

    public void Serial_number_valid() throws InterruptedException {
        logger.info("It should be redirect to purchase info");
        Thread.sleep(4000);
        String select = Keys.chord(Keys.CONTROL, "a");

        Serial_number.sendKeys(select);
        Serial_number.sendKeys("1900003080205");
        Thread.sleep(6000);
        Next_button.click();
    }

    public void Purchase_info_blank() throws InterruptedException {
        logger.info("This is required field' message should be displayed");
        Thread.sleep(4000);
        Next_button2.click();
    }



    public void Purchase_info_valid_with_checkbox() throws InterruptedException {
        logger.info("It should be by default uncheck and able to check and uncheck");
        Thread.sleep(4000);
        Calender.click();
        WebElement ele =driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]"));
        ele.click();

        Checkbox.click();
        Next_button2.click();


    }
    public void Purchase_info_valid_without_upload() throws InterruptedException {
        logger.info("Error message should be displayed");
        Thread.sleep(4000);
        Calender.click();
        WebElement ele =driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]"));
        ele.click();

        Checkbox.click();
        Next_button2.click();
    }
    public void Purchase_info_valid_with_upload() throws InterruptedException {
        logger.info("It should be redirect to Owner Contact Info");
        Thread.sleep(4000);
        Calender.click();
        WebElement ele = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]"));
        ele.click();
        WebElement       ele2 =  driver.findElement(By.xpath("//input[@id='upload']"));
        ele2.sendKeys("C:\\Users\\lenovo\\Desktop\\UPBOTT\\PDP screenshots\\Accessasies Images not found.JPEG");

//
        Checkbox.click();
        Next_button2.click();
    }


    public void Owner_contact_Info_Blank () throws InterruptedException {
        logger.info("This is required field' error message should get displayed.");
        Thread.sleep(10000);

        Register_button.click();

    }
    public void Owner_contact_Info_Invalid () throws InterruptedException {
        logger.info("Invalid detail should not accepted and give Error message as 'Invalid data' .");
        Thread.sleep(4000);
        FirstName.sendKeys("78889");
        LastName.sendKeys("9777");
        Email.sendKeys("puja@upbott.com");
        VerifyEmail.sendKeys("pooja@upbott.com");
        Phone_number.sendKeys("99878");
        Street_address.sendKeys("test 1233");
        Zip.sendKeys("uhjhj");
        Thread.sleep(2000);
        State.click();
        WebElement ele = driver.findElement(By.xpath("//select[@id='region_id']"));
        Select select = new Select(ele);
        select.selectByValue("36");


        Register_button.click();

    }
    public void Owner_contact_Info_valid () throws InterruptedException {
        logger.info("It should get a thank you message 'Thank you for registering your U-Line product! You will receive an email confirming registration.'");
        Thread.sleep(4000);
        String select = Keys.chord(Keys.CONTROL, "a");

        FirstName.sendKeys(select);
        FirstName.sendKeys("Puja");
        LastName.sendKeys(select);
        LastName.sendKeys("Domke");
        Email.sendKeys(select);
        Email.sendKeys("puja@upbott.com");
        VerifyEmail.sendKeys(select);
        VerifyEmail.sendKeys("puja@upbott.com");
        Phone_number.sendKeys(select);
        Phone_number.sendKeys("99878788");
        Street_address.sendKeys(select);
        Street_address.sendKeys("test 1233");
        Zip.sendKeys(select);
        Zip.sendKeys("63011");
        Thread.sleep(2000);
        State.sendKeys(select);
        State.click();
        WebElement ele1 = driver.findElement(By.xpath("//select[@id='region_id']"));
        Select select2 = new Select(ele1);
        select2.selectByValue("36");

        Register_button.click();

    }
    public void u_linelogo () throws InterruptedException {
        Thread.sleep(6000);
        WebElement ele= driver.findElement(By.xpath("//img[@class='default-logo']"));
        ele.click();


    }

}


