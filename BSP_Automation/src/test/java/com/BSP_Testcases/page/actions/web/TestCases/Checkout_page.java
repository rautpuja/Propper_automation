package com.BSP_Testcases.page.actions.web.TestCases;

import com.BSP_Testcases.utils.common.Config;
import com.BSP_Testcases.utils.selenium.WebUtils;
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

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Checkout_page {

    private static final Logger logger = LoggerFactory.getLogger(Checkout_page.class);
    private static final String APPLICATION_URL = Config.getProperty("appURL");

    private WebDriver driver;



    @FindBy(how = How.XPATH, using = "//input[@name='firstname']")
    @CacheLookup
    WebElement Name;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Next')]")
    @CacheLookup
    WebElement Next;


    @FindBy(how = How.XPATH, using = "//input[@value='purchaseorder']")
    @CacheLookup
    WebElement MoneyOrder;

    @FindBy(how = How.XPATH, using = "//input[@title='Purchase Order Number']")
    @CacheLookup
    WebElement PurcheseOrderNumber;





    @FindBy(how = How.XPATH, using = "//span[contains(text(),'View Cart')]")
    @CacheLookup
    WebElement viewcart;

    @FindBy(how = How.XPATH, using = "//input[@name='telephone']")
    @CacheLookup
    WebElement phonenumber;



    public Checkout_page(WebDriver driver) {
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

    public void order_now_button() throws InterruptedException {
        logger.info("It should display a popup");
        Thread.sleep(10000);
        WebElement slide = driver.findElement(By.xpath("//button[@class='button btn-green'][contains(.,'ORDER NOW')]"));
        slide.click();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));


    }
    public void contact_info_valid() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("\"It should display a form (fields - First Name,Last Name,Email,Phone,Street Address,Zip Code,City,State,Country)\n" +
                "All field should be required.\n" +
                "It should rediret to next navigation form Upload Artwork\"");
        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(5000);
        WebElement first_name = driver.findElement(By.xpath("//input[@id='firstname']"));
        first_name.sendKeys(select);
        first_name.sendKeys("puja");
        WebElement last_name = driver.findElement(By.xpath("//input[@id='lastname']"));
        last_name.sendKeys(select);
        last_name.sendKeys("raut");

        WebElement email_name = driver.findElement(By.xpath("//input[@id='email']"));
        email_name.sendKeys(select);
        email_name.sendKeys("puja@upbott.com");
        WebElement p_name = driver.findElement(By.xpath("//input[@id='phone']"));
        p_name.sendKeys(select);
        p_name.sendKeys("8789876567");

        WebElement street_address = driver.findElement(By.xpath("//input[@id='street']"));
        street_address.sendKeys(select);
        street_address.sendKeys("test 123");
        WebElement zip = driver.findElement(By.xpath("//input[@id='zip']"));
        zip.sendKeys(select);
        zip.sendKeys("63011");
        WebElement city = driver.findElement(By.xpath("//select[@id='city']"));

        Select sel=new Select(city);
        sel.selectByValue("ELLISVILLE");
        WebElement Next_step = driver.findElement(By.xpath("//button[contains(@data-current-step,'contact-tab')]"));
        Next_step.click();

   }

    public void contact_info_valid_wishlist() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("\"It should display a form (fields - First Name,Last Name,Email,Phone,Street Address,Zip Code,City,State,Country)\n" +
                "All field should be required.\n" +
                "It should rediret to next navigation form Upload Artwork\"");
        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(5000);
        WebElement first_name = driver.findElement(By.xpath("//input[@id='firstname']"));
        first_name.sendKeys(select);
        first_name.sendKeys("puja");
        WebElement last_name = driver.findElement(By.xpath("//input[@id='lastname']"));
        last_name.sendKeys(select);
        last_name.sendKeys("raut");

        WebElement email_name = driver.findElement(By.xpath("//input[contains(@title,'Email')]"));
        email_name.sendKeys(select);
        email_name.sendKeys("puja@upbott.com");
        WebElement p_name = driver.findElement(By.xpath("//input[@id='phone']"));
        p_name.sendKeys(select);
        p_name.sendKeys("8789876567");

        WebElement street_address = driver.findElement(By.xpath("//input[@id='street']"));
        street_address.sendKeys(select);
        street_address.sendKeys("test 123");
        WebElement zip = driver.findElement(By.xpath("//input[@id='zip']"));
        zip.sendKeys(select);
        zip.sendKeys("63011");
        WebElement city = driver.findElement(By.xpath("//select[@id='city']"));

        Select sel=new Select(city);
        sel.selectByValue("ELLISVILLE");
        WebElement Next_step = driver.findElement(By.xpath("//button[contains(@data-current-step,'contact-tab')]"));
        Next_step.click();

    }
    public void contact_info_blank() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Error message should get displayed");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        String select = Keys.chord(Keys.CONTROL, "a");
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(5000);

        WebElement Next_step = driver.findElement(By.xpath("//button[contains(@data-current-step,'contact-tab')]"));
       ac.moveToElement(Next_step).click().build().perform();

    }
    public void contact_info_invalid_wishlist() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should display a error message");

        String select = Keys.chord(Keys.CONTROL, "a");
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(5000);
        WebElement first_name = driver.findElement(By.xpath("//input[@id='firstname']"));
        first_name.sendKeys(select);
        first_name.sendKeys("puja");
        WebElement last_name = driver.findElement(By.xpath("//input[@id='lastname']"));
        last_name.sendKeys(select);
        last_name.sendKeys("raut");

        WebElement email_name = driver.findElement(By.xpath("//input[contains(@title,'Email')]"));
        email_name.sendKeys(select);
        email_name.sendKeys("puja@upbott.com");
        WebElement p_name = driver.findElement(By.xpath("//input[@id='phone']"));
        p_name.sendKeys(select);
        p_name.sendKeys("8789876567");

        WebElement street_address = driver.findElement(By.xpath("//input[@id='street']"));
        street_address.sendKeys(select);
        street_address.sendKeys("test 123");
        WebElement zip = driver.findElement(By.xpath("//input[@id='zip']"));
        zip.sendKeys(select);
        zip.sendKeys("63011");


    }
    public void contact_info_invalid() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should display a error message");

        String select = Keys.chord(Keys.CONTROL, "a");
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(5000);
        WebElement first_name = driver.findElement(By.xpath("//input[@id='firstname']"));
        first_name.sendKeys(select);
        first_name.sendKeys("puja");
        WebElement last_name = driver.findElement(By.xpath("//input[@id='lastname']"));
        last_name.sendKeys(select);
        last_name.sendKeys("raut");

        WebElement email_name = driver.findElement(By.xpath("//input[@id='email']"));
        email_name.sendKeys(select);
        email_name.sendKeys("puja@upbott.com");
        WebElement p_name = driver.findElement(By.xpath("//input[@id='phone']"));
        p_name.sendKeys(select);
        p_name.sendKeys("8789876567");

        WebElement street_address = driver.findElement(By.xpath("//input[@id='street']"));
        street_address.sendKeys(select);
        street_address.sendKeys("test 123");
        WebElement zip = driver.findElement(By.xpath("//input[@id='zip']"));
        zip.sendKeys(select);
        zip.sendKeys("63011");


    }
    public void Product_info() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Error message should get displayed");
        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(5000);

        WebElement Next_step = driver.findElement(By.xpath("(//div[contains(@class,'order-info')])[5]"));
      System.out.println(" Product info is : "+Next_step.getText());

    }
    public void Product_info2() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Error message should get displayed");
        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(5000);

        WebElement Next_step = driver.findElement(By.xpath("(//a[@class='product-item-link'])[2]"));
        System.out.println(" Product info is : "+Next_step.getText());

    }
    public void QTY() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("qty should be updated");
        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");

        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(5000);
