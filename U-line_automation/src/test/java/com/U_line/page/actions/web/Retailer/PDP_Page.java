package com.U_line.page.actions.web.Retailer;


import com.U_line.utils.common.Config;
import com.U_line.utils.selenium.WebUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

import java.util.List;

public class PDP_Page {
    private static final Logger logger= LoggerFactory.getLogger(PDP_Page.class);
    private static final String APPLICATION_URL = Config.getProperty("appURL");
    private WebDriver driver;

    @FindBy(how = How.XPATH, using="//div[@id='option-label-color-93-item-100']")
    @CacheLookup
    WebElement Finish1;

    @FindBy(how = How.XPATH, using="//div[@id='option-label-color-93-item-66']")
    @CacheLookup
    WebElement Finish2;

    @FindBy(how = How.XPATH, using="//div[@id='option-label-color-93-item-168']")
    @CacheLookup
    WebElement Finish3;

    @FindBy(how = How.XPATH, using="//body/div[1]/main[1]/div[2]/div[1]/div[2]/div[4]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/select[1]")
    @CacheLookup
    WebElement Door_swing;

    @FindBy(how = How.XPATH, using="//body/div[1]/main[1]/div[2]/div[1]/div[2]/div[4]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/select[1]")
    @CacheLookup
    WebElement Lock;


    @FindBy(how = How.XPATH, using="//a[@title='Find a Dealer']")
    @CacheLookup
    WebElement Find_dealer;


    @FindBy(how = How.XPATH, using="//span[contains(text(),'Description')]")
    @CacheLookup
    WebElement Discription;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Key Features')]")
    @CacheLookup
    WebElement Key_feature;
    @FindBy(how = How.XPATH, using="//a[@id='tab-label-product.attributes.details-title']")
    @CacheLookup
    WebElement details;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Model summary')]")
    @CacheLookup
    WebElement Model_summary;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Downloads')]")
    @CacheLookup
    WebElement Downloads;

    @FindBy(how = How.XPATH, using="//a[@id='tab-label-accessoriestab-title']")
    @CacheLookup
    WebElement Accesories;

    @FindBy(how = How.XPATH, using="//body/div[1]/main[1]/div[2]/div[1]/div[4]/div[1]/div[12]/div[1]/div[1]/ol[1]/li[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/button[1]")
    @CacheLookup
    WebElement Add_to_cart;

    public PDP_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void PDP_page() throws InterruptedException {
        logger.info("It should get redirected to the category page and all respective products  should display on it");
        Thread.sleep(10000);
        WebUtils.navigateToURL(APPLICATION_URL+"beverage-centers/hbd524.html");

    }

    public void Finish_tab() throws InterruptedException {
        logger.info("It should be display finish name");
        Thread.sleep(10000);
        Finish1.click();
        Thread.sleep(4000);
        Finish2.click();
        Thread.sleep(4000);
        Finish3.click();
        Thread.sleep(4000);
    }
    public void Door_swing_drop_down() throws InterruptedException {
        logger.info("It should be display finish name");
        Thread.sleep(10000);
        WebElement Door_swing= driver.findElement(By.xpath("//select[contains(@class,'swatch-select door_swing')]"));
        Door_swing.click();
        Select sel= new Select(Door_swing);
        sel.selectByValue("29");

        Thread.sleep(3000);
        WebElement  Lock= driver.findElement(By.xpath("//select[contains(@class,'swatch-select lock')]"));
        Lock.click();
        Select sel1= new Select(Lock);
        sel1.selectByValue("112");

    }
    public void Find_a_dealer() throws InterruptedException {
        logger.info("It should be display finish name");
        Thread.sleep(10000);
      Find_dealer.click();
      Thread.sleep(5000);
      driver.navigate().back();
      Thread.sleep(10000);

    }
    public void Discription() throws InterruptedException {
        logger.info("It should be display finish name");
        Thread.sleep(10000);
       Discription.click();
        Thread.sleep(8000);

    }
    public void Key_features() throws InterruptedException {
        logger.info("It should be display finish name");
        Thread.sleep(10000);
        Key_feature.click();

    }
    public void Details() throws InterruptedException {
        logger.info("It should be display finish name");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement  details = driver.findElement(By.xpath("//span[contains(.,'Details')]"));
       ac.moveToElement(details).click().build().perform();
    }
    public void Model_summary() throws InterruptedException {
        logger.info("It should be display finish name");
        Thread.sleep(10000);
       Model_summary.click();
    }
    public void Downloads() throws InterruptedException {
        logger.info("It should be display finish name");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement download = driver.findElement(By.xpath("//span[contains(.,'Downloads')]"));
      ac.moveToElement(download).click().build().perform();
        Thread.sleep(10000);
        WebElement alllinks = driver.findElement(By.xpath("//div[contains(@class,'download-section')]"));


        List<WebElement> Links = alllinks.findElements(By.tagName("a"));
        int Count     = Links.size();
        System.out.println("Name: " +Count);
        for(int i=0;i<Links.size();i++)
        {
            String Opentabs= Keys.chord(Keys.CONTROL,Keys.ENTER);

            Links.get(i).sendKeys(Opentabs);
            //  System.out.println(driver.getTitle());

        }


    }

    public void Assesories() throws InterruptedException {
        logger.info("It should be display finish name");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement Accesories= driver.findElement(By.xpath("(//span[contains(.,'Accessories')])[2]"));
       ac.moveToElement(Accesories).click().build().perform();
    }
        public void Add_to_cart() throws InterruptedException {
            logger.info("It should be display finish name");
            Thread.sleep(2000);
            Actions ac=new Actions(driver);
            WebElement Accesories= driver.findElement(By.xpath("(//span[contains(.,'Add to Cart')])[1]"));
            ac.moveToElement(Accesories).click().build().perform();

    }
}
