package com.Marvel.page.actions.web.Servicer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Shipping_Page {
    private static final Logger logger = LoggerFactory.getLogger(Servicer_Homepage_Page.class);

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
        logger.info("After login After login By default parts search should open");
        Thread.sleep(20000);
        WebElement ele = driver.findElement(By.xpath("(//a[contains(.,'Login')])[1]"));
        ele.click();
    }

    public void setemail(String email) throws InterruptedException {
        Thread.sleep(5000);
        txtemail.sendKeys(email);
    }

    public void setPassword(String pwd) throws InterruptedException {
        Thread.sleep(5000);
        txtPassword.sendKeys(pwd);
    }


    public void clickSubmit() {
        btnLogin.click();
        System.out.println("Provider login successfull");
    }

    public void Shipping_Page() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Application should display Product image clear & distinct.");
        WebElement ele = driver.findElement(By.xpath("//label[@for='serial-number']"));
        ele.click();
        WebElement ele1 = driver.findElement(By.xpath("//input[@placeholder='2019102805H']"));
        String select = Keys.chord(Keys.CONTROL, "a");
        ele1.sendKeys(select);
        ele1.sendKeys("20191216052H");
        ele1.sendKeys(Keys.ENTER);
        Thread.sleep(10000);
        WebElement ele3 = driver.findElement(By.xpath("//input[@product_id='11886']"));
        ele3.click();
        Thread.sleep(10000);

        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        WebElement cancel = driver.findElement(By.xpath("//span[contains(.,'Continue Shopping')]"));
        cancel.click();
        Thread.sleep(10000);
        WebElement ele6 = driver.findElement(By.xpath("//label[@for='model-number'][contains(.,'Service Model Number')]"));
        ele6.click();
        Thread.sleep(10000);
        WebElement ele7 = driver.findElement(By.xpath("//input[contains(@name,'serial')]"));

        ele7.sendKeys(select);
        ele7.sendKeys("ML24BNS2LB1");
        ele1.sendKeys(Keys.ENTER);
        Thread.sleep(10000);
        WebElement ele8 = driver.findElement(By.xpath("//input[contains(@type,'button')]"));
        ele8.click();
        Thread.sleep(10000);

        ArrayList<String> tabs3 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(0));
        Thread.sleep(2000);

        WebElement view = driver.findElement(By.xpath("//span[contains(.,'View Cart')]"));
        view.click();
    }




    public void Click_links() throws InterruptedException {
        Thread.sleep(4000);
        logger.info("It should redirect to respective page");
        WebElement alllinks = driver.findElement(By.xpath("//div[contains(@class,'checkout-warranty-note')]"));


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

    public void Product_image_link() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should navigate to pdp page.");
        WebElement  Product_image= driver.findElement(By.xpath("(//a[contains(.,'Leg Levelers')])[2]"));
        Product_image.click();
        Thread.sleep(7000);
       driver.navigate().back();
    }
    public void Cross_icon() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should remove specific product from cart.");
        WebElement  Product_image= driver.findElement(By.xpath("(//span[contains(@itempro,'warranty_check_remove')])[1]"));
        Product_image.click();

    }
    public void Update_cart_button_() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should display the updated cart.");
        WebElement  Product_image= driver.findElement(By.xpath("(//span[contains(.,'Update Cart')])[2]"));
        Product_image.click();

    }
    public void Serial_number_cross() throws InterruptedException {
        Thread.sleep(20000);
        logger.info("It should be remove the serial number");
        WebElement  Product_image= driver.findElement(By.xpath("(//span[contains(@itempro,'warranty_check_remove')])[1]"));
      Product_image.click();

    }
    public void Serial_number_valid() throws InterruptedException {
        Thread.sleep(20000);
        logger.info("Product name/Product image should navigate to parts search page.");
        WebElement  Product_image= driver.findElement(By.xpath("(//input[@class='warranty-check'])[1]"));
        String select = Keys.chord(Keys.CONTROL, "a");
        Product_image.sendKeys(select);
        Product_image.sendKeys("20191216052H");

    }
    public void Serial_number_invalid() throws InterruptedException {
        Thread.sleep(20000);
        logger.info("\"It should not have to charge \n" +
                "If the serial number is correct then a green tick should be displayed in the box of the serial number\"");
        WebElement  Product_image= driver.findElement(By.xpath("(//input[@class='warranty-check'])[1]"));
        String select = Keys.chord(Keys.CONTROL, "a");
        Product_image.sendKeys(select);
        Product_image.sendKeys("45566776");

    }
    public void Serial_number_blank() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should have to charge");
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement  Product_image= driver.findElement(By.xpath("(//input[@class='warranty-check'])[1]"));
        Product_image.sendKeys(select);
        Product_image.sendKeys("");

    }

    public void Sku_number() throws InterruptedException {
        Thread.sleep(4000);
        logger.info("It should be present below the product name");
        WebElement  sku= driver.findElement(By.xpath("(//span[contains(@class,'sku')])[2]"));

      System.out.println(sku.getText());

    }

    public void Qty_box() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("\"Qty box should allow to manually input the field.\n" +
                "As much quantity in QTY box, the number of 'serial number' boxes should be appear\n" +
                "(If qty is 1 then 1 serial number box should appears)\"");
        String select = Keys.chord(Keys.CONTROL, "a");
