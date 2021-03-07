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

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.ArrayList;
import java.util.List;

public class Checkout_page {
    private static final Logger logger = LoggerFactory.getLogger(Servicer_Homepage_Page.class);

    private WebDriver driver;


    @FindBy(how = How.XPATH, using="//input[@id='email']")
    @CacheLookup
    WebElement txtemail;



    @FindBy(xpath="//input[@id='pass']")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(name="send")
    @CacheLookup
    WebElement btnLogin;


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



    @FindBy(how = How.XPATH, using="//input[@name='firstname']")
    @CacheLookup
    WebElement Name;




    @FindBy(how = How.XPATH, using="//input[@name='lastname']")
    @CacheLookup
    WebElement Last_Name;





    public Checkout_page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    public void providerlogin() throws InterruptedException {
        logger.info("After login After login By default parts search should open");
        Thread.sleep(20000);
        WebElement ele = driver.findElement(By.xpath("(//a[contains(.,'Login')])[1]"));
        ele.click();
    }

    public void setemail(String email) throws InterruptedException {
        Thread.sleep(5000);
        txtemail.sendKeys(email);
    }

    public void setPassword(String pwd) {
        txtPassword.sendKeys(pwd);
    }


    public void clickSubmit() {
        btnLogin.click();
        System.out.println("Provider login successfull");
    }

