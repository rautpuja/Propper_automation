package com.Marvel.page.actions.web.Retailer;


import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class PDP_Page {
    private static final Logger logger = LoggerFactory.getLogger(PDP_Page.class);

    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//div[@id='option-label-color-93-item-100']")
    @CacheLookup
    WebElement Finish1;

    @FindBy(how = How.XPATH, using = "//div[@id='option-label-color-93-item-66']")
    @CacheLookup
    WebElement Finish2;

    @FindBy(how = How.XPATH, using = "//div[@id='option-label-color-93-item-168']")
    @CacheLookup
    WebElement Finish3;

    @FindBy(how = How.XPATH, using = "//body/div[1]/main[1]/div[2]/div[1]/div[2]/div[4]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/select[1]")
    @CacheLookup
    WebElement Door_swing;

    @FindBy(how = How.XPATH, using = "//body/div[1]/main[1]/div[2]/div[1]/div[2]/div[4]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/select[1]")
    @CacheLookup
    WebElement Lock;


    @FindBy(how = How.XPATH, using = "//a[@title='Find a Dealer']")
    @CacheLookup
    WebElement Find_dealer;


    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Description')]")
    @CacheLookup
    WebElement Discription;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Key Features')]")
    @CacheLookup
    WebElement Key_feature;
    @FindBy(how = How.XPATH, using = "//a[@id='tab-label-product.attributes.details-title']")
    @CacheLookup
    WebElement details;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Model summary')]")
    @CacheLookup
    WebElement Model_summary;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Downloads')]")
    @CacheLookup
    WebElement Downloads;

    @FindBy(how = How.XPATH, using = "//a[@id='tab-label-accessoriestab-title']")
    @CacheLookup
    WebElement Accesories;

    @FindBy(how = How.XPATH, using = "//body/div[1]/main[1]/div[2]/div[1]/div[4]/div[1]/div[12]/div[1]/div[1]/ol[1]/li[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/button[1]")
    @CacheLookup
    WebElement Add_to_cart;

    public PDP_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void PDP_page() throws InterruptedException {
        logger.info("Product image should display clear and distinct\n");
        Thread.sleep(20000);
        Actions actions = new Actions(driver);
        WebElement Menu = driver.findElement(By.xpath("//a[.='Products' and not(@title)]"));

        WebElement subMenu = driver.findElement(By.xpath("//a[.='Beverage Centers' and not(@title)]"));
       actions.moveToElement(Menu).moveToElement(subMenu).click().build().perform();
        Thread.sleep(10000);
        WebElement ele = driver.findElement(By.xpath("//a[@title='24-in Built-in Dual Zone Wine and Beverage Center']"));
        ele.click();

        //System.out.println(driver.getTitle());

    }

    public void Door_style() throws InterruptedException {
        logger.info("It should be open and display correct options in the dropdown\n");
        Thread.sleep(10000);

        WebElement ele = driver.findElement(By.xpath("//select[@class='swatch-select color_finish']"));
        ele.click();
        Select sel = new Select(ele);
        sel.selectByValue("988");

    }

    public void Door_swing_drop_down() throws InterruptedException {
        logger.info("It should be open and display correct options in the dropdown\n");
        Thread.sleep(10000);
        WebElement Door_swing = driver.findElement(By.xpath("//select[@class='swatch-select door_swing']"));
        Door_swing.click();
        Select sel = new Select(Door_swing);
        sel.selectByValue("976");


    }



    public void Key_features() throws InterruptedException {
        logger.info("It should be display finish name");
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(10000);
        WebElement ele= driver.findElement(By.xpath("//span[contains(text(),'Features')]"));
        ele.click();

    }

    public void Specifications() throws InterruptedException {
        logger.info("It should be display finish name");
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(1000);
        WebElement ele= driver.findElement(By.xpath("//span[contains(text(),'Specifications')]"));
        ele.click();
    }

    public void RAQ() throws InterruptedException {
        logger.info("IIt should display popup of REQUEST A QUOTE with cross button(X)\n");
        Thread.sleep(10000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(10000);
        WebElement target= driver.findElement(By.xpath("//span[contains(text(),'Request a Quote')]"));

        target.click();

    }
    public void slider() throws InterruptedException {
        logger.info("The main product image should get change according to applied slider \n");
        Thread.sleep(30000);
        Actions ac=new Actions(driver);
        WebElement ele= driver.findElement(By.xpath("(//div[@class='fotorama__arr__arr'])[1]"));

        ac.moveToElement(ele).click().build().perform();
    }

    public void RAQ_blank() throws InterruptedException {
        logger.info("Error message should get dispalyed");

        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);

        WebElement target1= driver.findElement(By.xpath("//button[@id='request-a-form-submit']"));

        target1.click();

    }
    public void RAQ_invalid() throws InterruptedException {
        logger.info("error message should get dispalyed");

        Thread.sleep(10000);

        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(9000);
        WebElement Name= driver.findElement(By.xpath("//input[@name='first_name']"));
        Name.sendKeys("67787");

        WebElement Last_Name= driver.findElement(By.xpath("//input[@name='last_name']"));
        Last_Name.sendKeys("67787");
        WebElement PhoneName= driver.findElement(By.xpath("//input[@name='home_phone']"));
        PhoneName.sendKeys("67787");
        WebElement Email= driver.findElement(By.xpath("//input[@id='customer_email']"));
        Email.sendKeys("67787");
        WebElement Interested= driver.findElement(By.xpath("//textarea[@name='products_interested']"));
        Interested.sendKeys("67787");
        WebElement postal_code= driver.findElement(By.xpath("//input[@name='postal_code']"));
        postal_code.sendKeys("63011");


        WebElement target1= driver.findElement(By.xpath("//button[@id='request-a-form-submit']"));

        target1.click();



    }
    public void RAQ_valid() throws InterruptedException {
        logger.info("Success message should get dispalyed");
        Thread.sleep(10000);
//        WebElement target= driver.findElement(By.xpath("//span[contains(text(),'Request a Quote')]"));
//
//        target.click();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        String select = Keys.chord(Keys.CONTROL, "a");

        WebElement Name= driver.findElement(By.xpath("//input[@name='first_name']"));
        Name.sendKeys(select);
        Name.sendKeys("puja");

        WebElement Last_Name= driver.findElement(By.xpath("//input[@name='last_name']"));
        Last_Name.sendKeys(select);
        Last_Name.sendKeys("domke");
        WebElement PhoneName= driver.findElement(By.xpath("//input[@name='home_phone']"));
        PhoneName.sendKeys(select);
        PhoneName.sendKeys("8987656789");
        WebElement Email= driver.findElement(By.xpath("//input[@id='customer_email']"));
        Email.sendKeys(select);
        Email.sendKeys("puja@upbott.com");
        WebElement Interested= driver.findElement(By.xpath("//textarea[@name='products_interested']"));
        Interested.sendKeys(select);
        Interested.sendKeys("Testing request from upbott team");
        WebElement postal_code= driver.findElement(By.xpath("//input[@name='postal_code']"));
        postal_code.sendKeys(select);
        postal_code.sendKeys("63011");


        WebElement target1= driver.findElement(By.xpath("//button[@id='request-a-form-submit']"));

        target1.click();
        WebElement target2= driver.findElement(By.xpath("(//button[@class='action-close'][contains(.,'Close')])[1]"));

        target2.click();


    }


    public void Downloads() throws InterruptedException {
        logger.info("It should be display finish name");
        Thread.sleep(5000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,-1000)");
        WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Downloads')]"));
        ele.click();

        Thread.sleep(5000);
        WebElement alllinks = driver.findElement(By.xpath("//ul[@class='icon-links download no-margin']"));


        List<WebElement> Links = alllinks.findElements(By.tagName("a"));
        int Count = Links.size();
        System.out.println("Name: " + Count);
        for (int i = 0; i < Links.size(); i++) {
            String Opentabs = Keys.chord(Keys.CONTROL, Keys.ENTER);

            Links.get(i).sendKeys(Opentabs);

        }
    }

    public void Email() throws InterruptedException {
        logger.info("Email form pop up should get open\n");
        Thread.sleep(10000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,-1000)");
        WebElement ele = driver.findElement(By.xpath("//a[@class='action mailto friend']"));
        ele.click();
        Thread.sleep(10000);


    }

    public void Email_valid() throws InterruptedException {
        logger.info("success message should get displayed");
        Thread.sleep(10000);
        WebElement name = driver.findElement(By.xpath("//input[@id='sender-name']"));

        name.sendKeys("puja");

        WebElement Email = driver.findElement(By.xpath("//input[@id='sender-email']"));

        Email.sendKeys("puja@upbott.com");

        WebElement message = driver.findElement(By.xpath("//textarea[@name='recipients[message][0]']"));

        message.sendKeys("Testing request from upbott team");

        WebElement message1 = driver.findElement(By.xpath("//textarea[@name='sender[message]']"));

        message1.sendKeys("Testing request from upbott team");
        WebElement button = driver.findElement(By.xpath("//button[@class='action submit primary']"));

        button.click();
        Thread.sleep(10000);


    }

    public void Related_product() throws InterruptedException {
        logger.info("It should be display finish name");
        Thread.sleep(10000);
        WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'24-in Built-in High Efficiency Dual Zone Wine Refr')]"));

   ele.click();
    }
}