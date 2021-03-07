package com.Marvel.page.actions.web.Servicer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class My_order_page {

    private static final Logger logger = LoggerFactory.getLogger(PartSearch_Page.class);

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
    }

    public void My_Orders() throws InterruptedException {
        logger.info("Page should redirect to My Order Page");
        Thread.sleep(10000);
        WebElement ele = driver.findElement(By.xpath("//a[contains(.,'My Orders')]"));
        ele.click();

        Thread.sleep(3000);

    }
    public void show() throws InterruptedException {
        logger.info("By deafult 10 should be selected and results should be according to the slection. It should sort the results as per 10,25,50,100 items selected. It should be present in the top right of my orders table section.");
        Thread.sleep(4000);
        WebElement ele = driver.findElement(By.xpath("//select[contains(@name,'my-claims-table_length')]"));
      Select sel=new Select(ele);
      sel.selectByValue("50");

        Thread.sleep(3000);

    }
    public void Search_text_box() throws InterruptedException {
        logger.info("The search text box should be present in the top left of my orders table section with the watermark/placeholder fields \"Search by Keyword\"");
        Thread.sleep(4000);
        WebElement ele = driver.findElement(By.xpath("//input[contains(@type,'search')]"));
       ele.sendKeys("");

    }
    public void Search_text_box_blank_data() throws InterruptedException {
        logger.info("The 'search by keyword' should not work");
        Thread.sleep(4000);
        WebElement ele = driver.findElement(By.xpath("//input[contains(@type,'search')]"));
        ele.sendKeys("");
        ele.sendKeys(Keys.ENTER);

    }
    public void Search_text_box_invalid_data() throws InterruptedException {
        logger.info("It should display message as \"No matching records found\"");
        Thread.sleep(4000);
        WebElement ele = driver.findElement(By.xpath("//input[contains(@type,'search')]"));
        ele.sendKeys("34545");
        ele.sendKeys(Keys.ENTER);

    }
    public void Search_text_box_valid_data() throws InterruptedException {
        logger.info("Search Result page should display with correct result and should be able to search by  Order, PO Number,Web Order,Order Date,Ship to,Status,Tracking Number,Notes");
        Thread.sleep(4000);
        WebElement ele = driver.findElement(By.xpath("//input[contains(@type,'search')]"));
        ele.sendKeys("399189SH");
        ele.sendKeys(Keys.ENTER);

    }
    public void Myorder_table() throws InterruptedException {
        logger.info("The My Orders table should have 8 columns ie Order, PO Number,Web Order,Order Date,Ship to,Status,Tracking Number,Notes");
        Thread.sleep(10000);
        WebElement ele = driver.findElement(By.xpath("//div[contains(@class,'column main')]"));
       System.out.println("Table is "+ele.getText());

    }
    public void Ascending_descending_order() throws InterruptedException {
        logger.info("The My Orders table should have 8 columns ie Order, PO Number,Web Order,Order Date,Ship to,Status,Tracking Number,Notes");
        Thread.sleep(10000);
        WebElement ele = driver.findElement(By.xpath("//th[@scope='col'][contains(.,'PO Number #')]"));
       ele.click();

    }
    public void Pagination_order_previos() throws InterruptedException {
        logger.info("It should go back ");
        Thread.sleep(10000);
        WebElement ele = driver.findElement(By.xpath("//div[@class='dataTables_paginate paging_simple_numbers']"));
       System.out.println(""+ele.getText());
       ele.isDisplayed();

    }
    public void Pagination_order_next() throws InterruptedException {
        logger.info("It should go to ahead ");
        Thread.sleep(10000);
        WebElement ele = driver.findElement(By.xpath("//div[@class='dataTables_paginate paging_simple_numbers']"));
        System.out.println(""+ele.getText());
        ele.isDisplayed();

    }
    }