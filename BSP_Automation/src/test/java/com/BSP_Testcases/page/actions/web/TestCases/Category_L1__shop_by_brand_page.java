package com.BSP_Testcases.page.actions.web.TestCases;

import com.BSP_Testcases.utils.common.Config;
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

import java.util.List;

public class Category_L1__shop_by_brand_page {
    private static final Logger logger = LoggerFactory.getLogger(Checkout_page.class);
    private static final String APPLICATION_URL = Config.getProperty("appURL");

    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'New Address')]")
    @CacheLookup
    WebElement Add_New_address;




    public Category_L1__shop_by_brand_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    public void Category_li_page_apparel() throws InterruptedException {
        logger.info("\"It should display 4 categories\n" +
                "1.HATS \n" +
                "2.POLO SHIRTS \n" +
                "3.SUNGLASSES \n" +
                "4.T-SHIRTS\"");
        Thread.sleep(30000);
        //driver.switchTo().alert().dismiss();

        Actions ac=new Actions(driver);
        WebElement	ele= driver.findElement(By.xpath("//span[contains(.,'Apparel')]"));

        ac.moveToElement(ele).click().build().perform();
        WebElement	ele1= driver.findElement(By.xpath("(//div[contains(@class,'cms-content')])[2]"));
    System.out.println(ele1.getText());


    }


    public void Top_categories_link() throws InterruptedException {
        logger.info("It should get redirect to respective page");
        Thread.sleep(30000);
        WebElement alllinks = driver.findElement(By.xpath("(//div[contains(@class,'cms-content')])[2]"));
        List<WebElement> Links = alllinks.findElements(By.tagName("a"));
        int Count     = Links.size();
        System.out.println("count of links should be 4:  " +Count);
        for(int i=0;i<Links.size();i++)
        {
            String Opentabs=Keys.chord(Keys.CONTROL,Keys.ENTER);

            Links.get(i).sendKeys(Opentabs);


        }

    }
    public void All_categories_apperal() throws InterruptedException {
        logger.info("\"It should display 16 categories \n" +
                "Aprons\n" +
                "Dress Shirts\n" +
                "Footwear\n" +
                "Hats\n" +
                "Jackets & Outerwear\n" +
                "Pants & Shorts\n" +
                "Purses & Wallets\n" +
                "Polo Shirts\n" +
                "Sweatpants\n" +
                "Sweatshirts & Hoodies\n" +
                "Sunglasses\n" +
                "T-Shirts\n" +
                "Visors\n" +
                "Watches\n" +
                "Winter Clothes\n" +
                "Youth & Baby\"");
        Thread.sleep(30000);
        //driver.switchTo().alert().dismiss();

        Actions ac=new Actions(driver);
        WebElement	ele= driver.findElement(By.xpath("//div[contains(@class,'white-bg-wrapper all-category')]"));

        System.out.println("Actual result" +ele.getText());
    }

    public void All_categories_link_apperal() throws InterruptedException {
        logger.info("It should get redirect to respective page");
        Thread.sleep(30000);
        WebElement alllinks = driver.findElement(By.xpath("//div[contains(@class,'white-bg-wrapper all-category')]"));


        List<WebElement> Links = alllinks.findElements(By.tagName("a"));
        int Count     = Links.size();
        System.out.println("count of links should be 32 :  " +Count);
        for(int i=0;i<Links.size();i++)
        {
            String Opentabs=Keys.chord(Keys.CONTROL,Keys.ENTER);

            Links.get(i).sendKeys(Opentabs);


        }

    }
    public void Category_li_page_Bags() throws InterruptedException {
        logger.info("\"It should display 4 categories\n" +
                "BACKPACKS \n" +
                "COOLERS & LUNCH BAGS \n" +
                "DRAWSTRING BAGS \n" +
                "TOTE BAGS\"");
        Thread.sleep(30000);


        Actions ac=new Actions(driver);
        WebElement	ele= driver.findElement(By.xpath("//span[contains(.,'Bags')]"));

        ac.moveToElement(ele).click().build().perform();
        WebElement	ele1= driver.findElement(By.xpath("(//div[contains(@class,'cms-content')])[2]"));
        System.out.println("Actual Top categories : "+ele1.getText());
    }
    public void Top_categories_link_bags() throws InterruptedException {
        logger.info("It should get redirect to respective page");
        Thread.sleep(30000);
        WebElement alllinks = driver.findElement(By.xpath("(//div[contains(@class,'cms-content')])[2]"));


        List<WebElement> Links = alllinks.findElements(By.tagName("a"));
        int Count     = Links.size();
        System.out.println("count of links should be 4:  " +Count);
        for(int i=0;i<Links.size();i++)
        {
            String Opentabs=Keys.chord(Keys.CONTROL,Keys.ENTER);

            Links.get(i).sendKeys(Opentabs);


        }

    }
    public void All_categories_bags() throws InterruptedException {
        logger.info("\"It should display 12 categories \n" +
                "Backpacks\n" +
                "Computer Bags\n" +
                "Coolers & Lunch Bags\n" +
                "Drawstring Bags\n" +
                "Duffel Bags\n" +
                "Laundry Bags\n" +
                "Messenger Bags\n" +
                "Paper Bags\n" +
                "Plastic Bags\n" +
                "Tote Bags\n" +
                "Travel Bags\n" +
                "Wine Bags\"");
        Thread.sleep(30000);
        //driver.switchTo().alert().dismiss();

        Actions ac=new Actions(driver);

        WebElement	ele= driver.findElement(By.xpath("//div[contains(@class,'white-bg-wrapper all-category')]"));


        System.out.println("Actual result" +ele.getText());
    }

    public void All_categories_link_bags() throws InterruptedException {
        logger.info("It should get redirect to respective page");
        Thread.sleep(30000);
        WebElement alllinks = driver.findElement(By.xpath("//div[@class='white-bg-wrapper all-category']"));


        List<WebElement> Links = alllinks.findElements(By.tagName("a"));
        int Count     = Links.size();
        System.out.println("count of links should be 32 :  " +Count);
        for(int i=0;i<Links.size();i++)
        {
            String Opentabs=Keys.chord(Keys.CONTROL,Keys.ENTER);

            Links.get(i).sendKeys(Opentabs);


        }

    }
    public void Category_li_page_drinkware() throws InterruptedException {
        logger.info("\"It should display 4 categories\n" +
                "ALUMINUM BOTTLES \n" +
                "KOOZIES \n" +
                "SPORT BOTTLES \n" +
                "TUMBLERS\"");
        Thread.sleep(30000);
        //driver.switchTo().alert().dismiss();

        Actions ac=new Actions(driver);
        WebElement	ele= driver.findElement(By.xpath("//span[contains(.,'Drinkware')]"));

        ac.moveToElement(ele).click().build().perform();
        WebElement	ele1= driver.findElement(By.xpath("(//div[contains(@class,'cms-content')])[2]"));
        System.out.println("Actual Top categories : "+ele1.getText());

    }
    public void Top_categories_link_drinkware() throws InterruptedException {
        logger.info("It should get redirect to respective page");
        Thread.sleep(30000);
        WebElement alllinks = driver.findElement(By.xpath("(//div[contains(@class,'cms-content')])[2]"));


        List<WebElement> Links = alllinks.findElements(By.tagName("a"));
        int Count     = Links.size();
        System.out.println("count of links should be 4:  " +Count);
        for(int i=0;i<Links.size();i++)
        {
            String Opentabs=Keys.chord(Keys.CONTROL,Keys.ENTER);

            Links.get(i).sendKeys(Opentabs);


        }

    }
    public void All_categories_drinkware() throws InterruptedException {
        logger.info("\"It should display 13 categories \n" +
                "Aluminum Bottles\n" +
                "Barware\n" +
                "Bottle Openers\n" +
                "Coasters\n" +
                "Coffee Mugs\n" +
                "Drinkware Sets\n" +
                "Koozies\n" +
                "Paper Cups\n" +
                "Stadium Cups\n" +
                "Sport Bottles\n" +
                "Tumblers\n" +
                "Travel Mugs\n" +
                "Water Bottles\n" +
                "\n" +
                "\"");
        Thread.sleep(30000);
        //driver.switchTo().alert().dismiss();

        Actions ac=new Actions(driver);
        WebElement	ele= driver.findElement(By.xpath("(//div[contains(@class,'white-bg-wrapper')])[2]"));

        System.out.println("Actual result" +ele.getText());
    }

    public void All_categories_link_drinkware() throws InterruptedException {
        logger.info("It should get redirect to respective page");
        Thread.sleep(30000);
        WebElement alllinks = driver.findElement(By.xpath("(//div[contains(@class,'white-bg-wrapper')])[2]"));


        List<WebElement> Links = alllinks.findElements(By.tagName("a"));
        int Count     = Links.size();
        System.out.println("count of links should be 32 :  " +Count);
        for(int i=0;i<Links.size();i++)
        {
            String Opentabs=Keys.chord(Keys.CONTROL,Keys.ENTER);

            Links.get(i).sendKeys(Opentabs);


        }

    }

    public void Category_li_page_home_auto() throws InterruptedException {
        logger.info("\"It should display 4 categories\n" +
                "CAR ACCESSORIES \n" +
                "KITCHENWARE \n" +
                "PERSONAL CARE \n" +
                "Tools\"");
        Thread.sleep(30000);
        //driver.switchTo().alert().dismiss();

        Actions ac=new Actions(driver);
        WebElement	ele= driver.findElement(By.xpath("//span[contains(.,'Home & Auto')]"));

        ac.moveToElement(ele).click().build().perform();
        WebElement	ele1= driver.findElement(By.xpath("(//div[contains(@class,'cms-content')])[2]"));
        System.out.println("Actual Top categories : "+ele1.getText());

    }
    public void Top_categories_link_home_auto() throws InterruptedException {
        logger.info("It should get redirect to respective page");
        Thread.sleep(30000);
        WebElement alllinks = driver.findElement(By.xpath("(//div[contains(@class,'cms-content')])[2]"));


        List<WebElement> Links = alllinks.findElements(By.tagName("a"));
        int Count     = Links.size();
        System.out.println("count of links should be 4:  " +Count);
        for(int i=0;i<Links.size();i++)
        {
            String Opentabs=Keys.chord(Keys.CONTROL,Keys.ENTER);

            Links.get(i).sendKeys(Opentabs);


        }

    }
    public void All_categories_home_auto() throws InterruptedException {
        logger.info("\"It should display 13 categories \n" +
                "Blankets\n" +
                "Book Lights\n" +
                "Car Accessories\n" +
                "Fly Swatters\n" +
                "Kitchenware\n" +
                "Personal Care\n" +
                "Pet Products\n" +
                "Piggy Banks\n" +
                "Tools\n" +
                "Towels\"");
        Thread.sleep(30000);
        //driver.switchTo().alert().dismiss();

        Actions ac=new Actions(driver);
        WebElement	ele= driver.findElement(By.xpath("//div[contains(@class,'white-bg-wrapper  all-category')]"));

        System.out.println("Actual result" +ele.getText());
    }

    public void All_categories_link_home_auto() throws InterruptedException {
        logger.info("It should get redirect to respective page");
        Thread.sleep(30000);
        WebElement alllinks = driver.findElement(By.xpath("//div[contains(@class,'white-bg-wrapper  all-category')]"));


        List<WebElement> Links = alllinks.findElements(By.tagName("a"));
        int Count     = Links.size();
        System.out.println("count of links should be 32 :  " +Count);
        for(int i=0;i<Links.size();i++)
        {
            String Opentabs=Keys.chord(Keys.CONTROL,Keys.ENTER);

            Links.get(i).sendKeys(Opentabs);


        }

    }

    public void Category_li_page_office() throws InterruptedException {
        logger.info("\"It should display 4 categories\n" +
                "CALENDARS \n" +
                "GIFTS \n" +
                "POST-IT NOTES \n" +
                "WRITING\"");
        Thread.sleep(30000);
        //driver.switchTo().alert().dismiss();

        Actions ac=new Actions(driver);
        WebElement	ele= driver.findElement(By.xpath("//span[contains(.,'Office')]"));

        ac.moveToElement(ele).click().build().perform();
        WebElement	ele1= driver.findElement(By.xpath("(//div[contains(@class,'cms-content')])[2]"));
        System.out.println("Actual Top categories : "+ele1.getText());

    }
    public void Top_categories_link_office() throws InterruptedException {
        logger.info("It should get redirect to respective page");
        Thread.sleep(30000);
        WebElement alllinks = driver.findElement(By.xpath("(//div[contains(@class,'cms-content')])[2]"));


        List<WebElement> Links = alllinks.findElements(By.tagName("a"));
        int Count     = Links.size();
        System.out.println("count of links should be 4:  " +Count);
        for(int i=0;i<Links.size();i++)
        {
            String Opentabs=Keys.chord(Keys.CONTROL,Keys.ENTER);

            Links.get(i).sendKeys(Opentabs);


        }

    }
    public void All_categories_office() throws InterruptedException {
        logger.info("\"It should display 13 categories \n" +
                "Blankets\n" +
                "Book Lights\n" +
                "Car Accessories\n" +
                "Fly Swatters\n" +
                "Kitchenware\n" +
                "Personal Care\n" +
                "Pet Products\n" +
                "Piggy Banks\n" +
                "Tools\n" +
                "Towels\"");
        Thread.sleep(30000);
        //driver.switchTo().alert().dismiss();

        Actions ac=new Actions(driver);
        WebElement	ele= driver.findElement(By.xpath("//div[contains(@class,'white-bg-wrapper all-category')]"));

        System.out.println("Actual result" +ele.getText());
    }

    public void All_categories_link_office() throws InterruptedException {
        logger.info("It should get redirect to respective page");
        Thread.sleep(30000);
        WebElement alllinks = driver.findElement(By.xpath("//div[contains(@class,'white-bg-wrapper all-category')]"));


        List<WebElement> Links = alllinks.findElements(By.tagName("a"));
        int Count     = Links.size();
        System.out.println("count of links should be 32 :  " +Count);
        for(int i=0;i<Links.size();i++)
        {
            String Opentabs=Keys.chord(Keys.CONTROL,Keys.ENTER);

            Links.get(i).sendKeys(Opentabs);


        }

    }
    public void Category_li_page_technology() throws InterruptedException {
        logger.info("\"It should display 4 categories\n" +
                "EARBUDS & HEADPHONES \n" +
                "PHONE STANDS \n" +
                "SPEAKERS \n" +
                "USB FLASH DRIVES\"");
        Thread.sleep(30000);
        //driver.switchTo().alert().dismiss();

        Actions ac=new Actions(driver);
        WebElement	ele= driver.findElement(By.xpath("//span[contains(.,'Technology')]"));

        ac.moveToElement(ele).click().build().perform();
        WebElement	ele1= driver.findElement(By.xpath("(//div[contains(@class,'cms-content')])[2]"));
        System.out.println("Actual Top categories : "+ele1.getText());

    }
    public void Top_categories_link_technology() throws InterruptedException {
        logger.info("It should get redirect to respective page");
        Thread.sleep(30000);
        WebElement alllinks = driver.findElement(By.xpath("(//div[contains(@class,'cms-content')])[2]"));


        List<WebElement> Links = alllinks.findElements(By.tagName("a"));
        int Count     = Links.size();
        System.out.println("count of links should be 4:  " +Count);
        for(int i=0;i<Links.size();i++)
        {
            String Opentabs=Keys.chord(Keys.CONTROL,Keys.ENTER);

            Links.get(i).sendKeys(Opentabs);


        }

    }
    public void All_categories_technology() throws InterruptedException {
        logger.info("\"It should display 13 categories \n" +
                "Cell Phone Cases\n" +
                "Chargers & Adapters\n" +
                "Computer Accessories\n" +
                "Earbuds & Headphones\n" +
                "Phone Wallets\n" +
                "Phone Stands\n" +
                "Screen Cleaners\n" +
                "Speakers\n" +
                "Selfie Sticks\n" +
                "Styluses\n" +
                "Tablet & Ipad Accessories\n" +
                "Usb Flash Drives\n" +
                "VR Viewers\n" +
                "\"");
        Thread.sleep(30000);
        //driver.switchTo().alert().dismiss();

        Actions ac=new Actions(driver);
        WebElement	ele= driver.findElement(By.xpath("//div[@class='white-bg-wrapper all-category']"));

        System.out.println("Actual result" +ele.getText());
    }

    public void All_categories_link_technology() throws InterruptedException {
        logger.info("It should get redirect to respective page");
        Thread.sleep(30000);
        WebElement alllinks = driver.findElement(By.xpath("//div[@class='white-bg-wrapper all-category']"));


        List<WebElement> Links = alllinks.findElements(By.tagName("a"));
        int Count     = Links.size();
        System.out.println("count of links should be 32 :  " +Count);
        for(int i=0;i<Links.size();i++)
        {
            String Opentabs=Keys.chord(Keys.CONTROL,Keys.ENTER);

            Links.get(i).sendKeys(Opentabs);


        }

    }
    public void Category_li_page_shop_by_brand() throws InterruptedException {
        logger.info("\"It should display 4 categories\n" +
                "EARBUDS & HEADPHONES \n" +
                "PHONE STANDS \n" +
                "SPEAKERS \n" +
                "USB FLASH DRIVES\"");
        Thread.sleep(30000);
        //driver.switchTo().alert().dismiss();

        Actions ac=new Actions(driver);
        WebElement	ele= driver.findElement(By.xpath("//span[contains(.,'Shop by Brand')]"));

        ac.moveToElement(ele).click().build().perform();
        WebElement	ele1= driver.findElement(By.xpath("(//div[@class='shop-by-brand cms-content'])[1]"));
        System.out.println("Actual Top categories : "+ele1.getText());

    }
    public void Top_categories_link_shop_by_brand() throws InterruptedException {
        logger.info("It should get redirect to respective page");
        Thread.sleep(30000);
        WebElement alllinks = driver.findElement(By.xpath("(//div[@class='shop-by-brand cms-content'])[1]"));


        List<WebElement> Links = alllinks.findElements(By.tagName("a"));
        int Count     = Links.size();
        System.out.println("count of links should be 4:  " +Count);
        for(int i=0;i<Links.size();i++)
        {
            String Opentabs=Keys.chord(Keys.CONTROL,Keys.ENTER);

            Links.get(i).sendKeys(Opentabs);


        }

    }
    public void All_categories_shop_by_brand() throws InterruptedException {
        logger.info("\"It should display 13 categories \n" +
                "Cell Phone Cases\n" +
                "Chargers & Adapters\n" +
                "Computer Accessories\n" +
                "Earbuds & Headphones\n" +
                "Phone Wallets\n" +
                "Phone Stands\n" +
                "Screen Cleaners\n" +
                "Speakers\n" +
                "Selfie Sticks\n" +
                "Styluses\n" +
                "Tablet & Ipad Accessories\n" +
                "Usb Flash Drives\n" +
                "VR Viewers\n" +
                "\"");

        Thread.sleep(30000);


        Actions ac=new Actions(driver);
        WebElement	ele= driver.findElement(By.xpath("//div[contains(@class,'white-bg-wrapper  all-category')]"));

        System.out.println("Actual result" +ele.getText());
    }

    public void All_categories_link_shop_by_brand() throws InterruptedException {
        logger.info("It should get redirect to respective page");
        Thread.sleep(30000);
        WebElement alllinks = driver.findElement(By.xpath("//div[contains(@class,'white-bg-wrapper  all-category')]"));


        List<WebElement> Links = alllinks.findElements(By.tagName("a"));
        int Count     = Links.size();
        System.out.println("count of links should be 32 :  " +Count);
        for(int i=0;i<Links.size();i++)
        {
            String Opentabs=Keys.chord(Keys.CONTROL,Keys.ENTER);

            Links.get(i).sendKeys(Opentabs);


        }

    }
}



