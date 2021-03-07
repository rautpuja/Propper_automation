package com.U_line.page.actions.web.Retailer;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Parts_and_accessories_page {
    private static final Logger logger= LoggerFactory.getLogger(Product_listing_page.class);

    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Serial Number')]")
    @CacheLookup
    WebElement Searial_Number;

    @FindBy(how = How.XPATH, using="//input[@placeholder='1714862050527']")
    @CacheLookup
    WebElement Serialnumber;

    @FindBy(how = How.XPATH, using="//button[@id='el_search']")
    @CacheLookup
    WebElement search;



    @FindBy(how = How.XPATH, using="//header/div[2]/div[3]/div[1]/div[2]/nav[1]/ul[1]/li[2]/a[1]/span[1]")
    @CacheLookup
    WebElement Parts_and_accessories;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'View Cart')]")
    @CacheLookup
    WebElement viewcart;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Continue Shopping')]")
    @CacheLookup
    WebElement ContinueShopping;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Continue Shopping')]")
    @CacheLookup
    WebElement CrossIcon;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Downloads')]")
    @CacheLookup
    WebElement Download;
    @FindBy(how = How.XPATH, using="//span[contains(text(),'2D CAD (DWG)')]")
    @CacheLookup
    WebElement PDF1;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'3D CAD (DWG)')]")
    @CacheLookup
    WebElement PDF2;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Compliance')]")
    @CacheLookup
    WebElement PDF3;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Current Product Warranty')]")
    @CacheLookup
    WebElement PDF4;


    @FindBy(how = How.XPATH, using="//span[contains(text(),'Energuide (Canada)')]")
    @CacheLookup
    WebElement PDF5;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Energy Guide (US)')]")
    @CacheLookup
    WebElement PDF6;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Expanded View of Parts')]")
    @CacheLookup
    WebElement PDF7;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Panel Specs')]")
    @CacheLookup
    WebElement PDF9;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Quick Start Guide')]")
    @CacheLookup
    WebElement PDF8;



    @FindBy(how = How.XPATH, using="//body/div[2]/main[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]/input[1]")
    @CacheLookup
    WebElement SearchTextBox;

    public Parts_and_accessories_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void Parts_and_accessories() {
        logger.info("It should be redirect to part & accessories page");
 Parts_and_accessories.click();
    }

    public void Part_search_SerialNumber() throws InterruptedException {
        logger.info("Click on Serial Number It should be clickable and the background color should be black after clicking");
        Thread.sleep(8000);
        Thread.sleep(4000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,-1000)");
        Searial_Number.click();
    }

    public void Part_search_click_link1() throws InterruptedException {
        logger.info("1. It should be redirect to 'http://vikingrange.middlebyadvantage.com/Clients/CustomPage.aspx?page=/Viking/index.html' this pge, 2. It should be redirect to ' Shipping & Return Policy' page, " +
                "3.It should be redirect to 'Find a U-Line retailer or servicer in your area' page." +
                "4. It should be redirect to 'Proposition 65' page");

        Thread.sleep(50000);
        WebElement alllinks = driver.findElement(By.xpath("//div[@class='parts-content']"));


        List<WebElement> Links = alllinks.findElements(By.tagName("a"));
        int Count     = Links.size();
        System.out.println("Name: " +Count);
        for(int i=0;i<Links.size();i++)
        {
            String Opentabs=Keys.chord(Keys.CONTROL,Keys.ENTER);

            Links.get(i).sendKeys(Opentabs);
            //  System.out.println(driver.getTitle());
    }}

    public void SerialNumber() throws InterruptedException {
        logger.info("1.Model number/Serial Number/Part Number should be search by entering valid data\\n\" +\n" +
                "                \"2.auto result should be generated");
        Thread.sleep(6000);
        WebElement ele= driver.findElement(By.xpath("//label[contains(text(),'Serial Number')]"));
        ele.click();

        String select = Keys.chord(Keys.CONTROL, "a");
       // Serialnumber.sendKeys(select);
        Serialnumber.sendKeys(select);

        Serialnumber.sendKeys("1957171060030");
    }
    public void Wrong_SerialNumber() throws InterruptedException {
        logger.info("Error mesage should display 'Invalid Entry. The part you are looking for may be discontinued. Please see our Discontinued " +
                "Parts Cross Reference Guide. Still Don’t see what you’re looking for? Contact us.'");
        Thread.sleep(10000);
        Thread.sleep(4000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,-1000)");
        WebElement ele= driver.findElement(By.xpath("//label[contains(text(),'Serial Number')]"));
       ele.click();
        String select = Keys.chord(Keys.CONTROL, "a");

        Serialnumber.sendKeys(select);
        Searial_Number.click();
        Serialnumber.sendKeys("1957171");

    }
    public void Search() throws InterruptedException {
        logger.info("Search Result should display with correct result on same page below the parts Search  banner");
        Thread.sleep(10000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,-1000)");
        search.click();
    }

    public void addtocart() throws InterruptedException {

        logger.info("\"It should give the pop up as \"\"View Cart\"\" and display \n" +
                "'Continue shopping' button\"");
        Thread.sleep(10000);
        //WebDriverWait wait2 = new WebDriverWait(driver, 10);
        //wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkmo']")));
        WebElement element = driver.findElement(By.xpath("//input[@product_id='11189']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
        //addtocart.click();


    }

    public void viewcart() throws InterruptedException {
        logger.info(" \"It should be redirect to Shopping cart page\n" +
                "\" ");
        Thread.sleep(10000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        viewcart.click();

    }


    public void ContinueShopping() throws InterruptedException {
        logger.info(" Click on continue button ");

        Thread.sleep(10000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(4000);
        ContinueShopping.click();


    }

    public void SearchBox() throws InterruptedException {
        logger.info(" It should search for Part Number,Description and Price and give respective result ");
        Thread.sleep(10000);
        SearchTextBox.sendKeys("80-54000-00");
    }


}
