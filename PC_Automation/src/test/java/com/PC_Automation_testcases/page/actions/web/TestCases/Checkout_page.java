package com.PC_Automation_testcases.page.actions.web.TestCases;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Checkout_page {

    private static final Logger logger = LoggerFactory.getLogger(Checkout_page.class);

    private WebDriver driver;



    @FindBy(how = How.XPATH, using = "//input[@name='firstname']")
    @CacheLookup
    WebElement Name;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Next')]")
    @CacheLookup
    WebElement Next;


    @FindBy(how = How.XPATH, using = "//input[@value='purchaseorder']")
    @CacheLookup
    WebElement MoneyOrder;

    @FindBy(how = How.XPATH, using = "//input[@title='Purchase Order Number']")
    @CacheLookup
    WebElement PurcheseOrderNumber;





    @FindBy(how = How.XPATH, using = "//span[contains(text(),'View Cart')]")
    @CacheLookup
    WebElement viewcart;

    @FindBy(how = How.XPATH, using = "//input[@name='telephone']")
    @CacheLookup
    WebElement phonenumber;



    public Checkout_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void Subscribe() throws InterruptedException {
        logger.info("click on subscribe button");
      //  Thread.sleep(50000);
        //driver.switchTo().alert().dismiss();
        WebDriverWait wait = new WebDriverWait(driver,90);

        WebElement	ele=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='mageplaza-betterpopup-block']/div[@id='bio_ep']/div[1]/div[1]/img[1]")));
        ele.click();
        Thread.sleep(10000);
        WebElement ele4= driver.findElement(By.xpath("//button[@class='btn-cookie btn-cookie-accept']"));
        ele4.click();


    }




    public void login() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("login as a customer");
        WebElement ele = driver.findElement(By.xpath("//a[@class='link login']"));
        ele.click();
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement txtemail = driver.findElement(By.xpath("//input[@id='email']"));

        txtemail.sendKeys("sam@upbott.com");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@name='login[password]']"));
        txtPassword.sendKeys(select);
        txtPassword.sendKeys("sushil@8055");
        WebElement btnLogin = driver.findElement(By.xpath("//button[@class='action login primary']"));
        btnLogin.click();
        Thread.sleep(7000);
    }
    public void addtocart() throws InterruptedException {

        logger.info("Product image should display clear and distinct\n");
        Thread.sleep(20000);
        Actions actions = new Actions(driver);
        WebElement Menu = driver.findElement(By.xpath("//span[contains(text(),'Labels & Wristbands')]"));
        WebElement subMenu = driver.findElement(By.xpath("(//a[contains(.,'Alert Solutions')])[2]"));
        actions.moveToElement(Menu).build().perform();
        System.out.println("hover on labels and wristband");
        Thread.sleep(10000);
        actions.moveToElement(subMenu).click().build().perform();
        System.out.println("Click on alert solutions");
        System.out.println(driver.getTitle());
        Thread.sleep(10000);

        WebElement ele = driver.findElement(By.xpath("//img[contains(@id,'product-image-3152')]"));
        actions.doubleClick(ele).perform();


        Thread.sleep(10000);
            WebElement ele1= driver.findElement(By.xpath("//button[contains(.,'Add to Cart')]"));
            ele1.click();
        Thread.sleep(10000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        WebElement view_cart= driver.findElement(By.xpath("//span[contains(.,'View Cart')]"));
        view_cart.click();








    }



    public void view_cart() throws InterruptedException {
        Thread.sleep(5000);
        logger.info("add product into cart");
        //WebDriverWait wait2 = new WebDriverWait(driver, 10);
        //wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkmo']")));
        WebElement element = driver.findElement(By.xpath("//span[@class='counter-number']"));
        element.click();


    }


    public void New_address_() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("New address detail form should get displayed with cancel and update button");
        WebElement ele = driver.findElement(By.xpath("//input[@value='purchaseorder']"));
        ele.click();
        Thread.sleep(5000);
        Actions actions = new Actions(driver);
        WebElement checkbox = driver.findElement(By.xpath("//input[@id='billing-address-same-as-shipping-purchaseorder']"));
        checkbox.click();
        Thread.sleep(5000);
        checkbox.click();
        Thread.sleep(5000);

        WebElement ele3 = driver.findElement(By.xpath("(//select[contains(@class,'select')])[3]"));
       // ele3.click();
        Select sel= new Select(ele3);
        sel.selectByVisibleText("New Address");

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
        WebElement element = driver.findElement(By.xpath("//span[contains(.,'Proceed to Checkout')]"));
        Actions actions = new Actions(driver);
        //actions.moveToElement(element).click().build().perform();
        element.click();


    }


    public void phonenumber() throws InterruptedException {
        Thread.sleep(4000);
        phonenumber.sendKeys("63011");

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
        logger.info("It should be redirect to part & accessories page\n");
        WebElement element5 = driver.findElement(By.xpath("//span[contains(text(),'Cancel')]"));
        element5.click();
        Thread.sleep(8000);
        WebElement element4 = driver.findElement(By.xpath("//textarea[@class='input-text order-comment order-comment-input']"));
        element4.sendKeys("");
        Thread.sleep(8000);
        WebElement ele= driver.findElement(By.xpath("//span[contains(text(),'Place Order')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(ele).click().build().perform();

    }



    public void Continue_shipping() throws InterruptedException {
        Thread.sleep(8000);
        logger.info("Error message should display.\n");
        WebElement Next= driver.findElement(By.xpath("//main[contains(@class,'page-main')]"));
System.out.println("text is    :"+Next.getText());
        WebElement Next1= driver.findElement(By.xpath("//a[@class='action primary continue'][contains(.,'Continue Shopping')]"));

        Next1.click();

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
    public void Next_button() throws InterruptedException {
        Thread.sleep(30000);
        logger.info("It should show error message");

        WebElement check = driver.findElement(By.xpath("(//button[contains(@type,'submit')])[2]"));
        check.click();





    }

    public void Next_button_withshopping() throws InterruptedException {
        Thread.sleep(30000);
        logger.info("It should show error message");


        WebElement check1 = driver.findElement(By.xpath("(//input[contains(@type,'radio')])[1]"));
        check1.click();
        Thread.sleep(30000);

        WebElement check = driver.findElement(By.xpath("(//button[contains(@type,'submit')])[2]"));
        check.click();



    }
    public void Special_shipping_instruction() throws InterruptedException {
        Thread.sleep(30000);
        logger.info("It should display a textbox with watermark 'E.g. Specific name or attention, no docks available, lift gate required' with label below textbox 'Please list any special shipping instructions required for this order'");

        WebElement check = driver.findElement(By.xpath("//input[@type='text'][contains(@id,'instruction')][contains(.,'Special Shipping Instructions')]"));
        check.sendKeys("test");





    }
    public void New_address_From_Payment_valid_data() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Address should get added");
        Thread.sleep(8000);
//        WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'New Address')]"));
//        ele.click();

        String select = Keys.chord(Keys.CONTROL, "a");



        WebElement First_Name=driver.findElement(By.xpath("(//input[@type='text'])[9]"));

        First_Name.sendKeys(select);
        First_Name.sendKeys("upbott");

        WebElement Street_address=driver.findElement(By.xpath("//input[@name='street[0]']"));
        Street_address.sendKeys(select);
        Street_address.sendKeys("test345");

        WebElement City_Update=driver.findElement(By.xpath("//input[@name='city']"));
        City_Update.sendKeys(select);
        City_Update.sendKeys("missouri");
        WebElement State_provience=driver.findElement(By.xpath("//select[@name='region_id']"));
        State_provience.click();
        Select sel = new Select(State_provience);
        sel.selectByValue("36");
//        emailbox.sendKeys(select);
//        emailbox.sendKeys("puja@upbott.con");
        WebElement Postal_code=driver.findElement(By.xpath("//input[@name='postcode']"));
        Postal_code.sendKeys(select);
        Postal_code.sendKeys("63011");
        WebElement P_number=driver.findElement(By.xpath("//input[@name='telephone']"));
        P_number.sendKeys("9876545678");
        Thread.sleep(10000);
        WebElement  drop = driver.findElement(By.xpath("//button[@class='action primary action-save-address']"));
        drop.click();
    }
    public void New_address_From_Payment_Invalid_data() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Error message should get displayed");
        Thread.sleep(8000);


        String select = Keys.chord(Keys.CONTROL, "a");



        WebElement First_Name=driver.findElement(By.xpath("(//input[@type='text'])[9]"));

        First_Name.sendKeys(select);
        First_Name.sendKeys("43534");

        WebElement Street_address=driver.findElement(By.xpath("//input[@name='street[0]']"));
        Street_address.sendKeys(select);
        Street_address.sendKeys("test345");

        WebElement City_Update=driver.findElement(By.xpath("//input[@name='city']"));
        City_Update.sendKeys(select);
        City_Update.sendKeys("missouri");
        WebElement State_provience=driver.findElement(By.xpath("//select[@name='region_id']"));
        State_provience.click();
        Select sel = new Select(State_provience);
        sel.selectByValue("36");
//        emailbox.sendKeys(select);
//        emailbox.sendKeys("puja@upbott.con");
        WebElement Postal_code=driver.findElement(By.xpath("//input[@name='postcode']"));
        Postal_code.sendKeys(select);
        Postal_code.sendKeys("frff");
        WebElement P_number=driver.findElement(By.xpath("//input[@name='telephone']"));
        P_number.sendKeys("98787678");
        Thread.sleep(10000);
//        WebElement  drop = driver.findElement(By.xpath("//span[contains(text(),'Ship here')]"));
//        drop.click();
    }

    public void Ship_here() throws InterruptedException {
        Thread.sleep(20000);
        logger.info("It should redirect to homepage");
        WebElement ele=driver.findElement(By.xpath("(//span[contains(.,'Ship Here')])[2]"));
        ele.click();

    }

    public void Order_summery() throws InterruptedException {
        Thread.sleep(20000);
        logger.info("\"It should display the correct order sumary with below details: \n" +
                "product image,product name,product price,quantity\"");
        WebElement ele=driver.findElement(By.xpath("//div[@class='title']"));
        ele.click();

    }
    public void Payment_option() throws InterruptedException {
        Thread.sleep(20000);
        logger.info("It should be Clickable(radio button)");
        WebElement ele=driver.findElement(By.xpath("//input[@id='purchaseorder']"));
        ele.click();

    }
    public void invoice_option() throws InterruptedException {
        Thread.sleep(20000);
        logger.info("It should redirect to Order Success Page");
        WebElement ele=driver.findElement(By.xpath("//input[@type='text'][contains(@id,'number')]"));
        ele.sendKeys("test");
        WebElement ele1=driver.findElement(By.xpath("(//textarea[contains(@class,'input-text order-comment order-comment-input')])[1]"));
        ele1.sendKeys("test");}
    public void place_order_() throws InterruptedException {
        Thread.sleep(20000);
        WebElement ele2=driver.findElement(By.xpath("(//span[contains(.,'Place Order')])[1]"));
        ele2.click();

    }
    public void purchase_option() throws InterruptedException {
        Thread.sleep(20000);
        logger.info("It should accept maximum 20words");
        WebElement ele=driver.findElement(By.xpath("//input[@type='text'][contains(@id,'number')]"));
        ele.sendKeys("test7655677777777777777777777777777777777777777777777777");
        WebElement ele1=driver.findElement(By.xpath("(//textarea[contains(@class,'input-text order-comment order-comment-input')])[1]"));
        ele1.sendKeys("test");
        //  WebElement ele2=driver.findElement(By.xpath("(//span[contains(.,'Place Order')])[1]"));
        //   ele2.click();

    }

    public void Shipping_method() throws InterruptedException {
        Thread.sleep(20000);
        logger.info("\"It should display the correct order sumary with below details: \n" +
                "product image,product name,product price,quantity\"");
        WebElement ele=driver.findElement(By.xpath("(//div[contains(@data-bind,'blockLoader: isLoading')])[2]"));
       ele.getText();

    }
    public void Creadit_cart() throws InterruptedException {
        Thread.sleep(20000);
        logger.info("It should redirect to Order Success Page");
        WebElement ele=driver.findElement(By.xpath("//input[@type='radio'][contains(@id,'authorizecim')]"));
        ele.click();
        WebElement ele1=driver.findElement(By.xpath("//select[@class='input-text'][contains(@id,'id')]"));
       Select sel=new Select(ele1);
       sel.selectByValue("new");
        WebElement ele2=driver.findElement(By.xpath("(//input[@type='text'][contains(@id,'number')])[2]"));
        ele2.sendKeys("4111111111111111");
        WebElement ele3=driver.findElement(By.xpath("//select[@id='md_authorizecim_expiration']"));
        Select sel1=new Select(ele3);
        sel1.selectByValue("12");
        WebElement ele4=driver.findElement(By.xpath("//select[@name='payment[cc_exp_year]'][contains(@id,'yr')]"));
        Select sel2=new Select(ele4);
        sel2.selectByValue("2029");
        WebElement ele5=driver.findElement(By.xpath("(//input[contains(@autocomplete,'off')])[3]"));
        ele5.sendKeys("345");
//        WebElement ele6=driver.findElement(By.xpath("(//span[contains(.,'Place Order')])[2]"));
//        ele6.click();
    }

    public void Checkout() throws InterruptedException {
        Thread.sleep(10000);
        logger.info(" It should redirect to the Checkout page.\n ");
        WebElement element = driver.findElement(By.xpath("//span[contains(.,'Proceed to Checkout')]"));
        Actions actions = new Actions(driver);
        //actions.moveToElement(element).click().build().perform();
        element.click();


    }
    public void Apply_promo_code_blank() throws InterruptedException {
        Thread.sleep(10000);
        logger.info(" Error message should get displayed ");
        WebElement element = driver.findElement(By.xpath("//span[@class='action action-toggle'][contains(.,'Apply Discount Code')]"));
        Actions actions = new Actions(driver);
        //actions.moveToElement(element).click().build().perform();
        element.click();
        WebElement element1 = driver.findElement(By.xpath("(//span[contains(.,'Apply Discount')])[4]"));
        element1.click();


    }
    public void Apply_promo_code_invalid() throws InterruptedException {
        Thread.sleep(10000);
        logger.info(" Error message should get displayed");
        WebElement element = driver.findElement(By.xpath("//input[contains(@name,'discount_code')]"));
        Actions actions = new Actions(driver);
        //actions.moveToElement(element).click().build().perform();
        element.sendKeys("test");
        WebElement element1 = driver.findElement(By.xpath("(//span[contains(.,'Apply Discount')])[4]"));
        element1.click();


    }
    public void Apply_promo_code_valid() throws InterruptedException {
        Thread.sleep(10000);
        logger.info(" It should get added to the cart and the amount should get visible in order summary and display the correct calculated amount as per applied");
        WebElement element = driver.findElement(By.xpath("//input[contains(@name,'discount_code')]"));
        Actions actions = new Actions(driver);
        //actions.moveToElement(element).click().build().perform();
        element.sendKeys("PC123");
        WebElement element1 = driver.findElement(By.xpath("(//span[contains(.,'Apply Discount')])[4]"));
        element1.click();


    }
    public void Ship_here1() throws InterruptedException {
        Thread.sleep(10000);
        logger.info(" It should get added to the cart and the amount should get visible in order summary and display the correct calculated amount as per applied");
        WebElement element = driver.findElement(By.xpath("(//button[@class='action action-edit'][contains(.,'edit')])[1]"));

        element.click();
        Thread.sleep(10000);
        WebElement element1 = driver.findElement(By.xpath("(//button[contains(@type,'submit')])[2]"));

        element1.click();


    }
    public void Ship_here2() throws InterruptedException {
        Thread.sleep(30000);
        logger.info(" It should be redirect to shipping address secion");
        WebElement element = driver.findElement(By.xpath("(//button[@class='action action-edit'][contains(.,'edit')])[2]"));

        element.click();
        Thread.sleep(10000);
        WebElement element1 = driver.findElement(By.xpath("//span[contains(.,'Next')]"));

        element1.click();


    }
    public void New_address() throws InterruptedException {
        Thread.sleep(50000);
        logger.info(" \"It should be redirect to shopping cart page\n" +
                "\"\n ");
       WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'New Address')]"));
       ele.click();

    }
    public void New_address_blank_data() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Error message should get displayed ");
        WebElement ele=driver.findElement(By.xpath("//button[@class='action primary action-save-address']"));
        ele.click();

    }
    public void New_address__valid_data() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Address should get added");
        Thread.sleep(8000);
