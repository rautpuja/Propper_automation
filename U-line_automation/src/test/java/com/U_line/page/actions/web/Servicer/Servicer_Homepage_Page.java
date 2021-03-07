package com.U_line.page.actions.web.Servicer;

import com.U_line.utils.common.Config;
import org.openqa.selenium.By;
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


    public void HomePage_Logo() throws InterruptedException {
        Thread.sleep(4000);

        logger.info("click on Logo");
        WebElement element = driver.findElement(By.xpath("//header/div[2]/a[1]/img[1]"));

		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
        if (HomePage_Logo.isDisplayed()) {
            System.out.println("Logo is clickable");

        } else {
            System.out.println("Logo is not clickable");
        }}
        public void MiniCart() throws InterruptedException {
            Thread.sleep(4000);

            logger.info("click on Mini Cart");
            Mini_Cart.click();
    }
    public void Remove_Button() throws InterruptedException {
        Thread.sleep(4000);

        logger.info("Check whether Remove icon is clickable or not");
        Remove_button.click();
    }
    public void Cancel_Button() throws InterruptedException {
        logger.info("To validate the functionality of mini cart popup for 'Cancel' button");
        Thread.sleep(6000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        Cancel_button.click();
    }

    public void Ok_Button() throws InterruptedException {
        logger.info("To validate the functionality of mini cart popup for 'Ok' button");
        Thread.sleep(6000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        Ok_Button.click();
    }

    public void Part_search_SerialNumber() throws InterruptedException {
        logger.info("Click on Serial Number");
        Thread.sleep(4000);
        Searial_Number.click();
    }


    public void SerialNumber() throws InterruptedException {
        logger.info("Enter Serial Number");
        Thread.sleep(4000);
        Serialnumber.sendKeys("1957171060030");
    }

    public void Search() throws InterruptedException {
        logger.info("Search for serial number");
        Thread.sleep(4000);
        search.click();
    }

    public void SubmitLaborClaim() throws InterruptedException {
        logger.info("Page should redirect to submit labor claim");
        Thread.sleep(4000);
        SubmitLaborClaim.click();
    }
    public void My_Orders() throws InterruptedException {
        logger.info("Page should redirect to My Order Page");
        Thread.sleep(4000);
        MyOrders.click();
    }

    public void My_Claims() throws InterruptedException {
        logger.info("Page should redirect to My Claims Page");
        Thread.sleep(4000);
        My_Claims.click();
    }

    public void My_Saved_Item() throws InterruptedException {
        logger.info("Page should redirect to Wishlist Page");
        Thread.sleep(4000);
        My_Saved_Item.click();
    }

    public void Training_Videos() throws InterruptedException {
        logger.info("Page should redirect to My training videos Page");
        Thread.sleep(4000);
        Training_Videos.click();
    }
    public void Product_Registration() throws InterruptedException {
        logger.info("Page should redirect to My Product Registration Page");
        Thread.sleep(4000);
        Product_Registration.click();
    }

    public void My_Account() throws InterruptedException {
        logger.info("Page should redirect to My Account Page");
        Thread.sleep(4000);
        My_Account.click();
    }

    public void My_Address_Book() throws InterruptedException {
        logger.info("Page should redirect to My Address book Page");
        Thread.sleep(4000);
        My_Address_Book.click();
    }


    public void Contact_Us() throws InterruptedException {
        logger.info("Page should redirect to Contact_US Page");
        Thread.sleep(4000);
        Contact_Us.click();
    }


    public void Logout_Button() throws InterruptedException {
        logger.info("Page should get logout and redirect to sigin page");
        Thread.sleep(4000);
        Logout_Button.click();
    }

    public void addtocart() throws InterruptedException {

        logger.info("Product is added to cart and view cart and continue shopping pop up should get displayed");
        Thread.sleep(5000);
        //WebDriverWait wait2 = new WebDriverWait(driver, 10);
        //wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkmo']")));
        WebElement element = driver.findElement(By.xpath("//input[@product_id='11189']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
        //addtocart.click();


    }


    public void ContinueShopping() throws InterruptedException {
        logger.info(" Click on continue button ");

        Thread.sleep(8000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(4000);
        ContinueShopping.click();


    }

}
