package com.U_line.page.actions.web.Retailer;

import com.U_line.page.actions.web.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Category_L1_Page {
    private static final Logger logger= LoggerFactory.getLogger(Category_L1_Page.class);

    private WebDriver driver;

    @FindBy(how = How.XPATH, using="//a[.='Products' and not(@title)]")
    @CacheLookup
    WebElement product;


    public Category_L1_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void product() throws InterruptedException {

        logger.info("\"It should get redirected to the respective page.\n" +
                "It should display the breadcrumb properly with Home > Products \n" +
                "\n" +
                "  \"");
        // TODO Auto-generated method stub
        product.click();
        Thread.sleep(5000);
        WebElement ele= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
        System.out.println(ele.getText());
    }

    public void product_category_image() {

        logger.info(" Category image, Category name should be clear and distinct");
 WebElement ele= driver.findElement(By.xpath("//body/div[1]/main[1]/div[2]/div[1]/div[1]/div[1]/a[2]/span[1]"));
   ;
    System.out.println(ele.getText());
    }
    public void product_category_image_redirect() throws InterruptedException {
Thread.sleep(9000);
        logger.info("It should get redirected to the category page and all respective products should display on it");
        // TODO Auto-generated method stub
        WebElement ele= driver.findElement(By.xpath("//body/div[1]/main[1]/div[2]/div[1]/div[1]/div[1]/a[2]/span[1]"));
   ele.click();
        WebElement ele2= driver.findElement(By.xpath("//div[@class='breadcrumbs']"));
        System.out.println(ele2.getText());
   Thread.sleep(8000);
   driver.navigate().back();
   Thread.sleep(9000);
    }

    public void Header_image() {

        logger.info("Header should properly dispalyed and bannner image should clear and distinct");
        // TODO Auto-generated method stub
       System.out.println("header image is display properly");
    }
}
