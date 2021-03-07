package com.U_line.page.actions.web.Retailer;

import com.U_line.page.actions.web.Servicer.Servicer_Homepage_Page;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.ArrayList;

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
    @FindBy(how = How.XPATH, using = "//body/div[2]/main[1]/div[2]/div[1]/div[2]/aside[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")
    @CacheLookup
    WebElement shiphere_icon1;

    @FindBy(how = How.XPATH, using = "//body/div[2]/main[1]/div[2]/div[1]/div[2]/aside[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]")
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

    @FindBy(how = How.XPATH, using = "//input[@title='Purchase Order Number']")
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


    public void openpartsandaccessories() {
        //info("Opening Part and accessories page ..........");
        partandaccessories.click();
        driver.getTitle();
    }


    public void modelnumber() {
        modelnumber.sendKeys("U-1024BEVS-00B");

    }


    public void search() {
        search.click();
        // TODO Auto-generated method stub

    }


    public void addtocart() throws InterruptedException {
        Thread.sleep(5000);
        //WebDriverWait wait2 = new WebDriverWait(driver, 10);
        //wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkmo']")));
        WebElement element = driver.findElement(By.xpath("//input[@product_id='10165']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
        //addtocart.click();


    }


    public void viewcart() throws InterruptedException {
        Thread.sleep(8000);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(4000);
        viewcart.click();


    }


    public void checkout() throws InterruptedException {
        Thread.sleep(4000);

        //WebDriverWait wait2 = new WebDriverWait(driver, 10);
        //wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkmo']")));
        WebElement element = driver.findElement(By.xpath("//button[@title='Go to Checkout']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
        //checkout.click();

    }

    public void emailbox() throws InterruptedException {
        Thread.sleep(4000);
        emailbox.sendKeys("puja@upbott.com");

    }

    public void FirstName() throws InterruptedException {
        Thread.sleep(5000);
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

    public void PlaceOrder() throws InterruptedException {
        Thread.sleep(8000);
        PlaceOrder.click();

    }

    public void Signin_info_for_blank_address() throws InterruptedException {
        Thread.sleep(8000);
        Zip_code.sendKeys("63011");
        Thread.sleep(10000);

        Next.click();

    }

    public void Signin_info_for_Invalid_email_address() throws InterruptedException {
        Thread.sleep(8000);
        Name.sendKeys("67878");
        Last_Name.sendKeys("67878");
        StreetAddress.sendKeys("test345");
        CompanyName.sendKeys("upbott");
        City.sendKeys("missouri");
        State.click();
        Select sel = new Select(state);
        sel.selectByValue("36");
        emailbox.sendKeys("puja2upbott.con");
        Zip_code.sendKeys("63011");
        Thread.sleep(10000);

        Next.click();

    }

    public void Signin_info_for_valid_email_address() throws InterruptedException {
        Thread.sleep(8000);
        String select = Keys.chord(Keys.CONTROL, "a");

        Name.sendKeys(select);
        Name.sendKeys("puja");
        Last_Name.sendKeys(select);
        Last_Name.sendKeys("Domke");
        StreetAddress.sendKeys(select);
        StreetAddress.sendKeys("test345");
        CompanyName.sendKeys(select);
        CompanyName.sendKeys("upbott");
        City.sendKeys(select);
        City.sendKeys("missouri");

        State.click();
        Select sel = new Select(state);
        sel.selectByValue("36");
        emailbox.sendKeys(select);
        emailbox.sendKeys("puja@upbott.com");
        Zip_code.sendKeys(select);
        Zip_code.sendKeys("63011");
        Phone_number.sendKeys("9878987678");
        Thread.sleep(10000);

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
        logger.info("\"It should be by default check and able to check and uncheck.\n" +
                "The dropdown should appear when unchecked with 'cancel' & 'update' button.\n" +
                "The 'Place Order' button should be disabled when the checkbox is unchecked\"");
        WebElement element = driver.findElement(By.xpath("//input[@value='purchaseorder']"));
        element.click();
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).click().build().perform();
        if (element.isSelected()) {
            System.out.println("Radio button is selected");

        } else {
            System.out.println("Radio button is not selected");
        }

//		WebDriverWait wait = new WebDriverWait(driver, 30);
//	WebElement element1=	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='purchaseorder']")));
//		//WebDriverWait wait1 = new WebDriverWait(driver, 10);
//		//WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("xpath_of_element_to_be_clicked")));
//		element1.click();

    }

    public void PurchaseOrderNumber1() throws InterruptedException {
        Thread.sleep(6000);
        logger.info("The address you added earlier should appear in this dropdown with one extra option New Address. All the options in that dropdown should be selectable ");
        WebElement check = driver.findElement(By.xpath("//input[@id='billing-address-same-as-shipping-purchaseorder']"));
        check.click();
        WebElement drop;
        drop = driver.findElement(By.xpath("//body/div[2]/main[1]/div[2]/div[1]/div[2]/div[3]/ol[1]/li[4]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/fieldset[1]/div[1]/div[1]/select[1]"));
        drop.click();
        Thread.sleep(6000);
        Select sel = new Select(drop);
        WebElement check2 = driver.findElement(By.xpath("//input[@id='billing-address-same-as-shipping-purchaseorder']"));

        check2.click();
        PurcheseOrderNumber.sendKeys("9876567");

    }


    public void Shiphere_icon1() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should be redirect to shipping address form");

        shiphere_icon1.click();
        Thread.sleep(10000);
        Next.click();


    }

    public void Shiphere_icon2() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should be redirect to shipping address form");

        shiphere_icon2.click();
        Thread.sleep(10000);
        Next.click();


    }

    public void New_address_From_Payment() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should be redirect to shipping address form");
        WebElement check = driver.findElement(By.xpath("//input[@id='billing-address-same-as-shipping-purchaseorder']"));
        check.click();
        WebElement drop;
        drop = driver.findElement(By.xpath("//body/div[2]/main[1]/div[2]/div[1]/div[2]/div[3]/ol[1]/li[4]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/fieldset[1]/div[1]/div[1]/select[1]"));
        drop.click();
        Thread.sleep(6000);
        Select sel = new Select(drop);
        //  WebElement check2= driver.findElement(By.xpath("//input[@id='billing-address-same-as-shipping-purchaseorder']"))      ;

        //   check2.click();
        PurcheseOrderNumber.sendKeys("9876567");


    }
    public void New_address_From_Payment_blank_data() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should be redirect to shipping address form");
        Update_button.click();
    }
    public void New_address_From_Payment_valid_data() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should be redirect to shipping address form");
        Thread.sleep(8000);
        String select = Keys.chord(Keys.CONTROL, "a");

        First_Name.sendKeys(select);
        First_Name.sendKeys("puja");
        L_Name.sendKeys(select);
        L_Name.sendKeys("Domke");
        Street_address.sendKeys(select);
        Street_address.sendKeys("test345");
        Company_Name.sendKeys(select);
        Company_Name.sendKeys("upbott");
        City_Update.sendKeys(select);
        City_Update.sendKeys("missouri");

        State_provience.click();
        Select sel = new Select(State_provience);
        sel.selectByValue("36");
