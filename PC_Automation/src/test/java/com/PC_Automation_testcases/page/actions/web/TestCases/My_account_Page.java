package com.PC_Automation_testcases.page.actions.web.TestCases;

//import com.PC_Automation.page.actions.web.Servicer.Product_Registration_page;
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

public class My_account_Page {

    private static final Logger logger = LoggerFactory.getLogger(My_account_Page.class);

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

    @FindBy(how = How.XPATH, using="//a[contains(text(),'My Account')]")
    @CacheLookup
    WebElement My_Account;

    @FindBy(how = How.XPATH, using="//body/div[1]/main[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/a[1]")
    @CacheLookup
    WebElement Edit;


    @FindBy(how = How.XPATH, using="//input[@id='change-email']")
    @CacheLookup
    WebElement Email_Id_checkbox;


    @FindBy(how = How.XPATH, using="//input[@id='current-password']")
    @CacheLookup
    WebElement Current_password;


    @FindBy(how = How.XPATH, using="//input[@id='firstname']")
    @CacheLookup
    WebElement First_Name;


    @FindBy(how = How.XPATH, using="//input[@id='lastname']")
    @CacheLookup
    WebElement Last_Name;

    @FindBy(how = How.XPATH, using="//input[@id='firstname']")
    @CacheLookup
    WebElement First_Name2;


    @FindBy(how = How.XPATH, using="//input[@id='lastname']")
    @CacheLookup
    WebElement Last_Name2;

    @FindBy(how = How.XPATH, using="//input[@id='change-password']")
    @CacheLookup
    WebElement Change_Password;

    @FindBy(how = How.XPATH, using="//input[@id='password']")
    @CacheLookup
    WebElement New_password;

    @FindBy(how = How.XPATH, using="//input[@id='password-confirmation']")
    @CacheLookup
    WebElement Confirm_New_password;

    @FindBy(how = How.XPATH, using="//input[@id='change-password']")
    @CacheLookup
    WebElement Change_password2;
    @FindBy(how = How.XPATH, using="//input[@id='email']")
    @CacheLookup
    WebElement Email;
    @FindBy(how = How.XPATH, using="//a[contains(text(),'Change Password')]")
    @CacheLookup
    WebElement Change_Password_link;
    @FindBy(how = How.XPATH, using="//body/div[1]/main[1]/div[2]/div[1]/form[1]/div[1]/div[1]/button[1]/span[1]")
    @CacheLookup
    WebElement Save_button;
    @FindBy(how = How.XPATH, using="//body/div[1]/main[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/a[1]/span[1]")
    @CacheLookup
    WebElement edit2;

    @FindBy(how = How.XPATH, using="//body/div[1]/main[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/a[1]/span[1]")
    @CacheLookup
    WebElement edit4;

    @FindBy(how = How.XPATH, using="//body/div[1]/main[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/a[1]/span[1]")
    @CacheLookup
    WebElement edit3;
    public My_account_Page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }
    public void Subscribe() throws InterruptedException {
        logger.info("click on subscribe button");

        //driver.switchTo().alert().dismiss();
        WebDriverWait wait = new WebDriverWait(driver,90);

        WebElement	ele=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='mageplaza-betterpopup-block']/div[@id='bio_ep']/div[1]/div[1]/img[1]")));
        ele.click();
        Thread.sleep(10000);
        WebElement ele4= driver.findElement(By.xpath("//button[@class='btn-cookie btn-cookie-accept']"));
        ele4.click();

    }


    public void Customerlogin(String email,String pwd) throws InterruptedException {
        logger.info("By default 'My Account'section should be visible, Content should be clear and distinct.");

        Thread.sleep(50000);
        WebElement button= driver.findElement(By.xpath("//a[@class='link login']"));
        button.click();



        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement txtemail= driver.findElement(By.xpath("//input[@id='email']"));

        txtemail.sendKeys(email);

        WebElement txtPassword= driver.findElement(By.xpath("//input[@name='login[password]']"));

        txtPassword.sendKeys(pwd);
        WebElement btnLogin= driver.findElement(By.xpath("//button[@class='action login primary']"));
        btnLogin.click();
    }


