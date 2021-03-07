package com.U_line.page.actions.web.Retailer;

import com.U_line.page.actions.web.HomePage;
import com.U_line.utils.common.Config;
import com.U_line.utils.selenium.WebUtils;
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

public class HomePage_Page {
    private static final Logger logger= LoggerFactory.getLogger(HomePage.class);
    private static final String APPLICATION_URL = Config.getProperty("appURL");

    private WebDriver driver;

    @FindBy(how = How.XPATH, using="//a[.='Provider Login' and not(@title)]")
    @CacheLookup
    WebElement providerlogin;

//
    @FindBy(how = How.XPATH, using="//header/div[2]/div[3]/div[1]/div[2]/nav[1]/div[1]/strong[1]/img[1]")
    @CacheLookup
    WebElement Homepage_logo;
//
//

    @FindBy(how = How.XPATH, using="//header/div[2]/div[2]/a[1]/i[1]")
    @CacheLookup
    WebElement Search_icon;
//
//

    @FindBy(how = How.XPATH, using="//a[@id='minicart_container']")
    @CacheLookup
    WebElement mini_cart;

//
//
    @FindBy(how = How.XPATH, using="//input[@id='search_481924']")
    @CacheLookup
    WebElement Search_box;

    @FindBy(how = How.XPATH, using="//a[@id='minicart_container']")
    @CacheLookup
    WebElement Mini_cart;



    @FindBy(how = How.XPATH, using="(//a[contains(@title,'Learn More')])[1]")
    @CacheLookup
    WebElement Learn_more_bullet;



    @FindBy(how = How.XPATH, using="//body/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/span[1]")
    @CacheLookup
    WebElement bullet_2;



    @FindBy(how = How.XPATH, using="(//a[contains(.,'Explore')])[1]")
    @CacheLookup
    WebElement Explore_bullet;



    @FindBy(how = How.XPATH, using="(//a[@title='Shop Now'])[2]")
    @CacheLookup
    WebElement shop_now_bullet;



    @FindBy(how = How.XPATH, using="//body/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/span[1]")
    @CacheLookup
    WebElement bullet_3;



    @FindBy(how = How.XPATH, using="//body/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/span[1]")
    @CacheLookup
    WebElement Bullet_4;



    @FindBy(how = How.XPATH, using="(//a[contains(@title,'View the Collection')])[2]")
    @CacheLookup
    WebElement view_collection_bullet;



    @FindBy(how = How.XPATH, using="//a[contains(text(),'Find the Perfect Fit')]")
    @CacheLookup
    WebElement find_a_perfect_fit;



    @FindBy(how = How.XPATH, using="//button[contains(text(),'Go')]")
    @CacheLookup
    WebElement Go_button;



    @FindBy(how = How.XPATH, using="//a[contains(text(),'Register Now')]")
    @CacheLookup
    WebElement Register_now_button;

    @FindBy(how = How.XPATH, using="//a[contains(text(),'Order Now')]")
    @CacheLookup
    WebElement Order_now_button;
    @FindBy(how = How.XPATH, using="//a[contains(text(),'Read Our Story')]")
    @CacheLookup
    WebElement Read_our_story_button;
    @FindBy(how = How.XPATH, using="//a[contains(text(),'Buy Now')]")
    @CacheLookup
    WebElement Buy_now_thumbnail;
    @FindBy(how = How.XPATH, using="//body/div[1]/div[5]/div[2]/div[1]/div[1]/a[1]")
    @CacheLookup
    WebElement Explore_thumbnail;
    @FindBy(how = How.XPATH, using="//body/div[1]/div[6]/div[1]/div[1]/div[1]/a[1]")
    @CacheLookup
    WebElement view_collection_thumbnail;
    @FindBy(how = How.XPATH, using="//a[contains(text(),'Follow')]")
    @CacheLookup
    WebElement Follow_thumbnail;
    @FindBy(how = How.XPATH, using="//body/div[1]/div[7]/div[2]/div[1]/div[1]/a[1]")
    @CacheLookup
    WebElement Learn_more_thumbnail;

    @FindBy(how = How.XPATH, using="//i[@class='porto-icon-facebook']")
    @CacheLookup
    WebElement Face_book;


    @FindBy(how = How.XPATH, using="//i[@class='porto-icon-twitter']")
    @CacheLookup
    WebElement Twitter;

    @FindBy(how = How.XPATH, using="//body/div[1]/footer[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/a[3]/i[1]")
    @CacheLookup
    WebElement Instagram;


    @FindBy(how = How.XPATH, using="//i[@class='porto-icon-youtube']")
    @CacheLookup
    WebElement You_tube;


    @FindBy(how = How.XPATH, using="//i[@class='porto-icon-linkedin-squared']")
    @CacheLookup
    WebElement LinkedIn;