Actions ac=new Actions(driver);
        WebElement Next_step = driver.findElement(By.xpath("//input[contains(@class,'input-text qty valid')]"));
    ac.moveToElement(Next_step).click().build().perform();
      Next_step.sendKeys(select);
      Next_step.sendKeys("50");

    }
    public void QTY2() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("qty should be updated");
        Thread.sleep(10000);
        String select = Keys.chord(Keys.CONTROL, "a");

        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(5000);
        Actions ac=new Actions(driver);
        WebElement Next_step = driver.findElement(By.xpath("//input[contains(@class,'input-text qty')]"));
        ac.moveToElement(Next_step).click().build().perform();
        Next_step.sendKeys(select);
        Next_step.sendKeys("6");

    }
    public void next2() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Dropdown should selected");


        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(5000);
//
//        WebElement colour = driver.findElement(By.xpath("//select[contains(@name,'options_Color_13399')]"));
//       Select sel=new Select(colour);
//       sel.selectByValue("Reflex Blue");
        WebElement next_step = driver.findElement(By.xpath("//button[contains(@id,'step1')]"));
        next_step.click();

    }

    public void Upload() throws InterruptedException, AWTException {
        Thread.sleep(10000);
        logger.info("image should be uploded and image should be visible");
        WebUtils.SwitchTowindopopup();

        WebElement upload = driver.findElement(By.xpath("(//span[contains(.,'SELECT FILE FROM MY COMPUTER')])[2]"));
//        upload.click();
//        upload.sendKeys("C:\\Users\\lenovo\\Desktop\\UPBOTT\\propper-automation\\PDP screenshots\\New folder\\clear all filter.png");
        upload.click();

        //put path to your image in a clipboard
        StringSelection ss = new StringSelection("C:\\Users\\lenovo\\Desktop\\UPBOTT\\propper-automation\\PDP screenshots\\New folder\\clear all filter.png");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        //imitate mouse events like ENTER, CTRL+C, CTRL+V
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


    }
    public void Upload2() throws InterruptedException, AWTException {
        Thread.sleep(10000);
        logger.info("image should be uploded and image should be visible");
        WebUtils.SwitchTowindopopup();

        WebElement upload = driver.findElement(By.xpath("//button[@type='button'][contains(.,'SELECT FILE FROM MY COMPUTER')]"));
//        upload.click();
//        upload.sendKeys("C:\\Users\\lenovo\\Desktop\\UPBOTT\\propper-automation\\PDP screenshots\\New folder\\clear all filter.png");
        upload.click();

        //put path to your image in a clipboard
        StringSelection ss = new StringSelection("C:\\Users\\lenovo\\Desktop\\UPBOTT\\propper-automation\\PDP screenshots\\New folder\\clear all filter.png");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        //imitate mouse events like ENTER, CTRL+C, CTRL+V
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


    }
    public void Add_text() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("\"It should display text box and font dropdown\n" +
                "Font dropdown should be clickable and display options\n" +
                "Font options Should clickable/selectable\"");

        WebUtils.SwitchTowindopopup();

        WebElement add_text = driver.findElement(By.xpath("//span[contains(.,'ADD TEXT')]"));
       add_text.click();
        Thread.sleep(5000);
        WebElement textbox = driver.findElement(By.xpath("//textarea[@name='needed_text'][contains(@id,'text')]"));
        textbox.sendKeys("testing Request");
        Thread.sleep(5000);
        WebElement font = driver.findElement(By.xpath("//select[@name='needed_font'][contains(@id,'font')]"));
      Select sel=new Select(font);
      sel.selectByValue("3");

    }
    public void Contact_me() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Contact me' button should be clickable");
        WebUtils.SwitchTowindopopup();

        WebElement add_text = driver.findElement(By.xpath("//button[@type='button'][contains(.,'CONTACT ME')]"));
        add_text.click();
        Thread.sleep(5000);


    }
    public void Next_step() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should be redirect to next 'Payment Info (Optional)' section");
        WebUtils.SwitchTowindopopup();
        WebElement add_text = driver.findElement(By.xpath("//button[contains(@data-next-step,'payment-tab')]"));
        add_text.click();
        Thread.sleep(5000);


    }
    public void Next_step2() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should be redirect to next 'Payment Info (Optional)' section");
        WebUtils.SwitchTowindopopup();
        WebElement add_text = driver.findElement(By.xpath("//button[contains(@id,'step3')]"));
        add_text.click();
        Thread.sleep(5000);


    }
    public void payment_method() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should display I’d prefer to see my proof first checkbox,Name (as it appears on your card)(required),Card Number(required),Expiration Date (mm/yy)(required),CCV(required) and Yup! I'd like to receive discounts and cool product ideas checkbox");
        WebUtils.SwitchTowindopopup();

        WebElement add_text = driver.findElement(By.xpath("//h2[contains(.,'3 PAYMENT INFORMATION (OPTIONAL)')]"));
       System.out.println(" Payment info text : "+add_text.getText());


    }
    public void payment_method_2() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should display I’d prefer to see my proof first checkbox,Name (as it appears on your card)(required),Card Number(required),Expiration Date (mm/yy)(required),CCV(required) and Yup! I'd like to receive discounts and cool product ideas checkbox");
        WebUtils.SwitchTowindopopup();

        WebElement add_text = driver.findElement(By.xpath("//h2[contains(.,'4 PAYMENT INFORMATION (OPTIONAL)')]"));
        System.out.println(" Payment info text : "+add_text.getText());


    }


    public void payment_method_invalid() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should display a error message");
        WebUtils.SwitchTowindopopup();

        WebElement name = driver.findElement(By.xpath("//input[contains(@name,'nameoncard')]"));
      name.sendKeys("Puja");
        WebElement card_number = driver.findElement(By.xpath("//input[@title='Card Number']"));
       card_number.sendKeys("567788767");
        WebElement exm = driver.findElement(By.xpath("//select[contains(@name,'cc_exp_month')]"));
       Select month=new Select(exm);
       month.selectByValue("05");
        WebUtils.getSelectedValueInDropDown(exm);
        WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year'][contains(@id,'yr')]"));
        Select year1=new Select(year);
        year1.selectByValue("2025");
        WebUtils.getSelectedValueInDropDown(year);
        WebElement cvv = driver.findElement(By.xpath("//input[contains(@title,'CCV')]"));
       cvv.sendKeys("787");
