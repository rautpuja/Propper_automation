package com.Marvel.page.actions.web.Retailer;

import org.openqa.selenium.*;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Contact_us_retailer_page {

    private static final Logger logger = LoggerFactory.getLogger(Contact_us_retailer_page.class);

    private WebDriver driver;




    public Contact_us_retailer_page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }


    public void Contact_us() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should get redirect to the respective page.");
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        WebElement ele= driver.findElement(By.xpath("(//a[contains(.,'Contact Us')])[2]"));
        ele.click();
    }
    public void Breadcrumb() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should get redirected to the respective page and display the breadcrumb properly with Home > Contact Us ");

        WebElement ele = driver.findElement(By.xpath("//div[contains(@class,'breadcrumbs custom-breadcrum')]"));
        System.out.println("Actual Breadcrumb : " + ele.getText());

    }
    public void banner() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("\"It should display respective banner below the header section.\n" +
                "Below the banner it should display heading 'WE’RE HERE TO HELP'\"");

        WebElement ele= driver.findElement(By.xpath("//h1[@class='heading'][contains(.,'We’re here to help')]"));
        System.out.println("Actual Title : "+ele.getText());
    }
    public void How_may_we_help_section() throws InterruptedException {
        Thread.sleep(4000);
        logger.info("\"It should be required field and open dropdown with options :\n" +
                "-I have a question about a Marvel product\n" +
                "-I am looking for a Marvel dealer\n" +
                "-I want to register my Marvel product\n" +
                "-I need service on my Marvel product\n" +
                "-I am a member of the media and I need some information\n" +
                "-I would like to become a servicer for Marvel\n" +
                "-I would like to become a dealer for Marvel\n" +
                "-Other\"");
        Thread.sleep(20000);
        Select s = new Select(driver.findElement(By.xpath("//select[contains(@name,'service')]")));

        List<WebElement> op = s.getOptions();
        int size = op.size();
        for(int i =0; i<size ; i++){
            String options = op.get(i).getText();
            System.out.println("Actual Options : "+options);
        }
    }

    public void I_HAVE_QUESTION_ABOUT_MARVEL_invalid() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Error message should display.");
        Thread.sleep(4000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement firstname= driver.findElement(By.xpath("(//input[contains(@name,'firstname')])[1]"));
        firstname.sendKeys(select);
        firstname.sendKeys("56@dgfg");
        WebElement lastname= driver.findElement(By.xpath("(//input[contains(@name,'lastname')])[1]"));
        lastname.sendKeys(select);
        lastname.sendKeys("46@fg");
        WebElement email_address= driver.findElement(By.xpath("(//input[contains(@name,'email')])[2]"));
        email_address.sendKeys(select);
        email_address.sendKeys("puja2gmail.com");
        WebElement phone_number= driver.findElement(By.xpath("(//input[contains(@name,'telephone')])[1]"));
        phone_number.sendKeys(select);
        phone_number.sendKeys("987678");
        WebElement model_number= driver.findElement(By.xpath("(//input[contains(@name,'model_number')])[1]"));
        model_number.sendKeys(select);
        model_number.sendKeys("98789878");
        WebElement model_name= driver.findElement(By.xpath("//input[@name='model_name'][contains(@id,'name')]"));
        model_name.sendKeys(select);
        model_name.sendKeys("test");
        WebElement what_is_your_question= driver.findElement(By.xpath("//textarea[contains(@name,'comment')]"));
        what_is_your_question.sendKeys(select);
        what_is_your_question.sendKeys("Testing request from upbott team");
        WebElement ele= driver.findElement(By.xpath("//span[contains(.,'Submit')]"));
        ele.click();

    }
    public void I_HAVE_QUESTION_ABOUT_MARVEL_valid() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should display 'Success! Your inquiry is on its way to the appropriate Marvel team. Thank you for contacting us.'");
        Thread.sleep(4000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement firstname= driver.findElement(By.xpath("(//input[contains(@name,'firstname')])[1]"));
        firstname.sendKeys(select);
        firstname.sendKeys("Puja");
        WebElement lastname= driver.findElement(By.xpath("(//input[contains(@name,'lastname')])[1]"));
        lastname.sendKeys(select);
        lastname.sendKeys("Domke");
        WebElement email_address= driver.findElement(By.xpath("(//input[contains(@name,'email')])[2]"));
        email_address.sendKeys(select);
        email_address.sendKeys("puja@upbott.com");
        WebElement phone_number= driver.findElement(By.xpath("(//input[contains(@name,'telephone')])[1]"));
        phone_number.sendKeys(select);
        phone_number.sendKeys("9878765654");
        WebElement model_number= driver.findElement(By.xpath("(//input[contains(@name,'model_number')])[1]"));
        model_number.sendKeys(select);
        model_number.sendKeys("98789878");
        WebElement model_name= driver.findElement(By.xpath("//input[@name='model_name'][contains(@id,'name')]"));
        model_name.sendKeys(select);
        model_name.sendKeys("test");
        WebElement what_is_your_question= driver.findElement(By.xpath("//textarea[contains(@name,'comment')]"));
        what_is_your_question.sendKeys(select);
        what_is_your_question.sendKeys("Testing request from upbott team");
//        WebElement ele= driver.findElement(By.xpath("//span[contains(.,'Submit')]"));
//        ele.click();

    }
    public void I_HAVE_QUESTION_ABOUT_MARVEL_blank() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Error message should display. ");

        WebElement ele= driver.findElement(By.xpath("//span[contains(.,'Submit')]"));
        ele.click();

    }
    public void Dropdown_2nd_option_blank() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("\"It should display First Name*,Last Name*,Email Address*,Phone Number,Street Address*,City*,State/Province*,Zip/Postal Code*,Add Comment*\n" +
                "Fields\" ");

        WebElement ele= driver.findElement(By.xpath("//select[contains(@name,'service')]"));
        Select select = new Select(ele);
        select.selectByValue("looking_for_marvel_dealership");
        WebElement save= driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Submit')]"));
        save.click();
    }
    public void Dropdown_2nd_option_invalid() throws InterruptedException {
        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement fname= driver.findElement(By.xpath("(//input[contains(@name,'firstname')])[2]"));
        fname.sendKeys(select);
        fname.sendKeys("7788$fg");
        WebElement lname= driver.findElement(By.xpath("(//input[contains(@name,'lastname')])[2]"));
        lname.sendKeys(select);
        lname.sendKeys("6567#cgg");
        WebElement email= driver.findElement(By.xpath("(//input[contains(@name,'email')])[3]"));
        email.sendKeys(select);
        email.sendKeys("puja2upbott.com");
        WebElement pnumber= driver.findElement(By.xpath("(//input[contains(@name,'telephone')])[2]"));
        pnumber.sendKeys(select);
        pnumber.sendKeys("987898");
        WebElement saddress= driver.findElement(By.xpath("(//input[contains(@name,'address')])[1]"));
        saddress.sendKeys(select);
        saddress.sendKeys("test 123");

        WebElement city= driver.findElement(By.xpath("(//input[contains(@name,'city')])[1]"));
        city.sendKeys(select);
        city.sendKeys("missouri");
        WebElement sp= driver.findElement(By.xpath("(//input[contains(@name,'state')])[1]"));
        sp.sendKeys(select);
        sp.sendKeys("test");
        WebElement zip= driver.findElement(By.xpath("(//input[contains(@name,'zip')])[1]"));
        zip.sendKeys(select);
        zip.sendKeys("63011");
        WebElement addc= driver.findElement(By.xpath("//input[contains(@name,'comment')]"));
        addc.sendKeys(select);
        addc.sendKeys("Testing request from upbott team");

        WebElement save= driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Submit')]"));
        save.click();
    }
    public void Dropdown_2nd_option_valid() throws InterruptedException {
        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement fname= driver.findElement(By.xpath("(//input[contains(@name,'firstname')])[2]"));
        fname.sendKeys(select);
        fname.sendKeys("Puja");
        WebElement lname= driver.findElement(By.xpath("(//input[contains(@name,'lastname')])[2]"));
        lname.sendKeys(select);
        lname.sendKeys("Domke");
        WebElement email= driver.findElement(By.xpath("(//input[contains(@name,'email')])[3]"));
        email.sendKeys(select);
        email.sendKeys("puja@upbott.com");
        WebElement pnumber= driver.findElement(By.xpath("(//input[contains(@name,'telephone')])[2]"));
        pnumber.sendKeys(select);
        pnumber.sendKeys("79809098987");
        WebElement saddress= driver.findElement(By.xpath("(//input[contains(@name,'address')])[1]"));
        saddress.sendKeys(select);
        saddress.sendKeys("test 123");

        WebElement city= driver.findElement(By.xpath("(//input[contains(@name,'city')])[1]"));
        city.sendKeys(select);
        city.sendKeys("missouri");
        WebElement sp= driver.findElement(By.xpath("(//input[contains(@name,'state')])[1]"));
        sp.sendKeys(select);
        sp.sendKeys("test");
        WebElement zip= driver.findElement(By.xpath("(//input[contains(@name,'zip')])[1]"));
        zip.sendKeys(select);
        zip.sendKeys("63011");
        WebElement addc= driver.findElement(By.xpath("//input[contains(@name,'comment')]"));
        addc.sendKeys(select);
        addc.sendKeys("Testing request from upbott team");

//        WebElement save= driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Submit')]"));
//        save.click();
    }
    public void Dropdown_3rd_option_() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("\"It should display First Name*,Last Name*,Email Address*,Phone Number,Street Address*,City*,State/Province*,Zip/Postal Code*,Add Comment*\n" +
                "Fields\" ");

        WebElement ele= driver.findElement(By.xpath("//select[contains(@name,'service')]"));
        Select select = new Select(ele);
        select.selectByValue("marvel_product_registration");
        Thread.sleep(10000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        WebElement ele4= driver.findElement(By.xpath("(//a[contains(.,'Contact Us')])[2]"));
        ele4.click();

    }
    public void Dropdown_4th_option_() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("\"It should display First Name*,Last Name*,Email Address*,Phone Number,Street Address*,City*,State/Province*,Zip/Postal Code*,Add Comment*\n" +
                "Fields\" ");

        WebElement ele= driver.findElement(By.xpath("//select[contains(@name,'service')]"));
        Select select = new Select(ele);
        select.selectByValue("marvel_product_service");



    }
    public void Dropdown_4th_option_browse() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("\"It should display First Name*,Last Name*,Email Address*,Phone Number,Street Address*,City*,State/Province*,Zip/Postal Code*,Add Comment*\n" +
                "Fields\" ");