    @FindBy(how = How.XPATH, using="//i[@class='porto-icon-pinterest']")
    @CacheLookup
    WebElement Pinrest;


    @FindBy(how = How.XPATH, using="//body/div[1]/footer[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/strong[1]/span[1]")
    @CacheLookup
    WebElement Product_li_page;

    @FindBy(how = How.XPATH, using="//body/div[1]/footer[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/strong[1]/span[1]")
    @CacheLookup
    WebElement Baverage_center_footer;
    @FindBy(how = How.XPATH, using="//a[contains(text(),'Wine Refrigerators')]")
    @CacheLookup
    WebElement Wine_refrigorator_footer;
    @FindBy(how = How.XPATH, using="//a[contains(text(),'Ice Machines')]")
    @CacheLookup
    WebElement Ice_matchine_footer;

    @FindBy(how = How.XPATH, using="//body/div[1]/footer[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]")
    @CacheLookup
    WebElement Refrigorator_footer;

    @FindBy(how = How.XPATH, using="//a[contains(text(),'Freezers')]")
    @CacheLookup
    WebElement Freezers_footer;

    @FindBy(how = How.XPATH, using="//i[@class='fab fa-houzz']")
    @CacheLookup
    WebElement Houzz;

    @FindBy(how = How.XPATH, using="//a[contains(text(),'Dispensers')]")
    @CacheLookup
    WebElement Dispensers_footer;

    @FindBy(how = How.XPATH, using="//a[contains(text(),'Outdoor')]")
    @CacheLookup
    WebElement Outdoor_footer;

    @FindBy(how = How.XPATH, using="//a[contains(text(),'Commercial')]")
    @CacheLookup
    WebElement Commercial_footer;

    @FindBy(how = How.XPATH, using="//a[contains(text(),'ADA')]")
    @CacheLookup
    WebElement ADA_footer;

    @FindBy(how = How.XPATH, using="//a[contains(text(),'Marine')]")
    @CacheLookup
    WebElement Marine;

    @FindBy(how = How.XPATH, using="//a[contains(text(),'Global 230v')]")
    @CacheLookup
    WebElement Global_footer;

    @FindBy(how = How.XPATH, using="//body/div[1]/footer[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[12]/a[1]")
    @CacheLookup
    WebElement U_chill_footer;

    @FindBy(how = How.XPATH, using="//a[contains(text(),'About Us')]")
    @CacheLookup
    WebElement About_us_footer;

    @FindBy(how = How.XPATH, using="//a[contains(text(),'Request a Brochure')]")
    @CacheLookup
    WebElement Request_a_brochure;

    @FindBy(how = How.XPATH, using="//body/div[1]/footer[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[3]")
    @CacheLookup
    WebElement U_line_lifestyle_blog_footer;


    @FindBy(how = How.XPATH, using="//a[contains(text(),'Built-In to Stand Out')]")
    @CacheLookup
    WebElement build_into_stand_out_footer;


    @FindBy(how = How.XPATH, using="//a[contains(text(),'Modular Refrigeration')]")
    @CacheLookup
    WebElement Modular_refrigeration_footer;


    @FindBy(how = How.XPATH, using="//body/div[1]/footer[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[6]")
    @CacheLookup
    WebElement Propper_preservation;


    @FindBy(how = How.XPATH, using="//body/div[1]/footer[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[7]")
    @CacheLookup
    WebElement Trade_and_media;


    @FindBy(how = How.XPATH, using="//a[contains(text(),'Continuing Education')]")
    @CacheLookup
    WebElement Continuing_Education;


    @FindBy(how = How.XPATH, using="//a[contains(text(),'Press Releases')]")
    @CacheLookup
    WebElement Press_Releases;


    @FindBy(how = How.XPATH, using="//a[contains(text(),'Careers')]")
    @CacheLookup
    WebElement Career;

    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Serial Number')]")
    @CacheLookup
    WebElement Searial_Number;

    @FindBy(how = How.XPATH, using="//input[@placeholder='1714862050527']")
    @CacheLookup
    WebElement Serialnumber;

    @FindBy(how = How.XPATH, using="//button[@id='el_search']")
    @CacheLookup
    WebElement search;



