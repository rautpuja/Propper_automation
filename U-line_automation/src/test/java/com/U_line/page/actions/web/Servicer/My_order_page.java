package com.U_line.page.actions.web.Servicer;

import com.U_line.utils.common.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class My_order_page {

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

    @FindBy(how = How.XPATH, using="//a[contains(text(),'My Orders')]")
    @CacheLookup
    WebElement MyOrders;

    @FindBy(how = How.XPATH, using="//tbody/tr[1]/td[8]/a[1]/span[1]")
    @CacheLookup
    WebElement View;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Back to My Orders')]")
    @CacheLookup
    WebElement Back_button;

    public My_order_page(WebDriver driver){
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
    public void My_Orders() throws InterruptedException {
        logger.info("Page should redirect to My Order Page");
        Thread.sleep(4000);
        MyOrders.click();

        Thread.sleep(3000);

    }
    public void View() throws InterruptedException {
        logger.info("Page should redirect to My Order Page");
        Thread.sleep(4000);
        View.click();
}
    public void Back_page() throws InterruptedException {
        logger.info("Page should redirect to My Order Page");
        Thread.sleep(4000);
        Back_button.click();
    }}