    public void Checkout_Page() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should redirect to the Checkout page(Shipping)");
        WebElement ele = driver.findElement(By.xpath("//label[@for='model-number'][contains(.,'Service Model Number')]"));
        ele.click();
        Thread.sleep(10000);
        WebElement ele1 = driver.findElement(By.xpath("//input[contains(@name,'serial')]"));
        String select = Keys.chord(Keys.CONTROL, "a");
        ele1.sendKeys(select);
        ele1.sendKeys("ML24BNS2LB1");
        ele1.sendKeys(Keys.ENTER);
        Thread.sleep(10000);
        WebElement ele3 = driver.findElement(By.xpath("//input[contains(@type,'button')]"));
        ele3.click();
        Thread.sleep(10000);

        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);

        WebElement view = driver.findElement(By.xpath("//span[contains(.,'View Cart')]"));
       view.click();
        Thread.sleep(10000);
        WebElement cancel = driver.findElement(By.xpath("(//span[contains(.,'Go to Checkout')])[2]"));
        cancel.click();
    }

    public void Shiphere_button() throws InterruptedException {
        Thread.sleep(20000);
        logger.info("It should be select after Click on ship here and the product should be shipped to that address");
        WebElement ship = driver.findElement(By.xpath("//span[contains(.,'Ship Here')]"));
         ship.click();
    }

    public void Add_New_address() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("The popup should open with heading shipping address");
        WebElement add_new_address = driver.findElement(By.xpath("//span[contains(.,'New Address')]"));
      add_new_address.click();}

    public void Address_form_with_blank() throws InterruptedException {
logger.info("Error message should display.");
        Thread.sleep(6000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        WebElement shiphere = driver.findElement(By.xpath("//span[contains(.,'Ship here')]"));
        shiphere.click();
    }

    public void Address_form_with_Cancel_Button() throws InterruptedException {
        logger.info("The popup should be closed");

        Thread.sleep(6000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        WebElement cancel = driver.findElement(By.xpath("//span[contains(.,'Cancel')]"));
        cancel.click();
        Thread.sleep(10000);
        WebElement add_new_address = driver.findElement(By.xpath("//span[contains(.,'New Address')]"));
        add_new_address.click();
    }
    public void Address_form_with_Cross_icon() throws InterruptedException {
        logger.info("The popup should be closed");

        Thread.sleep(6000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        WebElement cross = driver.findElement(By.xpath("(//button[@class='action-close'][contains(.,'Close')])[4]"));
       cross.click();
        Thread.sleep(10000);
        WebElement add_new_address = driver.findElement(By.xpath("//span[contains(.,'New Address')]"));
        add_new_address.click();
    }

    public void Address_form_with_InValid() throws InterruptedException, AWTException {
        logger.info("Error message should display.");
        Thread.sleep(9000);
//        Robot robot = new Robot();
//        robot.mouseMove(400,100); // Navigating through mouse hover. Note that the coordinates might differ, kindly check the coordinates of x and y axis and update it accordingly.
//        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//        Thread.sleep(2000);
//        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
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
        WebElement shiphere = driver.findElement(By.xpath("//span[contains(.,'Ship here')]"));
        shiphere.click();
    }

    public void shipping_method() throws InterruptedException {
        logger.info("Shipping Method should be already selected using radio button");
        Thread.sleep(20000);
       WebElement ele= driver.findElement(By.xpath("//input[contains(@aria-labelledby,'label_method_03_ups label_carrier_03_ups')]"));
       ele.click();
    }

    public void Po_Number() throws InterruptedException {
        Thread.sleep(20000);
        logger.info("\"It should redirect to Review & Payments .\n" +
                "Provide PO Number Field should not required\"");
        WebElement Po_Number = driver.findElement(By.xpath("//input[contains(@name,'service_po')]"));
       Po_Number.sendKeys("899777");
       WebElement Next= driver.findElement(By.xpath("//span[contains(.,'Next')]"));
       Next.click();
    }


    public void Order_summery() throws InterruptedException {
        logger.info("\"It should display the correct order sumary with below details: \n" +
                "product image,product name,product price,quantity\"");
        Thread.sleep(10000);
        driver.navigate().refresh();
        Thread.sleep(10000);
        WebElement element = driver.findElement(By.xpath("//div[@class='title']"));
        element.click();
        Thread.sleep(10000);
        WebElement element1 = driver.findElement(By.xpath("//div[contains(@class,'opc-block-summary')]"));
       System.out.println(" Order summery : " +element1.getText());
    }
    public void Payment_radio_button() throws InterruptedException {
        logger.info("\"It should  by default check and able to check and uncheck.\n" +
                "The dropdown should appear when unchecked with 'cancel' & 'update' button.\n" +
                "The 'Place Order' button should be disabled when the checkbox is unchecked\"");
        Thread.sleep(10000);
        WebElement ele= driver.findElement(By.xpath("//input[contains(@name,'payment[method]')]"));
        ele.click();
        Thread.sleep(10000);
        WebElement ele1= driver.findElement(By.xpath("//input[contains(@name,'billing-address-same-as-shipping')]"));
        Actions actions = new Actions(driver);

       ele1.click();
       ele1.click();


    }
    public void Payment_method_option() throws InterruptedException {
        logger.info("The address you added earlier should appear in this dropdown with one extra option New Address. All the options in that dropdown should be selectable ");
        Thread.sleep(10000);
        WebElement ele= driver.findElement(By.xpath("//select[@name='billing_address_id']"));
        Thread.sleep(20000);
        Select s = new Select(ele);

        List<WebElement> op = s.getOptions();
        int size = op.size();
        for(int i =0; i<size ; i++){
            String options = op.get(i).getText();
            System.out.println("Actual Options : "+options);
        }



    }
    public void Payment_New_address() throws InterruptedException {
        logger.info("It should display a form ");
        Thread.sleep(10000);
        WebElement ele= driver.findElement(By.xpath("//select[@name='billing_address_id']"));
    Select sel=new Select(ele);
    sel.selectByVisibleText("New Address");


    }
    public void Payment_New_address_blank() throws InterruptedException {
        logger.info("Error message should display. ");
        Thread.sleep(20000);
        Actions ac=new Actions(driver);
        WebElement ele= driver.findElement(By.xpath("(//span[contains(.,'Update')])[3]"));
       ac.moveToElement(ele).click().build().perform();



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
        WebElement sd= driver.findElement(By.xpath("(//input[contains(@type,'text')])[21]"));
        sd.sendKeys(select);
        sd.sendKeys("test 123");
        WebElement city= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[25]"));
        city.sendKeys(select);
        city.sendKeys("missouri");
        WebElement state= driver.findElement(By.xpath("(//select[contains(@class,'select')])[4]"));
        Select sel=new Select(state);
        sel.selectByValue("36");
        WebElement zipcode= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[27]"));
        zipcode.sendKeys(select);
        zipcode.sendKeys("455");
        WebElement pnumber= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[28]"));
        pnumber.sendKeys(select);
        pnumber.sendKeys("7899");





    }
    public void Payment_New_address_valid() throws InterruptedException {
        logger.info("Information should dispaly in section in front and that section should display with 'edit' button");
        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");
        Actions ac=new Actions(driver);
        WebElement fname= driver.findElement(By.xpath("(//input[@type='text'])[19]"));
        ac.moveToElement(fname).click().build().perform();
        fname.sendKeys(select);
        fname.sendKeys("Puja");
        WebElement lname= driver.findElement(By.xpath("(//input[contains(@aria-invalid,'false')])[11]"));
        lname.sendKeys(select);
        lname.sendKeys("Domke");
        WebElement company= driver.findElement(By.xpath("(//input[@aria-invalid='false'])[12]"));
        company.sendKeys(select);
        company.sendKeys("upbott");
        WebElement sd= driver.findElement(By.xpath("(//input[contains(@type,'text')])[21]"));
        sd.sendKeys(select);
        sd.sendKeys("test 123");
        WebElement city= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[25]"));
        city.sendKeys(select);
        city.sendKeys("missouri");
        WebElement state= driver.findElement(By.xpath("(//select[contains(@class,'select')])[4]"));
        Select sel=new Select(state);
        sel.selectByValue("36");
        WebElement zipcode= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[27]"));
        zipcode.sendKeys(select);
        zipcode.sendKeys("63011");
        WebElement pnumber= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[28]"));
        pnumber.sendKeys(select);
        pnumber.sendKeys("9878765676");





    }
    public void Payment_Checkbox() throws InterruptedException {
        logger.info("\"It should be by default check and able to check and uncheck.\n" +
                "\"");
        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement checkbox= driver.findElement(By.xpath("(//input[contains(@type,'checkbox')])[4]"));
        checkbox.click();

        Actions ac1=new Actions(driver);
        WebElement ele= driver.findElement(By.xpath("(//span[contains(.,'Update')])[3]"));
        ac1.moveToElement(ele).click().build().perform();


    }
    public void Apply_promo_code_blank() throws InterruptedException {
        logger.info("Error mesage should display 'This is required field'");
        Thread.sleep(10000);
        WebElement ele= driver.findElement(By.xpath("//span[@class='action action-toggle'][contains(.,'Apply Discount Code')]"));
        ele.click();

        WebElement ele1= driver.findElement(By.xpath("//input[contains(@name,'discount_code')]"));


        WebElement ele2= driver.findElement(By.xpath("//button[@class='action action-apply'][contains(.,'Apply Discount')]"));
        ele2.click();


    }
    public void Apply_promo_code_invalid() throws InterruptedException {
        logger.info("Error mesage should display  'The coupon code \"coupon_code\" is not valid.'");
        Thread.sleep(10000);


        WebElement ele1= driver.findElement(By.xpath("//input[contains(@name,'discount_code')]"));
        ele1.sendKeys("5666567");


        WebElement ele2= driver.findElement(By.xpath("//button[@class='action action-apply'][contains(.,'Apply Discount')]"));
        ele2.click();


    }
    public void Apply_promo_code_valid() throws InterruptedException {
        logger.info("//select[@name='payment[cc_exp_year]'][contains(@id,'yr')]");
        Thread.sleep(10000);


        WebElement ele1= driver.findElement(By.xpath("//input[contains(@name,'discount_code')]"));
        String select = Keys.chord(Keys.CONTROL, "a");
ele1.sendKeys(select);
ele1.sendKeys("45566");

        WebElement ele2= driver.findElement(By.xpath("//span[contains(.,'Apply Discount')]"));
        ele2.click();


    }
    public void Payment_shipher_icon1() throws InterruptedException {
        logger.info("It should be redirect to shipping address form");
        Thread.sleep(10000);
        WebElement ele= driver.findElement(By.xpath("//button[@data-bind='click: back']"));
        ele.click();
        Thread.sleep(10000);
        WebElement ele2= driver.findElement(By.xpath("//button[@data-role='opc-continue'][contains(.,'Next')]"));
        ele2.click();


    }
    public void Payment_shipher_icon2() throws InterruptedException {
        logger.info("It should be redirect to shipping address form ");
        Thread.sleep(50000);
        WebElement ele= driver.findElement(By.xpath("//button[contains(@data-bind,'click: backToShippingMethod')]"));
        ele.click();
        Thread.sleep(10000);
        WebElement ele2= driver.findElement(By.xpath("//button[@data-role='opc-continue'][contains(.,'Next')]"));
        ele2.click();


    }
    public void Creadit_card_number() throws InterruptedException {
        logger.info("It should be redirect to shipping address form");
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
        WebElement ele= driver.findElement(By.xpath("//span[contains(.,'Place Order')]"));
        ele.click();



    }
}
