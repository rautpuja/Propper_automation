package com.PC_Automation_testcases.page.actions.web.TestCases;

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

import java.util.ArrayList;

public class Product_listing_page {
    private static final Logger logger= LoggerFactory.getLogger(Product_listing_page.class);

    private WebDriver driver;

    @FindBy(how = How.XPATH, using="//body/div[4]/main[1]/div[3]/div[1]/div[2]/div[2]/div[3]/a[2]")
    @CacheLookup
    WebElement Assending;

    @FindBy(how = How.XPATH, using="//a[.='Products' and not(@title)]")
    @CacheLookup
    WebElement product;

    @FindBy(how = How.XPATH, using="//select[@id='limiter']")
    @CacheLookup
    WebElement Show;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'HBD524')]")
    @CacheLookup
    WebElement product_Name;


    public Product_listing_page(WebDriver driver) {
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

    public void product() throws InterruptedException {
        logger.info("It should get redirected to the category page and all respective products  should display on it");
        Thread.sleep(10000);
//        driver.navigate().to("https://c882714cd9.nxcli.net/patient-id-wristbands/alert-solutions.html");
//        System.out.println(driver.getTitle());
        Actions actions = new Actions(driver);
        WebElement Menu = driver.findElement(By.xpath("//span[contains(text(),'Labels & Wristbands')]"));
        WebElement subMenu = driver.findElement(By.xpath("(//a[contains(.,'Alert Solutions')])[2]"));
    actions.moveToElement(Menu).build().perform();
    System.out.println("hover on labels and wristband");
        Thread.sleep(10000);
        actions.moveToElement(subMenu).click().build().perform();
        System.out.println("Click on alert solutions");
        System.out.println(driver.getTitle());

    }
    public void read_more() throws InterruptedException {
        logger.info("It should get redirected to the category page and all respective products  should display on it");
        Thread.sleep(10000);

        WebElement subMenu = driver.findElement(By.xpath("//strong[contains(text(),'READ MORE')]"));
        subMenu.click();

    }

    public void Readmore() throws InterruptedException {
        logger.info("It should redirect to at bottom of pagination and should display a paragraph");
        Thread.sleep(10000);

        WebElement subMenu = driver.findElement(By.xpath("//strong[contains(text(),'READ MORE')]"));
        subMenu.click();

    }
    public void Clear_all() throws InterruptedException {
        logger.info("Application should clear selected filter");
        Thread.sleep(10000);

        WebElement subMenu = driver.findElement(By.xpath("(//a[contains(.,'Clear All Selected')])[2]"));
        subMenu.click();

    }
    public void Needhelp_section() throws InterruptedException {
        logger.info("Application should clear selected filter");
        Thread.sleep(10000);

        WebElement subMenu = driver.findElement(By.xpath("//h2[contains(text(),'Need Help Finding a Product?')]"));
        System.out.println(subMenu.getText());

    }
    public void Needhelp_section_button() throws InterruptedException {
        logger.info("It should redirect to respective category");
        Thread.sleep(20000);

        WebElement subMenu = driver.findElement(By.xpath("//a[contains(text(),'SEARCH FAQs')]"));
       subMenu.click();

    }
    public void Login() throws InterruptedException {
        logger.info("Product should get added into wishlist section");
        Thread.sleep(10000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,-1000)");
        Actions ac=new Actions(driver);
        Thread.sleep(10000);
        WebElement ele= driver.findElement(By.xpath("//a[@class='link login']"));
        ac.doubleClick(ele).perform();
        Thread.sleep(50000);
        WebElement txtemail= driver.findElement(By.xpath("//input[@id='email']"));

        txtemail.sendKeys("sam@upbott.com");

        WebElement txtPassword= driver.findElement(By.xpath("//input[@name='login[password]']"));

        txtPassword.sendKeys("sushil@8055");
        WebElement btnLogin= driver.findElement(By.xpath("//button[@class='action login primary']"));
        btnLogin.click();
        Thread.sleep(50000);
        Actions actions = new Actions(driver);
        WebElement Menu = driver.findElement(By.xpath("//span[contains(text(),'Labels & Wristbands')]"));
        WebElement subMenu = driver.findElement(By.xpath("(//a[contains(.,'Alert Solutions')])[2]"));
        actions.moveToElement(Menu).build().perform();
        System.out.println("hover on labels and wristband");
        Thread.sleep(10000);
        actions.moveToElement(subMenu).click().build().perform();
        System.out.println("Click on alert solutions");
        System.out.println(driver.getTitle());}

    public void Addtowishlist() throws InterruptedException {
        Thread.sleep(10000);
        WebElement subMenu1 = driver.findElement(By.xpath("(//a[contains(@type,'submit')])[1]"));
        subMenu1.click();
        Thread.sleep(10000);
        driver.navigate().back();
        Thread.sleep(10000);
    }
    public void Product_name_() throws InterruptedException {
        logger.info("It should get redirected to the category page and all respective products  should display on it");
        Thread.sleep(10000);

        WebElement subMenu = driver.findElement(By.xpath("//span[@data-ui-id='page-title-wrapper']"));
        System.out.println(subMenu.getText());

    }
    public void Breadcrumb() throws InterruptedException {
        logger.info("\"It should display the breadcrumb properly starting with Home > Products > category_name\n" +
                "Click on breadcrumb it should redirect to respective page\"");
        Thread.sleep(10000);

        WebElement subMenu = driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
       System.out.println("breadcrumb.."+subMenu.getText());

    }

    public void Assending_order() throws InterruptedException {
        logger.info("Upward arrows should sort results in descending order and downward should sort it as ascending order.");
        Thread.sleep(10000);
        WebElement Assending = driver.findElement(By.xpath("//a[@title='Set Descending Direction'][contains(.,'Set Descending Direction')]"));
        if(Assending.isDisplayed()) {
            Actions ac = new Actions(driver);


            ac.moveToElement(Assending).click().build().perform();


        }
        else {
            Actions ac = new Actions(driver);

            WebElement dessending = driver.findElement(By.xpath("(//a[@title='Set Ascending Direction'])[2]"));
      ac.click(dessending).click().build().perform();
        }



    }
    public void addtocart() throws InterruptedException {
        logger.info("Product should get added into cart");
       // Thread.sleep(10000);
        Thread.sleep(50000);
        WebElement ele= driver.findElement(By.xpath("(//span[contains(.,'Add to Cart')])[2]"));
        ele.click();
        Thread.sleep(50000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        WebElement ele2= driver.findElement(By.xpath("//span[contains(.,'View Cart')]"));
        ele2.click();


    }
    public void Sort() throws InterruptedException {
        logger.info("It should get redirected to the category page and all respective products  should display on it");
        Thread.sleep(10000);

        WebElement Show= driver.findElement(By.xpath("(//select[contains(@id,'sorter')])[2]"));
        Select sele=new Select(Show);
        sele.selectByValue("name");


    }
    public void Show() throws InterruptedException {
        logger.info("By default 36 should be selected and results should be according to the selection. It should sort the results as per 24,36,72 items selected");
        Thread.sleep(10000);
//        JavascriptExecutor js1 = (JavascriptExecutor) driver;
//
//        js1.executeScript("window.scrollBy(0,2000)");
        WebElement Show= driver.findElement(By.xpath("//select[@class='limiter-options']"));
        Select sele=new Select(Show);
        sele.selectByValue("72");


    }

    public void Category_name() throws InterruptedException {
        logger.info("Application should display correct category name in the breadcrumb");

        Thread.sleep(10000);
        WebElement product_Name= driver.findElement(By.xpath("//span[contains(text(),'Alert Wristbands')]"));
        product_Name.getText();



    }
    public void Product_name() throws InterruptedException {
        logger.info("Product image, product name should be clear and distinct");

        Thread.sleep(10000);
        WebElement product_Name= driver.findElement(By.xpath("//a[contains(text(),'0.5625\"x12.8125\" Chartreuse, \"Cytotoxic Precaution')]"));
      System.out.println( product_Name.getText());



    }
    public void Product_tile() throws InterruptedException {
        logger.info("\"Product image, product name should be clear and distinct.\n" +
                "Ref no,View Details should be visible for guest users\"");

        Thread.sleep(10000);
        WebElement product_Name= driver.findElement(By.xpath("(//div[contains(@class,'product details product-item-details eln-product-item-details')])[1]"));
        System.out.println( "Detail:   " +product_Name.getText());



    }
    public void Product_tile_login() throws InterruptedException {
        logger.info("Product image, product name should be clear and distinct.\\n\" +\n" +
                "            \"Item,Ref no,Price,Add to cart and wishlist should be visible for logged in user \\\"");

        Thread.sleep(10000);
        WebElement product_Name= driver.findElement(By.xpath("(//div[contains(@class,'product details product-item-details eln-product-item-details')])[1]"));
        System.out.println( "Detail:   " +product_Name.getText());



    }

    public void CategoriesSection() throws InterruptedException {
        logger.info("It should redirect to respective category");

        Thread.sleep(10000);
        WebElement product_Name= driver.findElement(By.xpath("//ul[@id='category-tree']"));
        System.out.println( product_Name.getText());



    }
    public void shopbysection() throws InterruptedException {
        logger.info("\"When options \n" +
                "are selected it should display respective products\"");

        Thread.sleep(10000);
        Actions actions = new Actions(driver);
        WebElement product_Name= driver.findElement(By.xpath("(//span[@class='title '][contains(.,'0.562 in')])[2]"));
        actions.doubleClick(product_Name).perform();

        Thread.sleep(10000);

    }
    public void Learn_more() throws InterruptedException {
        logger.info("It should get redirected to the category page and all respective products  should display on it");
        Thread.sleep(10000);
        WebElement target= driver.findElement(By.xpath("//body/div[3]/main[1]/div[2]/div[1]/div[3]/span[1]/div[1]/ol[1]/li[1]/div[3]/div[1]/div[6]/div[1]/div[1]/a[1]"));
        target.click();



    }

    public void Learn_more_hover() throws InterruptedException {
        logger.info("It should get redirected to the category page and all respective products  should display on it");
        Thread.sleep(10000);

        WebElement target= driver.findElement(By.xpath("//body/div[3]/main[1]/div[2]/div[1]/div[3]/span[1]/div[1]/ol[1]/li[1]/div[3]/div[1]/div[6]/div[1]/div[1]/a[1]"));
        WebElement ele3= driver.findElement(By.xpath("//body/div[3]/main[1]/div[2]/div[1]/div[3]/span[1]/div[1]/ol[1]/li[18]/div[3]/div[1]/div[4]/div[1]/div[2]/a[1]"));
        // Actions a = new Actions(driver);
        Actions action = new Actions(driver);
        //moving to the main menu and then sub menu and clicking on it using object of the Actions class
        action.moveToElement(target).moveToElement(ele3).click();



    }




    public void Add_to_compare() throws InterruptedException {
        logger.info("It should get redirected to the category page and all respective products  should display on it");

        Thread.sleep(10000);

        WebElement target= driver.findElement(By.xpath("//body/div[3]/main[1]/div[2]/div[1]/div[3]/span[1]/div[1]/ol[1]/li[18]/div[3]/div[1]/div[4]/div[1]/div[1]/a[1]"));
        WebElement ele3= driver.findElement(By.xpath("//body/div[3]/main[1]/div[2]/div[1]/div[3]/span[1]/div[1]/ol[1]/li[10]/div[3]/div[1]/div[4]/div[1]/div[2]/a[2]"));
        // Actions a = new Actions(driver);
        Actions action = new Actions(driver);
//moving to the main menu and then sub menu and clicking on it using object of the Actions class
        action.moveToElement(target).moveToElement(ele3).click();

    }


}
