package com.Marvel.page.actions.web.Retailer;

import com.Marvel.page.actions.web.HomePage;
import com.Marvel.utils.common.Config;
import com.Marvel.utils.selenium.WebUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
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



    @FindBy(how = How.XPATH, using="//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/a[1]")
    @CacheLookup
    WebElement Learn_more_bullet;



    @FindBy(how = How.XPATH, using="//body/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/span[1]")
    @CacheLookup
    WebElement bullet_2;



    @FindBy(how = How.XPATH, using="//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/a[1]")
    @CacheLookup
    WebElement Explore_bullet;



    @FindBy(how = How.XPATH, using="//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/a[1]")
    @CacheLookup
    WebElement shop_now_bullet;



    @FindBy(how = How.XPATH, using="//body/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/span[1]")
    @CacheLookup
    WebElement bullet_3;



    @FindBy(how = How.XPATH, using="//body/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/span[1]")
    @CacheLookup
    WebElement Bullet_4;



    @FindBy(how = How.XPATH, using="//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/a[1]")
    @CacheLookup
    WebElement view_collection_bullet;



    @FindBy(how = How.XPATH, using="//a[contains(text(),'Find the Perfect Fit')]")
    @CacheLookup
    WebElement find_a_perfect_fit;







    @FindBy(how = How.XPATH, using="//a[contains(text(),'Register Now')]")
    @CacheLookup
    WebElement Register_now_button;

    @FindBy(how = How.XPATH, using="//a[contains(text(),'Order Now')]")
    @CacheLookup
    WebElement Order_now_button;



    @FindBy(how = How.XPATH, using="//button[@class='action subscribe primary']")
    @CacheLookup
    WebElement Subscribe_button;














    @FindBy(how = How.XPATH, using="//button[@id='el_search']")
    @CacheLookup
    WebElement search;




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

    public void Home_page_logo() throws InterruptedException {

        logger.info("\"\"1.It should properly display the Marvel logo on top left\n" +
                "2.Banner image should display clear and distinct\"\n");
        Thread.sleep(10000);
        WebElement ele= driver.findElement(By.xpath("//header/div[1]/strong[1]/img[1]"));
       System.out.println(ele.getText());

    }

    public void Login() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Application should redirect to 'Registered Servicers & Distributors' page\n");
        WebElement ele= driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]"));
      ele.click();
        WebUtils.navigateToURL(APPLICATION_URL);
    }
    public void product() throws InterruptedException {
        Thread.sleep(10000);

        logger.info("\"1.It should display the drop-down which will consists of a list of category\n" +
                "2.Clicking on main menu category, it should redirect to product listing page\"");
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//a[.='Products' and not(@title)]"));
        action.moveToElement(we).build().perform();
    }



    public void Support() throws InterruptedException {

        logger.info("");
        Thread.sleep(10000);
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//header/div[2]/div[3]/div[1]/div[2]/nav[1]/ul[1]/li[3]/a[1]/span[1]"));
        action.moveToElement(we).build().perform();
    }

    public void Register_product() throws InterruptedException {

        logger.info("Application should redirect to Warrenty Registration form\n");
        Thread.sleep(10000);

        WebElement we = driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]"));
        we.click();

    }
    public void Blog() throws InterruptedException {

        logger.info("Application should redirect to'blog.marvelrefrigeration.com'\n");
        Thread.sleep(9000);
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]"));
        we.click();
        Thread.sleep(9000);
        WebUtils.navigateToURL(APPLICATION_URL);
    }

    public void Search_icon() throws InterruptedException {

        logger.info("The search icon should be present in the top right side of mini cart in header section \n" +
                "\"");
       Thread.sleep(10000);
     WebElement ele= driver.findElement(By.xpath("//input[@class='input-text loaded']"));
     ele.getText();
    }
    public void Search_icon_blank() throws InterruptedException {

        logger.info("Search icon should be display disable\n");
        Thread.sleep(10000);
        WebElement ele= driver.findElement(By.xpath("//input[contains(@class,'input-text loaded')]"));
        ele.sendKeys(Keys.ENTER);
    }
    public void Search_icon_invalid() throws InterruptedException {

        logger.info("\"It should open a popup\n" +
                "It should display message as \"\"No product found\"\"\"\n");
        Thread.sleep(10000);
        WebElement ele= driver.findElement(By.xpath("//input[contains(@class,'input-text loaded')]"));
       ele.sendKeys("tyuiii");
       ele.sendKeys(Keys.ENTER);
    }

    public void Mini_cart() throws InterruptedException {

        logger.info("If product is added in cart it should be display product.if not, it should display 'You have no items in your shopping cart.' message.\n");
        Thread.sleep(10000);
        WebElement ele=driver.findElement(By.xpath("//span[@class='counter-number'][contains(.,'0')]"));
        ele.click();
        Thread.sleep(10000);
        WebElement ele1=driver.findElement(By.xpath("//button[contains(@class,'action close')]"));
        ele1.click();
    }
    public void Header_menu_bar() throws InterruptedException {

        logger.info("It should display Dropdown/List\n");
       Actions ac=new Actions(driver);
        Thread.sleep(10000);
        WebElement ele=driver.findElement(By.xpath("//a[@class='level-top'][contains(.,'Products')]"));
      ac.moveToElement(ele).build().perform();
      System.out.println("Hover on Products");
        Thread.sleep(10000);
        WebElement ele1=driver.findElement(By.xpath("//span[contains(.,'Support & Resources')]"));

        ac.moveToElement(ele1).build().perform();
        System.out.println("Hover on Supports and Resources");
        Thread.sleep(10000);
        WebElement ele2=driver.findElement(By.xpath("//span[contains(.,'Where to Buy')]"));

        ac.moveToElement(ele2).build().perform();
        System.out.println("Hover on Where to Buy");
    }
    public void Go_to_checkout() throws InterruptedException {

        logger.info("It should redirect to checkout page\n");
        Thread.sleep(20000);
        WebElement ele1=driver.findElement(By.xpath("//span[contains(@class,'counter-number')]"));
        ele1.click();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));

        Thread.sleep(10000);
        WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'Go to Checkout')]"));
        ele.click();
        WebUtils.navigateToURL(APPLICATION_URL);
    }
    public void Build_in_america() throws InterruptedException {

        logger.info("\"It should display below banner images in body section.\n" +
                "It should display 6 category\n" +
                "- Beverage Centers\n" +
                "- Wine Preservation\n" +
                "- Refrigerators\n" +
                "- Freezers\n" +
                "- Dispensers\n" +
                "- Ice Machines\"\n");
        Thread.sleep(10000);
        WebElement ele=driver.findElement(By.xpath("//h3[contains(text(),'Beverage Centers')]"));
        Actions ac=new Actions(driver);
        ac.moveToElement(ele).build().perform();
    }
    public void Build_in_america_view() throws InterruptedException {

        logger.info("It should display 'view product' button and redirect to respective page\n");
        Thread.sleep(10000);
        Actions actions = new Actions(driver);
        WebElement ele= driver.findElement(By.xpath("//h3[contains(text(),'Beverage Centers')]"));
        WebElement ele1=driver.findElement(By.xpath("(//a[contains(@title,'View Products')])[1]"));
        actions.moveToElement(ele).moveToElement(ele1).click().build().perform();
        Thread.sleep(10000);

        WebUtils.navigateToURL(APPLICATION_URL);


    }






    public void Search_box_valid_data() throws InterruptedException {

        logger.info("Search Result page should display with correct result\n");
        Thread.sleep(50000);

        String select = Keys.chord(Keys.CONTROL, "a");

        WebElement ele= driver.findElement(By.xpath("//input[contains(@class,'input-text loaded')]"));

       ele.sendKeys(select);
        ele.sendKeys("Wine");

        Thread.sleep(6000);
        ele.sendKeys(Keys.ENTER);
        Thread.sleep(6000);
        WebUtils.navigateToURL(APPLICATION_URL);
    }

    public void Top_button() throws InterruptedException {

        logger.info("It should scroll up on top of the homepage");
        Thread.sleep(20000);

        Actions ac=new Actions(driver);
      WebElement ele= driver.findElement(By.xpath("//a[@id='totop']"));
      ac.moveToElement(ele).click().build().perform();



    }
    public void The_marvel_difference_button() throws InterruptedException {

        logger.info("\"It should display background image with text \n" +
                "'LONG LASTING FRESHNESS' and redirect to respective page 'Who We Are'\n" +
                "when Click on 'The Marvel Difference' backround should be white\"\n");
        Thread.sleep(20000);
       WebElement ele= driver.findElement(By.xpath("//a[contains(.,'THE MARVEL DIFFERENCE')]"));
   ele.click();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(20000);

        WebUtils.navigateToURL(APPLICATION_URL);


    }
    public void Timeless_excellence() throws InterruptedException {

        logger.info("\"It should be display 4 sub section with image and names:\n" +
                "- PROFESSIONAL\n" +
                "- CLASSIC\n" +
                "- LOW PROFILE\n" +
                "- OUTDOOR\n" +
                "\"\n");
        Thread.sleep(50000);
        WebElement ele= driver.findElement(By.xpath("//div[contains(@class,'container collection-section')]"));
      System.out.println(ele.getText());



    }



    public void Brawse_button() throws InterruptedException {

        logger.info("\"It should redirect to respective page\n" +
                "The background color should be black after tab\"\n");
        Thread.sleep(30000);
        Actions ac=new Actions(driver);
        WebElement alllinks = driver.findElement(By.xpath("(//a[contains(.,'BROWSE')])[2]"));

     ac.moveToElement(alllinks).click().build().perform();
        Thread.sleep(10000);
        WebUtils.navigateToURL(APPLICATION_URL);

    }

    public void Footer_product() throws InterruptedException {

        logger.info("It should redirect to respective page\n");
        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        WebElement alllinks = driver.findElement(By.xpath("(//div[contains(@class,'col-md-3')])[5]"));


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

    public void Consumer_footer() throws InterruptedException {

        logger.info("It should redirect to respective page\n");
        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        WebElement alllinks = driver.findElement(By.xpath("(//div[contains(@class,'col-md-4')])[7]"));


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

    public void Trade_footer() throws InterruptedException {

        logger.info("It should redirect to respective page\n");
        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,10000)");
        WebElement alllinks = driver.findElement(By.xpath("(//div[contains(@class,'col-md-4')])[8]"));


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

    public void About_footer() throws InterruptedException {

        logger.info("It should redirect to respective page\n");
        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        WebElement alllinks = driver.findElement(By.xpath("(//div[contains(@class,'block')])[16]"));


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



    public void Read_our_story() throws InterruptedException {

        logger.info("\"It should display 1 section.\n" +
                "- Undercounter Buying Guide\"\n");
        Thread.sleep(50000);
        Actions ac=new Actions(driver);
        WebElement ele2= driver.findElement(By.xpath("(//a[@class='read-more'][contains(.,'Read More')])[1]"));
        ac.moveToElement(ele2).click().build().perform();

        System.out.println(driver.getCurrentUrl());
        Thread.sleep(10000);
        WebUtils.navigateToURL(APPLICATION_URL);
    }
    public void Read_our_story2() throws InterruptedException {

        logger.info("It should redirect to respective page\n");
        Thread.sleep(50000);
        Actions ac=new Actions(driver);
        WebElement ele2= driver.findElement(By.xpath("(//a[@class='read-more'][contains(.,'Read More')])[2]"));
    ac.moveToElement(ele2).click().build().perform();
        System.out.println(driver.getCurrentUrl());

        Thread.sleep(10000);
        WebUtils.navigateToURL(APPLICATION_URL);
    }

    public void fromtheblog_section() throws InterruptedException {

        logger.info("\"It should display 1 section.\n" +
                "- Undercounter Buying Guide\"\n");
        Thread.sleep(60000);
        Actions ac=new Actions(driver);
        WebElement ele2= driver.findElement(By.xpath("//div[contains(@class,'blog-section')]"));
       System.out.println(ele2.getText());
    }




    public void Social_media_icon_FB() throws InterruptedException {

        logger.info("It  should redirect to Facebook");
        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        WebElement ele=driver.findElement(By.xpath("//i[@class='porto-icon-facebook']"));
        ele.click();


    }
    public void Social_media_icon_Twitter() throws InterruptedException {

        logger.info("It  should redirect to Twitter");
        Thread.sleep(20000);

        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");

        WebElement ele=driver.findElement(By.xpath("//i[@class='porto-icon-twitter']"));
        ele.click();

       // driver.switchTo().window(tabs.get(0));
    }

    public void Social_media_icon_Insta() throws InterruptedException {

        logger.info("It  should redirect to Instagram");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");

        WebElement ele=driver.findElement(By.xpath("//i[@class='porto-icon-instagram']"));
        ele.click();

       // driver.switchTo().window(tabs.get(0));
    }

    public void Social_media_icon_You_tube() throws InterruptedException {

        logger.info("It  should redirect to You_tube");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");

        WebElement ele=driver.findElement(By.xpath("//i[@class='porto-icon-youtube']"));
        ele.click();

//        driver.switchTo().window(tabs.get(0));
    }

    public void Social_media_icon_Linkedin() throws InterruptedException {

        logger.info("It  should redirect to Linkedin");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");


        WebElement ele=driver.findElement(By.xpath("//i[@class='porto-icon-facebook']"));
        ele.click();

      //  driver.switchTo().window(tabs.get(0));
    }

    public void Social_media_icon_Pinrest() throws InterruptedException {

        logger.info("It  should redirect to Pinrest");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");

        WebElement ele=driver.findElement(By.xpath("//i[@class='porto-icon-pinterest']"));
        ele.click();

       // driver.switchTo().window(tabs.get(0));
    }

    public void Social_media_icon_Houzz() throws InterruptedException {

        logger.info("It  should redirect to Facebook");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");


        WebElement ele=driver.findElement(By.xpath("//i[@class='fab fa-houzz']"));
        ele.click();

     //   driver.switchTo().window(tabs.get(0));
    }

    public void Email_subsrcibe_blank() throws InterruptedException {

        logger.info("\"This is required field\"  message should dispaly");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
      Subscribe_button.click();
    }
    public void Email_subsribe_blank() throws InterruptedException {

        logger.info("Invalid data - PLEASE ENTER A VALID EMAIL ADDRESS (EX: JOHNDOE@DOMAIN.COM). error message should disp;ay");
        // Thread.sleep(90000);
        Thread.sleep(20000);

        WebElement ele= driver.findElement(By.xpath("//input[@placeholder='Email Address']"));

        ele.sendKeys(Keys.ENTER);
    }
    public void Email_subsribe_invalid() throws InterruptedException {

        logger.info("Invalid data - PLEASE ENTER A VALID EMAIL ADDRESS (EX: JOHNDOE@DOMAIN.COM). error message should disp;ay");
       // Thread.sleep(90000);
        Thread.sleep(20000);

        WebElement ele= driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
        ele.sendKeys("puja2upbott.com");
        ele.sendKeys(Keys.ENTER);
    }

    public void Email_subsribe_valid() throws InterruptedException {

        logger.info("Invalid data - PLEASE ENTER A VALID EMAIL ADDRESS (EX: JOHNDOE@DOMAIN.COM). error message should disp;ay");

        Thread.sleep(20000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement ele1= driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
        ele1.sendKeys(select);
        ele1.sendKeys("puja@upbott.com");
        WebElement ele2= driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
        ele2.sendKeys(Keys.ENTER);
    }







    public void Parts_and_accessories1() throws InterruptedException {


        logger.info("It should redirect to respective page");

        Thread.sleep(20000);
        WebElement source= driver.findElement(By.xpath("//span[contains(text(),'Support & Resources')]"));
        WebElement target= driver.findElement(By.xpath("//a[.='Parts & Accessories ' and not(@title)]"));
        Actions action = new Actions(driver);
//moving to the main menu and then sub menu and clicking on it using object of the Actions class
        action.moveToElement(source).moveToElement(target).click().build().perform();

        Thread.sleep(10000);

        WebElement ele3= driver.findElement(By.xpath("//input[@id='serial']"));

        ele3.sendKeys("42242728-ACCY");
        ele3.sendKeys(Keys.ENTER);
        WebElement ele = driver.findElement(By.xpath("//input[contains(@name,'btn_add_to_cart')]"));
        ele.click();
        Thread.sleep(10000);

        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        WebElement cancel = driver.findElement(By.xpath("//span[contains(.,'Continue Shopping')]"));
        cancel.click();

    }










    public void Search() throws InterruptedException {
        logger.info("Search Result should display with correct result on same page below the parts Search  banner");
        Thread.sleep(10000);
        search.click();
    }

    public void addtocart() throws InterruptedException {

        logger.info("");
        Thread.sleep(10000);
        //WebDriverWait wait2 = new WebDriverWait(driver, 10);
        //wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkmo']")));
        WebElement element = driver.findElement(By.xpath("//input[contains(@name,'btn_add_to_cart')]"));
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
      WebElement ele= driver.findElement(By.xpath("//span[contains(.,'Continue Shopping')]"));
      ele.click();
        Thread.sleep(10000);
        WebElement ele1= driver.findElement(By.xpath("//img[contains(@src,'2.png')]"));
        ele1.click();
    }

    public void Cross_button() throws InterruptedException {
        logger.info(" It should give the pop up as \"Are you sure you would like to remove this item from the shopping cart?\" with cancel and ok button. ");
        Thread.sleep(20000);
        WebElement ele1=driver.findElement(By.xpath("//span[contains(@class,'counter-number')]"));
        ele1.click();
        Thread.sleep(5000);
        WebElement ele= driver.findElement(By.xpath("//button[contains(@class,'action close')]"));
        ele.click();


    }

    public void Cancel_button() throws InterruptedException {
        logger.info("\"It should remain on the same page\n" +
                "\" ");
        Thread.sleep(10000);
        WebElement ele1=driver.findElement(By.xpath("//span[contains(@class,'counter-number')]"));
        ele1.click();
        Thread.sleep(5000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
       WebElement ele= driver.findElement(By.xpath("//a[contains(@class,'action delete')]"));
       ele.click();
        Thread.sleep(5000);
        ArrayList<String> tabs3 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(0));
        Thread.sleep(2000);
        WebElement cancel= driver.findElement(By.xpath("//span[contains(.,'Cancel')]"));
        cancel.click();
        Thread.sleep(10000);
        WebUtils.navigateToURL(APPLICATION_URL);
    }

    public void Close_tab() throws InterruptedException {
        logger.info("\\\"It should remain on the same page\\n\" +\n" +
                "                \"\\\"  ");
        Thread.sleep(10000);
        WebElement ele= driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]/span[2]"));
        ele.click();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(8000);
        Closs_button.click();

    }
    public void Ok_tab() throws InterruptedException {
        logger.info("It should  remove the product from mini cart popup");
        Thread.sleep(20000);
        WebElement ele1=driver.findElement(By.xpath("//span[contains(@class,'counter-number')]"));
        ele1.click();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(8000);
        WebElement ele= driver.findElement(By.xpath("//a[contains(@class,'action delete')]"));
        ele.click();
        Thread.sleep(5000);
        ArrayList<String> tabs3 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(0));
        Thread.sleep(2000);
        WebElement cancel= driver.findElement(By.xpath("//span[contains(.,'OK')]"));
        cancel.click();
        Thread.sleep(10000);
        driver.navigate().to("https://www.marvelrefrigeration.com/");
    }
    public void view_and_edit_cart() throws InterruptedException {
        logger.info("It should  remove the product from mini cart popup");
        Thread.sleep(10000);
        WebElement ele1=driver.findElement(By.xpath("//span[contains(@class,'counter-number')]"));
        ele1.click();
        Thread.sleep(5000);
        ArrayList<String> tabs3 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(0));
        Thread.sleep(2000);
        WebElement ele= driver.findElement(By.xpath("(//span[contains(.,'View and edit cart')])[2]"));
        ele.click();


    }
    public void Edit_button() throws InterruptedException {

        logger.info("It should be redirect to shopping cart page\n");
        Thread.sleep(20000);
        WebElement ele1=driver.findElement(By.xpath("//span[contains(@class,'counter-number')]"));
        ele1.click();
        Thread.sleep(5000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));

        Thread.sleep(3000);
        WebElement ele=driver.findElement(By.xpath("//a[@class='action edit'][contains(.,'Edit')]"));
        ele.click();
        Thread.sleep(9000);
        driver.navigate().back();

    }
}

