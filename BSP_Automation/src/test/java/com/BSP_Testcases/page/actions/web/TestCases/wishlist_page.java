package com.BSP_Testcases.page.actions.web.TestCases;

import com.BSP_Testcases.reporter.reporter.ExtentReporter;
import com.BSP_Testcases.utils.common.Config;
import com.BSP_Testcases.utils.selenium.WebUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class wishlist_page {
    private static final Logger lOGGER = LoggerFactory.getLogger(wishlist_page.class);
    private static final String APPLICATION_URL = Config.getProperty("appURL");

    private WebDriver driver;




    public wishlist_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void PDP_page() throws InterruptedException {
        lOGGER.info("Application should display product detail page with product name/image & it should be clear & distinct.");
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
    public void Add_to_wishlist_button() throws InterruptedException {
        lOGGER.info("It should display a success message 'product_name has been added to your Wish List. Click here to continue shopping.' and added to wishlist ");
        Thread.sleep(10000);
        WebElement slide = driver.findElement(By.xpath("(//span[contains(.,'Add to Wish List')])[1]"));
        slide.click();


    }
    public void Wishlist() throws InterruptedException {
        Thread.sleep(9000);
        lOGGER.info("\"It should display wishlist product with 3 buttons\n" +
                "1.Share Wishlist\n" +
                "2.Remove Selected Items\n" +
                "3.Order Selected Items\"");
        Thread.sleep(9000);
        WebUtils.navigateToURL(APPLICATION_URL+"/guestwishlist");

        WebElement slide = driver.findElement(By.xpath("//div[contains(@class,'actions-toolbar bottom')]"));
       System.out.println("Three buttons "+slide.getText());


}

    public void product_name() throws InterruptedException {
        Thread.sleep(9000);
        lOGGER.info("Application should navigate to pdp page");
        Thread.sleep(9000);

        WebElement slide = driver.findElement(By.xpath("(//a[contains(@class,'product-item-link')])[1]"));
       slide.click();
        WebUtils.navigateToURL(APPLICATION_URL+"/guestwishlist");

    }
    public void Checkbox() throws InterruptedException {
        Thread.sleep(10000);
        lOGGER.info("Checkbox should be checked and unchecked");


        WebElement slide = driver.findElement(By.xpath("//input[contains(@type,'checkbox')]"));
        slide.click();
//        WebUtils.navigateToURL(APPLICATION_URL+"/guestwishlist");

    }
    public void share_wishlist_button() throws InterruptedException {
        Thread.sleep(9000);
        lOGGER.info("It should display a popup");
        Thread.sleep(9000);

        WebElement slide = driver.findElement(By.xpath("(//span[contains(.,'Share Wishlist')])[1]"));
        slide.click();
//        WebUtils.navigateToURL(APPLICATION_URL+"/guestwishlist");

    }
    public void share_wishlist_popup_for_empty_data() throws InterruptedException {
        Thread.sleep(9000);
        lOGGER.info("It should display a popup");
        Thread.sleep(9000);

//        WebElement slide = driver.findElement(By.xpath("(//span[contains(.,'Share Wishlist')])[1]"));
//        slide.click();
//        WebUtils.navigateToURL(APPLICATION_URL+"/guestwishlist");
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        WebElement share = driver.findElement(By.xpath("//span[contains(.,'Share Now')]"));
       share.click();


    }
    public void share_wishlist_popup_for_invalid_data() throws InterruptedException {
        Thread.sleep(9000);
        lOGGER.info("It should display a popup");
        Thread.sleep(9000);
//
//        WebElement slide = driver.findElement(By.xpath("(//span[contains(.,'Share Wishlist')])[1]"));
//        slide.click();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        WebElement to = driver.findElement(By.xpath("//textarea[@name='emails'][contains(@id,'address')]"));
        to.sendKeys("puja2gmail.com");
        WebElement from = driver.findElement(By.xpath("//input[contains(@name,'email')]"));
        from.sendKeys("puja2gmail.com");
        WebElement subjectline = driver.findElement(By.xpath("//input[contains(@name,'subject')]"));
        subjectline.sendKeys("test request");
        WebElement msg = driver.findElement(By.xpath("//textarea[contains(@name,'message')]"));
        msg.sendKeys("testing request from upbott team");
        WebElement share = driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Share Now')]"));
        share.click();

    }
    public void share_wishlist_popup_for_valid_data() throws InterruptedException {
        Thread.sleep(9000);
        lOGGER.info("It should display a popup");
        Thread.sleep(9000);
        String select = Keys.chord(Keys.CONTROL, "a");

        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        WebElement to = driver.findElement(By.xpath("//textarea[@name='emails'][contains(@id,'address')]"));
        to.sendKeys(select);
        to.sendKeys("puja@upbott.com");
        WebElement from = driver.findElement(By.xpath("//input[contains(@name,'email')]"));
        from.sendKeys(select);
        from.sendKeys("puja@upbott.com");
        WebElement subjectline = driver.findElement(By.xpath("//input[contains(@name,'subject')]"));
       // subjectline.sendKeys("test request");
        WebElement msg = driver.findElement(By.xpath("//textarea[contains(@name,'message')]"));
     //   msg.sendKeys("testing request from upbott team");
        WebElement share = driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Share Now')]"));
        share.click();

    }
    public void close() throws InterruptedException {
        Thread.sleep(9000);
        lOGGER.info("It should display a popup");
        Thread.sleep(9000);

        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        WebElement close = driver.findElement(By.xpath("(//button[@class='action-close'][contains(.,'Close')])[1]"));
      close.click();

    }
    public void Remove_selected_item() throws InterruptedException {
        Thread.sleep(9000);
        lOGGER.info("It should remove the products");
        Thread.sleep(9000);

        WebElement slide = driver.findElement(By.xpath("//span[contains(.,'Remove Selected Items')]"));
        slide.click();
//        WebUtils.navigateToURL(APPLICATION_URL+"/guestwishlist");

    }
    public void order_selected_item() throws InterruptedException {
        Thread.sleep(9000);
        lOGGER.info("It should display a popup");
        Thread.sleep(9000);

        WebElement slide = driver.findElement(By.xpath("//span[contains(.,'Order Selected Items')]"));
        slide.click();
//        WebUtils.navigateToURL(APPLICATION_URL+"/guestwishlist");
        Thread.sleep(9000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        WebElement close = driver.findElement(By.xpath("(//button[contains(@class,'action-close')])[2]"));
       close.click();

    }
    public void No_item_present() throws InterruptedException {
        Thread.sleep(9000);
        lOGGER.info("You have no items in your wishlist' message should get displayed");
        Thread.sleep(9000);

        WebElement slide = driver.findElement(By.xpath("//span[contains(.,'You have no items in your wish list.')]"));
      System.out.println(" Actual text is : "+slide.getText());

    }


}
