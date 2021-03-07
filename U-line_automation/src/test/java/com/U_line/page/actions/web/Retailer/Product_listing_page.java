package com.U_line.page.actions.web.Retailer;

import com.U_line.utils.common.Config;
import com.U_line.utils.selenium.WebUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Product_listing_page {
    private static final Logger logger= LoggerFactory.getLogger(Product_listing_page.class);
    private static final String APPLICATION_URL = Config.getProperty("appURL");

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
    public void Category_page() throws InterruptedException {
        logger.info("It should get redirected to the category page and all respective products  should display on it");
        Thread.sleep(10000);
//        Actions actions = new Actions(driver);
//        WebElement Menu = driver.findElement(By.xpath("//a[.='Products' and not(@title)]"));
//        actions.moveToElement(Menu);
//        WebElement subMenu = driver.findElement(By.xpath("//a[.='Beverage Centers' and not(@title)]"));
//        subMenu.click();

     //   driver.navigate().to("https://u-line.com/beverage-centers.html");
        WebUtils.navigateToURL(APPLICATION_URL+"beverage-centers.html");

    }

    public void Assending_order() throws InterruptedException {
        logger.info("It should get redirected to the category page and all respective products  should display on it");
        Thread.sleep(10000);
        WebElement Assending = driver.findElement(By.xpath("//a[@title='Set Descending Direction'][contains(.,'Set Descending Direction')]"));
        if(Assending.isDisplayed()) {
            Actions ac = new Actions(driver);


            ac.moveToElement(Assending).click().build().perform();


        }
        else {
            Actions ac = new Actions(driver);

            WebElement dessending = driver.findElement(By.xpath("(//a[@title='Set Ascending Direction'])[2]"));
            ac.click(dessending).click().build().perform();
        }

    }

    public void Show() throws InterruptedException {
        logger.info("It should get redirected to the category page and all respective products  should display on it");
        Thread.sleep(10000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");

            Show.click();
        Select sele=new Select(Show);
        sele.selectByValue("60");


    }

    public void Product_name() throws InterruptedException {
        logger.info("It should get redirected to the category page and all respective products  should display on it");

        Thread.sleep(10000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,-1000)");
        product_Name.click();

    }

    public void Breadcrumb() throws InterruptedException {
        logger.info("It should get redirected to the category page and all respective products  should display on it");

        Thread.sleep(10000);
       WebElement ele= driver.findElement(By.xpath("//ul[contains(@class,'items')]"));
       System.out.println(ele.getText());

    }
}
