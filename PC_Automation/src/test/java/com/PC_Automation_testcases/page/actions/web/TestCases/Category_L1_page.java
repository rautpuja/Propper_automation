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

import java.util.List;

public class Category_L1_page {
    private static final Logger logger = LoggerFactory.getLogger(Checkout_page.class);

    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'New Address')]")
    @CacheLookup
    WebElement Add_New_address;



    public Category_L1_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void Subscribe() throws InterruptedException {
        logger.info("click on subscribe button");
        //  Thread.sleep(50000);
        //driver.switchTo().alert().dismiss();
        WebDriverWait wait = new WebDriverWait(driver,90);

        WebElement	ele=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='mageplaza-betterpopup-block']/div[@id='bio_ep']/div[1]/div[1]/img[1]")));
        ele.click();
        Thread.sleep(10000);
        WebElement ele4= driver.findElement(By.xpath("//button[@class='btn-cookie btn-cookie-accept']"));
        ele4.click();


    }

    public void Label_wristlist() throws InterruptedException {
        logger.info("\"It should get redirected to the respective page.\n" +
                "It should display the breadcrumb properly with Home >Category Name\n" +
                "\n" +
                "  \"");
          Thread.sleep(50000);

       WebElement category= driver.findElement(By.xpath("//span[contains(.,'Labels & Wristbands')]"));
       category.click();
        Thread.sleep(50000);
        System.out.println(driver.getTitle());
        WebElement bread= driver.findElement(By.xpath("//strong[contains(.,'Labels & Wristbands')]"));

          System.out.println(bread.getText());
    }
    public void Request_aquote_button() throws InterruptedException {
        logger.info("Button lable should be 'Request A Catalog'");
        Thread.sleep(50000);
        WebElement category= driver.findElement(By.xpath("//a[contains(.,'Request A Catalog')]"));
        category.click();
        Thread.sleep(50000);
        driver.navigate().back();

    }
public void Healthcare_shop_now_button() throws InterruptedException {
    logger.info("It should redirect to respective page");
    Thread.sleep(10000);
    WebElement alllinks = driver.findElement(By.xpath("//div[contains(@class,'top-category-list')]"));


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
    public void Faq() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(10000);
        WebElement alllinks = driver.findElement(By.xpath("//a[contains(.,'SEARCH FAQs')]"));
            alllinks.click();
        System.out.println(driver.getTitle());
        Thread.sleep(10000);
            driver.navigate().back();

}
    public void Related_section() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(30000);
        Actions ac=new Actions(driver);
        WebElement alllinks = driver.findElement(By.xpath("(//button[contains(@role,'button')])[3]"));
     alllinks.click();
        Thread.sleep(5000);
        WebElement alllinks1 = driver.findElement(By.xpath("(//a[@class='btn action primary button'])[5]"));
        alllinks1.click();





    }
    public void dots() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(10000);
        WebElement alllinks = driver.findElement(By.xpath("(//button[contains(@role,'button')])[2]"));
        alllinks.click();


    }
    public void login(String email,String pwd) throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Login to customer");

//        JavascriptExecutor js1 = (JavascriptExecutor) driver;
 JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,-10000)");
        driver.navigate().refresh();

