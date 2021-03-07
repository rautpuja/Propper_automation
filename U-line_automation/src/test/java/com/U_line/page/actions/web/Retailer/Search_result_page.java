package com.U_line.page.actions.web.Retailer;

import org.openqa.selenium.*;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.Key;

public class Search_result_page {

    private static final Logger logger = LoggerFactory.getLogger(Search_result_page.class);

    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//i[@class='porto-icon-search']")
    @CacheLookup
    WebElement Search_icon;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Search...']")
    @CacheLookup
    WebElement SearchBox;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Cellar-Like Conditions for Your Wine')]")
    @CacheLookup
    WebElement Resource_link1;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'The Evolution of Wine Preservation')]")
    @CacheLookup
    WebElement Resource_link2;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Train Your Palate to Taste Wine Like a Pro')]")
    @CacheLookup
    WebElement Resource_link3;

    @FindBy(how = How.XPATH, using = "//header/div[2]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[2]']")
    @CacheLookup
    WebElement Resource_link4;


    @FindBy(how = How.XPATH, using = "//header/div[2]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[5]/a[1]/div[1]/span[1]")
    @CacheLookup
    WebElement Resource_link5;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Browse all products')]")
    @CacheLookup
    WebElement Quik_link1;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Shop parts & accessories')]")
    @CacheLookup
    WebElement Quik_link2;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Find manuals & guides')]")
    @CacheLookup
    WebElement Quik_link3;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'UCC1A')]]")
    @CacheLookup
    WebElement Product_name;
    @FindBy(how = How.XPATH, using="//div[@class='toolbar-sorter sorter']")
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


    public Search_result_page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }




    public void BrowseAllCategory() throws InterruptedException {
        Thread.sleep(4000);
        logger.info("Search Result should get displayed ");
         Search_icon.click();
         Thread.sleep(3000);
         SearchBox.sendKeys("Wine");
         Thread.sleep(6000);
    }

    public void Resource_link() throws InterruptedException {
        Thread.sleep(4000);
        logger.info("Resources link should be related to search keyword and link should be clickable ");
       Resource_link1.click();
       Thread.sleep(6000);
       driver.navigate().back();
        Thread.sleep(10000);
     WebElement ele= driver.findElement(By.xpath("//i[@class='porto-icon-search']"));
        ele.click();
        Thread.sleep(3000);
        WebElement searchbox= driver.findElement(By.xpath("//input[@placeholder='Search...']"));
        searchbox.sendKeys("Wine");
        Thread.sleep(6000);
        Resource_link2.click();
        Thread.sleep(6000);
        driver.navigate().back();
        Thread.sleep(10000);
        WebElement ele1= driver.findElement(By.xpath("//i[@class='porto-icon-search']"));
        ele1.click();
        Thread.sleep(3000);
        WebElement searchbox2= driver.findElement(By.xpath("//input[@placeholder='Search...']"));
        searchbox2.sendKeys("Wine");
        Thread.sleep(6000);

        Resource_link3.click();
        Thread.sleep(6000);
        driver.navigate().back();
        Thread.sleep(10000);
//        WebElement ele3= driver.findElement(By.xpath("//i[@class='porto-icon-search']"));
//        ele3.click();
//        Thread.sleep(3000);
//        WebElement searchbox3= driver.findElement(By.xpath("//input[@placeholder='Search...']"));
//        searchbox3.sendKeys("Wine");
//        Thread.sleep(6000);
//
//        Resource_link4.click();
//
//        Thread.sleep(6000);
//        driver.navigate().back();
//        Thread.sleep(10000);
//        WebElement ele4= driver.findElement(By.xpath("//i[@class='porto-icon-search']"));
//        ele4.click();
//        Thread.sleep(3000);
//        WebElement searchbox4= driver.findElement(By.xpath("//input[@placeholder='Search...']"));
//        searchbox4.sendKeys("Wine");
//        Thread.sleep(6000);
//
//        Resource_link5.click();
//
//        Thread.sleep(6000);
//        driver.navigate().back();
//        Thread.sleep(10000);
//        WebElement ele5= driver.findElement(By.xpath("//i[@class='porto-icon-search']"));
//        ele5.click();
//        Thread.sleep(3000);
//        WebElement searchbox5= driver.findElement(By.xpath("//input[@placeholder='Search...']"));
//        searchbox5.sendKeys("Wine");
//        Thread.sleep(6000);
    }

    public void Quick_link1() throws InterruptedException {
        Thread.sleep(4000);
        logger.info("\"It should get redirect to category (L1) page\n" +
                "\" ");
        Thread.sleep(5000);
        WebElement ele3= driver.findElement(By.xpath("//i[@class='porto-icon-search']"));
        ele3.click();
        Thread.sleep(5000);
        WebElement searchbox= driver.findElement(By.xpath("//input[@placeholder='Search...']"));
        searchbox.sendKeys("Wine");
        Quik_link1.click();


    }

    public void Quick_link2() throws InterruptedException {
        Thread.sleep(4000);
        logger.info("\"It should get redirect to part and accesories page\n" +
                "\"");
        Thread.sleep(5000);
        WebElement ele3= driver.findElement(By.xpath("//i[@class='porto-icon-search']"));
        ele3.click();
        Thread.sleep(5000);
        WebElement searchbox= driver.findElement(By.xpath("//input[@placeholder='Search...']"));
        searchbox.sendKeys("Wine");
        Quik_link2.click();

    }

