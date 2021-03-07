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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.util.ArrayList;

public class Checkout_page {
    private static final Logger logger = LoggerFactory.getLogger(Servicer_Homepage_Page.class);
    private static final String APPLICATION_URL = Config.getProperty("appURL");
    private WebDriver driver;
    @FindBy(how = How.XPATH, using="//a[.='Provider Login' and not(@title)]")
    @CacheLookup
    WebElement providerlogin;

    @FindBy(how = How.XPATH, using="//body/div[2]/main[1]/div[2]/div[1]/div[2]/div[3]/ol[1]/li[4]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/fieldset[1]/div[3]/div[1]/button[1]")
    @CacheLookup
    WebElement Update_button;

    @FindBy(how = How.XPATH, using="//input[@id='email']")
    @CacheLookup
    WebElement txtemail;



    @FindBy(xpath="//input[@id='pass']")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(name="send")
    @CacheLookup
    WebElement btnLogin;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'New Address')]")
    @CacheLookup
    WebElement Add_New_address;

    @FindBy(how = How.XPATH, using="//input[@name='street[0]']")
    @CacheLookup
    WebElement StreetAddress;

    @FindBy(how = How.XPATH, using="//input[@name='street[0]']")
    @CacheLookup
    WebElement StreetAddress2;

    @FindBy(how = How.XPATH, using="//input[@name='company']")
    @CacheLookup
    WebElement CompanyName;

    @FindBy(how = How.XPATH, using="//input[@name='company']")
    @CacheLookup
    WebElement CompanyName2;

    @FindBy(how = How.XPATH, using="//input[@name='city']")
    @CacheLookup
    WebElement City;

    @FindBy(how = How.XPATH, using="//input[@name='city']")
    @CacheLookup
    WebElement City2;

    @FindBy(how = How.XPATH, using="//select[@name='region_id']")
    @CacheLookup
    WebElement State;

    @FindBy(how = How.XPATH, using="//select[@name='region_id']")
    @CacheLookup
    WebElement State2;

    @FindBy(how = How.XPATH, using="//input[@name='postcode']")
    @CacheLookup
    WebElement Zip_code;

    @FindBy(how = How.XPATH, using="//input[@name='postcode']")
    @CacheLookup
    WebElement Zip_code2;

    @FindBy(how = How.XPATH, using="//input[@name='telephone']")
    @CacheLookup
    WebElement Phone_number;

    @FindBy(how = How.XPATH, using="//input[@name='telephone']")
    @CacheLookup
    WebElement Phone_number2;

    @FindBy(how = How.XPATH, using="//body/div[2]/aside[2]/div[2]/footer[1]/button[1]")
    @CacheLookup
    WebElement ShipHere;

    @FindBy(how = How.XPATH, using="//body/div[2]/aside[2]/div[2]/footer[1]/button[1]")
    @CacheLookup
    WebElement ShipHere2;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Cancel')]")
    @CacheLookup
    WebElement Cancel;

    @FindBy(how = How.XPATH, using="/html[1]/body[1]/div[2]/aside[2]/div[2]/header[1]/button[1]")
    @CacheLookup
    WebElement Cross_icon;

    @FindBy(how = How.XPATH, using="//input[@id='service_po']")
    @CacheLookup
    WebElement Po_Number;
    @FindBy(how = How.XPATH, using="//body/div[2]/main[1]/div[2]/div[1]/div[2]/aside[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")
    @CacheLookup
    WebElement shiphere_icon1;

    @FindBy(how = How.XPATH, using="//body/div[2]/main[1]/div[2]/div[1]/div[2]/aside[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]")
    @CacheLookup
    WebElement shiphere_icon2;


    @FindBy(how = How.XPATH, using="//input[@name='firstname']")
    @CacheLookup
    WebElement Name;
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

    @FindBy(how = How.XPATH, using="//input[@name='lastname']")
    @CacheLookup
    WebElement Last_Name;
    @FindBy(how = How.XPATH, using="//span[contains(text(),'Next')]")
    @CacheLookup
    WebElement Next;
    @FindBy(how = How.XPATH, using="//span[contains(text(),'Ship Here')]")
    @CacheLookup
    WebElement ShipHere3;

    @FindBy(how = How.XPATH, using="//body/div[1]/main[1]/div[2]/div[1]/div[2]/div[3]/ol[1]/li[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]/span[1]")
    @CacheLookup
    WebElement Edit_button;
    @FindBy(how = How.XPATH, using="//input[@value='purchaseorder']")
    @CacheLookup
    WebElement MoneyOrder;
    @FindBy(how = How.XPATH, using = "//input[@id='UBYS92M']")
    @CacheLookup
    WebElement City_Update;

    @FindBy(how = How.XPATH, using="//input[@title='Purchase Order Number']")
    @CacheLookup
    WebElement PurcheseOrderNumber;

    @FindBy(how = How.XPATH, using="//body/div[2]/main[1]/div[2]/div[1]/div[2]/div[3]/ol[1]/li[4]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/button[1]")
    @CacheLookup
    WebElement PlaceOrder;