//        WebElement button1= driver.findElement(By.xpath("//div[@class='leadin-content-body ']"));
//        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//        driver.switchTo().window(tabs2.get(0));
//        Thread.sleep(2000);
//        button1.click();

        Thread.sleep(50000);
        WebElement button= driver.findElement(By.xpath("//a[@class='link login']"));
       button.click();



        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement txtemail= driver.findElement(By.xpath("//input[@id='email']"));

        txtemail.sendKeys(email);

        WebElement txtPassword= driver.findElement(By.xpath("//input[@name='login[password]']"));

        txtPassword.sendKeys(pwd);
        WebElement btnLogin= driver.findElement(By.xpath("//button[@class='action login primary']"));
        btnLogin.click();
    }
        public void login_label() throws InterruptedException {
            Thread.sleep(50000);
            logger.info("Login to customer");
        Thread.sleep(50000);
        WebElement category= driver.findElement(By.xpath("//span[contains(.,'Labels & Wristbands')]"));
        category.click();


    }
    public void Download_catlog() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(10000);
        WebElement alllinks = driver.findElement(By.xpath("(//a[contains(@target,'_blank')])[3]"));
        alllinks.click();
        Thread.sleep(10000);
    }

    public void Logout() throws InterruptedException {
        logger.info("Logout from application");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
//        WebElement notice = driver.findElement(By.xpath("//button[@class='leadinModal-close']"));
//       ac.moveToElement(notice).click().build().perform();
//        Thread.sleep(10000);
        WebElement drop = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
drop.click();
        WebElement drop2 = driver.findElement(By.xpath("(//a[contains(.,'Sign Out')])[1]"));
       ac.moveToElement(drop2).click().build().perform();


    }
    public void Category_2() throws InterruptedException {
        logger.info("\"1. It should get redirected to the respective page.\n" +
                "It should display the breadcrumb properly with Home >Category Name\n" +
                "2.For ipad breadcrumb should not dispalyed\n" +
                "\n" +
                "  \"");
        Thread.sleep(10000);
        WebElement alllinks = driver.findElement(By.xpath("(//span[contains(.,'Disposable Tourniquets')])[2]"));
alllinks.click();


    }
    public void shop_now() throws InterruptedException {
        logger.info("Button label should be 'Shop Now'");
        Thread.sleep(10000);
        WebElement alllinks = driver.findElement(By.xpath("(//a[contains(.,'Shop Now')])[1]"));
        alllinks.click();
        System.out.println(driver.getTitle());
        Thread.sleep(10000);
        driver.navigate().back();



    }
    public void standered_turniquates() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(10000);
        WebElement alllinks = driver.findElement(By.xpath("//div[contains(@class,'top-category-list')]"));

      //  WebElement alllinks = driver.findElement(By.xpath("//div[@class='col-lg-9 footer-links']"));


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
    public void Search_FAQ() throws InterruptedException {
        logger.info("It should display content 'Need Help Finding a Product?' and button 'SEARCH FAQs'");
        Thread.sleep(10000);
        WebElement alllinks = driver.findElement(By.xpath("(//div[contains(@class,'content')])[9]"));
       System.out.println(alllinks.getText());



    }
    public void Search_FAQ_button() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(10000);
        WebElement alllinks = driver.findElement(By.xpath("//a[@class='btn button'][contains(.,'SEARCH FAQs')]"));
      alllinks.click();
        System.out.println(driver.getTitle());
      driver.navigate().back();



    }
    public void Related_section_2() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(10000);

        WebElement alllinks = driver.findElement(By.xpath("(//button[contains(@role,'button')])[2]"));
        alllinks.click();
        Thread.sleep(5000);
        WebElement alllinks1 = driver.findElement(By.xpath("(//a[contains(@target,'_blank')])[6]"));
        alllinks1.click();

    }
    public void dots_2() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(10000);
        WebElement alllinks = driver.findElement(By.xpath("(//button[contains(@role,'button')])[2]"));
        alllinks.click();


    }
    public void Category_3() throws InterruptedException {
        logger.info("\"It should get redirected to the respective page.\n" +
                "It should display the breadcrumb properly with Home >Category Name\n" +
                "\n" +
                "  \"");
        Thread.sleep(10000);
        WebElement alllinks = driver.findElement(By.xpath("(//span[contains(.,'Cohesive Bandages')])[2]"));

       alllinks.click();


    }
    public void shop_now_1() throws InterruptedException {
        logger.info("Button label should be 'Shop Now'");
        Thread.sleep(10000);
        WebElement alllinks = driver.findElement(By.xpath("(//a[contains(.,'Shop Now')])[1]"));
        alllinks.click();
        System.out.println(driver.getTitle());
        Thread.sleep(10000);
        driver.navigate().back();



    }
    public void Non_latex() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(10000);
        WebElement alllinks = driver.findElement(By.xpath("//div[contains(@class,'top-category-list')]"));