//    public void My_Account() throws InterruptedException {
//        logger.info("Page should redirect to My Account Page");
//        Thread.sleep(10000);
//        WebElement btnLogin= driver.findElement(By.xpath("(//span[contains(.,'Login')])[2]"));
//        btnLogin.click();
//    }

    public void Edit() throws InterruptedException {
        logger.info("To verify Contact Information section from My Account");
        Thread.sleep(40000);
        Actions ac=new Actions(driver);
        WebElement btnLogin= driver.findElement(By.xpath("(//span[contains(.,'Edit')])[3]"));
        ac.moveToElement(btnLogin).click().build().perform();
    }
    public void view_all() throws InterruptedException {
        logger.info("It should redirect to 'My Orders' tab");
        Thread.sleep(40000);
        driver.navigate().to("https://www.platinumcode.us/customer/account/");
        Actions ac=new Actions(driver);
        Thread.sleep(40000);
        WebElement btnLogin= driver.findElement(By.xpath("//span[contains(.,'View All')]"));
        ac.moveToElement(btnLogin).click().build().perform();
        Thread.sleep(40000);
        driver.navigate().back();
    }
    public void Manage_address() throws InterruptedException {
        logger.info("It should redirect to 'Address Book' tab");
        Thread.sleep(10000);
        WebElement btnLogin= driver.findElement(By.xpath("(//div[contains(@class,'block-title')])[5]"));
        btnLogin.click();
    }
    public void Default_billing_address_invalid() throws InterruptedException {
        logger.info("Error message should get displayed");
        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement btnLogin= driver.findElement(By.xpath("(//span[contains(.,'Edit Address')])[1]"));
        btnLogin.click();
        Thread.sleep(10000);
        WebElement name= driver.findElement(By.xpath("//input[contains(@name,'firstname')]"));
        name.sendKeys(select);
        name.sendKeys("343434");
        WebElement last_name= driver.findElement(By.xpath("//input[contains(@name,'postcode')]"));
        last_name.sendKeys(select);
        last_name.sendKeys("8788");
//        WebElement save= driver.findElement(By.xpath("(//span[contains(.,'Save Address')])[1]"));
//        save.click();


    }
    public void Default_billing_address_valid() throws InterruptedException {
        logger.info("Error message should get displayed");
        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");
//        WebElement btnLogin= driver.findElement(By.xpath("(//span[contains(.,'Edit Address')])[1]"));
//        btnLogin.click();
        Thread.sleep(10000);
        WebElement name= driver.findElement(By.xpath("//input[contains(@name,'firstname')]"));
        name.sendKeys(select);
        name.sendKeys("sushil");
        WebElement namel= driver.findElement(By.xpath("//input[contains(@name,'lastname')]"));
        namel.sendKeys(select);
        namel.sendKeys("zore");
        WebElement last_name= driver.findElement(By.xpath("//input[contains(@name,'postcode')]"));
        last_name.sendKeys(select);
        last_name.sendKeys("63011");
        WebElement save= driver.findElement(By.xpath("(//span[contains(.,'Save Address')])[1]"));
        save.click();

        Thread.sleep(10000);

    }
    public void Default_shipping_address_invalid() throws InterruptedException {
        logger.info("Page should redirect to My Account Page");
        Thread.sleep(20000);

        String select = Keys.chord(Keys.CONTROL, "a");
       driver.navigate().to("https://www.platinumcode.us/customer/account/");
        Thread.sleep(10000);
        WebElement btnLogin= driver.findElement(By.xpath("(//span[contains(.,'Edit Address')])[2]"));
        btnLogin.click();
        Thread.sleep(10000);
        WebElement name= driver.findElement(By.xpath("//input[contains(@name,'firstname')]"));
        name.sendKeys(select);
        name.sendKeys("8788");
        WebElement last_name= driver.findElement(By.xpath("//input[contains(@name,'postcode')]"));
        last_name.sendKeys(select);
        last_name.sendKeys("67878");
//        WebElement save= driver.findElement(By.xpath("(//span[contains(.,'Save Address')])[1]"));
//        save.click();
    }
    public void Default_shipping_address_valid() throws InterruptedException {
        logger.info("Page should redirect to My Account Page");
        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");
//        WebElement btnLogin= driver.findElement(By.xpath("((//span[contains(.,'Edit Address')])[2]"));
//        btnLogin.click();
        Thread.sleep(10000);
        WebElement name= driver.findElement(By.xpath("//input[contains(@name,'firstname')]"));
        name.sendKeys(select);
        name.sendKeys("sushil");
        WebElement last_name= driver.findElement(By.xpath("//input[contains(@name,'postcode')]"));
        last_name.sendKeys(select);
        last_name.sendKeys("63011");
        WebElement save= driver.findElement(By.xpath("(//span[contains(.,'Save Address')])[1]"));
        save.click();
    }
    public void Email_id_checkbox() throws InterruptedException {
        logger.info("Page should redirect to My Account Page");
        Thread.sleep(10000);
        Email_Id_checkbox.click();
    }
    public void Recent_orders_view_all() throws InterruptedException {
        logger.info("Page should redirect to My Account Page");
        Thread.sleep(10000);
        WebElement ele= driver.findElement(By.xpath("//span[contains(.,'View All')]"));
        ele.click();
        Thread.sleep(10000);
        driver.navigate().back();
    }
    public void sales_information_section() throws InterruptedException {
        logger.info("\"It should display\n" +
                " Sales Person Information\n" +
                "Name : Erick Krasnoff\n" +
                "Email : erick.krasnoff@platinumcode.us\n" +
                "Phone Number : 952-890-7100 Ext. 213\"");
        driver.navigate().to("https://www.platinumcode.us/customer/account/");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement account= driver.findElement(By.xpath("(//strong[contains(.,'My Account')])[2]"));
      ac.moveToElement(account).click().build().perform();
        Thread.sleep(10000);
        WebElement ele= driver.findElement(By.xpath("//div[contains(@class,'box box-information box2')]"));
        System.out.println(" sales: "+ele.getText());
    }
    public void Recorder() throws InterruptedException {
        logger.info("It should redirect to 'My Account' tab");
        Thread.sleep(10000);
        WebElement ele= driver.findElement(By.xpath("(//span[contains(.,'Reorder')])[2]"));
        ele.click();
        Thread.sleep(10000);
        driver.navigate().back();
    }
    public void view_order() throws InterruptedException {
        logger.info("It should redirect to 'My Order' tab");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement ele= driver.findElement(By.xpath("(//span[contains(.,'View Order')])[1]"));
       ac.moveToElement(ele).click().build().perform();
        Thread.sleep(10000);
        driver.navigate().back();
    }
    public void Sales_person() throws InterruptedException {
        logger.info("It should redirect to 'My Order' tab");
        Thread.sleep(10000);
        WebElement ele= driver.findElement(By.xpath("//div[@class='box box-information box2']"));
        System.out.println(ele.getText());
    }
    public void Change_email_id_invalid() throws InterruptedException {
        logger.info("Invalid email should not accept");
        // Thread.sleep(4000);
        Thread.sleep(10000);
        WebElement btnLogin= driver.findElement(By.xpath("(//span[contains(.,'Edit')])[3]"));
        btnLogin.click();
        Thread.sleep(10000);
        WebElement Email_Id_checkbox= driver.findElement(By.xpath("//input[contains(@name,'change_email')]"));
        Email_Id_checkbox.click();
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement Email= driver.findElement(By.xpath("(//input[contains(@type,'email')])[1]"));
        Email.sendKeys(select);
        Email.sendKeys("puja2upbott.com");
        WebElement Current_password= driver.findElement(By.xpath("//input[contains(@name,'current_password')]"));

        Current_password.sendKeys("Dev@123!@#");
        WebElement save= driver.findElement(By.xpath("//span[contains(.,'Save')]"));
        save.click();

    }
    public void Change_password_invalid() throws InterruptedException {
        logger.info("Invalid email should not accept");
        Thread.sleep(4000);
        Thread.sleep(10000);
        WebElement btnLogin= driver.findElement(By.xpath("(//span[contains(.,'Edit')])[5]"));
        btnLogin.click();
        WebElement Email_Id_checkbox= driver.findElement(By.xpath("//input[contains(@name,'change_password')]"));
        Email_Id_checkbox.click();
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement Email= driver.findElement(By.xpath("(//input[contains(@type,'email')])[1]"));
        Email.sendKeys(select);
        Email.sendKeys("puja@upbott.com");
        WebElement Current_password= driver.findElement(By.xpath("//input[contains(@name,'current_password')]"));

        Current_password.sendKeys("Dev@123!@#");
        WebElement New_password= driver.findElement(By.xpath("//input[contains(@name,'current_password')]"));
        New_password.sendKeys(select);
        New_password.sendKeys("test");
        WebElement Confirm_password= driver.findElement(By.xpath("//input[contains(@name,'current_password')]"));

    }
    public void Change_password_valid() throws InterruptedException {
        logger.info("Invalid email should not accept");
        Thread.sleep(4000);
        Thread.sleep(10000);
        WebElement btnLogin= driver.findElement(By.xpath("(//span[contains(.,'Edit')])[5]"));
        btnLogin.click();
        WebElement Email_Id_checkbox= driver.findElement(By.xpath("//input[contains(@name,'change_password')]"));
        Email_Id_checkbox.click();
        String select = Keys.chord(Keys.CONTROL, "a");

        Email.sendKeys(select);
        Email.sendKeys("puja2upbott.com");
        WebElement Current_password= driver.findElement(By.xpath("//input[contains(@name,'current_password')]"));

        Current_password.sendKeys("Dev@123!@#");
        WebElement New_password= driver.findElement(By.xpath("//input[contains(@name,'current_password')]"));
        New_password.sendKeys(select);
        New_password.sendKeys("test");
        WebElement Confirm_password= driver.findElement(By.xpath("//input[contains(@name,'current_password')]"));

    }
    public void Change_email_id_valid() throws InterruptedException {
        logger.info("Invalid email should not accept");

        Thread.sleep(10000);

        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement Email= driver.findElement(By.xpath("(//input[contains(@type,'email')])[1]"));
        Email.sendKeys(select);
        Email.sendKeys("sam@upbott.com");
        WebElement Current_password= driver.findElement(By.xpath("//input[contains(@name,'current_password')]"));
        Current_password.sendKeys(select);
        Current_password.sendKeys("sushil@8055");
        WebElement save= driver.findElement(By.xpath("//span[contains(.,'Save')]"));
        save.click();

    }
    public void Change_First_name() throws InterruptedException {
        logger.info("You saved the account information.' message should display and redirect to the Account information also edited information should dispaly");


        Thread.sleep(10000);
        WebElement btnLogin= driver.findElement(By.xpath("(//span[contains(.,'Edit')])[3]"));
        btnLogin.click();
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement First_Name2= driver.findElement(By.xpath("//input[contains(@name,'firstname')]"));
        First_Name2.sendKeys(select);
        First_Name2.sendKeys("sushil");
        WebElement Last_Name2= driver.findElement(By.xpath("//input[contains(@name,'lastname')]"));
        Last_Name2.sendKeys(select);
        Last_Name2.sendKeys("zore");
        WebElement save= driver.findElement(By.xpath("//span[contains(.,'Save')]"));
        save.click();

    }

    public void Mandatory_fields_blank() throws InterruptedException {
        logger.info("Error mesage should display");
        Thread.sleep(10000);

        String select = Keys.chord(Keys.CONTROL, "a");

        WebElement First_Name2= driver.findElement(By.xpath("//input[contains(@name,'firstname')]"));
        First_Name2.sendKeys(select);
        First_Name2.sendKeys("");
        WebElement Last_Name2= driver.findElement(By.xpath("//input[contains(@name,'lastname')]"));
        Last_Name2.sendKeys(select);
        Last_Name2.sendKeys("");
        WebElement save= driver.findElement(By.xpath("//span[contains(.,'Save')]"));
        save.click();


    }

    public void Change_password() throws InterruptedException {
        logger.info("Application should reset the password and successful message should get display \"Your saved the account information\" message should display");
        Thread.sleep(10000);

        String select = Keys.chord(Keys.CONTROL, "a");
        Thread.sleep(10000);
        WebElement my_account= driver.findElement(By.xpath("(//strong[contains(.,'My Account')])[2]"));
        my_account.click();
        WebElement btnLogin= driver.findElement(By.xpath("(//span[contains(.,'Edit')])[5]"));
        btnLogin.click();

        WebElement First_Name2= driver.findElement(By.xpath("//input[contains(@name,'change_password')]"));
        First_Name2.click();

        WebElement Last_Name2= driver.findElement(By.xpath("(//input[contains(@type,'password')])[2]"));
        Last_Name2.sendKeys(select);
        Last_Name2.sendKeys("Dev@123");
        WebElement Last_Name3= driver.findElement(By.xpath("//input[contains(@name,'password_confirmation')]"));
        Last_Name3.sendKeys(select);
        Last_Name3.sendKeys("Dev@123");
        Save_button.click();

    }

    public void Change_password_Link(String email, String pwd) throws InterruptedException {
        logger.info("1. On edit my account page, the change password checkbox  should checked by default, Error message should be displayed(\"Please enter the same value again.\")");
        Thread.sleep(50000);
//        WebElement ele= driver.findElement(By.xpath("(//strong[contains(.,'My Account')])[2]"));
//        ele.click();

        WebElement ele2= driver.findElement(By.xpath("//a[contains(@class,'action change-password')]"));
        ele2.click();
        Thread.sleep(10000);
        WebElement save= driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Save')]"));
        save.click();

    }
    public void Change_password_Link_invalid() throws InterruptedException {
        logger.info("invalid password should not get accept");
        Thread.sleep(50000);
        String select = Keys.chord(Keys.CONTROL, "a");

        WebElement  Current_password= driver.findElement(By.xpath("//input[contains(@name,'current_password')]"));
        Current_password.sendKeys(select);
        Current_password.sendKeys("343sam@8055");
        WebElement  New_password= driver.findElement(By.xpath("//input[contains(@data-password-min-length,'8')]"));
        New_password.sendKeys(select);
        New_password.sendKeys("sam@8055");
        WebElement Confirm_New_password= driver.findElement(By.xpath("//input[contains(@name,'password_confirmation')]"));
        Confirm_New_password.sendKeys(select);
        Confirm_New_password.sendKeys("4334sam@8055");


    }
    public void Change_password_Link_valid(String email, String pwd) throws InterruptedException {
        logger.info("Password should get change");
        Thread.sleep(50000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement  checkbox= driver.findElement(By.xpath("//input[contains(@name,'change_password')]"));
        checkbox.click();
        WebElement  Current_password= driver.findElement(By.xpath("//input[contains(@name,'current_password')]"));
        Current_password.sendKeys(select);
        Current_password.sendKeys("sam@8055");
        WebElement  New_password= driver.findElement(By.xpath("//input[contains(@data-password-min-length,'8')]"));
        New_password.sendKeys(select);
        New_password.sendKeys("sam@8055");
        WebElement Confirm_New_password= driver.findElement(By.xpath("//input[contains(@name,'password_confirmation')]"));
        Confirm_New_password.sendKeys(select);
        Confirm_New_password.sendKeys("sam@8055");
        WebElement save= driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Save')]"));
        save.click();
//        Thread.sleep(50000);
//
//        WebElement txtemail= driver.findElement(By.xpath("//input[@id='email']"));
//
//        txtemail.sendKeys(email);
//
//        WebElement txtPassword= driver.findElement(By.xpath("//input[@name='login[password]']"));
//
//        txtPassword.sendKeys(pwd);
//        WebElement btnLogin= driver.findElement(By.xpath("//button[@class='action login primary']"));
//        btnLogin.click();

    }

    public void Change_name() throws InterruptedException {
        logger.info("It should redirect to respective products page");
        Thread.sleep(90000);
        Thread.sleep(10000);
        WebElement btnLogin= driver.findElement(By.xpath("(//span[contains(.,'Edit')])[5]"));
        btnLogin.click();
        WebElement ele=driver.findElement(By.xpath("(//a[contains(.,'My Products')])[3]"));
        ele.click();

    }

    public void My_product() throws InterruptedException {
        logger.info("It should redirect to respective products page");
        Thread.sleep(90000);
        WebElement ele=driver.findElement(By.xpath("(//a[contains(.,'My Products')])[3]"));
        ele.click();

    }
    public void Add_to_cart() throws InterruptedException {
        logger.info("It should add product in the cart and popup should be visible");
        Thread.sleep(90000);
        WebElement ele=driver.findElement(By.xpath("(//button[@class='action tocart primary'][contains(.,'Add to Cart')])[1]"));
        ele.click();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        WebElement ele2=driver.findElement(By.xpath("//span[contains(.,'View Cart')]"));
        ele2.click();
        Thread.sleep(20000);
        driver.navigate().back();

    }
    public void My_orders() throws InterruptedException {
        logger.info("It should add product in the cart and popup should be visible");
        Thread.sleep(90000);
        WebElement ele=driver.findElement(By.xpath("//a[contains(.,'My Orders')]"));
        ele.click();

    }
    public void view_orders() throws InterruptedException {
        logger.info("It should display 'View Order' link ");
        Thread.sleep(90000);
        WebElement ele=driver.findElement(By.xpath("(//span[contains(.,'View Order')])[1]"));
        ele.click();

    }
    public void Recorders() throws InterruptedException {
        logger.info("It should redirect to 'My Account' tab");
        Thread.sleep(90000);
        Actions ac=new Actions(driver);
        WebElement ele=driver.findElement(By.xpath("(//span[contains(.,'Reorder')])[1]"));
        ac.moveToElement(ele).click().build().perform();
        Thread.sleep(90000);
        driver.navigate().back();

    }
    public void Show() throws InterruptedException {
        logger.info("It should have by default 10 selected with options 10,20,50.When option is selected it should show respective orders on per page.It should be visible on top and bottom of products listing.");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement ele=driver.findElement(By.xpath("//select[@class='limiter-options']"));
        ac.moveToElement(ele).click().build().perform();
        Select sel=new Select(ele);
        sel.selectByVisibleText("20");

    }
    public void pagination() throws InterruptedException {
        logger.info("");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement ele=driver.findElement(By.xpath("//a[@title='Next']"));
        ac.moveToElement(ele).click().build().perform();

    }
    public void My_wishlist() throws InterruptedException {
        logger.info("It should display Title with products listing and on below three buttons 'Update wish list,Share Wishlist and Add all to cart.");
        Thread.sleep(90000);
        WebElement ele=driver.findElement(By.xpath("(//a[contains(.,'My Wish List')])[3]"));
        ele.click();

    }
    public void Show_wishlist() throws InterruptedException {
        logger.info("It should have by default 10 selected with options 10,20,50.When option is selected it should show respective orders on per page.It should be visible on top and bottom of products listing.");
        Thread.sleep(90000);
        WebElement ele=driver.findElement(By.xpath("(//select[@id='limiter'])[1]"));
        Select sel=new Select(ele);
        sel.selectByValue("https://www.platinumcode.us/wishlist/?limit=20");

    }
    public void pagination_1() throws InterruptedException {
        logger.info("It should have by default 10 selected with options 10,20,50.When option is selected it should show respective orders on per page.It should be visible on top and bottom of products listing.");
        Thread.sleep(90000);
        WebElement ele=driver.findElement(By.xpath("(//a[@title='Next'])[1]"));
        ele.click();

    }
    public void product_name_link() throws InterruptedException {
        logger.info("It should have by default 10 selected with options 10,20,50.When option is selected it should show respective orders on per page.It should be visible on top and bottom of products listing.");
        Thread.sleep(90000);
        WebElement ele=driver.findElement(By.xpath("(//a[contains(@class,'product-item-link')])[1]"));
        ele.click();
        Thread.sleep(90000);
        driver.navigate().back();

    }
    public void Add_to_cart_1() throws InterruptedException {
        logger.info("It should have by default 10 selected with options 10,20,50.When option is selected it should show respective orders on per page.It should be visible on top and bottom of products listing.");
        Thread.sleep(90000);
        WebElement ele=driver.findElement(By.xpath("(//span[contains(.,'Add to Cart')])[1]"));
        ele.click();
        Thread.sleep(90000);
        WebElement ele2=driver.findElement(By.xpath("//div[contains(@data-bind,'parent.prepareMessageForHtml(message.text)')]"));
        System.out.println("Message is: "+ele2.getText());
//        driver.navigate().back();

    }
    public void Remove_wishlist() throws InterruptedException {
        logger.info("It should remove product from My wish list");
        Thread.sleep(90000);
        WebElement ele=driver.findElement(By.xpath("(//span[contains(.,'Remove')])[7]"));
        ele.click();
        Thread.sleep(90000);
//        driver.navigate().back();
        WebElement ele2=driver.findElement(By.xpath("//div[contains(@data-bind,'parent.prepareMessageForHtml(message.text)')]"));
        System.out.println("Message is : "+ele2.getText());

    }
    public void Address_book() throws InterruptedException {
        logger.info("It should display information clear ");
        Thread.sleep(90000);
        WebElement ele=driver.findElement(By.xpath("//a[contains(.,'Address Book')]"));
        ele.click();
//        Thread.sleep(90000);
//        driver.navigate().back();

    }
    public void Change_billing_address() throws InterruptedException {
        logger.info("It should redirect to Edit Address section of Address Book tab  ");
        Thread.sleep(10000);
        WebElement ele=driver.findElement(By.xpath("//span[contains(.,'Change Billing Address')]"));
        ele.click();
//        Thread.sleep(90000);
//        driver.navigate().back();

    }
    public void Save_billing_address() throws InterruptedException {
        logger.info("It should redirect to Edit Address section of Address Book tab  ");
        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement ele=driver.findElement(By.xpath("//input[contains(@name,'firstname')]"));
        ele.sendKeys(select);
        ele.sendKeys("puja");
//        Thread.sleep(90000);
//        driver.navigate().back();
        WebElement ele3=driver.findElement(By.xpath("(//span[contains(.,'Save Address')])[1]"));
        ele3.click();

    }
    public void shipping_address() throws InterruptedException {
        logger.info("It should redirect to Edit Address section of Address Book tab  ");
        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement ele=driver.findElement(By.xpath("//span[contains(.,'Change Shipping Address')]"));
        ele.click();
//

    }
    public void Save_shipping_address() throws InterruptedException {
        logger.info("It should redirect to Edit Address section of Address Book tab  ");
        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement ele=driver.findElement(By.xpath("//input[contains(@name,'firstname')]"));
        ele.sendKeys(select);
        ele.sendKeys("puja");
//        Thread.sleep(90000);
//        driver.navigate().back();
        WebElement ele3=driver.findElement(By.xpath("(//span[contains(.,'Save Address')])[1]"));
        ele3.click();

    }
    public void Edit_address() throws InterruptedException {
        logger.info("It should redirect to Edit Address section of Address Book tab  ");
        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");
//


        WebElement slider = driver.findElement(By.xpath("//div[contains(@class,'table-wrapper additional-addresses')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", slider);
        System.out.println("Slider moved");
        WebElement ele=driver.findElement(By.xpath("(//span[contains(.,'Edit')])[4]"));
        ele.click();


    }
    public void Edit_address_checkbox() throws InterruptedException {
        logger.info("It should redirect to Edit Address section of Address Book tab  ");
        Thread.sleep(10000);


        WebElement ele3=driver.findElement(By.xpath("//input[@type='checkbox'][contains(@id,'billing')]"));
        ele3.click();
        WebElement ele4=driver.findElement(By.xpath("(//span[contains(.,'Save Address')])[1]"));
        ele4.click();

    }
    public void Delete_address() throws InterruptedException {
        logger.info("It should redirect to Edit Address section of Address Book tab  ");
        Thread.sleep(10000);

        WebElement slider = driver.findElement(By.xpath("//div[contains(@class,'table-wrapper additional-addresses')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", slider);
        System.out.println("Slider moved");
        Thread.sleep(2000);
        WebElement ele=driver.findElement(By.xpath("(//span[contains(.,'Delete')])[1]"));
        ele.click();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        Thread.sleep(10000);
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
//        WebElement ele3=driver.findElement(By.xpath("(//button[contains(@type,'button')])[12]"));
//        ele3.click();
        WebElement ele3=driver.findElement(By.xpath("(//span[contains(.,'Cancel')])[2]"));
     ele3.click();

    }
    public void show_address_book() throws InterruptedException {
        logger.info("It should redirect to Edit Address section of Address Book tab  ");
        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement ele=driver.findElement(By.xpath("//select[@id='limiter']"));
        Select sel=new Select(ele);
        sel.selectByVisibleText("20");


    }
    public void add_new_address() throws InterruptedException {
        logger.info("It should redirect to Edit Address section of Address Book tab  ");
        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement ele=driver.findElement(By.xpath("//span[contains(.,'Add New Address')]"));
        ele.click();


    }
    public void add_new_address_blank() throws InterruptedException {
        logger.info("It should redirect to Edit Address section of Address Book tab  ");
        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement ele=driver.findElement(By.xpath("//span[contains(.,'Add New Address')]"));
        ele.click();

    }
    public void add_new_address_invalid() throws InterruptedException {
        logger.info("It should redirect to Edit Address section of Address Book tab  ");
        Thread.sleep(10000);

        WebElement ele=driver.findElement(By.xpath("//span[contains(.,'Add New Address')]"));
        ele.click();
        Thread.sleep(10000);
        String select1 = Keys.chord(Keys.CONTROL, "a");

        WebElement name=driver.findElement(By.xpath("//input[contains(@name,'firstname')]"));
        name.sendKeys(select1);
        name.sendKeys("puja");
        WebElement Last_name=driver.findElement(By.xpath("//input[contains(@name,'lastname')]"));
        Last_name.sendKeys(select1);
        Last_name.sendKeys("domke");
        WebElement Company=driver.findElement(By.xpath("//input[contains(@name,'company')]"));
        Company.sendKeys(select1);
        Company.sendKeys("upbott");
        WebElement P_number=driver.findElement(By.xpath("//input[contains(@name,'telephone')]"));
        P_number.sendKeys(select1);
        P_number.sendKeys("9876787656");
        WebElement street_address=driver.findElement(By.xpath("//input[@type='text'][contains(@id,'1')]"));
        street_address.sendKeys(select1);
        street_address.sendKeys("Test 123");
        WebElement city=driver.findElement(By.xpath("//input[contains(@name,'city')]"));
        city.sendKeys(select1);
        city.sendKeys("missouri");
        WebElement zip_code=driver.findElement(By.xpath("//input[contains(@name,'postcode')]"));
        zip_code.sendKeys(select1);
        zip_code.sendKeys("6567");
        WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox'][contains(@id,'billing')]"));
        checkbox.click();
        WebElement save=driver.findElement(By.xpath("(//span[contains(.,'Save Address')])[1]"));
        save.click();
//        WebElement ele=driver.findElement(By.xpath("//span[contains(.,'Add New Address')]"));

    }
    public void add_new_address_valid() throws InterruptedException {
        logger.info("It should redirect to Edit Address section of Address Book tab  ");
        Thread.sleep(10000);

        WebElement ele=driver.findElement(By.xpath("//span[contains(.,'Add New Address')]"));
        ele.click();

        Thread.sleep(10000);
        String select1 = Keys.chord(Keys.CONTROL, "a");

        WebElement name=driver.findElement(By.xpath("//input[contains(@name,'firstname')]"));
        name.sendKeys(select1);
        name.sendKeys("8667");
        WebElement Last_name=driver.findElement(By.xpath("//input[contains(@name,'lastname')]"));
        Last_name.sendKeys(select1);
        Last_name.sendKeys("86776");
        WebElement Company=driver.findElement(By.xpath("//input[contains(@name,'company')]"));
        Company.sendKeys(select1);
        Company.sendKeys("upbott");
        WebElement P_number=driver.findElement(By.xpath("//input[contains(@name,'telephone')]"));
        P_number.sendKeys(select1);
        P_number.sendKeys("8767");
        WebElement street_address=driver.findElement(By.xpath("//input[@type='text'][contains(@id,'1')]"));
        street_address.sendKeys(select1);
        street_address.sendKeys("Test 123");
        WebElement city=driver.findElement(By.xpath("//input[contains(@name,'city')]"));
        city.sendKeys(select1);
        city.sendKeys("missouri");
        WebElement zip_code=driver.findElement(By.xpath("//input[contains(@name,'postcode')]"));
        zip_code.sendKeys(select1);
        zip_code.sendKeys("6567");
        WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox'][contains(@id,'billing')]"));
        checkbox.click();
        WebElement save=driver.findElement(By.xpath("(//span[contains(.,'Save Address')])[1]"));
        save.click();

    }
    public void Email_subscribe() throws InterruptedException {
        logger.info("It should display Title,subtitle,unchecked box with 'I would like to receive more information from PlatinumCode, including the latest updates on products, offers, and industry trends!' and save button");
        Thread.sleep(10000);
        // String select = Keys.chord(Keys.CONTROL, "a");
        WebElement ele=driver.findElement(By.xpath("//a[contains(.,'Email Subscriptions')]"));
        ele.click();


    }
    public void Email_subscribe_checkbox() throws InterruptedException {
        logger.info("It should redirect to My Account tab with 'We have saved your subscription.'message ");
        Thread.sleep(10000);
        // String select = Keys.chord(Keys.CONTROL, "a");
        WebElement ele=driver.findElement(By.xpath("//input[contains(@name,'is_subscribed')]"));
        ele.click();
        WebElement ele1=driver.findElement(By.xpath("//span[contains(.,'Save')]"));
        ele1.click();

    }
    public void Email_subscribe_Uncheckbox() throws InterruptedException {
        logger.info("It should redirect to My Account tab with 'We have removed your newsletter subscription.'message");
        Thread.sleep(10000);
        Actions actions=new Actions(driver);
        // String select = Keys.chord(Keys.CONTROL, "a");
        WebElement ele=driver.findElement(By.xpath("//input[contains(@name,'is_subscribed')]"));
        actions.doubleClick(ele).perform();
        WebElement ele1=driver.findElement(By.xpath("//span[contains(.,'Save')]"));
        ele1.click();

        Thread.sleep(10000);
        WebElement ele3=driver.findElement(By.xpath("//a[contains(.,'Email Subscriptions')]"));
        ele3.click();
    }
    public void My_saved_cart() throws InterruptedException {
        logger.info("It should display title with grid and button");
        Thread.sleep(10000);
        // String select = Keys.chord(Keys.CONTROL, "a");
        WebElement ele=driver.findElement(By.xpath("//a[contains(.,'My Saved Cards')]"));
        ele.click();
        Thread.sleep(10000);
        WebElement ele1=driver.findElement(By.xpath("//span[@class='base'][contains(.,'Customer Saved Cards')]"));
        System.out.println("Title is "+ele1.getText());

    }
    public void My_saved_cart_section() throws InterruptedException {
        logger.info("It should display title with grid and button");
        Thread.sleep(10000);
        // String select = Keys.chord(Keys.CONTROL, "a");
        WebElement ele=driver.findElement(By.xpath("//span[contains(@data-ui-id,'page-title-wrapper')]"));
        System.out.println("Title is "+ele.getText());
        Thread.sleep(10000);
        WebElement ele1=driver.findElement(By.xpath("//td[@data-th='Card #'][contains(.,'XXXX-1111')]"));
        System.out.println("Title is "+ele1.getText());

    }
    public void My_saved_cart_new() throws InterruptedException {
        logger.info("It should redirect to Add New Card");
        Thread.sleep(10000);
        // String select = Keys.chord(Keys.CONTROL, "a");
        WebElement ele=driver.findElement(By.xpath("//span[contains(.,'Add New Card')]"));
        ele.click();
        Thread.sleep(10000);
        WebElement ele1=driver.findElement(By.xpath("//span[@class='base'][contains(.,'Add New Card')]"));
        System.out.println("Title=.."+ele1.getText());

    }
    public void Go_back() throws InterruptedException {
        logger.info("It should redirect to Add New Card");
        Thread.sleep(10000);
        // String select = Keys.chord(Keys.CONTROL, "a");
        WebElement ele=driver.findElement(By.xpath("//span[contains(.,'Add New Card')]"));
        ele.click();
        Thread.sleep(10000);
        // String select = Keys.chord(Keys.CONTROL, "a");
        WebElement ele1=driver.findElement(By.xpath("//span[contains(.,'Go back')]"));
        ele1.click();


    }
    public void Save_card_blank() throws InterruptedException {
        logger.info("It should redirect to Add New Card");
        Thread.sleep(10000);
        WebElement ele=driver.findElement(By.xpath("//span[contains(.,'Add New Card')]"));
        ele.click();
        Thread.sleep(10000);
        WebElement ele1=driver.findElement(By.xpath("//span[contains(.,'Save Card')]"));
        ele1.click();


    }
    public void Save_card_invalid() throws InterruptedException {
        logger.info("It should redirect to Add New Card");
        Thread.sleep(10000);
//        WebElement ele=driver.findElement(By.xpath("//span[contains(.,'Add New Card')]"));
//        ele.click();
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement ele1=driver.findElement(By.xpath("//input[@type='text'][contains(@id,'firstname')]"));
        ele1.sendKeys(select);
        ele1.sendKeys("657");
        WebElement ele2=driver.findElement(By.xpath("//input[@type='text'][contains(@id,'lastname')]"));
        ele2.sendKeys(select);
        ele2.sendKeys("6788");

        WebElement ele3=driver.findElement(By.xpath("//input[contains(@id,'md_authorizecim_company')]"));
        ele3.sendKeys(select);
        ele3.sendKeys("upbott");
        WebElement ele4=driver.findElement(By.xpath("//input[@type='text'][contains(@id,'street')]"));
        ele4.sendKeys(select);
        ele4.sendKeys("test");
        WebElement ele5=driver.findElement(By.xpath("//input[@type='text'][contains(@id,'city')]"));
        ele5.sendKeys(select);
        ele5.sendKeys("missouri");
        WebElement ele6=driver.findElement(By.xpath("//select[contains(@id,'id')][@name='md_authorizecim[address_info][region_id]']"));
        Select sel=new Select(ele6);
        sel.selectByValue("36");

        WebElement ele7=driver.findElement(By.xpath("//input[@type='text'][contains(@id,'postcode')]"));
        ele7.sendKeys(select);
        ele7.sendKeys("test");

        WebElement ele8=driver.findElement(By.xpath("//input[contains(@id,'md_authorizecim_phone')]"));
        ele8.sendKeys(select);
        ele8.sendKeys("4556");
        WebElement Creadit_cart=driver.findElement(By.xpath("//select[contains(@id,'type')][@name='md_authorizecim[payment_info][cc_type]']"));
        Select sel1=new Select(Creadit_cart);
        sel1.selectByValue("MC");
        WebElement Creadit_cart_number=driver.findElement(By.xpath("//input[contains(@id,'md_authorizecim_cc_number')]"));
        Creadit_cart_number.sendKeys("4111111111111111");
        WebElement Month=driver.findElement(By.xpath("//select[contains(@id,'expiration')][@name='md_authorizecim[payment_info][cc_exp_month]']"));
        Select moth=new Select(Month);
        moth.selectByValue("4");
        WebElement Year=driver.findElement(By.xpath("//select[contains(@id,'yr')][@name='md_authorizecim[payment_info][cc_exp_year]']"));
        Select Year1=new Select(Year);
        Year1.selectByValue("2024");
        WebElement Cart_ver=driver.findElement(By.xpath("//input[contains(@id,'md_authorizecim_cc_cid')]"));
        Cart_ver.sendKeys("345");
        Thread.sleep(10000);
        WebElement save=driver.findElement(By.xpath("//button[contains(@id,'btn')][@type='button'][contains(.,'Save Card')]"));
        save.click();


    }
    public void Save_card_valid() throws InterruptedException {
        logger.info("It should redirect to Add New Card");
        Thread.sleep(10000);
//        WebElement ele=driver.findElement(By.xpath("//span[contains(.,'Add New Card')]"));
//        ele.click();
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement ele1=driver.findElement(By.xpath("//input[@type='text'][contains(@id,'firstname')]"));
        ele1.sendKeys(select);
        ele1.sendKeys("puja");
        WebElement ele2=driver.findElement(By.xpath("//input[@type='text'][contains(@id,'lastname')]"));
        ele2.sendKeys(select);
        ele2.sendKeys("domke");

        WebElement ele3=driver.findElement(By.xpath("//input[contains(@id,'md_authorizecim_company')]"));
        ele3.sendKeys(select);
        ele3.sendKeys("upbott");
        WebElement ele4=driver.findElement(By.xpath("//input[@type='text'][contains(@id,'street')]"));
        ele4.sendKeys(select);
        ele4.sendKeys("test123");
        WebElement ele5=driver.findElement(By.xpath("//input[@type='text'][contains(@id,'city')]"));
        ele5.sendKeys(select);
        ele5.sendKeys("missouri");
        WebElement ele6=driver.findElement(By.xpath("//select[contains(@id,'id')][@name='md_authorizecim[address_info][region_id]']"));
        Select sel=new Select(ele6);
        sel.selectByValue("36");

        WebElement ele7=driver.findElement(By.xpath("//input[@type='text'][contains(@id,'postcode')]"));
        ele7.sendKeys(select);
        ele7.sendKeys("63011");

        WebElement ele8=driver.findElement(By.xpath("//input[contains(@id,'md_authorizecim_phone')]"));
        ele8.sendKeys(select);
        ele8.sendKeys("8767876545");
        WebElement Creadit_cart=driver.findElement(By.xpath("//select[contains(@id,'type')][@name='md_authorizecim[payment_info][cc_type]']"));
        Select sel1=new Select(Creadit_cart);
        sel1.selectByValue("VI");
        WebElement Creadit_cart_number=driver.findElement(By.xpath("//input[contains(@id,'md_authorizecim_cc_number')]"));
        Creadit_cart_number.sendKeys(select);
        Creadit_cart_number.sendKeys("4111111111111111");
        WebElement Month=driver.findElement(By.xpath("//select[contains(@id,'expiration')][@name='md_authorizecim[payment_info][cc_exp_month]']"));
        Select moth=new Select(Month);
        moth.selectByValue("4");
        WebElement Year=driver.findElement(By.xpath("//select[contains(@id,'yr')][@name='md_authorizecim[payment_info][cc_exp_year]']"));
        Select Year1=new Select(Year);
        Year1.selectByValue("2024");
        WebElement Cart_ver=driver.findElement(By.xpath("//input[contains(@id,'md_authorizecim_cc_cid')]"));
        Cart_ver.sendKeys(select);
        Cart_ver.sendKeys("345");
        Thread.sleep(10000);
        WebElement save=driver.findElement(By.xpath("//button[contains(@id,'btn')][@type='button'][contains(.,'Save Card')]"));
        save.click();


    }
    public void Edit_cart() throws InterruptedException {
        logger.info("It should redirect to Edit Card ");
        Thread.sleep(10000);
        WebElement ele=driver.findElement(By.xpath("(//span[contains(.,'Edit')])[4]"));
        ele.click();
        Thread.sleep(10000);
        WebElement ele1=driver.findElement(By.xpath("//span[contains(.,'Save Card')]"));
        ele1.click();


    }
    public void Delete_cart() throws InterruptedException {
        logger.info("It should Delete respective cards data ");
        Thread.sleep(10000);
        WebElement ele=driver.findElement(By.xpath("(//span[contains(.,'Delete')])[2]"));
        ele.click();
        Thread.sleep(10000);
        System.out.println("Message"+ driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();

    }
}