//        WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'New Address')]"));
//        ele.click();

        String select = Keys.chord(Keys.CONTROL, "a");



        WebElement First_Name=driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[13]"));

        First_Name.sendKeys(select);
        First_Name.sendKeys("Puja");
        WebElement Last_Name=driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[14]"));

        Last_Name.sendKeys(select);
        Last_Name.sendKeys("Domke");
        WebElement Company=driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[15]"));

       Company.sendKeys(select);
        Company.sendKeys("Upbott");
        WebElement Street_address=driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[16]"));
        Street_address.sendKeys(select);
        Street_address.sendKeys("test345");

        WebElement City_Update=driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[20]"));
        City_Update.sendKeys(select);
        City_Update.sendKeys("missouri");
        WebElement State_provience=driver.findElement(By.xpath("(//select[contains(@class,'select')])[5]"));
        State_provience.click();
        Select sel = new Select(State_provience);
        sel.selectByValue("36");
//        emailbox.sendKeys(select);
//        emailbox.sendKeys("puja@upbott.con");
        WebElement Postal_code=driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[21]"));
        Postal_code.sendKeys(select);
        Postal_code.sendKeys("63011");
        WebElement P_number=driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[22]"));
        P_number.sendKeys("9876545678");
        Thread.sleep(10000);
        WebElement  drop = driver.findElement(By.xpath("(//span[contains(.,'Update')])[1]"));
        drop.click();
    }
    public void New_address_invalid_data() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Error message should get displayed");
        Thread.sleep(8000);
