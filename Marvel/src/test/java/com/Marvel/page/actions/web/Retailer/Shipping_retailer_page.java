package com.Marvel.page.actions.web.Retailer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class Shipping_retailer_page {
    private static final Logger lOGGER = LoggerFactory.getLogger(Shipping_retailer_page.class);

    private WebDriver driver;







    public Shipping_retailer_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    public void Parts_and_accessories() throws InterruptedException {
        lOGGER.info("It should be redirect to part & accessories page\n");
        Thread.sleep(10000);
        WebElement source= driver.findElement(By.xpath("//span[contains(text(),'Support & Resources')]"));
        WebElement target= driver.findElement(By.xpath("//a[.='Parts & Accessories ' and not(@title)]"));
        Actions action = new Actions(driver);
//moving to the main menu and then sub menu and clicking on it using object of the Actions class
        action.moveToElement(source).moveToElement(target).click().build().perform();
    }




    public void viewcart() throws InterruptedException {
        lOGGER.info(" \"It should be redirect to shopping cart page\n" +
                "\"\n ");
        Thread.sleep(10000);
        WebElement ele2= driver.findElement(By.xpath("//input[@id='serial']"));
        ele2.click();
        String select = Keys.chord(Keys.CONTROL, "a");

        ele2.sendKeys(select);


        ele2.sendKeys("42248725-ACCY");
        ele2.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        WebElement ele= driver.findElement(By.xpath("//input[@name='btn_add_to_cart']"));
        ele.click();
        Thread.sleep(5000);

        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        WebElement ele4= driver.findElement(By.xpath("//span[contains(text(),'View Cart')]"));
        ele4.click();

    }


    public void checkout() throws InterruptedException {
        Thread.sleep(10000);

        //WebDriverWait wait2 = new WebDriverWait(driver, 10);
        //wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkmo']")));
        WebElement element = driver.findElement(By.xpath("//button[@title='Go to Checkout']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
        //checkout.click();

    }
    public void Cross_icon() throws InterruptedException {
        Thread.sleep(4000);
        lOGGER.info("Application should remove specific product from cart.");
        WebElement ele=driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[1]/a[2]"));
        ele.click();
    }

    public void Product_image_link() throws InterruptedException {
        Thread.sleep(4000);
        lOGGER.info("Product name/Product image should navigate to parts search page.");
        WebElement ele= driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/span[1]/span[1]/img[1]"));
        ele.click();
        Thread.sleep(7000);
        driver.navigate().back();
    }

    public void Sku_number() throws InterruptedException {
        Thread.sleep(10000);
        lOGGER.info("Sku number should present below the product name.");
        WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'SKU: 42248725-ACCY')]"));
        ele.getText();

    }

    public void Qty_box() throws InterruptedException {
        Thread.sleep(10000);
        lOGGER.info("Qty box should allow to manually input the field.");
        String select = Keys.chord(Keys.CONTROL, "a");
WebElement Qty_box=driver.findElement(By.xpath("//input[@class='input-text qty']"));
        Qty_box.sendKeys(select);
        Qty_box.sendKeys("2");
    }

    public void Update_cart_link() throws InterruptedException {
        Thread.sleep(10000);
        lOGGER.info("It should display the updated cart ex: Qty should change according to selected input");
       WebElement Update_cart= driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/div[1]/button[1]/span[1]"));

        Update_cart.click();

    }


    public void Update_cart_button() throws InterruptedException {
        Thread.sleep(10000);
        lOGGER.info("It should display the updated cart result.");
        WebElement ele=driver.findElement(By.xpath("//button[@class='action update']"));
        ele.click();

    }

    public void Checkout_button() throws InterruptedException {
        Thread.sleep(10000);
        lOGGER.info("Application should redirect to the checkout page");
        WebElement element = driver.findElement(By.xpath("//button[@data-role='proceed-to-checkout']"));


        element.click();
    }

    public void Cross_button() throws InterruptedException {
        Thread.sleep(10000);
        lOGGER.info("It should be remove the serial number");
      WebElement ele= driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[1]/a[2]"));
      ele.click();
    }
    public void Apply_discount() throws InterruptedException {
        Thread.sleep(10000);
        lOGGER.info("It should be remove the serial number");
        WebElement ele= driver.findElement(By.xpath("//input[@id='coupon_code']"));
        ele.click();
        WebElement ele2= driver.findElement(By.xpath("//input[@id='coupon_code']"));
        ele2.sendKeys("");
        WebElement ele1= driver.findElement(By.xpath("//button[@class='action apply primary']"));
        ele1.click();
    }


    public void Edit_button() throws InterruptedException {
        Thread.sleep(10000);
        lOGGER.info("It should be remove the serial number");
        WebElement ele= driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[1]/a[1]"));
        ele.click();
        Thread.sleep(10000);
        WebElement ele1=driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]/span[2]"));
        ele1.click();
        Thread.sleep(3000);
        WebElement ele3= driver.findElement(By.xpath("//a[@class='action viewcart']"));
        ele3.click();
        Thread.sleep(10000);


    }

    public void Apply_discount_invalid() throws InterruptedException {
        Thread.sleep(4000);
        lOGGER.info("Product name/Product image should navigate to parts search page.");
        WebElement ele= driver.findElement(By.xpath("//input[@id='coupon_code']"));
        ele.sendKeys("test");
        WebElement ele1= driver.findElement(By.xpath("//span[contains(text(),'Apply Discount')]"));
        ele1.click();
      //  Thread.sleep(7000);
      //  driver.navigate().back();
    }
    public void Apply_discount_valid() throws InterruptedException {
        Thread.sleep(4000);
        lOGGER.info("Product name/Product image should navigate to parts search page.");
        WebElement ele= driver.findElement(By.xpath("//input[@id='coupon_code']"));
        String select = Keys.chord(Keys.CONTROL, "a");
        ele.sendKeys(select);
        ele.sendKeys("test");
        WebElement ele1= driver.findElement(By.xpath("//span[contains(text(),'Apply Discount')]"));
        ele1.click();
        //  Thread.sleep(7000);
        //  driver.navigate().back();
    }

    public void Summary() throws InterruptedException {
        Thread.sleep(4000);
        lOGGER.info("Product name/Product image should navigate to parts search page.");
        WebElement ele= driver.findElement(By.xpath("//div[@aria-controls='block-summary']"));

        ele.click();
        //  Thread.sleep(7000);
        //  driver.navigate().back();
    }
}
