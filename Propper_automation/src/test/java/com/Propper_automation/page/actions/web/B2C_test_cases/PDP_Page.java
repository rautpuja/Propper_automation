package com.Propper_automation.page.actions.web.B2C_test_cases;


import com.Propper_automation.utils.selenium.WebUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class PDP_Page {
    private static final Logger logger = LoggerFactory.getLogger(PDP_Page.class);

    private WebDriver driver;



    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Model summary')]")
    @CacheLookup
    WebElement Model_summary;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Downloads')]")
    @CacheLookup
    WebElement Downloads;

    @FindBy(how = How.XPATH, using = "//a[@id='tab-label-accessoriestab-title']")
    @CacheLookup
    WebElement Accesories;


    public PDP_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void PDP_page() throws InterruptedException {
        logger.info("Application should display product detail page with product name/image & it should be clear & distinct.");
        Thread.sleep(20000);

        Actions ac = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("//span[contains(.,'Bags')]"));
        ac.moveToElement(ele).build().perform();
        Thread.sleep(10000);
        WebElement ele2 = driver.findElement(By.xpath("//a[@title='Computer Bags'][contains(.,'Computer Bags')]"));
        ele2.click();
        Thread.sleep(10000);
        WebElement ele3 = driver.findElement(By.xpath("//a[contains(.,'Kenneth Cole SnakeTrimmed 16\" Computer Tote')]"));
      ele3.click();


    }

    public void Breadcrumb() throws InterruptedException {
        logger.info("It should display the breadcrumb properly starting with home >Product name");
        Thread.sleep(10000);

        WebElement ele = driver.findElement(By.xpath("//ul[@class='items']"));
        System.out.println(ele.getText());

    }
    public void breadcrumb_link() throws InterruptedException {
        logger.info("It should get redirected to the respective page");
        Thread.sleep(10000);

        WebElement ele = driver.findElement(By.xpath("//li[@class='item home'][contains(.,'Home')]"));
       ele.click();
        Thread.sleep(10000);
        driver.navigate().back();

    }
    public void product_title() throws InterruptedException {
        logger.info("It should be same as on list page");
        Thread.sleep(10000);

        WebElement ele = driver.findElement(By.xpath("//div[@class='product-info-main']"));
        System.out.println(ele.getText());

    }
    public void Product_specification() throws InterruptedException {
        logger.info("Application should display/open Details tab with details of product");
        Thread.sleep(10000);

        WebElement ele = driver.findElement(By.xpath("//span[contains(@class,'base')]"));
        System.out.println(ele.getText());

    }
    public void Breadcrumb_link() throws InterruptedException {
        logger.info("It should get redirected to the respective page");
        Thread.sleep(10000);

        WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
        ele.click();
        Thread.sleep(10000);
        driver.navigate().back();


    }

    public void Product_sku() throws InterruptedException {
        logger.info("Application should display correct  sku as on list page");
        Thread.sleep(10000);
        WebElement Door_swing = driver.findElement(By.xpath("//div[contains(@class,'product-info-stock-sku')]"));
      System.out.println("Actual sku " +Door_swing.getText());



    }
    public void slider_image() throws InterruptedException {
        logger.info("The main product image should get change according to swipes");
        Thread.sleep(10000);
        WebElement slide = driver.findElement(By.xpath("(//div[@class='fotorama__arr__arr'])[2]"));
        slide.click();


    }
    public void QTY_box() throws InterruptedException {
        logger.info("\"It should be editable\n" +
                "It should change in product price.\n" +
                "It should display by default quantity.\n" +
                "If change(decrease) the by deafult quantity it should display 'You can not order less that minimum quantity '\"");
        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement slide = driver.findElement(By.xpath("//input[@name='qty']"));
      slide.sendKeys(select);
      slide.sendKeys("10");
        Thread.sleep(5000);
        WebElement ele = driver.findElement(By.xpath("//div[contains(@class,'add-top-custom-inner-total')]"));
     System.out.println(ele.getText());


    }

    public void order_now_button() throws InterruptedException {
        logger.info("It should display a popup");
        Thread.sleep(10000);
        WebElement slide = driver.findElement(By.xpath("//button[@class='button btn-green'][contains(.,'ORDER NOW')]"));
        slide.click();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(5000);
        WebElement close = driver.findElement(By.xpath("(//button[@class='action-close'][contains(.,'Close')])[3]"));
      close.click();

    }
    public void order_now_virtual_preview_button() throws InterruptedException {
        logger.info("It should display a popup");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement slide = driver.findElement(By.xpath("(//span[contains(.,'Create virtual preview')])[2]"));
       // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", slide);
        Thread.sleep(500);
        ac.moveToElement(slide).click().build().perform();

        Thread.sleep(5000);
       WebUtils.refreshBrowser();


    }
    public void order_product_sample_button() throws InterruptedException {
        logger.info("It should display a popup");
        Thread.sleep(10000);

        Actions ac=new Actions(driver);
        WebElement slide = driver.findElement(By.xpath("(//span[contains(.,'Order Product Sample')])[2]"));
     //   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", slide);
        Thread.sleep(500);
        ac.moveToElement(slide).click().build().perform();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(5000);
      WebUtils.refreshBrowser();
    }
    public void Add_to_wishlist_button() throws InterruptedException {
        logger.info("It should display a success message 'product_name has been added to your Wish List. Click here to continue shopping.' and added to wishlist ");
        Thread.sleep(10000);
        WebElement slide = driver.findElement(By.xpath("(//span[contains(.,'Add to Wish List')])[1]"));
        slide.click();


    }
    public void Email_button() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(10000);
        WebElement slide = driver.findElement(By.xpath("(//span[contains(.,'Email')])[1]"));
        slide.click();
        Thread.sleep(10000);
        driver.navigate().back();

    }
    public void Product_discription_button() throws InterruptedException {
        logger.info("Application should display/open Description tab of product");
        Thread.sleep(10000);
        WebElement slide = driver.findElement(By.xpath("//div[@aria-labelledby='tab-label-description']"));
        System.out.println("discription is : "+slide.getText());


    }
    public void additional_information_tab() throws InterruptedException {
        logger.info("Application should display/open additional information tab of product");
        Thread.sleep(10000);
        WebElement add = driver.findElement(By.xpath("//a[contains(.,'Additional Information')]"));
        add.click();
        Thread.sleep(5000);
        WebElement slide = driver.findElement(By.xpath("//a[contains(.,'Additional Information')]"));
        System.out.println("discription is : "+slide.getText());


    }
    public void frequntly_ask_question_button() throws InterruptedException {
        logger.info("Application should display/open frequently asked questions tab of product");
        Thread.sleep(10000);
        WebElement slide = driver.findElement(By.xpath("//a[@class='data switch'][contains(.,'Frequently Asked Questions')]"));
        slide.click();
        System.out.println("discription is : "+slide.getText());


    }
    public void our_garenty_button() throws InterruptedException {
        logger.info("Application should display/open our guarantee tab of product");
        Thread.sleep(10000);
        WebElement slide = driver.findElement(By.xpath("//a[@class='data switch'][contains(.,'Our Guarantee')]"));
        slide.click();
        System.out.println("discription is : "+slide.getText());


    }
    public void california_button() throws InterruptedException {
        logger.info("It should display a success message 'product_name has been added to your Wish List. Click here to continue shopping.' and added to wishlist ");
        Thread.sleep(10000);
        WebElement slide = driver.findElement(By.xpath("//a[@class='data switch'][contains(.,'California Proposition 65')]"));
        slide.click();
        System.out.println("discription is : "+slide.getText());


    }
    public void reviews_button() throws InterruptedException {
        logger.info("Application should display/open review tab with review form");
        Thread.sleep(10000);
        WebElement slide = driver.findElement(By.xpath("//a[@class='data switch'][contains(.,'Reviews')]"));
        slide.click();
        System.out.println("discription is : "+slide.getText());


    }
    public void related_product_button() throws InterruptedException {
        logger.info("It should display products with add to wish list buttton");
        Thread.sleep(10000);
        WebElement slide = driver.findElement(By.xpath("(//div[contains(@class,'product-item-info')])[1]"));
        System.out.println("discription is : "+slide.getText());


    }
    public void add_to_wishlist_from_related_product_button() throws InterruptedException {
        logger.info("It should display a success message 'product_name has been added to your Wish List. Click here to continue shopping.' and added to wishlist ");
        Thread.sleep(10000);
        WebElement slide = driver.findElement(By.xpath("(//span[contains(.,'Add to Wish List')])[2]"));
     slide.click();


    }

    public void Top_seller() throws InterruptedException {
        logger.info("It should display products with add to wish list buttton");
        Thread.sleep(10000);
        WebElement slide = driver.findElement(By.xpath("(//div[contains(@class,'product-item-info')])[5]"));
        System.out.println("discription is : "+slide.getText());


    }
    public void add_to_wishlist_from_top_seller_button() throws InterruptedException {
        logger.info("It should display a success message 'product_name has been added to your Wish List. Click here to continue shopping.' and added to wishlist  ");
        Thread.sleep(10000);
        WebElement slide = driver.findElement(By.xpath("(//span[contains(.,'Add to Wish List')])[6]"));
        slide.click();


    }
}