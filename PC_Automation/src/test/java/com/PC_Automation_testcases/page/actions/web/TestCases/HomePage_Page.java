package com.PC_Automation_testcases.page.actions.web.TestCases;

import com.PC_Automation_testcases.page.actions.web.HomePage;
import com.PC_Automation_testcases.utils.common.Config;

import com.PC_Automation_testcases.utils.selenium.WebUtils;
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




    @FindBy(how = How.XPATH, using="//button[@class='action subscribe primary']")
    @CacheLookup
    WebElement Subscribe_button;


    @FindBy(how = How.XPATH, using="//button[@id='el_search']")
    @CacheLookup
    WebElement search;



    public HomePage_Page(WebDriver driver) {
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

    public void Home_page_logo() throws InterruptedException {
        Thread.sleep(1000);
        logger.info("On top of header section there should be a message 'Due to the current pandemic, shipping times may be affected. If you have a specific delivery date requirement, let our Customer Service team know when placing your order.' page.");
        WebElement ele= driver.findElement(By.xpath("//div[contains(text(),'Due to the current pandemic, shipping times may be')]"));
       System.out.println("Notice is :" +ele.getText());

    }

    public void logo() throws InterruptedException {
Thread.sleep(1000);
        logger.info("It should properly display on top left side of home page ");
        WebElement ele= driver.findElement(By.xpath("//img[@alt='PlatinumCode']"));
        ele.click();

    }

    public void disposable_turnicates() throws InterruptedException {

        logger.info("When we Click on respective link it should redirect to respective page.");
        Thread.sleep(10000);
        WebElement ele= driver.findElement(By.xpath("(//div[contains(@class,'features-block')])[3]"));
      ele.click();

    }
    public void product() {

        logger.info("\"1.It should display the drop-down which will consists of a list of category\n" +
                "2.Clicking on main menu category, it should redirect to product listing page\"");
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//a[.='Products' and not(@title)]"));
        action.moveToElement(we).build().perform();
    }




    public void Blog() throws InterruptedException {

        logger.info("To verify 'Disposable tourniquet' section ");
        Thread.sleep(9000);
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//img[@alt='Disposable tourniquet supplier in the United States - PlatinumCode - USA']"));
        we.click();
    }

    public void Search_icon() throws InterruptedException {

        logger.info("\"The search text box should be present in the left hand side of 'Logo' and right hand side of 'Login' with the watermark/placeholder field \"\"Search...\"\"\n" +
                "\"" +
                "\"");
       Thread.sleep(10000);
     WebElement ele= driver.findElement(By.xpath("//input[@placeholder='Search']"));
     ele.sendKeys(Keys.ENTER);
    }

    public void Search_icon_invalid() throws InterruptedException {

        logger.info("\"It should open a popup\n" +
                "It should display message as \"\"No product found\"\"\"\n");

        Thread.sleep(10000);
        WebElement ele= driver.findElement(By.xpath("//input[@placeholder='Search']"));
       ele.sendKeys("tfytyg");
       ele.sendKeys(Keys.ENTER);
    }

    public void Mini_cart() throws InterruptedException {

        logger.info("If product is added in cart it should be display product.if not, it should display 'You have no items in your shopping cart.' message.\n");
        Thread.sleep(10000);
        WebElement ele=driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]/span[2]"));
        ele.click();
    }
    public void Go_to_checkout() throws InterruptedException {

        logger.info("It should redirect to checkout page\n");
        Thread.sleep(10000);
        WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'Go to Checkout')]"));
        ele.click();
    }

    public void Addtocart() throws InterruptedException {
        Thread.sleep(9000);
        logger.info("Entering model number");

        WebUtils.navigateToURL(APPLICATION_URL+"/labels/admitting.html");
        Thread.sleep(10000);
Actions ac=new Actions(driver);
        WebElement ele3= driver.findElement(By.xpath("//a[contains(.,'3\"x2\" Printed \"Visitor Pass\" Label Orange/Black Print 1000/RL- 6 RL/BX')]"));
		ac.moveToElement(ele3).click().build().perform();
		Thread.sleep(10000);
        WebElement ele2= driver.findElement(By.xpath("//span[contains(text(),'Add to Quote')]"));
        ele2.click();

    }



    public void view_cart() throws InterruptedException {
        Thread.sleep(5000);
        logger.info("add product into cart");
        //WebDriverWait wait2 = new WebDriverWait(driver, 10);
        //wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkmo']")));
        WebElement element = driver.findElement(By.xpath("//header/div[1]/div[3]/a[1]"));
        element.click();
        Thread.sleep(10000);
        WebElement element1 = driver.findElement(By.xpath("//img[contains(@title,'PlatinumCode')]"));
        element1.click();


    }
    public void Left_right_arrow() throws InterruptedException {

        logger.info("Five banner should slide properly dispalying respective banner and should have auto rotation functionality");
        Thread.sleep(30000);
        WebElement ele=driver.findElement(By.xpath("(//i[contains(@class,'fas fa-chevron-right')])[2]"));
        Actions ac=new Actions(driver);
        ac.moveToElement(ele).click().build().perform();

    }
    public void disposable_turnicates_link() throws InterruptedException {

        logger.info("When we Click on respective link it should redirect to respective page.");
        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,2000)");
        WebElement alllinks = driver.findElement(By.xpath("(//div[contains(@class,'features-list')])[3]"));


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
    public void Special_disposable_turnicates_link() throws InterruptedException {

        logger.info("When we Click on respective link it should redirect to respective page.");
        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,2000)");
        WebElement alllinks = driver.findElement(By.xpath("(//div[contains(@class,'features-list')])[4]"));


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

    public void solution_for_your_application_link_pediatrics() throws InterruptedException {

        logger.info("\"When we Hover on categories icons,green horizontal line should be visible\n" +
                "It should redirect to respective page.\"");
        Thread.sleep(10000);
        WebElement ele1=driver.findElement(By.xpath("//a[contains(text(),'PEDIATRICS')]"));
        ele1.click();
        Thread.sleep(10000);
        WebUtils.navigateToURL(APPLICATION_URL);

    }
    public void solution_for_your_application_link_specimencollection() throws InterruptedException {


        Thread.sleep(10000);
        WebElement ele1=driver.findElement(By.xpath("//a[contains(text(),'SPECIMEN COLLECTION')]"));
        ele1.click();
        Thread.sleep(10000);
        WebUtils.navigateToURL(APPLICATION_URL);

    }
    public void solution_for_your_application_link_Laboratory() throws InterruptedException {


        Thread.sleep(60000);
        WebElement ele1=driver.findElement(By.xpath("//a[contains(text(),'LABORATORY')]"));
        ele1.click();
        Thread.sleep(10000);
        WebUtils.navigateToURL(APPLICATION_URL);

    }
    public void solution_for_your_Accessyoursaving() throws InterruptedException {
        logger.info("\"It should display name and sub heading.\n" +
                "It should get redirect to 'Request a quote'page.\"");

        Thread.sleep(50000);
        Actions ac=new Actions(driver);
        WebElement ele1=driver.findElement(By.xpath("//a[contains(text(),'Request a Quote')]"));
        ac.moveToElement(ele1).click().build().perform();
        Thread.sleep(10000);
        WebUtils.navigateToURL(APPLICATION_URL);

    }


    public void Search_box_valid_data() throws InterruptedException {

        logger.info("Search Result page should display with correct result\n");
        Thread.sleep(70000);

        String select = Keys.chord(Keys.CONTROL, "a");

        WebElement ele= driver.findElement(By.xpath("//input[@placeholder='Search']"));


       ele.sendKeys(select);
        ele.sendKeys("label");

        Thread.sleep(6000);
        ele.sendKeys(Keys.ENTER);
        Thread.sleep(6000);
        driver.navigate().back();

    }

    public void Solution_for_your_application() throws InterruptedException {

        logger.info("First box should display label 'Solutions for Your Application Featuring Our Latest Collections'");
        Thread.sleep(20000);
       WebElement ele= driver.findElement(By.xpath("//div[@class='col-lg-3 col-6 title-block application-item']"));
     System.out.println("Label text"+ele.getText());



    }
    public void Testmonial() throws InterruptedException {

        logger.info("On top of the testimonial there should be a heading 'Coast to Coast, Our Customers Love Us'.Testimonial should visible between \" \" and below message there should be name of the customer with few details.On both sides i.e. left and right of testimonial there should be an arrow.");
        Thread.sleep(20000);
       WebElement ele= driver.findElement(By.xpath("//h2[contains(.,'Coast to Coast, Our Customers Love Us')]"));
     //  System.out.println("Label"+ele.getText());


    }
    public void Testmonial_link() throws InterruptedException {

        logger.info("It should swipe the respective  slide of testimonial");
        Thread.sleep(50000);
        WebElement ele= driver.findElement(By.xpath("//img[contains(@alt,'Tourniquets for Every Patient')]"));
       ele.click();


    }

    public void turnicates_link() throws InterruptedException {

        logger.info("\"Three featured sections should display with clear and distinct image,name and message.\n" +
                "It should get redire t to respective page\"");
        Thread.sleep(50000);
        WebElement ele= driver.findElement(By.xpath("//img[@alt='Tourniquets for Every Patient']"));
       ele.click();


    }
    public void AlcoholResistence() throws InterruptedException {

        logger.info("Video pop up should get open");
        Thread.sleep(50000);
        WebElement ele= driver.findElement(By.xpath("//img[@alt='Alcohol Resistant Pharmacy Labels']"));
        ele.click();
        Thread.sleep(50000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        WebElement ele1= driver.findElement(By.xpath("(//button[@class='action-close'][contains(.,'Close')])[1]"));
        ele1.click();

    }
    public void covid19() throws InterruptedException {

        logger.info("Application should redirect to \"https://www.platinumcode.us/case-study-overnight-solutions-to-address-health-care-pandemic\" ");
        Thread.sleep(50000);
        WebElement ele= driver.findElement(By.xpath("//span[contains(text(),'COVID-19 Pandemic Response')]"));
        ele.click();
        Thread.sleep(20000);

        driver.navigate().back();

    }

    public void platinumCode() throws InterruptedException {

        logger.info("\"It should display with clear heading and sub-heading\n" +
                "It should get redirect to respective page\"");
        Thread.sleep(50000);
        WebElement ele= driver.findElement(By.xpath("(//img[@src='https://www.platinumcode.us/media/homepage/NewsBlock_700x560_1_.jpg'])[2]"));
       System.out.println("Platinum"+ele.getText());


    }

    public void our_blog() throws InterruptedException {

        logger.info("It should redirect to 'blog' page.");
        Thread.sleep(50000);
        WebElement ele= driver.findElement(By.xpath("(//a[@class='btn link-btn'][contains(.,'Our Blog')])[2]"));
       ele.click();


    }
    public void login_minicart(String Email,String pwd) throws InterruptedException {

        logger.info("\"If product is added in cart it should display product,\n" +
                "It should display popup of mini cart with all the added items.\n" +
                "It should display cart subtotal,product image/name/Qty(readonly) \"");
        Thread.sleep(50000);
        driver.navigate().refresh();
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement ele= driver.findElement(By.xpath("(//a[contains(.,'Login')])[2]"));
        ac.moveToElement(ele).click().build().perform();
        Thread.sleep(5000);
        WebElement email= driver.findElement(By.xpath("//input[@name='login[username]']"));
        email.sendKeys(Email);
        WebElement pass= driver.findElement(By.xpath("//input[@name='login[password]']"));
        pass.sendKeys(pwd);
        Thread.sleep(5000);
        WebElement ele5= driver.findElement(By.xpath("//button[@class='action login primary']"));
        ele5.click();

////        Thread.sleep(50000);
////        WebElement element = driver.findElement(By.xpath("(//span[contains(@class,'counter qty')])[2]"));
////        Actions actions = new Actions(driver);
////        actions.moveToElement(element).click().build().perform();

    }
    public void dropdown() throws InterruptedException {

        logger.info("It should display  horizontal style menu with main navigation headings of All Products,Labels & Wristbands,Disposable Tourniquets,Cohesive Bandages,About Us,Support.");
        Thread.sleep(50000);
        Actions ac=new Actions(driver);
        WebElement ele= driver.findElement(By.xpath("//span[contains(text(),'All Products')]"));
        ac.moveToElement(ele).build().perform();
        System.out.println("Hover on All products");
        Thread.sleep(50000);
        WebElement ele1= driver.findElement(By.xpath("//span[contains(text(),'Labels & Wristbands')]"));
        ac.moveToElement(ele1).build().perform();
        System.out.println("Hover on Labels and wristbands");
        Thread.sleep(50000);
        WebElement ele3= driver.findElement(By.xpath("(//span[contains(.,'Disposable Tourniquets')])[2]"));
        ac.moveToElement(ele3).build().perform();
        System.out.println("Hover on Disposable Tourniquets");
        Thread.sleep(50000);
        WebElement ele4= driver.findElement(By.xpath("(//span[contains(.,'Cohesive Bandages')])[2]"));
        ac.moveToElement(ele4).build().perform();
        System.out.println("Hover on Cohesive Bandages");
        Thread.sleep(50000);
        WebElement ele6= driver.findElement(By.xpath("(//span[contains(.,'About Us')])[1]"));
        ac.moveToElement(ele6).build().perform();
        System.out.println("Hover on About Us");
        Thread.sleep(50000);

        WebElement ele5= driver.findElement(By.xpath("//span[contains(text(),'Support')]"));
        ac.moveToElement(ele5).build().perform();
        System.out.println("Hover on Support");

    }
    public void dropdown_redirection() throws InterruptedException {

        logger.info("\"1.It should display the drop-down which will consists of a list of category\n" +
                "2.Clicking on main menu category, it should redirect to product listing page\"");
        Thread.sleep(50000);
        Actions ac=new Actions(driver);
        WebElement ele= driver.findElement(By.xpath("//span[contains(text(),'All Products')]"));
        ac.moveToElement(ele).click().build().perform();
        Thread.sleep(30000);
        System.out.println(" Title of the page is : "+driver.getTitle());
        WebUtils.navigateToURL(APPLICATION_URL);



    }
    public void dropdown_Submenu_redirection() throws InterruptedException {

        logger.info("\"1.It should display the drop-down which will consists of a list of category\n" +
                "2.Clicking on main menu category, it should redirect to product listing page\"");
        Thread.sleep(50000);
        Actions ac=new Actions(driver);
        WebElement ele= driver.findElement(By.xpath("//span[contains(text(),'All Products')]"));
        WebElement ele1= driver.findElement(By.xpath("(//a[contains(.,'Admissions & Registration')])[1]"));
        ac.moveToElement(ele).moveToElement(ele1).click().build().perform();
        Thread.sleep(50000);
        WebUtils.navigateToURL(APPLICATION_URL);



    }
    public void Brawse_button() throws InterruptedException {

        logger.info("\"It should redirect to respective page\n" +
                "The background color should be black after tab\"\n");
        Thread.sleep(50000);
       // Thread.sleep(50000);
        WebElement alllinks = driver.findElement(By.xpath("//a[contains(text(),'THE MARVEL DIFFERENCE')]"));
alllinks.click();
        Thread.sleep(50000);
        WebUtils.navigateToURL(APPLICATION_URL);


    }

    public void Footer_product() throws InterruptedException {

        logger.info("It should redirect to respective page\n");
        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,2000)");
        WebElement alllinks = driver.findElement(By.xpath("//div[@class='col-lg-9 footer-links']"));


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

    public void Address_footer() throws InterruptedException {

        logger.info("\"It should display,\n" +
                "Visit us -  8095 215th Street West, Lakeville, MN 55044\n" +
                "Call us -952-890-7100,It should redirect to dialer with respective number on Click\n" +
                "Email us - sales@platinumcode.us,It should redirect to respecive application on Click\n" +
                "Customer Service Hours - Mon-Fri / 8:00 AM - 5:00 PM CST\"");
        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,2000)");
        WebElement alllinks = driver.findElement(By.xpath("//div[@class='col-lg-3']"));


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




    public void psp_page() throws InterruptedException {

        logger.info("It should get redirect to the respective PPE Products page");
        Thread.sleep(60000);

        WebElement alllinks = driver.findElement(By.xpath("(//img[contains(@width,'100%')])[7]"));


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

    public void BrawseProduct() throws InterruptedException {

        logger.info("When we Hover on 'Browse Products' icon,it should zoom in icon and below tiles green horizontal line should be visible.When we Click on 'Browse Products' it should redirect to All Products page.");
        Thread.sleep(60000);
        WebElement ele= driver.findElement(By.xpath("//div[contains(text(),'Browse Products')]"));
      ele.click();
        Thread.sleep(20000);
        WebUtils.navigateToURL(APPLICATION_URL);


    }

    public void resources() throws InterruptedException {

        logger.info("When we Hover on 'Resource center' icon,it should zoom in icon and below tiles green horizontal line should be visible.When we Click on 'Resource center' it should redirect to Resources page.");
        Thread.sleep(60000);
        WebElement ele= driver.findElement(By.xpath("//div[contains(text(),'Resource center')]"));
          ele.click();
          System.out.println(" Title of the page is "+driver.getTitle());
        Thread.sleep(9000);
        WebElement ele4= driver.findElement(By.xpath("//a[contains(.,'Home')]"));
        ele4.click();

    }

    public void FAQ() throws InterruptedException {

        logger.info("\"It should display with clear and distinct images and get redirect to U-Chill page\n");
        Thread.sleep(30000);
     //   WebElement ele4= driver.findElement(By.xpath("//button[@class='btn-cookie btn-cookie-accept']"));
     //   ele4.click();
    //    Thread.sleep(6000);
        WebElement ele= driver.findElement(By.xpath("(//div[contains(@class,'tile-text')])[3]"));
     //   System.out.println(ele.getText());
        ele.click();
        System.out.println(" Title of the page is "+driver.getTitle());
        Thread.sleep(9000);
        WebUtils.navigateToURL(APPLICATION_URL);



    }

    public void GPQ() throws InterruptedException {

        logger.info("        WebElement ele= driver.findElement(By.xpath(\"When we Hover on 'GPO Contracts' icon,it should zoom in icon and below tiles green horizontal line should be visible.When we Click on 'GPO Contracts' it should redirect to National GPO Contracts page.\"));\n");
        Thread.sleep(90000);


        WebElement ele= driver.findElement(By.xpath("//div[contains(text(),'GPO Contracts')]"));
        ele.click();
        System.out.println(" Title of the page is "+driver.getTitle());
        Thread.sleep(9000);
        WebElement ele4= driver.findElement(By.xpath("//a[contains(.,'Home')]"));
        ele4.click();
        Thread.sleep(9000);
        WebUtils.navigateToURL(APPLICATION_URL);
    }

    public void Healthcare() throws InterruptedException {

        logger.info("Banner should be visible with label");
        Thread.sleep(90000);

        WebElement ele= driver.findElement(By.xpath("//span[contains(text(),'Healthcare Labels &')]"));
        System.out.println("Label name:"+ele.getText());

    }

    public void healthcare_link() throws InterruptedException {

        logger.info("When we Click on respective link it should redirect to respective page.\"));\n");
        Thread.sleep(90000);

        WebElement alllinks = driver.findElement(By.xpath("(//div[contains(@class,'features-list')])[1]"));


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
    public void petiont_id_wristlist() throws InterruptedException {

        logger.info("When we Click on respective link it should redirect to respective page.\"));\n");
        Thread.sleep(90000);

        WebElement alllinks = driver.findElement(By.xpath("(//div[contains(@class,'features-list')])[2]"));


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


    public void Social_media_icon_FB() throws InterruptedException {

        logger.info("It  should redirect to Facebook");
        Thread.sleep(20000);
        Actions ac=new Actions(driver);
        WebElement notice = driver.findElement(By.xpath("//button[@class='leadinModal-close']"));
        ac.moveToElement(notice).click().build().perform();
        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        WebElement ele=driver.findElement(By.xpath("//i[@class='fab fa-facebook-square']"));
        ele.click();


    }
    public void Social_media_icon_Twitter() throws InterruptedException {

        logger.info("It  should redirect to Twitter");
        Thread.sleep(20000);

        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");

        WebElement ele=driver.findElement(By.xpath("//i[@class='fab fa-twitter-square']"));
        ele.click();

       // driver.switchTo().window(tabs.get(0));
    }


    public void Social_media_icon_You_tube() throws InterruptedException {

        logger.info("It  should redirect to You_tube");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");

        WebElement ele=driver.findElement(By.xpath("//i[@class='fab fa-youtube']"));
        ele.click();

//        driver.switchTo().window(tabs.get(0));
    }

    public void Social_media_icon_Linkedin() throws InterruptedException {

        logger.info("It  should redirect to Linkedin");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");


        WebElement ele=driver.findElement(By.xpath("//i[@class='fab fa-linkedin']"));
        ele.click();

      //  driver.switchTo().window(tabs.get(0));
    }


    public void Email_subsrcibe_blank() throws InterruptedException {

        logger.info("\"This is required field\"  message should dispaly");

        Thread.sleep(20000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        WebElement ele= driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
      Subscribe_button.click();
    }

    public void Email_subsribe_invalid() throws InterruptedException {

        logger.info("Invalid data - PLEASE ENTER A VALID EMAIL ADDRESS (EX: JOHNDOE@DOMAIN.COM). error message should disp;ay");
       // Thread.sleep(90000);
        Thread.sleep(20000);

        WebElement ele= driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
        ele.sendKeys("puja2upbott.com");
        Subscribe_button.click();
    }

    public void Email_subsribe_valid() throws InterruptedException {

        logger.info("Invalid data - PLEASE ENTER A VALID EMAIL ADDRESS (EX: JOHNDOE@DOMAIN.COM). error message should disp;ay");

        Thread.sleep(20000);
        String select = Keys.chord(Keys.CONTROL, "a");

        WebElement ele1= driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
        ele1.sendKeys(select);
        ele1.sendKeys("puja@upbott.com");
        Subscribe_button.click();
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
        WebElement element = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/div[1]/input[1]"));
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
      WebElement ele= driver.findElement(By.xpath("//body/div[4]/aside[1]/div[2]/footer[1]/button[1]"));
      ele.click();

    }

    public void Cross_button() throws InterruptedException {
        logger.info(" It should give the pop up as \"Are you sure you would like to remove this item from the shopping cart?\" with cancel and ok button. ");
        Thread.sleep(10000);
        WebElement ele1=driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]/span[2]"));
        ele1.click();
        Thread.sleep(3000);
        WebElement ele= driver.findElement(By.xpath("//a[@class='action delete']"));
        ele.click();


    }

    public void Cancel_button() throws InterruptedException {
        logger.info("\"It should remain on the same page\n" +
                "\" ");
        Thread.sleep(10000);

        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
       WebElement ele= driver.findElement(By.xpath("//span[contains(text(),'Cancel')]"));
       ele.click();

    }


    public void delete_tab() throws InterruptedException {
        logger.info("It should  remove the product from mini cart popup");
        WebElement ele= driver.findElement(By.xpath("(//span[contains(@class,'counter-number')])[1]"));
        ele.click();
        Thread.sleep(10000);
        WebElement ele1= driver.findElement(By.xpath("//a[@class='action delete']"));
        ele1.click();

    }
    public void viewandedit_tab() throws InterruptedException {
        logger.info("It should be redirect to shopping cart page");
        Thread.sleep(10000);
        WebElement ele= driver.findElement(By.xpath("(//span[contains(@class,'counter-number')])[1]"));
        ele.click();
        Thread.sleep(10000);
        WebElement ele1= driver.findElement(By.xpath("//span[contains(text(),'View and Edit Cart')]"));
        ele1.click();

    }
    public void checkout_tab() throws InterruptedException {
        logger.info("Application should redirect to checkout page");
        WebElement ele= driver.findElement(By.xpath("(//span[contains(@class,'counter-number')])[1]"));
        ele.click();
        Thread.sleep(10000);
        WebElement ele1= driver.findElement(By.xpath("//button[@id='top-cart-btn-checkout']"));
        ele1.click();
        Thread.sleep(10000);
        driver.navigate().back();
    }
    public void Ok_tab() throws InterruptedException {
        logger.info("It should  remove the product from mini cart popup");


               ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(8000);
       WebElement ele3=driver.findElement(By.xpath("//button[@class='action-primary action-accept']"));
       ele3.click();

    }
    public void edit_tab() throws InterruptedException {
        logger.info("It should redirect to respective products detail page.");
//        WebElement ele= driver.findElement(By.xpath("//a[@class='link login']"));
//        ele.click();
        Thread.sleep(10000);


        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(8000);
        WebElement ele1= driver.findElement(By.xpath("//a[@title='Edit item']"));
        ele1.click();

    }
    public void view_and_edit_cart() throws InterruptedException {
        logger.info("It should  remove the product from mini cart popup");
        Thread.sleep(30000);
        WebElement element = driver.findElement(By.xpath("//header/div[1]/div[3]/a[1]"));
        element.click();
        Thread.sleep(30000);
        Actions ac=new Actions(driver);
        WebElement ele= driver.findElement(By.xpath("//span[contains(.,'View and Edit Quote Request')]"));
       ac.moveToElement(ele).click().build().perform();
        Thread.sleep(30000);

        WebElement element1 = driver.findElement(By.xpath("//img[contains(@title,'PlatinumCode')]"));
        element1.click();

    }
}