//        List<WebElement> Links = alllinks.findElements(By.tagName("a"));
//        int Count = Links.size();
//        System.out.println("Name: " + Count);
//        for (int i = 0; i < Links.size(); i++) {
//            Links.get(i).click();
//            System.out.println(driver.getTitle());
//            driver.navigate().back();
//
//
//            Thread.sleep(10000);
//            alllinks = driver.findElement(By.xpath("//div[contains(@class,'top-category-list')]"));
//
//            Links = alllinks.findElements(By.tagName("a"));
//
//        }
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
    public void Search_FAQ_1() throws InterruptedException {
        logger.info("It should display content 'Need Help Finding a Product?' and button 'SEARCH FAQs'");
        Thread.sleep(10000);
        WebElement alllinks = driver.findElement(By.xpath("(//div[contains(@class,'content')])[9]"));
        System.out.println(alllinks.getText());



    }
    public void Search_FAQ_button1() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(10000);
        WebElement alllinks = driver.findElement(By.xpath("//a[@class='btn button'][contains(.,'SEARCH FAQs')]"));
        alllinks.click();
        System.out.println(driver.getTitle());
        driver.navigate().back();



    }
    public void Related_section_3() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(10000);
        WebElement alllinks = driver.findElement(By.xpath("(//button[@role='button'])[2]"));
        alllinks.click();
        Thread.sleep(5000);

        WebElement alllinks1 = driver.findElement(By.xpath("(//a[contains(@class,'btn action primary button')])[4]"));
        alllinks1.click();

//

    }
    public void dots_3() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(10000);
        WebElement alllinks = driver.findElement(By.xpath("(//button[contains(@role,'button')])[2]"));
        alllinks.click();


    }
    public void Category_4_login() throws InterruptedException {
        logger.info("\"It should get redirected to the respective page.\n" +
                "It should display the breadcrumb properly with Home >Category Name\n" +
                "\n" +
                "  \"");
        Thread.sleep(10000);
        WebElement alllinks = driver.findElement(By.xpath("(//span[contains(.,'Cohesive Bandages')])[2]"));

        alllinks.click();


    }
    public void shop_now_2() throws InterruptedException {
        logger.info("Button label should be 'Shop Now'");
        Thread.sleep(10000);
        WebElement alllinks = driver.findElement(By.xpath("(//a[contains(.,'Shop Now')])[1]"));
        alllinks.click();
        System.out.println(driver.getTitle());
        Thread.sleep(10000);
        driver.navigate().back();



    }
    public void Non_latex1() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(10000);
        WebElement alllinks = driver.findElement(By.xpath("//div[contains(@class,'top-category-list')]"));


        List<WebElement> Links = alllinks.findElements(By.tagName("a"));
        int Count = Links.size();
        System.out.println("Name: " + Count);
        for (int i = 0; i < Links.size(); i++) {
            Links.get(i).click();
            System.out.println(driver.getTitle());
            driver.navigate().back();


            Thread.sleep(10000);
            alllinks = driver.findElement(By.xpath("//div[contains(@class,'top-category-list')]"));

            Links = alllinks.findElements(By.tagName("a"));

        }


    }
    public void Search_FAQ_2() throws InterruptedException {
        logger.info("It should display content 'Need Help Finding a Product?' and button 'SEARCH FAQs'");
        Thread.sleep(10000);
        WebElement alllinks = driver.findElement(By.xpath("(//div[contains(@class,'content')])[9]"));
        System.out.println(alllinks.getText());



    }
    public void Search_FAQ_button2() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(10000);
        WebElement alllinks = driver.findElement(By.xpath("//a[@class='btn button'][contains(.,'SEARCH FAQs')]"));
        alllinks.click();
        System.out.println(driver.getTitle());
        driver.navigate().back();



    }
    public void Related_section_4() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(10000);
        WebElement alllinks = driver.findElement(By.xpath("(//a[contains(@class,'btn action primary button')])[3]"));
        alllinks.click();
        Thread.sleep(10000);
//        driver.navigate().back();
//        Thread.sleep(10000);
//        WebElement alllinks1 = driver.findElement(By.xpath("(//a[contains(@target,'_blank')])[7]"));
//        alllinks1.click();

    }
    public void Request_acatlog() throws InterruptedException {
        logger.info("\"1. It should redirect to respective page\n" +
                "2.For  ipad Button should not dispalyed \"");
        Thread.sleep(10000);
        WebElement alllinks = driver.findElement(By.xpath("//a[@class='button btn no-backgroud'][contains(.,'Shop Now')]"));
        alllinks.click();


    }
}
