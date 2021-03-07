package com.U_line.page.actions.web.Servicer;

import com.U_line.utils.common.Config;
import com.U_line.utils.selenium.WebUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Address_book_Page {

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

    @FindBy(how = How.XPATH, using="//a[contains(text(),'Address Book')]")
    @CacheLookup
    WebElement Address_Book;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Change Billing Address')]")
    @CacheLookup
    WebElement Change_billing_address;

    @FindBy(how = How.XPATH, using="//body/div[1]/main[1]/div[2]/div[1]/form[1]/div[1]/div[1]/button[1]/span[1]")
    @CacheLookup
    WebElement Save_address;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Edit Address')]")
    @CacheLookup
    WebElement Edit_address;

    @FindBy(how = How.XPATH, using="//body/div[3]/aside[1]/div[2]/footer[1]/button[2]/span[1]")
    @CacheLookup
    WebElement Save_address_button;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Change Shipping Address')]")
    @CacheLookup
    WebElement Change_shipping_address;

    @FindBy(how = How.XPATH, using="//body/div[1]/main[1]/div[2]/div[1]/form[1]/div[1]/div[1]/button[1]/span[1]")
    @CacheLookup
    WebElement Save_address2;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Edit Address')]")
    @CacheLookup
    WebElement Edit_button2;

    @FindBy(how = How.XPATH, using="//body/div[3]/aside[1]/div[2]/footer[1]/button[2]/span[1]")
    @CacheLookup
    WebElement Save_button2;


    @FindBy(how = How.XPATH, using="//input[@id='firstname']")
    @CacheLookup
    WebElement First_Name;


    @FindBy(how = How.XPATH, using="//input[@id='lastname']")
    @CacheLookup
    WebElement Last_Name;


    @FindBy(how = How.XPATH, using="//input[@id='company']")
    @CacheLookup
    WebElement Company;


    @FindBy(how = How.XPATH, using="//input[@id='telephone']")
    @CacheLookup
    WebElement Phone_Number;


    @FindBy(how = How.XPATH, using="//input[@id='street_1']")
    @CacheLookup
    WebElement Street_address;


    @FindBy(how = How.XPATH, using="//input[@id='city']")
    @CacheLookup
    WebElement City;


    @FindBy(how = How.XPATH, using="//select[@id='region_id']")
    @CacheLookup
    WebElement State_provience;


    @FindBy(how = How.XPATH, using="//input[@id='zip']")
    @CacheLookup
    WebElement Zip_Code;


    @FindBy(how = How.XPATH, using="//select[@id='country']")
    @CacheLookup
    WebElement Country;


    @FindBy(how = How.XPATH, using="//input[@id='primary_billing']")
    @CacheLookup
    WebElement Billing_address_Checkbox;

    @FindBy(how = How.XPATH, using="//input[@id='primary_shipping']")
    @CacheLookup
    WebElement default_shipping_address;
    @FindBy(how = How.XPATH, using="//body/div[1]/main[1]/div[2]/div[1]/form[1]/div[1]/div[1]/button[1]/span[1]")
    @CacheLookup
    WebElement Save_address_button_3;
    @FindBy(how = How.XPATH, using="//span[contains(text(),'Add New Address')]")
    @CacheLookup
    WebElement Add_New_Address;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Edit Address')]")
    @CacheLookup
    WebElement Edit_address_4;

    @FindBy(how = How.XPATH, using="//body/div[2]/main[1]/div[2]/div[1]/form[1]/div[1]/div[1]/button[1]/span[1]")
    @CacheLookup
    WebElement Save_address5;

    public Address_book_Page(WebDriver driver){
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

    public void Address_Book()
    {
        logger.info("It should get redirect to the respective page.");
        Address_Book.click();
    }
    public void change_billing_address()

    {
        logger.info("\"Application should display two section \n" +
                "1.Default Billing Address should present in the left \n" +
                "2.Default Shipping Address should present in the right\n" +
                "3.It should redirect to address information page with users saved address\"" +
                "2. It should delete the entry\"\"\"");
        Change_billing_address.click();
    }

    public void Save_address() throws InterruptedException {
        logger.info(" 'You saved the address' should display and edited information should dispaly .It should redirect to my account page");
        Thread.sleep(4000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Save_address.click();
    }

    public void Edit_address() throws InterruptedException {
        logger.info("This is required field'error message should displayed");
        Thread.sleep(6000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        Edit_address.click();
    }

    public void Save_address_Button() throws InterruptedException {
        logger.info("\"Application should display all the additon address entries with edit and delete link\n" +
                "\"\"1.It should redirect to address information page with users saved address\n" +
                "2. It should delete the entry\"\"\"");
        Thread.sleep(10000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));

        WebElement element = driver.findElement(By.xpath("//body/div[3]/aside[1]/div[2]/footer[1]/button[2]/span[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
        //Save_address_button.click();
    }

    public void Change_Shipping_Address() throws InterruptedException {
        logger.info("It should redirect to address information page with users saved address");
        Thread.sleep(10000);
        WebUtils.navigateToURL(APPLICATION_URL+"customer/account/");
        WebUtils.navigateToURL(APPLICATION_URL+"customer/address/");
        Change_shipping_address.click();
    }

    public void Save_address_Shipping() throws InterruptedException {
        logger.info(" 'You saved the address' should display and edited information should dispaly .It should redirect to my account page");
        Thread.sleep(4000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Save_address2.click();
    }

    public void Edit_address_Shipping() throws InterruptedException {
        logger.info("It should have eight columns(First Name,Last Name,Street Address,City,Country,State,Zip/Postal Code,Phone) and address should get save with accurate data");
        Thread.sleep(10000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Edit_button2.click();
    }

    public void Save_button_address_Shipping() throws InterruptedException {
        logger.info("\"Application should display all the additon address entries with edit and delete link\n" +
                "\"\"1.It should redirect to address information page with users saved address\n" +
                "2. It should delete the entry\"\"\"");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//button[@class='action save primary']")).click();
        Thread.sleep(10000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
    driver.findElement(By.xpath("//button[@class='action-primary action primary']")).click();

                }

    public void Add_new_address() throws InterruptedException {
        logger.info("Add new address form should get opned");
        Thread.sleep(10000);
        WebUtils.navigateToURL(APPLICATION_URL+"customer/account/");
        WebUtils.navigateToURL(APPLICATION_URL+"customer/address/");
        Thread.sleep(10000);
        Add_New_Address.click();
    }
    public void Form_blank() throws InterruptedException {
        logger.info("Error message should get displayed");
        Thread.sleep(10000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
       Save_address_button_3.click();
    }

    public void Form_invalid() throws InterruptedException {
        logger.info("Error message should get displayed");
        Thread.sleep(10000);
       Company.sendKeys("upbott");
       Phone_Number.sendKeys("ttyu");
       Street_address.sendKeys("5778");
       City.sendKeys("89998");
       State_provience.click();
        Select select=new Select(State_provience);
        select.selectByValue("36");
        Zip_Code.sendKeys("76575");
        Save_address_button_3.click();
    }
    public void Form_valid_Edit_button() throws InterruptedException {
        logger.info("\"Application should display all the additon address entries with edit and delete link\n" +
                "\"\"1.It should redirect to address information page with users saved address\n" +
                "2. It should delete the entry\"\"\"");
        Edit_address_4.click();

    }


    public void Form_valid_without_checkbox() throws InterruptedException {
        logger.info("Form should get saved and entries should get displayed in additional entries");
        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");

        Company.sendKeys(select);
        Company.sendKeys("upbott");
        Phone_Number.sendKeys(select);
        Phone_Number.sendKeys("8987678767");
        Street_address.sendKeys(select);
        Street_address.sendKeys("Test 1234");
        City.sendKeys(select);
        City.sendKeys("Missouri");
        Zip_Code.sendKeys(select);
        Zip_Code.sendKeys("63011");
        Save_address_button_3.click();
    }
    public void Save_address_5() throws InterruptedException {
        logger.info("\"Application should display all the additon address entries with edit and delete link\n" +
                "\"\"1.It should redirect to address information page with users saved address\n" +
                "2. It should delete the entry\"\"\"");
        Save_address5.click();
    }


    public void Edit_button() throws InterruptedException {
        logger.info(" 'You saved the address' should display and edited information should dispaly .It should redirect to my account page");
        Thread.sleep(50000);
        WebUtils.navigateToURL(APPLICATION_URL+"customer/address/");
        Thread.sleep(50000);
        driver.findElement(By.xpath("//tbody/tr[1]/td[9]/a[1]/span[1]")).click();
Thread.sleep(50000);

        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        driver.findElement(By.xpath("//button[@class='action-primary action primary']")).click();
  Thread.sleep(9000);
       // driver.navigate().to("https://u-line.upbott.com/customer/address/");
    }


    public void delete() throws InterruptedException {

        logger.info("\"Application should display all the additon address entries with edit and delete link\n" +
                "\"\"1.It should redirect to address information page with users saved address\n" +
                "2. It should delete the entry\"\"\"");
        WebUtils.navigateToURL(APPLICATION_URL+"customer/address/");
        Thread.sleep(50000);
        driver.findElement(By.xpath("//a[@data-address='1382']")).click();
        Thread.sleep(10000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(9000);

        driver.findElement(By.xpath("//button[@class='action-primary action-accept']")).click();

    }

    public void show() throws InterruptedException {
        logger.info("It should be bottom right hand side. By deafult 10 should be selected and results should be according to the slection. It should sort the results as per 10,20,50 items selected. It should be present in the top right of my claims table section.");
        driver.findElement(By.xpath("//tbody/tr[1]/td[9]/a[1]/span[1]")).click();
        WebElement ele= driver.findElement(By.xpath("//select[@id='limiter']"));
        ele.click();
        Select sle= new Select(ele);
        sle.selectByValue("20");
    }
}
