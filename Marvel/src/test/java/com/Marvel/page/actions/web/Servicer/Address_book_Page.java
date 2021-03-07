package com.Marvel.page.actions.web.Servicer;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class Address_book_Page {

    private static final Logger logger = LoggerFactory.getLogger(Product_Registration_page.class);

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
        WebElement ele= driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]"));
        ele.click();
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
        System.out.println(driver.getTitle());
    }
    public void Change_billing_address() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should redirect to address information page with users saved address");
       driver.findElement(By.xpath("//span[contains(.,'Change Billing Address')]")).click();
    }
    public void Edit_empty() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Error mesage should display");
        String select = Keys.chord(Keys.CONTROL, "a");
     WebElement  first_name= driver.findElement(By.xpath("//input[@title='First Name']"));
     first_name.sendKeys(select);
     first_name.sendKeys("");
     WebElement last_name= driver.findElement(By.xpath("//input[@name='lastname']"));
     last_name.sendKeys(select);
     last_name.sendKeys("");
        WebElement Company_name= driver.findElement(By.xpath("//input[@title='Company']"));
        Company_name.sendKeys(select);
        Company_name.sendKeys("");
        WebElement phone_NUMBER= driver.findElement(By.xpath("//input[contains(@name,'telephone')]"));
        phone_NUMBER.sendKeys(select);
        phone_NUMBER.sendKeys("");
        WebElement street_address= driver.findElement(By.xpath("//input[@type='text'][contains(@id,'1')]"));
        street_address.sendKeys(select);
        street_address.sendKeys("");
        WebElement City= driver.findElement(By.xpath("//input[contains(@name,'city')]"));
        City.sendKeys(select);
        City.sendKeys("");
        WebElement zip_code= driver.findElement(By.xpath("//input[@name='postcode']"));
        zip_code.sendKeys(select);
        zip_code.sendKeys("");
        WebElement save_address= driver.findElement(By.xpath("(//span[contains(.,'Save Address')])[1]"));
       save_address.click();
        Thread.sleep(2000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        WebElement Edit_address= driver.findElement(By.xpath("(//span[contains(.,'Edit Address')])[2]"));
        Edit_address.click();
    }
    public void Edit_invalid() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Error mesage should display");
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement  first_name= driver.findElement(By.xpath("//input[@title='First Name']"));
        first_name.sendKeys(select);
        first_name.sendKeys("677887");
        WebElement last_name= driver.findElement(By.xpath("//input[@name='lastname']"));
        last_name.sendKeys(select);
        last_name.sendKeys("99090");
        WebElement Company_name= driver.findElement(By.xpath("//input[@title='Company']"));
        Company_name.sendKeys(select);
        Company_name.sendKeys("upbott");
        WebElement phone_NUMBER= driver.findElement(By.xpath("//input[contains(@name,'telephone')]"));
        phone_NUMBER.sendKeys(select);
        phone_NUMBER.sendKeys("788");
        WebElement street_address= driver.findElement(By.xpath("//input[@type='text'][contains(@id,'1')]"));
        street_address.sendKeys(select);
        street_address.sendKeys("test");
        WebElement City= driver.findElement(By.xpath("//input[contains(@name,'city')]"));
        City.sendKeys(select);
        City.sendKeys("missouri");
        WebElement zip_code= driver.findElement(By.xpath("//input[@name='postcode']"));
        zip_code.sendKeys(select);
        zip_code.sendKeys("tyyu");
        WebElement save_address= driver.findElement(By.xpath("(//span[contains(.,'Save Address')])[1]"));
        save_address.click();
        Thread.sleep(2000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        WebElement Edit_address= driver.findElement(By.xpath("(//span[contains(.,'Edit Address')])[2]"));
        Edit_address.click();
    }
    public void edit_valid() throws InterruptedException {
        Thread.sleep(10000);
        logger.info(" 'You saved the address' should display and edited information should dispaly .It should redirect to my account page");
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement  first_name= driver.findElement(By.xpath("//input[@title='First Name']"));
        first_name.sendKeys(select);
        first_name.sendKeys("sushil");
        WebElement last_name= driver.findElement(By.xpath("//input[@name='lastname']"));
        last_name.sendKeys(select);
        last_name.sendKeys("zore");
        WebElement Company_name= driver.findElement(By.xpath("//input[@title='Company']"));
        Company_name.sendKeys(select);
        Company_name.sendKeys("upbott");
        WebElement phone_NUMBER= driver.findElement(By.xpath("//input[contains(@name,'telephone')]"));
        phone_NUMBER.sendKeys(select);
        phone_NUMBER.sendKeys("9878987898");
        WebElement street_address= driver.findElement(By.xpath("//input[@type='text'][contains(@id,'1')]"));
        street_address.sendKeys(select);
        street_address.sendKeys("test 123");
        WebElement City= driver.findElement(By.xpath("//input[contains(@name,'city')]"));
        City.sendKeys(select);
        City.sendKeys("missouri");
        WebElement zip_code= driver.findElement(By.xpath("//input[@name='postcode']"));
        zip_code.sendKeys(select);
        zip_code.sendKeys("63011");
        WebElement save_address= driver.findElement(By.xpath("(//span[contains(.,'Save Address')])[1]"));
        save_address.click();
        Thread.sleep(2000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        WebElement Edit_address= driver.findElement(By.xpath("(//span[contains(.,'Save Address')])[2]"));
        Edit_address.click();
    }
    public void default_shipping_address() throws InterruptedException {
        logger.info("It should redirect to address information page with users saved address");
        Thread.sleep(20000);
        WebElement address_book= driver.findElement(By.xpath("//a[contains(.,'Address Book')]"));
        address_book.click();
        Thread.sleep(20000);
        WebElement shipping_address= driver.findElement(By.xpath("//span[contains(.,'Change Shipping Address')]"));
       shipping_address.click();
    }
    public void default_shipping_address_Edit() throws InterruptedException {
        logger.info(" Verify your address pop up should get displayed with edit and save address button");
        Thread.sleep(20000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement  first_name= driver.findElement(By.xpath("//input[@title='First Name']"));
        first_name.sendKeys(select);
        first_name.sendKeys("sushil");
        WebElement last_name= driver.findElement(By.xpath("//input[@name='lastname']"));
        last_name.sendKeys(select);
        last_name.sendKeys("zore");
        WebElement Company_name= driver.findElement(By.xpath("//input[@title='Company']"));
        Company_name.sendKeys(select);
        Company_name.sendKeys("upbott");
        WebElement phone_NUMBER= driver.findElement(By.xpath("//input[contains(@name,'telephone')]"));
        phone_NUMBER.sendKeys(select);
        phone_NUMBER.sendKeys("9878987898");
        WebElement street_address= driver.findElement(By.xpath("//input[@type='text'][contains(@id,'1')]"));
        street_address.sendKeys(select);
        street_address.sendKeys("test 123");
        WebElement City= driver.findElement(By.xpath("//input[contains(@name,'city')]"));
        City.sendKeys(select);
        City.sendKeys("missouri");
        WebElement zip_code= driver.findElement(By.xpath("//input[@name='postcode']"));
        zip_code.sendKeys(select);
        zip_code.sendKeys("63011");
        WebElement save_address= driver.findElement(By.xpath("(//span[contains(.,'Save Address')])[1]"));
        save_address.click();
        Thread.sleep(2000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        WebElement Edit_address= driver.findElement(By.xpath("(//span[contains(.,'Save Address')])[2]"));
        Edit_address.click();
    }
    public void Additional_entries_Edit() throws InterruptedException {
        logger.info("\"1.It should redirect to address information page with users saved address and pop up with edit and save address button should get dispalyed\n" +
                "2.should delete the entry\"");

        Thread.sleep(20000);
Actions ac=new Actions(driver);
        WebElement  edit= driver.findElement(By.xpath("(//span[contains(.,'Edit')])[2]"));
     ac.moveToElement(edit).click().build().perform();
        Thread.sleep(20000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement  first_name= driver.findElement(By.xpath("//input[@title='First Name']"));
        first_name.sendKeys(select);
        first_name.sendKeys("sushil");
        WebElement last_name= driver.findElement(By.xpath("//input[@name='lastname']"));
        last_name.sendKeys(select);
        last_name.sendKeys("zore");
        WebElement Company_name= driver.findElement(By.xpath("//input[@title='Company']"));
        Company_name.sendKeys(select);
        Company_name.sendKeys("upbott");
        WebElement phone_NUMBER= driver.findElement(By.xpath("//input[contains(@name,'telephone')]"));
        phone_NUMBER.sendKeys(select);
        phone_NUMBER.sendKeys("9878987898");
        WebElement street_address= driver.findElement(By.xpath("//input[@type='text'][contains(@id,'1')]"));
        street_address.sendKeys(select);
        street_address.sendKeys("test 123");
        WebElement City= driver.findElement(By.xpath("//input[contains(@name,'city')]"));
        City.sendKeys(select);
        City.sendKeys("missouri");
        WebElement zip_code= driver.findElement(By.xpath("//input[@name='postcode']"));
        zip_code.sendKeys(select);
        zip_code.sendKeys("63011");
        WebElement save_address= driver.findElement(By.xpath("(//span[contains(.,'Save Address')])[1]"));
        save_address.click();
        Thread.sleep(2000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        WebElement Edit_address= driver.findElement(By.xpath("(//span[contains(.,'Save Address')])[2]"));
        Edit_address.click();
    }
    public void Additional_entries_block() throws InterruptedException {
        logger.info("It should have eight columns(First Name,Last Name,Street Address,City,Country,State,Zip/Postal Code,Phone)");
        Thread.sleep(20000);
        WebElement address_book= driver.findElement(By.xpath("//a[contains(.,'Address Book')]"));
        address_book.click();

        Thread.sleep(20000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement  add_block= driver.findElement(By.xpath("//table[@id='additional-addresses-table']"));
     System.out.println("/"+add_block.getText());

    }
    public void Additional_entries_delete() throws InterruptedException {
        logger.info("\"1.It should redirect to address information page with users saved address and pop up with edit and save address button should get dispalyed\n" +
                "2.should delete the entry\"");
        Thread.sleep(20000);
        WebElement address_book= driver.findElement(By.xpath("//a[contains(.,'Address Book')]"));
        address_book.click();

        Thread.sleep(20000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement  add_block= driver.findElement(By.xpath("//span[contains(.,'Delete')]"));
       add_block.click();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        WebElement  cancel= driver.findElement(By.xpath("//span[contains(.,'Cancel')]"));
        cancel.click();
//        Thread.sleep(2000);
//        WebElement  add_block1= driver.findElement(By.xpath("//span[contains(.,'Delete')]"));
//        add_block1.click();
//        ArrayList<String> tabs3 = new ArrayList<String> (driver.getWindowHandles());
//        driver.switchTo().window(tabs3.get(0));
//        Thread.sleep(2000);
//        WebElement  ok= driver.findElement(By.xpath("//span[contains(.,'OK')]"));
//        ok.click();
    }
    public void show_button() throws InterruptedException {
        logger.info("It should be bottom right hand side. By deafult 10 should be selected and results should be according to the slection. It should sort the results as per 10,20,50 items selected. It should be present in the top right of my claims table section.");
        Thread.sleep(20000);

//        WebElement address_book= driver.findElement(By.xpath("//a[contains(.,'Address Book')]"));
//        address_book.click();
        Thread.sleep(20000);
        WebElement show= driver.findElement(By.xpath("//select[@id='limiter']"));
       Select sel=new Select(show);
       sel.selectByVisibleText("20");


    }
    public void Add_new_address() throws InterruptedException {
        logger.info("It should redirect to new address page and the new address should get saved to address book");
        Thread.sleep(20000);


        WebElement address_book= driver.findElement(By.xpath("//a[contains(.,'Address Book')]"));
        address_book.click();
        Thread.sleep(20000);
        WebElement  add_block= driver.findElement(By.xpath("//span[contains(.,'Add New Address')]"));
      add_block.click();
        Thread.sleep(20000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement  first_name= driver.findElement(By.xpath("//input[@title='First Name']"));
        first_name.sendKeys(select);
        first_name.sendKeys("sushil");
        WebElement last_name= driver.findElement(By.xpath("//input[@name='lastname']"));
        last_name.sendKeys(select);
        last_name.sendKeys("zore");
        WebElement Company_name= driver.findElement(By.xpath("//input[@title='Company']"));
        Company_name.sendKeys(select);
        Company_name.sendKeys("upbott");
        WebElement phone_NUMBER= driver.findElement(By.xpath("//input[contains(@name,'telephone')]"));
        phone_NUMBER.sendKeys(select);
        phone_NUMBER.sendKeys("9878987898");
        WebElement street_address= driver.findElement(By.xpath("//input[@type='text'][contains(@id,'1')]"));
        street_address.sendKeys(select);
        street_address.sendKeys("test 123");
        WebElement City= driver.findElement(By.xpath("//input[contains(@name,'city')]"));
        City.sendKeys(select);
        WebElement state= driver.findElement(By.xpath("//select[contains(@name,'region_id')]"));
        Select sel=new Select(state);
        sel.selectByValue("36");
        City.sendKeys("missouri");
        WebElement zip_code= driver.findElement(By.xpath("//input[@name='postcode']"));
        zip_code.sendKeys(select);
        zip_code.sendKeys("63011");
        WebElement save_address= driver.findElement(By.xpath("(//span[contains(.,'Save Address')])[1]"));
        save_address.click();
        Thread.sleep(2000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        WebElement Edit_address= driver.findElement(By.xpath("(//span[contains(.,'Save Address')])[2]"));
        Edit_address.click();

    }
}