public void Quick_link3() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should get redirect to Manuals & Guides");
    Thread.sleep(5000);
    WebElement ele3= driver.findElement(By.xpath("//i[@class='porto-icon-search']"));
    ele3.click();
    Thread.sleep(5000);
    WebElement searchbox= driver.findElement(By.xpath("//input[@placeholder='Search...']"));
    searchbox.sendKeys("Wine");
        Quik_link3.click();

}

public void Product_name() throws InterruptedException {
    //    Thread.sleep(4000);
        logger.info("Product image, product name should be clear and distinct ");
    Thread.sleep(10000);
    WebElement ele3= driver.findElement(By.xpath("//i[@class='porto-icon-search']"));
    ele3.click();
    Thread.sleep(5000);
    WebElement searchbox= driver.findElement(By.xpath("//input[@placeholder='Search...']"));
    searchbox.sendKeys("Wine");
    Thread.sleep(50000);
        WebElement ele= driver.findElement(By.xpath("//span[contains(text(),'UCC1A')]"));
        System.out.println(ele.getText());
      //  ele.click();


    }

    public void Search_PLP_page() throws InterruptedException {

        Thread.sleep(12000);
        WebElement ele=driver.findElement(By.xpath("//img[@class='default-logo']"));
        ele.click();
        logger.info("\"It should get redirect to category (L1) page\n" +
                "\" ");
        Thread.sleep(12000);


        WebElement ele6= driver.findElement(By.xpath("//i[@class='porto-icon-search']"));
        ele6.click();
        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");


        WebElement searchbox2= driver.findElement(By.xpath("//input[@placeholder='Search...']"));
      searchbox2.sendKeys(select);
        searchbox2.sendKeys("Wine");

        Thread.sleep(10000);
        searchbox2.sendKeys(Keys.ENTER);
    }
    public void Assending_order() throws InterruptedException {
        logger.info("\"1.On Upward arrow selection it will set products in Ascending Order\n" +
                "2.On Downward arrow selection it will set products in DescendingOrder\"");
       Thread.sleep(50000);

        Assending.click();


    }

    public void Show() throws InterruptedException {
        logger.info("By deafult 30 should be selected and results should be according to the slection. It should sort the results as per 30,45,60,90 items selected");
        Thread.sleep(10000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");

        Show.click();
        Select sele=new Select(Show);
        sele.selectByValue("60");


    }

    public void Product_nametest() throws InterruptedException {
        logger.info("It should get redirected to the category page and all respective products  should display on it");

        Thread.sleep(10000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,-1000)");
        product_Name.click();

    }



}