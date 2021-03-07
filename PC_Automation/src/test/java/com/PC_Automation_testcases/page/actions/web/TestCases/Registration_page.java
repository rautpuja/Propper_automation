package com.PC_Automation_testcases.page.actions.web.TestCases;

import com.PC_Automation_testcases.page.actions.web.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Registration_page {
    private static final Logger logger= LoggerFactory.getLogger(HomePage.class);

    private WebDriver driver;

    @FindBy(how = How.XPATH, using="//a[.='Provider Login' and not(@title)]")
    @CacheLookup
    WebElement providerlogin;

    @FindBy(how = How.XPATH, using="//a[.='Create an Account' and not(@title)]")
    @CacheLookup
    WebElement Registration_link;

    @FindBy(how = How.XPATH, using="//input[@name='firstname']")
    @CacheLookup
    WebElement First_name;
    @FindBy(how = How.XPATH, using="//input[@name='lastname']")
    @CacheLookup
    WebElement Last_name;
    @FindBy(how = How.XPATH, using="//input[@id='company']")
    @CacheLookup
    WebElement Company_name;
    @FindBy(how = How.XPATH, using="//input[@name='gp_account']")
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
    public void product() {

        logger.info("click on product");
        // TODO Auto-generated method stub
        providerlogin.click();
    }

    public void providerlogin() {
        logger.info("provider login");
        // TODO Auto-generated method stub
        WebElement ele= driver.findElement(By.xpath("//a[@class='link login']"));
        ele.click();
    }

    public void Registration_link() throws InterruptedException {
        logger.info("provider login");
        Thread.sleep(10000);
        // TODO Auto-generated method stub
        Registration_link.click();
    }

    public void Blank_data() throws InterruptedException {
        logger.info("Error message should display\"This is Required Field\" and you should not be able to Register\n");
        Thread.sleep(10000);
        // TODO Auto-generated method stub
      WebElement ele= driver.findElement(By.xpath("//span[contains(text(),'Register')]"));
      ele.click();
    }
    public void Invalid_email_id() throws InterruptedException {
        logger.info("Error message should display.\n");
      WebElement name= driver.findElement(By.xpath("//input[@name='firstname']"));
      name.sendKeys("57676");
        WebElement Last_name= driver.findElement(By.xpath("//input[@name='lastname']"));
        Last_name.sendKeys("57676");
        WebElement ele2= driver.findElement(By.xpath("//input[@title='Street Address']"));

        ele2.sendKeys("test");
        WebElement ele6= driver.findElement(By.xpath("//input[@id='city']"));

        ele6.sendKeys("missouri");

        WebElement state= driver.findElement(By.xpath("//select[@name='region_id']"));

        Select sl=new Select(state);
        sl.selectByValue("3");
        WebElement zip= driver.findElement(By.xpath("//input[@name='postcode']"));

        zip.sendKeys("63011");
        WebElement ele= driver.findElement(By.xpath("//input[@name='telephone']"));

        ele.sendKeys("56788899");
        WebElement email= driver.findElement(By.xpath("//input[@id='email_address']"));

        email.sendKeys("puja2gmail.com");
        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));

        password.sendKeys("Dev@123!@#");
        WebElement cpassword= driver.findElement(By.xpath("//input[@id='password-confirmation']"));

        cpassword.sendKeys("Dev@123!@#");

        WebElement ele5= driver.findElement(By.xpath("//span[contains(text(),'Register')]"));
        ele5.click();
    }

    public void different_password() throws InterruptedException {

            logger.info("Error message should display.(There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.)\n");
        Thread.sleep(10000);

        String select = Keys.chord(Keys.CONTROL, "a");

        WebElement name= driver.findElement(By.xpath("//input[@name='firstname']"));
        name.sendKeys(select);
        name.sendKeys("puja");
        WebElement Last_name= driver.findElement(By.xpath("//input[@name='lastname']"));
        Last_name.sendKeys(select);
        Last_name.sendKeys("Domke");
        WebElement ele2= driver.findElement(By.xpath("//input[@title='Street Address']"));
        ele2.sendKeys(select);

        ele2.sendKeys("test");
        WebElement ele6= driver.findElement(By.xpath("//input[@id='city']"));
        ele6.sendKeys(select);

        ele6.sendKeys("missouri");

        WebElement state= driver.findElement(By.xpath("//select[@name='region_id']"));

        Select sl=new Select(state);
        sl.selectByValue("3");
        WebElement zip= driver.findElement(By.xpath("//input[@name='postcode']"));
        zip.sendKeys(select);
        zip.sendKeys("63011");
        WebElement ele= driver.findElement(By.xpath("//input[@name='telephone']"));
        ele.sendKeys(select);
        ele.sendKeys("9876567878");
        WebElement email= driver.findElement(By.xpath("//input[@id='email_address']"));
        email.sendKeys(select);
        email.sendKeys("puja@upbott.com");
        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys(select);
        password.sendKeys("sushil@8055");
        WebElement cpassword= driver.findElement(By.xpath("//input[@id='password-confirmation']"));
        cpassword.sendKeys(select);
        cpassword.sendKeys("SUSHIL@8055");

        WebElement ele5= driver.findElement(By.xpath("//span[contains(text(),'Register')]"));
        ele5.click();
        }


    public void CaseSensetive_password() throws InterruptedException {

        logger.info("Please enter the same value again Such error message should be displayed\n");

        String select = Keys.chord(Keys.CONTROL, "a");

        WebElement name= driver.findElement(By.xpath("//input[@name='firstname']"));
        name.sendKeys(select);
        name.sendKeys("puja");
        WebElement Last_name= driver.findElement(By.xpath("//input[@name='lastname']"));
        Last_name.sendKeys(select);
        Last_name.sendKeys("Domke");
        WebElement ele2= driver.findElement(By.xpath("//input[@title='Street Address']"));
        ele2.sendKeys(select);

        ele2.sendKeys("test");
        WebElement ele6= driver.findElement(By.xpath("//input[@id='city']"));
        ele6.sendKeys(select);

        ele6.sendKeys("missouri");

        WebElement state= driver.findElement(By.xpath("//select[@name='region_id']"));

        Select sl=new Select(state);
        sl.selectByValue("3");
        WebElement zip= driver.findElement(By.xpath("//input[@name='postcode']"));
        zip.sendKeys(select);
        zip.sendKeys("63011");
        WebElement ele= driver.findElement(By.xpath("//input[@name='telephone']"));
        ele.sendKeys(select);
        ele.sendKeys("9876567878");
        WebElement email= driver.findElement(By.xpath("//input[@id='email_address']"));
        email.sendKeys(select);
        email.sendKeys("puja@upbott.com");
        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys(select);
        password.sendKeys("sushil@8055");
        WebElement cpassword= driver.findElement(By.xpath("//input[@id='password-confirmation']"));
        cpassword.sendKeys(select);
        cpassword.sendKeys("SUSHIL@8055");

        WebElement ele5= driver.findElement(By.xpath("//span[contains(text(),'Register')]"));
        ele5.click();
    }

    public void without_captcha() throws InterruptedException {

        logger.info("Error message should display.Captcha should be required\n");

        String select = Keys.chord(Keys.CONTROL, "a");

        WebElement name= driver.findElement(By.xpath("//input[@name='firstname']"));
        name.sendKeys(select);
        name.sendKeys("puja");
        WebElement Last_name= driver.findElement(By.xpath("//input[@name='lastname']"));
        Last_name.sendKeys(select);
        Last_name.sendKeys("Domke");
        WebElement ele2= driver.findElement(By.xpath("//input[@title='Street Address']"));
        ele2.sendKeys(select);

        ele2.sendKeys("test");
        WebElement ele6= driver.findElement(By.xpath("//input[@id='city']"));
        ele6.sendKeys(select);

        ele6.sendKeys("missouri");

        WebElement state= driver.findElement(By.xpath("//select[@name='region_id']"));

        Select sl=new Select(state);
        sl.selectByValue("3");
        WebElement zip= driver.findElement(By.xpath("//input[@name='postcode']"));
        zip.sendKeys(select);
        zip.sendKeys("63011");
        WebElement ele= driver.findElement(By.xpath("//input[@name='telephone']"));
        ele.sendKeys(select);
        ele.sendKeys("9876567878");
        WebElement email= driver.findElement(By.xpath("//input[@id='email_address']"));
        email.sendKeys(select);
        email.sendKeys("puja@upott.com");
        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys(select);
        password.sendKeys("sushil@123!@#");
        WebElement cpassword= driver.findElement(By.xpath("//input[@id='password-confirmation']"));
        cpassword.sendKeys(select);
        cpassword.sendKeys("SUSHIL@123!@#");

        WebElement ele5= driver.findElement(By.xpath("//span[contains(text(),'Register')]"));
        ele5.click();
    }

    public void AlreadyRegistered_email() throws InterruptedException {

        logger.info("Error message should display.(There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.)\n");

        String select = Keys.chord(Keys.CONTROL, "a");

        WebElement name= driver.findElement(By.xpath("//input[@name='firstname']"));
        name.sendKeys(select);
        name.sendKeys("puja");
        WebElement Last_name= driver.findElement(By.xpath("//input[@name='lastname']"));
        Last_name.sendKeys(select);
        Last_name.sendKeys("Domke");
        WebElement ele2= driver.findElement(By.xpath("//input[@title='Street Address']"));
        ele2.sendKeys(select);

        ele2.sendKeys("test");
        WebElement ele6= driver.findElement(By.xpath("//input[@id='city']"));
        ele6.sendKeys(select);

        ele6.sendKeys("missouri");

        WebElement state= driver.findElement(By.xpath("//select[@name='region_id']"));

        Select sl=new Select(state);
        sl.selectByValue("3");
        WebElement zip= driver.findElement(By.xpath("//input[@name='postcode']"));
        zip.sendKeys(select);
        zip.sendKeys("63011");
        WebElement ele= driver.findElement(By.xpath("//input[@name='telephone']"));
        ele.sendKeys(select);
        ele.sendKeys("9876567878");
        WebElement email= driver.findElement(By.xpath("//input[@id='email_address']"));
        email.sendKeys(select);
        email.sendKeys("sam@upbott.com");
        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys(select);
        password.sendKeys("sushil@8055");
        WebElement cpassword= driver.findElement(By.xpath("//input[@id='password-confirmation']"));
        cpassword.sendKeys(select);
        cpassword.sendKeys("sushil@8055");

        WebElement ele5= driver.findElement(By.xpath("//span[contains(text(),'Register')]"));
        ele5.click();
    }

    public void Invalid_account_number() throws InterruptedException {

        logger.info("Customer should not get activated for invalid account number\n");
        Thread.sleep(10000);

        String select = Keys.chord(Keys.CONTROL, "a");

        WebElement name= driver.findElement(By.xpath("//input[@name='firstname']"));
        name.sendKeys(select);
        name.sendKeys("puja");
        WebElement Last_name= driver.findElement(By.xpath("//input[@name='lastname']"));
        Last_name.sendKeys(select);
        Last_name.sendKeys("Domke");
        WebElement ele2= driver.findElement(By.xpath("//input[@title='Street Address']"));
        ele2.sendKeys(select);

        ele2.sendKeys("test");
        WebElement ele6= driver.findElement(By.xpath("//input[@id='city']"));
        ele6.sendKeys(select);

        ele6.sendKeys("missouri");

        WebElement state= driver.findElement(By.xpath("//select[@name='region_id']"));

        Select sl=new Select(state);
        sl.selectByValue("3");
        WebElement zip= driver.findElement(By.xpath("//input[@name='postcode']"));
        zip.sendKeys(select);
        zip.sendKeys("63011");
        WebElement ele= driver.findElement(By.xpath("//input[@name='telephone']"));
        ele.sendKeys(select);
        ele.sendKeys("9876567878");
        WebElement email= driver.findElement(By.xpath("//input[@id='email_address']"));
        email.sendKeys(select);
        email.sendKeys("sam@upbott.com");
        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys(select);
        password.sendKeys("sushil@123!@#");
        WebElement cpassword= driver.findElement(By.xpath("//input[@id='password-confirmation']"));
        cpassword.sendKeys(select);
        cpassword.sendKeys("SUSHIL@123!@#");

        WebElement ele5= driver.findElement(By.xpath("//span[contains(text(),'Register')]"));
        ele5.click();
    }

    public void valid_data() throws InterruptedException {

        logger.info("Application should display \"Thank you for registering! We are currently reviewing your account. You will receive an email including access information within 48 hours.\" and user should  receive 'Welcome to Marvel Refrigeration' email\n");

        String select = Keys.chord(Keys.CONTROL, "a");

        WebElement name= driver.findElement(By.xpath("//input[@name='firstname']"));
        name.sendKeys(select);
        name.sendKeys("puja");
        WebElement Last_name= driver.findElement(By.xpath("//input[@name='lastname']"));
        Last_name.sendKeys(select);
        Last_name.sendKeys("Domke");
        WebElement ele2= driver.findElement(By.xpath("//input[@title='Street Address']"));
        ele2.sendKeys(select);

        ele2.sendKeys("test");
        WebElement ele6= driver.findElement(By.xpath("//input[@id='city']"));
        ele6.sendKeys(select);

        ele6.sendKeys("missouri");

        WebElement state= driver.findElement(By.xpath("//select[@name='region_id']"));

        Select sl=new Select(state);
        sl.selectByValue("3");
        WebElement zip= driver.findElement(By.xpath("//input[@name='postcode']"));
        zip.sendKeys(select);
        zip.sendKeys("63011");
        WebElement ele= driver.findElement(By.xpath("//input[@name='telephone']"));
        ele.sendKeys(select);
        ele.sendKeys("9876567878");
        WebElement email= driver.findElement(By.xpath("//input[@id='email_address']"));
        email.sendKeys(select);
        email.sendKeys("sam@upbott.com");
        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys(select);
        password.sendKeys("sushil@8055");
        WebElement cpassword= driver.findElement(By.xpath("//input[@id='password-confirmation']"));
        cpassword.sendKeys(select);
        cpassword.sendKeys("sushil@8055");

        WebElement ele5= driver.findElement(By.xpath("//span[contains(text(),'Register')]"));
        ele5.click();
    }

    public void Reload_captcha() throws InterruptedException {

        logger.info("Application should display \"Thank you for registering! We are currently reviewing your account. You will receive an email including access information within 48 hours.\"\n");

        String select = Keys.chord(Keys.CONTROL, "a");

        WebElement name= driver.findElement(By.xpath("//input[@name='firstname']"));
        name.sendKeys(select);
        name.sendKeys("puja");
        WebElement Last_name= driver.findElement(By.xpath("//input[@name='lastname']"));
        Last_name.sendKeys(select);
        Last_name.sendKeys("Domke");
        WebElement ele2= driver.findElement(By.xpath("//input[@title='Street Address']"));
        ele2.sendKeys(select);

        ele2.sendKeys("test");
        WebElement ele6= driver.findElement(By.xpath("//input[@id='city']"));
        ele6.sendKeys(select);

        ele6.sendKeys("missouri");

        WebElement state= driver.findElement(By.xpath("//select[@name='region_id']"));

        Select sl=new Select(state);
        sl.selectByValue("3");
        WebElement zip= driver.findElement(By.xpath("//input[@name='postcode']"));
        zip.sendKeys(select);
        zip.sendKeys("63011");
        WebElement ele= driver.findElement(By.xpath("//input[@name='telephone']"));
        ele.sendKeys(select);
        ele.sendKeys("9876567878");
        WebElement email= driver.findElement(By.xpath("//input[@id='email_address']"));
        email.sendKeys(select);
        email.sendKeys("sam@upbott.com");
        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys(select);
        password.sendKeys("sushil@8055");
        WebElement cpassword= driver.findElement(By.xpath("//input[@id='password-confirmation']"));
        cpassword.sendKeys(select);
        cpassword.sendKeys("sushil@8055");

        WebElement ele5= driver.findElement(By.xpath("//span[contains(text(),'Register')]"));
        ele5.click();
    }



}
