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

public class Product_listing_page {
    private static final Logger logger= LoggerFactory.getLogger(Product_listing_page.class);

    private WebDriver driver;

    @FindBy(how = How.XPATH, using="//body/div[4]/main[1]/div[3]/div[1]/div[2]/div[2]/div[3]/a[2]")
    @CacheLookup
    WebElement Assending;

    @FindBy(how = How.XPATH, using="//a[.='Products' and not(@title)]")
    @CacheLookup
    WebElement product;

    @FindBy(how = How.XPATH, using="//select[@id='limiter']")
    @CacheLookup
    WebElement Show;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'HBD524')]")
    @CacheLookup
    WebElement product_Name;


    public Product_listing_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void product() throws InterruptedException {
        logger.info("It should get redirected to the category page and all respective products should display on it\n");
        Thread.sleep(20000);
        Actions actions = new Actions(driver);
        WebElement Menu = driver.findElement(By.xpath("//a[.='Products' and not(@title)]"));
       Menu.click();

    }
    public void Category() throws InterruptedException {
        logger.info("Application should display correct category name.in the breadcrumb\n");
        Thread.sleep(10000);
        Actions actions = new Actions(driver);
        WebElement Menu = driver.findElement(By.xpath("(//ul[contains(@class,'items')])[2]"));
      System.out.println(Menu.getText());

    }

    public void Filter() throws InterruptedException {
        logger.info("\"1.By default, the category we are currently have, it should be checked.\n" +
                "2.When check on filter options, It should sort the results accordingly\"\n");
        Thread.sleep(10000);

        WebElement subMenu = driver.findElement(By.xpath("//div[@data-filter='100']"));
        subMenu.click();

    }
    public void Clear_all() throws InterruptedException {
        logger.info("After Click on clear all filter selected filter option should get remove\n");
        Thread.sleep(10000);
          Actions ac=new Actions(driver);
        WebElement subMenu = driver.findElement(By.xpath("(//a[contains(@class,'eln-layer-clear-all clear')])[3]"));
       ac.moveToElement(subMenu).click().build().perform();

    }

    public void Product_name_() throws InterruptedException {
        logger.info("Product image, product name should be clear and distinct\n");
        Thread.sleep(10000);

        WebElement subMenu = driver.findElement(By.xpath("//span[@data-ui-id='page-title-wrapper']"));
        System.out.println(subMenu.getText());

    }
    public void Product_name_Link() throws InterruptedException {
        logger.info("It should redirect to PDP page\n");
        Thread.sleep(10000);

        WebElement subMenu = driver.findElement(By.xpath("(//a[contains(@class,'product-item-link')])[1]"));
      subMenu.click();
        Thread.sleep(10000);
        driver.navigate().back();

    }
    public void Breadcrumb() throws InterruptedException {
        logger.info("\"It should display the breadcrumb properly starting with Home > Products > category_name\n" +
                "Click on breadcrumb it should redirect to respective page\"\n");
        Thread.sleep(10000);

        WebElement subMenu = driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
        subMenu.click();

    }

    public void Assending_order() throws InterruptedException {
        logger.info("Upward arrows should sort results in descending order and downward should sort it as ascending order.\n");
        Thread.sleep(1000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,500)");
        Thread.sleep(50000);

        WebElement Assending= driver.findElement(By.xpath("//a[contains(@class,'action sorter-action sort-asc active')]"));

        if(Assending.isDisplayed()) {
            Actions ac = new Actions(driver);


            ac.moveToElement(Assending).click().build().perform();

            System.out.println("click on assending order");
        }
        else {
            Actions ac = new Actions(driver);

            WebElement dessending = driver.findElement(By.xpath("//a[contains(@class,'action sorter-action sort-desc  active')]"));
            ac.click(dessending).click().build().perform();
            System.out.println("click on descending order");
        }


    }

    public void Show() throws InterruptedException {
        logger.info("\"by default collection is select .\n" +
                "it should display 2 options in dropdown 1.collection 2.price\n" +
                "It should display the results accordingly\"\n");
        Thread.sleep(10000);
Actions ac=new Actions(driver);
        WebElement Show= driver.findElement(By.xpath("(//select[contains(@id,'sorter')])[2]"));
        ac.moveToElement(Show).click().build().perform();
        Select sele=new Select(Show);
        sele.selectByValue("price");


    }



    public void Learn_more() throws InterruptedException {
        logger.info("It should redirect to PDP page\n");
        Thread.sleep(10000);
        WebElement target= driver.findElement(By.xpath("(//a[contains(@class,'action more btn button')])[1]"));
        target.click();



    }

    public void Learn_more_hover() throws InterruptedException {
        logger.info("When hovering over the 'Learn More' button two icons should appear on the side and product image should have to change\n");
        Thread.sleep(10000);

        WebElement target= driver.findElement(By.xpath("(//a[contains(@class,'action more btn button')])[1]"));
        WebElement ele3= driver.findElement(By.xpath("(//a[@title='Request a Quote'][contains(.,'Request a Quote')])[1]"));

        Actions action = new Actions(driver);

        action.moveToElement(target).build().perform();



    }
    public void RAQ_form() throws InterruptedException {
        logger.info("Request a quote form should get open\n");
        Thread.sleep(10000);

        WebElement target= driver.findElement(By.xpath("(//a[contains(@class,'action more btn button')])[1]"));
        WebElement ele3= driver.findElement(By.xpath("(//a[@title='Request a Quote'][contains(.,'Request a Quote')])[1]"));

        Actions action = new Actions(driver);

        action.moveToElement(target).moveToElement(ele3).click().build().perform();



    }
    public void RAQ_blank() throws InterruptedException {
        logger.info("Error message should get displayed\n");
        Thread.sleep(10000);


        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);

        WebElement target2= driver.findElement(By.xpath("//button[@id='request-a-form-submit']"));

       target2.click();

    }
    public void RAQ_invalid() throws InterruptedException {
        logger.info("Error message should get displayed\n");

        Thread.sleep(10000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        WebElement Name= driver.findElement(By.xpath("//input[@name='first_name']"));
        Name.sendKeys("67787");

        WebElement Last_Name= driver.findElement(By.xpath("//input[@name='last_name']"));
        Last_Name.sendKeys("67787");
        WebElement PhoneName= driver.findElement(By.xpath("//input[@name='home_phone']"));
       PhoneName.sendKeys("67787");
        WebElement Email= driver.findElement(By.xpath("//input[@id='customer_email']"));
        Email.sendKeys("67787");
        WebElement Interested= driver.findElement(By.xpath("//textarea[contains(@name,'products_interested')]"));
        Interested.sendKeys("67787");
        WebElement postal_code= driver.findElement(By.xpath("//input[@name='postal_code']"));
        postal_code.sendKeys("63011");


        WebElement target= driver.findElement(By.xpath("//button[@id='request-a-form-submit']"));

        target.click();



    }
    public void RAQ_valid() throws InterruptedException {
        logger.info("Successfully submitted the form message should get displayed\n");
        Thread.sleep(10000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        String select = Keys.chord(Keys.CONTROL, "a");

        WebElement Name= driver.findElement(By.xpath("//input[@name='first_name']"));
        Name.sendKeys(select);
        Name.sendKeys("67787");

        WebElement Last_Name= driver.findElement(By.xpath("//input[@name='last_name']"));
        Last_Name.sendKeys(select);
        Last_Name.sendKeys("67787");
        WebElement PhoneName= driver.findElement(By.xpath("//input[@name='home_phone']"));
        PhoneName.sendKeys(select);
        PhoneName.sendKeys("67787");
        WebElement Email= driver.findElement(By.xpath("//input[@id='customer_email']"));
        Email.sendKeys(select);
        Email.sendKeys("67787");
        WebElement Interested= driver.findElement(By.xpath("//textarea[contains(@name,'products_interested')]"));
        Interested.sendKeys("Testing request from upbott team");
        WebElement postal_code= driver.findElement(By.xpath("//input[@name='postal_code']"));
        postal_code.sendKeys(select);
        postal_code.sendKeys("63011");


        WebElement target= driver.findElement(By.xpath("//button[@id='request-a-form-submit']"));

        target.click();
        Thread.sleep(5000);

        WebElement target2= driver.findElement(By.xpath("(//button[@class='action-close'][contains(.,'Close')])[1]"));

        target2.click();


    }


    public void Add_to_compare() throws InterruptedException {
        logger.info("Success message should get displayed\n");

        Thread.sleep(10000);

        WebElement target= driver.findElement(By.xpath("(//a[contains(@class,'action more btn button')])[1]"));
        WebElement ele3= driver.findElement(By.xpath("(//a[@title='Add to Compare'])[1]"));
        // Actions a = new Actions(driver);
        Actions action = new Actions(driver);
//moving to the main menu and then sub menu and clicking on it using object of the Actions class
        action.moveToElement(target).moveToElement(ele3).click();

    }


}