//        WebElement next_step = driver.findElement(By.xpath("//button[contains(@data-next-step,'confirm-tab')]"));
//        next_step.click();
    }
    public void payment_method_valid() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should display a error message");
        String select = Keys.chord(Keys.CONTROL, "a");
        WebUtils.SwitchTowindopopup();

        WebElement name = driver.findElement(By.xpath("//input[contains(@name,'nameoncard')]"));
        name.sendKeys(select);
        name.sendKeys("Puja");
        WebElement card_number = driver.findElement(By.xpath("//input[@title='Card Number']"));
       card_number.sendKeys(select);
        card_number.sendKeys("4111111111111111");

        WebElement exm = driver.findElement(By.xpath("//select[contains(@name,'cc_exp_month')]"));
        Select month=new Select(exm);
        month.selectByValue("05");
        WebUtils.getSelectedValueInDropDown(exm);
        WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year'][contains(@id,'yr')]"));
        Select year1=new Select(year);
        year1.selectByValue("2025");
        WebUtils.getSelectedValueInDropDown(year);
        WebElement cvv = driver.findElement(By.xpath("//input[contains(@title,'CCV')]"));
        cvv.sendKeys(select);
        cvv.sendKeys("787");

//        WebElement next_step = driver.findElement(By.xpath("//button[contains(@data-next-step,'confirm-tab')]"));
//        next_step.click();
    }
    public void payment_method_checkbox() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("\"By default , It should be uncheck.\n" +
                "It should only display next step button and back button(Form is hidden)\"");
        WebUtils.SwitchTowindopopup();

        WebElement checkbox = driver.findElement(By.xpath("//input[contains(@title,'Proof')]"));
       checkbox.click();

