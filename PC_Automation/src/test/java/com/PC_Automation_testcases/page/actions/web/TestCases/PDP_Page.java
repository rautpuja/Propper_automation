package com.PC_Automation_testcases.page.actions.web.TestCases;


import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class PDP_Page {
    private static final Logger logger = LoggerFactory.getLogger(PDP_Page.class);

    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//div[@id='option-label-color-93-item-100']")
    @CacheLookup
    WebElement Finish1;

    @FindBy(how = How.XPATH, using = "//div[@id='option-label-color-93-item-66']")
    @CacheLookup
    WebElement Finish2;

    @FindBy(how = How.XPATH, using = "//div[@id='option-label-color-93-item-168']")
    @CacheLookup
    WebElement Finish3;

    @FindBy(how = How.XPATH, using = "//body/div[1]/main[1]/div[2]/div[1]/div[2]/div[4]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/select[1]")
    @CacheLookup
    WebElement Door_swing;

    @FindBy(how = How.XPATH, using = "//body/div[1]/main[1]/div[2]/div[1]/div[2]/div[4]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/select[1]")
    @CacheLookup
    WebElement Lock;


    @FindBy(how = How.XPATH, using = "//a[@title='Find a Dealer']")
    @CacheLookup
    WebElement Find_dealer;


    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Description')]")
    @CacheLookup
    WebElement Discription;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Key Features')]")
    @CacheLookup
    WebElement Key_feature;
    @FindBy(how = How.XPATH, using = "//a[@id='tab-label-product.attributes.details-title']")
    @CacheLookup
    WebElement details;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Model summary')]")
    @CacheLookup
    WebElement Model_summary;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Downloads')]")
    @CacheLookup
    WebElement Downloads;

    @FindBy(how = How.XPATH, using = "//a[@id='tab-label-accessoriestab-title']")
    @CacheLookup
    WebElement Accesories;

    @FindBy(how = How.XPATH, using = "//body/div[1]/main[1]/div[2]/div[1]/div[4]/div[1]/div[12]/div[1]/div[1]/ol[1]/li[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/button[1]")
    @CacheLookup
    WebElement Add_to_cart;

    public PDP_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void Subscribe() throws InterruptedException {
        logger.info("click on subscribe button");

        //driver.switchTo().alert().dismiss();
        WebDriverWait wait = new WebDriverWait(driver,90);

        WebElement	ele=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='mageplaza-betterpopup-block']/div[@id='bio_ep']/div[1]/div[1]/img[1]")));
        ele.click();
        Thread.sleep(10000);
        WebElement ele4= driver.findElement(By.xpath("//button[@class='btn-cookie btn-cookie-accept']"));
        ele4.click();

    }

    public void PDP_page() throws InterruptedException {
        logger.info("Product image should display clear and distinct\n");
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
        WebElement ele = driver.findElement(By.xpath("//a[contains(.,'0.5625\"x12.8125\" Chartreuse, \"Cytotoxic Precaution\" Plastic Narrow Alert Wristband, Snap Closure, 500/CS')]"));
      ele.click();


    }

    public void Breadcrumb() throws InterruptedException {
        logger.info("It should display the breadcrumb properly starting with home > category name>product name");
        Thread.sleep(10000);

        WebElement ele = driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
        System.out.println(ele.getText());

    }
    public void detail_guest() throws InterruptedException {
        logger.info("For guest users Product image/name/Ref/Quantity/Add to Quote button/Request a Sample Button/Log In/Request more information should be visible");
        Thread.sleep(10000);

        WebElement ele = driver.findElement(By.xpath("//div[@class='product-info-main']"));
        System.out.println(ele.getText());

    }
    public void detail_login() throws InterruptedException {
        logger.info("For logged in users Product image/name/Ref/Item/Price/Quantity/Add to Cart button/Request more information/Add to wishlist should be visible");
        Thread.sleep(10000);

        WebElement ele = driver.findElement(By.xpath("//div[@class='product-info-main']"));
        System.out.println(ele.getText());

    }
    public void Product_specification() throws InterruptedException {
        logger.info("Application should display/open Details tab with details of product");
        Thread.sleep(10000);

        WebElement ele = driver.findElement(By.xpath("//div[@aria-labelledby='tab-label-description']"));
        System.out.println(ele.getText());

    }
    public void Breadcrumb_link() throws InterruptedException {
        logger.info("It should get redirected to the respective page");
        Thread.sleep(10000);

        WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
        ele.click();
        Thread.sleep(10000);
        driver.navigate().back();


    }

    public void Product_image() throws InterruptedException {
        logger.info("It should redirect to another page and dispaly image on aspect ratio");
        Thread.sleep(10000);
        WebElement Door_swing = driver.findElement(By.xpath("//img[@class='fotorama__img']"));
        Door_swing.click();
        Thread.sleep(10000);

        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        WebElement Door_swing1 = driver.findElement(By.xpath("//div[@aria-label='Exit fullscreen']"));
        Door_swing1.click();



    }
    public void Product_image_title() throws InterruptedException {
        logger.info("It should be same as on list page");
        Thread.sleep(10000);
        WebElement Door_swing = driver.findElement(By.xpath("//span[contains(text(),'0.5625\"x12.8125\" Chartreuse, \"Cytotoxic Precaution')]"));
      System.out.println( Door_swing.getText());



    }
    public void QTY_() throws InterruptedException {
        logger.info("It should be increament the digit by Clicking on '+' button and should decrease the digit by Clicking on '-' button ");
        Thread.sleep(10000);
        WebElement Door_swing = driver.findElement(By.xpath("//a[@class='qty-inc']"));
      Door_swing.click();



    }
    public void addtoqoute() throws InterruptedException {
        logger.info("It should display 'You added \"PRODUCT NAME\" to your quote. Continue browsing the store to add more items to your quote and when you are ready to submit your quote request, Click on the cart icon at the top of the page.'and product should be added in minicart ");
        Thread.sleep(10000);
        WebElement Door_swing = driver.findElement(By.xpath("//span[contains(text(),'Add to Quote')]"));
        Door_swing.click();



    }
    public void request_sample() throws InterruptedException {
        logger.info("It should be redirect to respective page ");
        Thread.sleep(10000);
        WebElement Door_swing = driver.findElement(By.xpath("//span[contains(text(),'Request a Sample')]"));
        Door_swing.click();
        Thread.sleep(10000);
        driver.navigate().back();


    }
    public void request_more_information() throws InterruptedException {
        logger.info("It should be redirect to Contact us page ");
        Thread.sleep(10000);
        WebElement Door_swing = driver.findElement(By.xpath("//a[contains(text(),'Request more information')]"));
        Door_swing.click();
        Thread.sleep(10000);
        driver.navigate().back();



    }
    public void login_link() throws InterruptedException {
        logger.info("It should be redirect to log-in account pop page ");
        Thread.sleep(50000);
        WebElement Door_swing = driver.findElement(By.xpath("//a[contains(text(),'Log In')]"));
        Door_swing.click();
        Thread.sleep(10000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        WebElement Door_swing1 = driver.findElement(By.xpath("//input[@id='customer-email']"));
        Door_swing1.sendKeys("sam@upbott.com");

        WebElement Door_swing2 = driver.findElement(By.xpath("//input[@id='pass']"));
        Door_swing2.sendKeys("sushil@8055");
        WebElement Door_swing3 = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
        Door_swing3.click();


    }
    public void Addtocart_link() throws InterruptedException {
        logger.info("It should display popup 'Added to your shopping cart' with Product name,View cart and continue shopping button ");
        Thread.sleep(10000);

        WebElement Door_swing = driver.findElement(By.xpath("//span[contains(text(),'Add to Cart')]"));
        Door_swing.click();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        WebElement Door_swing1 = driver.findElement(By.xpath("//span[contains(text(),'Continue Shopping')]"));
        Door_swing1.click();
        Thread.sleep(10000);
        driver.navigate().back();



    }
    public void Addtowishlist_link() throws InterruptedException {
        logger.info("It should redirect to respecive page ");
        Thread.sleep(20000);
//        Actions actions = new Actions(driver);
//        WebElement Menu = driver.findElement(By.xpath("//span[contains(text(),'Labels & Wristbands')]"));
//        WebElement subMenu = driver.findElement(By.xpath("(//a[contains(.,'Alert Solutions')])[2]"));
//        actions.moveToElement(Menu).build().perform();
//        System.out.println("hover on labels and wristband");
//        Thread.sleep(10000);
//        actions.moveToElement(subMenu).click().build().perform();
//        System.out.println("Click on alert solutions");
//        System.out.println(driver.getTitle());
//        Thread.sleep(10000);
//        WebElement ele = driver.findElement(By.xpath("//a[contains(.,'0.5625\"x12.8125\" Chartreuse, \"Cytotoxic Precaution\" Plastic Narrow Alert Wristband, Snap Closure, 500/CS')]"));
//        ele.click();
//        System.out.println(ele.getText());
//        Thread.sleep(10000);

        WebElement Door_swing4= driver.findElement(By.xpath("//span[contains(.,'Add to Wish List')]"));
        Door_swing4.click();
        Thread.sleep(10000);
        driver.navigate().back();


    }
    public void moreinformation() throws InterruptedException {
        logger.info("Application should display/open Details tab with details of product");

        Thread.sleep(10000);
//                Actions actions = new Actions(driver);
//        WebElement Menu = driver.findElement(By.xpath("//span[contains(text(),'Labels & Wristbands')]"));
//        WebElement subMenu = driver.findElement(By.xpath("(//a[contains(.,'Alert Solutions')])[2]"));
//        actions.moveToElement(Menu).build().perform();
//        System.out.println("hover on labels and wristband");
//        Thread.sleep(10000);
//        actions.moveToElement(subMenu).click().build().perform();
//        System.out.println("Click on alert solutions");
//        System.out.println(driver.getTitle());
//        Thread.sleep(10000);
//        WebElement ele = driver.findElement(By.xpath("//a[contains(.,'0.5625\"x12.8125\" Chartreuse, \"Cytotoxic Precaution\" Plastic Narrow Alert Wristband, Snap Closure, 500/CS')]"));
//        ele.click();
//        WebElement ele2 = driver.findElement(By.xpath("(//a[@data-category='Patient ID Wristbands > Alert Solutions'])[1]"));
//        ele2.click();
//        Thread.sleep(10000);
        WebElement ele5= driver.findElement(By.xpath("//a[contains(.,'More Information')]"));
        ele5.click();
        Thread.sleep(10000);
        WebElement ele6= driver.findElement(By.xpath("//div[@aria-labelledby='tab-label-additional']"));
       System.out.println("Info : " +ele6.getText());


    }

    public void moreinformation_guest() throws InterruptedException {
        logger.info("It should be display finish name");

        Thread.sleep(1000);
        WebElement ele= driver.findElement(By.xpath("//a[@id='tab-label-additional-title']"));
        ele.click();
    }

    public void RAQ() throws InterruptedException {
        logger.info("IIt should display popup of REQUEST A QUOTE with cross button(X)\n");
        Thread.sleep(10000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(10000);
        WebElement target= driver.findElement(By.xpath("//span[contains(text(),'Request a Quote')]"));

        target.click();

    }
    public void slider() throws InterruptedException {
        logger.info("The main product image should get change according to applied slider \n");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement ele= driver.findElement(By.xpath("//body/div[2]/main[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[3]/div[1]"));
        ele.click();
        ac.moveToElement(ele).click().build().perform();
    }

    public void RAQ_blank() throws InterruptedException {
        logger.info("Error message should get dispalyed");

        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);

        WebElement target1= driver.findElement(By.xpath("//button[@id='request-a-form-submit']"));

        target1.click();

    }
    public void RAQ_invalid() throws InterruptedException {
        logger.info("error message should get dispalyed");

        Thread.sleep(10000);

        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(9000);
        WebElement Name= driver.findElement(By.xpath("//input[@name='first_name']"));
        Name.sendKeys("67787");

        WebElement Last_Name= driver.findElement(By.xpath("//input[@name='last_name']"));
        Last_Name.sendKeys("67787");
        WebElement PhoneName= driver.findElement(By.xpath("//input[@name='home_phone']"));
        PhoneName.sendKeys("67787");
        WebElement Email= driver.findElement(By.xpath("//input[@id='customer_email']"));
        Email.sendKeys("67787");
        WebElement Interested= driver.findElement(By.xpath("//textarea[@name='products_interested']"));
        Interested.sendKeys("67787");
        WebElement postal_code= driver.findElement(By.xpath("//input[@name='postal_code']"));
        postal_code.sendKeys("63011");


        WebElement target1= driver.findElement(By.xpath("//button[@id='request-a-form-submit']"));

        target1.click();



    }
    public void RAQ_valid() throws InterruptedException {
        logger.info("Success message should get dispalyed");
        Thread.sleep(10000);
//        WebElement target= driver.findElement(By.xpath("//span[contains(text(),'Request a Quote')]"));
//
//        target.click();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        String select = Keys.chord(Keys.CONTROL, "a");

        WebElement Name= driver.findElement(By.xpath("//input[@name='first_name']"));
        Name.sendKeys(select);
        Name.sendKeys("puja");

        WebElement Last_Name= driver.findElement(By.xpath("//input[@name='last_name']"));
        Last_Name.sendKeys(select);
        Last_Name.sendKeys("domke");
        WebElement PhoneName= driver.findElement(By.xpath("//input[@name='home_phone']"));
        PhoneName.sendKeys(select);
        PhoneName.sendKeys("8987656789");
        WebElement Email= driver.findElement(By.xpath("//input[@id='customer_email']"));
        Email.sendKeys(select);
        Email.sendKeys("puja@upbott.com");
        WebElement Interested= driver.findElement(By.xpath("//textarea[@name='products_interested']"));
        Interested.sendKeys(select);
        Interested.sendKeys("Testing request from upbott team");
        WebElement postal_code= driver.findElement(By.xpath("//input[@name='postal_code']"));
        postal_code.sendKeys(select);
        postal_code.sendKeys("63011");


        WebElement target1= driver.findElement(By.xpath("//button[@id='request-a-form-submit']"));

        target1.click();


    }


    public void Downloads() throws InterruptedException {
        logger.info("It should be display finish name");
        Thread.sleep(5000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,-1000)");
        WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Downloads')]"));
        ele.click();

        Thread.sleep(5000);
        WebElement alllinks = driver.findElement(By.xpath("//ul[@class='icon-links download no-margin']"));


        List<WebElement> Links = alllinks.findElements(By.tagName("a"));
        int Count = Links.size();
        System.out.println("Name: " + Count);
        for (int i = 0; i < Links.size(); i++) {
            String Opentabs = Keys.chord(Keys.CONTROL, Keys.ENTER);

            Links.get(i).sendKeys(Opentabs);

        }
    }

    public void Email() throws InterruptedException {
        logger.info("Email form pop up should get open\n");
        Thread.sleep(10000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,-1000)");
        WebElement ele = driver.findElement(By.xpath("//a[@class='action mailto friend']"));
        ele.click();

    }

    public void Email_valid() throws InterruptedException {
        logger.info("success message should get displayed");
        Thread.sleep(10000);
        WebElement name = driver.findElement(By.xpath("//input[@id='sender-name']"));

        name.sendKeys("puja");

        WebElement Email = driver.findElement(By.xpath("//input[@id='sender-email']"));

        Email.sendKeys("puja@upbott.com");

        WebElement message = driver.findElement(By.xpath("//textarea[@name='recipients[message][0]']"));

        message.sendKeys("Testing request from upbott team");

        WebElement message1 = driver.findElement(By.xpath("//textarea[@name='sender[message]']"));

        message1.sendKeys("Testing request from upbott team");
        WebElement button = driver.findElement(By.xpath("//button[@class='action submit primary']"));

        button.click();

    }

    public void Related_product() throws InterruptedException {
        logger.info("It should be display finish name");
        Thread.sleep(10000);
        WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'24-in Built-in High Efficiency Dual Zone Wine Refr')]"));

   ele.click();
    }
}