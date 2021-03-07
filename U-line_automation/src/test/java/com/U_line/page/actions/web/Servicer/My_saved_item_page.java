package com.U_line.page.actions.web.Servicer;

import com.U_line.utils.common.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class My_saved_item_page {
    private static final Logger logger = LoggerFactory.getLogger(PartSearch_Page.class);
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

    @FindBy(how = How.XPATH, using="//a[contains(text(),'My Saved Items')]")
    @CacheLookup
    WebElement My_Saved_Item;

    @FindBy(how = How.XPATH, using="//body/div[1]/main[1]/div[2]/div[1]/form[1]/div[1]/ol[1]/li[1]/div[1]/div[2]/div[2]/a[1]/span[1]")
    @CacheLookup
    WebElement Edit;

    @FindBy(how = How.XPATH, using="//body/div[1]/main[1]/div[2]/div[1]/form[1]/div[1]/ol[1]/li[1]/div[1]/div[2]/div[2]/a[2]/span[1]")
    @CacheLookup
    WebElement Remove;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Add to Cart')]")
    @CacheLookup
    WebElement AddToCart;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Add All to Cart')]")
    @CacheLookup
    WebElement Add_all_ToCart;

    @FindBy(how = How.XPATH, using="//header/div[2]/a[1]/img[1]")
    @CacheLookup
    WebElement Home_Page;

    public My_saved_item_page(WebDriver driver){
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

    public void My_Saved_Item() throws InterruptedException {
        logger.info("Page should redirect to Wishlist Page");
        Thread.sleep(4000);
        My_Saved_Item.click();
    }

    public void Edit_button() throws InterruptedException {
        logger.info("Page should redirect to Wishlist Page");
        Thread.sleep(4000);
        Edit.click();
    }

    public void Remove() throws InterruptedException {
        logger.info("Page should redirect to Wishlist Page");
        Thread.sleep(4000);
        Remove.click();
    }

    public void AddTocart() throws InterruptedException {
        logger.info("Page should redirect to Wishlist Page");
        Thread.sleep(4000);
        AddToCart.click();
    }

    public void Add_all_Tocart() throws InterruptedException {
        logger.info("Page should redirect to Wishlist Page");
        Thread.sleep(4000);
        Add_all_ToCart.click();
    }
    public void Home_page() throws InterruptedException {
        logger.info("Page should redirect to Wishlist Page");
        Thread.sleep(4000);
        Home_Page.click();
        Thread.sleep(40000);
        My_Saved_Item.click();
    }


}