//        WebElement price= driver.findElement(By.xpath("(//span[contains(@class,'price')])[32]"));
//       System.out.println(" Price is : " +price.getText());
        WebElement ele= driver.findElement(By.xpath("(//input[contains(@type,'number')])[3]"));
        ele.click();
        ele.sendKeys(select);
      //  Qty_box.sendKeys(select);
        ele.sendKeys("2");

    }

    public void Update_cart_link() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should display the updated cart");
//        WebElement price= driver.findElement(By.xpath("(//span[contains(@class,'price')])[32]"));
//        System.out.println(" Price is : " +price.getText());
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement ele= driver.findElement(By.xpath("(//input[contains(@type,'number')])[3]"));
        ele.click();
        ele.sendKeys(select);
        //  Qty_box.sendKeys(select);
        ele.sendKeys("3");
        WebElement ele2= driver.findElement(By.xpath("(//span[contains(.,'Update Cart')])[2]"));
        ele2.click();
//        Thread.sleep(5000);
//        WebElement priceu= driver.findElement(By.xpath("(//span[contains(@class,'price')])[28]"));
//        System.out.println(" Updated Price is : " +priceu.getText());

        Thread.sleep(10000);
    }


    public void Save_for_later() throws InterruptedException {
        Thread.sleep(4000);
        logger.info("It should be display 'product_name has been moved to your Saved Items.'");
     WebElement ele= driver.findElement(By.xpath("(//span[contains(.,'Move To Saved Items')])[1]"));
     ele.click();
    }

    public void Apply_coupn_code_blank() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Error mesage should display 'This is required field'");
        WebElement ele= driver.findElement(By.xpath("//input[contains(@name,'coupon_code')]"));

        WebElement ele1= driver.findElement(By.xpath("//span[contains(.,'Apply Discount')]"));
        ele1.click();
    }
    public void Apply_coupn_code_invalid() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Error mesage should display  'The coupon code \"coupon_code\" is not valid.'");
        WebElement ele= driver.findElement(By.xpath("//input[contains(@name,'coupon_code')]"));
       ele.sendKeys("abc");
        WebElement ele1= driver.findElement(By.xpath("//span[contains(.,'Apply Discount')]"));
        ele1.click();
    }
    public void Apply_coupn_code_valid() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should apply coupon code and display message 'You used coupon code \"coupon_code\".'");
        WebElement ele= driver.findElement(By.xpath("//input[contains(@name,'coupon_code')]"));
       ele.sendKeys("de");
        WebElement ele1= driver.findElement(By.xpath("//span[contains(.,'Apply Discount')]"));
        ele1.click();
    }



    public void Checkout_button() throws InterruptedException {
        Thread.sleep(50000);
        logger.info("Application should redirect to the checkout page");
        WebElement cancel = driver.findElement(By.xpath("(//span[contains(.,'Go to Checkout')])[2]"));
        cancel.click();
    }

    public void edit_button() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should redirect to part search page");
       WebElement ele=driver.findElement(By.xpath("(//a[@class='action action-edit'][contains(.,'Edit')])[1]"));
       ele.click();
        Thread.sleep(10000);
        driver.navigate().back();
    }
    public void Order_summer_section() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should display Subtotal,Tax ,Order Total correct & distinct.");
        WebElement ele=driver.findElement(By.xpath("//div[contains(@class,'cart-summary')]"));
       System.out.println(ele.getText());
    }
    public void Order_Total() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should display correct 'Order Total' price.");
        WebElement ele=driver.findElement(By.xpath("//span[@data-bind='text: getValue()']"));
        System.out.println(ele.getText());
    }
    public void Estimate_total_section() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("\"There should be 3 fields\n" +
                "1.Country\n" +
                "2.State\n" +
                "3.Zipcode\"");
        WebElement ele=driver.findElement(By.xpath("//div[@class='title'][contains(.,'Estimate Shipping and Tax')]"));
         ele.click();
        Thread.sleep(5000);
        WebElement ele5=driver.findElement(By.xpath("//div[contains(@class,'cart-summary')]"));
      System.out.println(ele5.getText());
    }
    public void Estimate_total_section_dropdown() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should display selected option");
