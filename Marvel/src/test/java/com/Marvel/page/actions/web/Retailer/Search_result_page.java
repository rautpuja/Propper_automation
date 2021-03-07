package com.Marvel.page.actions.web.Retailer;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Search_result_page {

    private static final Logger logger = LoggerFactory.getLogger(Search_result_page.class);

    private WebDriver driver;


    public Search_result_page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }




    public void Dropdown() throws InterruptedException {
        Thread.sleep(9000);
        logger.info("\"By default, Relevance is select.\n" +
                "there are 3 options in dropdown (top right side)\n" +
                "-Relevance\n" +
                "-Price\n" +
                "-Collection\"\n ");
        WebElement Search_icon= driver.findElement(By.xpath("//input[@class='input-text loaded']"));
         Search_icon.sendKeys("wine");
         Thread.sleep(9000);
         WebElement ele=driver.findElement(By.xpath("//select[contains(@class,'sorter-options')]"));
         Select sel=new Select(ele);
         sel.selectByValue("price");

    }

    public void Resource_link() throws InterruptedException {
      //  Thread.sleep(4000);
        logger.info("Resources link should be related to search keyword and link should be clickable ");
        Thread.sleep(30000);
        WebElement alllinks = driver.findElement(By.xpath("//div[contains(@class,'ea-cms-grid wyomind-bg-secondary ')]"));


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



public void Go_button() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("\"When hovering over the 'Go' button, icons should appear on the side\n" +
                "Left side icon: Request a quote\n" +
                "Right side icon: Add to compare\"\n");
    Thread.sleep(5000);
    String select = Keys.chord(Keys.CONTROL, "a");

    WebElement Search_icon= driver.findElement(By.xpath("//input[@class='input-text loaded']"));
    Search_icon.sendKeys(select);
    Search_icon.sendKeys("wine");
    Thread.sleep(9000);
    WebElement ele3= driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[3]/div[5]/ul[1]/li[1]/div[2]/div[2]/div[3]/div[1]/div[1]/a[2]"));

    WebElement ele2= driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[3]/div[5]/ul[1]/li[1]/div[2]/div[2]/div[3]/div[1]/div[1]/a[1]"));

   // Actions a = new Actions(driver);
    Actions action = new Actions(driver);
//moving to the main menu and then sub menu and clicking on it using object of the Actions class
    action.moveToElement(ele3).moveToElement(ele2).click();

    Thread.sleep(5000);



}
    public void Add_to_compare() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should redirect to respective page\n");
        Thread.sleep(5000);
        String select = Keys.chord(Keys.CONTROL, "a");

        WebElement Search_icon= driver.findElement(By.xpath("//input[@class='input-text loaded']"));
        Search_icon.sendKeys(select);
        Search_icon.sendKeys("wine");
        Thread.sleep(9000);
        WebElement ele3= driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[3]/div[5]/ul[1]/li[1]/div[2]/div[2]/div[3]/div[1]/div[1]/a[2]"));

        WebElement ele2= driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[3]/div[5]/ul[1]/li[1]/div[2]/div[2]/div[3]/div[1]/div[1]/a[3]"));

        // Actions a = new Actions(driver);
        Actions action = new Actions(driver);
//moving to the main menu and then sub menu and clicking on it using object of the Actions class
        action.moveToElement(ele3).moveToElement(ele2).click();

        Thread.sleep(5000);



    }
    public void Click_go() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should redirect to respective page\n");
        Thread.sleep(5000);
        String select = Keys.chord(Keys.CONTROL, "a");

        WebElement Search_icon= driver.findElement(By.xpath("//input[@class='input-text loaded']"));
        Search_icon.sendKeys(select);
        Search_icon.sendKeys("wine");
        Thread.sleep(9000);
        WebElement ele3= driver.findElement(By.xpath("(//a[@title='Go'])[1]"));
ele3.click();






    }

