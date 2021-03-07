package com.PC_Automation_testcases.page.actions.web.TestCases;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class Shopping_cart_page {
    private static final Logger lOGGER = LoggerFactory.getLogger(Shopping_cart_page.class);

    private WebDriver driver;




    public Shopping_cart_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void Subscribe() throws InterruptedException {
        lOGGER.info("click on subscribe button");
      //  Thread.sleep(50000);
        //driver.switchTo().alert().dismiss();
        WebDriverWait wait = new WebDriverWait(driver,90);

        WebElement	ele=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='mageplaza-betterpopup-block']/div[@id='bio_ep']/div[1]/div[1]/img[1]")));
        ele.click();
        Thread.sleep(10000);
        WebElement ele4= driver.findElement(By.xpath("//button[@class='btn-cookie btn-cookie-accept']"));
        ele4.click();

    }




    public void Addtocart() throws InterruptedException {
        Thread.sleep(9000);
        lOGGER.info("Entering model number");
        Thread.sleep(9000);
        Actions actions = new Actions(driver);
        WebElement Menu = driver.findElement(By.xpath("//span[contains(text(),'Labels & Wristbands')]"));
        WebElement subMenu = driver.findElement(By.xpath("(//a[contains(.,'Alert Solutions')])[2]"));
        actions.moveToElement(Menu).build().perform();
        System.out.println("hover on labels and wristband");
        Thread.sleep(10000);
        actions.moveToElement(subMenu).click().build().perform();
        System.out.println("Click on alert solutions");
        System.out.println(driver.getTitle());
        Thread.sleep(10000);

        Actions ac=new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("//a[contains(.,'0.5625\"x12.8125\" Chartreuse, \"Cytotoxic Precaution\" Plastic Narrow Alert Wristband, Snap Closure, 500/CS')]"));
      ele.click();
        Thread.sleep(10000);
        WebElement ele1= driver.findElement(By.xpath("//span[contains(text(),'Add to Quote')]"));
        ele1.click();

    }


