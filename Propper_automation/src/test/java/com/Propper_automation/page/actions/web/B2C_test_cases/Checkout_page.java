package com.Propper_automation.page.actions.web.B2C_test_cases;

import com.Propper_automation.utils.common.Config;
import com.Propper_automation.utils.selenium.WebUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Checkout_page {

    private static final Logger logger = LoggerFactory.getLogger(Checkout_page.class);
    private static final String APPLICATION_URL = Config.getProperty("appURL");

    private WebDriver driver;




    public Checkout_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


    public void B2C_login() throws InterruptedException {
        logger.info("Login as a user");
        WebElement popup= driver.findElement(By.xpath("//a[contains(@title,'no thanks')]"));
        WebDriverWait w = new WebDriverWait(driver,3);

        w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//a[contains(@title,'no thanks')]")));
        popup.click();
    }

    public void My_account() throws InterruptedException {

      Thread.sleep(10000);
      Actions ac=new Actions(driver);
        WebElement ele= driver.findElement(By.xpath("(//a[contains(.,'My Account')])[1]"));
       ac.moveToElement(ele).click().build().perform();
       WebUtils.retryingClick(ele);
    }

    public void setemail(String email)
    {
        WebUtils.sleep(5);
       WebElement  txtemail =  driver.findElement(By.xpath("//input[contains(@name,'login[username]')]"));
       txtemail.sendKeys(email);
    }

    public void setPassword(String pwd)
    {
        WebUtils.sleep(5);
        WebElement  txtPassword =  driver.findElement(By.xpath("//input[contains(@name,'login[password]')]"));
        txtPassword.sendKeys(pwd);
    }


    public void clickSubmit()
    {
        WebUtils.sleep(5);
        WebElement  btnLogin =  driver.findElement(By.xpath("(//span[contains(.,'Sign In')])[1]"));
        btnLogin.click();
    }
    public void PDP_page() throws InterruptedException {
        logger.info("Checkout page should get access only after adding product into the cart");
        Thread.sleep(20000);

        Actions ac = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("//a[@id='ui-id-4']"));
        ac.moveToElement(ele).build().perform();
        Thread.sleep(10000);
        WebElement ele2 = driver.findElement(By.xpath("(//span[contains(.,'Pants')])[1]"));
        ele2.click();
        Thread.sleep(10000);
        System.out.println("Title of the page is : "+driver.getTitle());
        System.out.println("Title of the page is : "+driver.getCurrentUrl());
        WebElement ele3 = driver.findElement(By.xpath("(//a[contains(@class,'product-item-link')])[3]"));
        ele3.click();
        Thread.sleep(5000);
        System.out.println("Title of the page is : "+driver.getTitle());
        System.out.println("Title of the page is : "+driver.getCurrentUrl());

    }
    public void dropdown() throws InterruptedException {

        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement slide = driver.findElement(By.xpath("//div[contains(@option-label,'Black')]"));
     slide.click();
        Thread.sleep(5000);
        WebElement mains_waist = driver.findElement(By.xpath("//select[contains(@class,'swatch-select waist')]"));
       WebUtils.selectDropDownByValue(mains_waist , "1655");
       WebUtils.getSelectedValueInDropDown(mains_waist);
        Thread.sleep(5000);
        WebElement inseam = driver.findElement(By.xpath("//select[contains(@class,'swatch-select inseam')]"));
        WebUtils.selectDropDownByValue(inseam , "1683");
        WebUtils.getSelectedValueInDropDown(inseam);
        Thread.sleep(5000);
        WebElement add_to_cart = driver.findElement(By.xpath("//span[contains(.,'Add to Cart')]"));
        add_to_cart.click();
        WebUtils.getCurrentURL();
    }

    public void Checkout() throws InterruptedException {
        logger.info("click on checkout");
        Thread.sleep(10000);
        WebElement order_summery= driver.findElement(By.xpath("//div[contains(@id,'cart-totals')]"));
        System.out.println("Order summery on cart page : "+order_summery.getText());
        Thread.sleep(5000);
        WebElement Checkout = driver.findElement(By.xpath("//button[contains(@data-role,'proceed-to-checkout')]"));
      Checkout.click();



    }
    public void New_address_button() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("The popup should open with heading shipping address");
        WebElement New_address = driver.findElement(By.xpath("//span[contains(.,'New Address')]"));
        New_address.click();

   }

    public void New_address_blank() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Error message should display.");
       WebUtils.SwitchTowindopopup();
       WebElement ship_here = driver.findElement(By.xpath("//span[contains(.,'Ship here')]"));
        ship_here.click();
        Thread.sleep(5000);
        String expected_msg ="This is a required field.";
        String actual_msg=driver.findElement(By.xpath("(//span[@data-bind='text: element.error'][contains(.,'This is a required field.')])[1]")).getText();
        Assert.assertEquals(actual_msg, expected_msg);
    }
    public void New_address_invalid() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Error message should get displayed");

        String select = Keys.chord(Keys.CONTROL, "a");
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(5000);
        WebElement first_name = driver.findElement(By.xpath("//input[contains(@name,'firstname')]"));
        first_name.sendKeys(select);
        first_name.sendKeys("dsr$566");
        WebElement last_name = driver.findElement(By.xpath("//input[contains(@name,'lastname')]"));
        last_name.sendKeys(select);
        last_name.sendKeys("hg67778hg$%");
        WebElement company = driver.findElement(By.xpath("//input[contains(@name,'company')]"));
        company.sendKeys(select);
        company.sendKeys("Upbott");
        WebElement street_address = driver.findElement(By.xpath("//input[contains(@name,'street[0]')]"));
        street_address.sendKeys(select);
        street_address.sendKeys("test 123");
        WebElement city = driver.findElement(By.xpath("//input[contains(@name,'city')]"));
        city.sendKeys(select);
        city.sendKeys("missouri");
        WebElement state = driver.findElement(By.xpath("//select[contains(@name,'region_id')]"));
        WebUtils.selectDropDownByValue(state , "36");
        WebElement zip = driver.findElement(By.xpath("//input[contains(@name,'postcode')]"));
        zip.sendKeys(select);
        zip.sendKeys("786");
        WebElement p_name = driver.findElement(By.xpath("//input[contains(@name,'telephone')]"));
        p_name.sendKeys(select);
        p_name.sendKeys("8789876567");

    }
    public void New_address_valid() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Information should dispaly in section in front and that section should display as a selected with 'edit' button");

        String select = Keys.chord(Keys.CONTROL, "a");
        WebUtils.SwitchTowindopopup();
        WebElement first_name = driver.findElement(By.xpath("//input[contains(@name,'firstname')]"));
        first_name.sendKeys(select);
        first_name.sendKeys("Puja");
        WebElement last_name = driver.findElement(By.xpath("//input[contains(@name,'lastname')]"));
        last_name.sendKeys(select);
        last_name.sendKeys("Domke");
        WebElement company = driver.findElement(By.xpath("//input[contains(@name,'company')]"));
        company.sendKeys(select);
        company.sendKeys("Upbott");
        WebElement street_address = driver.findElement(By.xpath("//input[contains(@name,'street[0]')]"));
        street_address.sendKeys(select);
        street_address.sendKeys("test 123");
        WebElement city = driver.findElement(By.xpath("//input[contains(@name,'city')]"));
        city.sendKeys(select);
        city.sendKeys("missouri");
        WebElement state = driver.findElement(By.xpath("//select[contains(@name,'region_id')]"));
        WebUtils.selectDropDownByValue(state , "36");
        WebElement zip = driver.findElement(By.xpath("//input[contains(@name,'postcode')]"));
        zip.sendKeys(select);
        zip.sendKeys("63011");
        WebElement p_name = driver.findElement(By.xpath("//input[contains(@name,'telephone')]"));
        p_name.sendKeys(select);
        p_name.sendKeys("8789876567");
        WebElement ship_here = driver.findElement(By.xpath("//span[contains(.,'Ship here')]"));
        ship_here.click();

    }
    public void New_address_Cancel() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("The popup should be closed");

        String select = Keys.chord(Keys.CONTROL, "a");
        WebUtils.SwitchTowindopopup();
        WebElement close = driver.findElement(By.xpath("(//span[contains(.,'Cancel')])[1]"));
        close.click();
    }
    public void New_address_Close() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("The popup should be closed");

        String select = Keys.chord(Keys.CONTROL, "a");
        WebUtils.SwitchTowindopopup();
        WebElement close = driver.findElement(By.xpath("(//button[contains(.,'Close')])[4]"));
        close.click();
    }
    public void order_summery() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("\"It should display the correct order sumary with below details: \n" +
                "product image,product name,product price,quantity\"");

        WebUtils.SwitchTowindopopup();
        WebElement close = driver.findElement(By.xpath("//div[contains(@class,'opc-block-summary')]"));
       System.out.println("Order Summery : "+close.getText());
    }
    public void shipping_method() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Shipping Method should be already selected using radio button");

        WebElement close = driver.findElement(By.xpath("(//input[contains(@type,'radio')])[1]"));
        close.click();
    }
    public void Next_button() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Shipping Method should be already selected using radio button");

        WebElement close = driver.findElement(By.xpath("//button[contains(.,'Next')]"));
        close.click();
    }

    public void Checkbox() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("\"It should be by default check and able to check and uncheck.\n" +
                "The dropdown should appear when unchecked with 'cancel' & 'update' button.\n" +
                "The 'Place Order' button should be disabled when the checkbox is unchecked\"");

        WebElement close = driver.findElement(By.xpath("//input[@name='billing-address-same-as-shipping']"));
        close.click();
        close.click();
    }

    public void Checkbox_dropdown() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("The address you added earlier should appear in this dropdown with one extra option New Address. All the options in that dropdown should be selectable ");

        WebElement close = driver.findElement(By.xpath("//select[contains(@name,'billing_address_id')]"));
       WebUtils.selectDropDownByVisibleText(close, "New Address");
       WebUtils.getSelectedValueInDropDown(close);
    }
    public void Payment_new_address_blank() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Error message should display.");


        Actions ac=new Actions(driver);
        WebElement update = driver.findElement(By.xpath("//span[contains(.,'Update Address')]"));
        ac.moveToElement(update).click().build().perform();

    }
    public void Payment_new_address_invalid() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Error message should display.");


        Actions ac=new Actions(driver);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebUtils.SwitchTowindopopup();
        WebElement first_name = driver.findElement(By.xpath("(//input[@class='input-text'])[11]"));
        first_name.sendKeys(select);
        first_name.sendKeys("54%^vv");
        WebElement last_name = driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[14]"));
        last_name.sendKeys(select);
        last_name.sendKeys("%^788ghhh");
        WebElement company = driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[15]"));
        company.sendKeys(select);
        company.sendKeys("Upbott");
        WebElement street_address = driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[16]"));
        street_address.sendKeys(select);
        street_address.sendKeys("test");
        WebElement city = driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[18]"));
        city.sendKeys(select);
        city.sendKeys("missouri");
        WebElement state = driver.findElement(By.xpath("(//select[contains(@class,'select')])[4]"));
        WebUtils.selectDropDownByValue(state , "36");
        WebElement zip = driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[20]"));
        zip.sendKeys(select);
        zip.sendKeys("gu898");
        WebElement p_name = driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[21]"));
        p_name.sendKeys(select);
        p_name.sendKeys("76567");

      //  WebElement update = driver.findElement(By.xpath("//span[contains(.,'Update Address')]"));
       // ac.moveToElement(update).click().build().perform();

    }
    public void Payment_new_address_valid() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Information should dispaly in section in front and that section should display with 'edit' button");


        Actions ac=new Actions(driver);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebUtils.SwitchTowindopopup();
        WebElement first_name = driver.findElement(By.xpath("(//input[@class='input-text'])[11]"));
        first_name.sendKeys(select);
        first_name.sendKeys("Puja");
        WebElement last_name = driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[14]"));
        last_name.sendKeys(select);
        last_name.sendKeys("Domke");
        WebElement company = driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[15]"));
        company.sendKeys(select);
        company.sendKeys("Upbott");
        WebElement street_address = driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[16]"));
        street_address.sendKeys(select);
        street_address.sendKeys("test 456");
        WebElement city = driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[18]"));
        city.sendKeys(select);
        city.sendKeys("missouri");
        WebElement state = driver.findElement(By.xpath("(//select[contains(@class,'select')])[4]"));
        WebUtils.selectDropDownByValue(state , "36");
        WebElement zip = driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[20]"));
        zip.sendKeys(select);
        zip.sendKeys("63011");
        WebElement p_name = driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[21]"));
        p_name.sendKeys(select);
        p_name.sendKeys("9876787656");

        WebElement update = driver.findElement(By.xpath("//span[contains(.,'Update Address')]"));
        ac.moveToElement(update).click().build().perform();

    }
    public void Promo_code_blank() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Error_message_should_get dispalyed");


        Actions ac=new Actions(driver);
        WebElement update = driver.findElement(By.xpath("//span[@class='action action-toggle'][contains(.,'Apply Discount Code')]"));
       update.click();
        WebElement text = driver.findElement(By.xpath("//input[contains(@name,'discount_code')]"));
        WebUtils.sleep(6);
        WebElement apply_discount = driver.findElement(By.xpath("(//span[contains(.,'Apply Discount')])[4]"));
        apply_discount.click();

    }
    public void Promo_code_invalid() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It shows Error message \"You enter Invalid coupn code\".");


        Actions ac=new Actions(driver);
