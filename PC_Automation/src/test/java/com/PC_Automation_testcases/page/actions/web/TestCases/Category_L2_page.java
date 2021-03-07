package com.PC_Automation_testcases.page.actions.web.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Category_L2_page {
    private static final Logger logger = LoggerFactory.getLogger(Category_L2_page.class);

    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'New Address')]")
    @CacheLookup
    WebElement Add_New_address;



    public Category_L2_page(WebDriver driver) {
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
    public void Printer() throws InterruptedException {
        logger.info("\"It should get redirected to the respective page.\n" +
                "It should display the breadcrumb properly with Home >Category Name\n" +
                "\n" +
                "  \"");
        Thread.sleep(50000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        WebElement category= driver.findElement(By.xpath("(//a[contains(.,'Printers & Accessories')])[2]"));

category.click();
   System.out.println(driver.getTitle());
        WebElement bread= driver.findElement(By.xpath("(//ul[contains(@class,'items')])[2]"));

        System.out.println(bread.getText());
    }
    public void Shop_now() throws InterruptedException {
        logger.info("It should display label as 'Shop Now' and 'Learn More'");
        Thread.sleep(50000);
        WebElement category= driver.findElement(By.xpath("(//a[contains(@class,'button btn no-backgroud')])[1]"));

       category.click();
        Thread.sleep(50000);
        driver.navigate().back();
        Thread.sleep(50000);
        WebElement category1= driver.findElement(By.xpath("(//a[@target='_blank'][contains(.,'Learn More')])[1]"));

        category1.click();

    }
    public void Ribbons_Shop_now() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(50000);
        WebElement category= driver.findElement(By.xpath("(//a[contains(@class,'button btn no-backgroud')])[3]"));

        category.click();
        System.out.println(driver.getTitle());
        Thread.sleep(50000);
        driver.navigate().back();


    }
    public void Thermal_Shop_now() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(50000);
        WebElement category= driver.findElement(By.xpath("(//a[contains(.,'Shop Now')])[3]"));
        category.click();
        System.out.println(driver.getTitle());
        Thread.sleep(50000);
        driver.navigate().back();


    }
    public void Need_help() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(50000);
        WebElement category= driver.findElement(By.xpath("//a[contains(.,'SEARCH FAQs')]"));

        category.click();
        System.out.println(driver.getTitle());
        Thread.sleep(50000);
        driver.navigate().back();


    }
    public void Learn_more() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(50000);
        WebElement category= driver.findElement(By.xpath("(//a[contains(@target,'_blank')])[4]"));

        category.click();
        System.out.println(driver.getTitle());
