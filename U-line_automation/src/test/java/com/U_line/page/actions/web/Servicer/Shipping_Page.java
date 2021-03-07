package com.U_line.page.actions.web.Servicer;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class Shipping_Page {
    private static final Logger logger = LoggerFactory.getLogger(Servicer_Homepage_Page.class);
    private static final String APPLICATION_URL = Config.getProperty("appURL");
    private WebDriver driver;
    @FindBy(how = How.XPATH, using="//a[.='Provider Login' and not(@title)]")
    @CacheLookup
    WebElement providerlogin;

    @FindBy(how = How.XPATH, using="//input[@id='email']")
    @CacheLookup
    WebElement txtemail;



    @FindBy(xpath="//input[@id='pass']")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(name="send")
    @CacheLookup
    WebElement btnLogin;

    @FindBy(how = How.XPATH, using = "//body[1]/div[1]/main[1]/div[3]/div[1]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/a[3]")
    @CacheLookup
    WebElement Remove_icon;

    @FindBy(how = How.XPATH, using = "//tbody[1]/tr[1]/td[1]/a[1]/span[1]/span[1]/img[1]")
    @CacheLookup
    WebElement Product_image;

    @FindBy(how = How.XPATH, using = "//tbody/tr[1]/td[5]/div[3]/div[1]/span[1]")
    @CacheLookup
    WebElement Cross_button;

    @FindBy(how = How.XPATH, using = "//input[@id='cart-28639-qty']")
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

    public Shipping_Page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    public void providerlogin() throws InterruptedException {
        logger.info("provider login");
        Thread.sleep(10000);
        providerlogin.click();
    }

    public void setemail(String email) throws InterruptedException { Thread.sleep(3000);
        txtemail.sendKeys(email);
    }

    public void setPassword(String pwd) throws InterruptedException { Thread.sleep(3000);
        txtPassword.sendKeys(pwd);
    }


    public void clickSubmit() throws InterruptedException { Thread.sleep(8000);
        btnLogin.click();
    }


    public void Shipping_Page() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Application should display Product image clear & distinct.");
        Thread.sleep(8000);
        WebElement ele= driver.findElement(By.xpath("//label[contains(text(),'Serial Number')]"));
        ele.click();
        WebElement ele2= driver.findElement(By.xpath("//input[@id='serial']"));

        ele2.sendKeys("1957171060030");

        ele2.sendKeys(Keys.ENTER);

            Thread.sleep(10000);
            //WebDriverWait wait2 = new WebDriverWait(driver, 10);
            //wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkmo']")));
            WebElement element = driver.findElement(By.xpath("(//input[contains(@type,'button')])[1]"));
            Actions actions = new Actions(driver);
            actions.moveToElement(element).click().build().perform();
        Thread.sleep(10000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(4000);
        WebElement view= driver.findElement(By.xpath("//span[contains(.,'Continue Shopping')]"));
        view.click();
        Thread.sleep(9000);
        WebElement element1 = driver.findElement(By.xpath("(//input[contains(@type,'button')])[2]"));
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(element1).click().build().perform();




        WebUtils.navigateToURL(APPLICATION_URL+"checkout/cart/");
    }




    public void Cross_icon() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Application should remove specific product from cart.");
       WebElement ele= driver.findElement(By.xpath("(//a[@class='action action-delete'])[1]"));
       ele.click();
    }

    public void Product_image_link() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Product name/Product image should navigate to parts search page.");
        Product_image.click();
        Thread.sleep(7000);
        WebUtils.navigateToURL(APPLICATION_URL+"checkout/cart/");
    }

    public void Sku_number() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Sku number should present below the product name.");
        WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'SKU:80-54239-00')]"));
       System.out.println("SKU= 80-54239-00: "+ele.getText());

    }

    public void Qty_box() throws InterruptedException {
        Thread.sleep(4000);
        logger.info("Qty box should allow to manually input the field.\n" +
                "As much quantity in QTY box, the number of 'serial number' boxes should be appear\n" +
                "(If qty is 1 then 1 serial number box should appears)");
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement ele= driver.findElement(By.xpath("(//input[@data-cart-item-id='80-54221-00'])[2]"));
        ele.sendKeys(select);
      //  Qty_box.sendKeys(select);
        ele.sendKeys("2");
    }

    public void Update_cart_link() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should display the updated cart ex: Qty should change according to selected input");
      WebElement ele= driver.findElement(By.xpath("(//span[contains(.,'Update Cart')])[1]"));
        ele.click();
        Thread.sleep(10000);
    }


    public void Save_for_later() throws InterruptedException {
        Thread.sleep(4000);
        logger.info("It should be display 'product_name has been moved to your wish list.'Message");
        Save_for_later.click();
    }

    public void Serial_number_1() throws InterruptedException {
        Thread.sleep(4000);
        logger.info("\"It should not have to charge for more than 2 searial number\n" +
                "If the serial number is correct then a green tick should be displayed in the box of the serial number\"");

        WebElement ele= driver.findElement(By.xpath("//input[contains(@name,'cart[37366][qty]')]"));
        ele.sendKeys("1748697110003");

    }

    public void without_serial_number() throws InterruptedException {
        Thread.sleep(40000);
        logger.info("It should apply  shipping charges in order summary section and checkout process should continue");
        Checkout_button.click();
        Thread.sleep(20000);

        WebUtils.navigateToURL(APPLICATION_URL+"checkout/cart/");
        Thread.sleep(20000);
    }

    public void Serial_number3() throws InterruptedException {
        Thread.sleep(4000);
        logger.info("\"It should not have to charge \n" +
                "If the serial number is correct then a green tick should be displayed in the box of the serial number.\n" +
                "A serial number can use only twice\"");
        String select = Keys.chord(Keys.CONTROL, "a");

      //  String select = Keys.chord(Keys.CONTROL, "a");
        WebElement ele= driver.findElement(By.xpath("//input[contains(@name,'cart[37366][qty]')]"));
        ele.sendKeys(select);
        ele.sendKeys("3");
        Update_cart.click();
        Thread.sleep(10000);
        WebElement ele2= driver.findElement(By.xpath("(//input[contains(@type,'tel')])[2]"));
        ele2.sendKeys("1748697110003");
        Thread.sleep(10000);
        WebElement ele3= driver.findElement(By.xpath("(//input[contains(@type,'tel')])[3]"));
        ele3.sendKeys("1748697110003");
        Thread.sleep(10000);

    }

    public void Update_cart_button() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should display the updated cart result.");
        Actions ac=new Actions(driver);
     WebElement ele= driver.findElement(By.xpath("//button[@class='action update']"));
     ac.moveToElement(ele).click().build().perform();
//        WebUtils.navigateToURL(APPLICATION_URL+"checkout/cart/");
    }

    public void Checkout_button() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Application should redirect to the checkout page");
       Checkout_button.click();
        Thread.sleep(5000);
        WebUtils.navigateToURL(APPLICATION_URL+"checkout/cart/");
    }

    public void Cross_button() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should be remove the serial number");
        WebElement ele= driver.findElement(By.xpath("//span[contains(@data-warranty-status,'warranty-status-37366-1')]"));
        ele.click();
    }

    }