//
//        String select = Keys.chord(Keys.CONTROL, "a");
//        WebElement fname= driver.findElement(By.xpath("(//input[contains(@name,'firstname')])[2]"));
//        fname.sendKeys(select);
//        fname.sendKeys("Puja");
//        WebElement lname= driver.findElement(By.xpath("(//input[contains(@name,'lastname')])[2]"));
//        lname.sendKeys(select);
//        lname.sendKeys("Domke");
//        WebElement email= driver.findElement(By.xpath("(//input[contains(@name,'email')])[3]"));
//        email.sendKeys(select);
//        email.sendKeys("puja@upbott.com");
//        WebElement pnumber= driver.findElement(By.xpath("(//input[contains(@name,'telephone')])[2]"));
//        pnumber.sendKeys(select);
//        pnumber.sendKeys("79809098987");
//        WebElement saddress= driver.findElement(By.xpath("(//input[contains(@name,'address')])[1]"));
//        saddress.sendKeys(select);
//        saddress.sendKeys("test 123");
//
//        WebElement city= driver.findElement(By.xpath("(//input[contains(@name,'city')])[1]"));
//        city.sendKeys(select);
//        city.sendKeys("missouri");
//        WebElement sp= driver.findElement(By.xpath("(//input[contains(@name,'state')])[1]"));
//        sp.sendKeys(select);
//        sp.sendKeys("test");
//        WebElement zip= driver.findElement(By.xpath("(//input[contains(@name,'zip')])[1]"));
//        zip.sendKeys(select);
//        zip.sendKeys("63011");
//        WebElement addc= driver.findElement(By.xpath("//input[contains(@name,'comment')]"));
//        addc.sendKeys(select);
//        addc.sendKeys("Testing request from upbott team");
        WebElement browse= driver.findElement(By.xpath("//input[contains(@type,'file')]"));

        browse.sendKeys("C:\\Users\\lenovo\\Desktop\\UPBOTT\\propper-automation\\PDP screenshots\\Accessasies Images not found.JPEG");

    }
    public void Dropdown_5th_option_() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("\"It should display First Name*,Last Name*,Email Address*,Phone Number,Street Address*,City*,State/Province*,Zip/Postal Code*,Add Comment*\n" +
                "Fields\" ");

        WebElement ele= driver.findElement(By.xpath("//select[contains(@name,'service')]"));
        Select select = new Select(ele);
        select.selectByValue("need_some_information");


    }
    public void Dropdown_6th_option_() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("\"It should display First Name*,Last Name*,Email Address*,Phone Number,Street Address*,City*,State/Province*,Zip/Postal Code*,Add Comment*\n" +
                "Fields\" ");

        WebElement ele= driver.findElement(By.xpath("//select[contains(@name,'service')]"));
        Select select = new Select(ele);
        select.selectByValue("servicer_sign_up");
        Thread.sleep(10000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        WebElement ele5= driver.findElement(By.xpath("(//a[contains(.,'Contact Us')])[2]"));
        ele5.click();


    }
    public void Dropdown_7th_option_() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("\"It should display First Name*,Last Name*,Email Address*,Phone Number,Street Address*,City*,State/Province*,Zip/Postal Code*,Add Comment*\n" +
                "Fields\" ");

        WebElement ele= driver.findElement(By.xpath("//select[contains(@name,'service')]"));
        Select select = new Select(ele);
        select.selectByValue("dealer_sign_up");
        Thread.sleep(10000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        WebElement ele5= driver.findElement(By.xpath("(//a[contains(.,'Contact Us')])[2]"));
        ele5.click();


    }
    public void Dropdown_other_option_() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should display First Name*,Last Name*,Email Address*,Street Address,City,State/Province,Zip/Postal Code,I am a(n):,Please describe the nature of your enquiry Fields ");

        WebElement ele= driver.findElement(By.xpath("//select[contains(@name,'service')]"));
        Select select = new Select(ele);
        select.selectByValue("other");
        Thread.sleep(10000);



    }
    public void Dropdown_other_option_radio_button() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should be clickable ");

        WebElement ele= driver.findElement(By.xpath("//select[contains(@name,'service')]"));
        Select select = new Select(ele);
        select.selectByValue("other");
        Thread.sleep(10000);

        WebElement radio= driver.findElement(By.xpath("//input[@name='role'][contains(@id,'customer')]"));
        radio.click();

    }
}
