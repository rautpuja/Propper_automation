package com.Marvel.page.actions.web.Servicer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class Servicer_Homepage_Page {
    private static final Logger logger = LoggerFactory.getLogger(Servicer_Homepage_Page.class);

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

    @FindBy(how = How.XPATH, using = "//header/div[2]/a[1]/img[1]")
    @CacheLookup
    WebElement HomePage_Logo;

    @FindBy(how = How.XPATH, using = "//a[@id='minicart_container']")
    @CacheLookup
    WebElement Mini_Cart;

    @FindBy(how = How.XPATH, using = "//a[@title='Remove']")
    @CacheLookup
    WebElement Remove_button;

    @FindBy(how = How.XPATH, using = "//body/div[2]/aside[3]/div[2]/footer[1]/button[1]")
    @CacheLookup
    WebElement Cancel_button;

    @FindBy(how = How.XPATH, using = "//body/div[2]/aside[3]/div[2]/footer[1]/button[2]")
    @CacheLookup
    WebElement Ok_Button;

    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Serial Number')]")
    @CacheLookup
    WebElement Searial_Number;

    @FindBy(how = How.XPATH, using="//input[@placeholder='1714862050527']")
    @CacheLookup
    WebElement Serialnumber;

    @FindBy(how = How.XPATH, using="//button[@id='el_search']")
    @CacheLookup
    WebElement search;

    @FindBy(how = How.XPATH, using="//input[@product_id='11189']")
    @CacheLookup
    WebElement addtocart;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Continue Shopping')]")
    @CacheLookup
    WebElement ContinueShopping;

    @FindBy(how = How.XPATH, using="//a[contains(text(),'Submit Labor Claim')]")
    @CacheLookup
    WebElement SubmitLaborClaim;

    @FindBy(how = How.XPATH, using="//a[contains(text(),'My Orders')]")
    @CacheLookup
    WebElement MyOrders;

    @FindBy(how = How.XPATH, using="//a[contains(text(),'My Claims')]")
    @CacheLookup
    WebElement My_Claims;

    @FindBy(how = How.XPATH, using="//a[contains(text(),'My Saved Items')]")
    @CacheLookup
    WebElement My_Saved_Item;

    @FindBy(how = How.XPATH, using="//a[contains(text(),'Training Videos')]")
    @CacheLookup
    WebElement Training_Videos;


    @FindBy(how = How.XPATH, using="//a[contains(text(),'Product Registration')]")
    @CacheLookup
    WebElement Product_Registration;

    @FindBy(how = How.XPATH, using="//a[contains(text(),'My Account')]")
    @CacheLookup
    WebElement My_Account;

    @FindBy(how = How.XPATH, using="//a[contains(text(),'Address Book')]")
    @CacheLookup
    WebElement My_Address_Book;

    @FindBy(how = How.XPATH, using="//a[contains(text(),'Contact Us')]")
    @CacheLookup
    WebElement Contact_Us;
    @FindBy(how = How.XPATH, using="//a[contains(text(),'Log Out')]")
    @CacheLookup
    WebElement Download_Button;

    @FindBy(how = How.XPATH, using="//a[contains(text(),'Log Out')]")
    @CacheLookup
    WebElement Logout_Button;

    public Servicer_Homepage_Page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    public void providerlogin() throws InterruptedException {
        logger.info("After login After login By default parts search should open");
      Thread.sleep(20000);
        WebElement ele = driver.findElement(By.xpath("(//a[contains(.,'Login')])[1]"));
        ele.click();
    }

    public void setemail(String email) {
        txtemail.sendKeys(email);
    }

    public void setPassword(String pwd) {
        txtPassword.sendKeys(pwd);
    }


    public void clickSubmit() {
        btnLogin.click();
        System.out.println("Provider login successfull");
    }


    public void HomePage_Logo() throws InterruptedException {
        Thread.sleep(4000);

        logger.info("It should properly display the Marvel logo  on top left side.");
        logger.info("User should return to the same page");
        WebElement element = driver.findElement(By.xpath("//img[contains(@src,'2.png')]"));

		Actions actions = new Actions(driver);
//		actions.moveToElement(element).click().build().perform();
        if (element.isDisplayed()) {
            System.out.println("Logo is clickable");

        } else {
            System.out.println("Logo is not clickable");
        }}
        public void MiniCart() throws InterruptedException {
            Thread.sleep(10000);

            logger.info("\"•It should display popup of mini cart:\n" +
                    " If product is added in cart it should be display product.\n" +
                    " if not, it should display 'You have no items in your shopping cart' message with (X) button and its by default value is zero\n" +
                    "•It should display right hand side of header section before the 'Sign Out' link\n" +
                    "•It should display popup of mini cart with all the added items\n" +
                    "•If product is added in cart,it should display cart subtotal,product image/name/price/Qty(readonly) with (X) cross(remove) button\n" +
                    "•It should display 'Go To Checkout' and 'View and Edit Cart' \"");
           WebElement mini= driver.findElement(By.xpath("//span[@class='counter-number']"));
           mini.click();
    }
    public void Remove_Button() throws InterruptedException {
        Thread.sleep(10000);

        logger.info("It should give the pop up as \"Are you sure you would like to remove this item from the shopping cart?\" with cancel and ok button.");
        WebElement mini= driver.findElement(By.xpath("//span[@class='counter-number']"));
        mini.click();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        WebElement ele= driver.findElement(By.xpath("//a[contains(@class,'action delete')]"));
        ele.click();
    }
    public void Remove_Button_cancel() throws InterruptedException {
        Thread.sleep(10000);

        logger.info("\"When hover on cancel button it should change the background white to black color\n" +
                "It should remain on the same page\n" +
                "\"");

        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        WebElement ele= driver.findElement(By.xpath("//span[contains(.,'Cancel')]"));
        ele.click();
    }
    public void Remove_Button_ok() throws InterruptedException {
        Thread.sleep(10000);

        logger.info("\"When hover on cancel button it should change the background white to black color\n" +
                "It should remain on the same page\n" +
                "\"");
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        WebElement ele= driver.findElement(By.xpath("//a[contains(@class,'action delete')]"));
        ele.click();
        ArrayList<String> tabs3 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(0));
        Thread.sleep(2000);
        WebElement ele3= driver.findElement(By.xpath("//span[contains(.,'OK')]"));
        ele3.click();
    }
    public void edit_Button() throws InterruptedException {
        Thread.sleep(10000);

        logger.info("It should redirect to parts search page");
//        WebElement mini= driver.findElement(By.xpath("//span[@class='counter-number']"));
//        mini.click();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        WebElement ele= driver.findElement(By.xpath("//a[@class='action edit'][contains(.,'Edit')]"));
        ele.click();
    }
    public void Cross_Button() throws InterruptedException {
        logger.info("It should be close");
        Thread.sleep(10000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
       WebElement ele= driver.findElement(By.xpath("//button[contains(@class,'action close')]"));
       ele.click();
    }

    public void Qty_box() throws InterruptedException {
        Thread.sleep(10000);

        logger.info("It should redirect to parts search page");
        WebElement mini= driver.findElement(By.xpath("//span[@class='counter-number']"));
        mini.click();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement ele= driver.findElement(By.xpath("//input[contains(@type,'number')]"));
         ele.sendKeys(select);
         ele.sendKeys("4");
    }
    public void View_and_edit_() throws InterruptedException {
        logger.info("It should be redirect to shopping cart page");
        Thread.sleep(10000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
       WebElement ele=driver.findElement(By.xpath("(//span[contains(.,'View and edit cart')])[2]"));
       ele.click();
        Thread.sleep(10000);
        driver.navigate().back();
    }
    public void Checkout() throws InterruptedException {
        logger.info("It should be redirect to checkout page");
        Thread.sleep(10000);
        WebElement mini= driver.findElement(By.xpath("//span[@class='counter-number']"));
        mini.click();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        WebElement ele=driver.findElement(By.xpath("(//span[contains(.,'Go to Checkout')])[1]"));
        ele.click();
        Thread.sleep(10000);
        driver.navigate().back();
    }
    public void SignOut() throws InterruptedException {
        logger.info("\"It should be redirect to homepage after 5 seconds and display message\n" +
                "'You are signed out\n" +
                "You have signed out and will go to our homepage in 5 seconds'\"");
        Thread.sleep(10000);
        WebElement mini= driver.findElement(By.xpath("//a[contains(@title,'Logout')]"));
        mini.click();

        WebElement message= driver.findElement(By.xpath("//p[contains(.,'You have signed out and will go to our homepage in 5 seconds.')]"));
        System.out.println("Actual message :" +message.getText());

    }



}
