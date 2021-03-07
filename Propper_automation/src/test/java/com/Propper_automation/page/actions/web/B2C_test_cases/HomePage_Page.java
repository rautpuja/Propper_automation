package com.Propper_automation.page.actions.web.B2C_test_cases;

import com.Propper_automation.page.actions.web.HomePage;
import com.Propper_automation.utils.common.Config;
import com.Propper_automation.utils.selenium.WebUtils;
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

public class HomePage_Page {
    private static final Logger logger = LoggerFactory.getLogger(HomePage.class);
    private static final String APPLICATION_URL = Config.getProperty("appURL");

    private WebDriver driver;


    @FindBy(how = How.XPATH, using = "//button[@class='action subscribe primary']")
    @CacheLookup
    WebElement Subscribe_button;


    @FindBy(how = How.XPATH, using = "//input[contains(@name,'q')]")
    @CacheLookup
    WebElement search;


    public HomePage_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void Notice_text() throws InterruptedException {
        logger.info("On top of header section there should be a message 'Need Personal Protective Equipment? We’ve Got You Covered (Literally)!' with 'Browse PPE' button/link ");
        Thread.sleep(10000);

        WebDriverWait wait = new WebDriverWait(driver, 90);

        WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Need Personal Protective Equipment? We’ve Got You Covered (Literally)!')]")));
       System.out.println("Text is : "+ele.getText());



    }

    public void PPE_button() throws InterruptedException {
        logger.info("It should get redirected to respective page");
        Thread.sleep(10000);

        WebElement ele = driver.findElement(By.xpath("//span[contains(.,'Need Personal Protective Equipment? We’ve Got You Covered (Literally)!')]"));
      ele.click();
System.out.println(driver.getTitle());


    }
    public void Notice_text2() throws InterruptedException {
        logger.info("On top of header section there should be a message 'NO PAYMENT REQUIRED UNTIL DESIGN APPROVED! ' with 'Learn More' link ");
        Thread.sleep(10000);

        WebElement ele = driver.findElement(By.xpath("//div[contains(@class,'custom-promo-wrapper')]"));
        System.out.println("Text is : "+ele.getText());



    }