//        WebElement update = driver.findElement(By.xpath("//span[@class='action action-toggle'][contains(.,'Apply Discount Code')]"));
//        update.click();
        WebElement text = driver.findElement(By.xpath("//input[contains(@name,'discount_code')]"));
        text.sendKeys("invalid");
        WebUtils.sleep(6);
        WebElement apply_discount = driver.findElement(By.xpath("(//span[contains(.,'Apply Discount')])[4]"));
        apply_discount.click();
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        WebUtils.sleep(6);
        WebElement msg = driver.findElement(By.xpath("//div[contains(@data-bind,'text: $data')]"));
        System.out.println("message is : "+msg.getText());
    }
    public void Promo_code_valid() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("discount price should be substract from subtotal price");

        String select = Keys.chord(Keys.CONTROL, "a");
        Actions ac=new Actions(driver);
//
//        update.click();
        WebElement text = driver.findElement(By.xpath("//input[contains(@name,'discount_code')]"));
        text.sendKeys(select);
        text.sendKeys("TESTA");
        WebUtils.sleep(6);
        WebElement apply_discount = driver.findElement(By.xpath("(//span[contains(.,'Apply Discount')])[4]"));
        apply_discount.click();

    }
    public void Ship_to() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("discount price should be substract from subtotal price");


        Actions ac=new Actions(driver);
        WebElement update = driver.findElement(By.xpath("//button[@data-bind='click: back']"));
      ac.moveToElement(update).click().build().perform();
        WebUtils.sleep(30);
        WebElement next = driver.findElement(By.xpath("//span[contains(.,'Next')]"));
        next.click();



    }
    public void shipping_method_() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("discount price should be substract from subtotal price");
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        WebElement method = driver.findElement(By.xpath("(//span[@class='value'][contains(.,'Shipping Method - FedEx SmartPost')])[2]"));
        System.out.println("Shipping method is : "+method.getText());
        Actions ac=new Actions(driver);
        WebElement update = driver.findElement(By.xpath("//button[contains(@data-bind,'click: backToShippingMethod')]"));
     ac.moveToElement(update).click().build().perform();
        WebUtils.sleep(30);
        WebElement radio = driver.findElement(By.xpath("(//input[contains(@type,'radio')])[2]"));
        radio.click();
        WebUtils.sleep(10);
        WebElement next = driver.findElement(By.xpath("//span[contains(.,'Next')]"));
        next.click();
        JavascriptExecutor js2 = (JavascriptExecutor) driver;

        js2.executeScript("window.scrollBy(0,1000)");
        WebUtils.sleep(30);
        WebElement method2 = driver.findElement(By.xpath("(//span[contains(@class,'value')])[4]"));
        System.out.println("Shipping method is : "+method2.getText());


    }
}