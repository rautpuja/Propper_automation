package com.Marvel.page.actions.web.Retailer;

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
import java.util.List;

public class Checkout_retailer_page {

    private static final Logger logger = LoggerFactory.getLogger(Checkout_retailer_page.class);

    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'New Address')]")
    @CacheLookup
    WebElement Add_New_address;

    @FindBy(how = How.XPATH, using = "//input[@name='street[0]']")
    @CacheLookup
    WebElement StreetAddress;

    @FindBy(how = How.XPATH, using = "//input[@name='street[0]']")
    @CacheLookup
    WebElement StreetAddress2;

    @FindBy(how = How.XPATH, using = "//input[@name='company']")
    @CacheLookup
    WebElement CompanyName;

    @FindBy(how = How.XPATH, using = "//input[@name='company']")
    @CacheLookup
    WebElement CompanyName2;

    @FindBy(how = How.XPATH, using = "//input[@name='city']")
    @CacheLookup
    WebElement City;

    @FindBy(how = How.XPATH, using = "//input[@name='city']")
    @CacheLookup
    WebElement City2;

    @FindBy(how = How.XPATH, using = "//select[@name='region_id']")
    @CacheLookup
    WebElement State;

    @FindBy(how = How.XPATH, using = "//select[@name='region_id']")
    @CacheLookup
    WebElement State2;

    @FindBy(how = How.XPATH, using = "//input[@name='postcode']")
    @CacheLookup
    WebElement Zip_code;

    @FindBy(how = How.XPATH, using = "//input[@name='postcode']")
    @CacheLookup
    WebElement Zip_code2;

    @FindBy(how = How.XPATH, using = "//input[@name='telephone']")
    @CacheLookup
    WebElement Phone_number;

    @FindBy(how = How.XPATH, using = "//input[@name='telephone']")
    @CacheLookup
    WebElement Phone_number2;

    @FindBy(how = How.XPATH, using = "//body/div[2]/aside[2]/div[2]/footer[1]/button[1]")
    @CacheLookup
    WebElement ShipHere;

    @FindBy(how = How.XPATH, using = "//body/div[2]/aside[2]/div[2]/footer[1]/button[1]")
    @CacheLookup
    WebElement ShipHere2;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Cancel')]")
    @CacheLookup
    WebElement Cancel;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/aside[2]/div[2]/header[1]/button[1]")
    @CacheLookup
    WebElement Cross_icon;

    @FindBy(how = How.XPATH, using = "//input[@id='service_po']")
    @CacheLookup
    WebElement Po_Number;
    @FindBy(how = How.XPATH, using = "//body/div[2]/main[1]/div[2]/div[1]/div[3]/aside[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")
    @CacheLookup
    WebElement shiphere_icon1;

    @FindBy(how = How.XPATH, using = "//body/div[2]/main[1]/div[2]/div[1]/div[3]/aside[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]")
    @CacheLookup
    WebElement shiphere_icon2;


    @FindBy(how = How.XPATH, using = "//input[@name='firstname']")
    @CacheLookup
    WebElement Name;
    @FindBy(how = How.XPATH, using = "//input[@name='lastname']")
    @CacheLookup
    WebElement Last_Name;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Next')]")
    @CacheLookup
    WebElement Next;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Ship Here')]")
    @CacheLookup
    WebElement ShipHere3;

    @FindBy(how = How.XPATH, using = "//body/div[1]/main[1]/div[2]/div[1]/div[2]/div[3]/ol[1]/li[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]/span[1]")
    @CacheLookup
    WebElement Edit_button;
    @FindBy(how = How.XPATH, using = "//input[@value='purchaseorder']")
    @CacheLookup
    WebElement MoneyOrder;

    @FindBy(how = How.XPATH, using = "//input[@title='Purchase Order Number']")
    @CacheLookup
    WebElement PurcheseOrderNumber;

    @FindBy(how = How.XPATH, using = "//body/div[2]/main[1]/div[2]/div[1]/div[2]/div[3]/ol[1]/li[4]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/button[1]")
    @CacheLookup
    WebElement PlaceOrder;

    @FindBy(how = How.XPATH, using = "//a[.='Parts & Accessories' and not(@title)]")
    WebElement partandaccessories;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='U-1224BEVS-00B']")
    @CacheLookup
    WebElement modelnumber;

    @FindBy(how = How.XPATH, using = "//button[@id='el_search']")
    @CacheLookup
    WebElement search;

    @FindBy(how = How.XPATH, using = "//input[@product_id='10165']")
    @CacheLookup
    WebElement addtocart;


    @FindBy(how = How.XPATH, using = "//span[contains(text(),'View Cart')]")
    @CacheLookup
    WebElement viewcart;

    @FindBy(how = How.XPATH, using = "//button[@title='Go to Checkout']")
    @CacheLookup
    WebElement checkout;
    @FindBy(how = How.XPATH, using = "//body/div[1]/main[1]/div[2]/div[1]/div[2]/div[3]/ol[1]/li[1]/div[2]/form[1]/fieldset[1]/div[1]/div[1]/input[1]")
    @CacheLookup
    WebElement emailbox;
    @FindBy(how = How.XPATH, using = "//input[@name='firstname']")
    @CacheLookup
    WebElement FirstName;
    @FindBy(how = How.XPATH, using = "//input[@name='lastname']")
    @CacheLookup
    WebElement LastName;

    @FindBy(how = How.XPATH, using = "//input[@name='street[0]']")
    @CacheLookup
    WebElement streetaddress;

    @FindBy(how = How.XPATH, using = "//input[@name='company']")
    @CacheLookup
    WebElement Companyname;

    @FindBy(how = How.XPATH, using = "//input[@name='city']")
    @CacheLookup
    WebElement City1;

    @FindBy(how = How.XPATH, using = "//select[@name='region_id']")
    @CacheLookup
    WebElement state;

    @FindBy(how = How.XPATH, using = "//input[@name='postcode']")
    @CacheLookup
    WebElement zipcode;

    @FindBy(how = How.XPATH, using = "//input[@name='telephone']")
    @CacheLookup
    WebElement phonenumber;

    @FindBy(how = How.XPATH, using = "//input[@id='UBYS92M']")
    @CacheLookup
    WebElement City_Update;

    @FindBy(how = How.XPATH, using = "//input[@value='purchaseorder']")
    @CacheLookup
    WebElement MoneyOrder1;

    @FindBy(how = How.XPATH, using = "//textarea[@class='input-text order-comment order-comment-input']")
    @CacheLookup
    WebElement PurcheseOrderNumber1;

    @FindBy(how = How.XPATH, using = "//body/div[2]/main[1]/div[2]/div[1]/div[2]/div[3]/ol[1]/li[4]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/button[1]")
    @CacheLookup
    WebElement PlaceOrder1;
    @FindBy(how = How.XPATH, using="//input[@id='YGSMVAS']")
    @CacheLookup
    WebElement First_Name;
    @FindBy(how = How.XPATH, using="//input[@id='YGSMVAS']")
    @CacheLookup
    WebElement L_Name;
    @FindBy(how = How.XPATH, using="//input[@id='FQ4R3YE']")
    @CacheLookup
    WebElement Company_Name;
    @FindBy(how = How.XPATH, using="//input[@id='P419BJQ']")
    @CacheLookup
    WebElement Street_address;
    @FindBy(how = How.XPATH, using="//select[@id='FV7QW5P']")
    @CacheLookup
    WebElement State_provience;
    @FindBy(how = How.XPATH, using="//input[@id='QVXA6E6']")
    @CacheLookup
    WebElement Postal_code;

    @FindBy(how = How.XPATH, using="//input[@id='NYCMVV5']")
    @CacheLookup
    WebElement P_number;
    @FindBy(how = How.XPATH, using="//body/div[2]/main[1]/div[2]/div[1]/div[2]/div[3]/ol[1]/li[4]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/fieldset[1]/div[3]/div[1]/button[1]")
    @CacheLookup
    WebElement Update_button;

    public Checkout_retailer_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void Parts_and_accessories() {
        logger.info("It should be redirect to part & accessories page\n");
        WebElement source= driver.findElement(By.xpath("//span[contains(text(),'Support & Resources')]"));
        WebElement target= driver.findElement(By.xpath("//a[.='Parts & Accessories ' and not(@title)]"));
        Actions action = new Actions(driver);
//moving to the main menu and then sub menu and clicking on it using object of the Actions class
        action.moveToElement(source).moveToElement(target).click().build().perform();
    }




    public void viewcart() throws InterruptedException {
        logger.info(" \"It should be redirect to shopping cart page\n" +
                "\"\n ");
        Thread.sleep(10000);
        WebElement ele2= driver.findElement(By.xpath("//input[@id='serial']"));
        ele2.click();
        String select = Keys.chord(Keys.CONTROL, "a");

        ele2.sendKeys(select);


        ele2.sendKeys("42248725-ACCY");
        ele2.sendKeys(Keys.ENTER);
        //WebDriverWait wait2 = new WebDriverWait(driver, 10);
        //wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkmo']")));
        WebElement element = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/div[1]/input[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        viewcart.click();

    }


    public void checkout() throws InterruptedException {
        Thread.sleep(10000);
        logger.info(" It should redirect to the Checkout page.\n ");
        WebElement element = driver.findElement(By.xpath("//button[@data-role='proceed-to-checkout']"));
        Actions actions = new Actions(driver);
        //actions.moveToElement(element).click().build().perform();
        element.click();

        //WebDriverWait wait2 = new WebDriverWait(driver, 10);
        //wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkmo']")));
//        WebElement element = driver.findElement(By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[3]/div[2]/ul[1]/li[1]/button[1]/span[1]"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().build().perform();
      // element.click();

    }

    public void emailbox() throws InterruptedException {
        Thread.sleep(4000);
        logger.info(" \"It should be redirect to shopping cart page\n" +
                "\"\n ");
        emailbox.sendKeys("puja@upbott.com");

    }

    public void FirstName() throws InterruptedException {
        Thread.sleep(5000);
        logger.info(" \"It should be redirect to shopping cart page\n" +
                "\"\n ");
        FirstName.sendKeys("puja");

    }

    public void LastName() throws InterruptedException {
        Thread.sleep(4000);
        LastName.sendKeys("Domke");

    }

    public void streetaddress() throws InterruptedException {
        Thread.sleep(4000);
        streetaddress.sendKeys("test 1234");

    }

    public void Companyname() throws InterruptedException {
        Thread.sleep(4000);
        Companyname.sendKeys("Upbott");

    }

    public void City() throws InterruptedException {
        Thread.sleep(4000);
        City.sendKeys("missouri");

    }

    public void State() throws InterruptedException {
        Thread.sleep(4000);
        WebElement ele = driver.findElement(By.xpath("//select[@name='region_id']"));
        ele.click();
        Select state = new Select(ele);
        state.selectByValue("36");


    }

    public void zipcode() throws InterruptedException {
        Thread.sleep(4000);
        zipcode.sendKeys("63011");

    }

    public void phonenumber() throws InterruptedException {
        Thread.sleep(4000);
        phonenumber.sendKeys("63011");

    }

    public void Next() throws InterruptedException {
        Thread.sleep(6000);
        Next.click();
        Thread.sleep(6000);

    }

    public void PurchaseOrder() throws InterruptedException {
        Thread.sleep(13000);
        WebElement element = driver.findElement(By.xpath("//input[@value='purchaseorder']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();


    }

    public void PurchaseOrderNumber() throws InterruptedException {
        Thread.sleep(6000);
        PurcheseOrderNumber.sendKeys("9876567");

    }
    public void Creadit_card_number() throws InterruptedException {
        logger.info("Enter Credit cart detail");
        Thread.sleep(10000);
        WebElement ele= driver.findElement(By.xpath("//input[@type='number'][contains(@id,'number')]"));
        ele.sendKeys("54677889798");
        Thread.sleep(10000);
        WebElement month= driver.findElement(By.xpath("//select[@name='payment[cc_exp_month]'][contains(@id,'expiration')]"));
        Select sel=new Select(month);
        sel.selectByValue("2");
        Thread.sleep(5000);
        WebElement year= driver.findElement(By.xpath("//select[@name='payment[cc_exp_year]'][contains(@id,'yr')]"));
        Select sel2=new Select(year);
        sel2.selectByValue("2022");
        WebElement cvv= driver.findElement(By.xpath("//input[contains(@class,'input-text cvv')]"));
        cvv.sendKeys("443");
        Thread.sleep(5000);
//        WebElement order= driver.findElement(By.xpath("(//span[contains(@class,'action action-toggle')])[1]"));
//        order.click();
//        Thread.sleep(5000);
        WebElement text= driver.findElement(By.xpath("//textarea[contains(@class,'input-text order-comment order-comment-input')]"));
        text.sendKeys("Testing request from upbott team");

    }
    public void Place_order() throws InterruptedException {
        logger.info("\"The order should be placed with message \n" +
                "'Your order number is: Order_number.\n" +
                "We'll email you an order confirmation with details and tracking info.'\"");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement ele= driver.findElement(By.xpath("(//button[@class='action primary checkout'])[2]"));
     ac.moveToElement(ele).click().build().perform();



    }


    public void Signin_info_for_blank_address() throws InterruptedException {
        Thread.sleep(8000);
        logger.info("Error message should display\"This is Required Field\" and you should not be able to Register\n");
        Zip_code.sendKeys("63011");
        Thread.sleep(10000);

        Next.click();

    }
    public void Order_summery() throws InterruptedException {

        Thread.sleep(8000);
        logger.info("Application should display correct 'Subtotal'.\n");
    WebElement ele= driver.findElement(By.xpath("//div[contains(@class,'opc-block-summary')]"));
       System.out.println("Order summary result:"+ele.getText());}


    public void Signin_info_for_Invalid_email_address() throws InterruptedException {
        Thread.sleep(8000);
        logger.info("Error message should display.\n");
        String select = Keys.chord(Keys.CONTROL, "a");

        Name.sendKeys(select);
        Name.sendKeys("67878");
        WebElement Last_Name= driver.findElement(By.xpath("//input[@name='lastname']"));
        Last_Name.sendKeys(select);
        Last_Name.sendKeys("67878");
        WebElement StreetAddress= driver.findElement(By.xpath("//input[@name='street[0]']"));
        StreetAddress.sendKeys(select);
        StreetAddress.sendKeys("test345");
        WebElement CompanyName= driver.findElement(By.xpath("//input[@name='company']"));
        CompanyName.sendKeys(select);
        CompanyName.sendKeys("upbott");
        WebElement City= driver.findElement(By.xpath("//input[@name='city']"));;
        City.sendKeys(select);
        City.sendKeys("missouri");
        WebElement State= driver.findElement(By.xpath("//select[@name='region_id']"));
        State.click();
        Select sel = new Select(State);
        sel.selectByValue("36");
        WebElement emailbox= driver.findElement(By.cssSelector("#customer-email"));
        emailbox.sendKeys(select);
        emailbox.sendKeys("puja2upbott.com");
        WebElement Zip_code= driver.findElement(By.xpath("//input[@name='postcode']"));
        Zip_code.sendKeys(select);
        Zip_code.sendKeys("63011");
        Thread.sleep(10000);
        WebElement Phone_number= driver.findElement(By.xpath("//input[@name='telephone']"));
        Phone_number.sendKeys(select);
       Phone_number.sendKeys("8987678987");

        WebElement Shipping_method= driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]"));
        Shipping_method.click();
        WebElement Next= driver.findElement(By.xpath("//span[contains(text(),'Next')]"));

        Next.click();

    }

    public void Signin_info_for_valid_email_address() throws InterruptedException {
        logger.info("It should be redirect to part & accessories page\n");
        Thread.sleep(8000);
        String select = Keys.chord(Keys.CONTROL, "a");

        Name.sendKeys(select);
        WebElement Name= driver.findElement(By.xpath("//input[@name='firstname']"));
        Name.sendKeys("67878");
        WebElement Last_Name= driver.findElement(By.xpath("//input[@name='lastname']"));
        Last_Name.sendKeys(select);
        Last_Name.sendKeys("67878");
        WebElement StreetAddress= driver.findElement(By.xpath("//input[@name='street[0]']"));
        StreetAddress.sendKeys(select);
        StreetAddress.sendKeys("test345");
        WebElement CompanyName= driver.findElement(By.xpath("//input[@name='company']"));
        CompanyName.sendKeys(select);
        CompanyName.sendKeys("upbott");
        WebElement City= driver.findElement(By.xpath("//input[@name='city']"));
        City.sendKeys(select);
        City.sendKeys("missouri");
        WebElement State= driver.findElement(By.xpath("//select[@name='region_id']"));
        State.sendKeys(select);
        State.click();
        Select sel = new Select(State);
        sel.selectByValue("36");
        WebElement emailbox= driver.findElement(By.cssSelector("#customer-email"));
        emailbox.sendKeys(select);
        emailbox.sendKeys("puja@upbott.com");
        WebElement Zip_code= driver.findElement(By.xpath("//input[@name='postcode']"));
        Zip_code.sendKeys(select);
        Zip_code.sendKeys("63011");
        Thread.sleep(10000);
        WebElement Phone_number= driver.findElement(By.xpath("//input[@name='telephone']"));
        Phone_number.sendKeys(select);
        Phone_number.sendKeys("8987678987");

        WebElement Shipping_method= driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]"));
        Shipping_method.click();
        WebElement Next= driver.findElement(By.xpath("//span[contains(text(),'Next')]"));

       // Next.click();

    }
    public void valid_address() throws InterruptedException {
        Thread.sleep(8000);
        logger.info("Application should display \"Thank you for registering! We are currently reviewing your account. You will receive an email including access information within 48 hours.\" and user should  receive 'Welcome to Marvel Refrigeration' email\n");
        String select = Keys.chord(Keys.CONTROL, "a");

        Name.sendKeys(select);
        WebElement Name= driver.findElement(By.xpath("//input[@name='firstname']"));
        Name.sendKeys("Puja");
        WebElement Last_Name= driver.findElement(By.xpath("//input[@name='lastname']"));
        Last_Name.sendKeys(select);
        Last_Name.sendKeys("Domke");
        WebElement StreetAddress= driver.findElement(By.xpath("//input[@name='street[0]']"));
        StreetAddress.sendKeys(select);
        StreetAddress.sendKeys("test345");
        WebElement CompanyName= driver.findElement(By.xpath("//input[@name='company']"));
        CompanyName.sendKeys(select);
        CompanyName.sendKeys("upbott");
        WebElement City= driver.findElement(By.xpath("//input[@name='city']"));
        City.sendKeys(select);
        City.sendKeys("missouri");
        WebElement State= driver.findElement(By.xpath("//select[@name='region_id']"));
        State.sendKeys(select);
        State.click();
        Select sel = new Select(State);
        sel.selectByValue("36");
        WebElement emailbox= driver.findElement(By.cssSelector("#customer-email"));
        emailbox.sendKeys(select);
        emailbox.sendKeys("puja@upbott.com");
        WebElement Zip_code= driver.findElement(By.xpath("//input[@name='postcode']"));
        Zip_code.sendKeys(select);
        Zip_code.sendKeys("63011");
        Thread.sleep(10000);
        WebElement Phone_number= driver.findElement(By.xpath("//input[@name='telephone']"));
        Phone_number.sendKeys(select);
        Phone_number.sendKeys("8987678987");

        WebElement Shipping_method= driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]"));
        Shipping_method.click();
        WebElement Next= driver.findElement(By.xpath("//span[contains(text(),'Next')]"));

        Next.click();
    }

    public void Apply_promo_code() throws InterruptedException {
        logger.info("\"It should redirect to Review & Payments .\n" +
                "Provide PO Number Field should not required\"");
        Thread.sleep(30000);
      WebElement ele= driver.findElement(By.xpath("//span[@id='block-discount-heading']"));
      ele.click();

        WebElement ele1= driver.findElement(By.xpath("//input[@id='discount-code']"));
        ele1.sendKeys("778878");

        WebElement ele2= driver.findElement(By.xpath("//span[@id='block-discount-heading']"));
        ele2.click();
        Thread.sleep(6000);

    }

    public void PurchaseOrder1() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("\"By default selected credit & debit cards\n" +
                "It should be clickable(radio button)\"\n");
        WebElement ele1= driver.findElement(By.xpath("//input[@name='payment[method]']"));
        ele1.click();

        Thread.sleep(9000);

        WebElement element4 = driver.findElement(By.xpath("//textarea[@class='input-text order-comment order-comment-input']"));
        element4.sendKeys("Testing request");

    }


    public void Shiphere_icon1() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should be redirect to shipping address form");
        WebElement  shiphere_icon1 =driver.findElement(By.xpath("//button[@data-bind='click: back']"));
        shiphere_icon1.click();
        Thread.sleep(10000);
        WebElement next=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
        next.click();


    }

    public void Shiphere_icon2() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should be redirect to shipping address form");
        WebElement shiphere_icon2=driver.findElement(By.xpath("//button[@data-bind='click: backToShippingMethod']"));
        shiphere_icon2.click();
        Thread.sleep(10000);
      WebElement next=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
      next.click();

    }

    public void New_address_From_Payment() throws InterruptedException {
        Thread.sleep(30000);
        logger.info("It should be redirect to shipping address form");
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,-1000)");
//        WebElement ele1= driver.findElement(By.xpath("//input[@name='payment[method]']"));
//        ele1.click();
       // Thread.sleep(9000);
        WebElement check = driver.findElement(By.xpath("//input[@name='billing-address-same-as-shipping']"));
        check.click();





    }
    public void New_address_From_Payment_blank_data() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should be redirect to shipping address form");
        Actions ac=new Actions(driver);
        WebElement ele= driver.findElement(By.xpath("(//span[contains(.,'Update')])[2]"));
        ac.moveToElement(ele).click().build().perform();
    }
    public void New_address_From_Payment_valid_data() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should be redirect to shipping address form");
        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");
        Actions ac=new Actions(driver);
        WebElement fname= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[21]"));
        ac.moveToElement(fname).click().build().perform();
        fname.sendKeys(select);
        fname.sendKeys("Puja");
        WebElement lname= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[22]"));
        lname.sendKeys(select);
        lname.sendKeys("Domke");
        WebElement company= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[23]"));
        company.sendKeys(select);
        company.sendKeys("upbott");
        WebElement sd= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[24]"));
        sd.sendKeys(select);
        sd.sendKeys("test 123");
        WebElement city= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[27]"));
        city.sendKeys(select);
        city.sendKeys("missouri");
        WebElement state= driver.findElement(By.xpath("(//select[contains(@class,'select')])[3]"));
        Select sel=new Select(state);
        sel.selectByValue("36");
        WebElement zipcode= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[29]"));
        zipcode.sendKeys(select);
        zipcode.sendKeys("63011");
        WebElement pnumber= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[30]"));
        pnumber.sendKeys(select);
        pnumber.sendKeys("9878765676");


        WebElement ele= driver.findElement(By.xpath("(//span[contains(.,'Update')])[2]"));
       ele.click();
    }
    public void New_address_From_Payment_Invalid_data() throws InterruptedException {
        Thread.sleep(10000);

        String select = Keys.chord(Keys.CONTROL, "a");
        Actions ac=new Actions(driver);
        WebElement fname= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[21]"));
        ac.moveToElement(fname).click().build().perform();
        fname.sendKeys("65767$fgg");
        WebElement lname= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[22]"));
        lname.sendKeys(select);
        lname.sendKeys("5454sfs");
        WebElement company= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[23]"));
        company.sendKeys(select);
        company.sendKeys("upbott");
        WebElement sd= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[24]"));
        sd.sendKeys(select);
        sd.sendKeys("test 123");
        WebElement city= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[27]"));
        city.sendKeys(select);
        city.sendKeys("missouri");
        WebElement state= driver.findElement(By.xpath("(//select[contains(@class,'select')])[3]"));
        Select sel=new Select(state);
        sel.selectByValue("36");
        WebElement zipcode= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[29]"));
        zipcode.sendKeys(select);
        zipcode.sendKeys("455");
        WebElement pnumber= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[30]"));
        pnumber.sendKeys(select);
        pnumber.sendKeys("7899");

    }

    public void Continue_shipping() throws InterruptedException {
        Thread.sleep(20000);
        logger.info("It should redirect to homepage");
        WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'Continue Shopping')]"));
        ele.click();

    }
}