//        emailbox.sendKeys(select);
//        emailbox.sendKeys("puja@upbott.con");
        Postal_code.sendKeys(select);
        Postal_code.sendKeys("63011");
        P_number.sendKeys("9878987678");
        Thread.sleep(10000);

        Update_button.click();
    }
    public void New_address_From_Payment_Invalid_data() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should be redirect to shipping address form");
        Thread.sleep(8000);
        String select = Keys.chord(Keys.CONTROL, "a");

        First_Name.sendKeys(select);
        First_Name.sendKeys("$56667");
        L_Name.sendKeys(select);
        L_Name.sendKeys("^&&*&");
        Street_address.sendKeys(select);
        Street_address.sendKeys("test345");
        Company_Name.sendKeys(select);
        Company_Name.sendKeys("upbott");
        City_Update.sendKeys(select);
        City_Update.sendKeys("missouri");

        State_provience.click();
        Select sel = new Select(State_provience);
        sel.selectByValue("36");
//        emailbox.sendKeys(select);
//        emailbox.sendKeys("puja@upbott.con");
        Postal_code.sendKeys(select);
        Postal_code.sendKeys("7989");
        P_number.sendKeys("9878987678");
        Thread.sleep(10000);

        Update_button.click();
    }

    public void Continue_shipping() throws InterruptedException {
        Thread.sleep(20000);
        logger.info("It should redirect to homepage");
        WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'Continue Shopping')]"));
        ele.click();

    }
}