//        Thread.sleep(50000);
//        driver.navigate().back();


    }
    public void dot() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(50000);
        WebElement category= driver.findElement(By.xpath("(//button[contains(@role,'button')])[2]"));

        category.click();


    }

    public void Specimen_transport() throws InterruptedException {
        logger.info("\"It should get redirected to the respective page.\n" +
                "It should display the breadcrumb properly with Home >Category Name > Sub Category Name\n" +
                "\n" +
                "  \"");
        Thread.sleep(50000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
       WebElement category= driver.findElement(By.xpath("//a[@href='https://www.platinumcode.us/additional-products/specimen-transport-bags.html/']"));
         category.click();

        System.out.println(driver.getTitle());
        WebElement bread= driver.findElement(By.xpath("(//ul[contains(@class,'items')])[2]"));
        System.out.println(driver.getTitle());
        System.out.println(bread.getText());
    }
    public void Shop_now_1() throws InterruptedException {
        logger.info("It should display label as 'Shop Now' and 'Learn More'");
        Thread.sleep(50000);
        WebElement category= driver.findElement(By.xpath("(//a[contains(@class,'button btn no-backgroud')])[1]"));

        category.click();
        System.out.println(driver.getTitle());
        Thread.sleep(50000);
        driver.navigate().back();


    }
    public void Custom_specimen() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(50000);
        Actions ac= new Actions(driver);
        WebElement category= driver.findElement(By.xpath("(//a[contains(.,'Contact Us')])[2]"));
       ac.moveToElement(category).click().build().perform();
        System.out.println(driver.getTitle());
        Thread.sleep(50000);
        driver.navigate().back();


    }

    public void Need_help_1() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(50000);
        WebElement category= driver.findElement(By.xpath("//a[@class='btn button'][contains(.,'SEARCH FAQs')]"));

        category.click();
        System.out.println(driver.getTitle());
        Thread.sleep(10000);
        driver.navigate().back();


    }
    public void doteffect() throws InterruptedException {
        logger.info("It should change slide.");
        Thread.sleep(50000);
        Actions ac=new Actions(driver);
        WebElement category= driver.findElement(By.xpath("(//button[@role='button'])[2]"));
ac.moveToElement(category).click().build().perform();

    }
    public void RelatedSection() throws InterruptedException {
        logger.info("It should change slide.");
      //  Thread.sleep(50000);
        Actions ac=new Actions(driver);
        WebElement category= driver.findElement(By.xpath("(//a[contains(.,'Learn More')])[4]"));

      ac.moveToElement(category).click().build().perform();

    }

    public void disposable_lable_coat() throws InterruptedException {
        logger.info("\"It should get redirected to the respective page.\n" +
                "It should display the breadcrumb properly with Home >Category Name > Sub Category Name\n" +
                "\n" +
                "  \"");
        Thread.sleep(50000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
       WebElement category= driver.findElement(By.xpath("(//a[contains(.,'Lab Coats & Jackets')])[2]"));
category.click();
     //   driver.navigate().to("https://c882714cd9.nxcli.net/additional-products/lab-coats-jackets.html");
        System.out.println(driver.getTitle());
        WebElement bread= driver.findElement(By.xpath("//div[contains(@class,'breadcrumbs')]"));

        System.out.println(bread.getText());
    }
    public void Shop_now_2() throws InterruptedException {
        logger.info("It should display label as 'Shop Now' and 'Learn More'");
        Thread.sleep(50000);
        WebElement category= driver.findElement(By.xpath("(//a[contains(@class,'button btn no-backgroud')])[1]"));

        category.click();
        System.out.println(driver.getTitle());
        Thread.sleep(50000);
        driver.navigate().back();


    }
    public void Labjacket_shopNow() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(50000);
        WebElement category= driver.findElement(By.xpath("(//a[contains(@class,'button btn no-backgroud')])[2]"));

        category.click();
        System.out.println(driver.getTitle());
        Thread.sleep(50000);
        driver.navigate().back();


    }

    public void Need_help_3() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(50000);
        WebElement category= driver.findElement(By.xpath("//a[@class='btn button'][contains(.,'SEARCH FAQs')]"));

        category.click();
        System.out.println(driver.getTitle());
        Thread.sleep(50000);
        driver.navigate().back();


    }

    public void Learn_more_3() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(50000);
        WebElement category= driver.findElement(By.xpath("(//a[@class='btn action primary button'][contains(.,'Learn More')])[3]"));

        category.click();
        System.out.println(driver.getTitle());


    }

    public void dot_2() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(50000);
        WebElement category= driver.findElement(By.xpath("(//button[contains(@role,'button')])[2]"));

        category.click();
        Thread.sleep(50000);
        WebElement category1= driver.findElement(By.xpath("(//a[@class='btn action primary button'][contains(.,'Learn More')])[4]"));

        category1.click();

    }

    public void exam_glove() throws InterruptedException {
        logger.info("\"It should get redirected to the respective page.\n" +
                "It should display the breadcrumb properly with Home >Category Name > Sub Category Name\n" +
                "\n" +
                "  \"");
        Thread.sleep(50000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        WebElement category= driver.findElement(By.xpath("(//a[contains(.,'Exam Gloves')])[2]"));
category.click();
     //   driver.navigate().to("https://c882714cd9.nxcli.net/additional-products/exam-gloves.html");
        System.out.println(driver.getTitle());
        WebElement bread= driver.findElement(By.xpath("//div[contains(@class,'breadcrumbs')]"));

        System.out.println(bread.getText());
    }
    public void Shop_now_3() throws InterruptedException {
        logger.info("It should display label as 'Shop Now' and 'Learn More'");
        Thread.sleep(50000);
        WebElement category= driver.findElement(By.xpath("(//a[contains(@class,'button btn no-backgroud')])[1]"));

        category.click();
        System.out.println(driver.getTitle());
        Thread.sleep(50000);
        driver.navigate().back();


    }
    public void Letest_exam_glove_shopNow_1() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(50000);
        WebElement category= driver.findElement(By.xpath("(//a[contains(@class,'button btn no-backgroud')])[2]"));

        category.click();
        System.out.println(driver.getTitle());
        Thread.sleep(50000);
        driver.navigate().back();


    }


    public void Learn_more_4() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(50000);
        WebElement category= driver.findElement(By.xpath("(//a[@class='btn action primary button'][contains(.,'Learn More')])[3]"));

        category.click();


    }

    public void dot_3() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(50000);
        WebElement category= driver.findElement(By.xpath("(//button[contains(@role,'button')])[2]"));

        category.click();
        Thread.sleep(50000);
        WebElement category1= driver.findElement(By.xpath("(//a[@class='btn action primary button'][contains(.,'Learn More')])[4]"));

        category1.click();

    }

    public void karoise() throws InterruptedException {
        logger.info("\"1. It should get redirected to the respective page.\n" +
                "2. It should display the breadcrumb properly with Home >Category Name > Sub Category Name\n" +
                "3.For ipad breadcrumb should not displayed\n" +
                "  \"");
        Thread.sleep(50000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        WebElement category= driver.findElement(By.xpath("(//a[contains(.,'Labeling Automation')])[2]"));
        category.click();
        System.out.println(driver.getTitle());




    }
    public void learn_more_button() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(50000);

        WebElement category= driver.findElement(By.xpath("(//a[contains(.,'Learn More')])[1]"));
        category.click();
      //  System.out.println(driver.getTitle());




    }
    public void Kairos_Id_learn_more_button() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(50000);

        WebElement category= driver.findElement(By.xpath("(//a[contains(.,'Learn More')])[2]"));
        category.click();
      //  System.out.println(driver.getTitle());




    }
    public void Kairos_gnt9_learn_more_button() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(50000);

        WebElement category= driver.findElement(By.xpath("(//a[contains(.,'Learn More')])[3]"));
        category.click();
        //  System.out.println(driver.getTitle());




    }
    public void Kairos_contact_us_button() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(50000);

        WebElement category= driver.findElement(By.xpath("(//a[contains(.,'Contact Us')])[2]"));
        category.click();
        //  System.out.println(driver.getTitle());




    }
}