//        WebElement ele=driver.findElement(By.xpath("//div[@class='title'][contains(.,'Estimate Shipping and Tax')]"));
//        ele.click();
//        Thread.sleep(5000);
        WebElement ele5=driver.findElement(By.xpath("//div[contains(@class,'cart-summary')]"));
        System.out.println(ele5.getText());
        WebElement radio=driver.findElement(By.xpath("//input[@type='radio'][contains(@id,'03')]"));
        radio.click();
    }
    public void Two_serial_number() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("\"It should not have to charge \n" +
                "If the serial number is correct then a green tick should be displayed in the box of the serial number.\n" +
                "A serial number can use only twice\"");
        WebElement ele= driver.findElement(By.xpath("(//input[@maxlength='12'])[4]"));
        ele.click();
        String select = Keys.chord(Keys.CONTROL, "a");
        ele.sendKeys(select);
        //  Qty_box.sendKeys(select);
        ele.sendKeys("2");
        WebElement ele2= driver.findElement(By.xpath("(//span[contains(.,'Update Cart')])[2]"));
        ele2.click();
        Thread.sleep(10000);
        WebElement  Product_image= driver.findElement(By.xpath("(//input[@class='warranty-check'])[1]"));

        Product_image.sendKeys(select);
        Product_image.sendKeys("20191216052H");
        Thread.sleep(5000);

    }
    public void Three_serial_number() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("\"It should not have to charge \n" +
                "If the serial number is correct then a green tick should be displayed in the box of the serial number.\n" +
                "A serial number can use only twice\"");
        WebElement ele= driver.findElement(By.xpath("(//input[@maxlength='12'])[4]"));
        ele.click();
        String select = Keys.chord(Keys.CONTROL, "a");
        ele.sendKeys(select);
        //  Qty_box.sendKeys(select);
        ele.sendKeys("3");
        WebElement ele2= driver.findElement(By.xpath("(//span[contains(.,'Update Cart')])[2]"));
        ele2.click();
        Thread.sleep(10000);
        WebElement  Product_image= driver.findElement(By.xpath("(//input[@class='warranty-check'])[1]"));

        Product_image.sendKeys(select);
        Product_image.sendKeys("20191216052H");

    }
    }