    @FindBy(how = How.XPATH, using="//header/div[2]/div[3]/div[1]/div[2]/nav[1]/ul[1]/li[2]/a[1]/span[1]")
    @CacheLookup
    WebElement Parts_and_accessories;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'View Cart')]")
    @CacheLookup
    WebElement viewcart;


    @FindBy(how = How.XPATH, using="//a[contains(text(),'Find a Dealer')]")
    @CacheLookup
    WebElement Find_a_Dealer;


    @FindBy(how = How.XPATH, using="//a[contains(text(),'Find a Servicer')]")
    @CacheLookup
    WebElement Find_a_servicer;


    @FindBy(how = How.XPATH, using="//body/div[1]/footer[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/ul[1]/li[3]")
    @CacheLookup
    WebElement Product_registration;


    @FindBy(how = How.XPATH, using="//a[contains(text(),'Parts & Accessories')]")
    @CacheLookup
    WebElement Parts_and_accessories1;



    @FindBy(how = How.XPATH, using="//a[contains(text(),'Manuals & Guides')]")
    @CacheLookup
    WebElement Manuals_and_guides;




    @FindBy(how = How.XPATH, using="//a[contains(text(),'Provider Login')]")
    @CacheLookup
    WebElement Provider_login;




    @FindBy(how = How.XPATH, using="//a[contains(text(),'Shipping & Returns')]")
    @CacheLookup
    WebElement Shipping_and_returns;



    @FindBy(how = How.XPATH, using="//a[contains(text(),'Privacy Policy')]")
    @CacheLookup
    WebElement Privacy_policy;

    @FindBy(how = How.XPATH, using="//a[contains(text(),'Terms & Conditions')]")
    @CacheLookup
    WebElement Terms_and_conditions;


    @FindBy(how = How.XPATH, using="//a[contains(text(),'CA Prop 65')]")
    @CacheLookup
    WebElement CA_prop_65_footer;


    @FindBy(how = How.XPATH, using="//a[contains(text(),'Contact Us')]")
    @CacheLookup
    WebElement Contact_us_footer;


    @FindBy(how = How.XPATH, using="//a[@id='totop']")
    @CacheLookup
    WebElement Top_button;


    @FindBy(how = How.XPATH, using="//a[@title='Remove']")
    @CacheLookup
    WebElement Cross_icon;


    @FindBy(how = How.XPATH, using="//button[@class='action-secondary action-dismiss']")
    @CacheLookup
    WebElement Cancel_button;

    @FindBy(css ="body.cms-uline-homepage.cms-index-index.page-layout-1column.layout-fullwidth.wide._has-modal:nth-child(2) div.modals-wrapper:nth-child(7) aside.modal-popup.confirm._show:nth-child(2) div.modal-inner-wrap:nth-child(2) header.modal-header > button.action-close")
    @CacheLookup
    WebElement Closs_button;


    @FindBy(how = How.XPATH, using="//button[@class='action-primary action-accept']")
    @CacheLookup
    WebElement ok_button;


    public HomePage_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void Home_page_logo() {

        logger.info("\"1. It should properly display the U-Line logo.\n" +
                "2.It should redirect to home page\"");
        WebElement ele= driver.findElement(By.xpath("//img[@class='default-logo']"));
       System.out.println(ele.getText());

    }
    public void product() {

        logger.info("\"1.It should display the drop-down which will consists of a list of category\n" +
                "2.Clicking on main menu category, it should redirect to product listing page\"");
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//a[.='Products' and not(@title)]"));
        action.moveToElement(we).build().perform();
    }

    public void parts_and_accessories() throws InterruptedException {

        logger.info("");
        Thread.sleep(9000);
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//span[contains(text(),'Parts & Accessories')]"));
        action.moveToElement(we).build().perform();
    }

    public void Support() throws InterruptedException {

        logger.info("");
        Thread.sleep(9000);
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//header/div[2]/div[3]/div[1]/div[2]/nav[1]/ul[1]/li[3]/a[1]/span[1]"));
        action.moveToElement(we).build().perform();
    }

    public void Find_Locally() throws InterruptedException {

        logger.info("");
        Thread.sleep(9000);
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//span[contains(text(),'Find Locally')]"));
        action.moveToElement(we).build().perform();
    }
    public void Uline_lifestyle() throws InterruptedException {

        logger.info("");
        Thread.sleep(9000);
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//span[contains(text(),'U-Line Lifestyle')]"));
        action.moveToElement(we).build().perform();
    }

    public void Search_icon() throws InterruptedException {

        logger.info("\"The search popup should open below the header section with cross/remove button.The search icon should be present in the top right of header section with the watermark/placeholder field \"\"Search...\"\"\n" +
                "\"");
       Thread.sleep(10000);
       Search_icon.click();
    }

    public void Mini_cart() throws InterruptedException {

        logger.info("If product is added in cart it should be display product, if not it should display 'You have no items in your shopping cart.' message.");
        Thread.sleep(10000);
        Mini_cart.click();
    }

    public void Search_box() throws InterruptedException {

        logger.info("Search icon should be disable.and unable to click");
        Thread.sleep(10000);
        WebElement searchbox= driver.findElement(By.xpath("//input[@placeholder='Search...']"));
        searchbox.sendKeys(Keys.ENTER);
    }

    public void Search_box_invalid_data() throws InterruptedException {

        logger.info("It should display message as \"No product found\"");
        Thread.sleep(50000);
        Actions ac=new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[contains(@class,'porto-icon-search')]")));
     ac.moveToElement(element).click().build().perform();
        Thread.sleep(70000);
        WebElement searchbox= driver.findElement(By.xpath("//input[@placeholder='Search...']"));
        searchbox.sendKeys("test");
        Thread.sleep(6000);
        searchbox.sendKeys(Keys.ENTER);
    }


    public void Search_box_valid_data() throws InterruptedException {

        logger.info("Search Result page should display with correct result");
        Thread.sleep(40000);
        Actions ac=new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[contains(@class,'porto-icon-search')]")));
        ac.moveToElement(element).click().build().perform();
        Thread.sleep(50000);
        String select = Keys.chord(Keys.CONTROL, "a");

        WebElement searchbox= driver.findElement(By.xpath("//input[@placeholder='Search...']"));
       searchbox.sendKeys(select);
        searchbox.sendKeys("Wine");

        Thread.sleep(6000);
        searchbox.sendKeys(Keys.ENTER);

    }

    public void Top_button() throws InterruptedException {

        logger.info("It should scroll up on top of the homepage");
        Thread.sleep(60000);
        //  Thread.sleep(4000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");

        WebElement ele= driver.findElement(By.xpath("//a[@id='totop']"));
        ele.click();

    }





    public void Bullet_tab_1() throws InterruptedException {

        logger.info("It should get redirect to the respective proper Preservation page");
        Thread.sleep(50000);
//        WebElement ele= driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/span[1]"));
//       ele.click();
        Actions ac1= new Actions(driver);
        ac1.moveToElement(  Learn_more_bullet).click().build().perform();

        Thread.sleep(6000);
        WebUtils.navigateToURL(APPLICATION_URL);

    }



    public void Bullet_tab_2() throws InterruptedException {

        logger.info("It should get redirect to the respective dispensers page");
        Thread.sleep(50000);
        Actions ac= new Actions(driver);

        Actions ac1= new Actions(driver);
        ac1.moveToElement(Explore_bullet).click().build().perform();

        Thread.sleep(9000);
        WebUtils.navigateToURL(APPLICATION_URL);


    }

    public void Bullet_tab_3() throws InterruptedException {

        logger.info("It should get redirect to the respective 'U-Chill'  page");
        Thread.sleep(20000);
          WebElement ele= driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[3]/span[1]"));
       ele.click();
        Thread.sleep(5000);

        shop_now_bullet.click();
        Thread.sleep(60000);
        WebUtils.navigateToURL(APPLICATION_URL);

    }

    public void bullet_tab_4() throws InterruptedException {

        logger.info("It should get redirect to the respective Nugget Ice Machines page");
        Thread.sleep(50000);
        WebElement ele= driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[4]/span[1]"));
        ele.click();
        Thread.sleep(5000);
        view_collection_bullet.click();

        Thread.sleep(9000);
        WebUtils.navigateToURL(APPLICATION_URL);

    }

    public void Find_perfect_fit() throws InterruptedException {

        logger.info("\"Browse Products with Find The Perfect Fit button - redirect to category(L1) page\n");
        Thread.sleep(60000);
        find_a_perfect_fit.click();
        WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
        System.out.println(ele.getText());
        Thread.sleep(20000);
        driver.navigate().back();


    }

    public void Zip_code() throws InterruptedException {

        logger.info("Find Locally with Go button - In both condition it should be redirect to retailer or servicer page");
        Thread.sleep(60000);
        Go_button.click();
        Thread.sleep(20000);
      //  WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
     //   System.out.println(ele.getText());
        driver.navigate().back();
        Thread.sleep(20000);

    }

    public void Registration_page() throws InterruptedException {

        logger.info("Register Your Product with Register button - redirect to Product Registration page");
        Thread.sleep(60000);
        Register_now_button.click();
        Thread.sleep(20000);
    //    WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
     //   System.out.println(ele.getText());
        driver.navigate().back();
        Thread.sleep(20000);


    }

    public void Order_now() throws InterruptedException {

        logger.info("Parts & Accessories with Oder Now button - redirect to Parts & Accessories page");
        Thread.sleep(60000);
       Order_now_button.click();
      //  WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
      //  System.out.println(ele.getText());
        Thread.sleep(20000);
        driver.navigate().back();


    }

    public void Read_our_story() throws InterruptedException {

        logger.info("It should be redirect to about us page");
        Thread.sleep(60000);
        Read_our_story_button.click();
        WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
        System.out.println(ele.getText());
        Thread.sleep(20000);
        driver.navigate().back();
    }

    public void Buy_now() throws InterruptedException {

        logger.info("\"It should display with clear and distinct images and get redirect to U-Chill page\n");
        Thread.sleep(30000);
        Buy_now_thumbnail.click();

        Thread.sleep(10000);
       // driver.navigate().back();


    }

    public void Explore_thumbnail() throws InterruptedException {

        logger.info("It should display with clear and distinct images and redirect to Nugget Ice Machines page");
        Thread.sleep(90000);
     Actions ac=new Actions(driver);
        WebElement ele= driver.findElement(By.xpath("//a[contains(@title,'Explore')]"));
       ac.moveToElement(ele).click().build().perform();
        Thread.sleep(10000);
        WebUtils.navigateToURL(APPLICATION_URL);
    }

    public void View_the_collection_thumbnail() throws InterruptedException {

        logger.info("It should display with clear and distinct images and redirect to 5 Class Collection page");
        Thread.sleep(90000);
        Actions ac=new Actions(driver);
        WebElement ele= driver.findElement(By.xpath("//a[@class='btn btn-button white'][contains(.,'View the Collection')]"));
        ac.moveToElement(ele).click().build().perform();
       // WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
      //  System.out.println(ele.getText());
        Thread.sleep(50000);
        WebUtils.navigateToURL(APPLICATION_URL);
    }

    public void Follow_thumbnail() throws InterruptedException {

        logger.info("\"It should display with clear and distinct images and get redirect to U-Line Lifestyle page\n" +
                "\"");
        Thread.sleep(90000);
        Actions ac=new Actions(driver);
        WebElement ele= driver.findElement(By.xpath("//a[@class='btn btn-button white'][contains(.,'Follow')]"));
        ac.moveToElement(ele).click().build().perform();
     //   WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
      //  System.out.println(ele.getText());
        Thread.sleep(90000);
        WebUtils.navigateToURL(APPLICATION_URL);
    }

    public void Learn_more_thumbnail() throws InterruptedException {

        logger.info("It should display with clear and distinct images and get redirect to https://www.aecdaily.com/ page");
        Thread.sleep(50000);
        Actions ac=new Actions(driver);
        WebElement ele= driver.findElement(By.xpath("//a[@class='btn btn-button white'][contains(.,'Learn More')]"));
        ac.moveToElement(ele).click().build().perform();
        Thread.sleep(30000);
        WebUtils.navigateToURL(APPLICATION_URL);
    }

    public void Social_media_icon_FB() throws InterruptedException {

        logger.info("It  should redirect to Facebook");
        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        WebDriverWait wait = new WebDriverWait(driver,30);

        WebElement	ele=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='porto-icon-facebook']")));


        //WebElement ele= driver.findElement(By.cssSelector("#customer-email"));

        //WebElement ele1= driver.findElement(By.xpath("//input[@name='payment[method]']"));
        ele.click();
      //  ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
      //  driver.switchTo().window(tabs.get(1)); //switches to new tab


      //  driver.switchTo().window(tabs.get(0));
    }
    public void Social_media_icon_Twitter() throws InterruptedException {

        logger.info("It  should redirect to Twitter");
        Thread.sleep(50000);
        WebDriverWait wait = new WebDriverWait(driver,30);

        WebElement	ele=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='porto-icon-twitter']")));


        ele.click();
        //  ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        //  driver.switchTo().window(tabs.get(1)); //switches to new tab


        //  driver.switchTo().window(tabs.get(0));
      //  Twitter.click();

      //  driver.switchTo().window(tabs.get(0));
    }

    public void Social_media_icon_Insta() throws InterruptedException {

        logger.info("It  should redirect to Instagram");

        WebDriverWait wait = new WebDriverWait(driver,30);

        WebElement	ele=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[1]/footer[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/a[3]/i[1]")));


        ele.click();

       // ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
      //  driver.switchTo().window(tabs.get(1)); //switches to new tab
     //   Instagram.click();

       // driver.switchTo().window(tabs.get(0));
    }

    public void Social_media_icon_You_tube() throws InterruptedException {

        logger.info("It  should redirect to You_tube");

        Thread.sleep(50000);

      //  ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
      //  driver.switchTo().window(tabs.get(1)); //switches to new tab
        You_tube.click();

      //  driver.switchTo().window(tabs.get(0));
    }

    public void Social_media_icon_Linkedin() throws InterruptedException {

        logger.info("It  should redirect to Linkedin");

        Thread.sleep(50000);

      //  ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
      //  driver.switchTo().window(tabs.get(1)); //switches to new tab
        LinkedIn.click();

      //  driver.switchTo().window(tabs.get(0));
    }

    public void Social_media_icon_Pinrest() throws InterruptedException {

        logger.info("It  should redirect to Pinrest");

        Thread.sleep(50000);

       // ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
      //  driver.switchTo().window(tabs.get(1)); //switches to new tab
        Pinrest.click();

        //driver.switchTo().window(tabs.get(0));
    }

    public void Social_media_icon_Houzz() throws InterruptedException {

        logger.info("It  should redirect to Houzz");

        Thread.sleep(50000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
      //  ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
      //  driver.switchTo().window(tabs.get(1)); //switches to new tab
        Houzz.click();

        //driver.switchTo().window(tabs.get(0));
    }

    public void Email_subsrcibe_blank() throws InterruptedException {

        logger.info("\"This is required field\"  message should dispaly");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        WebElement ele= driver.findElement(By.xpath("//span[contains(.,'Subscribe')]"));
     ele.click();
    }

    public void Email_subsribe_invalid() throws InterruptedException {

        logger.info("Invalid data - PLEASE ENTER A VALID EMAIL ADDRESS (EX: JOHNDOE@DOMAIN.COM). error message should disp;ay");
       // Thread.sleep(90000);
        Thread.sleep(20000);

        WebElement ele= driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
        ele.sendKeys("puja2upbott.com");
        WebElement ele2= driver.findElement(By.xpath("//span[contains(.,'Subscribe')]"));
        ele2.click();
    }

    public void Email_subsribe_valid() throws InterruptedException {

        logger.info("Invalid data - PLEASE ENTER A VALID EMAIL ADDRESS (EX: JOHNDOE@DOMAIN.COM). error message should disp;ay");

        Thread.sleep(20000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement ele1= driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
        ele1.sendKeys(select);
        ele1.sendKeys("puja@upbott.com");
        WebElement ele= driver.findElement(By.xpath("//span[contains(.,'Subscribe')]"));
        ele.click();
    }


    public void Product_li_page_footer() throws InterruptedException {

        logger.info("It should redirect to respective page");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Product_li_page.click();
    //    WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
     //   System.out.println(ele.getText());
        Thread.sleep(20000);
        driver.navigate().back();

    }


    public void Beverage_footer() throws InterruptedException {

        logger.info("It should redirect to respective page");

        Thread.sleep(50000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        WebElement ele= driver.findElement(By.xpath("//a[contains(text(),'Beverage Centers')]"));
        ele.click();
//        WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
//        System.out.println(ele.getText());
        Thread.sleep(20000);
        driver.navigate().back();



    }


    public void Wine_refrigorator_footer() throws InterruptedException {

        logger.info("It should redirect to respective page");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Wine_refrigorator_footer.click();
//        WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
//        System.out.println(ele.getText());
        Thread.sleep(20000);
        driver.navigate().back();

    }


    public void Ice_matchine_footer() throws InterruptedException {


        logger.info("It should redirect to respective page");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Ice_matchine_footer.click();
//        WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
//        System.out.println(ele.getText());
        Thread.sleep(20000);
        driver.navigate().back();

    }


    public void Refrigorator_footer() throws InterruptedException {


        logger.info("It should redirect to respective page");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Refrigorator_footer.click();
//        WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
//        System.out.println(ele.getText());
        Thread.sleep(20000);
        driver.navigate().back();

    }


    public void Freezers_footere() throws InterruptedException {

        logger.info("It should redirect to respective page");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Freezers_footer.click();
//        WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
//        System.out.println(ele.getText());
        Thread.sleep(20000);
        driver.navigate().back();

    }


    public void Dispensores_footer() throws InterruptedException {

        logger.info("It should redirect to respective page");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Dispensers_footer.click();
    //    WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
     //   System.out.println(ele.getText());
        Thread.sleep(20000);
        driver.navigate().back();

    }


    public void Outdoor_footer() throws InterruptedException {


        logger.info("It should redirect to respective page");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Outdoor_footer.click();
      //  WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
       // System.out.println(ele.getText());
        Thread.sleep(20000);
        driver.navigate().back();

    }


    public void Commercial_footer() throws InterruptedException {


        logger.info("It should redirect to respective page");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Commercial_footer.click();
       // WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
       // System.out.println(ele.getText());
        Thread.sleep(20000);
        driver.navigate().back();

    }


    public void ADA_footer() throws InterruptedException {

        logger.info("It should redirect to respective page");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        ADA_footer.click();
      //  WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
        //System.out.println(ele.getText());
        Thread.sleep(20000);
        driver.navigate().back();

    }


    public void marine_footer() throws InterruptedException {


        logger.info("It should redirect to respective page");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Marine.click();
      //  WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
      //  System.out.println(ele.getText());
        Thread.sleep(20000);
        driver.navigate().back();

    }


    public void Global_footer() throws InterruptedException {


        logger.info("It should redirect to respective page");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Global_footer.click();
      //  WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
        //System.out.println(ele.getText());
        Thread.sleep(20000);
        driver.navigate().back();

    }


    public void U_chill_footer() throws InterruptedException {


        logger.info("It should redirect to respective page");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        U_chill_footer.click();
        Thread.sleep(20000);
       // WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
        //System.out.println(ele.getText());
        driver.navigate().back();

    }


    public void about_us_footer() throws InterruptedException {


        logger.info("It should redirect to respective page");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        About_us_footer.click();
        Thread.sleep(20000);
      //  WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
        //System.out.println(ele.getText());
        driver.navigate().back();

    }


    public void Requeast_a_Brochure_footer() throws InterruptedException {


        logger.info("It should redirect to respective page");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Request_a_brochure.click();
      //  WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
        //System.out.println(ele.getText());
        Thread.sleep(20000);
        driver.navigate().back();

    }


    public void U_line_lifestyle_footer() throws InterruptedException {


        logger.info("It should redirect to respective page");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        U_line_lifestyle_blog_footer.click();
      //  WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
        //System.out.println(ele.getText());
        Thread.sleep(20000);
        driver.navigate().back();

    }


    public void Build_in_stand_out_footer() throws InterruptedException {


        logger.info("It should redirect to respective page");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        build_into_stand_out_footer.click();
       // WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
        //System.out.println(ele.getText());
        Thread.sleep(20000);
        driver.navigate().back();

    }


    public void Moduler_refrigorator_footer() throws InterruptedException {


        logger.info("It should redirect to respective page");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Modular_refrigeration_footer.click();
     //   WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
       // System.out.println(ele.getText());
        Thread.sleep(20000);
        driver.navigate().back();

    }


    public void Propper_preservation_footer() throws InterruptedException {


        logger.info("It should redirect to respective page");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Propper_preservation.click();
      //  WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
        //System.out.println(ele.getText());
        Thread.sleep(20000);
        driver.navigate().back();

    }


    public void Trade_and_media_footer() throws InterruptedException {


        logger.info("It should redirect to respective page");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Trade_and_media.click();
       // WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
        //System.out.println(ele.getText());
        Thread.sleep(20000);
        driver.navigate().back();

    }


    public void Continue_education_footer() throws InterruptedException {


        logger.info("It should redirect to respective page");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Continuing_Education.click();
       // WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
        //System.out.println(ele.getText());
        Thread.sleep(20000);
        driver.navigate().back();

    }


    public void Press_release_footer() throws InterruptedException {


        logger.info("It should redirect to respective page");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Press_Releases.click();
       // WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
        //System.out.println(ele.getText());
        Thread.sleep(20000);
        driver.navigate().back();

    }


    public void Careers_Footer() throws InterruptedException {


        logger.info("It should redirect to respective page");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Career.click();
      //  WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
        //System.out.println(ele.getText());
        Thread.sleep(20000);
        driver.navigate().back();

    }


    public void Find_a_dealer_footer() throws InterruptedException {


        logger.info("It should redirect to respective page");

        Thread.sleep(50000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Find_a_Dealer.click();
       // WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
        //System.out.println(ele.getText());
        Thread.sleep(20000);
        driver.navigate().back();

    }


    public void Find_a_Servicer_footer() throws InterruptedException {


        logger.info("It should redirect to respective page");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Find_a_servicer.click();
       // WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
        //System.out.println(ele.getText());
        Thread.sleep(20000);
        driver.navigate().back();

    }


    public void Product_registration_footer() throws InterruptedException {


        logger.info("It should redirect to respective page");


        Thread.sleep(10000);
        WebElement alllinks = driver.findElement(By.xpath("(//div[contains(@class,'col-md-4')])[2]"));


        List<WebElement> Links = alllinks.findElements(By.tagName("a"));
        int Count = Links.size();
        System.out.println("Name: " + Count);
        for (int i = 0; i < Links.size(); i++) {
            String Opentabs = Keys.chord(Keys.CONTROL, Keys.ENTER);

            Links.get(i).sendKeys(Opentabs);
            //  System.out.println(driver.getTitle());

        }


    }


    public void Parts_and_accessories_footer() throws InterruptedException {


        logger.info("It should redirect to respective page");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        WebElement ele= driver.findElement(By.xpath("//a[contains(text(),'Parts & Accessories')]"));
        ele.click();
//        WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
//        System.out.println(ele.getText());
        Thread.sleep(20000);
        driver.navigate().back();

    }


    public void Manuals_and_guides_footer() throws InterruptedException {


        logger.info("It should redirect to respective page");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Manuals_and_guides.click();
//        WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
//        System.out.println(ele.getText());
        Thread.sleep(20000);
        driver.navigate().back();

    }


    public void Provider_login_footer() throws InterruptedException {


        logger.info("It should redirect to respective page");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Find_a_Dealer.click();
//        WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
//        System.out.println(ele.getText());
        Thread.sleep(20000);
        driver.navigate().back();

    }

    public void resources_link_footer() throws InterruptedException {


        logger.info("It should redirect to respective page");

        Thread.sleep(10000);
        WebElement alllinks = driver.findElement(By.xpath("(//div[contains(@class,'block')])[20]"));


        List<WebElement>  Links = alllinks.findElements(By.tagName("a"));
        int Count     = Links.size();
        System.out.println("Name: " +Count);
        for(int i=0;i<Links.size();i++)
        {
            String Opentabs=Keys.chord(Keys.CONTROL,Keys.ENTER);

            Links.get(i).sendKeys(Opentabs);
            //  System.out.println(driver.getTitle());

        }


    }

    public void Privacy_policy_footer() throws InterruptedException {


        logger.info("It should redirect to respective page");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Privacy_policy.click();
//        WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
//        System.out.println(ele.getText());
        Thread.sleep(20000);
        driver.navigate().back();

    }

    public void Support_link_footer() throws InterruptedException {


        logger.info("It should redirect to respective page");

        Thread.sleep(40000);


        WebElement alllinks = driver.findElement(By.xpath("(//div[contains(@class,'col-md-4')])[4]"));


        List<WebElement>  Links = alllinks.findElements(By.tagName("a"));
        int Count     = Links.size();
        System.out.println("Name: " +Count);
        for(int i=0;i<Links.size();i++)
        {
            String Opentabs=Keys.chord(Keys.CONTROL,Keys.ENTER);

            Links.get(i).sendKeys(Opentabs);

        }

    }
    public void CA_prop_65_footer() throws InterruptedException {


        logger.info("It should redirect to respective page");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        CA_prop_65_footer.click();
      //  WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
        //System.out.println(ele.getText());
        Thread.sleep(20000);
        driver.navigate().back();

    }
    public void Contact_us_footer() throws InterruptedException {


        logger.info("It should redirect to respective page");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Contact_us_footer.click();
       // WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
        //System.out.println(ele.getText());
        Thread.sleep(20000);
        driver.navigate().back();

    }
    public void Parts_and_accessories() throws InterruptedException {
        logger.info("It should get redirected to the category page and all respective products  should display on it");
        Thread.sleep(6000);


        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,-1000)");
       WebElement ele= driver.findElement(By.xpath("//span[contains(.,'Parts & Accessories')]"));
       ele.click();
    }




    public void SerialNumber() throws InterruptedException {
        logger.info("1.Model number/Serial Number/Part Number should be search by entering valid data\\n\" +\n" +
                "                \"2.auto result should be generated");
        Thread.sleep(10000);

        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement ele=driver.findElement(By.xpath("//input[@placeholder='U-1224BEVS-00B']"));
        ele.sendKeys("U-1024RS-00A");
        Thread.sleep(40000);
        ele.sendKeys(Keys.ENTER);
    }



    public void addtocart() throws InterruptedException {

        logger.info("\"It should give the pop up as \"\"View Cart\"\" and display \n" +
                "'Continue shopping' button\"");
        Thread.sleep(10000);
        //WebDriverWait wait2 = new WebDriverWait(driver, 10);
        //wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkmo']")));
        WebElement element = driver.findElement(By.xpath("//input[@product_id='9967']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
        //addtocart.click();


    }

    public void viewcart() throws InterruptedException {
        logger.info(" \"It should be redirect to Shopping cart page\n" +
                "\" ");
        Thread.sleep(10000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        viewcart.click();

    }

    public void Cross_button() throws InterruptedException {
        logger.info(" It should give the pop up as \"Are you sure you would like to remove this item from the shopping cart?\" with cancel and ok button. ");
        Thread.sleep(10000);
        WebElement ele= driver.findElement(By.xpath("//a[@id='minicart_container']"));
        ele.click();
        Cross_icon.click();

    }

    public void Cancel_button() throws InterruptedException {
        logger.info("\"It should remain on the same page\n" +
                "\" ");
        Thread.sleep(10000);
        WebElement ele= driver.findElement(By.xpath("//a[@id='minicart_container']"));
        ele.click();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        Cancel_button.click();

    }

    public void Close_tab() throws InterruptedException {
        logger.info("\\\"It should remain on the same page\\n\" +\n" +
                "                \"\\\"  ");
        Thread.sleep(10000);
        WebElement ele= driver.findElement(By.xpath("//a[@id='minicart_container']"));
        ele.click();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(8000);
        Closs_button.click();

    }
    public void Ok_tab() throws InterruptedException {
        logger.info("It should  remove the product from mini cart popup");
        Thread.sleep(10000);


               ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(8000);
        ok_button.click();

    }
    public void view_and_edit_cart() throws InterruptedException {
        logger.info("It should redirect to shipping page");
        Thread.sleep(10000);
        WebElement ele= driver.findElement(By.xpath("//a[@id='minicart_container']"));
        ele.click();
        Thread.sleep(10000);
        WebUtils.navigateToURL(APPLICATION_URL);


    }
}

