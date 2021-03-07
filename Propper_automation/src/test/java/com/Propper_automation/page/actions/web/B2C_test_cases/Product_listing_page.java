package com.Propper_automation.page.actions.web.B2C_test_cases;

import com.Propper_automation.utils.common.Config;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Product_listing_page {
    private static final Logger logger = LoggerFactory.getLogger(Product_listing_page.class);
    private static final String APPLICATION_URL = Config.getProperty("appURL");

    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//body/div[4]/main[1]/div[3]/div[1]/div[2]/div[2]/div[3]/a[2]")
    @CacheLookup
    WebElement Assending;


    public Product_listing_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void PLP_page() throws InterruptedException {
        logger.info("It should get redirected to the PLP page and all respective products  should display on it");
        Thread.sleep(10000);

        Actions ac = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("//span[contains(.,'Bags')]"));
        ac.moveToElement(ele).build().perform();
        Thread.sleep(30000);
        WebElement ele2 = driver.findElement(By.xpath("//a[@title='Computer Bags'][contains(.,'Computer Bags')]"));
        ele2.click();

    }

    public void breadcrumb() throws InterruptedException {
        logger.info("\"It should display the breadcrumb properly starting with Home >\n" +
                "Click on breadcrumb it should redirect to respective page\"");
        Thread.sleep(10000);
        WebElement ele2 = driver.findElement(By.xpath("(//ul[contains(@class,'items')])[1]"));
        System.out.println("Actual breadcrumb is : " + ele2.getText());
    }

    public void breadcrumb_category_name() throws InterruptedException {
        logger.info("Application should display correct category name in the breadcrumb");
        Thread.sleep(10000);
        WebElement ele2 = driver.findElement(By.xpath("(//ul[contains(@class,'items')])[1]"));
        System.out.println("Actual breadcrumb is : " + ele2.getText());
    }

    public void Read_more_link() throws InterruptedException {
        logger.info("It should redirect at bottom of pagination and should display tiles");
        Thread.sleep(10000);
        WebElement ele2 = driver.findElement(By.xpath("//strong[contains(.,'READ MORE')]"));
        ele2.click();
    }


    public void Product_sorting() throws InterruptedException {
        logger.info("Product sorting  should be according to relevance(by default selected)");
        Thread.sleep(10000);
        WebElement ele2 = driver.findElement(By.xpath("(//select[contains(@id,'sorter')])[2]"));
        Select sel = new Select(ele2);
        sel.selectByValue("name");
    }

    public void sorting_arrow() throws InterruptedException {
        logger.info("Upward arrows should sort results in descending order and downward should sort it as ascending order.");
        Thread.sleep(10000);
        WebElement Assending = driver.findElement(By.xpath("//a[contains(.,'Set Ascending Direction')]"));
        if (Assending.isDisplayed()) {
            Actions ac = new Actions(driver);


            ac.moveToElement(Assending).click().build().perform();

            System.out.println("click on assending order");
        } else {
            Actions ac = new Actions(driver);

            WebElement dessending = driver.findElement(By.xpath("//a[contains(.,'Set Descending Direction')]"));
            ac.click(dessending).click().build().perform();
            System.out.println("click on descending order");
        }

    }

    public void sorter_option() throws InterruptedException {
        logger.info("\"It should dispaly four options\n" +
                "1.relevance\n" +
                "2.product name\n" +
                "3.price\n" +
                "4.stylus\n" +
                "It should display result according to selection of option\"");
        Thread.sleep(10000);
        WebElement ele2 = driver.findElement(By.xpath("(//select[contains(@id,'sorter')])[2]"));
        Select s = new Select(ele2);
        List<WebElement> op = s.getOptions();
        int size = op.size();
        for (int i = 0; i < size; i++) {
            String options = op.get(i).getText();
            System.out.println(options);
        }
    }

    public void product_image() throws InterruptedException {
        logger.info("Product image, product name should be clear and distinct");
        Thread.sleep(10000);
        WebElement ele2 = driver.findElement(By.xpath("(//div[@class='product-item-info'])[1]"));
        System.out.println("Product detail : " + ele2.getText());
    }

    public void product_image_link() throws InterruptedException {
        logger.info("It should get redirect to respective page");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement ele2 = driver.findElement(By.xpath("(//a[contains(@class,'product-item-link')])[1]"));
     ac.moveToElement(ele2).click().build().perform();
        Thread.sleep(10000);
        driver.navigate().back();
        // WebUtils.navigateToURL(APPLICATION_URL);
    }

    public void wishlist_link() throws InterruptedException {
        logger.info("It should display a success message 'product_name has been added to your Wish List. Click here to continue shopping.' and added to wish list");
        Thread.sleep(10000);
        WebElement ele2 = driver.findElement(By.xpath("(//span[contains(.,'Add to Wish List')])[2]"));
        ele2.click();

    }

    public void filter_option() throws InterruptedException {
        logger.info("\"When filter options are selected it should display respective products\n" +
                "Filter should present in left hand side of all poducts\"");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement ele2 = driver.findElement(By.xpath("(//span[@class='title '][contains(.,'5')])[1]"));
        ac.moveToElement(ele2).click().build().perform();

    }

    public void clear_all_option() throws InterruptedException {
        logger.info("Application should clear selected filter");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement ele2 = driver.findElement(By.xpath("(//a[@class='eln-layer-clear-all clear'])[1]"));
        ac.moveToElement(ele2).click().build().perform();

    }

    public void minimize_filter() throws InterruptedException {
        logger.info("It should the close the filter dropdown . By default fiilter dropdown should open");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement ele2 = driver.findElement(By.xpath("//div[@class='filter-options-title'][contains(.,'Minimum Purchase Number')]"));
        ac.moveToElement(ele2).click().build().perform();


    }
    public void maximize_filter() throws InterruptedException {
        logger.info("It should the open the filter dropdown ");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement	ele2= driver.findElement(By.xpath("//div[@class='filter-options-title'][contains(.,'Minimum Purchase Number')]"));
        ac.moveToElement(ele2).click().build().perform();

    }

    public void showmore_option() throws InterruptedException {
        logger.info("It should display more options of the filter ");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement	ele2= driver.findElement(By.xpath("//div[contains(@data-target,'filter-brand_ids')]"));
       ac.moveToElement(ele2).click().build().perform();

    }

    public void showless_option() throws InterruptedException {
        logger.info("It should display more options of the filter ");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement	ele2= driver.findElement(By.xpath("//div[contains(@class,'show-more expand')]"));
        ac.moveToElement(ele2).click().build().perform();


    }

    public void show_filter() throws InterruptedException {
        logger.info("Show button should align properly  ");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement	ele2= driver.findElement(By.xpath("//select[contains(@data-role,'limiter')]"));
     System.out.println(" Filter is : "+ele2.getText());

    }
    public void show_filter_select() throws InterruptedException {
        logger.info("By default 30 should be selected and results should be according to the selection. It should sort the results as per 30,60,90 items selected");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement	ele2= driver.findElement(By.xpath("//select[contains(@data-role,'limiter')]"));
    Select sel=new Select(ele2);
    sel.selectByValue("60");

    }
    public void pagination() throws InterruptedException {
        logger.info("It should display numbers ending with Next arrow icon");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement	ele2= driver.findElement(By.xpath("//a[@class='action  next page']"));
      ac.moveToElement(ele2).click().build().perform();

    }
    public void pagination_button() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement	ele2= driver.findElement(By.xpath("//a[@href='#'][contains(@id,'30')][contains(.,'3')]"));
        ac.moveToElement(ele2).click().build().perform();

    }
}