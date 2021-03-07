package com.Marvel.page.actions.web.Servicer;

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
import java.util.List;

public class PartSearch_Page {
    private static final Logger logger = LoggerFactory.getLogger(PartSearch_Page.class);

    private WebDriver driver;
    @FindBy(how = How.XPATH, using = "//a[.='Provider Login' and not(@title)]")
    @CacheLookup
    WebElement providerlogin;

    @FindBy(how = How.XPATH, using = "//input[@id='email']")
    @CacheLookup
    WebElement txtemail;


    @FindBy(xpath = "//input[@id='pass']")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(name = "send")
    @CacheLookup
    WebElement btnLogin;


    public PartSearch_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void providerlogin() {
        logger.info("After login After login By default parts search should open");
        // TODO Auto-generated method stub
        WebElement ele = driver.findElement(By.xpath("(//a[contains(.,'Login')])[1]"));
        ele.click();
    }

    public void setemail(String email) {
        txtemail.sendKeys(email);
    }

    public void setPassword(String pwd) {
        txtPassword.sendKeys(pwd);
    }


    public void clickSubmit() {
        btnLogin.click();
    }

    public void PartSearchtab() throws InterruptedException {
        logger.info("By default, parts search is open after login");
        Thread.sleep(10000);
        WebElement ele = driver.findElement(By.xpath("//span[@class='title'][contains(.,'Parts Search')]"));
        System.out.println(" Title of the page is" + driver.getTitle());
    }

    public void Click_link() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(10000);

        WebElement alllinks = driver.findElement(By.xpath("//p[contains(.,'To view Service Bulletins,  click here.')]"));


