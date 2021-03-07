package com.U_line.page.actions.web.Servicer;

import com.U_line.utils.common.Config;
import org.openqa.selenium.*;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Product_Registration_page {
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


    @FindBy(how = How.XPATH, using="//a[contains(text(),'Product Registration')]")
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
    public void Product_Registration() throws InterruptedException {
        logger.info("Page should redirect to My Product Registration Page");
        Thread.sleep(4000);
        Product_Registration.click();
    }
    public void Serial_number_blank() throws InterruptedException {
        logger.info("Page should redirect to My Product Registration Page");
        Thread.sleep(4000);
       Next_button.click();
    }
    public void Serial_number_Invalid() throws InterruptedException {
        logger.info("Page should redirect to My Product Registration Page");
        Thread.sleep(4000);
        Serial_number.sendKeys("897778");
        Next_button.click();
    }

    public void Serial_number_valid() throws InterruptedException {
        logger.info("Page should redirect to My Product Registration Page");
        Thread.sleep(4000);
        String select = Keys.chord(Keys.CONTROL, "a");

        Serial_number.sendKeys(select);
        Serial_number.sendKeys("1900003080205");
        Thread.sleep(6000);
        Next_button.click();
    }

    public void Purchase_info_blank() throws InterruptedException {
        logger.info("Page should redirect to My Product Registration Page");
        Thread.sleep(4000);
        Next_button2.click();
    }

    public void Purchase_info_valid() throws InterruptedException {
        logger.info("Page should redirect to My Product Registration Page");
        Thread.sleep(4000);
        Calender.click();
      WebElement ele =driver.findElement(By.xpath("//a[contains(text(),'2')]"));
      ele.click();


        }

        public void Purchase_info_valid_with_checkbox() throws InterruptedException {
            logger.info("Page should redirect to My Product Registration Page");
            Thread.sleep(4000);
            Calender.click();
            WebElement ele =driver.findElement(By.xpath("//a[contains(text(),'2')]"));
            ele.click();
//
                Checkbox.click();
                Next_button2.click();
//            }

//
//
//        }
}
    public void Purchase_info_valid_without_upload() throws InterruptedException {
        logger.info("Page should redirect to My Product Registration Page");
        Thread.sleep(4000);
        Calender.click();
        WebElement ele =driver.findElement(By.xpath("//a[contains(text(),'2')]"));
        ele.click();
//
        Checkbox.click();
        Next_button2.click();
           }
    public void Purchase_info_valid_with_upload() throws InterruptedException {
        logger.info("Page should redirect to My Product Registration Page");
        Thread.sleep(4000);
        Calender.click();
        WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'2')]"));
        ele.click();
     WebElement       ele2 =  driver.findElement(By.xpath("//input[@id='upload']"));
     ele2.sendKeys("C:\\Users\\lenovo\\Desktop\\UPBOTT\\PDP screenshots\\Accessasies Images not found.JPEG");

//
        Checkbox.click();
        Next_button2.click();
          }


        public void Owner_contact_Info_Blank () throws InterruptedException {
            logger.info("Page should redirect to My Product Registration Page");
            Thread.sleep(10000);
            JavascriptExecutor js1 = (JavascriptExecutor) driver;

            js1.executeScript("window.scrollBy(0,1000)");
            Register_button.click();

        }
        public void Owner_contact_Info_Invalid () throws InterruptedException {
            logger.info("Page should redirect to My Product Registration Page");
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
            logger.info("Page should redirect to My Product Registration Page");
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

