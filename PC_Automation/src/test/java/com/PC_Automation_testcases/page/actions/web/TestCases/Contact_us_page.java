package com.PC_Automation_testcases.page.actions.web.TestCases;

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

public class Contact_us_page {

    private static final Logger logger = LoggerFactory.getLogger(Contact_us_page.class);

    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "(//a[contains(.,'Contact Us')])[2]")
    @CacheLookup
    WebElement Contact_us;

    @FindBy(how = How.XPATH, using = "(//input[contains(@type,'text')])[3]")
    @CacheLookup
    WebElement Name;

    @FindBy(how = How.XPATH, using = "//input[@id='email']")
    @CacheLookup
    WebElement Email_address;

    @FindBy(how = How.XPATH, using = "//input[@id='telephone']")
    @CacheLookup
    WebElement Telephone;

    @FindBy(how = How.XPATH, using = "//textarea[@id='comment']")
    @CacheLookup
    WebElement Message;

    @FindBy(how = How.XPATH, using = "//div[@class='recaptcha-checkbox-border']")
    @CacheLookup
    WebElement Recaptcha;


    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Submit')]")
    @CacheLookup
    WebElement Submit;

    public Contact_us_page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    public void Subscribe() throws InterruptedException {
        logger.info("click on subscribe button");


        WebDriverWait wait = new WebDriverWait(driver,90);

        WebElement	ele=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='mageplaza-betterpopup-block']/div[@id='bio_ep']/div[1]/div[1]/img[1]")));
        ele.click();
        Thread.sleep(10000);
        WebElement ele4= driver.findElement(By.xpath("//button[@class='btn-cookie btn-cookie-accept']"));
        ele4.click();

    }


    public void Contact_us() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should get redirected to the respective page and display the breadcrumb properly with Home > Contact Us ");
        //Thread.sleep(4000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(8000);
        Contact_us.click();

    }



    public void Contact_us_blank() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should get redirected to the respective page and display the breadcrumb properly with Home > Contact Us ");
        Thread.sleep(4000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        WebElement submit=driver.findElement(By.xpath("//input[contains(@id,'submit_button')]"));

        submit.click();
    }

    public void Contact_us_invalid_email() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should get redirected to the respective page and display the breadcrumb properly with Home > Contact Us ");
        Thread.sleep(4000);
        WebElement Name=driver.findElement(By.xpath("(//input[contains(@type,'text')])[3]"));
        Name.sendKeys("puja");
        WebElement Last_Name=driver.findElement(By.xpath("(//input[@type='text'])[4]"));
        Last_Name.sendKeys("Domke");
        WebElement Email_address=driver.findElement(By.xpath("(//input[contains(@type,'text')])[5]"));
        Email_address.sendKeys("puja2upbott.com");
        WebElement Telephone=driver.findElement(By.xpath("(//input[contains(@type,'text')])[3]"));
        Telephone.sendKeys("9878987678");
        WebElement Companey=driver.findElement(By.xpath("(//input[contains(@type,'text')])[6]"));
        Companey.sendKeys("upbott");
        WebElement Job=driver.findElement(By.xpath("(//input[contains(@type,'text')])[8]"));
        Job.sendKeys("testing");
        WebElement Street_address=driver.findElement(By.xpath("(//input[@class='required required-entry'])[6]"));

       Street_address.sendKeys("test 123");
        WebElement City=driver.findElement(By.xpath("(//input[contains(@type,'text')])[10]"));

        City.sendKeys("missouri");
        WebElement Contry=driver.findElement(By.xpath("(//select[@class='required required-entry'])[1]"));

        Select sel=new Select(Contry);
        sel.selectByValue("tfa_2311");
        WebElement Postal_code=driver.findElement(By.xpath("(//input[contains(@aria-required,'true')])[9]"));

        Postal_code.sendKeys("63011");
        WebElement P_dropdown=driver.findElement(By.xpath("(//select[contains(@aria-required,'true')])[4]"));
        Select sel2=new Select(P_dropdown);
        sel2.selectByValue("tfa_2591");
        WebElement Message=driver.findElement(By.xpath("//textarea[contains(@id,'2588')][@name='tfa_2588']"));
       Message.sendKeys("Testing request from upbott team");

        WebElement Radio1=driver.findElement(By.xpath("(//input[contains(@type,'radio')])[1]"));

        WebElement Radio2=driver.findElement(By.xpath("(//input[contains(@type,'radio')])[2]"));
        Radio2.click();
        WebElement submit=driver.findElement(By.xpath("//input[contains(@id,'submit_button')]"));

    submit.click();

    }
    public void Contact_us_without_captcha() throws InterruptedException {
        Thread.sleep(4000);
        logger.info("It should get redirected to the respective page and display the breadcrumb properly with Home > Contact Us ");
        Thread.sleep(4000);
        String select = Keys.chord(Keys.CONTROL, "a");

        WebElement Name=driver.findElement(By.xpath("(//input[contains(@type,'text')])[3]"));
       Name.sendKeys(select);
        Name.sendKeys("puja");
        WebElement Last_Name=driver.findElement(By.xpath("(//input[@type='text'])[4]"));
        Last_Name.sendKeys(select);
        Last_Name.sendKeys("Domke");
        WebElement Email_address=driver.findElement(By.xpath("(//input[contains(@type,'text')])[5]"));
        Email_address.sendKeys(select);
        Email_address.sendKeys("puja@upbott.com");
        WebElement Telephone=driver.findElement(By.xpath("(//input[contains(@type,'text')])[3]"));
        Telephone.sendKeys(select);
        Telephone.sendKeys("9878987678");
        WebElement Companey=driver.findElement(By.xpath("(//input[contains(@type,'text')])[6]"));
        Companey.sendKeys(select);
        Companey.sendKeys("upbott");
        WebElement Job=driver.findElement(By.xpath("(//input[contains(@type,'text')])[8]"));
        Job.sendKeys(select);
        Job.sendKeys("testing");
        WebElement Street_address=driver.findElement(By.xpath("(//input[@class='required required-entry'])[6]"));
        Street_address.sendKeys(select);
        Street_address.sendKeys("test 123");
        WebElement City=driver.findElement(By.xpath("(//input[contains(@type,'text')])[10]"));
        City.sendKeys(select);
        City.sendKeys("missouri");
        WebElement Contry=driver.findElement(By.xpath("(//select[@class='required required-entry'])[1]"));

        Select sel=new Select(Contry);
        sel.selectByValue("tfa_2311");
        WebElement Postal_code=driver.findElement(By.xpath("(//input[contains(@aria-required,'true')])[9]"));
        Postal_code.sendKeys(select);
        Postal_code.sendKeys("63011");
        WebElement P_dropdown=driver.findElement(By.xpath("(//select[contains(@aria-required,'true')])[4]"));
        Select sel2=new Select(P_dropdown);
        sel2.selectByValue("tfa_2591");
        WebElement Message=driver.findElement(By.xpath("//textarea[contains(@id,'2588')][@name='tfa_2588']"));

        Message.sendKeys(select);
        Message.sendKeys("Testing request from upbott team");

        WebElement Radio1=driver.findElement(By.xpath("(//input[contains(@type,'radio')])[1]"));

        WebElement Radio2=driver.findElement(By.xpath("(//input[contains(@type,'radio')])[2]"));
        Radio2.click();
        WebElement submit=driver.findElement(By.xpath("//input[contains(@id,'submit_button')]"));

        submit.click();
    }
    public void Contact_us_with_captcha() throws InterruptedException {
        Thread.sleep(4000);
        logger.info("It should get redirected to the respective page and display the breadcrumb properly with Home > Contact Us ");
        Thread.sleep(4000);
        String select = Keys.chord(Keys.CONTROL, "a");

        WebElement Name=driver.findElement(By.xpath("(//input[contains(@type,'text')])[3]"));
        Name.sendKeys(select);
        Name.sendKeys("puja");
        WebElement Last_Name=driver.findElement(By.xpath("(//input[@type='text'])[4]"));
        Last_Name.sendKeys(select);
        Last_Name.sendKeys("Domke");
        WebElement Email_address=driver.findElement(By.xpath("(//input[contains(@type,'text')])[5]"));
        Email_address.sendKeys(select);
        Email_address.sendKeys("puja@upbott.com");
        WebElement Telephone=driver.findElement(By.xpath("(//input[contains(@type,'text')])[3]"));
        Telephone.sendKeys(select);
        Telephone.sendKeys("9878987678");
        WebElement Companey=driver.findElement(By.xpath("(//input[contains(@type,'text')])[6]"));
        Companey.sendKeys(select);
        Companey.sendKeys("upbott");
        WebElement Job=driver.findElement(By.xpath("(//input[contains(@type,'text')])[8]"));
        Job.sendKeys(select);
        Job.sendKeys("testing");
        WebElement Street_address=driver.findElement(By.xpath("(//input[@class='required required-entry'])[6]"));
        Street_address.sendKeys(select);
        Street_address.sendKeys("test 123");
        WebElement City=driver.findElement(By.xpath("(//input[contains(@type,'text')])[10]"));
        City.sendKeys(select);
        City.sendKeys("missouri");
        WebElement Contry=driver.findElement(By.xpath("(//select[@class='required required-entry'])[1]"));

        Select sel=new Select(Contry);
        sel.selectByValue("tfa_2311");
        WebElement Postal_code=driver.findElement(By.xpath("(//input[contains(@aria-required,'true')])[9]"));
        Postal_code.sendKeys(select);
        Postal_code.sendKeys("63011");
        WebElement P_dropdown=driver.findElement(By.xpath("(//select[contains(@aria-required,'true')])[4]"));
        Select sel2=new Select(P_dropdown);
        sel2.selectByValue("tfa_2591");
        WebElement Message=driver.findElement(By.xpath("//textarea[contains(@id,'2588')][@name='tfa_2588']"));

        Message.sendKeys(select);
        Message.sendKeys("Testing request from upbott team");

        WebElement Radio1=driver.findElement(By.xpath("(//input[contains(@type,'radio')])[1]"));

        WebElement Radio2=driver.findElement(By.xpath("(//input[contains(@type,'radio')])[2]"));
        Radio2.click();
        WebElement submit=driver.findElement(By.xpath("//input[contains(@id,'submit_button')]"));

        submit.click();
    }

    public void Canada() throws InterruptedException {
        String select = Keys.chord(Keys.CONTROL, "a");

        WebElement Name=driver.findElement(By.xpath("(//input[contains(@type,'text')])[3]"));
        Name.sendKeys(select);
        Name.sendKeys("puja");
        WebElement Last_Name=driver.findElement(By.xpath("(//input[@type='text'])[4]"));
        Last_Name.sendKeys(select);
        Last_Name.sendKeys("Domke");
        WebElement Email_address=driver.findElement(By.xpath("(//input[contains(@type,'text')])[5]"));
        Email_address.sendKeys(select);
        Email_address.sendKeys("puja@upbott.com");
        WebElement Telephone=driver.findElement(By.xpath("(//input[contains(@type,'text')])[3]"));
        Telephone.sendKeys(select);
        Telephone.sendKeys("9878987678");
        WebElement Companey=driver.findElement(By.xpath("(//input[contains(@type,'text')])[6]"));
        Companey.sendKeys(select);
        Companey.sendKeys("upbott");
        WebElement Job=driver.findElement(By.xpath("(//input[contains(@type,'text')])[8]"));
        Job.sendKeys(select);
        Job.sendKeys("testing");
        WebElement Street_address=driver.findElement(By.xpath("(//input[@class='required required-entry'])[6]"));
        Street_address.sendKeys(select);
        Street_address.sendKeys("test 123");
        WebElement City=driver.findElement(By.xpath("(//input[contains(@type,'text')])[10]"));
        City.sendKeys(select);
        City.sendKeys("missouri");
        WebElement Contry=driver.findElement(By.xpath("(//select[@class='required required-entry'])[1]"));

        Select sel=new Select(Contry);
        sel.selectByValue("tfa_2311");
        WebElement Provience=driver.findElement(By.xpath("(//select[contains(@aria-required,'true')])[3]"));
        Select sel3=new Select(Provience);
        sel3.selectByValue("tfa_2571");
        WebElement Postal_code=driver.findElement(By.xpath("(//input[contains(@aria-required,'true')])[9]"));
        Postal_code.sendKeys(select);
        Postal_code.sendKeys("63011");
        WebElement P_dropdown=driver.findElement(By.xpath("(//select[contains(@aria-required,'true')])[4]"));
        Select sel2=new Select(P_dropdown);
        sel2.selectByValue("tfa_2591");
        WebElement Message=driver.findElement(By.xpath("//textarea[contains(@id,'2588')][@name='tfa_2588']"));

        Message.sendKeys(select);
        Message.sendKeys("Testing request from upbott team");

        WebElement Radio1=driver.findElement(By.xpath("(//input[contains(@type,'radio')])[1]"));

        WebElement Radio2=driver.findElement(By.xpath("(//input[contains(@type,'radio')])[2]"));
        Radio2.click();
        WebElement submit=driver.findElement(By.xpath("//input[contains(@id,'submit_button')]"));

        submit.click();
    }
    public void View_private_policy() throws InterruptedException {
        String select = Keys.chord(Keys.CONTROL, "a");

        WebElement Name=driver.findElement(By.xpath("//a[contains(.,'View Privacy Policy')]"));
        Name.click();}

    public void United_state() throws InterruptedException {
        String select = Keys.chord(Keys.CONTROL, "a");

        WebElement Name=driver.findElement(By.xpath("(//input[contains(@type,'text')])[3]"));
        Name.sendKeys(select);
        Name.sendKeys("puja");
        WebElement Last_Name=driver.findElement(By.xpath("(//input[@type='text'])[4]"));
        Last_Name.sendKeys(select);
        Last_Name.sendKeys("Domke");
        WebElement Email_address=driver.findElement(By.xpath("(//input[contains(@type,'text')])[5]"));
        Email_address.sendKeys(select);
        Email_address.sendKeys("puja@upbott.com");
        WebElement Telephone=driver.findElement(By.xpath("(//input[contains(@type,'text')])[3]"));
        Telephone.sendKeys(select);
        Telephone.sendKeys("9878987678");
        WebElement Companey=driver.findElement(By.xpath("(//input[contains(@type,'text')])[6]"));
        Companey.sendKeys(select);
        Companey.sendKeys("upbott");
        WebElement Job=driver.findElement(By.xpath("(//input[contains(@type,'text')])[8]"));
        Job.sendKeys(select);
        Job.sendKeys("testing");
        WebElement Street_address=driver.findElement(By.xpath("(//input[@class='required required-entry'])[6]"));
        Street_address.sendKeys(select);
        Street_address.sendKeys("test 123");
        WebElement City=driver.findElement(By.xpath("(//input[contains(@type,'text')])[10]"));
        City.sendKeys(select);
        City.sendKeys("missouri");
        WebElement Contry=driver.findElement(By.xpath("(//select[@class='required required-entry'])[1]"));

        Select sel=new Select(Contry);

        sel.selectByValue("tfa_2497");
        WebElement state=driver.findElement(By.xpath("//select[contains(@name,'tfa_2511')]"));
        Select sel3=new Select(state);
        sel3.selectByValue("tfa_2514");
        WebElement Postal_code=driver.findElement(By.xpath("(//input[contains(@aria-required,'true')])[9]"));
        Postal_code.sendKeys(select);
        Postal_code.sendKeys("63011");
        WebElement P_dropdown=driver.findElement(By.xpath("(//select[contains(@aria-required,'true')])[4]"));
        Select sel2=new Select(P_dropdown);
        sel2.selectByValue("tfa_2591");
        WebElement Message=driver.findElement(By.xpath("//textarea[contains(@id,'2588')][@name='tfa_2588']"));

        Message.sendKeys(select);
        Message.sendKeys("Testing request from upbott team");

        WebElement Radio1=driver.findElement(By.xpath("(//input[contains(@type,'radio')])[1]"));

        WebElement Radio2=driver.findElement(By.xpath("(//input[contains(@type,'radio')])[2]"));
        Radio2.click();
        WebElement submit=driver.findElement(By.xpath("//input[contains(@id,'submit_button')]"));

        submit.click();
    }

}