//    @FindBy(how = How.XPATH, using="//span[contains(text(),'Next')]")
//    @CacheLookup
    //WebElement Next;


    public Checkout_page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    public void providerlogin() {
        logger.info("provider login");
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


    public void Checkout_Page() throws InterruptedException {
        Thread.sleep(4000);
        logger.info("Application should display Product image clear & distinct.");
        Thread.sleep(8000);
        WebElement ele= driver.findElement(By.xpath("//label[contains(text(),'Serial Number')]"));
        ele.click();
        WebElement ele2= driver.findElement(By.xpath("//input[@id='serial']"));

        ele2.sendKeys("1957171060030");

        ele2.sendKeys(Keys.ENTER);

        Thread.sleep(10000);
        //WebDriverWait wait2 = new WebDriverWait(driver, 10);
        //wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkmo']")));
        WebElement element = driver.findElement(By.xpath("(//input[contains(@type,'button')])[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
        Thread.sleep(10000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(4000);
        WebElement view= driver.findElement(By.xpath("//span[contains(.,'Continue Shopping')]"));
        view.click();
        Thread.sleep(9000);
        WebElement element1 = driver.findElement(By.xpath("(//input[contains(@type,'button')])[2]"));
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(element1).click().build().perform();


        WebUtils.navigateToURL(APPLICATION_URL+"checkout/#shipping");
    }

    public void Shiphere_button() throws InterruptedException {
        Thread.sleep(4000);
        logger.info("It should be select after click on ship here and the product should be shipped to that address");
        ShipHere3.click();
    }

    public void Add_New_address() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("The popup should open with heading shipping address");
        Actions ac=new Actions(driver);
        WebElement Add_New_address= driver.findElement(By.xpath("//span[contains(.,'New Address')]"));
       ac.moveToElement(Add_New_address).click().build().perform();}

    public void Address_form_with_blank() throws InterruptedException {
logger.info("Error message should display.");
        Thread.sleep(6000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        ShipHere.click();
    }

    public void Address_form_with_Cancel_Button() throws InterruptedException {
        logger.info("The popup should be closed");

        Thread.sleep(6000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        Cancel.click();
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement Add_New_address= driver.findElement(By.xpath("//span[contains(.,'New Address')]"));
        ac.moveToElement(Add_New_address).click().build().perform();
    }
    public void Address_form_with_Cross_icon() throws InterruptedException {
        logger.info("The popup should be closed");

        Thread.sleep(6000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        Cross_icon.click();
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement Add_New_address= driver.findElement(By.xpath("//span[contains(.,'New Address')]"));
        ac.moveToElement(Add_New_address).click().build().perform();
    }

    public void Address_form_with_InValid() throws InterruptedException, AWTException {
        logger.info("Error message should display.");
        Thread.sleep(9000);
        Robot robot = new Robot();
        robot.mouseMove(400,100); // Navigating through mouse hover. Note that the coordinates might differ, kindly check the coordinates of x and y axis and update it accordingly.
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(2000);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(9000);
//       // scr1 = driver.findElement(By.xpath("//div[@id='modal-content-16']"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//// Scroll inside web element vertically (e.g. 100 pixel)
//        js.executeScript("arguments[0].scrollTop = arguments[1];",driver.findElement(By.xpath("//div[@id='modal-content-16']")), 100);
        String select = Keys.chord(Keys.CONTROL, "a");
        Name.sendKeys(select);
        Name.sendKeys("Puja");
        Last_Name.sendKeys(select);
        Last_Name.sendKeys("Domke");

        StreetAddress2.sendKeys(select);
        StreetAddress2.sendKeys("5676778");
        CompanyName2.sendKeys(select);
        CompanyName2.sendKeys("upbott");
        City2.sendKeys(select);
        City2.sendKeys("Missauri");
        Thread.sleep(2000);
        State2.click();
        Select select1=new Select(State2);
        select1.selectByValue("36");
        Thread.sleep(2000);
        Zip_code2.sendKeys(select);
        Zip_code2.sendKeys("ytgg");
        Phone_number2.sendKeys(select);
        Phone_number2.sendKeys("9878987678");
        //ShipHere2.click();
    }
    public void Address_form_with_Valid() throws InterruptedException {
        logger.info("Information should dispaly in section in front and that section should display as a selected with 'edit' button");
  //  Add_New_address.click();
        Thread.sleep(10000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        String select = Keys.chord(Keys.CONTROL, "a");

        StreetAddress.sendKeys(select);
        StreetAddress.sendKeys("test 123");
        CompanyName.sendKeys(select);
        CompanyName.sendKeys("upbott");
        City.sendKeys(select);
        City.sendKeys("Missauri");
        State.click();
        Select select1=new Select(State);
        select1.selectByValue("36");
        Zip_code.sendKeys(select);
        Zip_code.sendKeys("63011");
        Phone_number.sendKeys(select);
        Phone_number.sendKeys("9878987678");
        ShipHere.click();
    }
    public void order_summery() throws InterruptedException {
        logger.info("Address should get edited");
        Thread.sleep(10000);
        WebElement Edit_button= driver.findElement(By.xpath("//div[contains(@class,'opc-block-summary')]"));
        System.out.println(Edit_button.getText());

    }
    public void Edit_Button()
    {
        logger.info("Address should get edited");
        Edit_button.click();
        Name.sendKeys("domke");
        ShipHere2.click();
    }

    public void Po_Number()
    {
        logger.info("\"It should redirect to Review & Payments .\n" +
                "Provide PO Number Field should not required\"");
       Po_Number.sendKeys("899777");
       Next.click();
    }
    public void PurchaseOrder() throws InterruptedException {
        Thread.sleep(50000);
        logger.info("\"It should be by default check and able to check and uncheck.\n" +
                "The dropdown should appear when unchecked with 'cancel' & 'update' button.\n" +
                "The 'Place Order' button should be disabled when the checkbox is unchecked\"");
        WebElement element = driver.findElement(By.xpath("//input[contains(@value,'partsAccounts')]"));

//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).click().build().perform();
        if (element.isDisplayed()) {
            element.click();
            System.out.println("Radio button is selected");

        } else {
            System.out.println("Radio button is not selected");
        }


    }
    public void purchase_order() throws InterruptedException {
        Thread.sleep(6000);
        logger.info("The address you added earlier should appear in this dropdown with one extra option New Address. All the options in that dropdown should be selectable ");
         WebElement check= driver.findElement(By.xpath("(//textarea[contains(@class,'input-text order-comment order-comment-input')])[1]"));
          check.sendKeys("Teasting request from upbott team");

    }

    public void PlaceOrder() throws InterruptedException {
        Thread.sleep(6000);
        WebElement check= driver.findElement(By.xpath("(//button[@class='action primary checkout'][contains(.,'Place Order')])[1]"));
check.click();
    }

    public void Shiphere_icon1() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should be redirect to shipping address form");
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        WebElement check= driver.findElement(By.xpath("//button[@data-bind='click: back']"));
        check.click();
        Thread.sleep(10000);
        Next.click();


    }

    public void Shiphere_icon2() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should be redirect to shipping address form");
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,-1000)");
        WebElement check= driver.findElement(By.xpath("//button[contains(@data-bind,'click: backToShippingMethod')]"));
        check.click();
        Thread.sleep(10000);
        Next.click();


    }

    public void New_address_From_Payment_blank_data() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should be redirect to shipping address form");

        WebElement check= driver.findElement(By.xpath("//input[contains(@id,'billing-address-same-as-shipping-partsAccounts')]"));
        check.click();
        Thread.sleep(10000);
        WebElement
        drop = driver.findElement(By.xpath("(//select[contains(@name,'billing_address_id')])[1]"));
drop.click();
        Select sel=new Select(drop);
        sel.selectByVisibleText("New Address");
        Actions ac=new Actions(driver);
        WebElement check2= driver.findElement(By.xpath("(//button[contains(.,'Update')])[4]"))      ;

       ac.moveToElement(check2).click().build().perform();

    }


    public void Payment_New_address_invalid() throws InterruptedException {
        logger.info("Error message should display. ");
        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");
        Actions ac=new Actions(driver);
        WebElement fname= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[19]"));
        ac.moveToElement(fname).click().build().perform();
        fname.sendKeys("65767$fgg");
        WebElement lname= driver.findElement(By.xpath("(//input[contains(@aria-invalid,'false')])[11]"));
        lname.sendKeys(select);
        lname.sendKeys("5454sfs");
        WebElement company= driver.findElement(By.xpath("(//input[@aria-invalid='false'])[12]"));
        company.sendKeys(select);
        company.sendKeys("upbott");
        WebElement sd= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[14]"));
        sd.sendKeys(select);
        sd.sendKeys("test 123");
        WebElement city= driver.findElement(By.xpath("(//div[@class='field _required'][contains(.,'City')])[2]"));
        city.sendKeys(select);
        city.sendKeys("missouri");
        WebElement state= driver.findElement(By.xpath("(//select[contains(@class,'select')])[4]"));
        Select sel=new Select(state);
        sel.selectByValue("36");
        WebElement zipcode= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[18]"));
        zipcode.sendKeys(select);
        zipcode.sendKeys("455");
        WebElement pnumber= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[19]"));
        pnumber.sendKeys(select);
        pnumber.sendKeys("7899");





    }
    public void Payment_New_address_valid() throws InterruptedException {
        logger.info("Information should dispaly in section in front and that section should display with 'edit' button");
        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");
        Actions ac=new Actions(driver);
        WebElement fname= driver.findElement(By.xpath("(//input[@type='text'])[19]"));

        fname.sendKeys(select);
        fname.sendKeys("Puja");
        WebElement lname= driver.findElement(By.xpath("(//input[contains(@aria-invalid,'false')])[11]"));
        lname.sendKeys(select);
        lname.sendKeys("Domke");
        WebElement company= driver.findElement(By.xpath("(//input[@aria-invalid='false'])[12]"));
        company.sendKeys(select);
        company.sendKeys("upbott");
        WebElement sd= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[14]"));
        sd.sendKeys(select);
        sd.sendKeys("test 123");
        WebElement city= driver.findElement(By.xpath("(//div[@class='field _required'][contains(.,'City')])[2]"));
        city.sendKeys(select);
        city.sendKeys("missouri");
        WebElement state= driver.findElement(By.xpath("(//select[contains(@class,'select')])[4]"));
        Select sel=new Select(state);
        sel.selectByValue("36");
        WebElement zipcode= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[18]"));
        zipcode.sendKeys(select);
        zipcode.sendKeys("63011");
        WebElement pnumber= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[19]"));
        pnumber.sendKeys(select);
        pnumber.sendKeys("9878765676");

        Actions ac1=new Actions(driver);
        WebElement check2= driver.findElement(By.xpath("(//button[contains(.,'Update')])[4]"))      ;

        ac1.moveToElement(check2).click().build().perform();



    }

    public void Continue_shipping() throws InterruptedException {
        Thread.sleep(20000);
        logger.info("It should redirect to homepage");
        WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'Continue Shopping')]"));
        ele.click();

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
}