//public void search() {
//	search.click();
//	// TODO Auto-generated method stub
//
//}


    public void view_cart() throws InterruptedException {
        Thread.sleep(5000);
        lOGGER.info("view cart");
        //WebDriverWait wait2 = new WebDriverWait(driver, 10);
        //wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkmo']")));
        WebElement element = driver.findElement(By.xpath("//span[@class='counter-number']"));
        element.click();


    }


    public void viewcart_and_edit() throws InterruptedException {
        Thread.sleep(8000);
        lOGGER.info("View cart");
        Actions ac =new Actions(driver);
        WebElement ele= driver.findElement(By.xpath("//span[contains(.,'View and Edit Quote Request')]"));
ac.moveToElement(ele).click().build().perform();
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
        WebElement ele=driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[1]/a[2]"));
        ele.click();
    }

    public void Product_image_link() throws InterruptedException {
        Thread.sleep(30000);
        lOGGER.info("Product name/Product image should navigate to parts search page.");
        WebElement ele= driver.findElement(By.xpath("(//a[contains(.,'0.5625\"x12.8125\" Chartreuse, \"Cytotoxic Precaution\" Plastic Narrow Alert Wristband, Snap Closure, 500/CS')])[2]"));
        ele.click();
        Thread.sleep(7000);
        driver.navigate().back();
    }
    public void Email_blank() throws InterruptedException {
        Thread.sleep(10000);
        lOGGER.info("It should open customer login popup ");
        WebDriverWait wait = new WebDriverWait(driver,30);

        WebElement	ele=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#customer-email")));



        ele.sendKeys("" +
                " ");
        ele.sendKeys(Keys.ENTER);
        Thread.sleep(10000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        WebElement name= driver.findElement(By.xpath("(//input[contains(@name,'username')])[3]"));
       name.sendKeys("puja");
        Thread.sleep(6000);
        Actions ac=new Actions(driver);
        WebElement close= driver.findElement(By.xpath("(//button[@class='action-close'][contains(.,'Close')])[3]"));
     ac.moveToElement(close).click().build().perform();

    }
    public void Form_valid() throws InterruptedException {
        Thread.sleep(10000);
                lOGGER.info("Form should get submitted and should get Thank you for your quote request!\n" +
                        "Your quote request number is: Q15.000000108.\n" +
                        "\n" +
                        "We will email you a quote request confirmation with details.");
        String select = Keys.chord(Keys.CONTROL, "a");
//        WebElement shipping= driver.findElement(By.xpath("//div[contains(text(),'Shipping Address')]"));
//        shipping.click();
        WebElement name= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[10]"));
        name.sendKeys(select);
        name.sendKeys("Puja");
        WebElement lname= driver.findElement(By.xpath("(//input[contains(@name,'lastname')])[2]"));
        lname.sendKeys(select);
        lname.sendKeys("Domke");
        WebElement sname= driver.findElement(By.xpath("(//input[contains(@name,'company')])[1]"));
        sname.sendKeys(select);
        sname.sendKeys("Upbott");
        WebElement sname1= driver.findElement(By.xpath("(//input[@type='text'])[13]"));
        sname1.sendKeys(select);
        sname1.sendKeys("Test 123");
        WebElement city= driver.findElement(By.xpath("(//input[contains(@name,'city')])[1]"));
        city.sendKeys("missouri");
        WebElement zip= driver.findElement(By.xpath("(//select[contains(@name,'region_id')])[1]"));
        Select sel=new Select(zip);
        sel.selectByValue("32");
        WebElement pnumber1= driver.findElement(By.xpath("(//input[contains(@name,'postcode')])[1]"));
        pnumber1.sendKeys(select);
        pnumber1.sendKeys("63011");
        WebElement pnumber= driver.findElement(By.xpath("(//input[contains(@name,'telephone')])[2]"));
        pnumber.sendKeys(select);
        pnumber.sendKeys("9876787678");
//        WebElement button= driver.findElement(By.xpath("//button[@data-role='opc-add-to-quote']"));
//        button.click();
//        Thread.sleep(10000);


    }
    public void Form_blank() throws InterruptedException {
        Thread.sleep(10000);
        lOGGER.info("Entering email");

        WebElement button= driver.findElement(By.xpath("//button[@data-role='opc-add-to-quote']"));
        button.click();
        Thread.sleep(30000);

    }

    public void Form_invalid() throws InterruptedException {
        Thread.sleep(10000);
        lOGGER.info("Error message should get dispalyed");
        String select = Keys.chord(Keys.CONTROL, "a");
//        WebElement shipping= driver.findElement(By.xpath("//div[contains(text(),'Shipping Address')]"));
//        shipping.click();
        WebElement name= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[10]"));
        name.sendKeys(select);
        name.sendKeys("56576");
        WebElement lname= driver.findElement(By.xpath("(//input[contains(@name,'lastname')])[2]"));
        lname.sendKeys(select);
        lname.sendKeys("4566");
        WebElement sname= driver.findElement(By.xpath("(//input[contains(@name,'company')])[1]"));
        sname.sendKeys(select);
        sname.sendKeys("Upbott");
        WebElement sname1= driver.findElement(By.xpath("(//input[@type='text'])[13]"));
        sname1.sendKeys(select);
        sname1.sendKeys("Test ");
        WebElement city= driver.findElement(By.xpath("(//input[contains(@name,'city')])[1]"));
        city.sendKeys("missouri");
        WebElement zip= driver.findElement(By.xpath("(//select[contains(@name,'region_id')])[1]"));
        Select sel=new Select(zip);
        sel.selectByValue("32");
        WebElement pnumber1= driver.findElement(By.xpath("(//input[contains(@name,'postcode')])[1]"));
        pnumber1.sendKeys(select);
        pnumber1.sendKeys("63011");
        WebElement pnumber= driver.findElement(By.xpath("(//input[contains(@name,'telephone')])[2]"));
        pnumber.sendKeys(select);
        pnumber.sendKeys("9887678");
        Thread.sleep(10000);
//        WebElement button= driver.findElement(By.xpath("//button[@data-role='opc-add-to-quote']"));
//        button.click();

    }
    public void Email_invalid() throws InterruptedException {
        Thread.sleep(10000);
        lOGGER.info("It should display message \"Please enter a valid email address (Ex: johndoe@domain.com).\"");
        WebDriverWait wait = new WebDriverWait(driver,30);

        WebElement	ele=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#customer-email")));


        //WebElement ele= driver.findElement(By.cssSelector("#customer-email"));
        String select = Keys.chord(Keys.CONTROL, "a");
        ele.sendKeys(select);
        ele.sendKeys("puja2upbott.com");

    }

    public void Email_valid() throws InterruptedException {
        Thread.sleep(10000);
        lOGGER.info("It should show below Remarks,shipping address and Billing Address fields.");
        WebDriverWait wait = new WebDriverWait(driver,30);

        WebElement	ele=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#customer-email")));

        String select = Keys.chord(Keys.CONTROL, "a");
        ele.sendKeys(select);
        //WebElement ele= driver.findElement(By.cssSelector("#customer-email"));
        ele.sendKeys("puja@upbott.com");

    }

    public void Qty_box() throws InterruptedException {
        Thread.sleep(4000);
        lOGGER.info("Qty box should allow to manually input the field.");
        String select = Keys.chord(Keys.CONTROL, "a");
WebElement Qty_box=driver.findElement(By.xpath("//input[@title='Qty']"));
        Qty_box.sendKeys(select);
        Qty_box.sendKeys("2");
    }

    public void Update_cart_link() throws InterruptedException {
        Thread.sleep(10000);
        lOGGER.info("It should display the updated cart ex: Qty should change according to selected input");
       WebElement Update_cart= driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/div[1]/button[1]/span[1]"));

        Update_cart.click();

    }


    public void billing_address() throws InterruptedException {
        Thread.sleep(30000);
        lOGGER.info("It should display the updated cart result.");
        WebElement ele=driver.findElement(By.xpath("//div[@aria-controls='checkout-step-billing']"));
        ele.click();
        Thread.sleep(5000);
        WebElement ele1=driver.findElement(By.xpath("//input[@name='billing-address-same-as-shipping']"));
        ele1.click();

    }
    public void Form_valid_billing() throws InterruptedException {
        Thread.sleep(10000);
        lOGGER.info("address should get added to the section");
        String select = Keys.chord(Keys.CONTROL, "a");
//        WebElement shipping= driver.findElement(By.xpath("//div[contains(text(),'Shipping Address')]"));
//        shipping.click();
        WebElement name= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[20]"));
        name.sendKeys(select);
    name.sendKeys("Puja");

        WebElement lname= driver.findElement(By.xpath("(//input[contains(@name,'lastname')])[3]"));
        lname.sendKeys(select);
        lname.sendKeys("Domke");
        WebElement sname= driver.findElement(By.xpath("(//input[@type='text'])[22]"));
        sname.sendKeys(select);
        sname.sendKeys("Upbott");
        WebElement sname1= driver.findElement(By.xpath("(//input[@class='input-text'])[21]"));
        sname1.sendKeys(select);
        sname1.sendKeys("Test 123");
        WebElement city= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[26]"));
        city.sendKeys("missouri");
        WebElement zip= driver.findElement(By.xpath("(//select[@class='select'])[3]"));
        Select sel=new Select(zip);
        sel.selectByValue("32");
        WebElement pnumber1= driver.findElement(By.xpath("(//input[@name='postcode'])[2]"));
        pnumber1.sendKeys(select);
        pnumber1.sendKeys("63011");
        WebElement pnumber= driver.findElement(By.xpath("(//input[@type='text'])[29]"));
        pnumber.sendKeys(select);
        pnumber.sendKeys("9876787678");
//        WebElement button= driver.findElement(By.xpath("(//span[contains(.,'Submit Quote Request')])[2]"));
//        button.click();
//        Thread.sleep(10000);
//        WebElement getmessage= driver.findElement(By.xpath("//body[@class='quotation-quote-success page-layout-1column']"));
//        System.out.println("Message is="+getmessage.getText());

    }
    public void Form_blank_billing() throws InterruptedException {
        Thread.sleep(10000);
        lOGGER.info("Error message should get displayed");

        WebElement button= driver.findElement(By.xpath("(//span[contains(.,'Submit Quote Request')])[2]"));
        button.click();
        Thread.sleep(30000);

    }

    public void Form_invalid_billing() throws InterruptedException {
        Thread.sleep(10000);
        lOGGER.info("Error message should get displayed");
        String select = Keys.chord(Keys.CONTROL, "a");
//        WebElement shipping= driver.findElement(By.xpath("//div[contains(text(),'Shipping Address')]"));
//        shipping.click();
        WebElement name= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[20]"));
        name.sendKeys(select);
        name.sendKeys("56576");
        WebElement lname= driver.findElement(By.xpath("(//input[contains(@name,'lastname')])[3]"));
        lname.sendKeys(select);
        lname.sendKeys("4566");
        WebElement sname= driver.findElement(By.xpath("(//input[@type='text'])[22]"));
        sname.sendKeys(select);
        sname.sendKeys("Upbott");
        WebElement sname1= driver.findElement(By.xpath("(//input[@class='input-text'])[21]"));
        sname1.sendKeys(select);
        sname1.sendKeys("Test ");
        WebElement city= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[26]"));
        city.sendKeys("missouri");
        WebElement zip= driver.findElement(By.xpath("(//select[@class='select'])[3]"));
        Select sel=new Select(zip);
        sel.selectByValue("32");
        WebElement pnumber1= driver.findElement(By.xpath("(//input[@name='postcode'])[2]"));
        pnumber1.sendKeys(select);
        pnumber1.sendKeys("63011");
        WebElement pnumber= driver.findElement(By.xpath("(//input[@type='text'])[29]"));
        pnumber.sendKeys(select);
        pnumber.sendKeys("9887678");
        Thread.sleep(10000);
//        WebElement button= driver.findElement(By.xpath("(//span[contains(.,'Submit Quote Request')])[2]"));
//        button.click();

    }

    public void Checkout_button() throws InterruptedException {
        Thread.sleep(10000);
        lOGGER.info("Application should redirect to the checkout page");
        WebElement element = driver.findElement(By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[3]/div[2]/ul[1]/li[1]/button[1]"));
        Actions actions = new Actions(driver);
        //actions.moveToElement(element).click().build().perform();
        element.click();
    }

    public void Checkbox() throws InterruptedException {
        Thread.sleep(10000);
        lOGGER.info("It should be remove the serial number");
      WebElement ele= driver.findElement(By.xpath("//input[@id='billing-address-same-as-shipping']"));
        Actions actions = new Actions(driver);

        actions.doubleClick(ele).perform();
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

    public void Product() throws InterruptedException {
        lOGGER.info("Product image should display clear and distinct\n");
        Thread.sleep(20000);
        Actions actions = new Actions(driver);
        WebElement Menu = driver.findElement(By.xpath("//span[contains(text(),'Labels & Wristbands')]"));
        WebElement subMenu = driver.findElement(By.xpath("(//a[contains(.,'Alert Solutions')])[2]"));
        actions.moveToElement(Menu).build().perform();
        System.out.println("hover on labels and wristband");
        Thread.sleep(10000);
        actions.moveToElement(subMenu).click().build().perform();
        System.out.println("Click on alert solutions");
        System.out.println(driver.getTitle());
        Thread.sleep(10000);

        WebElement ele = driver.findElement(By.xpath("//img[contains(@id,'product-image-3152')]"));
        actions.doubleClick(ele).perform();


        Thread.sleep(10000);
        WebElement ele1= driver.findElement(By.xpath("//button[contains(.,'Add to Cart')]"));
        ele1.click();
        Thread.sleep(10000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        WebElement view_cart= driver.findElement(By.xpath("//span[contains(.,'View Cart')]"));
        view_cart.click();






    }


    public void Summary() throws InterruptedException {
        Thread.sleep(4000);
        lOGGER.info("Product name/Product image should navigate to parts search page.");
        WebElement ele= driver.findElement(By.xpath("//div[@aria-controls='block-summary']"));

        ele.click();
        //  Thread.sleep(7000);
        //  driver.navigate().back();
    }
    public void remove() throws InterruptedException {
        Thread.sleep(10000);
        lOGGER.info("Application should remove specific product from cart.");
        WebElement ele= driver.findElement(By.xpath("//a[@title='Remove']"));

        ele.click();
        //  Thread.sleep(7000);
        //  driver.navigate().back();
    }
    public void login(String email,String pwd) throws InterruptedException {
        Thread.sleep(30000);
        lOGGER.info("Customer login");
        driver.navigate().refresh();
        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(80000);
        Actions ac=new Actions(driver);
        WebElement ele= driver.findElement(By.xpath("//a[@class='link login']"));
       ac.moveToElement(ele).click().build().perform();
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement txtemail= driver.findElement(By.xpath("//input[@id='email']"));

        txtemail.sendKeys(email);

        WebElement txtPassword= driver.findElement(By.xpath("//input[@name='login[password]']"));


        txtPassword.sendKeys(pwd);
        WebElement btnLogin= driver.findElement(By.xpath("//button[@class='action login primary']"));
        btnLogin.click();
         Thread.sleep(7000);




    }
    public void Qty_product() throws InterruptedException {
        Thread.sleep(10000);
        lOGGER.info("Application should display correct product 'Quantity'.");
        WebElement ele= driver.findElement(By.xpath("(//input[@data-role='cart-item-qty'])[3]"));

        ele.click();
        //  Thread.sleep(7000);
        //  driver.navigate().back();
    }
    public void Subtotal() throws InterruptedException {
        Thread.sleep(10000);
        lOGGER.info("Subtotal should display excluding tax .");
        WebElement ele= driver.findElement(By.xpath("//td[@class='col subtotal']"));
System.out.println("Subtotal: "+ele.getText());
        //  Thread.sleep(7000);
        //  driver.navigate().back();
    }
    public void update_cart() throws InterruptedException {
        Thread.sleep(10000);
        lOGGER.info("It should display the updated cart.");
        WebElement ele= driver.findElement(By.xpath("//span[contains(text(),'Update Shopping Cart')]"));

        ele.click();
        //  Thread.sleep(7000);
        //  driver.navigate().back();
    }
    public void Movetowishlist() throws InterruptedException {
        Thread.sleep(10000);
        lOGGER.info("It should move product into Wishlist");
        WebElement ele= driver.findElement(By.xpath("//span[contains(text(),'Move to Wishlist')]"));

        ele.click();
          Thread.sleep(7000);

    }
    public void Remove_product() throws InterruptedException {
        Thread.sleep(10000);
        lOGGER.info("Product should get remove from shopping cart");
        WebElement ele= driver.findElement(By.xpath("//a[@class='action action-delete']"));

        ele.click();
        Thread.sleep(7000);

    }
    public void proceed_to_checkout() throws InterruptedException {
        Thread.sleep(20000);
        lOGGER.info("Application should redirect to the delivery page.");
        WebElement ele= driver.findElement(By.xpath("//span[contains(text(),'Proceed to Checkout')]"));

        ele.click();
        //  Thread.sleep(7000);
        //  driver.navigate().back();
    }
}
