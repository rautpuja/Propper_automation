package com.U_line.page.actions.web.Servicer;

import com.U_line.utils.common.Config;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class Submit_Labor_Claim_Page {
    private static final Logger logger = LoggerFactory.getLogger(Submit_Labor_Claim_Page.class);
    private static final String APPLICATION_URL = Config.getProperty("appURL");
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

    @FindBy(how = How.XPATH, using="//a[contains(text(),'Submit Labor Claim')]")
    @CacheLookup
    WebElement SubmitLaborClaim;


    @FindBy(how = How.XPATH, using="//button[@id='step1']")
    @CacheLookup
    WebElement Next_Button;

    @FindBy(how = How.XPATH, using="//input[@id='serial']")
    @CacheLookup
    WebElement Serial_Number;

    @FindBy(how = How.XPATH, using="//input[@id='model']")
    @CacheLookup
    WebElement Model_Number;

    @FindBy(how = How.XPATH, using="//input[@id='invoice']")
    @CacheLookup
    WebElement Invoice_Number;

    @FindBy(how = How.XPATH, using="//button[@id='step2']")
    @CacheLookup
    WebElement Next_Button2;

    @FindBy(how = How.XPATH, using="//input[@id='customer_first_name']")
    @CacheLookup
    WebElement First_Name;

    @FindBy(how = How.XPATH, using="//input[@id='customer_last_name']")
    @CacheLookup
    WebElement Last_Name;

    @FindBy(how = How.XPATH, using="//input[@id='customer_address']")
    @CacheLookup
    WebElement Street_Address;

    @FindBy(how = How.XPATH, using="//input[@id='customer_city']")
    @CacheLookup
    WebElement City;

    @FindBy(how = How.XPATH, using="//input[@id='customer_state']")
    @CacheLookup
    WebElement State;

    @FindBy(how = How.XPATH, using="//input[@id='customer_postal_code']")
    @CacheLookup
    WebElement Zip;

    @FindBy(how = How.XPATH, using="//input[@id='customer_home_phone']")
    @CacheLookup
    WebElement Phone_Number;

    @FindBy(how = How.XPATH, using="//input[@id='customer_email']")
    @CacheLookup
    WebElement Email;

    @FindBy(how = How.XPATH, using="//input[@id='reason']")
    @CacheLookup
    WebElement Reason_for_service_call;

    @FindBy(how = How.XPATH, using="//textarea[@id='service_peformed']")
    @CacheLookup
    WebElement actual_performed;
    @FindBy(how = How.XPATH, using="//input[@id='date_call_received']")
    @CacheLookup
    WebElement date_customer_request_service;

    @FindBy(how = How.XPATH, using="//input[@id='date_repaired']")
    @CacheLookup
    WebElement date_of_repaire;

    @FindBy(how = How.XPATH, using="//button[@id='step3']")
    @CacheLookup
    WebElement Next_button3;


    @FindBy(how = How.XPATH, using="//input[@id='first_part']")
    @CacheLookup
    WebElement Part_number;

    @FindBy(how = How.XPATH, using="//input[@id='first_invoice']")
    @CacheLookup
    WebElement Order_number;

    @FindBy(how = How.XPATH, using="//body/div[2]/main[1]/div[2]/div[1]/div[2]/form[1]/div[5]/div[1]/div[1]/div[2]/button[1]")
    @CacheLookup
    WebElement Add_another;

    @FindBy(how = How.XPATH, using="//body/div[2]/main[1]/div[2]/div[1]/div[2]/form[1]/div[5]/div[1]/div[2]/div[2]/button[1]")
    @CacheLookup
    WebElement Remove;

    @FindBy(how = How.XPATH, using="//button[@id='step4']")
    @CacheLookup
    WebElement Next_button4;

    @FindBy(how = How.XPATH, using="//input[@id='total_labor']")
    @CacheLookup
    WebElement Total_labor_dollar;

    @FindBy(how = How.XPATH, using="//input[@id='technician_name']")
    @CacheLookup
    WebElement declaration_checkbox;
    @FindBy(how = How.XPATH, using="//button[@id='step5']")
    @CacheLookup
    WebElement Save5;
    public Submit_Labor_Claim_Page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }


    public void providerlogin() {
        logger.info("After login After login By default parts search should open");
        // TODO Auto-generated method stub
        providerlogin.click();
    }

    public void setemail(String email)
    {
        txtemail.sendKeys(email);
    }

    public void setPassword(String pwd)
    {
        txtPassword.sendKeys(pwd);
    }


    public void clickSubmit()
    {
        btnLogin.click();
    }

    public void SubmitLaborClaim() throws InterruptedException {
        logger.info("Page should redirect to submit labor claim");
        Thread.sleep(4000);
        SubmitLaborClaim.click();
    }

    public void Next_Button() throws InterruptedException {
        logger.info("Page should redirect to submit labor claim");
        Thread.sleep(4000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Next_Button.click();
    }

    public void Next_Button_Invalid() throws InterruptedException {
        logger.info("Page should redirect to submit labor claim");
        Thread.sleep(4000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,-1000)");
        Serial_Number.sendKeys("6578986");
        Thread.sleep(6000);
        Invoice_Number.sendKeys("09876");

        JavascriptExecutor js2= (JavascriptExecutor) driver;

        js2.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(6000);

        Next_Button.click();
    }

    public void Next_Button_valid() throws InterruptedException, AWTException {
        logger.info("Page should redirect to submit labor claim");
        Thread.sleep(4000);
        String select = Keys.chord(Keys.CONTROL, "a");

       Serial_Number.sendKeys(select);
        Serial_Number.sendKeys("1900003080205");
        Thread.sleep(4000);
        Model_Number.click();
        Thread.sleep(4000);
        Invoice_Number.sendKeys("789876");

        Thread.sleep(6000);

        Next_Button.click();
    }


    public void Customer_Info_Valid() throws InterruptedException {
        Thread.sleep(4000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,-1000)");
        First_Name.sendKeys("Puja");
        Last_Name.sendKeys("Domke");
        Street_Address.sendKeys("Test i123");
        City.sendKeys("Missauri");
        State.sendKeys("Missauri");
        Zip.sendKeys("63011");
        Phone_Number.sendKeys("9876567876");
        Email.sendKeys("puja@upbott.com");
        Next_Button2.click();

    }
    public void Customer_Info_Blank() throws InterruptedException {
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Next_Button2.click();

    }

    public void Repaire_details_blank() throws InterruptedException {
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Next_button3.click();
    }

    public void Repaire_details_valid() throws InterruptedException {
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,-1000)");
        Reason_for_service_call.sendKeys("For testing purpose");
        actual_performed.sendKeys("For testing purpose");
        date_customer_request_service.click();
      WebElement ele2 = driver.findElement(By.xpath("//a[contains(text(),'2')]"));
      ele2.click();

            date_of_repaire.click();

        WebElement ele3 = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]"));
        ele3.click();


                Next_button3.click();
            }


    public void Parts_used_Blank() throws InterruptedException {
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Next_button4.click();
    }
    public void Parts_used_AddAnother() throws InterruptedException {
        Thread.sleep(4000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,-1000)");
        Add_another.click();}
    public void Parts_used_remove() throws InterruptedException {
        Remove.click();}
    public void Parts_used_valid() throws InterruptedException {
        String select = Keys.chord(Keys.CONTROL, "a");
        Part_number.sendKeys(select);
        Part_number.sendKeys("76788");
        Order_number.sendKeys(select);
        Order_number.sendKeys("98990");
        Thread.sleep(1000);
     WebElement ele=driver.findElement(By.xpath("//button[@id='step4']"));
     ele.click();
    }
    public void Step5_Blank() throws InterruptedException {
        Thread.sleep(6000);
        Save5.click();

    }
    public void Step5_Without_checkbox() throws InterruptedException {
        Thread.sleep(6000);
        Total_labor_dollar.sendKeys("47");
        Save5.click();

    }
    public void Step5_Valid() throws InterruptedException {
        Thread.sleep(6000);
        String select = Keys.chord(Keys.CONTROL, "a");

        Total_labor_dollar.sendKeys(select);
        Total_labor_dollar.sendKeys("78");
        declaration_checkbox.click();
        Save5.click();

    }


}