    public void Learn_more_link() throws InterruptedException {
        logger.info("It should get redirected to respective same page ");
        Thread.sleep(10000);

        WebElement ele = driver.findElement(By.xpath("//a[@title='Learn more'][contains(.,'Learn More')]"));
        ele.click();
        System.out.println("lINK IS : "+driver.getTitle());


    }
    public void Homepage_logo() throws InterruptedException {
        logger.info("It should get redirected to respective same page ");
        Thread.sleep(10000);

        WebElement ele = driver.findElement(By.xpath("//img[contains(@height,'43')]"));
        ele.click();



    }
    public void Search_text_box() throws InterruptedException {
        logger.info("\"The search text box should be present in the right hand side of 'Logo' and left hand side of 'Chat with us' with the watermark/placeholder field \"\"Search over 80,000 products\"\"\n" +
                "\" ");
        Thread.sleep(10000);

        WebElement ele = driver.findElement(By.xpath("//input[contains(@name,'q')]"));
        System.out.println(ele.getText());



    }
    public void Search_text_box_blank() throws InterruptedException {
        logger.info("Search icon should be disable and unable to Click");
        Thread.sleep(10000);

        WebElement ele = driver.findElement(By.xpath("//input[contains(@name,'q')]"));
      ele.sendKeys(Keys.ENTER);
        Thread.sleep(10000);
        driver.navigate().refresh();



    }
    public void Search_text_box_invalid() throws InterruptedException {
        logger.info("It should redirect to respective page and display message as \"No product found\" ");
        Thread.sleep(10000);
        WebElement ele = driver.findElement(By.xpath("//input[contains(@name,'q')]"));
        ele.sendKeys("78uu");
        ele.sendKeys(Keys.ENTER);
System.out.println("URL of the page : "+driver.getCurrentUrl());
    }
    public void Search_text_box_valid() throws InterruptedException {
        logger.info("Search Result page should display with correct result");
        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement ele = driver.findElement(By.xpath("//input[contains(@placeholder,'Search over 80,000 products')]"));
        ele.sendKeys(select);
        ele.sendKeys("bags");
        ele.sendKeys(Keys.ENTER);

        Thread.sleep(5000);

        System.out.println("URL is : "+driver.getCurrentUrl());

    }
    public void Chat_now_link() throws InterruptedException {
        logger.info("It shoud display a popup from bottom");
        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement ele = driver.findElement(By.xpath("//p[contains(.,'Chat with Us')]"));
       System.out.println(ele.getText());

//        WebElement ele2 = driver.findElement(By.xpath("//a[@href='javascript:LC_API.open_chat_window()']"));
//      ele2.click();
//        WebDriverWait wait = new WebDriverWait(driver,60) ;
//     WebElement ele5  = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@aria-label='Minimize window']")));
//
//        Thread.sleep(10000);
//        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//        driver.switchTo().window(tabs2.get(0));
//        Thread.sleep(2000);
//        ele5.click();

    }
    public void Phone_number() throws InterruptedException {
        logger.info("It shoud display a popup for phone call");
        Thread.sleep(5000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement ele = driver.findElement(By.xpath("(//a[@href='tel:888-206-3047'])[1]"));
       ele.click();

    }
    public void Header_mega() throws InterruptedException {
        logger.info("It should display  horizontal style menu with main navigation headings of All Products,Apparel,Bags,Drinkware,Home & Auto,Office,Technology,Shop By Brand,24-Hour Rush,On Sale and Hot Products");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("//span[contains(.,'All Products')]"));
        ac.moveToElement(ele).build().perform();
        System.out.println("Hover on All Products");
        Thread.sleep(10000);
        WebElement ele2 = driver.findElement(By.xpath("//span[contains(.,'Apparel')]"));
        ac.moveToElement(ele2).build().perform();
        System.out.println("Hover on Apparel");
        Thread.sleep(10000);
        WebElement ele3 = driver.findElement(By.xpath("//span[contains(.,'Bags')]"));
        ac.moveToElement(ele3).build().perform();
        System.out.println("Hover on Bags");
        Thread.sleep(10000);
        WebElement ele4 = driver.findElement(By.xpath("//span[contains(.,'Drinkware')]"));
        ac.moveToElement(ele4).build().perform();
        System.out.println("Hover on drinkware");
        Thread.sleep(10000);
        WebElement ele5 = driver.findElement(By.xpath("//span[contains(.,'Home & Auto')]"));
        ac.moveToElement(ele5).build().perform();
        System.out.println("Hover on Home and auto");
        Thread.sleep(10000);
        WebElement ele6 = driver.findElement(By.xpath("//span[contains(.,'Office')]"));
        ac.moveToElement(ele6).build().perform();
        System.out.println("Hover on office");
        Thread.sleep(10000);
        WebElement ele7 = driver.findElement(By.xpath("//span[contains(.,'Technology')]"));
        ac.moveToElement(ele7).build().perform();
        System.out.println("Hover on Technology");
        Thread.sleep(10000);
        WebElement ele8 = driver.findElement(By.xpath("//span[contains(.,'Shop by Brand')]"));
        ac.moveToElement(ele8).build().perform();
        System.out.println("Hover on shop by brand");
        Thread.sleep(10000);
        WebElement ele9 = driver.findElement(By.xpath("//span[contains(.,'24-Hour Rush')]"));
        ac.moveToElement(ele9).build().perform();
        System.out.println("Hover on 24 hour rush");
        Thread.sleep(10000);
        WebElement ele10 = driver.findElement(By.xpath("//span[contains(.,'Hot Products')]"));
        ac.moveToElement(ele10).build().perform();
        System.out.println("Hover on hot products");

    }
    public void mega_menu() throws InterruptedException {
        logger.info("\"1.It should display the drop-down which will consists of a list of category\n" +
                "2.Clicking on main menu category, it should redirect to product listing page\"");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement ele4 = driver.findElement(By.xpath("//span[contains(.,'Drinkware')]"));
        ac.moveToElement(ele4).click().build().perform();
        System.out.println("Title of the Drinkware :"+driver.getTitle());
        Thread.sleep(5000);
        WebUtils.navigateToURL(APPLICATION_URL);
    }
    public void mega_menu_submenu() throws InterruptedException {
        logger.info("It should get redirect to the respective page");
        Thread.sleep(10000);

        Actions ac=new Actions(driver);
        WebElement	ele= driver.findElement(By.xpath("//span[contains(.,'Bags')]"));
        ac.moveToElement(ele).build().perform();
        Thread.sleep(30000);
        WebElement	ele2= driver.findElement(By.xpath("//a[@title='Computer Bags'][contains(.,'Computer Bags')]"));
        ele2.click();
        System.out.println("Title of the Computer Bags :"+driver.getTitle());
        WebUtils.navigateToURL(APPLICATION_URL);
    }
    public void Verify_main_menu() throws InterruptedException {
        logger.info("\"It should dispaly four banner\n" +
                "1.Fave Fifty\n" +
                "2.24-HR Rush\n" +
                "3.On Sale\n" +
                "4.Not Germs\"");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement ele4 = driver.findElement(By.xpath("//div[contains(@class,'column main')]"));
       System.out.println("banner is"+ele4.getText());
    }
    public void Verify_main_banner_link() throws InterruptedException {
        logger.info("It should get redirect to respective page");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement alllinks = driver.findElement(By.xpath("//div[contains(@class,'column main')]"));

        List<WebElement> Links = alllinks.findElements(By.tagName("a"));
        int Count     = Links.size();
        System.out.println("count of links  : " +Count);
        for(int i=0;i<Links.size();i++) {
            String Opentabs = Keys.chord(Keys.CONTROL, Keys.ENTER);

            Links.get(i).sendKeys(Opentabs);

        }
        }
        public void Verify_promo() throws InterruptedException {
            logger.info("\"It should be display \n" +
                    "1.Buy Now, Pay Later\n" +
                    "2.STELLAR SERVICE\n" +
                    "3.100% SATISFACTION\n" +
                    "4.FAST SHIPPING\"");
            Thread.sleep(10000);
            Actions ac = new Actions(driver);
            WebElement alllinks = driver.findElement(By.xpath("(//div[contains(@class,'row promo-block')])[1]"));

         System.out.println(alllinks.getText());
}

