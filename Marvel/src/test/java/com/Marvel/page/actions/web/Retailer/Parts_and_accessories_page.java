package com.Marvel.page.actions.web.Retailer;

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








    @FindBy(how = How.XPATH, using="//body/div[2]/main[1]/div[2]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]/input[1]")
    @CacheLookup
    WebElement SearchTextBox;

    public Parts_and_accessories_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void Parts_and_accessories() {
        logger.info("It should be redirect to part & accessories page\n");
 WebElement source= driver.findElement(By.xpath("//span[contains(text(),'Support & Resources')]"));
 WebElement target= driver.findElement(By.xpath("//a[.='Parts & Accessories ' and not(@title)]"));
        Actions action = new Actions(driver);
//moving to the main menu and then sub menu and clicking on it using object of the Actions class
        action.moveToElement(source).moveToElement(target).click().build().perform();
    }
    public void Breadcrumb() throws InterruptedException {
        logger.info("\"It should display the breadcrumb properly with\n" +
                "HOME >  MARVEL PURCHASE PARTS & ACCESSORIES\n" +
                "Click on breadcrumb it should redirect to respective page\"\n");
        Thread.sleep(8000);
        WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
       System.out.println(ele.getText());
    }
    public void Part_search_by() throws InterruptedException {
        logger.info("" +
                "It should be clickable and the background color should be black after clicking\n");
        Thread.sleep(20000);
        WebElement ele = driver.findElement(By.xpath("//label[@for='model-number'][contains(.,'Service Model Number')]"));
        ele.click();
        Thread.sleep(5000);
        WebElement ele2 = driver.findElement(By.xpath("//label[@for='serial-number'][contains(.,'Serial Number')]"));
        ele2.click();
        Thread.sleep(5000);
        WebElement ele3 = driver.findElement(By.xpath("//label[@for='part-number'][contains(.,'Part Number')]"));
        ele3.click();
    }
    public void Part_search_partNumber() throws InterruptedException {
        logger.info("Click on Serial Number It should be clickable and the background color should be black after clicking");
        Thread.sleep(10000);

        WebElement ele3= driver.findElement(By.xpath("//input[@id='serial']"));
        ele3.sendKeys(Keys.ENTER);
    }


    public void partNumber() throws InterruptedException {
        logger.info("\"It should be give autoload and similar Service Model Number or Serial Number or Part Number\n" +
                "Search Result should display with correct result on same page below the part & accessories banner\"\n");
        Thread.sleep(6000);
        WebElement ele2= driver.findElement(By.xpath("//input[@id='serial']"));
        ele2.click();
        String select = Keys.chord(Keys.CONTROL, "a");

        ele2.sendKeys(select);


        ele2.sendKeys("42242833-ACCY");
        ele2.sendKeys(Keys.ENTER);
    }
    public void Wrong_SerialNumber() throws InterruptedException {
        logger.info("Error mesage should display 'Invalid Entry. The part you are looking for may be discontinued. Please see our Discontinued " +
                "Parts Cross Reference Guide. Still Don’t see what you’re looking for? Contact us.'");
        Thread.sleep(10000);
        WebElement ele2= driver.findElement(By.xpath("//input[@id='serial']"));
        ele2.click();
        String select = Keys.chord(Keys.CONTROL, "a");

        ele2.sendKeys(select);


        ele2.sendKeys("1957171");
        ele2.sendKeys(Keys.ENTER);

    }
    public void Help() throws InterruptedException {
        logger.info("It should display a popup image\n");
        Thread.sleep(10000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,-1000)");
        Actions ac=new Actions(driver);
       WebElement ele= driver.findElement(By.xpath("//span[contains(text(),'Need Help ?')]"));
      ac.moveToElement(ele).click().build().perform();
    }
    public void Shipping_detail() throws InterruptedException {
        logger.info("It should be properly with heading 'SHIPPING DETAILS'\n");
        Thread.sleep(50000);
        WebElement alllinks = driver.findElement(By.xpath("//div[contains(@class,'parts-content')]"));


        List<WebElement> Links = alllinks.findElements(By.tagName("a"));
        int Count     = Links.size();
        System.out.println("Name: " +Count);
        for(int i=0;i<Links.size();i++)
        {
            String Opentabs=Keys.chord(Keys.CONTROL,Keys.ENTER);

            Links.get(i).sendKeys(Opentabs);
            //  System.out.println(driver.getTitle());

        }
    }

    public void add_to_cart_button() throws InterruptedException {
        logger.info("It should give the pop up as \"Added to Cart\" and display 'View Cart' button and 'Continue Shopping' button");
        Thread.sleep(10000);
        WebElement ele = driver.findElement(By.xpath("//input[contains(@name,'btn_add_to_cart')]"));
        ele.click();
        Thread.sleep(10000);

        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        WebElement text= driver.findElement(By.xpath("//footer[@class='modal-footer']"));
        System.out.println("Pop up message is:" +text.getText());
    }
    public void serial_number_blank() throws InterruptedException {
        logger.info("Error mesage should display 'This is required field' and It should be clickable ");
        Thread.sleep(10000);
        WebElement ele = driver.findElement(By.xpath("//label[@for='serial-number']"));
        ele.click();
        Thread.sleep(10000);
        WebElement ele1 = driver.findElement(By.xpath("//input[@placeholder='2019102805H']"));
        ele1.sendKeys(Keys.ENTER);
        Thread.sleep(10000);
        WebElement ele2 = driver.findElement(By.xpath("//div[@for='serial'][contains(.,'This is a required field.')]"));
        System.out.println(" message is " + ele2.getText());
    }
    public void Part_number_blank() throws InterruptedException {
        logger.info("By default, parts search is open after login");
        Thread.sleep(3000);
        WebElement ele3 = driver.findElement(By.xpath("//label[@for='part-number'][contains(.,'Part Number')]"));
        ele3.click();
        Thread.sleep(10000);
        WebElement ele1 = driver.findElement(By.xpath("//input[contains(@name,'serial')]"));
        ele1.sendKeys(Keys.ENTER);
        Thread.sleep(10000);
        WebElement ele2 = driver.findElement(By.xpath("//div[@for='serial'][contains(.,'This is a required field.')]"));
        System.out.println(" message is " + ele2.getText());
    }

    public void Part_number_invalid() throws InterruptedException {
        logger.info("By default, parts search is open after login");
        Thread.sleep(10000);
//        WebElement ele= driver.findElement(By.xpath("//label[@for='model-number'][contains(.,'Service Model Number')]"));
//        ele.click();
//        Thread.sleep(10000);
        WebElement ele1 = driver.findElement(By.xpath("//input[contains(@name,'serial')]"));
        ele1.sendKeys("576778");
        ele1.sendKeys(Keys.ENTER);
        Thread.sleep(10000);
        WebElement ele2 = driver.findElement(By.xpath("//td[contains(@colspan,'6')]"));
        System.out.println(" message is " + ele2.getText());
    }

    public void Part_number_valid() throws InterruptedException {
        logger.info("\"It should be give autoload and similar Service Model Number or Serial Number or Part Number\n" +
                "Search Result should display with correct result on same page below the parts search banner\n" +
                "For Service Model Number and Serial Number , it should display two buttons 'Service Parts List' and 'Download' below the parts search banner\"");
        Thread.sleep(10000);
//        WebElement ele= driver.findElement(By.xpath("//label[@for='model-number'][contains(.,'Service Model Number')]"));
//        ele.click();
//        Thread.sleep(10000);
        WebElement ele1 = driver.findElement(By.xpath("//input[contains(@name,'serial')]"));
        String select = Keys.chord(Keys.CONTROL, "a");
        ele1.sendKeys(select);
        ele1.sendKeys("42242833-ACCY");
        ele1.sendKeys(Keys.ENTER);
        Thread.sleep(10000);
//        WebElement ele2= driver.findElement(By.xpath("//strong[contains(.,'ML24BNS2LB1')]"));
//        System.out.println(" ML24BNS2LB1=  "+ele2.getText());
    }





    public void add_to_cart_continueshopping() throws InterruptedException {
        logger.info("It should remain on the same page");
        Thread.sleep(10000);

        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);


        WebElement cancel = driver.findElement(By.xpath("//span[contains(.,'Continue Shopping')]"));
        cancel.click();
    }
    public void add_to_cart_view_cart() throws InterruptedException {
        logger.info("\"It should be redirect to shopping cart page\n" +
                "\"");
        Thread.sleep(30000);
        WebElement ele = driver.findElement(By.xpath("//input[contains(@type,'button')]"));
        ele.click();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);


        Thread.sleep(10000);
        WebElement cancel = driver.findElement(By.xpath("//span[contains(.,'View Cart')]"));
        cancel.click();
    }
    public void Search_textbox() throws InterruptedException {
        logger.info("It should search for Part Number,Description and Price and give respective result");
        Thread.sleep(10000);
        WebElement ele = driver.findElement(By.xpath("//input[contains(@placeholder,'Search...')]"));
        ele.sendKeys("42248156");

    }
    public void SearchBox() throws InterruptedException {
        logger.info(" It should search for Part Number,Description and Price and give respective result\n");
        Thread.sleep(10000);
        SearchTextBox.sendKeys("42248725-ACCY");
        Thread.sleep(3000);
        String select = Keys.chord(Keys.CONTROL, "a");
        SearchTextBox.clear();
        Thread.sleep(3000);
        SearchTextBox.sendKeys(Keys.ENTER);

    }

    public void Image() throws InterruptedException {
        logger.info(" It should display a image popup with (X)cross & close button\n");
        Thread.sleep(10000);

        WebElement ele= driver.findElement(By.xpath("(//img[@class='image'])[1]"));
       ele.click();
    }

    public void Close() throws InterruptedException {
        logger.info(" It should be close the popup\n");
        Thread.sleep(10000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
       WebElement ele= driver.findElement(By.xpath("//body/div[4]/aside[3]/div[2]/footer[1]/button[1]/span[1]"));
       ele.click();
    }

    public void Part_number() throws InterruptedException {
        logger.info(" It should redirect to PDP page\n");
        Thread.sleep(10000);

       WebElement ele=driver.findElement(By.xpath("//a[contains(text(),'42242580')]"));
       ele.click();

    }


}
