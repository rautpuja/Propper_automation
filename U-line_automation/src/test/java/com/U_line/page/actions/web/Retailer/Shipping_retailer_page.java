package com.U_line.page.actions.web.Retailer;

import com.U_line.page.actions.web.HomePage;
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
    @FindBy(how = How.XPATH, using="//a[.='Parts & Accessories' and not(@title)]")
    WebElement partandaccessories;

    @FindBy(how = How.XPATH, using="//input[@placeholder='U-1224BEVS-00B']")
    @CacheLookup
    WebElement modelnumber;

    @FindBy(how = How.XPATH, using="//button[@id='el_search']")
    @CacheLookup
    WebElement search;

    @FindBy(how = How.XPATH, using="//input[@product_id='10165']")
    @CacheLookup
    WebElement addtocart;


    @FindBy(how = How.XPATH, using="//span[contains(text(),'View Cart')]")
    @CacheLookup
    WebElement viewcart;

    @FindBy(how = How.XPATH, using="//button[@title='Go to Checkout']")
    @CacheLookup
    WebElement checkout;
    @FindBy(how = How.XPATH, using="//body/div[1]/main[1]/div[2]/div[1]/div[2]/div[3]/ol[1]/li[1]/div[2]/form[1]/fieldset[1]/div[1]/div[1]/input[1]")
    @CacheLookup
    WebElement emailbox;
    @FindBy(how = How.XPATH, using="//input[@name='firstname']")
    @CacheLookup
    WebElement FirstName;
    @FindBy(how = How.XPATH, using="//input[@name='lastname']")
    @CacheLookup
    WebElement LastName;

    @FindBy(how = How.XPATH, using="//input[@name='street[0]']")
    @CacheLookup
    WebElement streetaddress;

    @FindBy(how = How.XPATH, using="//input[@name='company']")
    @CacheLookup
    WebElement Companyname;

    @FindBy(how = How.XPATH, using="//input[@name='city']")
    @CacheLookup
    WebElement City;

    @FindBy(how = How.XPATH, using="//select[@name='region_id']")
    @CacheLookup
    WebElement state;

    @FindBy(how = How.XPATH, using="//input[@name='postcode']")
    @CacheLookup
    WebElement zipcode;

    @FindBy(how = How.XPATH, using="//input[@name='telephone']")
    @CacheLookup
    WebElement phonenumber;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Next')]")
    @CacheLookup
    WebElement Next;

    @FindBy(how = How.XPATH, using="//input[@value='purchaseorder']")
    @CacheLookup
    WebElement MoneyOrder;

    @FindBy(how = How.XPATH, using="//input[@title='Purchase Order Number']")
    @CacheLookup
    WebElement PurcheseOrderNumber;

    @FindBy(how = How.XPATH, using="//body/div[2]/main[1]/div[2]/div[1]/div[2]/div[3]/ol[1]/li[4]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/button[1]")
    @CacheLookup
    WebElement PlaceOrder;

    @FindBy(how = How.XPATH, using = "//body[1]/div[1]/main[1]/div[3]/div[1]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/a[3]")
    @CacheLookup
    WebElement Remove_icon;

    @FindBy(how = How.XPATH, using = "//tbody[1]/tr[1]/td[1]/a[1]/span[1]/span[1]/img[1]")
    @CacheLookup
    WebElement Product_image;

    @FindBy(how = How.XPATH, using = "//span[@xpath='1']")
    @CacheLookup
    WebElement Cross_button;

    @FindBy(how = How.XPATH, using = "//input[@name='cart[28646][qty]']")
    @CacheLookup
    WebElement Qty_box;

    @FindBy(how = How.XPATH, using = "//tbody[1]/tr[1]/td[3]/div[1]/div[1]/button[1]/span[1]")
    @CacheLookup
    WebElement Update_cart;

    @FindBy(how = How.XPATH, using = "//tbody[1]/tr[1]/td[3]/div[1]/div[1]/button[1]/span[1]")
    @CacheLookup
    WebElement Serial_number_box;

    @FindBy(how = How.XPATH, using = "//tbody[1]/tr[2]/td[1]/div[1]/a[1]/span[1]")
    @CacheLookup
    WebElement Save_for_later;

    @FindBy(how = How.XPATH, using = "//body/div[1]/main[1]/div[3]/div[1]/div[2]/form[1]/div[2]/button[2]/span[1]")
    @CacheLookup
    WebElement Update_cart_button;
    @FindBy(how= How.XPATH, using="//span[contains(text(),'Go to Checkout')]")
    @CacheLookup
    WebElement Checkout_button;


    @FindBy(how = How.XPATH, using = " //input[@id='warranty-check-28634-2']")
    @CacheLookup
    WebElement Serial_number_box2;



    public Shipping_retailer_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


    public void openpartsandaccessories() {
        //info("Opening Part and accessories page ..........");
        partandaccessories.click();
        driver.getTitle();
    }




    public void modelnumber() {
        modelnumber.sendKeys("U-1024BEVS-00B");

    }


    public void search() {
        search.click();
        // TODO Auto-generated method stub

    }


    public void addtocart() throws InterruptedException {
        Thread.sleep(5000);
        //WebDriverWait wait2 = new WebDriverWait(driver, 10);
        //wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkmo']")));
        WebElement element = driver.findElement(By.xpath("//input[@product_id='10165']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
        //addtocart.click();


    }


    public void viewcart() throws InterruptedException {
        Thread.sleep(8000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(4000);
        viewcart.click();


    }

    public void checkout() throws InterruptedException {
        Thread.sleep(4000);

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
        Remove_icon.click();
    }

    public void Product_image_link() throws InterruptedException {
        Thread.sleep(4000);
        lOGGER.info("Product name/Product image should navigate to parts search page.");
        Product_image.click();
        Thread.sleep(7000);
        driver.navigate().back();
    }

    public void Sku_number() throws InterruptedException {
        Thread.sleep(4000);
        lOGGER.info("Sku number should present below the product name.");
        WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'SKU:80-54221-00')]"));
        ele.getText();

    }

    public void Qty_box() throws InterruptedException {
        Thread.sleep(4000);
        lOGGER.info("Qty box should allow to manually input the field.");
        String select = Keys.chord(Keys.CONTROL, "a");

        Qty_box.sendKeys(select);
        Qty_box.sendKeys("2");
    }

    public void Update_cart_link() throws InterruptedException {
        Thread.sleep(10000);
        lOGGER.info("It should display the updated cart ex: Qty should change according to selected input");
        Update_cart.click();

    }


    public void Update_cart_button() throws InterruptedException {
        Thread.sleep(10000);
        lOGGER.info("It should display the updated cart result.");
        Update_cart_button.click();

    }

    public void Checkout_button() throws InterruptedException {
        Thread.sleep(10000);
        lOGGER.info("Application should redirect to the checkout page");
        Checkout_button.click();
    }

    public void Cross_button() throws InterruptedException {
        Thread.sleep(10000);
        lOGGER.info("It should be remove the serial number");
        Cross_button.click();
    }

}
