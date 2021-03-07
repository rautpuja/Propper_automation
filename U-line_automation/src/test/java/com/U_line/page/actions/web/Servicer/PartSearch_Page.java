package com.U_line.page.actions.web.Servicer;

import com.U_line.utils.common.Config;
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
    private static final String APPLICATION_URL = Config.getProperty("appURL");
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

    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Serial Number')]")
    @CacheLookup
    WebElement Searial_Number;

    @FindBy(how = How.XPATH, using="//input[@placeholder='1714862050527']")
    @CacheLookup
    WebElement Serialnumber;

    @FindBy(how = How.XPATH, using="//button[@id='el_search']")
    @CacheLookup
    WebElement search;



    @FindBy(how = How.XPATH, using="//input[@product_id='11189']")
    @CacheLookup
    WebElement addtocart;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'View Cart')]")
    @CacheLookup
    WebElement viewcart;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Continue Shopping')]")
    @CacheLookup
    WebElement ContinueShopping;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Continue Shopping')]")
    @CacheLookup
    WebElement CrossIcon;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Downloads')]")
    @CacheLookup
    WebElement Download;
    @FindBy(how = How.XPATH, using="//span[contains(text(),'2D CAD (DWG)')]")
    @CacheLookup
    WebElement PDF1;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'3D CAD (DWG)')]")
    @CacheLookup
    WebElement PDF2;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Compliance')]")
    @CacheLookup
    WebElement PDF3;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Current Product Warranty')]")
    @CacheLookup
    WebElement PDF4;


    @FindBy(how = How.XPATH, using="//span[contains(text(),'Energuide (Canada)')]")
    @CacheLookup
    WebElement PDF5;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Energy Guide (US)')]")
    @CacheLookup
    WebElement PDF6;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Expanded View of Parts')]")
    @CacheLookup
    WebElement PDF7;

//    @FindBy(how = How.XPATH, using="//span[contains(text(),'Panel Specs')]")
//    @CacheLookup
//    WebElement PDF9;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Quick Start Guide')]")
    @CacheLookup
    WebElement PDF8;



    @FindBy(how = How.XPATH, using="//input[@Placeholder='Search...']")
    @CacheLookup
    WebElement SearchTextBox;

    public PartSearch_Page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    public void providerlogin() {
        logger.info("After login After login By default parts search should open");
        // TODO Auto-generated method stub
        providerlogin.click();
    }

    public void setemail(String email)
    {
        txtemail.sendKeys(email);
    }

    public void setPassword(String pwd)
    {
        txtPassword.sendKeys(pwd);
    }


    public void clickSubmit()
    {
        btnLogin.click();
    }

    public void Part_search_SerialNumber() throws InterruptedException {
        logger.info("Click on Serial Number It should be clickable and the background color should be black after clicking");
        Thread.sleep(10000);
        WebElement ele= driver.findElement(By.xpath("//label[contains(text(),'Serial Number')]"));
        ele.click();
    }


    public void SerialNumber() throws InterruptedException {
        logger.info("1.Model number/Serial Number/Part Number should be search by entering valid data\\n\" +\n" +
                "                \"2.auto result should be generated");
        Thread.sleep(4000);
        driver.navigate().refresh();
        Thread.sleep(8000);
        WebElement ele= driver.findElement(By.xpath("//label[contains(text(),'Serial Number')]"));
        ele.click();
        WebElement ele2= driver.findElement(By.xpath("//input[@id='serial']"));
        ele2.click();
        ele2.sendKeys("1957171060030");
        ele2.sendKeys(Keys.ENTER);
    }
    public void Wrong_SerialNumber() throws InterruptedException {
        logger.info("Error mesage should display 'Invalid Entry. The part you are looking for may be discontinued. Please see our Discontinued " +
                "Parts Cross Reference Guide. Still Don’t see what you’re looking for? Contact us.'");
        Thread.sleep(4000);
        Serialnumber.sendKeys("1957171");

    }
    public void Search() throws InterruptedException {
        logger.info("Search Result should display with correct result on same page below the parts Search  banner");
        Thread.sleep(4000);
       WebElement ele= driver.findElement(By.xpath("//button[@class='button btn action search-btn']"));
   ele.click();
    }

    public void addtocart() throws InterruptedException {

        logger.info("\"It should give the pop up as \"\"View Cart\"\" and display \n" +
                "'Continue shopping' button\"");
        Thread.sleep(5000);
        //WebDriverWait wait2 = new WebDriverWait(driver, 10);
        //wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkmo']")));
        WebElement element = driver.findElement(By.xpath("//input[@product_id='11189']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
        //addtocart.click();


    }

    public void viewcart() throws InterruptedException {
        logger.info(" \"It should be redirect to Shopping cart page\n" +
                "\" ");
        Thread.sleep(6000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        viewcart.click();

    }


    public void ContinueShopping() throws InterruptedException {
        logger.info(" Click on continue button ");

        Thread.sleep(8000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(4000);
        ContinueShopping.click();


    }
    public void Download() throws InterruptedException {
        logger.info(" All given document links should be downloaded and open in propper formate ");


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




    public void SearchBox() throws InterruptedException {
        logger.info(" It should search for Part Number,Description and Price and give respective result ");
        SearchTextBox.sendKeys("80-54000-00");
    }

}