//        WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'New Address')]"));
//        ele.click();

        String select = Keys.chord(Keys.CONTROL, "a");



        WebElement First_Name=driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[13]"));

        First_Name.sendKeys(select);
        First_Name.sendKeys("443");
        WebElement Last_Name=driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[14]"));

        Last_Name.sendKeys(select);
        Last_Name.sendKeys("Domke");
        WebElement Company=driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[15]"));

        Company.sendKeys(select);
        Company.sendKeys("Upbott");
        WebElement Street_address=driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[16]"));
        Street_address.sendKeys(select);
        Street_address.sendKeys("test345");

        WebElement City_Update=driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[20]"));
        City_Update.sendKeys(select);
        City_Update.sendKeys("missouri");
        WebElement State_provience=driver.findElement(By.xpath("(//select[contains(@class,'select')])[5]"));
        State_provience.click();
        Select sel = new Select(State_provience);
        sel.selectByValue("36");
//        emailbox.sendKeys(select);
//        emailbox.sendKeys("puja@upbott.con");
        WebElement Postal_code=driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[21]"));
        Postal_code.sendKeys(select);
        Postal_code.sendKeys("434");
        WebElement P_number=driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[22]"));
        P_number.sendKeys("54545");
        Thread.sleep(10000);
//        WebElement  drop = driver.findElement(By.xpath("(//span[contains(.,'Update')])[1]"));
//        drop.click();
    }
    public void New_address__blank_data() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Error message should get displayed");
        Thread.sleep(10000);
        WebElement  drop = driver.findElement(By.xpath("(//span[contains(.,'Update')])[1]"));
        drop.click();
}}