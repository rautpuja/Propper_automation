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

public class Search_result_page {

    private static final Logger logger = LoggerFactory.getLogger(Search_result_page.class);

    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//i[@class='porto-icon-search']")
    @CacheLookup
    WebElement Search_icon;




    public Search_result_page(WebDriver driver){
        this.driver=driver;
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
    public void login(String email,String pwd) throws InterruptedException {
        Thread.sleep(50000);
        logger.info("Login to customer");
        driver.navigate().refresh();
//        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,-10000)");

//        WebElement button1= driver.findElement(By.xpath("//div[@class='leadin-content-body ']"));
//        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//        driver.switchTo().window(tabs2.get(0));
//        Thread.sleep(2000);
//        button1.click();

        Thread.sleep(10000);
        WebElement button= driver.findElement(By.xpath("//a[@class='link login']"));
        button.click();
        Thread.sleep(5000);


        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement txtemail= driver.findElement(By.xpath("//input[@id='email']"));

        txtemail.sendKeys(email);

        WebElement txtPassword= driver.findElement(By.xpath("//input[@name='login[password]']"));

        txtPassword.sendKeys(pwd);
        WebElement btnLogin= driver.findElement(By.xpath("//button[@class='action login primary']"));
        btnLogin.click();
    }
    public void Dropdown_login() throws InterruptedException {
        Thread.sleep(9000);
        logger.info("\"It should show products with View Details link for not logged in users and should show products with Item,price,aad to wishlist and add to cart link after login");

        WebElement Search_icon= driver.findElement(By.xpath("//input[@placeholder='Search']"));
         Search_icon.sendKeys("label");
         Thread.sleep(9000);


    }

    public void shopBysection_login() throws InterruptedException {
      //  Thread.sleep(4000);
        logger.info("To validate the functionality of 'Shop By' section search autopopulate dropdown after login");
        Thread.sleep(50000);
        WebElement alllinks = driver.findElement(By.xpath("//div[@class='ma-layer wyomind-bg-secondary']"));
         System.out.println(alllinks.getText());
        WebElement alllinks1 = driver.findElement(By.xpath("(//div[@class='ma-filter-title'][contains(.,'Width')])[1]"));
        alllinks1.click();


    }
    public void Option_login() throws InterruptedException {
        //  Thread.sleep(4000);
        logger.info("To validate the functionality of 'Shop By' section search autopopulate dropdown after login");
        Thread.sleep(30000);
        Actions ac=new Actions(driver);

        WebElement alllinks2 = driver.findElement(By.xpath("(//span[contains(.,'0.375 in')])[1]"));
        ac.moveToElement(alllinks2).click().build().perform();

    }
    public void sortbydropdown_login() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("\"1.By default Relevence should be selected\n" +
                "2.Dropdown option should be selectable after login");
        Thread.sleep(5000);
        WebElement ele3= driver.findElement(By.xpath("//div[@id='ma-order']//select[@id='sorter']"));
        Select sel=new Select(ele3);
        sel.selectByValue("name");


    }

public void ascending_arrow_login() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Upward arrows should sort results in descending order and downward should sort it as ascending order.after login");


    WebElement Assending= driver.findElement(By.xpath("//a[@title='Set Ascending Direction']"));
    if(Assending.isDisplayed()) {
        Actions ac = new Actions(driver);


        ac.moveToElement(Assending).click().build().perform();

System.out.println("click on assending order");
    }
    else {
        Actions ac = new Actions(driver);

        WebElement dessending = driver.findElement(By.xpath("//a[@title='Set Descending Direction']"));
        ac.click(dessending).click().build().perform();
        System.out.println("click on descending order");
    }


}
    public void Search_result_page_login() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Product listing page should get displayed " +
                "according to category name after login");
        Thread.sleep(5000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement Search_icon= driver.findElement(By.xpath("//input[@placeholder='Search']"));
        Search_icon.sendKeys(select);
        Search_icon.sendKeys("label");
        Thread.sleep(9000);
        Search_icon.sendKeys(Keys.ENTER);



    }
    public void sort_result_page_login() throws InterruptedException {
        Thread.sleep(30000);
        logger.info("It should redirect to respective page\n After login");
Actions ac=new Actions(driver);

        WebElement Search_icon= driver.findElement(By.xpath("(//span[@class='title '][contains(.,'0.375 in')])[3]"));
        ac.moveToElement(Search_icon).click().build().perform();




    }
    public void clear_all_searchaut_popup_login() throws InterruptedException {
        Thread.sleep(20000);
        logger.info("It should redirect to respective page\n after login");


        WebElement Search_icon= driver.findElement(By.xpath("(//a[@href='#'])[2]"));
       Search_icon.click();




    }