        List<WebElement> Links = alllinks.findElements(By.tagName("a"));
        int Count = Links.size();
        System.out.println("Name: " + Count);
        for (int i = 0; i < Links.size(); i++) {
            String Opentabs = Keys.chord(Keys.CONTROL, Keys.ENTER);

            Links.get(i).sendKeys(Opentabs);
            //  System.out.println(driver.getTitle());

        }

    }

    public void Partsearch_models() throws InterruptedException {
        logger.info("It should be clickable and the background color should be black after clicking");
        Thread.sleep(10000);
        WebElement ele = driver.findElement(By.xpath("//label[@for='model-number'][contains(.,'Service Model Number')]"));
        ele.click();
        Thread.sleep(3000);
        WebElement ele2 = driver.findElement(By.xpath("//label[@for='serial-number'][contains(.,'Serial Number')]"));
        ele2.click();
        Thread.sleep(3000);
        WebElement ele3 = driver.findElement(By.xpath("//label[@for='part-number'][contains(.,'Part Number')]"));
        ele3.click();

    }

    public void Help() throws InterruptedException {
        logger.info("It should display a popup image");
        Thread.sleep(10000);
        WebElement ele = driver.findElement(By.xpath("//span[@class='hint-tigger'][contains(.,'Need Help ?')]"));
        ele.click();
        Thread.sleep(10000);
        ele.click();
    }

    public void Service_model_number_blank() throws InterruptedException {
        logger.info("\"The search text box should be present in the middle of banner with the watermark/placeholder fields \n" +
                "ML24BCG1RS1\" ");
        Thread.sleep(10000);
        WebElement ele = driver.findElement(By.xpath("//label[@for='model-number'][contains(.,'Service Model Number')]"));
        ele.click();
        Thread.sleep(10000);
        WebElement ele1 = driver.findElement(By.xpath("//input[contains(@name,'serial')]"));
        ele1.sendKeys(Keys.ENTER);
        Thread.sleep(10000);
        WebElement ele2 = driver.findElement(By.xpath("//div[@for='serial'][contains(.,'This is a required field.')]"));
        System.out.println(" message is " + ele2.getText());
    }

    public void Service_model_number_invalid() throws InterruptedException {
        logger.info("Error mesage should display 'Invalid Entry. The part you are looking for may be discontinued. Please see our Discontinued Parts Cross Reference Guide. Still Don’t see what you’re looking for? Contact us.'");
        Thread.sleep(10000);
//        WebElement ele= driver.findElement(By.xpath("//label[@for='model-number'][contains(.,'Service Model Number')]"));
//        ele.click();
//        Thread.sleep(10000);
        WebElement ele1 = driver.findElement(By.xpath("//input[contains(@name,'serial')]"));
        ele1.sendKeys("576778");
        ele1.sendKeys(Keys.ENTER);
        Thread.sleep(10000);
        WebElement ele2 = driver.findElement(By.xpath("//td[contains(@colspan,'6')]"));
        System.out.println(" message is " + ele2.getText());
    }

    public void Service_model_number_valid() throws InterruptedException {
        logger.info("\"It should be give autoload and similar Service Model Number or Serial Number or Part Number\n" +
                "Search Result should display with correct result on same page below the parts search banner\n" +
                "For Service Model Number and Serial Number , it should display two buttons 'Service Parts List' and 'Download' below the parts search banner\"");
        Thread.sleep(10000);
//        WebElement ele= driver.findElement(By.xpath("//label[@for='model-number'][contains(.,'Service Model Number')]"));
//        ele.click();
//        Thread.sleep(10000);
        WebElement ele1 = driver.findElement(By.xpath("//input[contains(@name,'serial')]"));
        String select = Keys.chord(Keys.CONTROL, "a");
        ele1.sendKeys(select);
        ele1.sendKeys("ML24BNS2LB1");
        ele1.sendKeys(Keys.ENTER);
        Thread.sleep(10000);
//        WebElement ele2= driver.findElement(By.xpath("//strong[contains(.,'ML24BNS2LB1')]"));
//        System.out.println(" ML24BNS2LB1=  "+ele2.getText());
    }

    public void Download_tab() throws InterruptedException {
        logger.info("\"It should be clickable\n" +
                "Background should change in black color after clicking\"");
        Thread.sleep(10000);
        WebElement ele = driver.findElement(By.xpath("//span[contains(.,'Downloads')]"));
        ele.click();
        Thread.sleep(10000);
        WebElement alllinks = driver.findElement(By.xpath("//div[@id='downloads-tab-container']"));


        List<WebElement> Links = alllinks.findElements(By.tagName("a"));
        int Count = Links.size();
        System.out.println("Name: " + Count);
        for (int i = 0; i < Links.size(); i++) {
            String Opentabs = Keys.chord(Keys.CONTROL, Keys.ENTER);

            Links.get(i).sendKeys(Opentabs);
            //  System.out.println(driver.getTitle());

        }


        Thread.sleep(10000);
        WebElement ele1 = driver.findElement(By.xpath("//span[contains(.,'Service Parts List')]"));
        ele1.click();

    }

    public void Download_link() throws InterruptedException {
        logger.info("After click on download respected document should get downloaded");
        Thread.sleep(10000);
        WebElement ele = driver.findElement(By.xpath("(//a[@target='_blank'][contains(.,'Download')])[1]"));
        ele.click();


    }
    public void serial_number_blank() throws InterruptedException {
        logger.info("Error mesage should display 'This is required field' and It should be clickable ");
        Thread.sleep(10000);
        WebElement ele = driver.findElement(By.xpath("//label[@for='serial-number']"));
        ele.click();
        Thread.sleep(10000);
        WebElement ele1 = driver.findElement(By.xpath("//input[@placeholder='2019102805H']"));
        ele1.sendKeys(Keys.ENTER);
        Thread.sleep(10000);
        WebElement ele2 = driver.findElement(By.xpath("//div[@for='serial'][contains(.,'This is a required field.')]"));
        System.out.println(" message is " + ele2.getText());
    }

    public void serial_number_invalid() throws InterruptedException {
        logger.info("Error mesage should display 'Invalid Entry. The part you are looking for may be discontinued. Please see our Discontinued Parts Cross Reference Guide. Still Don’t see what you’re looking for? Contact us.'");
        Thread.sleep(10000);
//        WebElement ele= driver.findElement(By.xpath("//label[@for='model-number'][contains(.,'Service Model Number')]"));
//        ele.click();
//        Thread.sleep(10000);
        WebElement ele1 = driver.findElement(By.xpath("//input[@placeholder='2019102805H']"));
        ele1.sendKeys("576778");
        ele1.sendKeys(Keys.ENTER);
        Thread.sleep(10000);
        WebElement ele2 = driver.findElement(By.xpath("//td[contains(@colspan,'6')]"));
        System.out.println(" message is " + ele2.getText());
    }

    public void serial_number_valid() throws InterruptedException {
        logger.info("\"It should be give autoload and similar Service Model Number or Serial Number or Part Number\n" +
                "Search Result should display with correct result on same page below the parts search banner\n" +
                "For Service Model Number and Serial Number , it should display two buttons 'Service Parts List' and 'Download' below the parts search banner\"");
        Thread.sleep(10000);
//        WebElement ele= driver.findElement(By.xpath("//label[@for='model-number'][contains(.,'Service Model Number')]"));
//        ele.click();
//        Thread.sleep(10000);
        WebElement ele1 = driver.findElement(By.xpath("//input[@placeholder='2019102805H']"));
        String select = Keys.chord(Keys.CONTROL, "a");
        ele1.sendKeys(select);
        ele1.sendKeys("20191216052H");
        ele1.sendKeys(Keys.ENTER);
        Thread.sleep(10000);
//        WebElement ele2= driver.findElement(By.xpath("//strong[contains(.,'ML24BNS2LB1')]"));
//        System.out.println(" ML24BNS2LB1=  "+ele2.getText());
    }

    public void Download_tab_serial_number() throws InterruptedException {
        logger.info("By default, parts search is open after login");
        Thread.sleep(10000);
        WebElement ele = driver.findElement(By.xpath("//span[contains(.,'Downloads')]"));
        ele.click();
        Thread.sleep(10000);
        WebElement alllinks = driver.findElement(By.xpath("//div[@id='downloads-tab-container']"));


        List<WebElement> Links = alllinks.findElements(By.tagName("a"));
        int Count = Links.size();
        System.out.println("Name: " + Count);
        for (int i = 0; i < Links.size(); i++) {
            String Opentabs = Keys.chord(Keys.CONTROL, Keys.ENTER);

            Links.get(i).sendKeys(Opentabs);
            //  System.out.println(driver.getTitle());

        }


        Thread.sleep(10000);
        WebElement ele1 = driver.findElement(By.xpath("//span[contains(.,'Service Parts List')]"));
        ele1.click();

    }

    public void Download_link_serial_number() throws InterruptedException {
        logger.info("By default, parts search is open after login");
        Thread.sleep(10000);
        WebElement ele = driver.findElement(By.xpath("(//a[@target='_blank'][contains(.,'Download')])[1]"));
        ele.click();


    }



    public void Part_number_blank() throws InterruptedException {
        logger.info("By default, parts search is open after login");
        Thread.sleep(3000);
        WebElement ele3 = driver.findElement(By.xpath("//label[@for='part-number'][contains(.,'Part Number')]"));
        ele3.click();
        Thread.sleep(10000);
        WebElement ele1 = driver.findElement(By.xpath("//input[contains(@name,'serial')]"));
        ele1.sendKeys(Keys.ENTER);
        Thread.sleep(10000);
        WebElement ele2 = driver.findElement(By.xpath("//div[@for='serial'][contains(.,'This is a required field.')]"));
        System.out.println(" message is " + ele2.getText());
    }

    public void Part_number_invalid() throws InterruptedException {
        logger.info("By default, parts search is open after login");
        Thread.sleep(10000);
//        WebElement ele= driver.findElement(By.xpath("//label[@for='model-number'][contains(.,'Service Model Number')]"));
//        ele.click();
//        Thread.sleep(10000);
        WebElement ele1 = driver.findElement(By.xpath("//input[contains(@name,'serial')]"));
        ele1.sendKeys("576778");
        ele1.sendKeys(Keys.ENTER);
        Thread.sleep(10000);
        WebElement ele2 = driver.findElement(By.xpath("//td[contains(@colspan,'6')]"));
        System.out.println(" message is " + ele2.getText());
    }

    public void Part_number_valid() throws InterruptedException {
        logger.info("\"It should be give autoload and similar Service Model Number or Serial Number or Part Number\n" +
                "Search Result should display with correct result on same page below the parts search banner\n" +
                "For Service Model Number and Serial Number , it should display two buttons 'Service Parts List' and 'Download' below the parts search banner\"");
        Thread.sleep(10000);
//        WebElement ele= driver.findElement(By.xpath("//label[@for='model-number'][contains(.,'Service Model Number')]"));
//        ele.click();
//        Thread.sleep(10000);
        WebElement ele1 = driver.findElement(By.xpath("//input[contains(@name,'serial')]"));
        String select = Keys.chord(Keys.CONTROL, "a");
        ele1.sendKeys(select);
        ele1.sendKeys("42242833-ACCY");
        ele1.sendKeys(Keys.ENTER);
        Thread.sleep(10000);
//        WebElement ele2= driver.findElement(By.xpath("//strong[contains(.,'ML24BNS2LB1')]"));
//        System.out.println(" ML24BNS2LB1=  "+ele2.getText());
    }

    public void Download_tab_for_part_number() throws InterruptedException {
        logger.info("\"It should be clickable\n" +
                "Background should change in black color after clicking\"");
        Thread.sleep(10000);
        WebElement ele = driver.findElement(By.xpath("//span[contains(.,'Downloads')]"));
        ele.click();
        Thread.sleep(10000);
        WebElement alllinks = driver.findElement(By.xpath("//div[@id='downloads-tab-container']"));


        List<WebElement> Links = alllinks.findElements(By.tagName("a"));
        int Count = Links.size();
        System.out.println("Name: " + Count);
        for (int i = 0; i < Links.size(); i++) {
            String Opentabs = Keys.chord(Keys.CONTROL, Keys.ENTER);

            Links.get(i).sendKeys(Opentabs);
            //  System.out.println(driver.getTitle());

        }


        Thread.sleep(10000);
        WebElement ele3 = driver.findElement(By.xpath("//label[@for='part-number'][contains(.,'Part Number')]"));
        ele3.click();

    }

    public void Download_link_For_part_number() throws InterruptedException {
        logger.info("After click on download respected document should get downloaded");
        Thread.sleep(10000);
        WebElement ele = driver.findElement(By.xpath("(//a[@target='_blank'][contains(.,'Download')])[1]"));
        ele.click();


    }

    public void add_to_cart_button() throws InterruptedException {
        logger.info("It should give the pop up as \"Added to Cart\" and display 'View Cart' button and 'Continue Shopping' button");
        Thread.sleep(10000);
        WebElement ele = driver.findElement(By.xpath("//input[contains(@type,'button')]"));
        ele.click();
        Thread.sleep(10000);

        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        WebElement text= driver.findElement(By.xpath("//footer[@class='modal-footer']"));
       System.out.println("Pop up message is:" +text.getText());
    }


    public void add_to_cart_continueshopping() throws InterruptedException {
        logger.info("It should remain on the same page");
        Thread.sleep(10000);

        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);


        WebElement cancel = driver.findElement(By.xpath("//span[contains(.,'Continue Shopping')]"));
        cancel.click();
    }
    public void add_to_cart_view_cart() throws InterruptedException {
        logger.info("\"It should be redirect to shopping cart page\n" +
                "\"");
        Thread.sleep(30000);
        WebElement ele = driver.findElement(By.xpath("//input[contains(@type,'button')]"));
        ele.click();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);


        Thread.sleep(10000);
        WebElement cancel = driver.findElement(By.xpath("//span[contains(.,'View Cart')]"));
        cancel.click();
    }
    public void Search_textbox() throws InterruptedException {
        logger.info("It should search for Part Number,Description and Price and give respective result");
        Thread.sleep(10000);
        WebElement ele = driver.findElement(By.xpath("//input[contains(@placeholder,'Search...')]"));
       ele.sendKeys("42248156");

    }
}