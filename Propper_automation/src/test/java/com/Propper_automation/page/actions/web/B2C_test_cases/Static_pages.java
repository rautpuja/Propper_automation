package com.Propper_automation.page.actions.web.B2C_test_cases;

import com.Propper_automation.page.actions.web.HomePage;
import com.Propper_automation.utils.selenium.WebUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class Static_pages {

        private static final Logger logger= LoggerFactory.getLogger(HomePage.class);

        private WebDriver driver;




        public Static_pages(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
        public void PDP_page() throws InterruptedException {
                logger.info("Application should display product detail page with product name/image & it should be clear & distinct.");
                Thread.sleep(20000);

                Actions ac = new Actions(driver);
                WebElement ele = driver.findElement(By.xpath("//span[contains(.,'Bags')]"));
                ac.moveToElement(ele).build().perform();
                Thread.sleep(10000);
                WebElement ele2 = driver.findElement(By.xpath("//a[@title='Computer Bags'][contains(.,'Computer Bags')]"));
                ele2.click();
                Thread.sleep(10000);
                WebElement ele3 = driver.findElement(By.xpath("//a[contains(.,'Kenneth Cole SnakeTrimmed 16\" Computer Tote')]"));
                ele3.click();


        }
        public void QTY_box() throws InterruptedException {
                logger.info("\"It should be editable\n" +
                        "It should change in product price.\n" +
                        "It should display by default quantity.\n" +
                        "If change(decrease) the by deafult quantity it should display 'You can not order less that minimum quantity '\"");
                Thread.sleep(10000);
                String select = Keys.chord(Keys.CONTROL, "a");
                WebElement slide = driver.findElement(By.xpath("//input[@name='qty']"));
                slide.sendKeys(select);
                slide.sendKeys("10");
                Thread.sleep(5000);
                WebElement ele = driver.findElement(By.xpath("//div[contains(@class,'add-top-custom-inner-total')]"));
                System.out.println(ele.getText());


        }
        public void order_now_virtual_preview_button() throws InterruptedException {
                logger.info("\"It should display a popup with sku , product image/name\n" +
                        "It should display First Name,Last Name,Email,Phone,Company,Upload Artwork with submit button\"");
                Thread.sleep(10000);
                Actions ac=new Actions(driver);
                WebElement slide = driver.findElement(By.xpath("(//span[contains(.,'Create virtual preview')])[2]"));
                WebUtils.scrollingToElementofAPage(slide);
                ac.moveToElement(slide).click();

        }
        public void virtual_preview_valid() throws InterruptedException {
                logger.info("Form should get submitted");
                Thread.sleep(10000);
                String select = Keys.chord(Keys.CONTROL, "a");
                ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
                driver.switchTo().window(tabs2.get(0));
                Thread.sleep(5000);
                WebElement first_name = driver.findElement(By.xpath("//input[contains(@class,'input-text required-entry maximum-length-32 ')]"));
                first_name.sendKeys(select);
                first_name.sendKeys("puja");
                WebElement last_name = driver.findElement(By.xpath("//input[contains(@id,'virtua-lastname')]"));
                last_name.sendKeys(select);
                last_name.sendKeys("Domke");
                WebElement upload = driver.findElement(By.xpath("//button[contains(@class,'art-buttons button blue-btn validation-passed')]"));
                upload.sendKeys("C:\\Users\\lenovo\\Downloads\\UHXX524-SG01A_3D.DWG");
                WebElement email_name = driver.findElement(By.xpath("//input[contains(@id,'virtua-email')]"));
                email_name.sendKeys(select);
                email_name.sendKeys("puja@upbott.com");
                WebElement p_name = driver.findElement(By.xpath("//input[contains(@id,'virtua-phone')]"));
                p_name.sendKeys(select);
                p_name.sendKeys("9878765676");
                WebElement Company = driver.findElement(By.xpath("//input[contains(@id,'virtua-company')]"));
                Company.sendKeys(select);
                Company.sendKeys("Upbott");
                WebElement Quality_needed = driver.findElement(By.xpath("//input[contains(@id,'Field17')]"));
                Quality_needed.sendKeys(select);
                Quality_needed.sendKeys("43");
        }
        public void virtual_preview_Invalid() throws InterruptedException {
                logger.info("It should display error");
                Thread.sleep(10000);
                String select = Keys.chord(Keys.CONTROL, "a");
                ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
                driver.switchTo().window(tabs2.get(0));
                Thread.sleep(5000);
                WebElement first_name = driver.findElement(By.xpath("//input[contains(@class,'input-text required-entry maximum-length-32 ')]"));
                first_name.sendKeys(select);
                first_name.sendKeys("ggh%677676");
                WebElement last_name = driver.findElement(By.xpath("//input[contains(@id,'virtua-lastname')]"));
                last_name.sendKeys(select);
                last_name.sendKeys("hghjjh%^^&&");
                WebElement upload = driver.findElement(By.xpath("//button[contains(@class,'art-buttons button blue-btn validation-passed')]"));
                upload.sendKeys("C:\\Users\\lenovo\\Downloads\\UHXX524-SG01A_3D.DWG");
                WebElement email_name = driver.findElement(By.xpath("//input[contains(@id,'virtua-email')]"));
                email_name.sendKeys(select);
                email_name.sendKeys("puja2upbott.com");
                WebElement p_name = driver.findElement(By.xpath("//input[contains(@id,'virtua-phone')]"));
                p_name.sendKeys(select);
                p_name.sendKeys("5676");
                WebElement Company = driver.findElement(By.xpath("//input[contains(@id,'virtua-company')]"));
                Company.sendKeys(select);
                Company.sendKeys("Upbott");
                WebElement Quality_needed = driver.findElement(By.xpath("//input[contains(@id,'Field17')]"));
                Quality_needed.sendKeys(select);
                Quality_needed.sendKeys("43");
        }
        public void Checkbox() throws InterruptedException {
                logger.info("\"It should be check and uncheck.\n" +
                        "bu default it should be uncheck\"");
                Thread.sleep(10000);
                String select = Keys.chord(Keys.CONTROL, "a");
                ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
                driver.switchTo().window(tabs2.get(0));
                WebElement ele = driver.findElement(By.xpath("(//input[contains(@type,'checkbox')])[1]"));
               ele.click();
                Thread.sleep(5000);

                WebElement ele2 = driver.findElement(By.xpath("//button[@class='btn button green-btn submit virtuallead'][contains(.,'submit')]"));
                ele2.click();


        }
        public void close() throws InterruptedException {
                logger.info("close pop up");
                Thread.sleep(10000);
                JavascriptExecutor js1 = (JavascriptExecutor) driver;

                js1.executeScript("window.scrollBy(0,-10000)");
                String select = Keys.chord(Keys.CONTROL, "a");
                ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
                driver.switchTo().window(tabs2.get(0));
                WebElement ele = driver.findElement(By.xpath("(//button[@class='action-close'][contains(.,'Close')])[1]"));
                ele.click();



        }
        public void close_2() throws InterruptedException {
                logger.info("close pop up");
                Thread.sleep(10000);
                String select = Keys.chord(Keys.CONTROL, "a");
                JavascriptExecutor js1 = (JavascriptExecutor) driver;

                js1.executeScript("window.scrollBy(0,-10000)");
                ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
                driver.switchTo().window(tabs2.get(0));
                WebElement ele = driver.findElement(By.xpath("(//button[@class='action-close'][contains(.,'Close')])[4]"));
                ele.click();



        }
        public void order_product_sample_button() throws InterruptedException {
                logger.info("\"It should display a popup with sku , product image/name\n" +
                        "It should display First Name,Last Name,Email,Phone,Company,Street Address,Zip Code,City,State,Country\n" +
                        "Quantity needed for event? with submit button\"");
                Thread.sleep(10000);
                Actions ac=new Actions(driver);
                WebElement slide = driver.findElement(By.xpath("(//span[contains(.,'Order Product Sample')])[2]"));

                 WebUtils.sleep(5);
                ac.moveToElement(slide).click().build().perform();



        }
        public void order_product_sample_Invalid() throws InterruptedException {
                logger.info("Error message should get displayed");
                Thread.sleep(10000);
                String select = Keys.chord(Keys.CONTROL, "a");
                ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
                driver.switchTo().window(tabs2.get(0));
                Thread.sleep(5000);
                WebElement first_name = driver.findElement(By.xpath("//input[contains(@id,'sample-firstname')]"));
                first_name.sendKeys(select);
                first_name.sendKeys("ggh%677676");
                WebElement last_name = driver.findElement(By.xpath("//input[contains(@id,'sample-lastname')]"));
                last_name.sendKeys(select);
                last_name.sendKeys("hghjjh%^^&&");

                WebElement email_name = driver.findElement(By.xpath("//input[contains(@id,'sample-email')]"));
                email_name.sendKeys(select);
                email_name.sendKeys("puja2upbott.com");
                WebElement p_name = driver.findElement(By.xpath("//input[contains(@id,'sample-phone')]"));
                p_name.sendKeys(select);
                p_name.sendKeys("5676");
                WebElement Company = driver.findElement(By.xpath("//input[contains(@id,'sample-company')]"));
                Company.sendKeys(select);
                Company.sendKeys("Upbott");
                WebElement street_address = driver.findElement(By.xpath("//input[contains(@id,'sample-street')]"));
               street_address.sendKeys(select);
               street_address.sendKeys("test");
                WebElement zip = driver.findElement(By.xpath("//input[contains(@class,'sample_zipcode_lookup input-text required-entry')]"));
               zip.sendKeys(select);
                zip.sendKeys("5445");
//                WebElement city = driver.findElement(By.xpath("//select[contains(@id,'sample-city')]"));
//               city.sendKeys(select);
//                Select sel=new Select(city);
//                sel.selectByValue("ELLISVILLE");
                WebElement Quality_needed = driver.findElement(By.xpath("//input[@id='Field18']"));
                Quality_needed.sendKeys(select);
                Quality_needed.sendKeys("45");
                WebElement submit = driver.findElement(By.xpath("//button[@class='btn button green-btn submit samplelead'][contains(.,'submit')]"));
                submit.click();
        }
        public void order_product_sample_valid() throws InterruptedException {
                logger.info("Error message should get displayed");
                Thread.sleep(10000);
                String select = Keys.chord(Keys.CONTROL, "a");
                ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
                driver.switchTo().window(tabs2.get(0));
                Thread.sleep(5000);
                WebElement first_name = driver.findElement(By.xpath("//input[contains(@id,'sample-firstname')]"));
                first_name.sendKeys(select);
                first_name.sendKeys("puja");
                WebElement last_name = driver.findElement(By.xpath("//input[contains(@id,'sample-lastname')]"));
                last_name.sendKeys(select);
                last_name.sendKeys("raut");

                WebElement email_name = driver.findElement(By.xpath("//input[contains(@id,'sample-email')]"));
                email_name.sendKeys(select);
                email_name.sendKeys("puja@upbott.com");
                WebElement p_name = driver.findElement(By.xpath("//input[contains(@id,'sample-phone')]"));
                p_name.sendKeys(select);
                p_name.sendKeys("8789876567");
                WebElement Company = driver.findElement(By.xpath("//input[contains(@id,'sample-company')]"));
                Company.sendKeys(select);
                Company.sendKeys("Upbott");
                WebElement street_address = driver.findElement(By.xpath("//input[contains(@id,'sample-street')]"));
                street_address.sendKeys(select);
                street_address.sendKeys("test 123");
                WebElement zip = driver.findElement(By.xpath("//input[contains(@class,'sample_zipcode_lookup input-text required-entry')]"));
                zip.sendKeys(select);
               zip.sendKeys("63011");
                WebElement city = driver.findElement(By.xpath("//select[contains(@id,'sample-city')]"));
                city.sendKeys(select);
                Select sel=new Select(city);
                sel.selectByValue("ELLISVILLE");
                WebElement Quality_needed = driver.findElement(By.xpath("//input[@id='Field18']"));
                Quality_needed.sendKeys(select);
                Quality_needed.sendKeys("45");

        }
        public void Checkbox_2() throws InterruptedException {
                logger.info("\"It should be check and uncheck.\n" +
                        "bu default it should be uncheck\"");
                Thread.sleep(10000);
                String select = Keys.chord(Keys.CONTROL, "a");
                ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
                driver.switchTo().window(tabs2.get(0));
                WebElement ele = driver.findElement(By.xpath("(//input[contains(@type,'checkbox')])[5]"));
                ele.click();
                Thread.sleep(5000);

                WebElement submit = driver.findElement(By.xpath("//button[@class='btn button green-btn submit samplelead'][contains(.,'submit')]"));
                submit.click();


        }
        public void About_us() throws InterruptedException {
                logger.info("\"It should get redirected to respective page.\n" +
                        "It should display 4 links \n" +
                        "1.About Us (by default selected)\n" +
                        "2.Meet the Team\n" +
                        "3.Services\n" +
                        "4.Careers\"");
                Thread.sleep(10000);
                JavascriptExecutor js1 = (JavascriptExecutor) driver;

                js1.executeScript("window.scrollBy(0,1000)");

                WebElement ele = driver.findElement(By.xpath("//a[@title='About Us'][contains(.,'About Us')]"));
                ele.click();
                System.out.println("Title  is : "+driver.getTitle());
                WebElement text = driver.findElement(By.xpath("//div[contains(@class,'page-title-wrapper')]"));
              System.out.println("Text is : "+text.getText());

        }
        public void About_us_Meet_link() throws InterruptedException {
                logger.info("It should get redirected to respective page.");
                Thread.sleep(10000);
                WebElement alllinks = driver.findElement(By.xpath("//a[contains(@title,'Meet the Team')]"));

                alllinks.click();
                Thread.sleep(10000);
                System.out.println("Title  is : "+driver.getTitle());
                driver.navigate().back();

        }
        public void About_us_services_link() throws InterruptedException {
                logger.info("It should get redirected to respective page.");
                Thread.sleep(10000);
                WebElement alllinks = driver.findElement(By.xpath("//a[@title='Services'][contains(.,'Services')]"));

                alllinks.click();
                Thread.sleep(10000);
                System.out.println("Title  is : "+driver.getTitle());
                driver.navigate().back();

        }
        public void About_us_carrers_link() throws InterruptedException {
                logger.info("It should get redirected to respective page.");
                Thread.sleep(10000);
                WebElement alllinks = driver.findElement(By.xpath("//a[@title='Careers'][contains(.,'Careers')]"));

                alllinks.click();
                Thread.sleep(10000);
                System.out.println("Title  is : "+driver.getTitle());
                driver.navigate().back();
}
}