public void Product_name_login() throws InterruptedException {
      //  Thread.sleep(4000);
        logger.info("\"It should redirect to respective page\n" +
                "After login");
    Thread.sleep(10000);

    WebElement Search_icon= driver.findElement(By.xpath("(//li[contains(@class,'item')])[1]"));
   System.out.println("Propduct Info : "+Search_icon.getText());
    Thread.sleep(10000);
    Actions ac= new Actions(driver);
    WebElement target= driver.findElement(By.xpath("(//a[contains(@class,'product-item-link')])[1]"));
   ac.moveToElement(target).click().build().perform();

    Thread.sleep(10000);
    driver.navigate().back();

    }

    public void Assending_order_search_login() throws InterruptedException {
        logger.info("\"1.On Upward arrow selection it will set products in Ascending Order\n" +
                "2.On Downward arrow selection it will set products in DescendingOrder\" after login");
        Thread.sleep(50000);

        String select = Keys.chord(Keys.CONTROL, "a");

        WebElement Search_icon= driver.findElement(By.xpath("//input[@class='input-text loaded']"));
        Search_icon.sendKeys(select);
        Search_icon.sendKeys("wine");
        Thread.sleep(10000);
        WebElement ele= driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[2]/a[1]"));
        ele.click();


    }

    public void Cross_button_login() throws InterruptedException {
        logger.info("\"1.On Upward arrow selection it will set products in Ascending Order\n" +
                "2.On Downward arrow selection it will set products in DescendingOrder\"after login");
        Thread.sleep(50000);

        String select = Keys.chord(Keys.CONTROL, "a");

        WebElement Search_icon= driver.findElement(By.xpath("//input[@placeholder='Search']"));
        Search_icon.sendKeys(select);
        Search_icon.sendKeys("label");
        Thread.sleep(5000);
        WebElement ele= driver.findElement(By.xpath("//a[@class='close']"));
        ele.click();


    }
    public void SortBydropdown_page_login() throws InterruptedException {

        Thread.sleep(10000);

        logger.info("\"1.By default Relevence should be selected\n" +
                "2.Dropdown option should be selectable \" after login ");
        WebElement ele3= driver.findElement(By.xpath("(//select[contains(@id,'sorter')])[2]"));
        Select sel=new Select(ele3);
        sel.selectByValue("name");
    }
    public void Assending_order_login() throws InterruptedException {
        logger.info("\"1.On Upward arrow selection it will set products in Ascending Order\n" +
                "2.On Downward arrow selection it will set products in DescendingOrder\"");
       Thread.sleep(50000);
        WebElement Assending= driver.findElement(By.xpath("//a[contains(.,'Set Ascending Direction')]"));
        if(Assending.isDisplayed()) {
            Actions ac = new Actions(driver);


            ac.moveToElement(Assending).click().build().perform();
            System.out.println("click on ascending order");

        }
        else {
            Actions ac = new Actions(driver);

            WebElement dessending = driver.findElement(By.xpath("//a[contains(.,'Set Descending Direction')]"));
            ac.click(dessending).click().build().perform();
            System.out.println("click on descending order");
        }


    }

    public void Clear_all_rearchresult_page_login() throws InterruptedException {
        logger.info("Filter option should be clear");
        Thread.sleep(50000);
      WebElement ele= driver.findElement(By.xpath("(//a[@class='eln-layer-clear-all clear'])[2]"));
      ele.click();

    }

    public void Product_name_searchresultpage_login() throws InterruptedException {
        logger.info("\"It should redirect to respective page\n" +
                "\"");
        Thread.sleep(50000);
        WebElement ele3= driver.findElement(By.xpath("(//div[contains(@class,'product-item-info')])[1]"));
           ele3.click();


    }

    public void Product_nametest_login() throws InterruptedException {
        logger.info("It should redirect to PDP page\n");

        Thread.sleep(10000);

       WebElement ele= driver.findElement(By.xpath("//a[.='24-in Built-in Beverage Center with Split Convertible Shelves' and not(@title)]"));
       ele.click();

    }


    public void learn_login() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should get redirected to the category page and all respective products  should display on it");



        WebElement target= driver.findElement(By.xpath("//body/div[3]/main[1]/div[3]/div[1]/div[3]/span[1]/div[1]/ol[1]/li[1]/div[3]/div[1]/div[4]/div[1]/div[1]/a[1]"));
        WebElement ele3= driver.findElement(By.xpath("//body/div[3]/main[1]/div[3]/div[1]/div[3]/span[1]/div[1]/ol[1]/li[1]/div[3]/div[1]/div[4]/div[1]/div[2]/a[1]"));
        // Actions a = new Actions(driver);
        Actions action = new Actions(driver);