public void Product_name() throws InterruptedException {
      //  Thread.sleep(4000);
        logger.info("Product image, product name should be clear and distinct ");
    Thread.sleep(10000);


    WebElement ele3= driver.findElement(By.xpath("(//div[@class='info product-item-details'])[1]"));
       System.out.println(ele3.getText());

        Thread.sleep(10000);




    }

    public void Assending_order_search() throws InterruptedException {
        logger.info("\"1.On Upward arrow selection it will set products in Ascending Order\n" +
                "2.On Downward arrow selection it will set products in DescendingOrder\"");
        Thread.sleep(50000);

        String select = Keys.chord(Keys.CONTROL, "a");

        WebElement Search_icon= driver.findElement(By.xpath("//input[@class='input-text loaded']"));
        Search_icon.sendKeys(select);
        Search_icon.sendKeys("wine");
        Thread.sleep(10000);
        Thread.sleep(50000);

        WebElement Assending= driver.findElement(By.xpath("//a[contains(@title,'Set Ascending Direction')]"));

        if(Assending.isDisplayed()) {
            Actions ac = new Actions(driver);


            ac.moveToElement(Assending).click().build().perform();

            System.out.println("click on assending order");
        }
        else {
            Actions ac = new Actions(driver);

            WebElement dessending = driver.findElement(By.xpath("//a[contains(@class,'action sorter-action sort-desc  active')]"));
            ac.click(dessending).click().build().perform();
            System.out.println("click on descending order");
        }


    }

    public void Cross_button() throws InterruptedException {
        logger.info("\"1.On Upward arrow selection it will set products in Ascending Order\n" +
                "2.On Downward arrow selection it will set products in DescendingOrder\"");
        Thread.sleep(50000);

        String select = Keys.chord(Keys.CONTROL, "a");

        WebElement Search_icon= driver.findElement(By.xpath("//input[@class='input-text loaded']"));
        Search_icon.sendKeys(select);
        Search_icon.sendKeys("wine");
        Thread.sleep(5000);
        WebElement ele= driver.findElement(By.xpath("//a[@id='ma-close']"));
        ele.click();


    }
    public void Search_PLP_page() throws InterruptedException {

        Thread.sleep(12000);

        logger.info("\"It should get redirect to category (L1) page\n" +
                "\" ");

        String select = Keys.chord(Keys.CONTROL, "a");

        WebElement Search_icon= driver.findElement(By.xpath("(//input[contains(@type,'text')])[1]"));
        Search_icon.sendKeys(select);
        Search_icon.sendKeys("wine");
        Thread.sleep(5000);
        Search_icon.sendKeys(Keys.ENTER);
    }
    public void Assending_order() throws InterruptedException {
        logger.info("\"1.On Upward arrow selection it will set products in Ascending Order\n" +
                "2.On Downward arrow selection it will set products in DescendingOrder\"");
       Thread.sleep(30000);

      WebElement Assending= driver.findElement(By.xpath("//a[@title='Set Ascending Direction'][contains(.,'Set Ascending Direction')]"));

        if(Assending.isDisplayed()) {
            Actions ac = new Actions(driver);


            ac.moveToElement(Assending).click().build().perform();

            System.out.println("click on assending order");
        }
        else {
            Actions ac = new Actions(driver);

            WebElement dessending = driver.findElement(By.xpath("//a[contains(@class,'action sorter-action sort-desc  active')]"));
            ac.click(dessending).click().build().perform();
            System.out.println("click on descending order");
        }


    }

    public void Filter() throws InterruptedException {
        logger.info("By deafult 30 should be selected and results should be according to the slection. It should sort the results as per 30,45,60,90 items selected");
        Thread.sleep(10000);
        WebElement ele3= driver.findElement(By.xpath("//span[contains(text(),'162')]"));
           ele3.click();
        WebElement ele4= driver.findElement(By.xpath("//span[contains(text(),'Soft Close Integrated')]"));
        ele4.click();

    }

    public void Product_nametest() throws InterruptedException {
        logger.info("It should redirect to PDP page\n");

        Thread.sleep(10000);

       WebElement ele= driver.findElement(By.xpath("//a[.='24-in Built-in Beverage Center with Split Convertible Shelves' and not(@title)]"));
       ele.click();

    }

    public void Product_clearall() throws InterruptedException {
        logger.info("It should get redirected to the category page and all respective products  should display on it");

        Thread.sleep(10000);
        Actions ac=new Actions(driver);
       WebElement ele= driver.findElement(By.xpath("(//a[@class='eln-layer-clear-all clear'][contains(.,'Clear all')])[3]"));
     ac.moveToElement(ele).click().build().perform();

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

    public void Learn_more() throws InterruptedException {
        logger.info("It should redirect to PDP page\n");
        Thread.sleep(10000);
        WebElement target= driver.findElement(By.xpath("(//a[contains(@class,'action more btn button')])[1]"));
        target.click();



    }

    public void Learn_more_hover() throws InterruptedException {
        logger.info("When hovering over the 'Learn More' button two icons should appear on the side and product image should have to change\n");
        Thread.sleep(10000);

        WebElement target= driver.findElement(By.xpath("(//a[contains(@class,'action more btn button')])[1]"));
        WebElement ele3= driver.findElement(By.xpath("(//a[@title='Request a Quote'][contains(.,'Request a Quote')])[1]"));

        Actions action = new Actions(driver);

        action.moveToElement(target).build().perform();



    }
    public void RAQ_form() throws InterruptedException {
        logger.info("Request a quote form should get open\n");
        Thread.sleep(10000);

        WebElement target= driver.findElement(By.xpath("(//a[contains(@class,'action more btn button')])[1]"));
        WebElement ele3= driver.findElement(By.xpath("(//a[@title='Request a Quote'][contains(.,'Request a Quote')])[1]"));

        Actions action = new Actions(driver);

        action.moveToElement(target).moveToElement(ele3).click().build().perform();



    }
    public void RAQ_form_Auto() throws InterruptedException {
        logger.info("Request a quote form should get open\n");
        Thread.sleep(10000);

        WebElement target= driver.findElement(By.xpath("(//a[contains(@title,'Go')])[1]"));
        WebElement ele3= driver.findElement(By.xpath("(//a[@title='Request a Quote'][contains(.,'Request a Quote')])[1]"));

        Actions action = new Actions(driver);

        action.moveToElement(target).moveToElement(ele3).click().build().perform();



    }
    public void RAQ_blank() throws InterruptedException {
        logger.info("Error message should get displayed\n");
        Thread.sleep(10000);


        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);

        WebElement target2= driver.findElement(By.xpath("//button[@type='button'][contains(.,'Submit')]"));

        target2.click();

    }
    public void RAQ_invalid() throws InterruptedException {
        logger.info("Error message should get displayed\n");

        Thread.sleep(10000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        WebElement Name= driver.findElement(By.xpath("//input[@name='first_name']"));
        Name.sendKeys("67787");

        WebElement Last_Name= driver.findElement(By.xpath("//input[@name='last_name']"));
        Last_Name.sendKeys("67787");
        WebElement PhoneName= driver.findElement(By.xpath("//input[@name='home_phone']"));
        PhoneName.sendKeys("67787");
        WebElement Email= driver.findElement(By.xpath("//input[@id='customer_email']"));
        Email.sendKeys("67787");
        WebElement Interested= driver.findElement(By.xpath("//textarea[contains(@name,'products_interested')]"));
        Interested.sendKeys("67787");
        WebElement postal_code= driver.findElement(By.xpath("//input[@name='postal_code']"));
        postal_code.sendKeys("63011");


        WebElement target= driver.findElement(By.xpath("//button[@type='button'][contains(.,'Submit')]"));

        target.click();



    }
    public void RAQ_valid() throws InterruptedException {
        logger.info("Successfully submitted the form message should get displayed\n");
        Thread.sleep(10000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(2000);
        String select = Keys.chord(Keys.CONTROL, "a");

        WebElement Name= driver.findElement(By.xpath("//input[@name='first_name']"));
        Name.sendKeys(select);
        Name.sendKeys("67787");

        WebElement Last_Name= driver.findElement(By.xpath("//input[@name='last_name']"));
        Last_Name.sendKeys(select);
        Last_Name.sendKeys("67787");
        WebElement PhoneName= driver.findElement(By.xpath("//input[@name='home_phone']"));
        PhoneName.sendKeys(select);
        PhoneName.sendKeys("67787");
        WebElement Email= driver.findElement(By.xpath("//input[@id='customer_email']"));
        Email.sendKeys(select);
        Email.sendKeys("67787");
        WebElement Interested= driver.findElement(By.xpath("//textarea[contains(@name,'products_interested')]"));
        Interested.sendKeys("Testing request from upbott team");
        WebElement postal_code= driver.findElement(By.xpath("//input[@name='postal_code']"));
        postal_code.sendKeys(select);
        postal_code.sendKeys("63011");


        WebElement target= driver.findElement(By.xpath("//button[@type='button'][contains(.,'Submit')]"));

        target.click();
        Thread.sleep(5000);

        WebElement target2= driver.findElement(By.xpath("(//button[@class='action-close'][contains(.,'Close')])[1]"));

        target2.click();


    }

    public void Show() throws InterruptedException {
        logger.info("\"by default collection is select .\n" +
                "it should display 2 options in dropdown 1.collection 2.price\n" +
                "It should display the results accordingly\"\n");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement Show= driver.findElement(By.xpath("(//select[contains(@id,'sorter')])[2]"));
        ac.moveToElement(Show).click().build().perform();
        Select sele=new Select(Show);
        sele.selectByValue("price");


    }
    public void Add_to_compare1() throws InterruptedException {
        logger.info("Success message should get displayed\n");

        Thread.sleep(10000);

        WebElement target= driver.findElement(By.xpath("(//a[contains(@class,'action more btn button')])[1]"));
        WebElement ele3= driver.findElement(By.xpath("(//a[@title='Add to Compare'])[1]"));
        // Actions a = new Actions(driver);
        Actions action = new Actions(driver);
//moving to the main menu and then sub menu and clicking on it using object of the Actions class
        action.moveToElement(target).moveToElement(ele3).click();

    }




}