    public void Verify_top_categories_section() throws InterruptedException {
        logger.info("\"It should be display four category\n" +
                "1.Work From Home Essentials\n" +
                "2.Personal Protective Equipment \n" +
                "3.Stress Relievers\n" +
                "4.Food Giveways\"");
        Thread.sleep(10000);
        Actions ac = new Actions(driver);
        WebElement alllinks = driver.findElement(By.xpath("(//div[contains(@class,'row promo-block')])[1]"));

        System.out.println(alllinks.getText());


        List<WebElement> Links = alllinks.findElements(By.tagName("a"));
        int Count     = Links.size();
        System.out.println("count of links :  " +Count);
        for(int i=0;i<Links.size();i++)
        {
            String Opentabs=Keys.chord(Keys.CONTROL,Keys.ENTER);

            Links.get(i).sendKeys(Opentabs);
            //  System.out.println(driver.getTitle());

        }
    }
    public void Verify_Featured_product() throws InterruptedException {
        logger.info("It should get redirect to respective page");
        Thread.sleep(10000);
        Actions ac = new Actions(driver);
        WebElement alllinks = driver.findElement(By.xpath("(//a[contains(@class,'product-item-link')])[1]"));
       ac.moveToElement(alllinks).click().build().perform();
        Thread.sleep(10000);
        System.out.println("title is : "+driver.getTitle());
        WebUtils.navigateToURL(APPLICATION_URL);
    }
    public void Verify_add_to_wishlist() throws InterruptedException {
        logger.info("It should display a success message 'product_name has been added to your Wish List. Click here to continue shopping.' and added to wish list");
        Thread.sleep(10000);
        Actions ac = new Actions(driver);
        WebElement alllinks = driver.findElement(By.xpath("(//span[contains(.,'Add to Wish List')])[1]"));
        alllinks.click();
//        WebElement mes = driver.findElement(By.xpath("//div[contains(@data-bind,'html: message.text')]"));
//        System.out.println("Wishlist message : "+mes.getText());
    }
    public void Verify_Top_50_link() throws InterruptedException {
        logger.info("It should get redirect to respective page");
        Thread.sleep(10000);
        Actions ac = new Actions(driver);
        WebElement alllinks = driver.findElement(By.xpath("//a[contains(@title,'View the Fave 50')]"));
        alllinks.click();
        Thread.sleep(10000);
        System.out.println("title is : "+driver.getTitle());
        WebUtils.navigateToURL(APPLICATION_URL);
    }
    public void Verify_shop_with_confidence() throws InterruptedException {
        logger.info("\"It should display 2 section\n" +
                "1.Have questions?\n" +
                "2.Meet Our Team >\"");
        Thread.sleep(10000);
        Actions ac = new Actions(driver);
        WebElement alllinks = driver.findElement(By.xpath("//div[contains(@class,'company-team')]"));
       System.out.println(" Shop with confidence: "+alllinks.getText());
    }
    public void Verify_phone_number() throws InterruptedException {
        logger.info("\"1. It should display a popup\n" +
                "2. it should redirect to respective page\"");
        Thread.sleep(10000);
        Actions ac = new Actions(driver);
        WebElement alllinks = driver.findElement(By.xpath("//a[@title='call'][contains(.,'888-206-3047')]"));
       alllinks.click();
       WebUtils.refreshBrowser();
    }
    public void Verify_meet_out_team() throws InterruptedException {
        logger.info("\"1. It should display a popup\n" +
                "2. it should redirect to respective page\"");
        Thread.sleep(10000);
        Actions ac = new Actions(driver);
        WebElement alllinks = driver.findElement(By.xpath("//a[@title='Meet Our Team'][contains(.,'Meet Our Team >')]"));
        alllinks.click();
        System.out.println("title is : "+driver.getTitle());
        Thread.sleep(10000);

        WebUtils.navigateToURL(APPLICATION_URL);
    }