//moving to the main menu and then sub menu and clicking on it using object of the Actions class
        action.moveToElement(target).moveToElement(ele3).click();

    }


    public void Dropdown() throws InterruptedException {
        Thread.sleep(9000);
        logger.info("\"It should show products with View Details link for not logged in users and should show products with Item,price,aad to wishlist and add to cart link\n");

        WebElement Search_icon= driver.findElement(By.xpath("//input[@placeholder='Search']"));
        Search_icon.sendKeys("label");
        Thread.sleep(9000);


    }

    public void shopBysection() throws InterruptedException {
        //  Thread.sleep(4000);
        logger.info("To validate the functionality of 'Shop By' section search autopopulate dropdown ");
        Thread.sleep(50000);
        WebElement alllinks = driver.findElement(By.xpath("//div[@class='ma-layer wyomind-bg-secondary']"));
        System.out.println(alllinks.getText());
        WebElement alllinks1 = driver.findElement(By.xpath("(//div[@class='ma-filter-title'][contains(.,'Width')])[1]"));
        alllinks1.click();


    }
    public void Option() throws InterruptedException {
        //  Thread.sleep(4000);
        logger.info("To validate the functionality of 'Shop By' section search autopopulate dropdown ");
        Thread.sleep(30000);
        Actions ac=new Actions(driver);

        WebElement alllinks2 = driver.findElement(By.xpath("(//span[contains(.,'0.375 in')])[1]"));
        ac.moveToElement(alllinks2).click().build().perform();

    }
    public void sortbydropdown() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("\"1.By default Relevence should be selected\n" +
                "2.Dropdown option should be selectable \"");
        Thread.sleep(5000);
        WebElement ele3= driver.findElement(By.xpath("//div[@id='ma-order']//select[@id='sorter']"));
        Select sel=new Select(ele3);
        sel.selectByValue("name");


    }

    public void ascending_arrow() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Upward arrows should sort results in descending order and downward should sort it as ascending order.");


        WebElement Assending= driver.findElement(By.xpath("//a[@title='Set Ascending Direction']"));
        if(Assending.isDisplayed()) {
            Actions ac = new Actions(driver);


            ac.moveToElement(Assending).click().build().perform();

            System.out.println("click on assending order");
        }
        else {
            Actions ac = new Actions(driver);

            WebElement dessending = driver.findElement(By.xpath("//a[@title='Set Descending Direction']"));
            ac.click(dessending).click().build().perform();
            System.out.println("click on descending order");
        }


    }
    public void Search_result_page() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Product listing page should get displayed according to category name");
        Thread.sleep(5000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement Search_icon= driver.findElement(By.xpath("//input[@placeholder='Search']"));
        Search_icon.sendKeys(select);
        Search_icon.sendKeys("label");
        Thread.sleep(9000);
        Search_icon.sendKeys(Keys.ENTER);



    }
    public void sort_result_page() throws InterruptedException {
        Thread.sleep(30000);
        logger.info("It should redirect to respective page\n");
        Actions ac=new Actions(driver);

        WebElement Search_icon= driver.findElement(By.xpath("(//span[@class='title '][contains(.,'0.375 in')])[3]"));
        ac.moveToElement(Search_icon).click().build().perform();




    }
    public void clear_all_searchaut_popup() throws InterruptedException {
        Thread.sleep(20000);
        logger.info("It should redirect to respective page\n");


        WebElement Search_icon= driver.findElement(By.xpath("(//a[@href='#'])[2]"));
        Search_icon.click();




    }

    public void Product_name() throws InterruptedException {
        //  Thread.sleep(4000);
        logger.info("\"It should redirect to respective page\n" +
                "\"");
        Thread.sleep(10000);

        WebElement Search_icon= driver.findElement(By.xpath("(//li[contains(@class,'item')])[1]"));
        System.out.println("Product Info : "+Search_icon.getText());

        Thread.sleep(10000);
        Actions ac= new Actions(driver);
        WebElement target= driver.findElement(By.xpath("(//a[contains(@class,'product-item-link')])[1]"));
        ac.moveToElement(target).click().build().perform();

        Thread.sleep(10000);
        driver.navigate().back();

    }

    public void Cross_button() throws InterruptedException {
        logger.info("\"1.On Upward arrow selection it will set products in Ascending Order\n" +
                "2.On Downward arrow selection it will set products in DescendingOrder\"");
        Thread.sleep(50000);

        String select = Keys.chord(Keys.CONTROL, "a");

        WebElement Search_icon= driver.findElement(By.xpath("//input[@placeholder='Search']"));
        Search_icon.sendKeys(select);
        Search_icon.sendKeys("label");
        Thread.sleep(5000);
        WebElement ele= driver.findElement(By.xpath("//a[@class='close']"));
        ele.click();


    }
    public void SortBydropdown_page() throws InterruptedException {

        Thread.sleep(10000);

        logger.info("\"1.By default Relevence should be selected\n" +
                "2.Dropdown option should be selectable \" ");
        WebElement ele3= driver.findElement(By.xpath("(//select[contains(@id,'sorter')])[2]"));
        Select sel=new Select(ele3);
        sel.selectByValue("name");
    }
    public void Assending_order() throws InterruptedException {
        logger.info("\"1.On Upward arrow selection it will set products in Ascending Order\n" +
                "2.On Downward arrow selection it will set products in DescendingOrder\"");
        Thread.sleep(50000);
        WebElement Assending= driver.findElement(By.xpath("//a[contains(.,'Set Ascending Direction')]"));
        if(Assending.isDisplayed()) {
            Actions ac = new Actions(driver);


            ac.moveToElement(Assending).click().build().perform();
            System.out.println("click on ascending order");

        }
        else {
            Actions ac = new Actions(driver);

            WebElement dessending = driver.findElement(By.xpath("//a[contains(.,'Set Descending Direction')]"));
            ac.click(dessending).click().build().perform();
            System.out.println("click on descending order");
        }


    }

    public void Clear_all_rearchresult_page() throws InterruptedException {
        logger.info("Filter option should be clear");
        Thread.sleep(50000);
        WebElement ele= driver.findElement(By.xpath("(//a[@class='eln-layer-clear-all clear'])[2]"));
        ele.click();

    }

    public void Product_name_searchresultpage() throws InterruptedException {
        logger.info("\"It should redirect to respective page\n" +
                "\"");
        Thread.sleep(50000);


        WebElement Search_icon= driver.findElement(By.xpath("(//div[@class='product-item-info'])[1]"));
        System.out.println("Product Info : "+Search_icon.getText());
        Thread.sleep(10000);
        WebElement ele3= driver.findElement(By.xpath("(//div[contains(@class,'product-item-info')])[1]"));
        ele3.click();


    }

    public void Product_nametest() throws InterruptedException {
        logger.info("It should redirect to PDP page\n");

        Thread.sleep(10000);

        WebElement ele= driver.findElement(By.xpath("//a[.='24-in Built-in Beverage Center with Split Convertible Shelves' and not(@title)]"));
        ele.click();

    }


    public void learn() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should get redirected to the category page and all respective products  should display on it");



        WebElement target= driver.findElement(By.xpath("//body/div[3]/main[1]/div[3]/div[1]/div[3]/span[1]/div[1]/ol[1]/li[1]/div[3]/div[1]/div[4]/div[1]/div[1]/a[1]"));
        WebElement ele3= driver.findElement(By.xpath("//body/div[3]/main[1]/div[3]/div[1]/div[3]/span[1]/div[1]/ol[1]/li[1]/div[3]/div[1]/div[4]/div[1]/div[2]/a[1]"));
        // Actions a = new Actions(driver);
        Actions action = new Actions(driver);
//moving to the main menu and then sub menu and clicking on it using object of the Actions class
        action.moveToElement(target).moveToElement(ele3).click();

    }



}