//        WebElement next_step = driver.findElement(By.xpath("//button[contains(@data-next-step,'confirm-tab')]"));
//        next_step.click();
    }
    public void payment_method_checkbox2() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("By default , It should be uncheck.");
           WebUtils.SwitchTowindopopup();

        WebElement checkbox = driver.findElement(By.xpath("(//input[contains(@type,'checkbox')])[4]"));
        checkbox.click();

        WebElement next_step = driver.findElement(By.xpath("//button[contains(@data-next-step,'confirm-tab')]"));
        next_step.click();
        WebUtils.refreshWithCurrentUrl();
    }
    public void payment_method_checkbox2_2() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("By default , It should be uncheck.");
        WebUtils.SwitchTowindopopup();

        WebElement checkbox = driver.findElement(By.xpath("//input[contains(@name,'items_json')]"));
        checkbox.click();

        WebElement next_step = driver.findElement(By.xpath("//button[contains(@id,'step4')]"));
        next_step.click();
        WebUtils.refreshWithCurrentUrl();
    }

    public void Add_to_wishlist_button() throws InterruptedException {
        logger.info("It should display a success message 'product_name has been added to your Wish List. Click here to continue shopping.' and added to wishlist ");
        Thread.sleep(10000);
        WebElement slide = driver.findElement(By.xpath("(//span[contains(.,'Add to Wish List')])[1]"));
        slide.click();


    }
    public void Wishlist() throws InterruptedException {
        Thread.sleep(9000);
        logger.info("\"It should display wishlist product with 3 buttons\n" +
                "1.Share Wishlist\n" +
                "2.Remove Selected Items\n" +
                "3.Order Selected Items\"");
        Thread.sleep(9000);
        WebUtils.navigateToURL(APPLICATION_URL+"/guestwishlist");

        WebElement slide = driver.findElement(By.xpath("//input[contains(@type,'checkbox')]"));
       slide.click();
WebUtils.sleep(9);

        WebElement order = driver.findElement(By.xpath("//span[contains(.,'Order Selected Items')]"));
       order.click();

    }
}