    public void Verify_footer_section() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(10000);
        Actions ac = new Actions(driver);
        WebElement alllinks = driver.findElement(By.xpath("//div[contains(@class,'block-2 block-container')]"));

        List<WebElement> Links = alllinks.findElements(By.tagName("a"));
        int Count = Links.size();
        System.out.println("count of links :  " + Count);
        for (int i = 0; i < Links.size(); i++) {
            String Opentabs = Keys.chord(Keys.CONTROL, Keys.ENTER);

            Links.get(i).sendKeys(Opentabs);
            //  System.out.println(driver.getTitle());

        }
    }

    public void Verify_Better_business_logo() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(10000);
        Actions ac =new Actions(driver);
        WebElement alllinks = driver.findElement(By.xpath("//img[contains(@alt,'Business')]"));
       ac.moveToElement(alllinks).click().build().perform();
}
    public void Verify_Northan_logo() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(10000);
        Actions ac =new Actions(driver);
        WebElement alllinks = driver.findElement(By.xpath("//img[contains(@alt,'Norton')]"));
        ac.moveToElement(alllinks).click().build().perform();
    }
    public void Verify_Copyright() throws InterruptedException {
        logger.info("It should display with © 2021 Blue Soda Promo — All rights reserved. 800 S. Northpoint Blvd Waukegan IL, 60085. Privacy Policy");
        Thread.sleep(10000);
        WebElement alllinks = driver.findElement(By.xpath("//small[contains(@class,'copyright')]"));
       System.out.println(" Copyright is : "+alllinks.getText());
    }
    public void Verify_privacy_policy() throws InterruptedException {
        logger.info("It should display a popup");
        Thread.sleep(10000);
        WebElement alllinks = driver.findElement(By.xpath("//a[contains(@class,'pp_link')]"));
       alllinks.click();
        System.out.println("title is : "+driver.getTitle());
    }
}