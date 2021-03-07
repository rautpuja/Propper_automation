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
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class My_saved_item_page {
    private static final Logger logger = LoggerFactory.getLogger(PartSearch_Page.class);

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

    @FindBy(how = How.XPATH, using="//a[contains(text(),'My Saved Items')]")
    @CacheLookup
    WebElement My_Saved_Item;

    @FindBy(how = How.XPATH, using="//body/div[1]/main[1]/div[2]/div[1]/form[1]/div[1]/ol[1]/li[1]/div[1]/div[2]/div[2]/a[1]/span[1]")
    @CacheLookup
    WebElement Edit;

    @FindBy(how = How.XPATH, using="//body/div[1]/main[1]/div[2]/div[1]/form[1]/div[1]/ol[1]/li[1]/div[1]/div[2]/div[2]/a[2]/span[1]")
    @CacheLookup
    WebElement Remove;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Add to Cart')]")
    @CacheLookup
    WebElement AddToCart;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'Add All to Cart')]")
    @CacheLookup
    WebElement Add_all_ToCart;

    @FindBy(how = How.XPATH, using="//header/div[2]/a[1]/img[1]")
    @CacheLookup
    WebElement Home_Page;

    public My_saved_item_page(WebDriver driver){
        this.driver=driver;
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

    public void My_Saved_Item() throws InterruptedException {
        logger.info("Page should redirect to Wishlist Page");
        Thread.sleep(20000);
        Actions ac =new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("//a[contains(.,'My Saved Items')]"));
      ac.moveToElement(ele).click().build().perform();
    }
    public void show() throws InterruptedException {
        logger.info("By deafult 10 should be selected and results should be according to the slection. It should sort the results as per 10,25,50,100 items selected. It should be present in the top right of my orders table section.");
        Thread.sleep(10000);
        WebElement ele = driver.findElement(By.xpath("(//select[contains(@id,'limiter')])[1]"));
        Select sel=new Select(ele);
        sel.selectByVisibleText("50");

        Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl());

    }

    public void Product_detail() throws InterruptedException {
        logger.info("It should display correct Product image/Name/Price clear & distinct.");
        Thread.sleep(4000);
        WebElement ele = driver.findElement(By.xpath("(//div[contains(@class,'product-item-info')])[1]"));
        System.out.println(" Product deatil: "+ele.getText());

    }
    public void Product_image_link() throws InterruptedException {
        logger.info("It should get redirect to the respective page.");
        Thread.sleep(10000);
        WebElement ele = driver.findElement(By.xpath("(//a[@class='product-item-link'])[1]"));
        ele.click();
        Thread.sleep(10000);
        driver.navigate().back();

    }
    public void Qty_addto_cart() throws InterruptedException {
        logger.info("qty should be on the left side & add to cart button should be right side");
        Thread.sleep(10000);
        WebElement ele = driver.findElement(By.xpath("(//div[contains(@class,'product-item-inner')])[1]"));
       System.out.println(" Tile  " +ele.getText());

    }
    public void Qty_input_manually() throws InterruptedException {
        logger.info("Qty box should allow to manually input the field.");
        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement ele = driver.findElement(By.xpath("(//input[@value='1'])[1]"));
        ele.sendKeys(select);
        ele.sendKeys("3");

    }
    public void add_to_cart() throws InterruptedException {
        logger.info("It should display 'You added Product_name to your shopping cart.'");
        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement ele = driver.findElement(By.xpath("(//span[contains(.,'Add to Cart')])[1]"));
       ele.click();
        Thread.sleep(10000);
//        WebElement ele22 = driver.findElement(By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)'][contains(.,'You added Fan Blade Ref# 586c1255cpi to your shopping cart.')]"));
//       System.out.println(" "+ele22.getText());

    }
    public void remove() throws InterruptedException {
        logger.info("Product should be removed from my saves items");
        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement ele = driver.findElement(By.xpath("(//a[@href='#'][contains(.,'Remove')])[2]"));
        ele.click();

    }
}
